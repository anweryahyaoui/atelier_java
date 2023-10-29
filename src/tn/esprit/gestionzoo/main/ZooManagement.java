package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        // Instruction 1 :
            /*
                int nbrCages = 20;
                String zooName = "my zoo";
                System.out.println(zooName+" comporte "+nbrCages+" cages");
            */

        // Instruction 2 :
            /*
            Scanner sc = new Scanner(System.in);
            System.out.println("entre le nombre de cages");
            int nbrCages = sc.nextInt();
            System.out.println("entre le nom du zoo");
            String zooName = sc.next();
            */

        // Instruction 3 :
            // System.out.println(zooName+" comporte "+nbrCages+" cages");

        // Instruction 5 :
           //  tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal();
            /*
            lion.family = "cats";

             lion.name = "simba";
            lion.age = 20;
            lion.isMammal = true;
            */

           // tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo();
            /*
            myZoo.name = "belvider";
            myZoo.city = "tunisie";
            myZoo.nbrCages = 30;
            System.out.println(myZoo.animals.length);
            */
        // Instruction 6 : creation de constructeur parametre
        // Instruction 7 :
      //  tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal("cats","simba",10,true);
      //  tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo("belveder","tunisie",40);
        // Instruction 8 :
        // myZoo.displayZoo();
       // System.out.println(myZoo.toString());
     //   System.out.println(myZoo);
        // Instruction 9 :
       // System.out.println(lion);

        // Instruction 10 :
        Animal tiger = new Animal("cats","bagira",8,true);
        Animal loup = new Animal("loup","akira",8,true);
    //    myZoo.addAnimal(loup);
      //  myZoo.addAnimal(tiger);


        // Instrction 11 :

     //   myZoo.displayAnimals();
     //  int x= myZoo.searchAnimal(lion);
      //  System.out.println(x);

        // Instruction 13 :
      //  myZoo.removeAnimal(loup);

        // Instruction 15 :
        Zoo myZoo = new Zoo("belveder","tunisie");
       boolean isFull= myZoo.isZooFull();
       System.out.println(isFull);
        // Instruction 16 :
        Zoo z1 = new Zoo("savana","france");
        System.out.println(Zoo.comparerZoo(myZoo,z1));

        // Instruction 18 et 19 : encapsulation au niveau de classe Zoo et Animal

        // Instruction 20 : creation des classes
        // Instruction 21 :
        Aquatic ac = new Aquatic();
        Terrestrial tr = new Terrestrial();
        Dolphin dp = new Dolphin();
        Penguin pn = new Penguin();

        // Instruction 22 :


        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        // Instruction 23 :
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24 :
        aquatic.swim();
        dolphin.swim();
        penguin.swim();




    }
}