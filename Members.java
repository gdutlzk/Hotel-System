package com.it;
import java.lang.reflect.Member;

public class Members {
	String name;
	int num;
	String material;
	String taste;
	public Members() {
		// TODO Auto-generated constructor stub	
	}	
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public void getarray(){
		System.out.println("菜名："+name);
		System.out.println("数量："+num);
	}
}
