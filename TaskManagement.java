import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private String deadline;
    private int priority;

    public Task(String name, String deadline, int priority) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }
}

public class TaskManagement {
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addTask(String name, String deadline, int priority) {
        Task task = new Task(name, deadline, priority);
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void viewTasks() {
        System.out.println("Task List:");
        for (Task task : tasks) {
            System.out.println("Name: " + task.getName());
            System.out.println("Deadline: " + task.getDeadline());
            System.out.println("Priority: " + task.getPriority());
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        TaskManagement taskManager = new TaskManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Management App");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter deadline: ");
                    String deadline = scanner.nextLine();
                    System.out.print("Enter priority (1-high, 2-medium, 3-low): ");
                    int priority = scanner.nextInt();
                    taskManager.addTask(name, deadline, priority);
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
