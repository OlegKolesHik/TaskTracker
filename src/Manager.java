import java.util.HashMap;
import java.util.ArrayList;

//2.5 Обновление. Приняли решение, что список подзадач не меняется.

public class Manager {

    public HashMap<Integer, Epic> epicT;
    public HashMap<Integer, Subtask> subtaskT;
    public HashMap<Integer, Task> taskT;

    public Manager() {
        epicT = new HashMap<Integer, Epic>();
        subtaskT = new HashMap<Integer, Subtask>();
        taskT = new HashMap<Integer, Task>();

    }

    public ArrayList<Task> gettingTask() {
        ArrayList<Task> ListIdTask = new ArrayList<>(); //2.1 Cписок всех задач
        for (Integer k : taskT.keySet()) {
            ListIdTask.add(taskT.get(k));
        }
        return ListIdTask;
    }
    public HashMap<Integer, Subtask> gettingEpik (int taskIdNumber) { //3.1 Получение списка всех подзадач определённого эпика
        Epic epic = epicT.get(taskIdNumber);
        ArrayList<Integer> ListId = epic.listIdSub();

        return subtaskT;
    }

    public HashMap clear() {  //2.2  Удаление всех задач
        taskT.clear();
        return taskT;
    }

    public HashMap gettingId(int taskIdNumber) { //2.3 Получение по идентификатору
        taskT.get(taskIdNumber);
        return taskT;
    }

    public HashMap remove(int taskIdNumber) { //2.6 Удаление по идентификатору.
        taskT.remove(taskIdNumber);
        return taskT;
    }

    public HashMap creature(Task task) { //2.4 Создание. Сам объект должен передаваться в качестве параметра.
        taskT.put(task.taskIdNumber, task);
        return taskT;
    }

    public HashMap clearSub() {  //2.2  Удаление всех задач
        subtaskT.clear();
        return subtaskT;
    }

    public HashMap gettingIdSub(int subtaskIdNumber) { //2.3 Получение по идентификатору
        subtaskT.get(subtaskIdNumber);
        return subtaskT;
    }

    public HashMap removeSub(int subtaskIdNumber) { //2.6 Удаление по идентификатору.
        subtaskT.remove(subtaskIdNumber);
        return subtaskT;
    }

    public HashMap creatureSub(Subtask subtask) { //2.4 Создание. Сам объект должен передаваться в качестве параметра.
        subtaskT.put(subtask.taskIdNumber, subtask);
        return subtaskT;
    }

    public HashMap clearEpic() {  //2.2  Удаление всех задач
        epicT.clear();
        return epicT;
    }

    public HashMap gettingIdEpic(int epicIdNumber) { //2.3 Получение по идентификатору
        epicT.get(epicIdNumber);
        return epicT;
    }

    public HashMap removeEpic(int epicIdNumber) { //2.6 Удаление по идентификатору.
        epicT.remove(epicIdNumber);
        return epicT;
    }

    public HashMap creature(Epic epic) { //2.4 Создание. Сам объект должен передаваться в качестве параметра.
        epicT.put(epic.taskIdNumber, epic);
        return epicT;
    }

}

