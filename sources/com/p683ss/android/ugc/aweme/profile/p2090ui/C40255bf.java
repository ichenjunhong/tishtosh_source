package com.p683ss.android.ugc.aweme.profile.p2090ui;

import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bf */
final /* synthetic */ class C40255bf implements C1710e {

    /* renamed from: a */
    private final I18nBaseUserProfileFragment f102796a;

    C40255bf(I18nBaseUserProfileFragment i18nBaseUserProfileFragment) {
        this.f102796a = i18nBaseUserProfileFragment;
    }

    public final void accept(Object obj) {
        I18nBaseUserProfileFragment i18nBaseUserProfileFragment = this.f102796a;
        Throwable a = C22971a.m56490a((Throwable) obj);
        if (a instanceof C23459a) {
            C22971a.m56491a(i18nBaseUserProfileFragment.getContext(), (C23459a) a);
        } else {
            C32458a.m75148a(a);
        }
    }
}
