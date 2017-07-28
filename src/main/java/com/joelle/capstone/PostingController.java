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
				//TODO add this posting to my user's array list of postings in the database
				//	model.addAttribute( /* how ever i call the posting*/, posting);
				return "account";
			} else {
				model.addAttribute("error", "Please enter posting details");
				return "account";
			}
	}
}
