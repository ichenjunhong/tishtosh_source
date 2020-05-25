package com.google.android.gms.internal.ads;

final class alm implements ail {

    /* renamed from: a */
    private final /* synthetic */ all f40857a;

    alm(all all) {
        this.f40857a = all;
    }

    /* renamed from: a */
    public final void mo28978a(String str, String str2) {
        all all = this.f40857a;
        String str3 = "ExoPlayer caching failed. Type: ";
        String valueOf = String.valueOf(str);
        all.f40854e = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length());
        sb.append("ExoPlayer failed during precache: ");
        sb.append(str);
        sb.append(" Exception: ");
        sb.append(str2);
        abv.m32798e(sb.toString());
        this.f40857a.mo29088a();
    }
}
