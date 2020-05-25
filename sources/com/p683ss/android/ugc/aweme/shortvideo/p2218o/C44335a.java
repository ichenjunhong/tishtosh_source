package com.p683ss.android.ugc.aweme.shortvideo.p2218o;

import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46812a;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.o.a */
public final class C44335a {

    /* renamed from: a */
    public static boolean f112204a;

    /* renamed from: b */
    public static boolean f112205b;

    /* renamed from: c */
    public static final C44335a f112206c = new C44335a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.o.a$a */
    static final class C44336a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C44336a f112207a = new C44336a();

        C44336a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m97115a());
        }

        /* renamed from: a */
        public static boolean m97115a() {
            boolean z;
            int[] i = C40797m.m90254i();
            if (i != null) {
                if (i.length >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i = null;
                }
                if (i == null || i[0] != 720) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.o.a$b */
    static final class C44337b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C44337b f112208a = new C44337b();

        C44337b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m97116a());
        }

        /* renamed from: a */
        public static boolean m97116a() {
            boolean z;
            int[] j = C40797m.m90255j();
            if (j != null) {
                if (j.length >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    j = null;
                }
                if (j == null || j[0] != 720) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    private C44335a() {
    }

    /* renamed from: a */
    public final void mo90205a(String str, int i) {
        m97112a(str, i, "");
    }

    /* renamed from: a */
    public final void mo90204a() {
        synchronized (this) {
            if (f112205b && f112204a) {
                boolean a = C44336a.m97115a();
                m97112a("resolution", a ? 1 : 0, C52550ab.m112050a(C52856t.m112465a("resolution_default", C39618d.f101151O.mo83121e(C40796a.VideoSize)), C52856t.m112465a("resolution_category", C39618d.f101151O.mo83121e(C40796a.VideoSizeCategory)), C52856t.m112465a("resolution_real", C40797m.m90252g())).toString());
                boolean a2 = C44337b.m97116a();
                m97112a("resolution", a2 ? 1 : 0, C52550ab.m112050a(C52856t.m112465a("resolution_default", C39618d.f101151O.mo83121e(C40796a.VideoSize)), C52856t.m112465a("resolution_category_upload", C39618d.f101151O.mo83121e(C40796a.ImportVideoSizeCategory)), C52856t.m112465a("resolution_real_upload", C40797m.m90253h())).toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m97112a(String str, int i, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "extra");
        C23569o.m57779a("aweme_android_white_list", C46812a.m101655a(C52550ab.m112050a(C52856t.m112465a("white_list_type", str), C52856t.m112465a("white_list_value", String.valueOf(i)), C52856t.m112465a("extra", str2))));
    }
}
