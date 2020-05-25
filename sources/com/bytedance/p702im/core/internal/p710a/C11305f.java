package com.bytedance.p702im.core.internal.p710a;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.bytedance.im.core.internal.a.f */
public enum C11305f {
    COLUMN_MSG_ID("msg_uuid", "TEXT PRIMARY KEY"),
    COLUMN_SERVER_ID("msg_server_id", "BIGINT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_CONVERSATION_SHORT_ID("conversation_short_id", "BIGINT"),
    COLUMN_CONVERSATION_TYPE("conversation_type", "INTEGER"),
    COLUMN_MSG_TYPE("type", "INTEGER"),
    COLUMN_INNER_INDEX("index_in_conversation", "BIGINT"),
    COLUMN_ORDER_INDEX("order_index", "BIGINT"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_NET_STATUS("net_status", "INTEGER"),
    COLUMN_VERSION(C42311c.f106863g, "INTEGER"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_CREATE_TIME("created_time", "INTEGER"),
    COLUMN_SENDER("sender", "BIGINT"),
    COLUMN_CONTENT(C42311c.f106865i, "TEXT"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_LOCAL_INFO("local_info", "TEXT"),
    COLUMN_READ_STATUS("read_status", "INTEGER"),
    COLUMN_SEC_SENDER("sec_sender", "TEXT"),
    COLUMN_PROPERTY_LIST("property_list", "TEXT");
    
    public String key;
    public String type;

    private C11305f(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
