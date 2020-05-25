package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a.C22704a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1356b.C22712a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.d */
public abstract class C22747d extends C22736a implements C22712a {

    /* renamed from: d */
    private DmtStatusView f60966d;

    /* renamed from: e */
    private C22704a f60967e;

    /* renamed from: j */
    private HashMap f60968j;

    /* renamed from: e */
    public abstract void mo47184e();

    /* renamed from: f */
    public void mo47199f() {
        if (this.f60968j != null) {
            this.f60968j.clear();
        }
    }

    /* renamed from: g */
    public final void mo47116g() {
        m56052i();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47199f();
    }

    /* renamed from: h */
    public void mo47117h() {
        m56052i();
        mo47184e();
    }

    /* renamed from: i */
    private final void m56052i() {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f60966d;
            if (dmtStatusView != null) {
                dmtStatusView.mo19209d();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C22704a aVar = this.f60967e;
        if (aVar != null) {
            aVar.mo47091a();
        }
    }

    /* renamed from: c */
    public final void mo47201c(String str) {
        if (!TextUtils.isEmpty(str)) {
            DmtStatusView dmtStatusView = this.f60966d;
            if (dmtStatusView != null) {
                dmtStatusView.mo19212f();
            }
            C22704a aVar = this.f60967e;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.mo47093a(str);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f60966d = (DmtStatusView) view.findViewById(R.id.csv);
        DmtStatusView dmtStatusView = this.f60966d;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a((Context) getActivity()));
        }
        this.f60967e = new C22704a();
        C22704a aVar = this.f60967e;
        if (aVar != null) {
            aVar.mo47092a((C22712a) this);
        }
    }
}
