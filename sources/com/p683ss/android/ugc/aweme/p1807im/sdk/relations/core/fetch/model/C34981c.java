package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model;

import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.c */
public final class C34981c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90004a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34981c.class), "logIdList", "getLogIdList()Ljava/util/List;"))};

    /* renamed from: b */
    public boolean f90005b;

    /* renamed from: c */
    public long f90006c;

    /* renamed from: d */
    public long f90007d;

    /* renamed from: e */
    public int f90008e;

    /* renamed from: f */
    public int f90009f;

    /* renamed from: g */
    public int f90010g;

    /* renamed from: h */
    public final C34970a f90011h;

    /* renamed from: i */
    public final long f90012i;

    /* renamed from: j */
    public final long f90013j;

    /* renamed from: k */
    private final C52668f f90014k = C52732g.m112285a(C34982a.f90015a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.c$a */
    static final class C34982a extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        public static final C34982a f90015a = new C34982a();

        C34982a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final List<String> mo73106a() {
        return (List) this.f90014k.getValue();
    }

    public final String toString() {
        String str = "[";
        int size = mo73106a().size();
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((String) mo73106a().get(i));
            sb.append(',');
            str = sb.toString();
            if (i == 1) {
                break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("]");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder("RelationFetchResult{fetchScene=");
        sb4.append(this.f90011h);
        sb4.append(", initMaxTime=");
        sb4.append(this.f90012i);
        sb4.append(", initMinTime=");
        sb4.append(this.f90013j);
        sb4.append(", fullSuccess=");
        sb4.append(this.f90005b);
        sb4.append(", fetchedMaxTime=");
        sb4.append(this.f90006c);
        sb4.append(", fetchedMinTime=");
        sb4.append(this.f90007d);
        sb4.append(", fetchedSize=");
        sb4.append(this.f90008e);
        sb4.append(", updatedSize=");
        sb4.append(this.f90009f);
        sb4.append(", fetchTimes=");
        sb4.append(this.f90010g);
        sb4.append(", logIdList=");
        sb4.append(sb3);
        sb4.append('}');
        return sb4.toString();
    }

    public C34981c(C34970a aVar, long j, long j2) {
        C52711k.m112240b(aVar, "fetchScene");
        this.f90011h = aVar;
        this.f90012i = j;
        this.f90013j = j2;
    }
}
