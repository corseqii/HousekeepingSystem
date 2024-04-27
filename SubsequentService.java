import java.util.ArrayList;
import java.util.List;

// Define a class for user comments
class UserComment {
    private String userId;
    private String comment;

    public UserComment(String userId, String comment) {
        this.userId = userId;
        this.comment = comment;
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

// Define a class for subsequent services based on user comments
class SubsequentService {
    private String userId;
    private String serviceType;

    public SubsequentService(String userId, String serviceType) {
        this.userId = userId;
        this.serviceType = serviceType;
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}

public class HomeServiceSystem {
    // Store user comments
    private List<UserComment> comments = new ArrayList<>();

    // Store subsequent services based on user comments
    private List<SubsequentService> subsequentServices = new ArrayList<>();

    // Method to add user comment
    public void addUserComment(String userId, String comment) {
        UserComment userComment = new UserComment(userId, comment);
        comments.add(userComment);
    }

    // Method to add subsequent service based on user comment
    public void addSubsequentService(String userId, String serviceType) {
        SubsequentService subsequentService = new SubsequentService(userId, serviceType);
        subsequentServices.add(subsequentService);
    }

    // Main method for testing
    public static void main(String[] args) {
        HomeServiceSystem system = new HomeServiceSystem();

        // User adds a comment
        system.addUserComment("user123", "Great cleaning service!");

        // Based on the comment, subsequent service is added
        system.addSubsequentService("user123", "Cleaning");

        // Display user comments and subsequent services
        for (UserComment comment : system.comments) {
            System.out.println("User ID: " + comment.getUserId() + ", Comment: " + comment.getComment());
        }

        for (SubsequentService service : system.subsequentServices) {
            System.out.println("User ID: " + service.getUserId() + ", Subsequent Service: " + service.getServiceType());
        }
    }
}