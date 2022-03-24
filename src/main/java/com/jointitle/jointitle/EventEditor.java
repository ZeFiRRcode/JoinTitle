package com.jointitle.jointitle;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventEditor implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        String title1 = JoinTitle.getPlugin(JoinTitle.class).getConfig().getString("message.title1");
        String title2 = JoinTitle.getPlugin(JoinTitle.class).getConfig().getString("message.title2");

        p.sendTitle(title1, title2);

    }

}
