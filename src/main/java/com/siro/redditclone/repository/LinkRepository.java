package com.siro.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siro.redditclone.model.Link;

public interface LinkRepository  extends JpaRepository<Link, Long>{

}
