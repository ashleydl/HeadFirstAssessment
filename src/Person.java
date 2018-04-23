public class Person {

    private String name;
    private String destination;
    private Boolean ticket;

    public Person(String name, String destination, Boolean ticket) {
        this.name = name;
        this.destination = destination;
        this.ticket = true;

    }

    public String getName() {
        return this.name;
    }
    public String getDestination(){return this.destination;}
    public Boolean getTicket(){return this.ticket;}
}
