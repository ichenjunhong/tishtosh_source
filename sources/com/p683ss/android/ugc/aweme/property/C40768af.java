package com.p683ss.android.ugc.aweme.property;

import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.af */
public final class C40768af implements C40762a {

    /* renamed from: a */
    public final String f103865a;

    /* renamed from: b */
    private final C52670a<Boolean> f103866b;

    /* renamed from: c */
    private final C52671b<Boolean, C52860x> f103867c;

    public final String key() {
        return this.f103865a;
    }

    public final boolean supportPersist() {
        return true;
    }

    public final C40763b type() {
        return C40763b.Boolean;
    }

    public final Object defValue() {
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public final boolean mo83089a() {
        return ((Boolean) this.f103866b.invoke()).booleanValue();
    }

    /* renamed from: a */
    public final void mo83088a(boolean z) {
        C52671b<Boolean, C52860x> bVar = this.f103867c;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(z));
        }
    }

    public C40768af(String str, C52670a<Boolean> aVar, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(aVar, "valueProvider");
        this.f103865a = str;
        this.f103866b = aVar;
        this.f103867c = bVar;
    }
}
