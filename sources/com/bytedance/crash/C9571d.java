package com.bytedance.crash;

/* renamed from: com.bytedance.crash.d */
public enum C9571d {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");
    

    /* renamed from: a */
    private String f26109a;

    public final String getName() {
        return this.f26109a;
    }

    private C9571d(String str) {
        this.f26109a = str;
    }
}
