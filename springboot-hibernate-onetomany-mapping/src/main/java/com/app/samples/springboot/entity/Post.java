package com.app.samples.springboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Post.
 */
@Entity
@Table(name = "posts")
public class Post {
	
	/** The post id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The title. */
	@Column(name = "post_title")
	private String title;
	
	/** The author. */
	@Column(name = "post_author")
	private String author;
	
	/** The description. */
	@Column(name = "post_description")
	private String description;
	
	/** The comments. */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fid", referencedColumnName = "id")
	List<Comment> comments = new ArrayList<>();

	/**
	 * Instantiates a new post.
	 */
	public Post() {
		super();
	}

	/**
	 * Instantiates a new post.
	 *
	 * @param postId the post id
	 * @param title the title
	 * @param author the author
	 * @param description the description
	 * @param comments the comments
	 */
	public Post(long postId, String title, String author, String description, List<Comment> comments) {
		super();
		this.id = postId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.comments = comments;
	}

	/**
	 * Gets the post id.
	 *
	 * @return the post id
	 */
	public long getPostId() {
		return id;
	}

	/**
	 * Sets the post id.
	 *
	 * @param postId the new post id
	 */
	public void setPostId(long postId) {
		this.id = postId;
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
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
