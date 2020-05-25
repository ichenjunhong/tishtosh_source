package com.p683ss.android.ugc.aweme.feed.panel;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.BaseVerticalViewPager;
import com.p683ss.android.ugc.aweme.detail.p1621c.C27326a;
import com.p683ss.android.ugc.aweme.feed.guide.C30289j;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.ao */
public final class C30607ao implements Runnable {

    /* renamed from: a */
    static final String f79913a = "ao";

    /* renamed from: e */
    public static boolean f79914e;

    /* renamed from: b */
    final BaseVerticalViewPager f79915b;

    /* renamed from: c */
    public final Handler f79916c;

    /* renamed from: d */
    final AccelerateDecelerateInterpolator f79917d = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    public long f79918f = -1;

    /* renamed from: g */
    public boolean f79919g = false;

    /* renamed from: h */
    public Runnable f79920h = new Runnable() {
        public final void run() {
            if (C27326a.m65855a(true)) {
                C27326a.m65856b(false);
                C30607ao.this.f79919g = true;
                C30607ao.this.f79916c.post(C30607ao.this);
            }
        }
    };

    /* renamed from: i */
    public float f79921i = 0.35f;

    /* renamed from: j */
    private ViewStub f79922j;

    /* renamed from: k */
    private View f79923k;

    /* renamed from: l */
    private int f79924l;

    /* renamed from: m */
    private float f79925m;

    /* renamed from: n */
    private int f79926n;

    /* renamed from: o */
    private long f79927o;

    /* renamed from: p */
    private C42245a f79928p;

    /* renamed from: q */
    private Runnable f79929q = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: r */
    private Runnable f79930r = new Runnable() {
        public final void run() {
            C30607ao.this.f79916c.post(C30607ao.this);
        }
    };

    /* renamed from: c */
    private void m71636c() {
        this.f79925m = 0.0f;
        this.f79926n = 0;
        this.f79927o = 0;
        if (this.f79923k != null) {
            this.f79923k.setAlpha(0.0f);
        }
    }

    /* renamed from: b */
    public final boolean mo62802b() {
        if (this.f79915b.mo55009b() || this.f79919g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo62800a() {
        this.f79916c.removeCallbacksAndMessages(null);
        m71636c();
        if (this.f79915b.mo55009b()) {
            try {
                this.f79915b.mo55014d();
                if (this.f79919g) {
                    C30289j.m71209c(false);
                    this.f79919g = false;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f79923k != null) {
            this.f79923k.setVisibility(8);
        }
        this.f79924l = 0;
    }

    public final void run() {
        if (this.f79915b.getChildCount() > 0) {
            if (this.f79927o == 0) {
                if (this.f79923k == null) {
                    this.f79923k = this.f79922j.inflate();
                }
                this.f79927o = SystemClock.uptimeMillis();
                this.f79926n = (int) (((float) C9432q.m18688b(this.f79915b.getContext())) * this.f79921i);
                this.f79915b.mo55010c();
                this.f79928p.mo86217d(true);
                this.f79916c.post(this);
                C26890h.m65011a("new_user_guide_show", C23089d.m56640a().mo47829a("guide_type", "slide").f61491a);
                C26890h.m65011a("swipe_up_guide_show", C23089d.m56640a().mo47829a("type", "1").f61491a);
                this.f79923k.setVisibility(0);
            } else {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f79927o;
                if (uptimeMillis < 800) {
                    long j = this.f79927o;
                    int i = this.f79926n;
                    if (this.f79915b.mo55009b()) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        float f = this.f79925m;
                        float interpolation = this.f79917d.getInterpolation((((float) (uptimeMillis2 - j)) * 1.0f) / 800.0f) * ((float) i);
                        this.f79925m = interpolation;
                        this.f79915b.mo55003a(f - interpolation);
                    }
                    this.f79916c.post(this);
                } else if (uptimeMillis < 1300) {
                    this.f79916c.post(this);
                } else {
                    this.f79923k.setVisibility(8);
                    if (this.f79915b.mo55009b()) {
                        this.f79915b.mo55014d();
                    }
                    if (this.f79924l <= 0) {
                        m71636c();
                        this.f79924l++;
                        this.f79916c.postDelayed(this, 2000);
                    } else if (this.f79919g) {
                        C30289j.m71209c(false);
                        this.f79928p.mo86217d(false);
                        this.f79919g = false;
                    }
                }
            }
            long uptimeMillis3 = SystemClock.uptimeMillis() - this.f79927o;
            if (uptimeMillis3 <= 300) {
                this.f79923k.setAlpha((((float) uptimeMillis3) * 1.0f) / 300.0f);
                return;
            }
            if (uptimeMillis3 >= 1000 && uptimeMillis3 <= 1300) {
                this.f79923k.setAlpha((((float) (1300 - uptimeMillis3)) * 1.0f) / 300.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo62801a(float f) {
        if (this.f79923k != null) {
            this.f79923k.setTranslationY(f);
        }
    }

    public C30607ao(BaseVerticalViewPager baseVerticalViewPager, ViewStub viewStub) {
        this.f79915b = baseVerticalViewPager;
        this.f79916c = new Handler(Looper.getMainLooper());
        this.f79922j = viewStub;
        this.f79928p = C42245a.m92680a(this.f79915b.getContext());
    }
}
