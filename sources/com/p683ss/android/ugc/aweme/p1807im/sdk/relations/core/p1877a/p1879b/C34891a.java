package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1879b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34885c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1880c.C34898a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b.a */
public final class C34891a implements C27979p {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89864a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34891a.class), "heartbeatHandler", "getHeartbeatHandler()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/active/internal/UserActiveStatusReporter$heartbeatHandler$2$1;"))};

    /* renamed from: c */
    public static final C34892a f89865c = new C34892a(null);

    /* renamed from: b */
    public C34898a f89866b;

    /* renamed from: d */
    private final C52668f f89867d = C52732g.m112285a(new C34893b(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b.a$a */
    public static final class C34892a {
        private C34892a() {
        }

        public /* synthetic */ C34892a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b.a$b */
    static final class C34893b extends C52712l implements C52670a<C348941> {

        /* renamed from: a */
        final /* synthetic */ C34891a f89868a;

        C34893b(C34891a aVar) {
            this.f89868a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler(this, Looper.getMainLooper()) {

                /* renamed from: a */
                final /* synthetic */ C34893b f89869a;

                public final void handleMessage(Message message) {
                    C34891a aVar = this.f89869a.f89868a;
                    C34885c cVar = C34885c.HEARTBEAT;
                    boolean h = C11016e.m22313h();
                    StringBuilder sb = new StringBuilder("doRealReportInternal scene=");
                    sb.append(cVar.getValue());
                    sb.append(", background=");
                    sb.append(h);
                    sb.append(", config=");
                    C34898a aVar2 = aVar.f89866b;
                    if (aVar2 == null) {
                        C52711k.m112237a("internalConfig");
                    }
                    sb.append(aVar2);
                    C34898a aVar3 = aVar.f89866b;
                    if (aVar3 == null) {
                        C52711k.m112237a("internalConfig");
                    }
                    aVar3.mo73011a();
                }

                {
                    this.f89869a = r1;
                }
            };
        }
    }

    /* renamed from: e */
    private final C348941 m78994e() {
        return (C348941) this.f89867d.getValue();
    }

    /* renamed from: b */
    public final void mo47072b() {
        mo73008d();
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: a */
    public final void mo47070a() {
        mo73006a(C34885c.FRONT);
    }

    /* renamed from: d */
    public final void mo73008d() {
        if (m78994e().hasMessages(1)) {
            m78994e().removeMessages(1);
        }
    }

    public C34891a() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null) {
            f.registerAppStateCallback(this);
        }
    }

    /* renamed from: a */
    public final void mo73006a(C34885c cVar) {
        if (this.f89866b != null) {
            C34898a aVar = this.f89866b;
            if (aVar == null) {
                C52711k.m112237a("internalConfig");
            }
            aVar.mo73011a();
        }
    }

    /* renamed from: a */
    public final void mo73007a(C34898a aVar, boolean z) {
        C52711k.m112240b(aVar, "config");
        aVar.mo73011a();
        this.f89866b = aVar.mo73013c();
        aVar.mo73011a();
        mo73008d();
    }
}
