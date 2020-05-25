package com.p683ss.android.ugc.aweme.utils;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.utils.dw */
public final class C47832dw {

    /* renamed from: a */
    private ConcurrentHashMap<String, Boolean> f120391a;

    /* renamed from: com.ss.android.ugc.aweme.utils.dw$a */
    static class C47834a {

        /* renamed from: a */
        public static final C47832dw f120392a = new C47832dw();
    }

    /* renamed from: a */
    public static C47832dw m103471a() {
        return C47834a.f120392a;
    }

    private C47832dw() {
        this.f120391a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final boolean mo95066a(C47831dv dvVar) {
        if (this.f120391a.get(dvVar.getName()) != null && ((Boolean) this.f120391a.get(dvVar.getName())).booleanValue()) {
            return false;
        }
        this.f120391a.put(dvVar.getName(), Boolean.valueOf(true));
        return true;
    }
}
