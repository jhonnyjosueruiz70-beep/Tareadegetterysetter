
package quintaclase;

import java.util.Scanner;
public class Quintaclase {
//vectores
    public static void main (String[] args ){
        Student[] students = new Student [3];
        students[0] = new Student ("Jhonny Ruiz", 19 , "2200299903");
        
        for (int i = 0; i < students.length; i++) {
            if (students[1] != null)
            System.out.println("vectores" + students[i].show());
        }
        



// ingresa las variables 
        
        Scanner in = new Scanner (System.in);
//vector        
        Student [] ingreso= new Student[2];
//for que recorre el vector 
        for (int i = 0; i < ingreso.length; i++) {
            System.out.println("Estudiante numero: "+ (i+1));
            System.out.println("Ingrese el nombre");
            String n= in.nextLine();
            System.out.println("Ingrese la cedula");
            String c= in.nextLine();
            System.out.println("Ingrese la edad");
            int e = in.nextInt();
            in.nextLine();
            students [i]= new Student(n,e,c);
            
            
                    
            
        }
        //encapsulamiento 
        Student student = new Student ();
        System.out.println("nombre"+ student.getName());
        student.setName("Jhonny Ruiz");
        student.setCardid("220099903");
        student.setAge(19);
        System.out.println(student.show());
       
        

        
                
       
        
    
}
    
    
    
}
