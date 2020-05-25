package com.p683ss.android.ugc.aweme.adaptation;

import android.app.Application;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.adaptation.a */
public final class C22452a {

    /* renamed from: a */
    public static Application f60458a = C39629l.m88233b();

    /* renamed from: b */
    public static final C22452a f60459b = new C22452a();

    /* renamed from: c */
    private static final Keva f60460c;

    private C22452a() {
    }

    /* renamed from: h */
    private static int m55502h() {
        return m55492a();
    }

    /* renamed from: i */
    private static int m55503i() {
        return m55495b();
    }

    /* renamed from: a */
    public static final int m55492a() {
        return f60460c.getInt("key_adapt_plan", 0);
    }

    /* renamed from: b */
    public static final int m55495b() {
        return f60460c.getInt("key_navibar_height", -1);
    }

    /* renamed from: g */
    public static final int m55501g() {
        return m55496b(m55497c());
    }

    static {
        Keva repo = Keva.getRepo("screen_adapt_repo");
        C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_SCREEN_ADAPT_REPO)");
        f60460c = repo;
    }

    /* renamed from: c */
    public static final int m55497c() {
        Application application = f60458a;
        C52711k.m112236a((Object) application, "context");
        return application.getResources().getDimensionPixelSize(R.dimen.cp);
    }

    /* renamed from: d */
    public static final int m55498d() {
        int c = C43303dy.m94972c(f60458a);
        int h = m55502h();
        if (!(h == 1 || h == 6)) {
            switch (h) {
                case 3:
                case 4:
                    break;
                default:
                    return 0;
            }
        }
        return c;
    }

    /* renamed from: e */
    public static final boolean m55499e() {
        if (m55502h() == 1 || m55502h() == 3 || m55502h() == 4 || m55502h() == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final int m55500f() {
        int c = m55497c();
        switch (m55502h()) {
            case 1:
            case 2:
                return c;
            case 4:
            case 5:
                return m55503i() + c;
            case 6:
            case 7:
                return m55503i();
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static final int m55496b(int i) {
        int c = C43303dy.m94972c(f60458a);
        int e = C43303dy.m94974e(f60458a);
        switch (m55502h()) {
            case 1:
                return (e - c) - i;
            case 2:
                return e - i;
            case 3:
                return e - c;
            case 4:
                return ((e - m55503i()) - c) - i;
            case 5:
                return (e - m55503i()) - i;
            case 6:
                return (e - m55503i()) - c;
            case 7:
                return e - m55503i();
            default:
                return e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r2 < r3) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r4 <= r8) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r2 < r3) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m55493a(int r11) {
        /*
            android.app.Application r0 = f60458a
            android.content.Context r0 = (android.content.Context) r0
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94974e(r0)
            android.app.Application r1 = f60458a
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94971b(r1)
            android.app.Application r2 = f60458a
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94972c(r2)
            int r3 = m55497c()
            int r4 = r1 * 16
            int r4 = r4 / 9
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 2
            r9 = 0
            if (r11 != 0) goto L_0x0045
            int r5 = r0 - r2
            int r6 = r5 - r3
            if (r4 > r6) goto L_0x002f
            r5 = 1
            goto L_0x0063
        L_0x002f:
            if (r4 > r5) goto L_0x003a
            int r6 = r0 - r3
            if (r4 > r6) goto L_0x003a
            if (r2 >= r3) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            r5 = 3
            goto L_0x0063
        L_0x003a:
            int r3 = r0 - r3
            if (r4 > r3) goto L_0x0040
        L_0x003e:
            r5 = 2
            goto L_0x0063
        L_0x0040:
            if (r4 > r5) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            r5 = 0
            goto L_0x0063
        L_0x0045:
            int r7 = r0 - r11
            if (r4 >= r7) goto L_0x0062
            int r8 = r7 - r2
            int r10 = r8 - r3
            if (r4 > r10) goto L_0x0051
            r5 = 4
            goto L_0x0063
        L_0x0051:
            if (r4 > r8) goto L_0x005a
            int r10 = r7 - r3
            if (r4 > r10) goto L_0x005a
            if (r2 >= r3) goto L_0x0063
            goto L_0x005d
        L_0x005a:
            int r7 = r7 - r3
            if (r4 > r7) goto L_0x005f
        L_0x005d:
            r5 = 5
            goto L_0x0063
        L_0x005f:
            if (r4 > r8) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = 7
        L_0x0063:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "FullScreen plan="
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = ",screenHeight="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ",screenWidth="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ",statusBarHeight="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ",naviBarHeight="
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = r3.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r0)
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94969a()
            if (r0 == 0) goto L_0x009b
            r5 = 0
        L_0x009b:
            com.bytedance.keva.Keva r0 = f60460c
            java.lang.String r1 = "key_adapt_plan"
            r0.storeInt(r1, r5)
            com.bytedance.keva.Keva r0 = f60460c
            java.lang.String r1 = "key_navibar_height"
            r0.storeInt(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.adaptation.C22452a.m55493a(int):void");
    }

    /* renamed from: a */
    public static final void m55494a(View view, int i, int i2) {
        int i3;
        int i4;
        if (view != null && i != 0 && i2 != 0) {
            int e = C43303dy.m94974e(f60458a);
            int b = C43303dy.m94971b(f60458a);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (e * 9 > b * 16) {
                int d = m55498d();
                i3 = d;
                e = m55501g();
            } else {
                i3 = 0;
            }
            if (C43302dx.m94966a(i, i2)) {
                layoutParams.height = e;
                layoutParams.topMargin = i3;
                layoutParams.width = (e * i) / i2;
                layoutParams.leftMargin = (C43303dy.m94971b(f60458a) - layoutParams.width) / 2;
            } else {
                layoutParams.width = b;
                layoutParams.height = (b * i2) / i;
                layoutParams.topMargin = i3 + ((e - layoutParams.height) / 2);
                if (layoutParams.topMargin >= 0) {
                    i4 = layoutParams.topMargin;
                } else {
                    i4 = 0;
                }
                layoutParams.topMargin = i4;
                layoutParams.leftMargin = 0;
            }
            StringBuilder sb = new StringBuilder("ScreenSizeCompat: surfaceView height:");
            sb.append(layoutParams.height);
            sb.append(", width:");
            sb.append(layoutParams.width);
            sb.append(",plan=");
            sb.append(m55502h());
            sb.append(" videoWidth：");
            sb.append(i);
            sb.append(" x ");
            sb.append(i2);
            sb.append(", topMargin=");
            sb.append(layoutParams.topMargin);
            C50203g.m108358a(sb.toString());
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
