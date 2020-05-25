package com.google.android.gms.internal.ads;

import android.support.p030v4.p038f.C0800n;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.Arrays;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.dj */
public final class C15832dj extends C15890fm implements C15843dt {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public C15839dq f44861a;

    /* renamed from: b */
    private final C15819cx f44862b;

    /* renamed from: c */
    private final String f44863c;

    /* renamed from: d */
    private final C0800n<String, C15827de> f44864d;

    /* renamed from: e */
    private final C0800n<String, String> f44865e;

    /* renamed from: f */
    private C15583ak f44866f;

    /* renamed from: g */
    private View f44867g;

    /* renamed from: h */
    private final Object f44868h = new Object();

    public C15832dj(String str, C0800n<String, C15827de> nVar, C0800n<String, String> nVar2, C15819cx cxVar, C15583ak akVar, View view) {
        this.f44863c = str;
        this.f44864d = nVar;
        this.f44865e = nVar2;
        this.f44862b = cxVar;
        this.f44866f = akVar;
        this.f44867g = view;
    }

    /* renamed from: b */
    public final String mo30920b() {
        return "3";
    }

    /* renamed from: a */
    public final String mo30969a(String str) {
        return (String) this.f44865e.get(str);
    }

    /* renamed from: b */
    public final C15865eo mo30972b(String str) {
        return (C15865eo) this.f44864d.get(str);
    }

    /* renamed from: a */
    public final List<String> mo30970a() {
        String[] strArr = new String[(this.f44864d.size() + this.f44865e.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f44864d.size()) {
            strArr[i3] = (String) this.f44864d.mo2576b(i2);
            i2++;
            i3++;
        }
        while (i < this.f44865e.size()) {
            strArr[i3] = (String) this.f44865e.mo2576b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: c */
    public final String mo30921c() {
        return this.f44863c;
    }

    /* renamed from: a */
    public final void mo30919a(C15839dq dqVar) {
        synchronized (this.f44868h) {
            this.f44861a = dqVar;
        }
    }

    /* renamed from: f */
    public final C14882b mo30974f() {
        return C14886d.m30544a(this.f44861a);
    }

    /* renamed from: d */
    public final C15819cx mo30922d() {
        return this.f44862b;
    }

    /* renamed from: g */
    public final C15583ak mo30975g() {
        return this.f44866f;
    }

    /* renamed from: a */
    public final boolean mo30971a(C14882b bVar) {
        if (this.f44861a == null) {
            afc.m32794c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f44867g == null) {
            return false;
        } else {
            FrameLayout frameLayout = (FrameLayout) C14886d.m30545a(bVar);
            this.f44861a.mo31032a((View) frameLayout, (C15837do) new C15833dk(this));
            return true;
        }
    }

    /* renamed from: e */
    public final View mo30923e() {
        return this.f44867g;
    }

    /* renamed from: c */
    public final void mo30973c(String str) {
        synchronized (this.f44868h) {
            if (this.f44861a == null) {
                afc.m32794c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44861a.mo31033a(null, str, null, null, null, false);
            }
        }
    }

    /* renamed from: h */
    public final void mo30976h() {
        synchronized (this.f44868h) {
            if (this.f44861a == null) {
                afc.m32794c("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f44861a.mo31012a((View) null, null);
            }
        }
    }

    /* renamed from: i */
    public final C14882b mo30977i() {
        return C14886d.m30544a(this.f44861a.mo31041p().getApplicationContext());
    }

    /* renamed from: j */
    public final void mo30978j() {
        acd.f40245a.post(new C15834dl(this));
        this.f44866f = null;
        this.f44867g = null;
    }
}
