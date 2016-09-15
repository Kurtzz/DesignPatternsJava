package com.kurtz.behavioral.mediator;

/**
 * Created by P on 12.09.2016.
 */
public class TurnOffAllLightsCommand implements Command {
    private Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
