public class Doctor extends Person {
    private long MedicalLiNo;
    private String Specialization;


    public long getMedicalLiNo() {
        return MedicalLiNo;
    }

    public void setMedicalLiNo(long medicalLiNo) {
        MedicalLiNo = medicalLiNo;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
}
