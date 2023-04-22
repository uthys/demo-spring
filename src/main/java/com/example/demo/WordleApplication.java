package com.example.demo;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

import static org.springframework.web.bind.annotation.ResponseBody.*;


@SpringBootApplication  //(exclude = {DataSourceAutoConfiguration.class })
public class WordleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordleApplication.class, args);
	}

//	@GetMapping("/")
//	public ResponseEntity<String> asdf(Model model){
//		StringBuilder html = new StringBuilder();
//		for(int i =0; i<8; i++){
//			for(int j =0; j<5; j++) {
//				html.append("<div class=Row	row th:text=''").append(j).append("</div>");
//			}
//			html.append("<br>");
//		}
//		return ResponseEntity.ok().body(html.toString());
//	}
//
//	public void update(Model model){
//		int correct = 0;
//		for(int i =0; i< 5; i++){
//			String temp = ""+String.valueOf(row)+"-"+String.valueOf(i);
//			//No idea why is that, intellij wouldn't shut up
//			String currTile = (String) model.getAttribute(temp);
//			//String letter = currTile.
//		}
//	}

}
