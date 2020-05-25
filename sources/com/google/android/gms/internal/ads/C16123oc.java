package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oc */
final class C16123oc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16121oa f45338a;

    /* renamed from: b */
    private final /* synthetic */ C16122ob f45339b;

    C16123oc(C16122ob obVar, C16121oa oaVar) {
        this.f45339b = obVar;
        this.f45338a = oaVar;
    }

    public final void run() {
        synchronized (this.f45339b.f45319b) {
            if (this.f45339b.f45321d == -2) {
                this.f45339b.f45320c = this.f45339b.mo31226b();
                if (this.f45339b.f45320c == null) {
                    this.f45339b.mo31224a(4);
                } else if (!this.f45339b.mo31228c() || this.f45339b.mo31227b(1)) {
                    C16121oa oaVar = this.f45338a;
                    C16122ob obVar = this.f45339b;
                    synchronized (oaVar.f45315a) {
                        oaVar.f45316b = obVar;
                    }
                    C16122ob.m38166a(this.f45339b, this.f45338a);
                } else {
                    String str = this.f45339b.f45318a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(str);
                    sb.append(" as delayed impression is not supported");
                    abv.m32798e(sb.toString());
                    this.f45339b.mo31224a(2);
                }
            }
        }
    }
}
