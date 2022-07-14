package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;

public class AddressBookClassTest {
    @Test
    public void givenContactDetails() {
        Contacts[] array = {
                new Contacts("B", "Sv", "Atp", "Aur", "Ts", "sr@", "504251", "9052382248"),
                new Contacts("D", "K", "M", "L", "M", "Vo@", "500565", "9963989546"),
        };
        AddressBookClass addressBookClass;
        addressBookClass = new AddressBookClass(Arrays.asList(array));
        addressBookClass.writeTheData(AddressBookClass.IOService.FILE_IO);
    }

    @Test
    public void readTheContactDetails() {
        AddressBookClass addressBookClass = new AddressBookClass();
        addressBookClass.readContactDetails(AddressBookClass.IOService.FILE_IO);
    }

}
