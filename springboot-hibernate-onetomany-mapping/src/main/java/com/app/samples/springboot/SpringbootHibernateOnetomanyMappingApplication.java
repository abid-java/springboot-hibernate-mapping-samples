package com.app.samples.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.samples.springboot.entity.Comment;
import com.app.samples.springboot.entity.Post;
import com.app.samples.springboot.repository.PostRepository;

@SpringBootApplication
public class SpringbootHibernateOnetomanyMappingApplication implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOnetomanyMappingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		///create post
		Post post = new Post();
		post.setAuthor("krum");
		post.setTitle("civil lawyer");
		post.setDescription("land disputes");
		
		//create multiple comments
		//comment-1
		Comment comment1 = new Comment();
		comment1.setCommenterName("McCullum");
		comment1.setText("petitioner");
		comment1.setCountOfLikes(20);
		
		//comment-2
		Comment comment2 = new Comment();
		comment2.setCommenterName("Donald");
		comment2.setText("bowling");
		comment2.setCountOfLikes(10);
		
		Comment comment3 = new Comment();
		comment3.setCommenterName("nambi");
		comment3.setText("engineer");
		comment3.setCountOfLikes(10);
		
		//add all comments to list and set it to 
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepository.save(post);	
		
	}

}
