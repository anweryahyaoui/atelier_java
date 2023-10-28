package tn.esprit.gestionzoo.entities;

public class Zoo {
   private Animal[] animals ;
   private String name,city;
    static final int  nbrCages = 25;
   private int nbrAnimal;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if(name.isBlank())
            System.out.println("il faut que chaque zoo obtient un nom");
      else  this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }

    void displayZoo(){
        System.out.println("le nom de la zoo est : "+name+"\n city : "
                +city+" \n nombre de cages : "+nbrCages);
    }

    boolean addAnimal(Animal animal){
        if(nbrCages>nbrAnimal){
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            System.out.println("animal ajouter");
            return true;
        } else if (isZooFull()) {
            return false;
        } else {
            System.out.println("verifier votre capaciter des cages");
            return false;
        }
    }

    void displayAnimals(){
        System.out.println("les animaux exist dans le zoo "+name);
        for (int i=0;i<nbrAnimal;i++){
            System.out.println(animals[i]);
            i++;
        }
    }


    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animal.getName() == animals[i].getName()) //animals[i].name.equals(animal.name)
                return i;

        }
        return -1;
    }

 public   boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimal; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimal] = null;
            this.nbrAnimal--;
        }
        System.out.println("suppression avec succes");
        return true;

    }

   public boolean isZooFull(){
        return nbrAnimal==nbrCages;
    }

 public  static Zoo comparerZoo(Zoo z1,Zoo z2){
       if(z1.nbrAnimal> z2.nbrAnimal)
           return z1;
       return z2;

    }

    @Override
    public String toString() {
        return "le nom de la zoo est : "+name+"\n city : "
                +city+" \n nombre de cages : "+nbrCages ;
    }
}
