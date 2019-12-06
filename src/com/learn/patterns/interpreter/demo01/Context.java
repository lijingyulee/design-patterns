package com.learn.patterns.interpreter.demo01;

/**
 * @author lijy
 * @date 2019-12-06
 * @description
 */
public class Context {
    private String before;
    private String after;

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}
