package com.facebook.login;

/* renamed from: com.facebook.login.a */
public enum C14503a {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    

    /* renamed from: a */
    private final String f37682a;

    public final String getNativeProtocolAudience() {
        return this.f37682a;
    }

    private C14503a(String str) {
        this.f37682a = str;
    }
}
