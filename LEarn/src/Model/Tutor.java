/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Tutor {
    private String eligibility_proof;
    private double rating;
    private String validation_status;

    public Tutor() {
    }

    public String getEligibility_proof() {
        return eligibility_proof;
    }

    public void setEligibility_proof(String eligibility_proof) {
        this.eligibility_proof = eligibility_proof;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getValidation_status() {
        return validation_status;
    }

    public void setValidation_status(String validation_status) {
        this.validation_status = validation_status;
    }
    
    
}