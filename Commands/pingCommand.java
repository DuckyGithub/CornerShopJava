package me.ketdonk.CornerShopJava.Commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

public class pingCommand extends Command {

    public pingCommand(){
        super.name = "ping";
    }

    @Override
    protected void execute(CommandEvent event) {
        EmbedBuilder ping = new EmbedBuilder();
        ping.setColor(0x694200);
        ping.setTitle("PING");
        ping.setDescription("The time took was: " + event.getJDA().getGatewayPing());
        event.reply(ping.build());
    }
}
