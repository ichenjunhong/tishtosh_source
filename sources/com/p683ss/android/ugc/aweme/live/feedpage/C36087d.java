package com.p683ss.android.ugc.aweme.live.feedpage;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.d */
final /* synthetic */ class C36087d implements C1710e {

    /* renamed from: a */
    private final C36084c f92465a;

    /* renamed from: b */
    private final C1710e f92466b;

    /* renamed from: c */
    private final long f92467c;

    /* renamed from: d */
    private final List f92468d;

    C36087d(C36084c cVar, C1710e eVar, long j, List list) {
        this.f92465a = cVar;
        this.f92466b = eVar;
        this.f92467c = j;
        this.f92468d = list;
    }

    public final void accept(Object obj) {
        long j;
        C36084c cVar = this.f92465a;
        C1710e eVar = this.f92466b;
        long j2 = this.f92467c;
        List<User> list = this.f92468d;
        C36091h hVar = (C36091h) obj;
        if (hVar != null && eVar != null) {
            Map a = hVar.f92473a.mo74842a();
            if (a != null) {
                Long l = (Long) a.get(Long.valueOf(j2));
                if (l == null) {
                    l = Long.valueOf(0);
                }
                if (l.longValue() != 0) {
                    cVar.f92451c.put(Long.valueOf(j2), l);
                    cVar.f92452d.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                }
                cVar.f92455g.put(Long.valueOf(j2), l);
                cVar.f92454f.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                if (!C9376b.m18558a((Collection<T>) list)) {
                    for (User user : list) {
                        if (user != null) {
                            try {
                                j = Long.parseLong(user.getUid());
                            } catch (Exception unused) {
                                j = 0;
                            }
                            Long l2 = (Long) a.get(Long.valueOf(j));
                            if (l2 == null) {
                                l2 = Long.valueOf(0);
                            }
                            if (l2.longValue() != 0) {
                                cVar.f92451c.put(Long.valueOf(j), l2);
                                cVar.f92452d.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                            }
                            cVar.f92455g.put(Long.valueOf(j), l2);
                            cVar.f92454f.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                }
                eVar.accept(l);
            }
        }
    }
}
