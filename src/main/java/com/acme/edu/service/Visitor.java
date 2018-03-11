package com.acme.edu.service;

import com.acme.edu.domain.*;
/**
 * Интерфейс посетителя, содержащий методы посещения
 * каждого компонента команды.
 * @author Oskolkova & Kulakova
 */
public interface Visitor {
    public IntCommand visitInt(IntCommand intCommand);
    public StringCommand visitString(StringCommand strCommand);
    public ByteCommand visitByte(ByteCommand byteCommand);
    public BoolCommand visitBool(BoolCommand boolCommand);
    public CharCommand visitChar(CharCommand charCommand);
    public ArrCommand visitArray(ArrCommand arrCommand);
    public MatrixCommand visitMatrix(MatrixCommand matrCommand);
    public Command visitObject(ObjCommand objCommand);
}
