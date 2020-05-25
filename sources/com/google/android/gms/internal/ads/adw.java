package com.google.android.gms.internal.ads;

import java.util.Map;

final class adw extends C16292uj {

    /* renamed from: k */
    private final /* synthetic */ byte[] f40336k;

    /* renamed from: l */
    private final /* synthetic */ Map f40337l;

    /* renamed from: m */
    private final /* synthetic */ aew f40338m;

    adw(adr adr, int i, String str, bzv bzv, byx byx, byte[] bArr, Map map, aew aew) {
        this.f40336k = bArr;
        this.f40337l = map;
        this.f40338m = aew;
        super(i, str, bzv, byx);
    }

    /* renamed from: a */
    public final byte[] mo28743a() throws C15560a {
        return this.f40336k == null ? super.mo28743a() : this.f40336k;
    }

    /* renamed from: b */
    public final Map<String, String> mo28744b() throws C15560a {
        return this.f40337l == null ? super.mo28744b() : this.f40337l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28742a(String str) {
        this.f40338m.mo28764a(str);
        super.mo28741a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo28741a(Object obj) {
        mo28741a((String) obj);
    }
}
