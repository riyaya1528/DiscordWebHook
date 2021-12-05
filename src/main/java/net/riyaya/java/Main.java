package net.riyaya.java;

import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        DiscordWebhook webhook = new DiscordWebhook("");
        webhook.setContent("test1");
        webhook.setTts(false);
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
                .setTitle("test2")
                .setDescription("test3")
                .setColor(Color.GREEN)
                .setUrl("https://www.google.com/"));
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
                .setDescription("test4"));
        try {
            webhook.execute(); //Handle exception
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
