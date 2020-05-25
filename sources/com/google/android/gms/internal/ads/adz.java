package com.google.android.gms.internal.ads;

import java.util.Map;

public final class adz extends brw<bpz> {

    /* renamed from: k */
    private final agl<bpz> f40339k;

    /* renamed from: l */
    private final Map<String, String> f40340l;

    /* renamed from: m */
    private final aew f40341m;

    public adz(String str, agl<bpz> agl) {
        this(str, null, agl);
    }

    private adz(String str, Map<String, String> map, agl<bpz> agl) {
        super(0, str, new aea(agl));
        this.f40340l = null;
        this.f40339k = agl;
        this.f40341m = new aew();
        this.f40341m.mo28765a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxw<bpz> mo28746a(bpz bpz) {
        return bxw.m36976a(bpz, C16107nn.m38101a(bpz));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo28741a(Object obj) {
        bpz bpz = (bpz) obj;
        aew aew = this.f40341m;
        Map<String, String> map = bpz.f43519c;
        int i = bpz.f43517a;
        if (aew.m32775b()) {
            aew.mo28768a(map, i);
            if (i < 200 || i >= 300) {
                aew.mo28770b(null);
            }
        }
        aew aew2 = this.f40341m;
        byte[] bArr = bpz.f43518b;
        if (aew.m32775b() && bArr != null) {
            aew2.mo28769a(bArr);
        }
        this.f40339k.mo28823b(bpz);
    }
}
