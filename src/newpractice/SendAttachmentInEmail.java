package newpractice;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendAttachmentInEmail {
   public static void main(String[] args) {
	   String to[]={"yugandhar.nalam@gmail.com"};
		String cc[]={"venkatayugandhar.nalam@zenq.com"};
		String bcc[]={"venkatayugandhar.nalam@zenq.com"};
		 
	 //change accordingly

	//Get the session object
	  Properties props = new Properties();
	  props.put("mail.smtp.host", "smtp.gmail.com");
	  props.put("mail.smtp.socketFactory.port", "465");
	  props.put("mail.smtp.socketFactory.class",
	        	"javax.net.ssl.SSLSocketFactory");
	  props.put("mail.smtp.auth", "true");
	  props.put("mail.smtp.port", "465");
	 
	  Session session = Session.getDefaultInstance(props,
	   new javax.mail.Authenticator() {
	   protected PasswordAuthentication getPasswordAuthentication() {
	   return new PasswordAuthentication("testingconnect451@gmail.com","Second@123");//change accordingly
	   }
	  });
	 
	//compose message
	  try {
	   MimeMessage message = new MimeMessage(session);
	   message.setFrom(new InternetAddress("testingconnect451@gmail.com"));//change accordingly
	   for(int i=0;i<to.length;i++){
		   message.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
	        }
	   for(int i=0;i<cc.length;i++){
	       message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));
	        }
	   for(int i=0;i<bcc.length;i++){
		   message.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
	   		}
	  // message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	   message.setSubject("Automation test Reports");
	   BodyPart messageBodyPart = new MimeBodyPart();

	   // Now set the actual message
	   messageBodyPart.setText("Hi Team,"+"\n"+"\nPlease find the attached document of all problem types with lesson names"+"\n\n Regards" + "\n Yugandhar");
	   

	   // Create a multipar message
	   Multipart multipart = new MimeMultipart();

	   // Set text message part
	   multipart.addBodyPart(messageBodyPart);

	   // Part two is attachment
	   messageBodyPart = new MimeBodyPart();
	   String filename = "C:\\Users\\venkata.nalam.ZENQ\\Desktop\\New Text.txt";
	   DataSource source = new FileDataSource(filename);
	   messageBodyPart.setDataHandler(new DataHandler(source));
	   messageBodyPart.setFileName(filename);
	   multipart.addBodyPart(messageBodyPart);

	   // Send the complete message parts
	   message.setContent(multipart);
	   //send message
	   Transport.send(message);

	   System.out.println("message sent successfully");
	 
	  } catch (MessagingException e) {throw new RuntimeException(e);}
	 
   }
}