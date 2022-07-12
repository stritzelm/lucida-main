package com.lucida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class LucidaMainApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(LucidaMainApplication.class, args);
	}
}
