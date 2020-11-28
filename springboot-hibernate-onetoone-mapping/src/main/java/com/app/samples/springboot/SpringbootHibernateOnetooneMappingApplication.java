package com.app.samples.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.samples.springboot.entity.Gender;
import com.app.samples.springboot.entity.User;
import com.app.samples.springboot.entity.UserProfile;
import com.app.samples.springboot.repository.UserProfileRepository;
import com.app.samples.springboot.repository.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringbootHibernateOnetooneMappingApplication.
 */
@SpringBootApplication
public class SpringbootHibernateOnetooneMappingApplication implements CommandLineRunner{
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOnetooneMappingApplication.class, args);
	}

	/**
	 * Run.
	 *
	 * @param args the args
	 * @throws Exception the exception
	 */
	@Override
	public void run(String... args) throws Exception {
		//create User object
		User user = new User();
		user.setUserName("abid");
		user.setEmailId("abid3022@gmail.com");
		
		//create UserProfile object
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("17-125, 3rd lane new sanath nagar");
		userProfile.setDateOfBirth(LocalDate.of(1992, 05, 27));
		userProfile.setGender(Gender.MALE);
		userProfile.setContactNumber("0987654321");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		//save User 
		userRepository.save(user);
		
	}

}
