package SolutionGuiAf1;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}