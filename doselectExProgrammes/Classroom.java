package doselectExProgrammes;

public class Classroom {
    
    // Method to register a student
    public String registerStudent(Student student) {
        // Check if the name is in uppercase
        if (!student.name.equals(student.name.toUpperCase())) {
            return "Block letters needed";
        }
        
        // Check if the score is between 0 and 100
        if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }
        
        // If both conditions are satisfied
        return "Registered";
    }
    
    // Method to validate student card
    public String studentCard(String card) {
        // Check if the card contains only numbers
        if (!card.matches("\\d+")) {
            return "Invalid card";
        }
        
        // If the card is valid
        return "Valid card";
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Create a student object
        Student s1 = new Student("Alice", 85);
        
        // Create a Classroom object
        Classroom cm = new Classroom();
        
        // Test registerStudent method
        String registerResult = cm.registerStudent(s1);
        System.out.println("Register Student Result: " + registerResult); // Expected output: "Registered"
        
        // Test studentCard method
        String cardResult = cm.studentCard("1234567890");
        System.out.println("Student Card Result: " + cardResult); // Expected output: "Valid card"
    }
}

