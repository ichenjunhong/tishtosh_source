package com.bytedance.p702im.core.internal.p710a;

import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.im.core.internal.a.c */
enum C11274c {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_NAME(LeakCanaryFileProvider.f132049i, "TEXT"),
    COLUMN_DESC("desc", "TEXT"),
    COLUMN_ICON("icon", "TEXT"),
    COLUMN_NOTICE("notice", "TEXT"),
    COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
    COLUMN_SEC_OWNER("sec_owner", "TEXT"),
    COLUMN_EXT("ext", "TEXT");
    

    /* renamed from: j */
    public String f30373j;

    /* renamed from: k */
    public String f30374k;

    private C11274c(String str, String str2) {
        this.f30373j = str;
        this.f30374k = str2;
    }
}
