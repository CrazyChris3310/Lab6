package utilities.commands;

import dragon.Dragon;
import exceptions.WrongInputFormatException;
import input.Input;
import utilities.DragonCollection;

/**
 * Command "Add". Adds element to collection.
 */
public class AddCommand extends Command{


    public AddCommand(DragonCollection collection, Input input) {
        super(collection, input);
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

            Dragon dragon = input.inputDragon();
            dragon.setId(drg.getMaxId() + 1);
            drg.add(dragon);
        } catch (WrongInputFormatException e) {
            System.out.println("Wrong Data given!");
        }
    }
}
