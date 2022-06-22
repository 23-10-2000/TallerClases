package com.mycompany.tallerclases;

/**
 * LLamo a esta libreria para poder usar el tipo de dato lista
 */
import java.util.ArrayList;

public class Fruit {

    /**
     * asignamos los atributos al objeto Fruit
     */
    public String Name;
    private float AvarageWeight;
    public ArrayList Color = new ArrayList();
    //
    public float peso;

    /**
     * Generamos los constructores del objeto fruta
     *
     * @param Name
     * @param AvarageWeight
     */
    public Fruit(String Name, float AvarageWeight) {
        this.Name = Name;
        this.AvarageWeight = AvarageWeight;
    }

    /**
     * Generamos el constructor para el objeto person, para que en el Main no
     * genere error
     */
    Fruit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Aca observamos a que nos retornara, en este caso sera a el atributo Name
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * y aca veremos que el parametro Name sera igual al nombre que nostros
     * digitamos
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

}
