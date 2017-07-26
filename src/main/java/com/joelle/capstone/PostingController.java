package com.joelle.capstone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joelle.models.Posting;

@Controller
public class PostingController {
	@RequestMapping (value="/CreatePosting", method=RequestMethod.POST)
	public String submit(Model model,
			@ModelAttribute("posting") Posting posting) {
			if(posting != null) {
			//	System.out.println("inside posting controller" + posting.getTitle()+" type"+posting.getType());
				//add this posting to my user's array list of postings
				//qualify it by type - type will be one of three options: item, service, resource
			//	model.addAttribute( /* how ever i call the posting*/, posting);
				return "account";
			} else {
				model.addAttribute("error", "Please enter posting details");
				return "account";
			}
	}
}
