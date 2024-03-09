package com.artillexstudios.axquestboard.api.events;

import com.artillexstudios.axquestboard.quests.ActiveQuest;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class QuestActivationEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final int slot;
    private final ActiveQuest activeQuest;
    private final long started;
    private final boolean active;

    public QuestActivationEvent(int slot, ActiveQuest activeQuest, long started, boolean active) {
        super(!Bukkit.isPrimaryThread());

        this.slot = slot;
        this.activeQuest = activeQuest;
        this.started = started;
        this.active = active;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }


    public int getSlot() {
        return slot;
    }

    public ActiveQuest getActiveQuest() {
        return activeQuest;
    }

    public long getStarted() {
        return started;
    }

    public boolean isActive() {
        return active;
    }
}
