package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	@Autowired
	private UserRepository repo;
	
	@GetMapping("")
	public String viewHomePage() {
		return "login";
		
	}
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user",new User());
		return "signup_form";
		
	}
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		try {
			
	
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String encodedPassword=encoder.encode(user.getPassword());
			user.setPassword(encodedPassword);
			repo.save(user);
			return "register_success";
		}
		catch (Exception e) {
			return "user_exists";
		}
		
	}

	@GetMapping("/list_users")
	public String viewUsersList() {
		return "college_library";
	}
	@GetMapping("/login")
	public String login() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication ==null ||  authentication instanceof AnonymousAuthenticationToken) {
			return "login";
		}
		
		return "redirect:/";
	}

}
