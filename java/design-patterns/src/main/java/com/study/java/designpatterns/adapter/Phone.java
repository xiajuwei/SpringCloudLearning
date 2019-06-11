package com.study.java.designpatterns.adapter;

public class Phone {
    private VoltageAdapter voltageAdapter;

    //充电
    public void charge() {
        voltageAdapter.changeVoltage();
    }

    public void setVoltageAdapter(VoltageAdapter voltageAdapter) {
        this.voltageAdapter = voltageAdapter;

    }


}
