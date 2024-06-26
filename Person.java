package org.example;

import java.util.List;
/**This is a school management system with an abstract class representing common attributes of a person in a school
 * such as name, and age etc
 *
 */
    public abstract class Person {
        private String name;
        private int age;
        private String stateOfOrigin;

            //Constructor to assign args directly to the instance class
        public Person(String name, int age, String stateOfOrigin) {
            this.name = name;
            this.age = age;
            this.stateOfOrigin = stateOfOrigin;
        }

        // Getters and Setters for the fields in the Person class
        public String getName() {
            return name; //returns the name of a person in the school
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age; //returns the age of a person in the school
        }
        public void setAge(int age) {
            this.age = age;
        }
    public String getStateOfOrigin () {
        return stateOfOrigin; //returns the stateOfOrigin of a person in the school
    }

    public void setStateOfOrigin (String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

        // Abstract method to be implemented by subclasses
    //This method displays the info of a person in the school. Every person must have a way to display their info but the hos iw not defined here.
        public abstract void displayInfo();
    }


