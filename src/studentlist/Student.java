/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author srinivsi
 */
public class Student
{
    private String name;
    private int age;
    private int partSid;
    /* This is a partime code */

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the partSid
     */
    public int getPartSid() {
        return partSid;
    }

    /**
     * @param partSid the partSid to set
     */
    public void setPartSid(int partSid) {
        this.partSid = partSid;
    }
    
}
