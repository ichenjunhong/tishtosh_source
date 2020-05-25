package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16654ei;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.s */
abstract class C17223s {

    /* renamed from: a */
    private final Set<String> f48681a;

    /* renamed from: a */
    public abstract C16654ei mo33486a(Map<String, C16654ei> map);

    /* renamed from: a */
    public abstract boolean mo33487a();

    /* renamed from: b */
    public final Set<String> mo33489b() {
        return this.f48681a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33488a(Set<String> set) {
        return set.containsAll(this.f48681a);
    }
}
