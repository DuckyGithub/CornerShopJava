package me.ketdonk.CornerShopJava.Commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;

import java.sql.Time;
import java.util.List;

public class myInfoCommand extends Command {

    public myInfoCommand(){
        super.name = "myinfo";
    }

    @Override
    protected void execute(CommandEvent event) {
        User User = event.getMessage().getAuthor();
        Integer TimeY = User.getTimeCreated().getDayOfMonth();
        String TimeString = TimeY.toString() +" / "+ User.getTimeCreated().getMonthValue() + " / " + User.getTimeCreated().getYear();
        EmbedBuilder info = new EmbedBuilder();
        info.setThumbnail(User.getAvatarUrl());
        info.setColor(0x694200);
        info.setTitle("User Information");
        info.setDescription("Info on yourself");
        info.addField("Id", User.getId(),false);
        info.addField("Tag", User.getAsTag(),false);
        info.addField("Created At", TimeString,false);
//        info.addField("Tag", User.getAsTag(),true);
        event.reply(info.build());
    }
}
