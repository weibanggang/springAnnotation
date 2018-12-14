package com.wbg.springxmlbean.spring;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
@Configuration
public class ConfigDataSource {
    @Bean(name = "dataSource")
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("org.mariadb.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mariadb://localhost:3306/wbg_logistics");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setMaxPoolSize(30);
        return dataSource;
    }
}
