package com.p683ss.android.ugc.aweme.forward.p1776d;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31847i;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32379c.C32380a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32379c.C32381b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47724bl;

/* renamed from: com.ss.android.ugc.aweme.forward.d.c */
public class C32390c implements C9382a, C31847i, C32380a {

    /* renamed from: a */
    protected C32381b f84296a;

    /* renamed from: b */
    protected Aweme f84297b;

    /* renamed from: c */
    protected C31848j f84298c;

    /* renamed from: d */
    public String f84299d;

    /* renamed from: e */
    protected String f84300e;

    /* renamed from: f */
    protected boolean f84301f;

    /* renamed from: g */
    protected boolean f84302g;

    /* renamed from: h */
    protected C9381g f84303h;

    /* renamed from: i */
    protected Runnable f84304i = new Runnable() {
        public final void run() {
            if (C32390c.this.f84296a.mo65547c()) {
                C32390c.this.f84296a.mo65550f();
            }
        }
    };

    /* renamed from: j */
    protected C31854k f84305j = new C31854k() {
        /* renamed from: d */
        public final void mo56770d() {
            C32390c.this.mo65572k();
        }

        /* renamed from: e */
        public final void mo56771e() {
            C32390c.this.mo56771e();
        }

        /* renamed from: a */
        public final Rect mo56766a() {
            return C32390c.this.f84296a.mo65549e();
        }

        /* renamed from: a */
        public final void mo56767a(int i) {
            C32390c.this.mo65565a(i);
        }

        /* renamed from: b */
        public final void mo64811b(int i) {
            C32390c.this.mo65567b(i);
        }
    };

    /* renamed from: b */
    public void mo65541b() {
        this.f84301f = false;
    }

    /* renamed from: b */
    public void mo65567b(int i) {
    }

    /* renamed from: e */
    public void mo56771e() {
        mo65579m();
    }

    /* renamed from: f */
    public void mo65544f() {
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: k */
    public void mo65572k() {
        this.f84303h.removeCallbacks(this.f84304i);
    }

    /* renamed from: a */
    public void mo65539a() {
        this.f84301f = true;
        if (!mo65568g()) {
            mo65575l();
        }
    }

    /* renamed from: c */
    public void mo65542c() {
        this.f84302g = true;
        this.f84298c.mo64960a(this.f84305j);
        mo65570i();
    }

    /* renamed from: l */
    private void mo65575l() {
        if (this.f84297b != null) {
            C31842e i = mo65570i();
            if (i != null) {
                i.mo64947b(this.f84299d);
            }
        }
    }

    /* renamed from: m */
    private void mo65579m() {
        if (this.f84297b != null) {
            C31842e i = mo65570i();
            if (i != null) {
                i.mo64944a(this.f84299d);
            }
        }
    }

    /* renamed from: d */
    public void mo65543d() {
        this.f84302g = false;
        this.f84298c.mo64962b(this.f84305j);
        mo65575l();
        this.f84298c.mo64962b(this.f84305j);
        this.f84303h.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo65568g() {
        if (this.f84297b == null) {
            return false;
        }
        C31842e i = mo65570i();
        if (i == null || !i.f83202c.mo95019c(16777216)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo65569h() {
        if (this.f84297b == null) {
            return false;
        }
        C31842e i = mo65570i();
        if (i == null || !i.f83202c.mo95019c(UnReadVideoExperiment.BROWSE_RECORD_LIST)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo65571j() {
        if (this.f84297b != null) {
            C31843f.m74206a().mo64952b(C31842e.m74200a(this.f84296a.mo65545a().mo64657d(), this.f84297b.getAid()));
        }
    }

    /* renamed from: i */
    public final C31842e mo65570i() {
        C31842e eVar;
        if (this.f84297b != null) {
            eVar = C31843f.m74206a().mo64954c(C31842e.m74200a(this.f84296a.mo65545a().mo64657d(), this.f84297b.getAid()));
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return mo65580n();
        }
        return eVar;
    }

    /* renamed from: n */
    private C31842e mo65580n() {
        C47724bl blVar;
        if (this.f84297b == null) {
            return null;
        }
        if (this.f84296a.mo65554n().mo95019c(1)) {
            blVar = new C47724bl(1);
        } else {
            blVar = new C47724bl(16);
        }
        String a = C31842e.m74200a(this.f84296a.mo65545a().mo64657d(), this.f84297b.getAid());
        C31842e eVar = new C31842e(this.f84297b, blVar, a);
        C31843f.m74206a().mo64951a(a, eVar);
        return eVar;
    }

    /* renamed from: a */
    public void mo65566a(long j) {
        if (this.f84296a.mo65554n().mo95019c(1)) {
            this.f84303h.postDelayed(this.f84304i, j);
        }
    }

    /* renamed from: a */
    public void mo65565a(int i) {
        if (!(this.f84297b == null || this.f84297b.getAuthor() == null || !this.f84297b.getAuthor().isLive())) {
            User author = this.f84297b.getAuthor();
            C46641d.m101220b(this.f84296a.mo65546b(), 0, author.getRequestId(), author.getUid(), author.roomId, "homepage_follow");
        }
        mo65579m();
    }

    public C32390c(C32381b bVar, C31848j jVar) {
        this.f84296a = bVar;
        this.f84298c = jVar;
        this.f84303h = new C9381g(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public void mo65540a(Aweme aweme, String str, String str2) {
        this.f84297b = aweme;
        this.f84299d = str;
        this.f84300e = str2;
        mo65570i();
    }
}
