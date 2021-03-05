package com.project.retro.Service.Consume;

import com.project.retro.DTO.ResponseRetroUserDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface UserConsumeService {
	
	@GET("api/")
    public Call<ResponseRetroUserDTO> getUser(@Header("Content-Type") String contentType);

}
