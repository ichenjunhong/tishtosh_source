package com.bytedance.ies.bullet.kit.web;

import com.bytedance.ies.bullet.p628b.p633e.p635b.C10280b;
import com.bytedance.ies.bullet.p628b.p633e.p635b.C10281c;
import com.bytedance.ies.bullet.p628b.p633e.p635b.C10282d;
import java.util.Map;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.bullet.kit.web.b */
public final class C10491b extends C10281c<C10491b> {

    /* renamed from: a */
    public final C10280b<Boolean> f27881a;

    /* renamed from: b */
    public final C10280b<Boolean> f27882b;

    public C10491b() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final Map<String, C10280b<?>> mo18323a() {
        return C52550ab.m112050a(C52856t.m112465a("hardwareAcceleration", this.f27881a), C52856t.m112465a("longClickable", this.f27882b));
    }

    private C10491b(Boolean bool, Boolean bool2) {
        this.f27881a = new C10282d(bool, false, 2, null);
        this.f27882b = new C10282d(bool2, false, 2, null);
    }

    public /* synthetic */ C10491b(Boolean bool, Boolean bool2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        this(bool, null);
    }
}
