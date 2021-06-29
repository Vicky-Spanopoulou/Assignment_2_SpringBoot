/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springAssignment.spvicky.services;

import com.springAssignment.spvicky.model.Trainer;
import java.util.List;

/**
 *
 * @author vicky
 */
public interface TrainerServiceInterface {
    
    public Trainer insertTrainer(Trainer t);
    
    public void updateTrainer(Trainer t, int id);
    
    public List<Trainer> getAllTrainers();
    
    public void deleteTrainer(Integer id);
    
    public Trainer checkIfTrainerExists(String lastname, String firstname);
    
    public Trainer getById(Integer id);
    
    
}
