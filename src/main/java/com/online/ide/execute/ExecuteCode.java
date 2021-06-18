package com.online.ide.execute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.online.ide.code.CodeRequest;
import com.online.ide.code.Input;

public class ExecuteCode {

	public String execute(CodeRequest codeReq) {
		
		String finalResponse = null ;
		try {
			final String clientId = "40c9622fc3b9d33ce6aaa26f3c23e0a7" ;
			final String clientSecret = "8e7a7fd4dbbbdc7ecf0528dbada9a03bb1ace5c230e781f8402e42488e28902a" ;
            URL url = new URL("https://api.jdoodle.com/v1/execute");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");  

    		Gson gson = new Gson();
    		
    		Input input = new Input();
    		input.setClientId(clientId);
    		input.setClientSecret(clientSecret);
    		input.setLanguage(codeReq.getLanguage());
    		input.setVersionIndex(codeReq.getVersionIndex());
    		input.setScript(codeReq.getScript());
    		input.setStdin(codeReq.getStdin());
    		
    		String str = gson.toJson(input);
    		
//    		String input = "{\"clientId\": \"" + clientId + "\",\"clientSecret\":\"" + clientSecret + "\",\"script\":\"" + codeReq.getScript() +
//    	            "\",\"language\":\"" + codeReq.getLanguage() + "\",\"versionIndex\":\"" + codeReq.getVersionIndex() + "\"} ";

    		
    		System.out.println(str);
    	
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.flush();

            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException(
                        "Please check your inputs : HTTP error code : " + connection.getResponseCode());
            }

            BufferedReader bufferedReader;
            bufferedReader = new BufferedReader(new InputStreamReader((connection.getInputStream())));

            finalResponse = bufferedReader.readLine();
            connection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return finalResponse ;	
	}	
}