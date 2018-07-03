package it.futuroprossimo.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;


@Controller
public class FuturoController {
	
	 private static final Logger logger = LoggerFactory.getLogger(FuturoController.class);

	
	 @GetMapping(path = "/grafico")
	 public String grafico() {
		 logger.info("grafico");
	        return "thymeleaf/grafico";
	 }
	 
	 @GetMapping(path = "/home")
	 public ModelAndView home() {
		 logger.info("home");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("thymeleaf/index");
		    return modelAndView;
	 }
	 
	 @GetMapping(path = "/salvagrafico")
	 public ModelAndView salvaGrafico() {
		 logger.info("salvagrafico");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("thymeleaf/index");
		    return modelAndView;
	 }
	 
	 
	
	 @GetMapping("/hello")
     public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		logger.info("hello1");
		model.addAttribute("name", name);
	    return "jsp/hello";
	 }
	 
}
