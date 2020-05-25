package com.p683ss.android.ugc.aweme.longvideonew.feature;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController */
public final class NoOperateModeController implements C0183j, C9382a {

    /* renamed from: a */
    public C9381g f93268a = new C9381g(this);

    /* renamed from: b */
    public C36416a f93269b;

    /* renamed from: c */
    public boolean f93270c;

    /* renamed from: d */
    public boolean f93271d;

    /* renamed from: e */
    public final AmeSSActivity f93272e;

    /* renamed from: f */
    private final long f93273f = 3000;

    /* renamed from: g */
    private final long f93274g = 60000;

    /* renamed from: h */
    private final Runnable f93275h = new C36417b(this);

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$a */
    public interface C36416a {
        /* renamed from: e */
        void mo75346e();

        /* renamed from: f */
        void mo75347f();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$b */
    static final class C36417b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NoOperateModeController f93276a;

        C36417b(NoOperateModeController noOperateModeController) {
            this.f93276a = noOperateModeController;
        }

        public final void run() {
            C36416a aVar = this.f93276a.f93269b;
            if (aVar != null) {
                aVar.mo75346e();
            }
            this.f93276a.f93270c = true;
        }
    }

    public final void handleMsg(Message message) {
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        m82178a();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        mo75352a(this.f93273f);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C9381g gVar = this.f93268a;
        if (gVar != null) {
            gVar.removeCallbacks(this.f93275h);
        }
        this.f93268a = null;
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    private void m82178a() {
        C9381g gVar = this.f93268a;
        if (gVar != null) {
            gVar.removeCallbacks(this.f93275h);
        }
        if (this.f93270c) {
            C36416a aVar = this.f93269b;
            if (aVar != null) {
                aVar.mo75347f();
            }
            this.f93270c = false;
        }
    }

    /* renamed from: a */
    public final void mo75352a(long j) {
        C9381g gVar = this.f93268a;
        if (gVar != null) {
            gVar.removeCallbacks(this.f93275h);
        }
        C9381g gVar2 = this.f93268a;
        if (gVar2 != null) {
            gVar2.postDelayed(this.f93275h, j);
        }
    }

    public NoOperateModeController(AmeSSActivity ameSSActivity) {
        C52711k.m112240b(ameSSActivity, "activity");
        this.f93272e = ameSSActivity;
        this.f93272e.getLifecycle().mo324a(this);
        C0176h lifecycle = this.f93272e.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo323a().isAtLeast(C0178b.RESUMED)) {
            mo75352a(this.f93273f);
        }
        C47718bf.m103290c(this);
    }

    @C53771m
    public final void onOperateEvent(C36349a aVar) {
        long j;
        C52711k.m112240b(aVar, "event");
        C0176h lifecycle = this.f93272e.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo323a().isAtLeast(C0178b.STARTED)) {
            if (aVar.f93059b) {
                this.f93271d = false;
            }
            if (this.f93271d) {
                m82178a();
            } else {
                m82178a();
                if (aVar.f93058a) {
                    j = this.f93274g;
                } else {
                    j = this.f93273f;
                }
                mo75352a(j);
            }
            if (aVar.f93058a) {
                this.f93271d = true;
            }
        }
    }
}
