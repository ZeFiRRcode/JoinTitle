package com.jointitle.jointitle;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Config implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("Config")) {

                Player p = ((Player) sender).getPlayer();

                String reloadm = JoinTitle.getPlugin(JoinTitle.class).getConfig().getString("message.reload");

                JoinTitle.getPlugin(JoinTitle.class).reloadConfig();
                p.sendMessage(reloadm);

            }
        }
        return false;
    }
}
