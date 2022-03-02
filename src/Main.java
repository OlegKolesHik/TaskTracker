public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        System.out.println("Пришло время практики!");

        Task task = new Task("Задача №1", "Описание 1 задачи", "");
        manager.creature(task);
        System.out.println(task);

        Task task2 = new Task("Задача №2", "Описание 2 задачи", "");
        manager.creature(task2);
        System.out.println(task2);

        Epic epic = new Epic("Эпик 1", "Описание 1 эпика", "");
        manager.creature(epic);
        System.out.println(epic);
        Subtask subtask = new Subtask("Подзадача 1", "Описание 1 подзадачи", "");
        manager.creatureSub(subtask);
        System.out.println(subtask);
        Subtask subtask2 = new Subtask("Подзадача 2", "Описание 2 подзадачи", "");
        manager.creatureSub(subtask2);
        System.out.println(subtask2);

        Epic epic2 = new Epic("Эпик 2", "Описание 2 эпика", "");
        manager.creature(epic2);
        System.out.println(epic2);

        Subtask subtask3 = new Subtask("Подзадача 1", "Описание 1 подзадачи", "");
        manager.creatureSub(subtask3);
        System.out.println(subtask3);












    }


}
