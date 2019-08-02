package cn.xhlcode.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean("stud01")
	public Student init(){
		System.out.println("开始执行初始化赋值操作");
		Student student = new Student();
		student.setName("张三");
		student.setAge(18);
		return student;
	}


}
