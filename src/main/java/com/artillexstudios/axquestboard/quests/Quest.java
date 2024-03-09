package com.artillexstudios.axquestboard.quests;

import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.block.implementation.Section;
import com.artillexstudios.axapi.utils.ItemBuilder;
import com.artillexstudios.axquestboard.quests.triggers.BaseTrigger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class Quest {
    private String id;
    private String title;
    private ItemBuilder builder;
    private Section section;
    private double chance;
    private int winPoints;
    private int winAmount;
    private long required;
    private BaseTrigger trigger;
    private @Nullable String extra;
    private boolean preventCheating;

    public Quest(String id, @NotNull Section section) {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ItemBuilder getBuilder() {
        return builder;
    }

    public Section getSection() {
        return section;
    }

    public double getChance() {
        return chance;
    }

    public int getWinPoints() {
        return winPoints;
    }

    public int getWinAmount() {
        return winAmount;
    }

    public long getRequired() {
        return required;
    }

    public BaseTrigger getTrigger() {
        return trigger;
    }

    @Nullable
    public String getExtra() {
        return extra;
    }

    public boolean shouldPreventCheating() {
        return preventCheating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quest quest = (Quest) o;
        return Objects.equals(id, quest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
