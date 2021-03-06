/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;

/**
 *
 * @author Laptop Shop
 */
public class DoorController {
    private boolean isOpen;
    private final ElevatorControlCabinet elevator;
    

    public DoorController(boolean isOpen, ElevatorControlCabinet elevator) {
        this.isOpen = isOpen;
        this.elevator = elevator;
    }
    
    
    public void changeDoorStatus(boolean isOpen){
        this.isOpen = isOpen;

        if (isOpen == true){
            elevator.getElevator().getGui().getDoorStatus().setText("Open");
            elevator.getGUI().getDoorBtn().setEnabled(false);
            elevator.getGUI().getCloseDoorBtn().setEnabled(true);
            elevator.getSound().playOpenDoorSound();
        }
        else {
            elevator.getGUI().getDoorBtn().setEnabled(true);
            elevator.getGUI().getCloseDoorBtn().setEnabled(false);
            elevator.getElevator().getGui().getDoorStatus().setText("Closed");
        }
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
