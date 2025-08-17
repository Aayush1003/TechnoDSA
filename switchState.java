public class switchState {
    public static void main(String[] args) {
        // Example usage of switch statement
        int day = 3; // Let's say 1=Monday, 2=Tuesday, ..., 7=Sunday

        switch (day) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
