package com.artillexstudios.axquestboard;

import com.artillexstudios.axapi.AxPlugin;
import com.artillexstudios.axapi.config.Config;
import com.artillexstudios.axapi.data.ThreadedQueue;
import com.artillexstudios.axapi.utils.MessageUtils;
import com.artillexstudios.axquestboard.database.Database;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public final class AxQuestBoard extends AxPlugin {
    public static Config CONFIG;
    public static Config LANG;
    public static Config GUIS;
    public static Config QUESTS;
    public static MessageUtils MESSAGEUTILS;
    private static AxPlugin instance;
    private static ThreadedQueue<Runnable> threadedQueue;
    private static Database database;
    public static BukkitAudiences BUKKITAUDIENCES;

    public static ThreadedQueue<Runnable> getThreadedQueue() {
        return threadedQueue;
    }

    public static Database getDatabase() {
        return database;
    }

    public static AxPlugin getInstance() {
        return instance;
    }
}