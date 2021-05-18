package me.ketdonk.CornerShopJava.Commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

public class hiCommand extends Command {

    public hiCommand(){
        super.name = "hi";
    }

    @Override
    protected void execute(CommandEvent event) {
        EmbedBuilder ping = new EmbedBuilder();
        ping.setColor(0x694200);
        ping.setTitle("HI");
        ping.setDescription("Hello Mr " + event.getMember().getAsMention());
        event.reply(ping.build());
    }
}
