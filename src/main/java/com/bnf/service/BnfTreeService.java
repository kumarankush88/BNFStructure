/**
 * 
 */
package com.bnf.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author ankush.h.kumar
 *
 */
@Service

public class BnfTreeService {

	public String getBnfTreeJson(){
		String jsonData = "[{\"id\": \"ajson1\",\"parent\": \"#\",\"text\": \"Simple root node\"},{\"id\": \"ajson2\",\"parent\": \"#\",\"text\": \"Root node 2\"},{\"id\": \"ajson3\",\"parent\": \"ajson1\",\"text\": \"Child 1\"},{\"id\": \"ajson3\",\"parent\": \"ajson2\",\"text\": \"Child 1\"},{  \"id\": \"ajson4\",\"parent\": \"ajson2\",\"text\": \"Child 2\"}]";
		//JSONObject bnf = new JSONObject(jsonData);
		return jsonData;
	}
}
