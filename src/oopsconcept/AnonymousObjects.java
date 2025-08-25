package oopsconcept;

//Linked to Macbook Class
public class AnonymousObjects {
    public static void main(String[] args) {
        Macbook macbook1 = new Macbook();
        Macbook macbook2 = new Macbook();
        Macbook macbook3 = new Macbook();
        Macbook[] macbookList1 = {macbook1, macbook2, macbook3};

        //Anonymous Objects
        Macbook[] macbookList2 = {new Macbook(), new Macbook(), new Macbook()};

        for(Macbook mac : macbookList2) {
            mac.infoDisplay();
            mac.switchOn();
            mac.colour = "black";
            mac.infoDisplay();
            System.out.println();
        }
    }
}
