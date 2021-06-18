package com.online.ide.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.ide.code.CodeRequest;
import com.online.ide.execute.ExecuteCode;


@RestController
@CrossOrigin
class IdeController {
	
	@RequestMapping(value = "/submit" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public String getCodeFromBrowser(@RequestBody CodeRequest codeReq) throws Exception {
		
		ExecuteCode exe = new ExecuteCode();
		String finalResponse = exe.execute(codeReq);
		return finalResponse ;
		
	}
}