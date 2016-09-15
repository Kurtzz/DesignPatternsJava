package com.kurtz.behavioral.state;

public class FanMediumState extends State {
    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off.");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is on medium";
    }
}
