package com.pabs.profile.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.pabs.profile.model.Profile;

public class ProfileUtilities {
	
	public String readURLContent(URL url){
		BufferedReader bufferedReader = null;
		StringBuffer stringBuffer = new StringBuffer();
		char[] jsonChars = new char[1024];
		int readByte = 0;
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
			while((readByte = bufferedReader.read(jsonChars)) != -1) {
				stringBuffer.append(jsonChars, 0 , readByte);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stringBuffer.toString();
	}
	
	public List<Profile> convertJsontoProfile(String profileJson){
		List<Profile> listProfiles = new ArrayList<Profile>();
		Gson gson = new Gson();
		Type collectionType = new TypeToken<Collection<Profile>>() {}.getType();
		
		listProfiles = (List<Profile>) gson.fromJson(profileJson, collectionType);
		
		return listProfiles;
	}
}
