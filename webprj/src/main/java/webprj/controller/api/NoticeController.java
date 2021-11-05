package webprj.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webprj.entity.Notice;
import webprj.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public Notice list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list =noticeService.getList(1, "title", "");
		return list.get(0);
		
	}
}
