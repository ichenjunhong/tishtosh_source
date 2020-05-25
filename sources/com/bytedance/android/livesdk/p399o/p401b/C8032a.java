package com.bytedance.android.livesdk.p399o.p401b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.a */
public abstract class C8032a<T> implements C8038g<T> {

    /* renamed from: a */
    private final Map<String, String> f21978a = new HashMap();

    /* renamed from: a */
    public final Map<String, String> mo14192a() {
        return this.f21978a;
    }

    /* renamed from: a */
    public final void mo14193a(String str) {
        this.f21978a.remove(str);
    }

    /* renamed from: a */
    public void mo14195a(Map<String, String> map) {
        map.putAll(this.f21978a);
    }

    /* renamed from: a */
    public final void mo14194a(String str, String str2) {
        this.f21978a.put(str, str2);
    }

    /* renamed from: a */
    public void mo14196a(Map<String, String> map, T t) {
        map.putAll(this.f21978a);
    }
}
