package com.p683ss.android.ugc.aweme.location;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.location.C36266j.C36267a;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.location.b */
public abstract class C36255b implements C36259d {

    /* renamed from: c */
    public static final C36256a f92824c = new C36256a(null);

    /* renamed from: a */
    public Context f92825a;

    /* renamed from: b */
    public C36285u f92826b;

    /* renamed from: d */
    private C36262g f92827d;

    /* renamed from: com.ss.android.ugc.aweme.location.b$a */
    public static final class C36256a {
        private C36256a() {
        }

        /* renamed from: a */
        public static boolean m81866a() {
            return C36266j.f92833d.mo75090a(C11010c.m22280a());
        }

        public /* synthetic */ C36256a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m81865a(Activity activity, C47939a aVar) {
            if (activity != null) {
                C36267a.m81887a(activity, aVar);
            }
        }

        /* renamed from: b */
        public static void m81867b(Activity activity, C47939a aVar) {
            if (activity != null) {
                C36267a.m81889b(activity, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.location.b$b */
    static final class C36257b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C36255b f92828a;

        /* renamed from: b */
        final /* synthetic */ Context f92829b;

        C36257b(C36255b bVar, Context context) {
            this.f92828a = bVar;
            this.f92829b = context;
        }

        public final /* synthetic */ Object call() {
            C36285u uVar = this.f92828a.f92826b;
            if (uVar == null) {
                return null;
            }
            Context context = this.f92829b;
            C36275n a = this.f92828a.mo75071a((C36284t) uVar, this.f92829b);
            C36259d dVar = this.f92828a;
            C52711k.m112240b(context, "context");
            uVar.f92882a = new C36266j(context, dVar);
            C36266j jVar = uVar.f92882a;
            if (jVar != null) {
                jVar.f92836c = a;
            }
            return uVar;
        }
    }

    /* renamed from: a */
    public static final void m81858a(Activity activity, C47939a aVar) {
        C36256a.m81867b(activity, aVar);
    }

    /* renamed from: d */
    public static final boolean m81859d() {
        return C36256a.m81866a();
    }

    /* renamed from: a */
    public C36275n mo75071a(C36284t tVar, Context context) {
        return null;
    }

    /* renamed from: c */
    public abstract boolean mo75075c();

    /* renamed from: a */
    public final C39054d mo75072a() {
        C36262g gVar = this.f92827d;
        if (gVar != null) {
            C39054d a = gVar.mo75083a();
            if (a != null) {
                return a;
            }
        }
        C36282r rVar = null;
        if (!mo75075c()) {
            return null;
        }
        C36285u uVar = this.f92826b;
        if (uVar != null) {
            rVar = uVar.mo75118a();
        }
        return m81857a(rVar);
    }

    /* renamed from: b */
    public void mo75074b() {
        boolean h = C11016e.m22313h();
        if (!h && !h) {
            C36285u uVar = this.f92826b;
            if (uVar != null) {
                uVar.mo75121b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.poi.C39054d mo75073a(com.p683ss.android.ugc.aweme.location.C36265i r2) {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.location.g r0 = r1.f92827d
            if (r0 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.poi.d r0 = r0.mo75083a()
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            com.ss.android.ugc.aweme.location.u r0 = r1.f92826b
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.location.r r2 = r0.mo75120b(r2)
            if (r2 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            com.ss.android.ugc.aweme.poi.d r2 = m81857a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.location.C36255b.mo75073a(com.ss.android.ugc.aweme.location.i):com.ss.android.ugc.aweme.poi.d");
    }

    /* renamed from: a */
    private static C39054d m81857a(C36282r rVar) {
        if (rVar == null) {
            return null;
        }
        C39054d dVar = new C39054d();
        dVar.time = rVar.getTime();
        dVar.isGaode = rVar.isGaode();
        dVar.latitude = rVar.getLatitude();
        dVar.longitude = rVar.getLongitude();
        dVar.country = rVar.getCountry();
        dVar.province = rVar.getProvince();
        dVar.city = rVar.getCity();
        dVar.district = rVar.getDistrict();
        dVar.address = rVar.getAddress();
        dVar.accuracy = rVar.getAccuracy();
        return dVar;
    }
}
