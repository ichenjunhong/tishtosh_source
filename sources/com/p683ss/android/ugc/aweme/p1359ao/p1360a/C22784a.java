package com.p683ss.android.ugc.aweme.p1359ao.p1360a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.maps.C16932b;
import com.google.android.gms.maps.C16933c;
import com.google.android.gms.maps.C16933c.C16934a;
import com.google.android.gms.maps.C16933c.C16935b;
import com.google.android.gms.maps.C16933c.C16936c;
import com.google.android.gms.maps.C16933c.C16937d;
import com.google.android.gms.maps.C16938d;
import com.google.android.gms.maps.C16942f;
import com.google.android.gms.maps.model.C16953b;
import com.google.android.gms.maps.model.C16954c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBounds.C16950a;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p118b.p119a.p120a.p121a.C2578a;
import com.p118b.p119a.p120a.p121a.C2582c;
import com.p118b.p119a.p120a.p121a.C2583d;
import com.p118b.p119a.p120a.p121a.C2584e;
import com.p118b.p119a.p120a.p121a.C2585f;
import com.p118b.p119a.p120a.p121a.p122a.C2580a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ao.a.a */
public final class C22784a implements C2578a, C16935b, C16936c, C16937d, C16942f {

    /* renamed from: b */
    public static final C22785a f61041b = new C22785a(null);

    /* renamed from: c */
    private C16938d f61042c;

    /* renamed from: d */
    private C16933c f61043d;

    /* renamed from: e */
    private C2583d f61044e;

    /* renamed from: f */
    private C16954c f61045f;

    /* renamed from: g */
    private C16954c f61046g;

    /* renamed from: h */
    private double f61047h;

    /* renamed from: i */
    private double f61048i;

    /* renamed from: j */
    private C2584e f61049j;

    /* renamed from: k */
    private C2582c f61050k;

    /* renamed from: l */
    private final FrameLayout f61051l;

    /* renamed from: com.ss.android.ugc.aweme.ao.a.a$a */
    public static final class C22785a {
        private C22785a() {
        }

        public /* synthetic */ C22785a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ao.a.a$b */
    public static final class C22786b implements C16934a {

        /* renamed from: a */
        final /* synthetic */ View f61052a;

        C22786b(View view) {
            this.f61052a = view;
        }

        /* renamed from: a */
        public final View mo32668a(C16954c cVar) {
            View view = this.f61052a;
            if (view == null) {
                C52711k.m112234a();
            }
            return view;
        }

        /* renamed from: b */
        public final View mo32669b(C16954c cVar) {
            View view = this.f61052a;
            if (view == null) {
                C52711k.m112234a();
            }
            return view;
        }
    }

    /* renamed from: b */
    private static double m56126b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    public final void mo32683a(C16933c cVar) {
        this.f61043d = cVar;
        C16933c cVar2 = this.f61043d;
        if (cVar2 != null) {
            cVar2.mo32666a((C16937d) this);
        }
        C16933c cVar3 = this.f61043d;
        if (cVar3 != null) {
            cVar3.mo32664a((C16935b) this);
        }
        C16933c cVar4 = this.f61043d;
        if (cVar4 != null) {
            cVar4.mo32665a((C16936c) this);
        }
        C2584e eVar = this.f61049j;
        if (eVar != null) {
            eVar.mo7098a();
        }
    }

    /* renamed from: a */
    public final void mo7089a(View view, C2580a aVar, Bitmap bitmap, C2583d dVar) {
        this.f61044e = dVar;
        if (this.f61046g != null) {
            C16954c cVar = this.f61046g;
            if (cVar != null) {
                cVar.mo32746a();
            }
            this.f61046g = null;
        }
        this.f61046g = m56125a(bitmap, aVar.f7987a, aVar.f7988b, (C2585f) null);
        C16933c cVar2 = this.f61043d;
        if (cVar2 != null) {
            cVar2.mo32663a((C16934a) new C22786b(view));
        }
        C16954c cVar3 = this.f61046g;
        if (cVar3 != null) {
            cVar3.mo32747b();
        }
    }

    /* renamed from: a */
    public final void mo32670a(C16954c cVar) {
        C2583d dVar = this.f61044e;
        if (dVar != null) {
            dVar.mo7097a();
        }
    }

    /* renamed from: a */
    public final void mo32671a(LatLng latLng) {
        C16954c cVar = this.f61046g;
        if (cVar != null) {
            cVar.mo32747b();
        }
        C2582c cVar2 = this.f61050k;
        if (cVar2 != null) {
            double d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            double d2 = latLng != null ? latLng.f47759a : 0.0d;
            if (latLng != null) {
                d = latLng.f47760b;
            }
            cVar2.mo7096a(d2, d);
        }
    }

    /* renamed from: c */
    public final void mo7092c() {
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32679d();
    }

    /* renamed from: e */
    public final void mo7094e() {
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32678c();
    }

    /* renamed from: f */
    public final void mo7095f() {
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32681f();
    }

    /* renamed from: a */
    public final void mo7083a() {
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32673a();
    }

    /* renamed from: b */
    public final void mo7091b() {
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32676b();
    }

    /* renamed from: d */
    public final void mo7093d() {
        C16933c cVar = this.f61043d;
        if (cVar != null) {
            cVar.mo32666a((C16937d) null);
        }
        C16933c cVar2 = this.f61043d;
        if (cVar2 != null) {
            cVar2.mo32664a((C16935b) null);
        }
        C16933c cVar3 = this.f61043d;
        if (cVar3 != null) {
            cVar3.mo32665a((C16936c) null);
        }
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32680e();
    }

    /* renamed from: a */
    public final void mo7090a(C2582c cVar) {
        this.f61050k = cVar;
    }

    public C22784a(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "frameLayout");
        this.f61051l = frameLayout;
    }

    /* renamed from: a */
    private static double m56124a(double d) {
        double sin = Math.sin(d / 2.0d);
        return sin * sin;
    }

    /* renamed from: b */
    public final boolean mo32672b(C16954c cVar) {
        if (C52711k.m112239a((Object) cVar, (Object) this.f61046g)) {
            C16954c cVar2 = this.f61046g;
            if (cVar2 != null) {
                cVar2.mo32747b();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7087a(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        } else {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
            if (bundle != null) {
                bundle.putBundle("MapViewBundleKey", bundle2);
            }
        }
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32677b(bundle2);
    }

    /* renamed from: a */
    public final void mo7088a(Bundle bundle, C2584e eVar) {
        Bundle bundle2;
        this.f61049j = eVar;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        } else {
            bundle2 = null;
        }
        this.f61042c = new C16938d(this.f61051l.getContext());
        C16938d dVar = this.f61042c;
        if (dVar == null) {
            C52711k.m112237a("mapView");
        }
        dVar.mo32674a(bundle2);
        C16938d dVar2 = this.f61042c;
        if (dVar2 == null) {
            C52711k.m112237a("mapView");
        }
        dVar2.mo32675a((C16942f) this);
        FrameLayout frameLayout = this.f61051l;
        C16938d dVar3 = this.f61042c;
        if (dVar3 == null) {
            C52711k.m112237a("mapView");
        }
        frameLayout.addView(dVar3, new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo7085a(Bitmap bitmap, double d, double d2) {
        if (this.f61045f != null) {
            C16954c cVar = this.f61045f;
            if (cVar != null) {
                cVar.mo32746a();
            }
            this.f61045f = null;
        }
        this.f61045f = m56125a(bitmap, d, d2, (C2585f) null);
    }

    /* renamed from: a */
    private final C16954c m56125a(Bitmap bitmap, double d, double d2, C2585f fVar) {
        LatLng latLng = new LatLng(d, d2);
        C16933c cVar = this.f61043d;
        if (cVar != null) {
            return cVar.mo32661a(new MarkerOptions().mo32711a(latLng).mo32712a(C16953b.m41121a(bitmap)));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo7084a(double d, double d2, double d3, double d4) {
        float f;
        C16950a a = LatLngBounds.m41115a();
        a.mo32708a(new LatLng(d, d2));
        a.mo32708a(new LatLng(d3, d4));
        LatLngBounds a2 = a.mo32709a();
        double b = m56126b(d);
        double b2 = m56126b(d2);
        double asin = Math.asin(Math.sqrt(m56124a(Math.abs(b - m56126b(d3))) + (Math.cos(d) * Math.cos(d3) * m56124a(Math.abs(b2 - m56126b(d4)))))) * 12742.0d;
        if (asin < 0.10000000149011612d) {
            f = 19.0f;
        } else if (asin < 0.20000000298023224d) {
            f = 17.0f;
        } else if (asin < 0.5d) {
            f = 16.0f;
        } else if (asin < 1.0d) {
            f = 15.0f;
        } else if (asin < 2.0d) {
            f = 14.0f;
        } else if (asin < 4.0d) {
            f = 13.0f;
        } else if (asin < 7.5d) {
            f = 12.0f;
        } else if (asin < 15.0d) {
            f = 11.0f;
        } else {
            f = 10.0f;
        }
        C16933c cVar = this.f61043d;
        if (cVar != null) {
            C52711k.m112236a((Object) a2, "bounds");
            cVar.mo32662a(C16932b.m41075a(a2.mo32703b(), f));
        }
    }

    /* renamed from: a */
    public final void mo7086a(Bitmap bitmap, double d, double d2, float f, C2585f fVar) {
        this.f61047h = d;
        this.f61048i = d2;
        if (this.f61046g != null) {
            C16954c cVar = this.f61046g;
            if (cVar != null) {
                cVar.mo32746a();
            }
            this.f61046g = null;
        }
        this.f61046g = m56125a(bitmap, d, d2, fVar);
        C16933c cVar2 = this.f61043d;
        if (cVar2 != null) {
            cVar2.mo32662a(C16932b.m41074a(new LatLng(d, d2)));
        }
        C16933c cVar3 = this.f61043d;
        if (cVar3 != null) {
            cVar3.mo32667b(C16932b.m41073a(13.0f));
        }
    }
}
