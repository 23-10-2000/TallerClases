package com.mycompany.tallerclases;

public class Arbol {

    /**
     * Asignamos los atributos al objeto Arbol
     */
    private String Name;
    public float Heigth;
    public float Width;
    public boolean Fruits;
    public String LeavesColor;
    protected String Ubication;
    public int Age;

    /**
     * Generamos los constructores del objeto Arbol
     *
     * @param Name
     * @param Heigth
     * @param Width
     * @param Fruits
     * @param LeavesColor
     * @param Ubication
     * @param Age
     */
    public Arbol(String Name, float Heigth, float Width, boolean Fruits, String LeavesColor, String Ubication, int Age) {
        this.Name = Name;
        this.Heigth = Heigth;
        this.Width = Width;
        this.Fruits = Fruits;
        this.LeavesColor = LeavesColor;
        this.Ubication = Ubication;
        this.Age = Age;
    }

    /**
     * * Generamos el constructor para el objeto person, para que en el Main no
     * genere error
     */
    Arbol() {
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
     * y aca veremos que el parametro Name sera igual a la ubicacion que nostros
     * digitamos
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

}
