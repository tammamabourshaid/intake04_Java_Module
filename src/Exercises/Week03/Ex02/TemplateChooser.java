package Exercises.Week03.Ex02;

import Exercises.Week03.Ex01.Customer;

public class TemplateChooser {

    public String chooseTemplate (Customer customer){
        if (TemplateMan(customer)){
            return "man";
        }
        if (TemplateWoman(customer)){
            return "woman";
        }
        if (TemplatePrivileged(customer)){
            return "privileged";
        }
        return "default";
    }

    private boolean TemplateMan(Customer customer) {
        return customer.getName().trim().startsWith("Mr.");
    }

    private boolean TemplateWoman(Customer customer) {
        return customer.getName().trim().startsWith("Ms.") || customer.getName().trim().startsWith("Mrs.");
    }

    private boolean TemplatePrivileged(Customer customer) {
        return customer.getName().trim().contains("Hokopoko");
    }

}


//    The TemplateChooser has no attributes.
//    It has the chooseTemplate method that receives a
//    customer and returns the word man, woman,
//    privileged or default depending on the insurance
//    company’s requirements.