package com.san.spring_basics_annotations_rest_api.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//defines class is used by IOC container as a source bean
@Configuration
public class BeanConfig {
    /* Similar to below, in spring
    <beans>
        <bean id="objBone" class="package.Bone"/>
    </beans>
     */

    //@Bean defined methods, will return an object that registered as a bean in IOC using
    //@Configuration in class level
    @Bean
    public Bone objBone(){
        return new Bone();
    }
}
