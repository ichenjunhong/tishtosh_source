package com.p683ss.android.ugc.aweme.bullet.module.base.p1479a;

import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView.C10612b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.google.gson.C18091u;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52708h;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a */
public final class C24326a implements C10612b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64572a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24326a.class), "lastClickDetector", "getLastClickDetector()Landroid/view/GestureDetector;"))};

    /* renamed from: b */
    public long f64573b;

    /* renamed from: c */
    public boolean f64574c;

    /* renamed from: d */
    public boolean f64575d;

    /* renamed from: e */
    public OnTouchListener f64576e;

    /* renamed from: f */
    private C24327a[] f64577f;

    /* renamed from: g */
    private boolean f64578g;

    /* renamed from: h */
    private final C52668f f64579h;

    /* renamed from: i */
    private SSWebView f64580i;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a$a */
    public static final class C24327a {
        @C17952c(mo34828a = "x")

        /* renamed from: a */
        public final double f64581a;
        @C17952c(mo34828a = "y")

        /* renamed from: b */
        public final double f64582b;
        @C17952c(mo34828a = "width")

        /* renamed from: c */
        public final double f64583c;
        @C17952c(mo34828a = "height")

        /* renamed from: d */
        public final double f64584d;

        public C24327a() {
            this(ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 15, null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (java.lang.Double.compare(r4.f64584d, r5.f64584d) == 0) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                if (r4 == r5) goto L_0x0033
                boolean r0 = r5 instanceof com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24326a.C24327a
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.bullet.module.base.a.a$a r5 = (com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24326a.C24327a) r5
                double r0 = r4.f64581a
                double r2 = r5.f64581a
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f64582b
                double r2 = r5.f64582b
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f64583c
                double r2 = r5.f64583c
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f64584d
                double r2 = r5.f64584d
                int r5 = java.lang.Double.compare(r0, r2)
                if (r5 != 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r5 = 0
                return r5
            L_0x0033:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24326a.C24327a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((Double.hashCode(this.f64581a) * 31) + Double.hashCode(this.f64582b)) * 31) + Double.hashCode(this.f64583c)) * 31) + Double.hashCode(this.f64584d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisableInterceptRegion(x=");
            sb.append(this.f64581a);
            sb.append(", y=");
            sb.append(this.f64582b);
            sb.append(", width=");
            sb.append(this.f64583c);
            sb.append(", height=");
            sb.append(this.f64584d);
            sb.append(")");
            return sb.toString();
        }

        private C24327a(double d, double d2, double d3, double d4) {
            this.f64581a = d;
            this.f64582b = d2;
            this.f64583c = d3;
            this.f64584d = d4;
        }

        private /* synthetic */ C24327a(double d, double d2, double d3, double d4, int i, C52707g gVar) {
            this(C52708h.m112228a(), C52708h.m112228a(), C52708h.m112229b(), C52708h.m112229b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a$b */
    static final class C24328b extends C52712l implements C52670a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ C24326a f64585a;

        C24328b(C24326a aVar) {
            this.f64585a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            GestureDetector gestureDetector = new GestureDetector(C11010c.m22280a(), new SimpleOnGestureListener(this) {

                /* renamed from: a */
                final /* synthetic */ C24328b f64586a;

                {
                    this.f64586a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f64586a.f64585a.f64573b = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    /* renamed from: a */
    public final boolean mo18832a() {
        if (System.currentTimeMillis() - this.f64573b < ((long) this.f64580i.getTimeInterval())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo50117a(C29906l lVar) {
        Object obj;
        C52711k.m112240b(lVar, "event");
        C18082l a = new C18087q().mo35029a(lVar.f78045b.toString());
        C52711k.m112236a((Object) a, "JsonParser().parse(event.params.toString())");
        C18085o m = a.mo35009m();
        C18082l b = m.mo35022b("eventName");
        C24327a[] aVarArr = null;
        if (b != null) {
            obj = b.mo34905c();
        } else {
            obj = null;
        }
        if (C52711k.m112239a(obj, (Object) C28695c.f75316i)) {
            C18082l b2 = m.mo35022b("data");
            if (b2 != null) {
                try {
                    GsonProvider a2 = C47759cc.m103382a();
                    C52711k.m112236a((Object) a2, "GsonProvider.get()");
                    aVarArr = (C24327a[]) a2.getGson().mo34881a(b2, C24327a[].class);
                } catch (C18091u unused) {
                }
            }
            this.f64577f = aVarArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066 A[LOOP:0: B:5:0x003b->B:18:0x0066, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18834a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            int r2 = r17.getActionMasked()
            r3 = 2
            r4 = 1
            if (r2 != 0) goto L_0x006e
            r2 = 0
            r0.f64578g = r2
            int[] r5 = new int[r3]
            com.bytedance.ies.bullet.ui.common.view.SSWebView r6 = r0.f64580i
            r6.getLocationInWindow(r5)
            float r6 = r17.getRawX()
            r7 = r5[r2]
            float r7 = (float) r7
            float r6 = r6 - r7
            double r6 = (double) r6
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58244b(r6)
            float r7 = r17.getRawY()
            r5 = r5[r4]
            float r5 = (float) r5
            float r7 = r7 - r5
            double r7 = (double) r7
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58244b(r7)
            com.ss.android.ugc.aweme.bullet.module.base.a.a$a[] r7 = r0.f64577f
            if (r7 == 0) goto L_0x006b
            int r8 = r7.length
            r9 = 0
        L_0x003b:
            if (r9 >= r8) goto L_0x006b
            r10 = r7[r9]
            double r11 = (double) r6
            double r13 = r10.f64581a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0061
            double r13 = r10.f64581a
            double r2 = r10.f64583c
            double r13 = r13 + r2
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0061
            double r2 = (double) r5
            double r11 = r10.f64582b
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0061
            double r11 = r10.f64582b
            double r13 = r10.f64584d
            double r11 = r11 + r13
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            if (r2 == 0) goto L_0x0066
            r2 = 1
            goto L_0x006c
        L_0x0066:
            int r9 = r9 + 1
            r2 = 0
            r3 = 2
            goto L_0x003b
        L_0x006b:
            r2 = 0
        L_0x006c:
            r0.f64578g = r2
        L_0x006e:
            boolean r2 = r0.f64578g
            if (r2 == 0) goto L_0x0077
            com.bytedance.ies.bullet.ui.common.view.SSWebView r2 = r0.f64580i
            r2.requestDisallowInterceptTouchEvent(r4)
        L_0x0077:
            com.bytedance.ies.bullet.ui.common.view.SSWebView r2 = r0.f64580i
            boolean r2 = r2.f28135a
            if (r2 == 0) goto L_0x0093
            d.f r2 = r0.f64579h
            java.lang.Object r2 = r2.getValue()
            android.view.GestureDetector r2 = (android.view.GestureDetector) r2
            r2.onTouchEvent(r1)
            android.view.View$OnTouchListener r2 = r0.f64576e
            if (r2 == 0) goto L_0x0093
            com.bytedance.ies.bullet.ui.common.view.SSWebView r3 = r0.f64580i
            android.view.View r3 = (android.view.View) r3
            r2.onTouch(r3, r1)
        L_0x0093:
            boolean r2 = r0.f64575d
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r0.f64574c
            if (r2 == 0) goto L_0x00a1
            com.bytedance.ies.bullet.ui.common.view.SSWebView r2 = r0.f64580i
            r2.requestDisallowInterceptTouchEvent(r4)
            goto L_0x00a9
        L_0x00a1:
            int r2 = r17.getAction()
            r3 = 2
            if (r2 != r3) goto L_0x00a9
            return r4
        L_0x00a9:
            boolean r1 = com.bytedance.ies.bullet.p653ui.common.view.SSWebView.C10612b.C10613a.m21398a(r16, r17)
            return r1
        L_0x00ae:
            boolean r1 = com.bytedance.ies.bullet.p653ui.common.view.SSWebView.C10612b.C10613a.m21398a(r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24326a.mo18834a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo18833a(int i, boolean z) {
        if (!this.f64575d) {
            throw new C10241d("An operation is not implemented");
        } else if (!this.f64574c || !z) {
            return false;
        } else {
            return true;
        }
    }

    private C24326a(SSWebView sSWebView, boolean z, boolean z2, OnTouchListener onTouchListener) {
        C52711k.m112240b(sSWebView, "webView");
        this.f64580i = sSWebView;
        this.f64574c = z;
        this.f64575d = z2;
        this.f64576e = onTouchListener;
        this.f64579h = C52732g.m112285a(new C24328b(this));
    }

    public /* synthetic */ C24326a(SSWebView sSWebView, boolean z, boolean z2, OnTouchListener onTouchListener, int i, C52707g gVar) {
        this(sSWebView, true, false, null);
    }
}
