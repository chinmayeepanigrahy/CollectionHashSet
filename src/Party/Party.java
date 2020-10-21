package Party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Party {

    public static void main(String[] args) {

        String[] his = {"Zack", "Arvid", "Wilhem", "Anna", "Adam", "Albert", "August", "Doris"};
        String[] hers = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Anna", "Adam", "Albert", "Annton"};

        String[] zacks = {"Hugo", "Albert", "Arvid", "Anna"};
        List<String> zacksfriends = Arrays.asList(zacks);

////        ArrayList<String> hisFreinds = new ArrayList<>(Arrays.asList(his));
////        ArrayList<String> herFreinds = new ArrayList<>(Arrays.asList(hers));
//        ArrayList<String> boysFreinds = new ArrayList<>(Arrays.asList(zacks));
        //Invite all her and his freinds to a party the list shouldnt contain duplicate////////
//      Here we need to use List<String> boysfriends = Arrays.asList(his); because we can not convert direct from arraylist hashset for convertinf hash set we are using  list  
        List<String> boysfriends = Arrays.asList(his);

        HashSet<String> guestList = new HashSet<>();
        guestList.addAll(boysfriends);

        List<String> girlsfriends = Arrays.asList(hers);
        guestList.addAll(girlsfriends);

//        for (String name : guestList) {
//            System.out.println(name);
//        }

// 2nd question :: / Zack is not invited remove him.
//     3.   //Zacks freind is not invited either, remove them
        guestList.remove("zack");
        guestList.removeAll(zacksfriends);
//        System.out.println("remove zacks and zacks friends");
//        for (String name : guestList) {
//            System.out.println(name);
//        }

        // 4.if both Doris and Wilhem are invited remove Wilhem
        if (guestList.contains("Doris") && guestList.contains("Wilhem")) {
//            for (String name : guestList) {
//                System.out.println(name);
//            }
//        }

        // 5.if Lotta is invited remove all guests whos name starts with an A
        if (guestList.contains("Lotta")) {
            guestList.removeIf(name -> name.startsWith("A") || name.startsWith("a"));
        }

        System.out.println("\nGuest List without the names starts with A");
        for (String name : guestList) {
            System.out.println(name);
        }

        //create a random placement list
//        ArrayList<String> guests = new ArrayList<>(guestList);
        ArrayList<String> guests = new ArrayList<>();
        guests.addAll(guestList);

        System.out.println("\nRandom list:");
        Collections.shuffle(guests);

        System.out.println(guests);

    }
}
}