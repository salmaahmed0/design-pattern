package structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive ;
    private Memory memory;

    public ComputerFacade(){
        cpu = new CPU();
        hardDrive = new HardDrive();
        memory = new Memory();
    }

    public void startComputer(){
        System.out.println("Starting Computer ...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer Started Successfully");
    }
    public void shutdownComputer(){
        System.out.println("Computer Shutting down ...");
        hardDrive.write();
        memory.clear();
        cpu.shutdown();
        System.out.println("Computer has Shut down Successfully");
    }

}
