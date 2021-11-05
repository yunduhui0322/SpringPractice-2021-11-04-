package webprj.controller.custmoer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webprj.entity.Notice;
import webprj.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(@RequestParam( name = "p",defaultValue = "1") Integer page) throws ClassNotFoundException, SQLException {
//		String p = request.getParameter("p");
		System.out.println("page " +page);
//		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
