/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springAssignment.spvicky.services;

import com.springAssignment.spvicky.model.Trainer;
import com.springAssignment.spvicky.repositories.TrainerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vicky
 */

@Service
public class TrainerServiceImpl implements TrainerServiceInterface{
    
    @Autowired
    TrainerRepository trainerRepo;

    @Override
    public Trainer insertTrainer(Trainer tr) {
        return trainerRepo.save(tr);
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepo.findAll();
    }

    @Override
    public void deleteTrainer(Integer id) {
        trainerRepo.deleteById(id);
    }

    @Override
    public Trainer checkIfTrainerExists(String lastname, String firstname) {
        return trainerRepo.findByLastNameAndFirstName(lastname, firstname);
    }

    @Override
    public Trainer getById(Integer id) {
        return trainerRepo.getById(id);
    }

    @Override
    public void updateTrainer(Trainer t, int id) {
        t.setId(id);
        trainerRepo.save(t);
    }



    
   
    
    
    
    
}
