package mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Component
@Controller
public class Idfccontroller {

	@Autowired
	idfcdto idfcdto;
	@Autowired
	Idfcdao idfcdao;
	
	// ****************** insert the data *************
	
	@RequestMapping("/insert")
	public ModelAndView create()
	{
		System.out.println("Data inserted succesfully");
		ModelAndView view=new ModelAndView("idfc.jsp");
		view.addObject("idfc", idfcdto);
		return view;
	}
	@RequestMapping("/inserting")
	public String save(idfcdto idfcdto)
	{
	 idfcdao.insert(idfcdto);
	 return "data inserted into database";
	}

	
	// ********* fetch the data *****************
	
	 @RequestMapping("/fetching")
	   public ModelAndView fetch()
	   {
		   ModelAndView modelAndView=new ModelAndView("fetch1.jsp");
		   modelAndView.addObject("idfc1",  idfcdto);
		   return modelAndView;
	   }
	 
	   @ResponseBody
	   @RequestMapping("/fetchsign")
	   public ModelAndView fetch1(String Email)
	   {
		   idfcdto idfcdto=idfcdao.fetch(Email);
		  ModelAndView modelAndView=new ModelAndView("fetch2.jsp");
		  modelAndView.addObject("idfc2",idfcdto);
		
		 
		  return modelAndView;
	   }
}
