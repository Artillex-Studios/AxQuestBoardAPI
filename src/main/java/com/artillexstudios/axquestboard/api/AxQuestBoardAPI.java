package com.artillexstudios.axquestboard.api;

import com.artillexstudios.axquestboard.quests.ActiveQuest;
import com.artillexstudios.axquestboard.quests.Quest;
import com.artillexstudios.axquestboard.quests.triggers.BaseTrigger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class AxQuestBoardAPI {

    public Collection<ActiveQuest> getActiveQuests() {
        return new ArrayList<>();
    }

    public Collection<Quest> getQuestTypes() {
        return new ArrayList<>();
    }

    public void registerNewTrigger(@NotNull BaseTrigger trigger) {
    }

    public void unRegisterNewTrigger(@NotNull BaseTrigger trigger) {
    }

    public void unRegisterNewTrigger(@NotNull String name) {
    }

    public static int getBoardRows() {
        return 1;
    }

    public static List<Integer> getQuestSlots() {
        return new ArrayList<>();
    }

    public static int getPoints(@NotNull UUID uuid) {
        return 0;
    }

    public static void setPoints(@NotNull UUID uuid, int amount) {
    }

    public static void modifyPoints(@NotNull UUID uuid, int amount) {
    }

    public static void setPointsAsync(@NotNull UUID uuid, int amount) {
    }

    public static void modifyPointsAsync(@NotNull UUID uuid, int amount) {
    }
}
