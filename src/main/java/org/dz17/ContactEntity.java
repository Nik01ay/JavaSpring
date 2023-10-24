package org.dz17;

import lombok.Getter;
import lombok.Setter;

public class ContactEntity {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String mail;
    @Getter
    @Setter
    private String tel;

    public ContactEntity() {
    }

    public ContactEntity(String name, String mail, String tel) {
        this.name = name;
        this.mail = mail;
        this.tel = tel;
    }

    @Override
    public String toString(){

        return name + "; " + tel + "; " + mail;
    }
}
