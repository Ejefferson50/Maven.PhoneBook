package com.zipcodewilmington.phonebook;



import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook<name> {
    TreeMap<String, ArrayList> phoneBook = new TreeMap<>();


    //TreeMap<String, String> phoneBook = new TreeMap<>();
    String name;
    ArrayList phoneNumber;




    public void addEntry(String name, String phoneNumber) {

        if(phoneBook.get(name) == null) {
            ArrayList<String> phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);

            phoneBook.put(name, phoneNumberList);

        }else if (phoneBook.get(name)!= null) {
            for (Map.Entry<String, ArrayList> entry : phoneBook.entrySet()) {
                if (entry.getKey().equals(name)) {
                    entry.getValue().add(phoneNumber);
                    phoneBook.get(name).add(phoneNumber);

                }
            }

        }
    }

    public void removeEntry(String name) {

        phoneBook.remove(name);


    }

    public String lookupEntry(String name) {
        if (phoneBook.get(name) != null) {
            ArrayList<String> phoneNumber = phoneBook.get(name);
            String result = phoneNumber.toString().replace("[", "").replace("]", "");
            return result;
        }else {
            return null;
        }

    }



    public String reverseLookup(String phoneNumber) {
        String foundName = "";

        for (Map.Entry<String, ArrayList> entry : phoneBook.entrySet()) {
            for (int index = 0; index < entry.getValue().size(); index++) {
                if (entry.getValue().indexOf(phoneNumber) != -1) {
                    name = entry.getKey();
                }
            }


        }
        return name;
    }

     public void display(){

        String result = "";




        }

        System.out.println(phoneBook.values());


    }
}
