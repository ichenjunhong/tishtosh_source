package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h */
public enum C21848h {
    NONE(-1),
    SIGN_UP(0),
    LOGIN(1),
    SET_OR_RESET_PASSWORD(2),
    BIND_PHONE(3),
    MODIFY_PHONE(4),
    RECOVER_ACCOUNT(5),
    CHANGE_PASSWORD(9),
    BIND_EMAIL(6),
    VERIFY(7),
    CHANGE_EMAIL(8);
    
    public static final C21849a Companion = null;
    public static final Map<Integer, C21848h> VALUES_MAP = null;

    /* renamed from: b */
    private final int f59137b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h$a */
    public static final class C21849a {
        private C21849a() {
        }

        public /* synthetic */ C21849a(C52707g gVar) {
            this();
        }
    }

    public final int getValue() {
        return this.f59137b;
    }

    static {
        int i;
        Companion = new C21849a(null);
        C21848h[] values = values();
        Map<Integer, C21848h> linkedHashMap = new LinkedHashMap<>(C52753d.m112321c(C52550ab.m112044a(values.length), 16));
        for (C21848h hVar : values) {
            linkedHashMap.put(Integer.valueOf(hVar.f59137b), hVar);
        }
        VALUES_MAP = linkedHashMap;
    }

    private C21848h(int i) {
        this.f59137b = i;
    }
}
