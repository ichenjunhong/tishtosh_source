package com.bytedance.p702im.core.internal.p710a;

/* renamed from: com.bytedance.im.core.internal.a.d */
enum C11303d {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_STICK_TOP("stick_top", "INTEGER"),
    COLUMN_MUTE("mute", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_FAVORITE("favor", "INTEGER");
    

    /* renamed from: g */
    public String f30409g;

    /* renamed from: h */
    public String f30410h;

    private C11303d(String str, String str2) {
        this.f30409g = str;
        this.f30410h = str2;
    }
}
