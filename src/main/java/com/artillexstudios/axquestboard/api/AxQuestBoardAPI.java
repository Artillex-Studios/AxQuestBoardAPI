package com.artillexstudios.axquestboard.api;

import com.artillexstudios.axquestboard.quests.ActiveQuest;
import com.artillexstudios.axquestboard.quests.Quest;
import com.artillexstudios.axquestboard.quests.triggers.BaseTrigger;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class AxQuestBoardAPI {

    @NotNull
    public static Collection<ActiveQuest> getActiveQuests() {
        return null;
    }

    @NotNull
    public static Collection<Quest> getQuestTypes() {
        return null;
    }

    public static void registerNewTrigger(@NotNull BaseTrigger trigger) {
    }

    public static void unRegisterNewTrigger(@NotNull BaseTrigger trigger) {
    }

    public static void unRegisterNewTrigger(@NotNull String name) {
    }

    public static int getBoardRows() {
        return -1;
    }

    @NotNull
    public static List<Integer> getQuestSlots() {
        return null;
    }

    public static CompletableFuture<Integer> getQuestPoints(@NotNull UUID uuid) {
        return null;
    }

    @NotNull
    public static CompletableFuture<Boolean> setQuestPoints(@NotNull UUID uuid, int amount) {
        return null;
    }

    @NotNull
    public static CompletableFuture<Boolean> giveQuestPoints(@NotNull UUID uuid, int amount) {
        return null;
    }

    @NotNull
    public static CompletableFuture<Boolean> takeQuestPoints(@NotNull UUID uuid, int amount) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public static int getPoints(@NotNull UUID uuid) {
        return -1;
    }

    @Deprecated(forRemoval = true)
    public static void setPoints(@NotNull UUID uuid, int amount) {
    }

    @Deprecated(forRemoval = true)
    public static void modifyPoints(@NotNull UUID uuid, int amount) {
    }

    @Deprecated(forRemoval = true)
    public static void setPointsAsync(@NotNull UUID uuid, int amount) {
    }

    @Deprecated(forRemoval = true)
    public static void modifyPointsAsync(@NotNull UUID uuid, int amount) {
    }
}
