package com.mycompany.tallerclases;

public class Student {

    /**
     * Asignamos los atributos al objeto Animal
     */
    private String Name;
    public int Grade;
    public int Age;
    private boolean approved;
    protected int ID;
    public int ApprovedSubjects;
    public int DefaultedSubjects;

    /**
     * Generamos los constructores del objeto Estudiante
     *
     * @param Name
     * @param Grade
     * @param Age
     * @param approved
     * @param ID
     * @param ApprovedSubjects
     * @param DefaultedSubjects
     */
    public Student(String Name, int Grade, int Age, boolean approved, int ID, int ApprovedSubjects, int DefaultedSubjects) {
        this.Name = Name;
        this.Grade = Grade;
        this.Age = Age;
        this.approved = approved;
        this.ID = ID;
        this.ApprovedSubjects = ApprovedSubjects;
        this.DefaultedSubjects = DefaultedSubjects;

    }

    /**
     * * Generamos el constructor para el objeto person, para que en el Main no
     * genere error
     */
    Student() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Aca observamos a que nos retornara, en este caso sera a el atributo ID
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     * y aca veremos que el parametro ID sera igual a la ubicacion que nostros
     * digitamos
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

}
