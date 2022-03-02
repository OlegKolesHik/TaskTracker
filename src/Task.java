public class Task {

    protected String сaseName; // Название, кратко описывающее суть задачи (например, «Переезд»).
    protected String taskDescription; // Описание, в котором раскрываются детали.
    protected int taskIdNumber;
    protected String statusTask; // Статус, отображающий её прогресс. Мы будем выделять следующие этапы жизни задачи:

    public Task(String сaseName, String taskDescription, String statusTask) {
        this.сaseName = сaseName;
        this.taskDescription = taskDescription;
        taskIdNumber = 0;
        this.statusTask = statusTask;
    }

    public String getStatusTask() {
        return statusTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "сaseName='" + сaseName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskIdNumber=" + taskIdNumber +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }
}
