package com.jake.article;

import java.util.Date;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class ArticleListener {


	@PrePersist
	public void beforePersist(Articles article){
		article.setDate(new Date());
	}
	
	@PostPersist
	public void  postPersist(Articles articles){
		System.out.println("This is after persist.........");
	}
}
