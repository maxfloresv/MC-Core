package cl.max.core.events;

import cl.max.core.config.MessagesConfig;
import cl.max.core.utils.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String join_msg = MessagesConfig.get().getString("join_msg")
                .replace("%player%", player.getDisplayName());

        event.setJoinMessage(StringUtils.colorize(join_msg));
    }
}