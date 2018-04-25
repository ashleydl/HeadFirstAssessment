public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ash", "Middelburg", "geen");
        System.out.println(person1.getName());
        System.out.println(person1.getDestination());
        System.out.println(person1.getTicket());
        Wagon wagon = new Wagon(3, 4);
        wagon.getIn(person1, "SecondClass");

        if(person1.getTicket() == "FirstClass"){
            System.out.println(person1.getName()+" is ingestapt in de eersteklas");
         } else if(person1.getTicket() == "SecondClass"){
            System.out.println(person1.getName()+ "is ingestaptin de tweedeklas");
        } else{
            System.out.println("Sorry jij mag niet naar binnen");
        }
    }
}
