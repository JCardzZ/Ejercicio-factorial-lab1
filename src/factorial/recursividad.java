/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author JCardzZ
 */
public class recursividad {

    public int factor(int parametro){
        if (parametro > 0) {
            int valor = parametro * factor(parametro -1 );
            return valor;
        }
        return 1;
    }
    
}
