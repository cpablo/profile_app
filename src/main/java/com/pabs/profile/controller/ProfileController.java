package com.pabs.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pabs.profile.model.Profile;
import com.pabs.profile.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/user-profiles")
	public List<Profile> retrieveListProfile() {
		return profileService.getProfileList();
	}
	
	@GetMapping("/user-profiles/{id}")
	public Profile retrieveProfile(@PathVariable(value="id") String id) {
		System.out.println(profileService.getProfile(id).getName().getFirst());
		return profileService.getProfile(id);
	}
}
