package com.etiosoftware.cucumber;

import com.etiosoftware.TriadJApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TriadJApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
