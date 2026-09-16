package com.studentportal.student_portal;

import com.studentportal.student_portal.EntityClasses.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllers {
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("add_Student", new Student());
        model.addAttribute("logged", new Student());
        return "index";
    }
    @GetMapping("/login_form")
    public String loginForm(){
        return "Login";
    }
    @GetMapping("/feedback_form")
    public String feedbackForm(){
        return "feedback";}

    @GetMapping("/Dashboard")
    public String dashboard(){
        return "Dashboard";
    }
    @GetMapping("/apptitute_page")
    public String apptitute(){
        return "Apptitute";
    }
    @GetMapping("/reasoning_page")
    public String reasoning(){
        return "Reasoning";
    }
    @GetMapping("/technical_page")
    public String technical(){
        return "Technical";
    }
    @GetMapping("/Mock-Test_page")
    public String mockTest(){
        return "Mock-Test";
    }
    @GetMapping("/questions_page")
    public String questions(){
        return "Questions";
    }
    @GetMapping("/Test_page")
    public String test(){
        return "Test";
    }
    @GetMapping("/study-material_page")
    public String studyMaterial(){
        return "Study-Material";
    }
    @GetMapping("/profile_page")
    public String profile(){
        return "Profile";
    }
    @GetMapping("/dashboard_page")
    public String dashboradpage(){
        return "Dashboard";
    }
    @GetMapping("/index_page")
    public String indexpage(){
        return "index";
    }

}
