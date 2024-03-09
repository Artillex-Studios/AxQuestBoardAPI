package com.artillexstudios.axquestboard.quests;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class QuestPlayer implements Comparable<QuestPlayer> {
    private final OfflinePlayer player;
    public QuestPlayer(@NotNull OfflinePlayer player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestPlayer that = (QuestPlayer) o;
        return Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player);
    }

    public OfflinePlayer getPlayer() {
        return player;
    }

    @Override
    public int compareTo(@NotNull QuestPlayer o) {
        return player.getUniqueId().compareTo(o.getPlayer().getUniqueId());
    }
}
