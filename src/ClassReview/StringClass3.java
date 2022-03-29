package ClassReview;

public class StringClass3 {

    public static void main(String[] args) {
        String batch =" Batch 12";
        String course = "sdet";

        String company = "                     syntax               tech     ";
        System.out.println(company.trim());

        if("Batch 12".equals(batch) && "SDET".equals(course)) {
            System.out.println(" You will get the link to MS's lecture");
        } else {
            System.out.println("watch my youtube chennel");
        }
        if("Batch 12".equalsIgnoreCase(batch) && "SDET" .equalsIgnoreCase(course)){
            System.out.println(" Now all types of inputs are accepted");
        }
    }
}
