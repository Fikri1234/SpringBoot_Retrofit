package com.project.retro;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.retro.DTO.ResponseRetroUserDTO;
import com.project.retro.Service.Consume.UserConsumeService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootTest
class RetrofitRestApplicationTests {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	private UserConsumeService userService;

	@Test
	void contextLoads() throws IOException {
		
		log.info("Before any test execution");
		Gson gson = new GsonBuilder().setLenient().create();

		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://randomuser.me/")
				.addConverterFactory(GsonConverterFactory.create(gson)).build();

		userService = retrofit.create(UserConsumeService.class);
		
		Call<ResponseRetroUserDTO> call = userService.getUser("application/json");
		Response<ResponseRetroUserDTO> response = call.execute();
		ResponseRetroUserDTO label = response.body();
		
		assertTrue(label.getResults().size() > 0, "More than 0 data");
		assertFalse(label.getResults().size() == 0, "Should be more than 0 data");

		assertAll("response", 
				() -> assertEquals(1, label.getResults().size()),
				() -> assertEquals(1, label.getResults().size()));
	}

}
