package com.gslab.scopedemo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gslab.scopedemo.model.Message;

public class MessageClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationFileContext = new FileSystemXmlApplicationContext("resources//xml//message.xml");
		Message message = (Message) applicationFileContext.getBean("message");
		message.setId(2001);
		message.setMessage("This is something new!");
		System.out.println("first : "+message);
		System.out.println("second : "+applicationFileContext.getBean("message"));
		((FileSystemXmlApplicationContext)applicationFileContext).close();
	}

}
