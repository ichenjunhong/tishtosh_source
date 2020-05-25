package com.p683ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController */
public final class NoOperateModeController implements C0183j, C9382a {

    /* renamed from: a */
    public C9381g f93108a = new C9381g(this);

    /* renamed from: b */
    public C36370a f93109b;

    /* renamed from: c */
    public boolean f93110c;

    /* renamed from: d */
    public boolean f93111d;

    /* renamed from: e */
    public final FragmentActivity f93112e;

    /* renamed from: f */
    public final View f93113f;

    /* renamed from: g */
    private final long f93114g = 5000;

    /* renamed from: h */
    private final long f93115h = 60000;

    /* renamed from: i */
    private final Runnable f93116i = new C36371b(this);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController$a */
    public interface C36370a {
        /* renamed from: h */
        void mo75237h();

        /* renamed from: i */
        void mo75238i();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController$b */
    static final class C36371b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NoOperateModeController f93117a;

        C36371b(NoOperateModeController noOperateModeController) {
            this.f93117a = noOperateModeController;
        }

        public final void run() {
            C36370a aVar = this.f93117a.f93109b;
            if (aVar != null) {
                aVar.mo75237h();
            }
            this.f93117a.f93110c = true;
        }
    }

    public final void handleMsg(Message message) {
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        m82090a();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        mo75284a(this.f93114g);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C9381g gVar = this.f93108a;
        if (gVar != null) {
            gVar.removeCallbacks(this.f93116i);
        }
        this.f93108a = null;
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    private void m82090a() {
        C9381g gVar = this.f93108a;
        if (gVar != null) {
            gVar.removeCallbacks(this.f93116i);
        }
        if (this.f93110c) {
            C36370a aVar = this.f93109b;
            if (aVar != null) {
                aVar.mo75238i();
            }
            this.f93110c = false;
        }
    }

    /* renamed from: a */
    public final void mo75284a(long j) {
        C9381g gVar = this.f93108a;
        if (gVar != null) {
            gVar.removeCallbacks(this.f93116i);
        }
        C9381g gVar2 = this.f93108a;
        if (gVar2 != null) {
            gVar2.postDelayed(this.f93116i, j);
        }
    }

    @C53771m
    public final void onOperateEvent(C36349a aVar) {
        long j;
        C52711k.m112240b(aVar, "event");
        C0176h lifecycle = this.f93112e.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo323a().isAtLeast(C0178b.STARTED)) {
            if (aVar.f93059b) {
                this.f93111d = false;
            }
            if (this.f93111d) {
                m82090a();
            } else {
                m82090a();
                if (aVar.f93058a) {
                    j = this.f93115h;
                } else {
                    j = this.f93114g;
                }
                mo75284a(j);
            }
            if (aVar.f93058a) {
                this.f93111d = true;
            }
        }
    }

    public NoOperateModeController(FragmentActivity fragmentActivity, View view) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(view, "rootView");
        this.f93112e = fragmentActivity;
        this.f93113f = view;
        this.f93112e.getLifecycle().mo324a(this);
        C0176h lifecycle = this.f93112e.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo323a().isAtLeast(C0178b.RESUMED)) {
            mo75284a(this.f93114g);
        }
        C47718bf.m103290c(this);
    }
}
