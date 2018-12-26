package org.shancm.springbootdemo.controller;

import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author shancm
 * @package org.shancm.springbootdemo.controller
 * @description:
 * @date 2018/12/25
 */
public class BaseController {

	protected ModelAndView result(String viewName){
		ModelAndView result = new ModelAndView();
		result.setViewName(viewName);
		return result;
	}

	protected ModelAndView result(String viewName, Map<String, String> map){
		ModelAndView result = new ModelAndView();
		result.setViewName(viewName);
		result.addAllObjects(map);
		return result;
	}
}
