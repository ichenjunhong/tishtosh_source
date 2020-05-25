package com.p683ss.android.ugc.aweme.video;

import com.toutiao.proxyserver.p2609a.C51797b;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.af */
public final class C47985af {

    /* renamed from: f */
    public static final C47986a f120619f = new C47986a(null);

    /* renamed from: a */
    public String f120620a = "";

    /* renamed from: b */
    public long f120621b;

    /* renamed from: c */
    public ArrayList<C51797b> f120622c;

    /* renamed from: d */
    public long f120623d;

    /* renamed from: e */
    public long f120624e;

    /* renamed from: com.ss.android.ugc.aweme.video.af$a */
    public static final class C47986a {
        private C47986a() {
        }

        public /* synthetic */ C47986a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo95147a() {
        if (this.f120622c != null) {
            ArrayList<C51797b> arrayList = this.f120622c;
            if (arrayList == null) {
                C52711k.m112234a();
            }
            if (arrayList.size() > 0) {
                ArrayList<C51797b> arrayList2 = this.f120622c;
                if (arrayList2 == null) {
                    C52711k.m112234a();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C51797b bVar = (C51797b) it.next();
                    this.f120623d += (long) bVar.f129244c;
                    this.f120624e += (long) bVar.f129245d;
                }
            }
        }
    }
}
