package me.ketdonk.CornerShopJava;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class loggerEvent extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) {
        super.onGuildMessageReceived(e);
        String m = e.getMessage().getContentRaw();
        String u = e.getAuthor().getAsTag();
        System.out.println(u + " " + m);
    }
}
