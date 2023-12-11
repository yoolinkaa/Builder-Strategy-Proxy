package ucu.edu.ua.strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
        public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
                MailjetClient client;
                MailjetRequest request;
                MailjetResponse response;
                client = new MailjetClient("6c7cb0b8b7c9de75d160b5af79bcb64e",
                                "1f41ef5f8802bc5467c5cc76c76ff59e", new ClientOptions("v3.1"));
                request = new MailjetRequest(Emailv31.resource)
                                .property(Emailv31.MESSAGES, new JSONArray()
                                                .put(new JSONObject()
                                                                .put(Emailv31.Message.FROM, new JSONObject()
                                                                                .put("Email", "mykola.yakovkin@ucu.edu.ua")
                                                                                .put("Name", "Mykola"))
                                                                .put(Emailv31.Message.TO, new JSONArray()
                                                                                .put(new JSONObject()
                                                                                                .put("Email", "mykola.yakovkin@ucu.edu.ua")
                                                                                                .put("Name", "Mykola")))
                                                                .put(Emailv31.Message.SUBJECT,
                                                                                "Greetings from Mailjet.")
                                                                .put(Emailv31.Message.TEXTPART,
                                                                                "My first Mailjet email")
                                                                .put(Emailv31.Message.HTMLPART,
                                                                                "<h3>Dear passenger 1, welcome to " +
                                                                                                "<a href='https://www.mailjet.com/'>Mailjet</a>!</h3><br />"
                                                                                                +
                                                                                                "May the delivery force be with you!")
                                                                .put(Emailv31.Message.CUSTOMID,
                                                                                "AppGettingStartedTest")));
                response = client.post(request);
                System.out.println(response.getStatus());
                System.out.println(response.getData());
        }
}
