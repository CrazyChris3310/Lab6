package utilities.commands;

import dragon.Dragon;
import exceptions.WrongInputFormatException;
import input.Input;

/**
 * Command "Add". Adds element to collection.
 */
public class AddCommand extends Command {

    private Dragon dragon;

    public AddCommand(Input input) {
        super(input);
        description = "add {element} - add new element to collection";
    }

    /**
     * Method inputs a dragon and adds it into collection.
     */
    @Override
    public void execute() {
        try {
            if (isInputStreamNotEmpty())
                return;
            dragon = input.inputDragon();
        } catch (WrongInputFormatException e) {
            System.out.println("Wrong Data given!");
        }
    }
}
