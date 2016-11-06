package gr.amaliatsa.controllers;

import gr.amaliatsa.repositories.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amalia on 11/1/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

//    @RequestMapping(value = "/")
//    public String home(){
//        return "test";
//    }
//
    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public ModelAndView helloWorld(ModelMap model ) {
        List questions = questionnaireRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("questions", questions );
        return modelAndView;
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView getdata() {
//
//        List<String> list = getList();
//
//        //return back to index.jsp
//        ModelAndView model = new ModelAndView("lists");
//        model.addObject("lists", list);
//
//        return model;
//
//    }
//
//    private List<String> getList() {
//
//        List<String> list = new ArrayList<String>();
//        list.add("List A");
//        list.add("List B");
//        list.add("List C");
//        list.add("List D");
//        list.add("List 1");
//        list.add("List 2");
//        list.add("List 3");
//
//        return list;
//
//    }
}
