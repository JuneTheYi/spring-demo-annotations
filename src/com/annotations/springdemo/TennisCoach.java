package com.annotations.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// default constructor
	public TennisCoach() {
		System.out.println("This is inside the default TennisCoach constructor");
	}
	
	// setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("This is inside the TennisCoach setter method called setFortuneService()");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
