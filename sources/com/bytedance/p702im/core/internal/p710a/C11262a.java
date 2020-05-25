package com.bytedance.p702im.core.internal.p710a;

/* renamed from: com.bytedance.im.core.internal.a.a */
enum C11262a {
    COLUMN_UUID("uuid", "TEXT NOT NULL"),
    COLUMN_LOCAL_URI("local_uri", "TEXT"),
    COLUMN_REMOTE_URI("remote_uri", "TEXT"),
    COLUMN_SIZE("size", "BIGINT"),
    COLUMN_TYPE("type", "TEXT"),
    COLUMN_HASH("hash", "TEXT"),
    COLUMN_INDEX("position", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
    COLUMN_MIME_TYPE("mime_type", "TEXT");
    

    /* renamed from: l */
    public String f30346l;

    /* renamed from: m */
    public String f30347m;

    private C11262a(String str, String str2) {
        this.f30346l = str;
        this.f30347m = str2;
    }
}
