package eSpring2.webprj.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eSpring2.webprj.entity.Notice;
import eSpring2.webprj.service.NoticeService;

@RestController("restListController")
@RequestMapping("/list/api/")
public class ListController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public List<Notice> list() {
		System.out.println ( " rest Controller start!");
		
		List<Notice> list = noticeService.getList();
		return list;
	}
}
