package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

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





    }
}