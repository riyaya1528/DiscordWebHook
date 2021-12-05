package net.riyaya.java;

import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        DiscordWebhook webhook = new DiscordWebhook("");
        webhook.setContent("7Days To Dieサーバー");
        webhook.setTts(false);
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
                .setTitle("7Days To Die サーバーについて")
                .setDescription("サーバーが起動しました!")
                .setColor(Color.GREEN)
                .setUrl("https://www.google.com/"));
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
                .setDescription("※これはテストです"));
        try {
            webhook.execute(); //Handle exception
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
