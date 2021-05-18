package me.ketdonk.CornerShopJava;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import me.ketdonk.CornerShopJava.Commands.hiCommand;
import me.ketdonk.CornerShopJava.Commands.pingCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;

public class main {

//    Token
    static String TOKEN = "Token Here";

    public static void main(String[] args) throws LoginException{
        JDA builder = JDABuilder.createDefault(TOKEN).build();
        long enable = System.currentTimeMillis();
        CommandClientBuilder ClientBuilder = new CommandClientBuilder();
//        Prefix
        ClientBuilder.setPrefix("!");
//        Activity
        ClientBuilder.setActivity(Activity.playing("Celery is homo"));

//        My Id
        ClientBuilder.setOwnerId("334742822437781504");
        ClientBuilder.build();
        CommandClient Client = (CommandClient) ClientBuilder.build();

        Client.addCommand(new pingCommand());
        Client.addCommand(new hiCommand());

        builder.addEventListener(Client);

        System.out.println("Bot enabled in " + (System.currentTimeMillis() - enable )+ " ms!");
    }
}