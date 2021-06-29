/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springAssignment.spvicky.repositories;

import com.springAssignment.spvicky.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vicky
 */

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
    
    public Trainer findByLastNameAndFirstName(String lastname, String firstname);
    
    
    
}
