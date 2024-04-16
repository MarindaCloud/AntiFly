package cn.marinda.antifly.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

/**
 * The main class for the Anti-Fly, but kotlin
 * @author LovelyCat
 */
class KtPlayerFlyListener : Listener {
    /**
     * When player is moving, the method will be called immediately
     * @param event PlayerMoveEvent
     */
    @EventHandler
    fun onPlayerControlEvent(event: PlayerMoveEvent) {
        with(event.player) {
            if (this.isFlying) {
                this.isFlying = false
                this.sendMessage("[AntiFly]检测到非法飞行，已禁止飞行！")
            }
        }
    }
}