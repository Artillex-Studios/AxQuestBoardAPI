package com.artillexstudios.axquestboard.quests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quests {
    private static List<Integer> questSlots = new ArrayList<>();
    private static Integer rows = null;
    private static final HashMap<String, Quest> questsId = new HashMap<>();

    public static void reload() {
    }

    public static void resize() {
    }

    public static Quest getRandomQuest() {
        return null;
    }

    public static List<Integer> getQuestSlots() {
        return questSlots;
    }

    public static HashMap<String, Quest> getQuestsId() {
        return questsId;
    }

    public static int getRows() {
        return rows;
    }
}
