package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 26/06/2016.
 * When we’re asked to read a message (line 43), we get a listing of all the files
 in the messages directory (line 46). If the directory is empty, we just return an
 empty message from the method (line 81). If the directory is not empty, then
 we sort the list of messages by message ID (line 52). We open the first message
 (line 63), read the message (line 66), delete the message from the queue (line
 70), and return the contents to the caller (line 81).
 */
public class TransactionQueue {
}
