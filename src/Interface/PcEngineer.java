package Interface;

public class PcEngineer implements IEngineer {
    private boolean military_status;
    private boolean criminal_record;

    public PcEngineer(boolean military_status, boolean criminal_record) {
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

        System.out.println("I worked following companies like computer engineer: ");

        for (int i = 0; i < array.length ;i++) {
            System.out.println(array[i]);
        }

    }
}
