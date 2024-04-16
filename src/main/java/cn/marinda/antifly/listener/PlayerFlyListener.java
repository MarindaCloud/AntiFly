package cn.marinda.antifly.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerFlyListener implements Listener {


    @EventHandler
    public void onPlayerControlEvent(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if(player.isFlying()){
            player.setFlying(false);
            player.sendMessage("[AntiFly]检测到非法飞行，已禁止飞行！");
        }
    }
}
