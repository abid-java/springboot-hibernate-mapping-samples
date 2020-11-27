package com.app.samples.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.samples.springboot.entity.Post;
import com.app.samples.springboot.entity.Tag;
import com.app.samples.springboot.repository.PostRepository;
import com.app.samples.springboot.repository.TagRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringbootHibernateManytomanyMappingApplication.
 */
@SpringBootApplication
public class SpringbootHibernateManytomanyMappingApplication  implements CommandLineRunner{

	/** The post repository. */
	@Autowired
	private PostRepository postRepository;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateManytomanyMappingApplication.class, args);
	}

	/**
	 * Run.
	 *
	 * @param args the args
	 * @throws Exception the exception
	 */
	@Override
	public void run(String... args) throws Exception {
		//create posts
		Post post1 = new Post();
		post1.setTitle("civil lawyer");
		post1.setContent("land disputes");
		
		Post post2 = new Post();
		post2.setTitle("police");
		post2.setContent("safety of people");
				
		Tag tag1 = new Tag();
		tag1.setName("McMillan");
		tag1.setCounterOfPersonsTagged(10);
		
		Tag tag2 = new Tag();
		tag2.setName("Taylor");
		tag2.setCounterOfPersonsTagged(20);
		
		Tag tag3 = new Tag();
		tag3.setName("Binny");
		tag3.setCounterOfPersonsTagged(25);

		//add all tags to all posts and set it to posts 
		post1.getTags().add(tag1);
		post1.getTags().add(tag2);
		post1.getTags().add(tag3);
		
		post2.getTags().add(tag1);
		post2.getTags().add(tag2);
		post2.getTags().add(tag3);
		
		//add all posts to all tags and set it to tags
		tag1.getPosts().add(post1);
		tag2.getPosts().add(post1);
		tag3.getPosts().add(post1);
		
		tag1.getPosts().add(post2);
		tag2.getPosts().add(post2);
		tag3.getPosts().add(post2);
		
		//save entities to database
		postRepository.save(post1);
		postRepository.save(post2);
	}

}
