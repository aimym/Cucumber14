package utils;

import org.json.JSONObject;

public class APIPayloadConstant {

    public static String createEmployeePayload(){
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"Aidann\",\n" +
                "  \"emp_lastname\": \"Nur\",\n" +
                "  \"emp_middle_name\": \"MS\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"1995-01-25\",\n" +
                "  \"emp_status\": \"Confirmed\",\n" +
                "  \"emp_job_title\": \"QA Tester\"\n" +
                "}";
        return createEmployeePayload;
    }

    public static String createEmployeeJsonBody(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "Aidann");
        obj.put("emp_lastname", "Nur");
        obj.put("emp_middle_name", "MS");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "1995-01-25");
        obj.put("emp_status", "Confirmed");
        obj.put("emp_job_title", "QA Tester");
        return obj.toString();
    }

    public static String createEmployeePayloadDynamic(String firstname, String lastname, String middlename,
                                                      String gender, String dob, String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title", jobTitle);
        return obj.toString();
    }

    public static String adminPayload(){
        String adminPayload = "{\n" +
                "  \"email\": \"aidan.syn@run.com\",\n" +
                "  \"password\": \"testingxxx\"\n" +
                "}";
        return adminPayload;
    }

}
