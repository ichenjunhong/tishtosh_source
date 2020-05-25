package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.af */
public abstract class C30750af extends C23526a {

    /* renamed from: p */
    protected long f80579p = -1;

    /* renamed from: q */
    protected String f80580q;

    /* renamed from: r */
    protected int f80581r;

    /* renamed from: s */
    public Fragment f80582s;

    /* renamed from: t */
    protected String f80583t;

    /* renamed from: u */
    public String f80584u;

    public abstract void bD_();

    /* renamed from: d_ */
    public abstract boolean mo59855d_(boolean z);

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: v */
    public final String mo63441v() {
        return this.f80580q;
    }

    /* renamed from: w */
    public int mo63442w() {
        return 0;
    }

    /* renamed from: x */
    public String mo63443x() {
        return null;
    }

    public void onPause() {
        super.onPause();
        mo63440u();
    }

    public void onResume() {
        super.onResume();
        mo63439t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo63439t() {
        if (getUserVisibleHint() && (getActivity() instanceof C36663h) && this.f80579p == -1 && ((C36663h) getActivity()).isMainTabVisible()) {
            this.f80579p = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public void mo63440u() {
        if (getUserVisibleHint() && this.f80579p != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f80579p;
            if (currentTimeMillis > 0) {
                if ("nearby".equals(this.f80580q)) {
                    this.f80580q = "homepage_fresh";
                }
                C18842a.m45932a(new C30751ag(this, currentTimeMillis));
            }
            this.f80579p = -1;
        }
    }

    /* renamed from: e */
    public void mo63328e(boolean z) {
        mo63439t();
    }

    /* renamed from: f */
    public void mo63329f(boolean z) {
        mo63440u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63435a(long j) {
        new C23213as().mo48005a(String.valueOf(j)).mo48006b(this.f80580q).mo48076e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo63437b(long j) {
        C26890h.m65004a(getContext(), "stay_time", this.f80580q, j, 0);
        mo63435a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo63438g(boolean z) {
        if (getUserVisibleHint() && (getActivity() instanceof C36663h)) {
            C36663h hVar = (C36663h) getActivity();
            if (hVar != null) {
                hVar.setTabBackground(z);
            }
        }
    }

    /* renamed from: a */
    public void mo63436a(Bundle bundle) {
        if (bundle != null) {
            this.f80581r = bundle.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            this.f80580q = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
            this.f80583t = bundle.getString("extra_follow_type", "extra_follow_type_follow");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo63436a(getArguments());
    }
}
