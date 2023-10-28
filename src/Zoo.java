public class Zoo {
    Animal[] animals ;
    String name,city;
    int nbrCages,nbrAnimal;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
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
            if (animal.name == animals[i].name) //animals[i].name.equals(animal.name)
                return i;

        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
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

    @Override
    public String toString() {
        return "le nom de la zoo est : "+name+"\n city : "
                +city+" \n nombre de cages : "+nbrCages ;
    }
}