package com.bytedance.p702im.core.internal.p710a;

/* renamed from: com.bytedance.im.core.internal.a.e */
enum C11304e {
    COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_IDS_STR("ids_str", "TEXT"),
    COLUMN_SENDER_ID("sender_id", "BIGINT"),
    COLUMN_CREATED_TIME("created_time", "INTEGER");
    

    /* renamed from: f */
    public String f30417f;

    /* renamed from: g */
    public String f30418g;

    private C11304e(String str, String str2) {
        this.f30417f = str;
        this.f30418g = str2;
    }
}
