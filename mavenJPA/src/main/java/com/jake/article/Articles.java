package com.jake.article;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@EntityListeners(ArticleListener.class)
public class Articles {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="article_id")
	private int articleId;
	
	@Column(name="article_name")
	private String articleName;
	
	private Date date;
	
	public Articles() {
		
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Articles(String articleName) {
		this.articleName = articleName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
