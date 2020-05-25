package com.p683ss.android.ugc.aweme.discover.model;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSpotCons */
public final class HotSpotCons {
    public static final HotSpotCons INSTANCE = new HotSpotCons();
    private static final int TYPE_HISTORY = 11;
    private static final int TYPE_LIST = 1;
    private static final int TYPE_NEARBY = 9;
    private static final int TYPE_RISING = 2;
    private static final int TYPE_TOPIC = 3;

    private HotSpotCons() {
    }

    public final int getTYPE_HISTORY() {
        return TYPE_HISTORY;
    }

    public final int getTYPE_LIST() {
        return TYPE_LIST;
    }

    public final int getTYPE_NEARBY() {
        return TYPE_NEARBY;
    }

    public final int getTYPE_NORMAL() {
        return 0;
    }

    public final int getTYPE_RISING() {
        return TYPE_RISING;
    }

    public final int getTYPE_TOPIC() {
        return TYPE_TOPIC;
    }
}
