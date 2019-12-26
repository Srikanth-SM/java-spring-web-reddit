package com.siro.redditclone.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Link extends Audit {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String url;
	private int vote;
	@OneToMany(mappedBy = "link", fetch = FetchType.LAZY)
	private List<Comment> comments;
//	@OneToMany(mappedBy="link")
//	private List<Vote> votes;

	public Link() {
		super();
	}

	public Link(String name, String url) {
		this.name = name;
		this.url = url;
	}

//
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVote() {
		return vote;
	}

	public void setVotes(int votes) {
		this.vote = votes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, id, name, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Link)) {
			return false;
		}
		Link other = (Link) obj;
		return Objects.equals(comments, other.comments) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(url, other.url);
	}

//
	@Override
	public String toString() {
		return "Link [id=" + id + ", name=" + name + ", url=" + url + ", comments=" + comments + "]";
	}

}