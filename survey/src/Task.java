public class Task implements TaskAction{
    private String taskId;
    private int priority = 0;

    public Task(String taskId)  {
        this.taskId = taskId;
    }

    @Override
    public boolean start() {
        return true;
    }

    @Override
    public boolean complete()   {
        return true;
    }

    @Override
    public void assignTo(String userID) {

    }

    @Override
    public void setPriority(int priorityLevel) {

    }
}
