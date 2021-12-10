package com.kodilla.patterns.singleton;

public enum Logger { // originally class instead of enum

    INSTANCE;  //added after changing the class to enum

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}