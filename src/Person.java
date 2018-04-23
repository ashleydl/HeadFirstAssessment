public class Person {

    private String name;
    private String destination;
    private String ticket;

    public Person(String name, String destination, String ticket) {
        this.name = name;
        this.destination = destination;
        this.ticket = ticket;

    }

    public String getName() {
        return this.name;
    }
    public String getDestination(){return this.destination;}
    public String getTicket(){return this.ticket;}
}
