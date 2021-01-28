/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.keele.csc20004;

/**
 *
 * @author Marco Ortolani
 */
public class Student1 {
    private int id;
    private String name;
    
    public Student1(int id, String name) {
        this.name = name;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}