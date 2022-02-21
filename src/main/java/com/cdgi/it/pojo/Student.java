package com.cdgi.it.pojo;

import java.io.Serializable;
import java.util.Arrays;

import javax.validation.constraints.Pattern;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String college;
	private byte[] documnets;
	@Pattern(regexp="(^$|[0-9]{10})")
	private String mobileNumber;
	private String githubLink;
	public Student() {
		super();
	}
	public Student(String name, int age, String college, byte[] documnets,
			@Pattern(regexp = "(^$|[0-9]{10})") String mobileNumber, String githubLink) {
		super();
		this.name = name;
		this.age = age;
		this.college = college;
		this.documnets = documnets;
		this.mobileNumber = mobileNumber;
		this.githubLink = githubLink;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public byte[] getDocumnets() {
		return documnets;
	}
	public void setDocumnets(byte[] documnets) {
		this.documnets = documnets;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGithubLink() {
		return githubLink;
	}
	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", college=" + college + ", documnets="
				+ Arrays.toString(documnets) + ", mobileNumber=" + mobileNumber + ", githubLink=" + githubLink + "]";
	}

}
