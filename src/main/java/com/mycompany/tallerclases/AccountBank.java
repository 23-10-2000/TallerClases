package com.mycompany.tallerclases;

public class AccountBank {

    /**
     * asignamos los atributos al objeto AccountBank
     */
    private int accountNumber;
    protected boolean Activated;
//
    protected int ID;
    public String NamePropieraty;
    public String NambeBank;

    /**
     * Generamos los constructores del objeto AccountBank
     *
     * @param accountNumber
     * @param Activated
     */
    public AccountBank(int accountNumber, boolean Activated) {
        this.accountNumber = accountNumber;
        this.Activated = Activated;
    }

    /**
     * * Generamos el constructor para el objeto person, para que en el Main no
     * genere error
     */
    AccountBank() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Aca observamos a que nos retornara, en este caso sera a el atributo
     * Activated
     *
     * @return
     */
    public boolean isActivated() {
        return Activated;
    }

    /**
     * y aca veremos que el parametro Activated sera igual a si esta activado o
     * no
     *
     * @param Activated
     */
    public void setActivated(boolean Activated) {
        this.Activated = Activated;
    }

}
