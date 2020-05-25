package com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger;

import android.os.Message;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34553j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerSessionList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34597i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35202ap;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c */
public final class C34684c implements C9382a {

    /* renamed from: a */
    public C9381g f89353a;

    /* renamed from: b */
    public C34687b f89354b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c$a */
    static class C34686a {

        /* renamed from: a */
        public static final C34684c f89359a = new C34684c();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c$b */
    public interface C34687b {
        void onFetch(C34597i iVar);
    }

    /* renamed from: a */
    public static C34684c m78664a() {
        return C34686a.f89359a;
    }

    private C34684c() {
        this.f89353a = new C9381g(this);
    }

    /* renamed from: a */
    public final void mo72745a(C34687b bVar) {
        this.f89354b = bVar;
        m78665a(0, 1, false);
    }

    public final void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C23459a) {
            C9432q.m18676a(C11010c.m22280a(), ((C23459a) obj).getErrorMsg());
        } else if (obj instanceof Exception) {
            C9432q.m18676a(C11010c.m22280a(), C11010c.m22280a().getString(R.string.bl7));
        } else {
            if (i == 1) {
                StrangerSessionList strangerSessionList = (StrangerSessionList) obj;
                if (strangerSessionList != null) {
                    C34687b bVar = this.f89354b;
                    if (bVar != null) {
                        List a = C34553j.m78483a(strangerSessionList.getLastMsg());
                        if (!a.isEmpty()) {
                            bVar.onFetch((C34597i) a.get(0));
                            return;
                        }
                        bVar.onFetch(null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m78665a(long j, long j2, boolean z) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.f89353a;
        C346851 r0 = new Callable(0, 1, false) {
            public final Object call() throws Exception {
                try {
                    return C35286u.m79864a(0, 1, false);
                } catch (ExecutionException e) {
                    throw C35202ap.m79581a(e);
                }
            }
        };
        a.mo48750a(gVar, r0, 1);
    }
}
