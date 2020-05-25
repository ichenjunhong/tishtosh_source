package com.p683ss.android.ugc.aweme.base.livedata;

import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.livedata.a */
public final class C23552a {

    /* renamed from: a */
    private final Map<String, C23275b<Object>> f62676a;

    /* renamed from: com.ss.android.ugc.aweme.base.livedata.a$a */
    static class C23554a {

        /* renamed from: a */
        public static final C23552a f62677a = new C23552a();
    }

    /* renamed from: a */
    public static C23552a m57751a() {
        return C23554a.f62677a;
    }

    private C23552a() {
        this.f62676a = new HashMap();
    }

    /* renamed from: a */
    public final C23275b<Object> mo48723a(String str) {
        return mo48724a(str, Object.class);
    }

    /* renamed from: b */
    public final void mo48725b(String str) {
        this.f62676a.remove(str);
    }

    /* renamed from: a */
    public final synchronized <T> C23275b<T> mo48724a(String str, Class<T> cls) {
        if (!this.f62676a.containsKey(str)) {
            this.f62676a.put(str, new C23275b());
        }
        return (C23275b) this.f62676a.get(str);
    }
}
