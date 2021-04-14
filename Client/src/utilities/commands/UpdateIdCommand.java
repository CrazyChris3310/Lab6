package utilities.commands;

import dragon.Dragon;
import exceptions.IdException;
import exceptions.WrongInputFormatException;
import input.Input;
import utilities.ConnectionManager;
import utilities.DragonCollection;

import java.time.ZonedDateTime;

/**
 * Command "update".
 */
public class UpdateIdCommand extends Command{

    public UpdateIdCommand(Input input, ConnectionManager cm) {
        super(input, cm);
        description = "update id {element} - update the element with given id";
    }

    /**
     * Method inputs id and then changes fields of dragon with given id to new ones.
     */
    @Override
    public void execute() {
//        Long id;
//        try {
//            id = input.inputId();
//            ZonedDateTime creation = drg.removeFromQueue(id);
//            Dragon dragon = input.inputDragon();
//            dragon.setId(id);
//            dragon.setCreationDate(creation);
//            drg.add(dragon);
//        } catch (IdException e) {
//            System.out.println(e.getMessage());
//        } catch (WrongInputFormatException e) {
//            System.out.println("Wrong Data given!");
//        }
    }
}
