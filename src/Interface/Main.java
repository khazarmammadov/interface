package Interface;


public class Main {
    public static void main(String[] args) {
        PcEngineer pcEngineer = new PcEngineer(true,false);

        MachineEngineer machineEngineer = new MachineEngineer(true,true);

        machineEngineer.criminal_record();
        System.out.println(machineEngineer.graduation_average(34));
        machineEngineer.military_status();

        String[] array = {};
        String[] arr = {"I","You"};
        machineEngineer.work_experience(array);
        ((MachineEngineer)machineEngineer).referance(arr);
        machineEngineer.work();
    }
}
