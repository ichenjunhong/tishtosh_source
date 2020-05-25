package com.p683ss.android.ugc.aweme.p2377ug.guide;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p683ss.android.ugc.aweme.feed.guide.C30289j;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30780ax;
import com.p683ss.android.ugc.aweme.feed.panel.C30597ae;
import com.p683ss.android.ugc.aweme.main.C36605dw;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47464j.C47465a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.l */
public final class C47468l {

    /* renamed from: a */
    public final C30597ae f119730a;

    /* renamed from: b */
    public final C42245a f119731b;

    /* renamed from: c */
    private final Handler f119732c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Runnable f119733d = new C47469a(this);

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$a */
    static final class C47469a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47468l f119734a;

        C47469a(C47468l lVar) {
            this.f119734a = lVar;
        }

        public final void run() {
            if (this.f119734a.mo94748b() && this.f119734a.f119730a.mo62793bw() != null) {
                boolean z = !C47819dn.m103467a(this.f119734a.f119730a.mo62793bw(), false);
                if (this.f119734a.f119730a instanceof C30780ax) {
                    VerticalViewPager av = this.f119734a.f119730a.mo62782av();
                    C52711k.m112236a((Object) av, "panel.viewPager");
                    if (av.getCurrentItem() != 0) {
                        return;
                    }
                }
                if (z) {
                    this.f119734a.f119730a.mo60515ag();
                    C30289j.m71205a().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$b */
    public static final class C47470b implements C42247b {

        /* renamed from: a */
        final /* synthetic */ C47468l f119735a;

        /* renamed from: b */
        public final void mo75533b() {
        }

        /* renamed from: a */
        public final void mo75532a() {
            this.f119735a.mo94746a();
        }

        public C47470b(C47468l lVar) {
            this.f119735a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$c */
    public static final class C47471c implements C42247b {

        /* renamed from: a */
        final /* synthetic */ C47468l f119736a;

        /* renamed from: b */
        public final void mo75533b() {
        }

        /* renamed from: a */
        public final void mo75532a() {
            this.f119736a.mo94746a();
        }

        public C47471c(C47468l lVar) {
            this.f119736a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$d */
    public static final class C47472d implements C42247b {

        /* renamed from: a */
        final /* synthetic */ C47468l f119737a;

        /* renamed from: b */
        public final void mo75533b() {
        }

        /* renamed from: a */
        public final void mo75532a() {
            this.f119737a.mo94746a();
        }

        public C47472d(C47468l lVar) {
            this.f119737a = lVar;
        }
    }

    /* renamed from: g */
    private static long m102833g() {
        return C47467k.m102831a();
    }

    /* renamed from: c */
    public final void mo94749c() {
        this.f119732c.removeCallbacks(this.f119733d);
    }

    /* renamed from: d */
    public final void mo94750d() {
        mo94747a(m102833g());
    }

    /* renamed from: e */
    public final void mo94751e() {
        if (mo94748b()) {
            this.f119730a.mo60515ag();
        }
    }

    /* renamed from: f */
    private final boolean m102832f() {
        if (this.f119731b.mo86218d() || this.f119731b.mo86220e() || this.f119731b.mo86215c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo94746a() {
        if (mo94748b() && !C30289j.m71207a(false)) {
            this.f119730a.mo60515ag();
            C30289j.m71205a().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
        }
    }

    /* renamed from: b */
    public final boolean mo94748b() {
        if (!this.f119731b.mo86222f() && m102832f() && !C36605dw.m82472a(false) && C30289j.m71208b(true) && C47465a.m102826a()) {
            int am = this.f119730a.mo60521am() - 1;
            VerticalViewPager av = this.f119730a.mo62782av();
            C52711k.m112236a((Object) av, "panel.viewPager");
            if (am != av.getCurrentItem()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo94747a(long j) {
        boolean z = false;
        if (!C47464j.f119726b.mo94744b() || !C30289j.m71207a(false)) {
            z = true;
        }
        if (z) {
            this.f119732c.postDelayed(this.f119733d, j);
        }
    }

    public C47468l(C30597ae aeVar, C42245a aVar) {
        C52711k.m112240b(aeVar, "panel");
        C52711k.m112240b(aVar, "mDialogShowingManager");
        this.f119730a = aeVar;
        this.f119731b = aVar;
    }
}
