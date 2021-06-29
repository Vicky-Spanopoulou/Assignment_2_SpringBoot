/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springAssignment.spvicky.controllers;

import com.springAssignment.spvicky.model.Trainer;
import com.springAssignment.spvicky.services.TrainerServiceInterface;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vicky
 */

@Controller
public class TrainerController {
       
    @Autowired
    TrainerServiceInterface trainerService;
    
    
//    ----------------------- CREATE NEW TRAINER -------------------------------
    
    
    @GetMapping("/form")
    public String newTrainer(ModelMap mm){
        Trainer tr = new Trainer();
        mm.addAttribute("newtrainer", tr);
        return "teacherform";
    }
    

    @PostMapping("/insertform")
    public String insertTrainer(@Valid
                                @ModelAttribute(name = "newtrainer") Trainer t,
                                BindingResult result,
                                ModelMap mm){
        
        if(result.hasErrors()){
            return "teacherform";
        }
        Trainer trainer = trainerService.insertTrainer(t);
        
        if(trainer.getId() > 0){
            mm.addAttribute("viewtrainers", trainerService.getAllTrainers());
        }
        return "redirect:/alltrainers";
    }
    
    
    
//    ----------------------- READ ALL TRAINERS --------------------------------
    
    
        
    
    @GetMapping("/alltrainers")
    public String showTrainers(ModelMap mm){
        mm.addAttribute("viewtrainers", trainerService.getAllTrainers());
        return "trainerlist";  
    }
    
    
    
    
    
    
//    ----------------------- UPDATE TRAINER BY ID -----------------------------
    
    
    @GetMapping("/edit/{id}")
    public ModelAndView editTrainer(@PathVariable ("id") String id){
        
        ModelAndView mv = new ModelAndView("update_trainer");
        int tId = Integer.parseInt(id);
        Trainer t = trainerService.getById(tId);
        mv.addObject("trainer", t);
        
        return mv;
    }
    
    
    @GetMapping("/edit/update/{id}")
    public String updateTrainer(@ModelAttribute (name = "trainer") Trainer tr,
                                @PathVariable ("id") String id){
    
        int tId = Integer.parseInt(id);
        trainerService.updateTrainer(tr, tId);
        
        return "redirect:/alltrainers";
    }
    
    

    
    
//    ------------------------ DELETE TRAINER BY ID ----------------------------
    
    @GetMapping("/delete/{id}")
    public String deleteTrainer(@PathVariable("id") String id){  
        
        //to use the {id} that comes from the form (a string) i need to use
        //parseint so i can turn it into an integer and then use it
        
        int trId = Integer.parseInt(id);
        trainerService.deleteTrainer(trId);
        return "redirect:/alltrainers";
    }
    
    
    
    
//    ------------------------ jQuery AJAX REQUESTS ----------------------------
    
    
    @GetMapping("/checkname/{lname}/{fname}")
    @ResponseBody
    public Boolean checkTrainerExists(@PathVariable("lname") String lname,
                                      @PathVariable("fname") String fname){
        
        Trainer trainer = trainerService.checkIfTrainerExists(lname, fname);
        if(trainer != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
}
