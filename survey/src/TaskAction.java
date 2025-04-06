public interface TaskAction {
    boolean start();
    boolean complete();
    void assignTo(String userID);
    void setPriority(int priorityLevel);
}