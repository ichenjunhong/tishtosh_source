package com.bytedance.crash.p551k.p552a;

import android.content.Context;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p551k.C9644d;
import com.bytedance.crash.p555n.C9694f;
import com.bytedance.crash.p555n.C9710q;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.k.a.l */
final class C9635l extends C9622c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17453a() {
        return false;
    }

    /* renamed from: b */
    public final int mo17466b() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo17469d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17467c(C9584a aVar) {
        JSONArray a = C9644d.m19236a(aVar.f26143c);
        if (a == null || a.length() <= 0) {
            super.mo17467c(aVar);
        } else {
            aVar.mo17395a("logcat", (Object) a);
        }
    }

    /* renamed from: a */
    public final C9584a mo17464a(int i, C9584a aVar) {
        C9584a a = super.mo17464a(i, aVar);
        switch (i) {
            case 0:
                C9586c a2 = C9586c.m19047a(this.f26271b);
                a2.mo17410a(C9616k.m19147a().mo17446a());
                a.mo17387a(a2);
                C9710q.m19416a(a, a2, this.f26270a);
                break;
            case 1:
                C9586c e = a.mo17406e();
                e.mo17409a(C9616k.m19151c().mo17507a());
                e.mo17408a(C9616k.m19147a().mo17451f());
                break;
            case 2:
                C9586c.m19049a(a.mo17406e());
                StringBuilder sb = new StringBuilder("fd:");
                sb.append(C9694f.m19344b());
                a.mo17391a(sb.toString(), C9694f.m19342a());
                C9694f.m19345c();
                break;
        }
        return a;
    }

    C9635l(Context context, C9619b bVar, C9624d dVar) {
        super(C9571d.NATIVE, context, bVar, dVar);
    }
}
