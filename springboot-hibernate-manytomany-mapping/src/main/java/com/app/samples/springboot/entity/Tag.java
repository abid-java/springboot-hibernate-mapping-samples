package com.app.samples.springboot.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Tag.
 */
@Entity
@Table(name = "tags")
public class Tag {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The name. */
	@Column(name = "tag_name")
	private String name;
	
	/** The counter of persons tagged. */
	@Column(name = "total_persons")
	private long counterOfPersonsTagged;
	
	/** The posts. */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tags")
	private Set<Post> posts = new HashSet<>();

	/**
	 * Instantiates a new tag.
	 */
	public Tag() {
		super();
	}

	/**
	 * Instantiates a new tag.
	 *
	 * @param id the id
	 * @param name the name
	 * @param counterOfPersonsTagged the counter of persons tagged
	 * @param posts the posts
	 */
	public Tag(long id, String name, long counterOfPersonsTagged, Set<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.counterOfPersonsTagged = counterOfPersonsTagged;
		this.posts = posts;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the counter of persons tagged.
	 *
	 * @return the counter of persons tagged
	 */
	public long getCounterOfPersonsTagged() {
		return counterOfPersonsTagged;
	}

	/**
	 * Sets the counter of persons tagged.
	 *
	 * @param counterOfPersonsTagged the new counter of persons tagged
	 */
	public void setCounterOfPersonsTagged(long counterOfPersonsTagged) {
		this.counterOfPersonsTagged = counterOfPersonsTagged;
	}

	/**
	 * Gets the posts.
	 *
	 * @return the posts
	 */
	public Set<Post> getPosts() {
		return posts;
	}

	/**
	 * Sets the posts.
	 *
	 * @param posts the new posts
	 */
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	
}
