package com.dottorsoft.SimpleBlockChain.core;

import com.dottorsoft.SimpleBlockChain.Main;
import com.dottorsoft.SimpleBlockChain.util.Parameters;
import com.dottorsoft.SimpleBlockChain.util.StringUtil;
import java.util.Map;



interface TransactionOutputInterface{

   boolean isMine(String publicKey);
   
   void showTransactions(String publicKey);
}

public class TransactionOutputOne implements TransactionOutputInterface{
   
   public TranactionOutputOne(){
   
   }
   public TransactionOutputOne(String reciepient, float value, String parentTransactionId){
   }
   public boolean isMine(String publicKey){
   
   }
   public void showTransactions(String publicKey){
   
   }
}
