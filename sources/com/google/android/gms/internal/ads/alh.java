package com.google.android.gms.internal.ads;

import android.net.Uri;

@C16299uq
public final class alh extends all {

    /* renamed from: f */
    private final String f40848f;

    public alh(aib aib, String str) {
        super(aib);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bii mo29109c(String str) {
        bkm bkr = new bkr(this.f40782a, this.f40783b);
        bjc bjc = new bjc(Uri.parse(str), ((Boolean) caf.m37099d().mo30717a(C15740bx.f44358cm)).booleanValue() ? new aje(this.f40782a, bkr, new ali(this)) : bkr, "video/webm".equals(this.f40848f) ? new bkd() : new bjr(), 2, ((Integer) caf.m37099d().mo30717a(C15740bx.f44489s)).intValue());
        return bjc;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29108a(boolean z, long j) {
        aib aib = (aib) this.f40784c.get();
        if (aib != null) {
            agf.f40430a.execute(new alj(aib, z, j));
        }
    }
}
