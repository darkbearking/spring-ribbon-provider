package com.troila.lw;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApp {

	public static void main(String[] args) {
		//下面的寫法是傳統寫法，再下面一行是通過控制台讀入數據，比如端口什麼的
//		new SpringApplicationBuilder(PoliceServer.class).web(true).run(args);
		
		Scanner scan = new Scanner(System.in);
		String port = scan.nextLine();
		//下面這裡可以通過自己指定properties，作用相當於在yml配置文件中添加相同的內容
		new SpringApplicationBuilder(ProviderApp.class).properties("server.port=" + port).run(args);
	}

}
