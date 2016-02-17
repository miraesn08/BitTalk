package com.example.bit_user.bitchatting;

/**
 * Created by bit-user on 2016-02-12.
 */
public class ChatroomLvitem {

    // Fields
    //private static ChatRoom room;
    private String senderName;
    //private String txtMsg;
    private ChatMsg chatMsgInstance;

    // Constructor
    public ChatroomLvitem(ChatMsg chatMsgInstance){
        this.chatMsgInstance = chatMsgInstance;
    }
    /*public ChatroomLvitem(ChatRoom room, ChatMsg chatMsgInstance) {
        this.room = new ChatRoom(room.getCrno(), room.getArMno(), room.getParticipantNum(), room.getCrName(), room.getLastMsg());
        try {
            if(this.room.getCrno() != chatMsgInstance.getCrno())
                throw new Exception();
            this.txtMember = new String(chatMsgInstance.getSenderName());
            this.txtMsg = new String(chatMsgInstance.getMessage());
            this.chatMsgInstance = new ChatMsg(
                    chatMsgInstance.getCmno(),
                    chatMsgInstance.getCrno(),
                    chatMsgInstance.getSenderNo(),
                    chatMsgInstance.getSenderName(),
                    chatMsgInstance.getMessage()
            );
        } catch(Exception ex) {

        }

    }*/

    // Getter/Setter
    //   1. Getter
    //public String getTxtMember() { return "[" + txtMember + "]"; }
    public String getSenderName() { return senderName; }
    //public String getTxtMsg() { return txtMsg; }
    public ChatMsg getChatMsgInstance() { return chatMsgInstance; }

    //   2. Setter
    /*public void setTxtMember(String txtMember) {
        this.txtMember = null;
        this.txtMember = new String(txtMember);
    }*/
    public void setSenderName(String senderName){
        this.senderName = senderName;
        this.chatMsgInstance.setSenderName(this.senderName);
    }
    /*public void setTxtMsg(String txtMsg) {
        this.txtMsg = null;
        this.txtMsg = new String(txtMsg);
    }*/
    public void setChatMsgInstance(ChatMsg chatMsgInstance) {
        this.chatMsgInstance = null;
        this.chatMsgInstance = new ChatMsg(chatMsgInstance);
    }

}
