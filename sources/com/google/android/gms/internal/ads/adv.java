package com.google.android.gms.internal.ads;

final class adv implements byx {

    /* renamed from: a */
    private final /* synthetic */ String f40334a;

    /* renamed from: b */
    private final /* synthetic */ ady f40335b;

    adv(adr adr, String str, ady ady) {
        this.f40334a = str;
        this.f40335b = ady;
    }

    /* renamed from: a */
    public final void mo28740a(C15812cq cqVar) {
        String str = this.f40334a;
        String cqVar2 = cqVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(cqVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(cqVar2);
        abv.m32798e(sb.toString());
        this.f40335b.mo28745a(null);
    }
}
