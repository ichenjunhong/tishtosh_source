package com.p683ss.android.ugc.aweme.gecko;

import com.bytedance.ies.geckoclient.p687f.C10945a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38072o;
import com.p683ss.android.websocket.p2539b.p2540a.C50816d;
import com.p683ss.android.websocket.p2539b.p2540a.C50817e;
import java.util.HashMap;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.gecko.a */
public final class C32802a implements C10945a {
    /* renamed from: a */
    public final boolean mo19735a() {
        return C38064h.m85136d().f96844c;
    }

    /* renamed from: b */
    public final int mo19737b() {
        if (C38072o.f96862i.mo77629a().f96863a) {
            return 1239108;
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo19736a(String str) {
        return ((Boolean) SharePrefCache.inst().getUseNewPackageNow().mo47782d()).booleanValue();
    }

    /* renamed from: a */
    public final void mo19734a(String str, int i) {
        if (C38064h.m85136d().f96844c) {
            String e = C38064h.m85136d().mo77610e();
            C50817e eVar = new C50817e(e, 1012, 0, 0, i, str.getBytes(), "", "", new HashMap());
            C53755c.m114319a().mo112960d(new C50816d(e, eVar));
        }
    }
}
