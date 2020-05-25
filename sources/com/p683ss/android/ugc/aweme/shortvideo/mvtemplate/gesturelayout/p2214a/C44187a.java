package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.p030v4.view.p042b.C1023b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b.C44192b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a */
public final class C44187a {

    /* renamed from: m */
    public static final C44192b f111941m = new C44189b();

    /* renamed from: n */
    public static final C44188a f111942n = new C44188a(null);

    /* renamed from: a */
    public TimeInterpolator f111943a = new C1023b();

    /* renamed from: b */
    public TimeInterpolator f111944b = new C1023b();

    /* renamed from: c */
    public TimeInterpolator f111945c = new C1023b();

    /* renamed from: d */
    public TimeInterpolator f111946d = new C1023b();

    /* renamed from: e */
    public TimeInterpolator f111947e = new C1023b();

    /* renamed from: f */
    public long f111948f = 250;

    /* renamed from: g */
    public long f111949g = 250;

    /* renamed from: h */
    public long f111950h = 250;

    /* renamed from: i */
    public long f111951i = 250;

    /* renamed from: j */
    public long f111952j = 250;

    /* renamed from: k */
    public C44192b f111953k = f111941m;

    /* renamed from: l */
    public boolean f111954l = false;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a$a */
    public static final class C44188a {
        private C44188a() {
        }

        /* renamed from: a */
        public static C44192b m96833a() {
            return C44187a.f111941m;
        }

        public /* synthetic */ C44188a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a$b */
    public static final class C44189b extends C44192b {
        C44189b() {
        }

        /* renamed from: a */
        public final Path mo90101a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: a */
    public final void mo90097a(TimeInterpolator timeInterpolator) {
        C52711k.m112240b(timeInterpolator, "<set-?>");
        this.f111943a = timeInterpolator;
    }

    /* renamed from: b */
    public final void mo90098b(TimeInterpolator timeInterpolator) {
        C52711k.m112240b(timeInterpolator, "<set-?>");
        this.f111944b = timeInterpolator;
    }

    /* renamed from: c */
    public final void mo90099c(TimeInterpolator timeInterpolator) {
        C52711k.m112240b(timeInterpolator, "<set-?>");
        this.f111945c = timeInterpolator;
    }

    /* renamed from: d */
    public final void mo90100d(TimeInterpolator timeInterpolator) {
        C52711k.m112240b(timeInterpolator, "<set-?>");
        this.f111946d = timeInterpolator;
    }
}
