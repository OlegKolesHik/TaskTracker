//в подзадаче хранить id эпика которому она принадлежит, а в эпике хранить список id подзадач.
public class Subtask extends Task {
    protected int epicIdNumber; //Параметр в рамках какого эпика она выполняется

    public Subtask(String сaseName,
                   String taskDescription,
                   String statusTask) {
        super(сaseName, taskDescription, statusTask);
        this.epicIdNumber = epicIdNumber;

    }

    @Override
    public String toString() {
        return "Subtask{" +
                "сaseName='" + сaseName + '\'' +
                ", SubtaskDescription='" + taskDescription + '\'' +
                ", SubtaskIdNumber=" + taskIdNumber +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }
}
