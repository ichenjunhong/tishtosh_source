package com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1680ad;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.b */
public final class C45289b {

    /* renamed from: a */
    public C45290a f114523a = new C45290a();

    /* renamed from: b */
    public C1690c f114524b;

    /* renamed from: c */
    public int f114525c = -1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.b$a */
    public static final class C45290a {

        /* renamed from: a */
        public boolean f114526a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.b$b */
    static final class C45291b<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C45289b f114527a;

        C45291b(C45289b bVar) {
            this.f114527a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f114527a.mo91550b();
        }
    }

    /* renamed from: d */
    private final boolean m98757d() {
        if (this.f114524b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo91550b() {
        int i;
        if (this.f114523a.f114526a) {
            i = 2012;
        } else {
            i = 2013;
        }
        m98756a(i);
        this.f114524b = null;
    }

    /* renamed from: c */
    public final void mo91551c() {
        if (m98757d()) {
            this.f114523a.f114526a = true;
            C1690c cVar = this.f114524b;
            if (cVar != null) {
                cVar.dispose();
            }
            mo91550b();
        }
    }

    /* renamed from: a */
    public final void mo91549a() {
        if (this.f114525c < 0) {
            this.f114525c = C39618d.f101152P.mo83104b(C40790a.PublishOnNewIntentCheckDelay);
        }
        if (this.f114525c > 0) {
            if (m98757d()) {
                m98756a(2011);
                C1690c cVar = this.f114524b;
                if (cVar != null) {
                    cVar.dispose();
                }
            }
            this.f114523a = new C45290a();
            this.f114524b = C1680ad.m5956a((long) this.f114525c, TimeUnit.SECONDS).mo6155b(C1667a.m5940a()).mo6162d(new C45291b(this));
        }
    }

    /* renamed from: a */
    private final void m98756a(int i) {
        StringBuilder sb = new StringBuilder("new_intent_invoke_after_publish stateCode:");
        sb.append(i);
        sb.append(" delayTime:");
        sb.append(this.f114525c);
        sb.append(' ');
        C50203g.m108358a(sb.toString());
        C23569o.m57776a("new_intent_invoke_after_publish", i, C23088c.m56631a().mo47822a("delayTime", Integer.valueOf(this.f114525c)).mo47825b());
        if (i != 2012) {
            C23569o.m57776a("publish_process_error", i, C23088c.m56631a().mo47822a("delayTime", Integer.valueOf(this.f114525c)).mo47825b());
        }
        C26890h.m65011a("new_intent_invoke_after_publish", C23089d.m56640a().mo47826a("status", i).mo47826a("delayTime", this.f114525c).f61491a);
    }
}
