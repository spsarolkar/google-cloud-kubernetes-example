package io.github.spsarolkar.fortunetellerui;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${COWSAY_SERVER_NAME:localhost}")
    private String cowsayServer;

    @Value("${COWSAY_SERVER_PORT:8000}")
    private String cowsayServerPort;

    @Value("${REDIS_SERVER_NAME:localhost}")
    private String redisServername;

    @Value("${REDIS_SERVER_PORT:6379}")
    private int redisServerPort;

    public String getCowsayServer() {
        return cowsayServer;
    }

    public void setCowsayServer(String cowsayServer) {
        this.cowsayServer = cowsayServer;
    }

    public String getCowsayServerPort() {
        return cowsayServerPort;
    }

    public void setCowsayServerPort(String cowsayServerPort) {
        this.cowsayServerPort = cowsayServerPort;
    }

    public String getRedisServername() {
        return redisServername;
    }

    public void setRedisServername(String redisServername) {
        this.redisServername = redisServername;
    }

    public int getRedisServerPort() {
        return redisServerPort;
    }

    public void setRedisServerPort(int redisServerPort) {
        this.redisServerPort = redisServerPort;
    }
}
