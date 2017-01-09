package net.nemoi.intro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IntroController {

	@RequestMapping("/intro")
	public String intro(Model model){
		return "intro";
	}
	
}
