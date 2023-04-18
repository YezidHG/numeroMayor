/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Personal
 */
public class Numeros {
    private int numero1; 

    private int numero2; 

//---------------------Constructor 

public Numeros (int num1, int num2){ 

    numero1 = num1; 

    numero2 = num2; 

}  

//-----------------------Método 

public void Mostrar(){ 

     int numeroMenor = this.numero1; 

     int numeroMayor = this.numero2; 

     if (this.numero1>this.numero2){ 

         numeroMayor = this.numero1; 

         numeroMenor = this.numero2; 

     } 

     System.out.println("El número mayor es:"+ numeroMayor); 

   if (numeroMayor % numeroMenor == 0) { 

       System.out.println("El número es múltiplo de el menor"); 

   } else{ 

       System.out.println("El número no es múltiplo de el menor"); 

   }  

} 
}
