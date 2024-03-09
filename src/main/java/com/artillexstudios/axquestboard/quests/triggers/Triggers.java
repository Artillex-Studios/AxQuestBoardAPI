package com.artillexstudios.axquestboard.quests.triggers;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class Triggers {
    private static final HashMap<String, BaseTrigger> triggers = new HashMap<>();

    public static void registerTrigger(@NotNull BaseTrigger trigger) {
        triggers.put(trigger.getName(), trigger);
    }

    public static void unRegisterTrigger(@NotNull String name) {
        triggers.remove(name);
    }

    public static BaseTrigger getTriggerByName(String name) {
        return triggers.get(name);
    }

    public static void run(@NotNull Player player, @NotNull BaseTrigger trigger, @Nullable String extra, double amount) {
    }

    public static HashMap<String, BaseTrigger> getTriggers() {
        return triggers;
    }
}
