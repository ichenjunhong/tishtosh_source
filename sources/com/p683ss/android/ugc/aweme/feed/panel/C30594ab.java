package com.p683ss.android.ugc.aweme.feed.panel;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.ab */
final /* synthetic */ class C30594ab implements C1710e {

    /* renamed from: a */
    private final C30648q f79903a;

    /* renamed from: b */
    private final Aweme f79904b;

    /* renamed from: c */
    private final int f79905c;

    /* renamed from: d */
    private final User f79906d;

    C30594ab(C30648q qVar, Aweme aweme, int i, User user) {
        this.f79903a = qVar;
        this.f79904b = aweme;
        this.f79905c = i;
        this.f79906d = user;
    }

    public final void accept(Object obj) {
        C30648q qVar = this.f79903a;
        Aweme aweme = this.f79904b;
        int i = this.f79905c;
        User user = this.f79906d;
        Long l = (Long) obj;
        if ((qVar.mo60519ak() == null || !qVar.mo60519ak().equals(aweme)) && qVar.mo60520al() < i) {
            if (l == null) {
                l = Long.valueOf(0);
            }
            if (!aweme.isLive()) {
                user.roomId = l.longValue();
            }
            if (aweme.isLive() && 0 == l.longValue()) {
                C47718bf.m103288a(new C30338g(aweme, qVar.ay_()));
            }
        }
    }
}
