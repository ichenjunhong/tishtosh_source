package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.b.c */
public enum C34385c {
    COLUMN_UID("UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR("IS_DISABLE_SHOW_FOLLOW_BAR", "INTEGER NOT NULL"),
    COLUMN_IS_SAY_HELLO_LOGGER("IS_SAY_HELLO_LOGGER", "INTEGER NOT NULL");
    
    public String key;
    public String type;

    private C34385c(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
