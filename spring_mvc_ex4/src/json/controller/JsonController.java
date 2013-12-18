package json.controller;

import java.util.ArrayList;
import java.util.List;

import json.model.Json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 返回JSON数据
 * 
 * @author ANSHEN
 *
 */
@Controller
@RequestMapping("/")
public class JsonController {
	
	@RequestMapping(value = "/json/{name}", method = RequestMethod.GET)
	public @ResponseBody List<Json> getJson(@PathVariable String name) {
		List<Json> jsonList = new ArrayList<Json>();
		for (int i = 0; i < 10; i++) {
			Json json = new Json();
			json.setName(name);
			json.setStaffNames(new String[]{ "va1", "v2" });
			jsonList.add(json);
		}
		System.out.println("json out..");
		return jsonList;
	}
	
	public String html() {
		System.out.println(" json start ");
		return "WEB-INF/jsp/json.html";
	}
	
/*	@RequestMapping(value = "/")
	public String json() {
		System.out.println("json...");
		return "WEB-INF/jsp/json.jsp";
	}*/
	
}
