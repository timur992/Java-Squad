public class Run {
  public static void main(String[] args){
    System.out.println("Run is Running");
    String name = "Shamsiddin";
    String shortName = name.length() > 5 
      ? name.substring(0, 5) 
      : name;


    String firstName = "Shamsiddini";  
    String lastName = "Ziyovuddin";  

    String fullName = firstName.length() > 5
      ? lastName.length() > 4
        ? firstName.substring(0, 5) + " " + lastName.substring(0, 4)
        : firstName.substring(0, 5) + " " + lastName
      : firstName + " " + lastName;

    // System.out.println(fullName);


    String action = "ADD_NEW_USER";
    // switchDemo(action);
    // switchDemo("");
    System.out.println(apiEndpoint("dev"));
  }

  public static void switchDemo(String action) {
    switch(action){
      case "ADD_NEW_USER":
        System.out.println("Adding a new user");
        break;

      case "REMOVE_USER":
        System.out.println("REmoving a user");
        break;

      case "UPDATE_USER":
        System.out.println("Updating a user");
        break;

      // default:
      //   System.out.println("Doing nothing");
      //   break;
    }  
  }

  public static String apiEndpoint(String env) {
    String result = "dev";
    switch(env){
      case "dev":
        result = "https://dev.api.com";
        break;

      case "staging":
        result = "https://staging.api.com";
        break;
      
      case "prod":
      case "production":
        result = "https://production.api.com";
        break;
    }

    return result;
  }
  

}