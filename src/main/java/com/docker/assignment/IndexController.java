package com.docker.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    
    @Autowired
    PostRepository postRepository;

    @SuppressWarnings("unchecked")
	@GetMapping("/")
    public String index(Model model) {
    	if(postRepository.save( new Post(1, "This is first POST!!!!",  new Date())) != null
                 && (postRepository.save( new Post(2, "This is first POST!!!!",  new Date())) != null)) {
    		model.addAttribute("status", "Value inserted in MySQL Database");
            model.addAttribute("newfeature", "I am running from Docker");
            logger.log(Level.INFO, "Data successfully saved in DB");
    	}
    	 	
        return "index";
    }
}
