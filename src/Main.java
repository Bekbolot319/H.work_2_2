//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Books createObject(String classname) {
        switch (classname) {
            case "Geography":
                return new
                        Geography("Geograph", "Dr. West", 7);
            case "Chemistry":
                return new
                        Chemistry("Chemistry of life", "Dr. Wayne", "Star lab");
            case "History":
                return new
                        History("History of Kyrgyzstan", "Pr. Kariyev", "The Kyrgyz Khaganate");
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        Books obj1=createObject("Geography");
        Books obj2=createObject("Chemistry");
        Books obj3=createObject("History");

        Printable[] objects = {
                (Printable)obj1, (Printable)obj2, (Printable)obj3
        };

        for (Printable obj : objects) {
            obj.print();
        }

    }
}