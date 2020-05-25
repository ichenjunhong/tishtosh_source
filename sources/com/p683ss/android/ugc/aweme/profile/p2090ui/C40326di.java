package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.di */
final /* synthetic */ class C40326di implements C1710e {

    /* renamed from: a */
    private final ProfileMoreFragment f102932a;

    C40326di(ProfileMoreFragment profileMoreFragment) {
        this.f102932a = profileMoreFragment;
    }

    public final void accept(Object obj) {
        ProfileMoreFragment profileMoreFragment = this.f102932a;
        Throwable th = (Throwable) obj;
        if (th instanceof C23459a) {
            C22971a.m56491a((Context) profileMoreFragment.getActivity(), (C23459a) th);
        } else {
            C32458a.m75148a(th);
        }
    }
}
