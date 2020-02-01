//package com.amar.jms;
//
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.MessageListener;
//import javax.jms.TextMessage;
//
//public class ConsumerMessageListner implements MessageListener{
//
//	private String consumerName;
//	
//	public ConsumerMessageListner(String consumerName)
//	{
//		super();
//		this.consumerName=consumerName;
//	}
//	
//	@Override
//	public void onMessage(Message message) {
//		
//        TextMessage textMessage = (TextMessage) message;
//        try {
//            System.out.println(consumerName + " received "
//                    + textMessage.getText());
//        } catch (JMSException e) {
//            e.printStackTrace();
//        }
//		
//	}
//
//}
