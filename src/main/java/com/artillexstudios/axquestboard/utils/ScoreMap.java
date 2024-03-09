package com.artillexstudios.axquestboard.utils;

import com.google.common.base.Functions;
import com.google.common.collect.Ordering;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.TreeMap;

public class ScoreMap<K extends Comparable<K>, V> extends TreeMap<K, V> {
    private final HashMap<K, V> map;

    public ScoreMap(final Ordering<? super V> partialValueOrdering) {
        this(partialValueOrdering, new HashMap<>());
    }

    private ScoreMap(@NotNull Ordering<? super V> partialValueOrdering, HashMap<K, V> map) {
        super(partialValueOrdering.onResultOf(Functions.forMap(map)).compound(Ordering.natural()));
        this.map = map;
    }

    public V put(K k, V v) {
        if (map.containsKey(k)) {
            remove(k);
        }
        map.put(k, v);
        return super.put(k, v);
    }

    public boolean containsKey(K k) {
        return map.containsKey(k);
    }

    public V get(K k) {
        return map.get(k);
    }

    public void clear() {
        map.clear();
        super.clear();
    }
}
