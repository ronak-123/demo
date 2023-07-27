import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
       
        JSONObject data = new JSONObject();

      
        JSONObject examFee = new JSONObject();
        
        JSONObject indianExamFee = new JSONObject();
        indianExamFee.put("amount", 400);
        
        JSONObject foreignExamFee = new JSONObject();
        foreignExamFee.put("amount", 100);
        
        JSONObject nriExamFee = new JSONObject();
        nriExamFee.put("amount", 600);
        
        JSONObject saarcExamFee = new JSONObject();
        saarcExamFee.put("amount", 600);

        examFee.put("INDIAN", indianExamFee);
        examFee.put("FOREIGN", foreignExamFee);
        examFee.put("NRI", nriExamFee);
        examFee.put("SAARC", saarcExamFee);

      
        JSONObject applicationFee = new JSONObject();
        
        JSONObject indianApplicationFee = new JSONObject();
        indianApplicationFee.put("UG", 200);
        indianApplicationFee.put("UG-DIPLOMA", 300);
        indianApplicationFee.put("PG", 500);
        
        JSONObject foreignApplicationFee = new JSONObject();
        
        foreignApplicationFee.put("UG", 400);
        foreignApplicationFee.put("UG-DIPLOMA", 400);
        foreignApplicationFee.put("PG", 700);

        applicationFee.put("INDIAN", indianApplicationFee);
        applicationFee.put("FOREIGN", foreignApplicationFee);

       
        data.put("Exam Fee", examFee);
        data.put("Application Fee", applicationFee);

        
        System.out.println(data.toString(4)); 
    }
}

