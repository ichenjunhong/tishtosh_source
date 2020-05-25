package com.bytedance.p702im.core.internal.p710a;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.bytedance.im.core.internal.a.g */
public enum C11306g {
    COLUMN_MSG_UUID("msg_uuid", "TEXT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_KEY("key", "TEXT"),
    COLUMN_IDEMPOTENT_ID("idempotent_id", "TEXT"),
    COLUMN_SENDER("sender", "INTEGER"),
    COLUMN_SENDER_SEC("sender_sec", "TEXT"),
    COLUMN_CREATE_TIME("create_time", "INTEGER"),
    COLUMN_VALUE("value", "TEXT"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_VERSION(C42311c.f106863g, "INTEGER"),
    COLUMN_STATUS("status", "INTEGER");
    
    public String key;
    public String type;

    private C11306g(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
