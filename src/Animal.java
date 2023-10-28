public class Animal {
    String family,name;
    int age;
    boolean isMammal;


    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    void displayAnnimal(){
        System.out.println("la family de ce animal est : "+family+
                "\n name : " +name+
                " \n age : "+age+
                "\n est ce que mammal : "+isMammal);
    }

    @Override
    public String toString() {
        return "la family de ce animal est : "+family+
                "\n name : " +name+
                " \n age : "+age+
                "\n est ce que mammal : "+isMammal ;
    }
}
