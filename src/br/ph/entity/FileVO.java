package br.ph.entity;

import br.ph.annotations.Position;

public class FileVO {
	
	@Position(begin = 0, end = 10)
	private String name;
	
	@Position(begin = 10, end = 13, type = Integer.class)
	private Integer age;
	
	@Position(begin = 13, end = 23)
	private String document;
	
	public FileVO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "FileVO [name=" + name + ", age=" + age + ", document=" + document + "]";
	}
	
}
