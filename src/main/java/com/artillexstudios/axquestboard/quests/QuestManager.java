package com.artillexstudios.axquestboard.quests;

import com.artillexstudios.axquestboard.api.events.QuestActivationEvent;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class QuestManager {
    private static final HashMap<Integer, ActiveQuest> activeQuests = new HashMap<>();

    @NotNull
    public static ActiveQuest activateQuest(int slot, Quest quest, long started, boolean active) {
        final ActiveQuest activeQuest = new ActiveQuest(quest, started, slot, active);
        activeQuests.put(slot, activeQuest);

        final QuestActivationEvent apiEvent = new QuestActivationEvent(slot, activeQuest, started, active);
        Bukkit.getPluginManager().callEvent(apiEvent);
        return activeQuest;
    }

    public static HashMap<Integer, ActiveQuest> getActiveQuests() {
        return activeQuests;
    }
}
