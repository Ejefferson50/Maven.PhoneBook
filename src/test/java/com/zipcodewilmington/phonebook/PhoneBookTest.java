
package com.zipcodewilmington.phonebook;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    String name = "Eric Jefferson";
    String phoneNumber = "215-478-7247";

    @Test
    public void testAddEntry(){
        //given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Eric Jefferson";
        String phoneNumber = "215-478-7247";


        //when
        phoneBook.addEntry(name, phoneNumber);
        String actual = phoneBook.lookupEntry(name);
        String expected = phoneNumber;

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveEntry(){
        //given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry(name, phoneNumber);


        //when
        phoneBook.removeEntry(name);



        //then
        Assert.assertNull(phoneBook.lookupEntry(name));

    }

    @Test
    public void testLookupEntry(){
        //given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry(name, phoneNumber);

        //when
        phoneBook.lookupEntry(name);


        //then
        Assert.assertEquals(phoneNumber, phoneBook.lookupEntry(name));


    }

    @Test
    public void testReverseLookup(){

        //given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry(name, phoneNumber);


        //when
        phoneBook.reverseLookup(phoneNumber);

        //then
        Assert.assertEquals(name, phoneBook.reverseLookup(phoneNumber));

    }

    @Test
    public void testDisplay(){

        //given
        PhoneBook phoneBook = new PhoneBook();

        //when
        phoneBook.addEntry("Eric Jefferson", "215-478-7247");
        phoneBook.addEntry("Joe Smoe", "215-555-1111");
        phoneBook.addEntry("Negative Nancy", "267-555-2222");
        phoneBook.addEntry("John Doe", "484-333-9999");
        phoneBook.addEntry("Robin Hood", "267-555-8888");

        //then
        Assert.assertEquals(name, phoneNumber);



    }
}
