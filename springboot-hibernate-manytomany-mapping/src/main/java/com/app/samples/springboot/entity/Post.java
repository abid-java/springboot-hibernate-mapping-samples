package com.app.samples.springboot.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Post.
 */
@Entity
@Table(name = "postss")
public class Post {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The title. */
	@Column(name = "post_title")
	private String title;
	
	/** The content. */
	@Column(name = "post_content")
	private String content;
	
	/** The created at. */
	@Column(name = "posted_at")
	private Date createdAt = new Date();
	
	/** The updated at. */
	@Column(name = "updated_at")
	private Date updatedAt = new Date();

	/** The tags. */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "posts_tags",
				joinColumns = {@JoinColumn(name = "post_id")},
				inverseJoinColumns = {@JoinColumn(name = "tag_id")})
	private Set<Tag> tags = new HashSet<>();
	
	/**
	 * Instantiates a new post.
	 */
	public Post() {
		super();
	}

	/**
	 * Instantiates a new post.
	 *
	 * @param id the id
	 * @param title the title
	 * @param content the content
	 * @param createdAt the created at
	 * @param updatedAt the updated at
	 * @param tags the tags
	 */
	public Post(long id, String title, String content, Date createdAt, Date updatedAt, Set<Tag> tags) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.tags = tags;
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
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Gets the created at.
	 *
	 * @return the created at
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the created at.
	 *
	 * @param createdAt the new created at
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Gets the updated at.
	 *
	 * @return the updated at
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the updated at.
	 *
	 * @param updatedAt the new updated at
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * Gets the tags.
	 *
	 * @return the tags
	 */
	public Set<Tag> getTags() {
		return tags;
	}

	/**
	 * Sets the tags.
	 *
	 * @param tags the new tags
	 */
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
}
