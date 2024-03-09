package com.artillexstudios.axquestboard.api.events;

import com.artillexstudios.axquestboard.quests.ActiveQuest;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class QuestCompletionEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final int slot;
    private final ActiveQuest activeQuest;
    private final Player winner;

    public QuestCompletionEvent(int slot, ActiveQuest activeQuest, Player winner) {
        super(!Bukkit.isPrimaryThread());

        this.slot = slot;
        this.activeQuest = activeQuest;
        this.winner = winner;
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

    public Player getWinner() {
        return winner;
    }
}
