package com.example.bit_user.bitchatting;

/**
 * Created by bit-user on 2016-02-12.
 */
public class ChatMsg {
    private int cmno;   // 일련번호
    private int crno;   // 채팅방 번호
    private int senderNo;   // 작성자 일련번호
    private String senderName;  // 작성자명
    private String message;     // 작성 메시지
    //private Date sentDate;      // 작성일시

    public ChatMsg(int cmno, int crno, int senderNo, String senderName, String message/*, Date sentDate*/) {
        this.cmno = cmno;
        this.crno = crno;
        this.senderNo = senderNo;
        this.senderName = new String(senderName);
        this.message = new String(message);
        //this.sentDate = sentDate;
    }

    public ChatMsg(ChatMsg chatMsg) {
        this.cmno = chatMsg.getCmno();
        this.crno = chatMsg.getCrno();
        this.senderNo = chatMsg.getSenderNo();
        this.senderName = new String(chatMsg.getSenderName());
        this.message = new String(chatMsg.getMessage());
    }

    public int getCmno() { return cmno; }
    public int getCrno() { return crno; }
    public int getSenderNo() { return senderNo; }
    public String getSenderName() { return senderName; }
    public String getMessage() { return message; }
    //public Date getSentDate() { return sentDate; }
    public void setCmno(int cmno) { this.cmno = cmno; }
    public void setCrno(int crno) { this.crno = crno; }
    public void setSenderNo(int senderNo) { this.senderNo = senderNo; }
    public void setSenderName(String senderName) {
        this.senderName = null;
        this.senderName = new String(senderName);
    }
    public void setMessage(String message) {
        this.message = null;
        this.message = new String(message);
    }
    //public void setSentDate(Date sentDate) { this.sentDate = sentDate; }
}
