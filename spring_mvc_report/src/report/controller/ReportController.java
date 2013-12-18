package report.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import json.model.Message;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;


/**
 * 
 * 处理报表
 * 
 * @author ANSHEN
 *
 */
@Controller
@RequestMapping("/report")
public class ReportController {
	
	private List<ReportEntry> reportList;
	
	@RequestMapping("/getReport/{totalCount}")
	public ModelAndView getReport(@PathVariable int totalCount, HttpServletRequest request, HttpServletResponse response,String message) {
		reportList = new ArrayList<ReportEntry>(10);
		for (int i = 0; i < totalCount; i++) {
			ReportEntry re = new ReportEntry();
			re.setCard("N20130307" + i);
			re.setCompany("北京市政府");
			re.setCreateDate(new Date());
			re.setLevel("四等级");
			re.setPartment("政府单位");
			re.setUserId("iso127309" + i);
			re.setUserName("张四");
			reportList.add(re);
		}
		request.setAttribute("reportList", reportList);
		return new ModelAndView("report");
	}
	
	@RequestMapping(value = "/{action}")
	public @ResponseBody Message importReport(@PathVariable String action, HttpServletRequest request, HttpServletResponse response) {
		
		/**MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("file");  
  
        String name = multipartRequest.getParameter("name");  
        System.out.println("name: " + name);
        
        String realFileName = file.getOriginalFilename();  
        System.out.println("获得文件名：" + realFileName);  
        // 获取路径
        String ctxPath = request.getSession().getServletContext().getRealPath("/")+"report/";  
        // 创建文件
        File dirPath = new File(ctxPath);
        if (!dirPath.exists()) {
            dirPath.mkdir();
        }  
        File uploadFile = new File(ctxPath + realFileName);
        try {
			FileCopyUtils.copy(file.getBytes(), uploadFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        request.setAttribute("files", loadFiles(request)); **/
        Message msg = new Message();
        msg.setStatusCode(200);
        msg.setMessage("文件上传成功！");
        return msg;
	}
	
	@RequestMapping("/downloadReport")
	public String downloadReport(HttpServletRequest request, HttpServletResponse response) {
		
		return "";
	}
	
	// @ModelAttribute("files") // 此属性用于初始类时调用,但上传文件后不能时时反应上传文件个数,不适合动态数据  
    public List<String> loadFiles(HttpServletRequest request) {
        List<String> files = new ArrayList<String>();  
        String ctxPath = request.getSession().getServletContext().getRealPath("/")+"\\"+"report\\";  
        File file = new File(ctxPath);  
        if (file.exists()) {  
            File[] fs = file.listFiles();  
            String fname = null;  
            for (File f : fs) {
                fname = f.getName();  
                if (f.isFile()) {  
                    files.add(fname);  
                }  
            }  
        }  
        return files;  
    }
	
}
