package com.mnazareno.retrofit.springboot.demo.github;

import retrofit2.Call;
import retrofit2.CallAdapter;

import java.io.IOException;
import java.lang.reflect.Type;

public class CustomRetrofitAdapter implements CallAdapter {

	private final Type responseType;

	public CustomRetrofitAdapter(Type responseType) {
		this.responseType = responseType;
	}

	@Override
	public Type responseType() {
		return this.responseType;
	}

	@Override
	public Object adapt(Call call) {
		try {
			return call.execute();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
