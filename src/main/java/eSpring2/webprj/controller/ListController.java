package eSpring2.webprj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import eSpring2.webprj.entity.Notice;
import eSpring2.webprj.service.NoticeService;

@Controller
public class ListController {

	@Autowired
	private NoticeService noticeService;

	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(name="page",defaultValue = "10", required=true) String p) {
		
		ModelAndView mv = new ModelAndView();
		List<Notice> noticeList = noticeService.getList();
		
		mv.addObject("list",noticeList);
		mv.setViewName("notice.list");
		
		return mv;
	}
	
	@RequestMapping("/reg")
	public void reg() {
		
		System.out.println ( "reg start!");
	}
	
	
	@ResponseBody
	@RequestMapping("/submit")
	public String reg(HttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String select1 = req.getParameter("select1");
		String[] radio1 = req.getParameterValues("radio1");
		String chk1 = req.getParameter("chk1");
		
		String result="title:"+title+",content:"+content +",select1:"+select1+",radio1:"+radio1+"chk1:"+ chk1;
		return result;
	}


}