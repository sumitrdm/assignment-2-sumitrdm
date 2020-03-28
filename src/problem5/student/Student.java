/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    String name;
    int baclogcount;
    int appearing;

    public Student(String name, int baclogcount, int appearing) {
        this.appearing = appearing;
        this.baclogcount = baclogcount;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaclogcount() {
        return baclogcount;
    }

    public void setBaclogcount(int baclogcount) {
        this.baclogcount = baclogcount;
    }

    public int getAppearing() {
        return appearing;
    }

    public void setAppearing(int appearing) {
        this.appearing = appearing;
    }


}

