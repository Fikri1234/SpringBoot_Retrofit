package com.project.retro.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.project.retro.Connection.UserConsumeConnection;
import com.project.retro.DTO.ResponseRetroUserDTO;
import com.project.retro.Service.UserService;
import com.project.retro.Service.Consume.UserConsumeService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class UserServiceImpl implements UserService {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	private UserConsumeService userService;
	
	public UserServiceImpl() {
		
//		Gson gson = new GsonBuilder()
//				.setLenient()
//				.create();
//		
//		Retrofit retrofit = new Retrofit.Builder()
//				.baseUrl("https://randomuser.me/")
//				.addConverterFactory(GsonConverterFactory.create(gson))
//				.build();
//		
//		userService = retrofit.create(UserConsumeService.class);
		
		userService = UserConsumeConnection.createService(UserConsumeService.class);
	}

	@Override
	public Map<String, Object> getUser() {
		Map<String, Object> map = new HashMap<>();
		Call<ResponseRetroUserDTO> retro = userService.getUser("application/json");
		
		try {
			Response<ResponseRetroUserDTO> resp = retro.execute();
			map.put("status", "Success");
			map.put("message", "Success");
			map.put("response", resp.body());
        } catch (Exception e) {
        	map.put("status", "Success");
        	map.put("message", e.getMessage());
			map.put("response", null);
        }
		log.info("err: {} resp: {}", map.get("status"), map.get("response"));
		return map;
	}

	// for async
	@Override
	public Map<String, Object> getUserCallBack() {
		Map<String, Object> map = new HashMap<>();
		Call<ResponseRetroUserDTO> retro = userService.getUser("application/json");
		retro.enqueue(new Callback<ResponseRetroUserDTO>() {
		    @Override
		    public void onResponse(Call<ResponseRetroUserDTO> call, Response<ResponseRetroUserDTO> resp) {
		    	
		    	if (resp.isSuccessful()) {
			    	map.put("status", "Success");
			    	map.put("message", "Success");
					map.put("response", resp.body());
					
					okhttp3.Response raw = resp.raw();
					
					log.info("Success!!! \n ===head: {} body: {} \n ===rawHead: {} rawBody: {}",resp.headers(), resp.body(), raw.headers(), raw.body());
		    	} else {
		    		map.put("status", "Error");
		    		map.put("message", "Error");
					map.put("response", resp.errorBody());
					log.info("Error: {}",resp.errorBody());
		    	}
		    }

		    @Override
		    public void onFailure(Call<ResponseRetroUserDTO> call, Throwable e) {
		    	map.put("status", "Error");
		    	map.put("message", e.getMessage());
				map.put("response", null);
				log.info("Error: {}", e.getMessage());
		    }
		});
		return map;
	}

}
