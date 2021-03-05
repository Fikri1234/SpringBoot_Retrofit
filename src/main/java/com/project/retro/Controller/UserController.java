package com.project.retro.Controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.retro.DTO.ResponseRetroUserDTO;
import com.project.retro.DTO.UserDTO;
import com.project.retro.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
    private UserService userService;

    @GetMapping("/person")
    public UserDTO getUser() {
    	Map<String, Object> map = new HashMap<>();
    	map = userService.getUser();
    	
    	UserDTO dto = new UserDTO();
    	if (((String) map.get("status")).equalsIgnoreCase("Success")) {
	    	ResponseRetroUserDTO obj = (ResponseRetroUserDTO) map.get("response");
	    	// mapping to userDTO
	    	dto.setGender(obj.getResults().get(0).getGender());
	    	dto.setFullname(obj.getResults().get(0).getName().getTitle()
	    			+" "+obj.getResults().get(0).getName().getFirst()
	    			+" "+obj.getResults().get(0).getName().getLast());
	    	dto.setAddress(obj.getResults().get(0).getLocation().getStreet().getName()
	    			+" "+obj.getResults().get(0).getLocation().getStreet().getNumber()
	    			+" "+obj.getResults().get(0).getLocation().getCity());
	    	dto.setPicture(obj.getResults().get(0).getPicture().getLarge());
    	}
        return dto;
    }
    
    @GetMapping("/async/person")
    public ResponseEntity<String> getUserCallBack() {
    	userService.getUserCallBack();
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}
