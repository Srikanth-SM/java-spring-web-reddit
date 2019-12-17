package com.siro.redditclone.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class Comment{
	@Id
	@GeneratedValue
	private Long id;
	private String comment;
	private Long link_id;
	
	public Comment() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getLink_id() {
		return link_id;
	}
	
	public void setLink_id(Long link_id) {
		this.link_id = link_id;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(comment, id, link_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Comment)) {
			return false;
		}
		Comment other = (Comment) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(id, other.id)
				&& Objects.equals(link_id, other.link_id);
	}
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", link_id=" + link_id + "]";
	}

}