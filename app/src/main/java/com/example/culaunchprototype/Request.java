package com.example.culaunchprototype;

public class Request
{
    private String title;
    private String description;
    private int phone;
    private String email;
    private String fName;
    private String lName;


    public Request(String title, String description, String email , int phone, String fName, String lName)
    {
        this.title = title;
        this.description = description;
        this.phone = phone;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String discription)
    {
        this.description = discription;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getString()
    {
        String string = ("Request: " + getTitle() + " Description: " + getDescription());
        return string;
    }
}
