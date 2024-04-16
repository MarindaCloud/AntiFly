package cn.marinda.antifly;

import cn.marinda.antifly.listener.PlayerFlyListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("[AntiFly]插件已加载！");
        Bukkit.getPluginManager().registerEvents(new PlayerFlyListener(),this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[AntiFly]插件已卸载！");
        // Plugin shutdown logic
    }
}
