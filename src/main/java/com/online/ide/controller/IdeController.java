package com.online.ide.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.online.ide.code.CodeRequest;
import com.online.ide.code.Output;
import com.online.ide.execute.ExecuteCode;


@RestController
@CrossOrigin
class IdeController {
	
	@PostMapping(value = "/submit" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public Output getCodeFromBrowser(@RequestBody CodeRequest codeReq) throws Exception {
		
		ExecuteCode exe = new ExecuteCode();
		String finalResponse = exe.execute(codeReq);
		Gson gson = new Gson();
		Output output = gson.fromJson(finalResponse, Output.class);
//		Output out = new Output();
//		out.setOutput(codeReq.getScript());
//		out.setCpuTime("1300");
//		out.setStatusCode("200");
//		out.setMemory("59522");
		return output ;	
	
	}
}