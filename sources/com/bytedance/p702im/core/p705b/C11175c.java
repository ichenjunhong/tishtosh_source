package com.bytedance.p702im.core.p705b;

import java.util.HashMap;

/* renamed from: com.bytedance.im.core.b.c */
public final class C11175c {

    /* renamed from: a */
    private String f30163a;

    /* renamed from: b */
    private String f30164b;

    /* renamed from: c */
    private HashMap<String, Object> f30165c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, Object> f30166d = new HashMap<>();

    /* renamed from: a */
    public static C11175c m22624a() {
        return new C11175c();
    }

    /* renamed from: b */
    public final void mo20530b() {
        C11176d.m22635a(this.f30163a, this.f30164b, this.f30165c, this.f30166d);
    }

    private C11175c() {
    }

    /* renamed from: a */
    public final C11175c mo20526a(String str) {
        this.f30163a = str;
        return this;
    }

    /* renamed from: b */
    public final C11175c mo20528b(String str) {
        this.f30164b = str;
        return this;
    }

    /* renamed from: b */
    public final C11175c mo20529b(String str, Object obj) {
        this.f30166d.put(str, obj);
        return this;
    }

    /* renamed from: a */
    public final C11175c mo20527a(String str, Object obj) {
        this.f30165c.put(str, obj);
        return this;
    }
}
