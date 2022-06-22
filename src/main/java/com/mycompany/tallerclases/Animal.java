package com.mycompany.tallerclases;

public class Animal {

    /**
     * Asignamos los atributos al objeto Animal
     */
    public String Name;
    public String Category;
    public String Inhabit;
    private String Ubication;
    protected boolean Insect;
    public int Age;

    /**
     * Generamos los constructores del objeto Animal
     *
     * @param Name
     * @param Category
     * @param Inhabit
     * @param Ubication
     * @param Insect
     * @param Age
     */
    public Animal(String Name, String Category, String Inhabit, String Ubication, boolean Insect, int Age) {
        this.Name = Name;
        this.Category = Category;
        this.Inhabit = Inhabit;
        this.Ubication = Ubication;
        this.Insect = Insect;
        this.Age = Age;
    }

    /**
     * * Generamos el constructor para el objeto person, para que en el Main no
     * genere error
     */
    Animal() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Aca observamos a que nos retornara, en este caso sera a el atributo
     * Category Category
     *
     * @return
     */
    public String getCategory() {
        return Category;
    }

    /**
     * y aca veremos que el parametro Category sera igual a la ubicacion que
     * nostros digitamos
     *
     * @param Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

}
