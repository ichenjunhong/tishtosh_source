package com.p683ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.common.component.p2417a.C48520b;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.p */
public abstract class C30647p extends C48520b {

    /* renamed from: a */
    private boolean f80087a;

    /* renamed from: b */
    private Unbinder f80088b;

    /* renamed from: bx */
    public final boolean mo62963bx() {
        return this.f80087a;
    }

    /* renamed from: h */
    public boolean mo58030h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public boolean mo62788as() {
        Fragment aC_ = aC_();
        if (aC_ == null || !aC_.isResumed()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: by */
    public final C0654k mo62964by() {
        C11079a aVar = (C11079a) aC_();
        if (aVar == null) {
            return null;
        }
        return aVar.getChildFragmentManager();
    }

    /* access modifiers changed from: protected */
    public final boolean aB_() {
        C11079a aVar = (C11079a) aC_();
        if (aVar == null || !aVar.mo20100Z_()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public boolean mo62868bh() {
        C11079a aVar = (C11079a) aC_();
        if (aVar == null || !aVar.isViewValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void mo55813m() {
        super.mo55813m();
        if (this.f80088b != null) {
            this.f80088b.unbind();
        }
        if (mo58030h()) {
            C47718bf.m103291d(this);
        }
    }

    /* renamed from: f */
    public void mo55808f(boolean z) {
        this.f80087a = z;
    }

    /* renamed from: a */
    public void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
        ButterKnife.bind((Object) this, view);
        if (mo58030h()) {
            C47718bf.m103290c(this);
        }
    }
}
