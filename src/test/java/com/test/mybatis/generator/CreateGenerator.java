package com.test.mybatis.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

import org.junit.Test;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;

import com.yudong.test.CreateCore;

public class CreateGenerator {

	@Test
	public void test() {
	CreateCore createCore=new CreateCore();
		try {
			File file =new File(CreateGenerator.class.getResource("/generatorConfigPreacher.xml").toURI());
			createCore.create(file);
		} catch (IOException | XMLParserException | InvalidConfigurationException | SQLException | InterruptedException | URISyntaxException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void urlTest(){
		try {
			System.out.println(CreateGenerator.class.getResource("/generatorConfig.xml").toURI());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
