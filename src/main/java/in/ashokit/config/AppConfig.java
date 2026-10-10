package in.ashokit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public SimpleJdbcCall  simple() {
        return new SimpleJdbcCall(dataSource);
    }
}
