package com.p683ss.android.ugc.trill.share.base;

import com.bytedance.common.utility.C9395d;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a;

/* renamed from: com.ss.android.ugc.trill.share.base.j */
public final class C50441j {

    /* renamed from: a */
    C50442a f126485a;

    /* renamed from: com.ss.android.ugc.trill.share.base.j$a */
    public static class C50442a {

        /* renamed from: a */
        long f126486a;

        /* renamed from: b */
        int f126487b;

        /* renamed from: c */
        String f126488c;

        /* renamed from: d */
        String f126489d;

        /* renamed from: e */
        int f126490e;

        /* renamed from: f */
        boolean f126491f;

        /* renamed from: g */
        Aweme f126492g;

        public C50442a(Aweme aweme, String str) {
            this.f126492g = aweme;
            this.f126490e = C30530a.m71491a(aweme) ? 1 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(TeaAgent.getServerDeviceId());
            sb.append(System.currentTimeMillis());
            this.f126488c = C9395d.m18571a(sb.toString());
        }
    }

    public C50441j(C50442a aVar) {
        this.f126485a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo98356a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C26890h.m65011a("client_watermark_end", new C23089d().mo47827a("end_watermark", currentTimeMillis).mo47829a("watermark_id", this.f126485a.f126488c).mo47827a("duration", currentTimeMillis - this.f126485a.f126486a).mo47826a("watermark_sdk", this.f126485a.f126487b).mo47829a("watermark_type", this.f126485a.f126489d).mo47826a("is_self_video", this.f126485a.f126490e).mo47826a("is_composer_watermark_success", i).f61491a);
    }
}
