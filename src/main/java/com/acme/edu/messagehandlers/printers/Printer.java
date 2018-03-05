package com.acme.edu.messagehandlers.printers;


import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Flush;
import com.acme.edu.messagehandlers.SaverMessage;
import com.acme.edu.typeofmessages.ArrTypeMessage;

public class Printer {
    public void  print(SaverMessage saver){
        if(saver.getListMessage().isEmpty()){
        }else {
//            printListMessage(saver);
//            System.out.println(saver.getListMessage().get(0).getType().getPrefix());
//            System.out.println(saver.getListMessage().get(0).toStr());
        }

    }
    private void printListMessage(SaverMessage saver) {

//        switch (saver.buf.getType()){
//            case INT:
//                System.out.println(saver.buf.getSumInt());
//                break;
//            case BYTE:
//                System.out.println(saver.buf.getSumByte());
//                break;
//            case STRING:
//                System.out.println(saver.buf.getSumString());
//                break;
//            case CHAR:
//               // System.out.println(saver.getListMessage().get(0));
//        }
       // System.out.println(saver.getListMessage().get(0).getType().getPrefix());
       // System.out.println(saver.buf.getSumInt());
       // Flush.flush(saver.getListMessage());
      //  saver.buf.setAllFalse();
    }


    public void  print(BaseTypeMessage message){
        System.out.println(message.toStr());
    }


    public void  print(ArrTypeMessage message){
        for (int me : message.getArray()) {
            System.out.println(me);
        }
    }


 //   public static void flush(){
        //superPer=true;
//        System.out.println(SaverMessage.listMessage.get(0).getType().getPrefix());
//
//        for(BaseTypeMessage me:listMessage){
////            if(me.getType()==Type.INT){
////                System.out.println(SaverMessage.sumInt);
////                SaverMessage.sumInt=0;
////                break;
////            }
//            //if()
//            System.out.println(me.toStr());
//        }
//
//        if(SaverMessage.listMessage.size()>2){
//         //   System.out.println(SaverMessage.sumInt);
//        }else {
//            for(BaseTypeMessage mes:SaverMessage.listMessage){
//                System.out.println(mes.toStr());
//            }
//        }
//
//        superPer=false;
//        SaverMessage.listMessage.clear();
//    }

//    public void print(BaseTypeMessage message) {
//
//    }
//    public void print(ArrTypeMessage message){
//
 //   }


}


