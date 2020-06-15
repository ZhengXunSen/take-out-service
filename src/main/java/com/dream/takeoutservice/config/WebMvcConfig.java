package com.dream.takeoutservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.IOException;
import java.util.List;

/**
 * Created by ping.chen on 2018/1/3.
 */
@Configuration
@EnableAsync
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(new MappingJackson2HttpMessageConverter());
        converters.add(new ResultJsonConverter());
    }


    class ResultJsonConverter implements HttpMessageConverter<Object> {

        HttpMessageConverter httpMessageConverterHandle = new MappingJackson2HttpMessageConverter();

        @Override
        public boolean canRead(Class<?> clazz, MediaType mediaType) {
            return false;
        }

        @Override
        public boolean canWrite(Class<?> clazz, MediaType mediaType) {
            return true;
        }

        @Override
        public List<MediaType> getSupportedMediaTypes() {
            return httpMessageConverterHandle.getSupportedMediaTypes();
        }

        @Override
        public Object read(Class<?> clazz, HttpInputMessage inputMessage) throws IOException {
            throw new UnsupportedOperationException("不实现读取");
        }

        @Override
        public void write(Object o, MediaType contentType, HttpOutputMessage outputMessage) throws IOException {
            httpMessageConverterHandle.write(o, contentType, outputMessage);
        }
    }
}
