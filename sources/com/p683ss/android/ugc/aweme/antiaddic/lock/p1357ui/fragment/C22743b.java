package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a.C22704a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1356b.C22712a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.b */
public abstract class C22743b extends C22736a implements C22712a {

    /* renamed from: d */
    protected boolean f60959d;

    /* renamed from: e */
    protected C22704a f60960e;

    /* renamed from: j */
    protected DmtStatusView f60961j;

    /* renamed from: k */
    private View f60962k;

    /* renamed from: g */
    public void mo47116g() {
        m56043i();
    }

    /* renamed from: h */
    public void mo47117h() {
        m56043i();
    }

    /* renamed from: i */
    private void m56043i() {
        if (isViewValid() && this.f60961j != null) {
            this.f60961j.mo19209d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo47197f() {
        if (this.f60961j != null) {
            this.f60961j.mo19212f();
        }
    }

    /* renamed from: e */
    public final int mo47196e() {
        return ((C22781a) ((SetLockParamViewModel) C0214z.m440a(getActivity()).mo359a(SetLockParamViewModel.class)).f61035a.getValue()).f61037a;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f60960e != null && isViewValid()) {
            this.f60960e.mo47091a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60962k = view.findViewById(R.id.ik);
        this.f60962k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C22743b.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f60959d = arguments.getBoolean("from_change_pwd", false);
        }
        this.f60960e = new C22704a();
        this.f60960e.mo47092a((C22712a) this);
    }
}
