package com.bytedance.p702im.core.internal.p710a;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.bytedance.im.core.internal.a.j */
enum C11309j {
    COLUMN_MSG_ID("property_uuid", "TEXT PRIMARY KEY"),
    COLUMN_SERVER_ID("property_server_id", "BIGINT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_TARGET_MSG_ID("target_msg_uuid", "TEXT NOT NULL"),
    COLUMN_PROPERTY_TYPE("property_type", "INTEGER"),
    COLUMN_MSG_TYPE("msg_type", "INTEGER"),
    COLUMN_INNER_INDEX("index_in_msg", "BIGINT"),
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
    COLUMN_PRORERTY_ID("property_id", "INTEGER"),
    COLUMN_PRORERTY_NAME("property_name", "TEXT"),
    COLUMN_REACTION_STATUS("reaction_status", "INTEGER");
    

    /* renamed from: u */
    public String f30459u;

    /* renamed from: v */
    public String f30460v;

    private C11309j(String str, String str2) {
        this.f30459u = str;
        this.f30460v = str2;
    }
}
