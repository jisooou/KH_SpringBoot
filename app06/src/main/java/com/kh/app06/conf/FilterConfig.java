package com.kh.app06.conf;

import com.kh.app06.filter.AdminFilter;
import com.kh.app06.filter.KhFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//설정을 위한 파일임.
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean m01(){
        KhFilter khf = new KhFilter();
        FilterRegistrationBean x = new FilterRegistrationBean<>(khf);
        x.addUrlPatterns("/*");
        x.setOrder(2);
        return x;
    }

    @Bean
    public FilterRegistrationBean m02(){
        FilterRegistrationBean x = new FilterRegistrationBean<>(new AdminFilter());
        x.addUrlPatterns("/*");
        x.setOrder(1);
        return x;
    }

}
