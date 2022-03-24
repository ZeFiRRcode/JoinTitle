package com.jointitle.jointitle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TestTitle implements CommandExecutor, Listener {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("TestTitle")){

                Player p = ((Player) sender).getPlayer();

                String title1 = JoinTitle.getPlugin(JoinTitle.class).getConfig().getString("message.title1");
                String title2 = JoinTitle.getPlugin(JoinTitle.class).getConfig().getString("message.title2");

                p.sendTitle(title1, title2);

                return true;
            }
        }
        return false;
    }
}
