/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap_ejm;

/**
 *
 * @author Rebeca
 */
import java.util.HashMap;
public class HashMap_ejm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HashMap<String,Integer>
        points= new HashMap<String ,Integer>();
        points.put("Amy",154);
        points.put("Dave",42);
        points.put("Rob",733);
        System.out.println(points.get("Dave"));
        /*el string es su clave(indice) y los enteros sus valores  */
    }
    
}
