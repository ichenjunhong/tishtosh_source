package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.p706c.C11207p;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ad */
public final class C33355ad {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f86497a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33355ad.class), "readers", "getReaders()Ljava/util/List;"))};

    /* renamed from: e */
    public static final C33356a f86498e = new C33356a(null);

    /* renamed from: b */
    public int f86499b = -1;

    /* renamed from: c */
    public C11207p f86500c;

    /* renamed from: d */
    public final C33353ab f86501d;

    /* renamed from: f */
    private final C52668f f86502f = C52732g.m112285a(C33357b.f86503a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ad$a */
    public static final class C33356a {
        private C33356a() {
        }

        public /* synthetic */ C33356a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ad$b */
    static final class C33357b extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        public static final C33357b f86503a = new C33357b();

        C33357b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final List<String> mo70725a() {
        return (List) this.f86502f.getValue();
    }

    /* renamed from: b */
    public final boolean mo70726b() {
        if (this.f86499b == 2 || this.f86499b == 3) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpotReadState:{");
        sb.append(this.f86500c.getMsgId());
        sb.append(", ");
        sb.append(this.f86499b);
        sb.append(", [");
        sb.append(mo70725a());
        sb.append("]}");
        return sb.toString();
    }

    public C33355ad(C11207p pVar, C33353ab abVar) {
        C52711k.m112240b(pVar, "message");
        C52711k.m112240b(abVar, "sessionInfo");
        this.f86500c = pVar;
        this.f86501d = abVar;
    }
}
