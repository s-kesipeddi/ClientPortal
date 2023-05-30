package net.codejava.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.codejava.lib.CommonUtil;
//comments for track and trace
@Controller
public class MainController {
	
	
	@GetMapping("/customer")
	public String viewHomePage(Model model) {
		String appName = CommonUtil.getAppName();
		
		model.addAttribute("appName", appName);
		
		return "index";
	}
}
