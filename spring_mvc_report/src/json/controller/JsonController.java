package json.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import json.model.Json;
import json.model.Message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 返回JSON数据
 * 
 * @author ANSHEN
 *
 */
@Controller
@RequestMapping("/json")
public class JsonController {
	
	@RequestMapping("/{name}")
	public @ResponseBody Map<String, String> getJson(@PathVariable String name) {
		List<Json> jsonList = new ArrayList<Json>();
		for (int i = 0; i < 10; i++) {
			Json json = new Json();
			json.setName(name);
			json.setStaffNames(new String[]{ "va1", "v2" });
			jsonList.add(json);
		}
		
		Map<String, String> keyValue = new HashMap<String, String>();
		if (name.equalsIgnoreCase("partment")) {
			keyValue.put("gyqy", "国有企业");
			keyValue.put("gtsh", "个体商户");
			keyValue.put("zfdw", "政府单位");
			keyValue.put("syqy", "私营企业");
		} else if (name.equalsIgnoreCase("level")) {
			keyValue.put("1", "一等级");
			keyValue.put("2", "二等级");
			keyValue.put("3", "三等级");
			keyValue.put("4", "四等级");
			keyValue.put("5", "五等级");
		}
		return keyValue;
	}
	
	@ResponseBody
	@RequestMapping(value = "/message/{action}")
	public Message message(HttpServletRequest request, @PathVariable String action) {
		Message msg = new Message();
		return msg;
	}
	
}
