package eSpring2.webprj.service;

import java.util.ArrayList;
import java.util.List;

import eSpring2.webprj.entity.Notice;

public class NoticeService {
	public List<Notice> getList() {
		List<Notice> noticeList = new ArrayList();
		noticeList.add(new Notice(1,"1st title","cleo","2023-01-03","my first content",0,null));
		noticeList.add(new Notice(2,"2nd title","cleo","2023-01-04","my second content",0,null));
		noticeList.add(new Notice(3,"3rd title","cleo","2023-01-05","my third content",0,null));
		
		System.out.println ("size:"+ noticeList.size());
		return noticeList;
	}
}
