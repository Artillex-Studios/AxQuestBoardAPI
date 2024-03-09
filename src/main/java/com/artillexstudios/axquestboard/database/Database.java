package com.artillexstudios.axquestboard.database;

import com.artillexstudios.axquestboard.quests.ActiveQuest;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface Database {

    String getType();

    void setup();

    void addUser(@NotNull Player player);

    int getUserId(@NotNull UUID uuid);

    UUID getUserById(int id);

    int getPoints(@NotNull UUID uuid);

    void setPoints(@NotNull UUID uuid, int amount);

    void modifyPoints(@NotNull UUID uuid, int amount);

    void saveQuest(@NotNull ActiveQuest quest);

    void saveScores(@NotNull ActiveQuest quest);

    void addQuest(@NotNull ActiveQuest quest);

    void loadData();

    void disable();
}
