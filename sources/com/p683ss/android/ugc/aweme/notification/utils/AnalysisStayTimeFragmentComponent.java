package com.p683ss.android.ugc.aweme.notification.utils;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent */
public class AnalysisStayTimeFragmentComponent implements C0183j {

    /* renamed from: a */
    public boolean f97856a = true;

    /* renamed from: b */
    private long f97857b = -1;

    /* renamed from: c */
    private WeakReference<C22582c> f97858c;

    /* renamed from: d */
    private Fragment f97859d;

    /* renamed from: a */
    private void m85769a() {
        this.f97857b = System.currentTimeMillis();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        if (this.f97856a) {
            m85770b();
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        if (this.f97856a) {
            m85769a();
        }
    }

    /* renamed from: c */
    private Analysis m85771c() {
        C22582c cVar;
        if (this.f97858c != null) {
            cVar = (C22582c) this.f97858c.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    /* renamed from: b */
    private void m85770b() {
        if (this.f97857b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f97857b;
            if (currentTimeMillis > 100 && m85771c() != null && !TextUtils.isEmpty(m85771c().getLabelName())) {
                C26890h.m65011a("stay_time", C23089d.m56640a().mo47829a("duration", String.valueOf(currentTimeMillis)).mo47829a("enter_from", m85771c().getLabelName()).f61491a);
            }
            this.f97857b = -1;
        }
    }

    /* renamed from: a */
    public final void mo78345a(boolean z) {
        this.f97856a = !z;
        if (this.f97856a) {
            m85769a();
        } else {
            m85770b();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f97859d = fragment;
        this.f97858c = new WeakReference<>((C22582c) fragment);
        fragment.getLifecycle().mo324a(this);
    }
}
