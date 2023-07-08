package Interface;

public class MachineEngineer implements IEngineer,IWork {
    private boolean military_status;
    private boolean criminal_record;

    @Override
    public void work() {
        System.out.println("Machine engineer is working.....");

    }

    public MachineEngineer(boolean military_status, boolean criminal_record) {
        this.military_status = military_status;
        this.criminal_record = criminal_record;
    }

    @Override
    public void military_status() {

        if (military_status) {
            System.out.println("I have done military....");
        } else {
            System.out.println("I still haven't done military....");
        }

    }

    @Override
    public String graduation_average(double degree) {

        return "My graduation average is: " + degree;
    }

    @Override
    public void criminal_record() {

        if (criminal_record) {
            System.out.println("I have criminal record.....");
        } else {
            System.out.println("I dont have criminal record....");
        }
    }

    @Override
    public void work_experience(String[] array) {

        if (array.length == 0) {
            System.out.println("not work experience...");
        } else {
            System.out.println("I worked following companies like machine engineer: ");

            for (int i = 0; i < array.length ;i++) {
                System.out.println(array[i]);
            }
        }

    }

    public void referance(String[] array) {

        if (array.length == 0) {
            System.out.println("I dont have referance");
        } else {

            System.out.println("My referances: ");

            for (int i = 0; i < array.length ;i++) {
                System.out.println(array[i]);
            }
        }
    }
}
