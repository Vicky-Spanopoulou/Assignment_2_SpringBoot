/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springAssignment.spvicky.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author vicky
 */
@Entity
@Table(name = "trainers")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
//    @NamedQuery(name = "Trainer.findById", query = "SELECT t FROM Trainer t WHERE t.id = :id"),
//    @NamedQuery(name = "Trainer.findByFirstName", query = "SELECT t FROM Trainer t WHERE t.firstName = :firstName"),
//    @NamedQuery(name = "Trainer.findByLastName", query = "SELECT t FROM Trainer t WHERE t.lastName = :lastName"),
//    @NamedQuery(name = "Trainer.findBySubject", query = "SELECT t FROM Trainer t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @Column(name = "first_name")
    @NotNull
    @Size(min = 2, max = 40 )
    @Pattern(regexp = "^([a-zA-Z]+\\s?)*$", message = "Name must be 2 to 30 characters long")
    private String firstName;
    
    @Basic(optional = false)
    @Column(name = "last_name")
    @NotNull
    @Size(min = 2, max = 40 )
    @Pattern(regexp = "^([a-zA-Z]+\\s?)*$", message = "Name must be 2 to 30 characters long")
    private String lastName;
    
    @Basic(optional = false)
    @Column(name = "subject")
    @NotNull
    @Size(min = 2, max = 40 )
    @Pattern(regexp = "^([a-zA-Z]+\\s?)*$", message = "Subject must be 2 to 30 characters long")
    private String subject;

    public Trainer() {
    }

    public Trainer(Integer id) {
        this.id = id;
    }
   

    public Trainer(Integer id, String firstName, String lastName, String subject) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer: id = ").append(id);
        sb.append(", first name = ").append(firstName);
        sb.append(", last name = ").append(lastName);
        sb.append(", subject = ").append(subject);
        return sb.toString();
    }

    
    
}
