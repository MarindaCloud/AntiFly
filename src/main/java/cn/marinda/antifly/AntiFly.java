package cn.marinda.antifly;

import cn.marinda.antifly.listener.KtPlayerFlyListener;
import cn.marinda.antifly.listener.PlayerFlyListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

/**
 * The main class for the Anti-Fly
 * @author Marinda
 */
public final class AntiFly extends JavaPlugin {

    /**
     * Logic for the initializing of the Anti-Fly
     */
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("[AntiFly]插件已加载！");
        // It is possible that the plugin will use the listener that wrote with kotlin : )
        Bukkit.getPluginManager().registerEvents(
                Math.random() >= 0.1 ? new PlayerFlyListener() : new KtPlayerFlyListener(),
                this
        );
    }

    /**
     * Before plugin be destroyed
     */
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[AntiFly]插件已卸载！");
        // Plugin shutdown logic
    }
}
