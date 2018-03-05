package com.acme.edu.typeofmessages;
import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
public class ArrTypeMessage extends BaseTypeMessage {
    private int[] array;
    ArrTypeMessage(int[] array){
        this.array=array;
    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
@Override
    public Type getType(){
        return Type.ARRAY;
    }
}
