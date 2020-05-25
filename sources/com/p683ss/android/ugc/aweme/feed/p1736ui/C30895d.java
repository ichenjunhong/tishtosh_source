package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.d */
final /* synthetic */ class C30895d implements C1710e {

    /* renamed from: a */
    private final C30828c f80927a;

    /* renamed from: b */
    private final long f80928b;

    /* renamed from: c */
    private final User f80929c;

    /* renamed from: d */
    private final C1710e f80930d;

    C30895d(C30828c cVar, long j, User user, C1710e eVar) {
        this.f80927a = cVar;
        this.f80928b = j;
        this.f80929c = user;
        this.f80930d = eVar;
    }

    public final void accept(Object obj) {
        C30828c cVar = this.f80927a;
        long j = this.f80928b;
        User user = this.f80929c;
        C1710e eVar = this.f80930d;
        Map map = (Map) obj;
        if (map != null) {
            Long l = (Long) map.get(Long.valueOf(j));
            long j2 = 0;
            if ((l == null || l.longValue() == 0) && !C26235d.m63570a(cVar.f80766k)) {
                l = Long.valueOf(0);
                user.roomId = 0;
                cVar.mo63565b();
            } else {
                user.roomId = l != null ? l.longValue() : 0;
            }
            if (eVar != null) {
                if (l != null) {
                    j2 = l.longValue();
                }
                eVar.accept(new C36083b(j, j2));
            }
        }
    }
}
