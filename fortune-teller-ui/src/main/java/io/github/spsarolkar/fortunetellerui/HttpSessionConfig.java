package io.github.spsarolkar.fortunetellerui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    @Autowired
    private AppConfig appConfig;

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        LettuceConnectionFactory connection = new LettuceConnectionFactory(new RedisStandaloneConfiguration(appConfig.getRedisServername(),appConfig.getRedisServerPort()));
        return connection;
    }
}
