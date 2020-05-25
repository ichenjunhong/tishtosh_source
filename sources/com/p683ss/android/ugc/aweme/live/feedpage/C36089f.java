package com.p683ss.android.ugc.aweme.live.feedpage;

import java.util.Map;
import java.util.Set;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.f */
final /* synthetic */ class C36089f implements C1710e {

    /* renamed from: a */
    private final C36086a f92470a;

    /* renamed from: b */
    private final long f92471b;

    C36089f(C36086a aVar, long j) {
        this.f92470a = aVar;
        this.f92471b = j;
    }

    public final void accept(Object obj) {
        C36086a aVar = this.f92470a;
        long j = this.f92471b;
        C36091h hVar = (C36091h) obj;
        Set<Long> set = aVar.f92461c;
        if (!hVar.mo74841a().isEmpty()) {
            Set<Long> keySet = hVar.mo74841a().keySet();
            Map a = hVar.mo74841a();
            for (Long l : keySet) {
                C36084c.this.f92452d.put(l, Long.valueOf(j));
                Long l2 = (Long) a.get(l);
                if (l2 == null) {
                    l2 = Long.valueOf(0);
                }
                if (!C36084c.f92449b.equals(l2)) {
                    C36084c.this.f92451c.put(l, l2);
                } else {
                    C36084c.this.f92451c.remove(l);
                }
            }
        } else {
            C36084c.this.f92451c.put(aVar.f92460b, Long.valueOf(0));
        }
        aVar.mo74839a();
    }
}
