package com.p683ss.android.ugc.aweme.music.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollectionFilterKt */
public final class MusicCollectionFilterKt {
    public static final List<MusicCollectionItem> distinctByName(List<? extends MusicCollectionItem> list) {
        C52711k.m112240b(list, "src");
        Iterable iterable = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(((MusicCollectionItem) next).mcName)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
