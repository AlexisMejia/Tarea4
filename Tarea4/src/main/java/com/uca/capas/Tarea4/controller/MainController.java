package com.uca.capas.Tarea4.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.Tarea4.domain.producto;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@GetMapping("/producto")
	public ModelAndView product(producto pro){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("producto");
		mav.setViewName("producto");
		
		return mav;
	}
	
	@PostMapping("/producto")
	public ModelAndView productos(@Valid @ModelAttribute producto pro, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("producto");
		}else {
			String mensaje = "El producto " + pro.getNombreProducto() + " fue ingresado!";
			
			mav.addObject("mensaje", mensaje);
			mav.setViewName("save");
			
		}
		
		return mav;
	}

}
