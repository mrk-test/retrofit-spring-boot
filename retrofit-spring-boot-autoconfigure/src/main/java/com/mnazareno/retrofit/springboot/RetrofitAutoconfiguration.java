package com.mnazareno.retrofit.springboot;

import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

public class RetrofitAutoconfiguration {

	@Bean
	public RetrofitClientContext retrofitContext(Optional<List<RetrofitClientSpecification>> specs) {
		RetrofitClientContext retrofitClientContext = new RetrofitClientContext();
		specs.ifPresent(retrofitClientContext::setConfigurations);
		return retrofitClientContext;
	}

	@EnableRetrofitClients
	class RetrofitClientConfiguration {
	}
}
