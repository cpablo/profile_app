package com.pabs.profile.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pabs.profile.model.Profile;
import com.pabs.profile.utilities.ProfileUtilities;

@Service
public class ProfileService {
	
	public List<Profile> getProfileList(){
		ProfileUtilities profileUtil = new ProfileUtilities();
		List<Profile> listProfiles = new ArrayList<Profile>();
		URL url;
		String jsonContents = "";
		
		try {
			url = new URL("http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json");
			jsonContents = profileUtil.readURLContent(url);
			listProfiles = profileUtil.convertJsontoProfile(jsonContents);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listProfiles;
	}
	
	public Profile getProfile(String id){
		ProfileUtilities profileUtil = new ProfileUtilities();
		List<Profile> listProfiles = new ArrayList<Profile>();
		Profile foundProfile = null;
		URL url;
		String jsonContents = "";
		
		try {
			url = new URL("http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json");
			jsonContents = profileUtil.readURLContent(url);
			listProfiles = profileUtil.convertJsontoProfile(jsonContents);
			
			for (Profile profile:listProfiles) {
				if (profile.getId().equals(id)) {
					foundProfile = profile;
					break;
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return foundProfile;
	}
}
