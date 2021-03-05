package com.project.retro.Connection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserConsumeConnection {
	
	private static final String BASE_URL = "https://randomuser.me/";
	
	private static Gson gson = new GsonBuilder()
			.setLenient()
			.create();
	
	private static Retrofit.Builder builder = new Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create(gson));
	
	private static Retrofit retrofit = builder.build();
	
	private static HttpLoggingInterceptor loggingInterceptor =
            new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BASIC);
	
	private static OkHttpClient.Builder httpclient = new OkHttpClient.Builder();
	
	public static <S> S createService(Class<S> serviceClass) {
		if (!httpclient.interceptors().contains(loggingInterceptor)) {
			httpclient.addInterceptor(loggingInterceptor);
			builder.client(httpclient.build());
		}
		
		return retrofit.create(serviceClass);
	}

}
