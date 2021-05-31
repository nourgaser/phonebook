package com.mycompany.phonebook;

public class Contact {

    private String name;
    private String home, work, fax, email;
    
    public Contact(String name, String home, String work, String fax, String email) {
        this.name = name;
        this.home = home;
        this.work = work;
        this.fax = fax;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public java.util.Vector<String> getVector() {
        java.util.Vector<String> res = new java.util.Vector<>();
        res.add(name);
        res.add(home);
        res.add(work);
        res.add(fax);
        res.add(email);
        return res;
    }
}
