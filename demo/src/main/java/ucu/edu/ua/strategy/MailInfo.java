package ucu.edu.ua.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String generate() {
        return mailCode.generate(client);
    }
}