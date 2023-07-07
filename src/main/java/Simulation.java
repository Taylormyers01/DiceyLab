public class Simulation {

    private int runtime;
    private Dice simDice;
    private Bins simBin;

    public Simulation(int numOfDice, int runtime){
        simDice = new Dice(numOfDice);
        simBin = new Bins(numOfDice, numOfDice*6);
        this.runtime = runtime;
    }

    public void runSimulation(){
        for(int i = 0; i < runtime; i++){
            //System.out.println(simDice.tossAndSum());
            simBin.incrementBin(simDice.tossAndSum());
        }
    }

    public void printResults(){
        StringBuilder sb = new StringBuilder();
        String output = "";
        for(int i = simDice.getNumOfDiceThrown(); i < (simDice.getNumOfDiceThrown()*6)+1; i++){
            sb.append(String.format("%2d: %10d: %.2f %s\n", i, simBin.getBin(i), (double)simBin.getBin(i)/runtime, printStars((double)simBin.getBin(i)/runtime)));//(double)simBin.getBin(i)/runtime
        }
        System.out.println(sb.toString());
    }
    public String printStars(double value){
        StringBuilder sb = new StringBuilder();
        double run = value*100;
        for(int i = 0; i < run; i++){
            sb.append("*");
        }
        return(sb.toString());
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1000000);
        sim.runSimulation();
        sim.printResults();
    }
}
