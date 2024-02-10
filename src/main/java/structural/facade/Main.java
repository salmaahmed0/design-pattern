package structural.facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        computerFacade.shutdownComputer();
    }
}
