package com.bytedance.android.livesdk.rank.p412e;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.p409b.C8131a.C8132a;
import com.bytedance.android.livesdk.rank.p409b.C8131a.C8133b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.bytedance.android.livesdk.rank.e.e */
public final class C8151e implements C8132a, C9382a {

    /* renamed from: a */
    private final C9381g f22256a = new C9381g(this);

    /* renamed from: b */
    private final C8133b f22257b;

    /* renamed from: c */
    private final long f22258c;

    /* renamed from: d */
    private final long f22259d;

    /* renamed from: e */
    private boolean f22260e = false;

    /* renamed from: b */
    public final void mo14328b() {
        this.f22256a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo14326a() {
        if (!this.f22260e) {
            this.f22260e = true;
            C5014i.m11510a((Handler) this.f22256a, this.f22259d, this.f22258c, 12, 0);
        }
    }

    /* renamed from: a */
    public final void mo14327a(int i) {
        C5014i.m11510a((Handler) this.f22256a, this.f22259d, this.f22258c, i, 0);
    }

    public final void handleMsg(Message message) {
        long j = 0;
        if (message.what == 12) {
            this.f22260e = false;
            if (message.obj instanceof Exception) {
                this.f22257b.mo14321a((Exception) message.obj);
                return;
            }
            C4175b bVar = (C4175b) message.obj;
            C8214a aVar = (C8214a) bVar.data;
            if (bVar.extra != null) {
                j = bVar.extra.now;
            }
            aVar.f22430r = j;
            this.f22257b.mo14319a(aVar);
        } else if (message.obj instanceof Exception) {
            this.f22257b.mo14320a(null, message.what);
        } else {
            C4175b bVar2 = (C4175b) message.obj;
            C8214a aVar2 = (C8214a) bVar2.data;
            if (bVar2.extra != null) {
                j = bVar2.extra.now;
            }
            aVar2.f22430r = j;
            this.f22257b.mo14320a(aVar2, message.what);
        }
    }

    public C8151e(C8133b bVar, long j, long j2) {
        this.f22257b = bVar;
        this.f22258c = j;
        this.f22259d = j2;
    }
}
