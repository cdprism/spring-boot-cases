package org.shancm.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * @author shancm
 * @package org.shancm.springbootdemo.controller
 * @description:
 * @date 2018/12/25
 */
//@RestController
@Controller
public class DownloadController extends BaseController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/download")
	public void download(HttpServletResponse response) throws IOException {
		response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode("catalog.txt", "GBK"));
		PrintWriter writer = response.getWriter();
		writer.println("你谁");
		writer.flush();
		writer.close();
	}
}
