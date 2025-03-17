package partialExample.services;

import partialExample.entities.Spare;

import java.math.BigDecimal;
import java.util.Stack;

public interface ISpareService {
    void findSpare(Stack<Spare> spareStack, String reference);
    Stack<Spare> createSpare(Stack<Spare> spareStack);
    void deleteSpare(Stack<Spare> spareStack, String reference);
    Spare sellSpare(Stack<Spare> spareStack, String reference, Long units);


}
