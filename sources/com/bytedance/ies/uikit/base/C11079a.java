package com.bytedance.ies.uikit.base;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.p522b.C9379e;
import java.util.Iterator;

/* renamed from: com.bytedance.ies.uikit.base.a */
public abstract class C11079a extends Fragment implements C11086d {

    /* renamed from: a */
    private C9379e<C11087e> f29768a = new C9379e<>();

    /* renamed from: b_ */
    public boolean f29769b_;

    /* renamed from: g */
    protected boolean f29770g;

    /* renamed from: h */
    public boolean f29771h;

    /* renamed from: i */
    protected boolean f29772i = true;

    /* renamed from: Z_ */
    public final boolean mo20100Z_() {
        return this.f29769b_;
    }

    public boolean isViewValid() {
        return this.f29770g;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f29770g = false;
    }

    public final boolean aa_() {
        if (VERSION.SDK_INT < 15) {
            return this.f29772i;
        }
        return getUserVisibleHint();
    }

    public void onPause() {
        FragmentInstrumentation.onPause(this);
        super.onPause();
        if (!this.f29768a.mo17007b()) {
            Iterator it = this.f29768a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f29770g = false;
        this.f29771h = true;
        if (!this.f29768a.mo17007b()) {
            Iterator it = this.f29768a.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bi_();
                }
            }
            this.f29768a.mo17004a();
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        this.f29769b_ = true;
        if (!this.f29768a.mo17007b()) {
            Iterator it = this.f29768a.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.mo20108a();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f29769b_ = false;
        if (!this.f29768a.mo17007b()) {
            Iterator it = this.f29768a.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bj_();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20101a(C11087e eVar) {
        this.f29768a.mo17005a(eVar);
    }

    /* renamed from: b */
    public final void mo20103b(C11087e eVar) {
        this.f29768a.mo17006b(eVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29769b_ = false;
        this.f29770g = false;
        this.f29771h = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f29770g = true;
    }
}
