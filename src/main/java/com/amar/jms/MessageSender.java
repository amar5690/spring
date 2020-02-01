//package com.amar.jms;
//
//import javax.jms.Connection;
//import javax.jms.ConnectionFactory;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.MessageProducer;
//import javax.jms.Session;
//import javax.jms.TextMessage;
//
//import org.apache.activemq.ActiveMQConnection;
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//public class MessageSender {
//
//	private static final String activeMqUrl=ActiveMQConnection.DEFAULT_BROKER_URL;
//	
//	private static final String queueName="VEHICLE_REPO";
//	
//	public static void main(String []args) throws JMSException
//	{
//		ConnectionFactory connectionFactory=new  ActiveMQConnectionFactory(activeMqUrl);
//		Connection connection=connectionFactory.createConnection();
//		connection.start();
//		
//		Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
//		
//		Destination destination=session.createQueue(queueName);
//		MessageProducer messageProducer=session.createProducer(destination);
//		
//		TextMessage message=session.createTextMessage("Hellow, welcome to JMS World");
//		messageProducer.send(message);
//		
//		System.out.println("meaage send "+message.getText());
//		session.close();
//		
//	}
//	
//	
//}
