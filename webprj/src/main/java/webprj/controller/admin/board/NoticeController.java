package webprj.controller.admin.board;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	private Logger logger = LoggerFactory.getLogger(NoticeController.class);
	@RequestMapping("list")
	public String list() {
		return "";
	}
	@GetMapping("reg")
	public String regOpen() {
		logger.info("HomeController Home {}",new Date());
		return "/customer/notice/reg1";
	}
	@PostMapping("reg")
	@ResponseBody
	public String reg(@RequestParam(name="title")String title, @RequestParam(name="content")String content) {
		System.out.println("타이틀"+title);
		System.out.println("내용"+content);
		return title+","+content;
	}
	@RequestMapping("edit")
	public String edit() {
		return "";
	}
}
