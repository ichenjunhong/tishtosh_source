package com.p683ss.android.ugc.aweme.global.config.settings;

import com.bytedance.ies.C10616c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.c */
final class C32810c implements C10616c {

    /* renamed from: a */
    private Map<String, Object> f85414a = new HashMap();

    /* renamed from: b */
    private boolean f85415b = false;

    C32810c() {
    }

    /* renamed from: a */
    public final <T> T mo18837a(String str, Class<T> cls, T t) {
        if (!this.f85414a.containsKey(str) || this.f85414a.get(str) == null) {
            return null;
        }
        return this.f85414a.get(str);
    }

    /* renamed from: a */
    public final <T> List<T> mo18838a(String str, Class<T> cls, List<T> list) {
        if (!this.f85414a.containsKey(str) || this.f85414a.get(str) == null) {
            return null;
        }
        return (List) this.f85414a.get(str);
    }
}
