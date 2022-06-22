package com.mycompany.tallerclases;

/**
 * LLamo a esta libreria para poder usar el tipo de dato fecha
 */
import java.util.Date;

public class Person {

    /**
     * asignamos los atributos al objeto Person
     */
    public String Name;
    public String Lastname1;
    public String Lastname2;
    public Date Datebirth;
    public float Height;
    public int Age;

    /**
     * asignamos los constructores de cada respectivo atributo del objeto Person
     *
     * @param Name
     * @param Lastname1
     * @param Lastname2
     * @param Datebirth
     * @param Height
     * @param Age
     */
    public Person(String Name, String Lastname1, String Lastname2, Date Datebirth, float Height, int Age) {
        this.Name = Name;
        this.Lastname1 = Lastname1;
        this.Lastname2 = Lastname2;
        this.Datebirth = Datebirth;
        this.Height = Height;
        this.Age = Age;
    }

    /**
     * Generamos el constructor para el objeto person, para que en el Main no
     * genere error
     */
    Person() {
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
