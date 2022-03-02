import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task {
    protected int subtaskIdNumber;

    public Epic(String сaseName,
                String taskDescription,
                String statusTask) { // свои параметры и параметры супер-класса
        super(сaseName, taskDescription, statusTask); // параметры супер-класса
        this.subtaskIdNumber = subtaskIdNumber;

    }

    @Override
    public String toString() {
        return "Epic{" +
                "сaseName='" + сaseName + '\'' +
                ", EpicDescription='" + taskDescription + '\'' +
                ", EpicIdNumber=" + taskIdNumber +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }

    public HashMap<Integer, Subtask> subtaskT;

    public ArrayList<Integer> listIdSub() { //Список ID
        ArrayList<Integer> ListId = new ArrayList<>();
        ListId.add(subtaskIdNumber);
        return ListId;
    }

    public void status() {
        int sNew = 0;
        int sDone = 0;
        int sInProgress = 0;

        ArrayList<String> st = new ArrayList<>();
        for (Integer k : subtaskT.keySet() ) {
            st.add(subtaskT.get(k).getStatusTask());
        }
         if (st.isEmpty()) {
              statusTask = "NEW";
            return;
         }
         if (statusTask.equals("NEW")) {
            sNew = sNew + 1;
            return;
         }
         if (statusTask.equals("DONE")) {
            sDone = sDone + 1;
             return;
         }
         if (statusTask.equals("IN_PROGRESS")){
             sInProgress = sInProgress + 1;
             return;
         }
    }
}

