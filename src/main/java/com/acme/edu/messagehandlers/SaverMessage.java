package com.acme.edu.messagehandlers;
import com.acme.edu.typeofmessages.ArrTypeMessage;
import java.util.LinkedList;
import java.util.List;
/**
 * @author Kulakova
 */
public class SaverMessage  {
    public  Buffer buf=new Buffer();
    private List<BaseTypeMessage> listMessage = new LinkedList<>();
    private int[] listInt;

    public void save(BaseTypeMessage message){
        switch (message.getType()){
            case INT:
                buf.setBeforeWasInt(true);
                break;
            case STRING:
                buf.setBeforeWasString(true);
                break;
            case BYTE:
                buf.setBeforeWasByte(true);
                break;
        }
        if(buf.isBeforeWasInt()){
            listMessage.add(message);
            buf.setSumInt(message.toInt());
        }
        if (buf.isBeforeWasByte()){
            listMessage.add(message);
            buf.setSumByte(message.toByte());
        }
        if (buf.isBeforeWasString()){
            listMessage.add(message);
            buf.setSumString(1);
        }

    }



    private void saveType(BaseTypeMessage message) {
        buf.setType(message.getType());
    }

    public void save(ArrTypeMessage message){
        listInt=message.getArray();
    }

    public List<BaseTypeMessage> getListMessage(){
        return listMessage;
    }



//    public static boolean superPer=false;
//
//    public static int sumInt;
//    public static byte sumByte;
//    public static String sumString;
//
//    protected String eqString = "";
//    protected boolean beforeWasInt;
//    protected boolean beforeWasByte;
//    protected boolean beforeWasString = false;
//
//
//    public void save(BaseTypeMessage message) {
//
//        checkTypeAndSumm(message);
//        listMessage.add(message);
//        endlist();
////        if(beforeWasInt){
////            listMessage.add(message);
////            endlist();
////        }
////        if(beforeWasByte){
////            listMessage.add(message);
////            endlist();
////        }
////        if (beforeWasString){
////            listMessage.add(message);
////            endlist();
////        }
//
//       // summ((IntTypeMessage) message);
//    }
//
//    private void endlist() {
//        if(superPer){
//            Printer.flush();
//        }
//    }
//
//    private void checkTypeAndSumm(BaseTypeMessage message) {
//
//        switch (message.getType()){
//            case INT:
//                beforeWasInt=true;
//                summInt((IntTypeMessage) message);
//                break;
//            case BYTE:
//                beforeWasByte=true;
//                summByte((ByteTypeMessage) message);
//                break;
//            case STRING:
//                beforeWasString=true;
//                summString((StringTypeMessage)message);
//                break;
//        }
//    }
//
//    protected void setAllFalse(){
//        this.beforeWasInt = false;
//        this.beforeWasByte = false;
//        this.beforeWasString = false;
//    }
//
//    public void save(ArrTypeMessage message) {
//        listInt=message.getArray();
//    }
//
//    public void summInt(IntTypeMessage message){
//        sumInt+=message.toInt();
//
//    }
//
//    public  void  summByte(ByteTypeMessage message){
//        sumByte+=message.toByte();
//    }
//
//    public  void summString(StringTypeMessage message){
//      //  sumString+=message.toString();
//    }
//
//    public List<BaseTypeMessage> getListMessage() {
//        return listMessage;
//    }
//
//    private void setListMessage(List<BaseTypeMessage> listMessage) {
//        this.listMessage = listMessage;
//    }
//
//    public int[] getListInt() {
//        return listInt;
//    }
//
//    public void setListInt(int[] listIntArg) {
//        listInt = listIntArg;
//    }
}
