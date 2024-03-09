package com.artillexstudios.axquestboard.quests;

import com.artillexstudios.axquestboard.utils.ScoreMap;
import com.google.common.collect.Ordering;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ActiveQuest {
    private final String questId;
    private long started;
    private final int slot;
    private final ScoreMap<QuestPlayer, Double> scores = new ScoreMap<>(Ordering.natural().reverse());
    private boolean active;
    private boolean hidden;

    public ActiveQuest(@NotNull Quest quest, long started, int slot, boolean active) {
        this.questId = quest.getId();
        this.started = started;
        this.slot = slot;
        this.active = active;
        this.hidden = !Quests.getQuestSlots().contains(slot);
    }

    public Quest getQuest() {
        return Quests.getQuestsId().get(questId);
    }

    public String getQuestId() {
        return questId;
    }

    public void tick() {
    }

    public void increase(@NotNull Player player, double amount) {
    }

    public void decrease(@NotNull Player player, double amount) {
    }

    public boolean isActive() {
        return active;
    }

    public long getStarted() {
        return started;
    }

    public long getRefreshTime() {
        return 0;
    }

    public int getSlot() {
        return slot;
    }

    public ScoreMap<QuestPlayer, Double> getScores() {
        return scores;
    }

    public void setHidden(boolean hidden) {
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setStarted(long started) {
        this.started = started;
    }
}
