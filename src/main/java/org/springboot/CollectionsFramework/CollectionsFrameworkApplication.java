package org.springboot.CollectionsFramework;

import org.springboot.CollectionsFramework.list.ArrayLists;
import org.springboot.CollectionsFramework.list.LinkedLists;
import org.springboot.CollectionsFramework.list.StrachImplementationLinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionsFrameworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(CollectionsFrameworkApplication.class, args);
		//ArrayLists.arrayListExample();
		//LinkedLists.linkedListExample();
		StrachImplementationLinkedList.strachImplementationOfLinkedList();
	}

}
