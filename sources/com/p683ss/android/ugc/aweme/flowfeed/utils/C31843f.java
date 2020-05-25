package com.p683ss.android.ugc.aweme.flowfeed.utils;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.f */
public final class C31843f {

    /* renamed from: a */
    private Map<String, C31842e> f83211a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.f$a */
    static class C31844a {

        /* renamed from: a */
        public static final C31843f f83212a = new C31843f();
    }

    /* renamed from: a */
    public static C31843f m74206a() {
        return C31844a.f83212a;
    }

    /* renamed from: b */
    public final boolean mo64953b() {
        if (this.f83211a.isEmpty()) {
            return false;
        }
        for (C31842e eVar : this.f83211a.values()) {
            if (eVar.f83202c.mo95019c(16777216)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64952b(String str) {
        if (!this.f83211a.isEmpty()) {
            this.f83211a.remove(str);
        }
    }

    /* renamed from: c */
    public final C31842e mo64954c(String str) {
        if (this.f83211a.isEmpty()) {
            return null;
        }
        return (C31842e) this.f83211a.get(str);
    }

    /* renamed from: a */
    public final void mo64950a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f83211a.clear();
        }
        Iterator it = this.f83211a.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo64951a(String str, C31842e eVar) {
        this.f83211a.put(str, eVar);
    }
}
