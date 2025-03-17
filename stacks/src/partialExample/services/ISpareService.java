package partialExample.services;

import partialExample.entities.Spare;

import java.math.BigDecimal;
import java.util.Stack;

public interface ISpareService {
    Spare findSpare(Stack<Spare> spareStack, String reference);
    Spare addSpare(Stack<Spare> spareStack, Spare spare);
    void createSpare(String brand, String reference, Long cuantity, BigDecimal price);
    Spare deleteSpare(Stack<Spare> spareStack, String reference);
    Spare sellSpare(Stack<Spare> spareStack, String reference, Long units);


}
