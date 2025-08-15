// Java Object-Oriented Programming Example

class Programmer {
    private String name;
    private String language;

    public Programmer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    /**
     * Returns a string representation of the Programmer object.
     * The string includes the name and language fields.
     *
     * @return a string describing the Programmer instance
     */
    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Example usage of the Programmer class
    // Create a Programmer instance and print its string representation
        // This is a simple demonstration of the Programmer class
        //  Instantiate a Programmer object
        //  and print its details
        //  This main method serves as an entry point for testing the Programmer class
        //  Create a Programmer object with a name and programming language
        //  Print the Programmer object to see its string representation
        //  This will help verify that the toString method works correctly
        //  Example of creating a Programmer instance
        //  and displaying its information
        //  This main method is for testing purposes    
        //  Create a Programmer object with a name and programming language
        //  Print the Programmer object to see its string representation

        // Example usage of the Programmer class
        // Create a Programmer instance and print its string representation     

        // This is a simple demonstration of the Programmer class
        // Instantiate a Programmer object and print its details

        Programmer programmer = new Programmer("Alice", "Java");
        System.out.println(programmer);
    }
}