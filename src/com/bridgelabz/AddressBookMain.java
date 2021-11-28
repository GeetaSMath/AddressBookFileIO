package com.bridgelabz;

public class AddressBookMain {
      public static void main(String[] args) {
        AddressBookManager makeBook = new AddressBookManager();
        makeBook.takeOption();
        boolean condition =true;
        while (condition){
            boolean monitorUser = makeBook.takeOption();
            if (monitorUser)
                break;
        }
    }
}
