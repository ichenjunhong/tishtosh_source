package com.p683ss.android.ugc.aweme.base.component;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent */
public class AnalysisStayTimeFragmentComponent implements C0183j {

    /* renamed from: a */
    public boolean f62563a;

    /* renamed from: b */
    public C23492a f62564b;

    /* renamed from: c */
    private long f62565c = -1;

    /* renamed from: d */
    private WeakReference<C22582c> f62566d;

    /* renamed from: e */
    private Fragment f62567e;

    /* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent$a */
    public interface C23492a {
        /* renamed from: a */
        C23213as mo48657a(C23213as asVar);
    }

    /* renamed from: b */
    private void m57639b() {
        this.f62565c = System.currentTimeMillis();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        if (this.f62563a) {
            m57640c();
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        if (this.f62563a) {
            m57639b();
        }
    }

    /* renamed from: a */
    public final Analysis mo48651a() {
        C22582c cVar;
        if (this.f62566d != null) {
            cVar = (C22582c) this.f62566d.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    /* renamed from: c */
    private void m57640c() {
        if (this.f62565c != -1) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f62565c;
            if (currentTimeMillis > 100 && mo48651a() != null && !TextUtils.isEmpty(mo48651a().getLabelName())) {
                C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        C23213as b = new C23213as().mo48005a(String.valueOf(currentTimeMillis)).mo48006b(AnalysisStayTimeFragmentComponent.this.mo48651a().getLabelName());
                        if (AnalysisStayTimeFragmentComponent.this.f62564b != null) {
                            b = AnalysisStayTimeFragmentComponent.this.f62564b.mo48657a(b);
                        }
                        b.mo48076e();
                        return null;
                    }
                }, (Executor) C26890h.m65003a());
            }
            this.f62565c = -1;
        }
    }

    /* renamed from: a */
    public final void mo48652a(boolean z) {
        mo48653b(!z);
    }

    /* renamed from: b */
    public final void mo48653b(boolean z) {
        this.f62563a = z;
        if (this.f62563a) {
            m57639b();
        } else {
            m57640c();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f62563a = z;
        this.f62567e = fragment;
        this.f62566d = new WeakReference<>((C22582c) fragment);
        fragment.getLifecycle().mo324a(this);
    }
}
