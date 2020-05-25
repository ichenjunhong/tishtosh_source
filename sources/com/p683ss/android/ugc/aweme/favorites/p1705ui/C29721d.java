package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.view.View;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29667a;
import com.p683ss.android.ugc.aweme.favorites.model.C29705a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47875fa;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.d */
public final class C29721d extends C29716a {
    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: t */
    public final void mo59991t() {
        mo59987p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo59985n() {
        if (this.f77639k != null) {
            this.f77639k.mo54799a(new C29705a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C26840g mo59986o() {
        return new C29667a(getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo59983k() {
        if (this.f77639k != null) {
            this.f77639k.mo44934a_(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59984m() {
        if (this.f77639k != null) {
            this.f77639k.mo44934a_(Integer.valueOf(4));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo59989r() {
        if (getActivity() == null) {
            return null;
        }
        View a = C47875fa.m103567a(getActivity(), getContext(), R.string.b16, R.string.b15);
        if (a != null) {
            return a;
        }
        return super.mo59989r();
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/challenge/listcollection/?")) {
            C47718bf.m103293f(aVar);
            mo59983k();
        }
    }
}
