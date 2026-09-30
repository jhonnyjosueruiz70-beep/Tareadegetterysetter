/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quintaclase;

/**
 *
 * @author User
 */
public class Student {
    //atributos
    private String name;
    private int age;
    private String cardid;
    // metodos setters y getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
    
    //CONSTRUCOTRES
    public Student(String name, int age, String cardid) {
        this.name = name;
        this.age = age;
        this.cardid = cardid;
    }

    public Student() {
    }
    
    
    
    public String show(){
        return "id "+ cardid + ";nombre:" + name + "; edad: " + age ;
        
    }
    
    
    
    
    
}
