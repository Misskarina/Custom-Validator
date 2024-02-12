package com.briz.CustomValidator;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository srepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"program tested";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		Student s=new Student();
		s.setFirstname("Nita");
		s.setLastname("Ambani");
		s.setRollno(1234);
		s.setAddress("Mumbai");
		
		srepo.save(s);
		return"data saved";
	}
	
	@RequestMapping("/saveall")
	public String saveall()
	{
		Student s1=new Student();
		s1.setFirstname("Rohit");
		s1.setLastname("Malhan");
		s1.setRollno(3452);
		s1.setAddress("Delhi");
		
		Student s2=new Student();
		s2.setFirstname("Abhishek");
		s2.setLastname("Rawat");
		s2.setRollno(7865);
		s2.setAddress("Faridabad");
		
		Student s3=new Student();
		s3.setFirstname("Suryansh");
		s3.setLastname("Barnwal");
		s3.setRollno(3674);
		s3.setAddress("Gurgaon");
		
		Student s4=new Student();
		s4.setFirstname("Rohan");
		s4.setLastname("Malhotra");
		s4.setRollno(3456);
		s4.setAddress("Rajasthan");
		
		List<Student>list=Arrays.asList(s1,s2,s3,s4);
		
		srepo.saveAll(list);
		return"multiple data saved";
		
	}	
	
	@RequestMapping("/update")
	public String saveal()
	{
		Student s5=new Student();
		s5.setFirstname("Rohit");
		s5.setLastname("Ma");
		s5.setRollno(3782);
		s5.setAddress("Noida");
		
		srepo.save(s5);
		return"data update";
	}
		

}
