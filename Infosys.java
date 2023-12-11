public class Infosys {
    private int StudentId = 0;
    public int getStudentId(int StudentId) {
        return StudentId;
    }
    private String name = "";
    public String getName(String name) {
        return name;
    }

    private double qualifiyingExammarks = 0;
    public double getQualifiyingExammarks(double qualifiyingExammarks) {
        return qualifiyingExammarks;
    }

    private char residentialStatus = '0';
    public char getresidentialStatus(char residenceStatus) {
        return residenceStatus;
    }

    private int YearofEng = 0;
    public int getYearofEng(int YearofEng) {
        return YearofEng;
    }

    public static void main(String[] args)  {
        Infosys info = new Infosys();
        int getStudentId = info.getStudentId(56);
        String name = info.getName("Jacob");
        double qualifiyingExammarks = info.getQualifiyingExammarks(78.7);
        char residenceStatus = info.getresidentialStatus('F');
        int yearOfEng = info.getYearofEng(3);

        System.out.println("Student ID:"+getStudentId);
        System.out.println("Student Name:"+ name);
        System.out.println("qualifiyingExammarks:"+ qualifiyingExammarks);
        System.out.println(" residenceStatus:"+ residenceStatus);
        System.out.println(" yearOfEng:"+ yearOfEng);




    }
}
