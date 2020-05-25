package org.greenrobot.eventbus.p2694a;

import org.greenrobot.eventbus.C53773o;

/* renamed from: org.greenrobot.eventbus.a.b */
public final class C53750b extends C53749a {

    /* renamed from: a */
    private final C53753e[] f133297a;

    /* renamed from: c */
    public final synchronized C53773o[] mo112952c() {
        C53773o[] oVarArr;
        int length = this.f133297a.length;
        oVarArr = new C53773o[length];
        for (int i = 0; i < length; i++) {
            C53753e eVar = this.f133297a[i];
            oVarArr[i] = mo112950a(eVar.f133298a, eVar.f133300c, eVar.f133299b, eVar.f133301d, eVar.f133302e);
        }
        return oVarArr;
    }

    public C53750b(Class cls, boolean z, C53753e[] eVarArr) {
        super(cls, null, true);
        this.f133297a = eVarArr;
    }
}
