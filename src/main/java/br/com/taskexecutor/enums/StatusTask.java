package br.com.taskexecutor.enums;

public enum StatusTask {
    CANCELED("canceled"),
    COMPLETED("completed"),
    CREATED("created"),
    RUNNING("running");

    private final String value;

    StatusTask(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
