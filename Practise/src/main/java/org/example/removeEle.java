package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class removeEle {
    public static void main(String[] args) {
        ArrayList <Member>a=new ArrayList();
        a.add(new Member(1,"ashish"));
        a.add(new Member(2,"rohith"));
        a.add(new Member(3,"bnau"));
        a.add(new Member(4,"rana"));

        a.removeIf(member -> member.getName().equalsIgnoreCase("rana"));

        System.out.println(a);
    }
}
class Member{
    String name;
    int id;
    Member(int id,String name){
        this.name=name;
this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }



        }
