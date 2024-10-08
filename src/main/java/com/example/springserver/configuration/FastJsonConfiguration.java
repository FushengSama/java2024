package com.example.springserver.configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;




public class FastJsonConfiguration extends WebMvcConfigurationSupport{
    @Override
public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
FastJsonConfig fastJsonConfig = new FastJsonConfig();
fastJsonConfig.setSerializerFeatures(
  SerializerFeature.WriteNullStringAsEmpty,
        SerializerFeature.WriteNullListAsEmpty
);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastConverter);


    }
}
