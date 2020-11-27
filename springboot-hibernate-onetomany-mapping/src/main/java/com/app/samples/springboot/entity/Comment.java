package com.app.samples.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Comment.
 */
@Entity
@Table(name = "comments")
public class Comment {
	
	/** The comment id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The text. */
	@Column(name = "comment_text")
	private String text;
	
	/** The commenter name. */
	@Column(name = "commentor_name")
	private String commenterName;
	
	/** The count of likes. */
	@Column(name = "number_of_likes")
	private long countOfLikes;
	
	/**
	 * Instantiates a new comment.
	 */
	public Comment() {
		super();
	}

	/**
	 * Instantiates a new comment.
	 *
	 * @param commentId the comment id
	 * @param text the text
	 * @param commenterName the commenter name
	 * @param countOfLikes the count of likes
	 */
	public Comment(long commentId, String text, String commenterName, long countOfLikes) {
		super();
		this.id = commentId;
		this.text = text;
		this.commenterName = commenterName;
		this.countOfLikes = countOfLikes;
	}

	/**
	 * Gets the comment id.
	 *
	 * @return the comment id
	 */
	public long getCommentId() {
		return id;
	}

	/**
	 * Sets the comment id.
	 *
	 * @param commentId the new comment id
	 */
	public void setCommentId(long commentId) {
		this.id = commentId;
	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the commenter name.
	 *
	 * @return the commenter name
	 */
	public String getCommenterName() {
		return commenterName;
	}

	/**
	 * Sets the commenter name.
	 *
	 * @param commenterName the new commenter name
	 */
	public void setCommenterName(String commenterName) {
		this.commenterName = commenterName;
	}

	/**
	 * Gets the count of likes.
	 *
	 * @return the count of likes
	 */
	public long getCountOfLikes() {
		return countOfLikes;
	}

	/**
	 * Sets the count of likes.
	 *
	 * @param countOfLikes the new count of likes
	 */
	public void setCountOfLikes(long countOfLikes) {
		this.countOfLikes = countOfLikes;
	}
	
}
