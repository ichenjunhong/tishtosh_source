package com.p683ss.android.ugc.aweme.discover.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.NearbySearchHistoryManager */
public final class NearbySearchHistoryManager extends SearchHistoryManager {
    public static final NearbySearchHistoryManager INSTANCE = new NearbySearchHistoryManager();
    private static String KEY_RECENT_HISTORY_NEARBY = "recent_history_nearby";

    private NearbySearchHistoryManager() {
    }

    public final String getKEY_RECENT_HISTORY_NEARBY() {
        return KEY_RECENT_HISTORY_NEARBY;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return KEY_RECENT_HISTORY_NEARBY;
    }

    public final void setKEY_RECENT_HISTORY_NEARBY(String str) {
        C52711k.m112240b(str, "<set-?>");
        KEY_RECENT_HISTORY_NEARBY = str;
    }
}
