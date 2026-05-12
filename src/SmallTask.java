import java.util.*;
class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "ID: " + id + " Name: " + name;
        }
    }

    public class SmallTask {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Student> students = new ArrayList<>();

            LinkedList<String> recent_activities = new LinkedList<>();

            Vector<String> notifications = new Vector<>();

            Stack<String> undo_operations = new Stack<>();

            while (true) {

                System.out.println("\n===== STUDENT TASK MANAGEMENT =====");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. View Students");
                System.out.println("4. View Recent Activities");
                System.out.println("5. View Notifications");
                System.out.println("6. Undo Last Operation");
                System.out.println("7. Exit");

                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the Id:");
                        int id = sc.nextInt();

                        sc.nextLine();
                        System.out.println("Enter name: ");
                        String name = sc.nextLine();

                        Student s = new Student(id, name);

                        students.add(s);
                        recent_activities.addFirst("Student Added: " + name);
                        notifications.add("Notification:Student Added");
                        undo_operations.push("Add  ");
                        break;
                    case 2:
                        System.out.println("Enter Student Id");
                        int removeId = sc.nextInt();
                        boolean found = false;

                        for (Student st : students) {
                            if (removeId == st.id) {
                                students.remove(st);
                                recent_activities.addFirst("Student Removed: " + st.name);
                                notifications.add("Notification:Student Removed");
                                undo_operations.push("removed: " + st.name);
                                found = true;
                                break;
                            }
                        }
                            if (!found) {
                                System.out.println("Student Not Found");
                            }
                            break;
                    case 3:
                        System.out.println("=========Students lists=========");
                        for (Student st : students) {
                            System.out.println(st);
                        }
                        break;
                    case 4:
                        System.out.println("----------Activities---------");
                        for (String act : recent_activities) {
                            System.out.println(act);
                        }
                        break;
                    case 5:
                        System.out.println("------notifications--------");
                        for (String not : notifications) {
                            System.out.println(not);
                        }
                        break;
                    case 6:
                        System.out.println("------undo operations------");
                        for (String str : undo_operations) {
                            System.out.println(str);
                        }
                        break;
                    case 7:
                        System.out.println("Exiting program");
                        return;
                    default:
                        System.out.println("Enter valid input");
                }
            }
        }
    }
