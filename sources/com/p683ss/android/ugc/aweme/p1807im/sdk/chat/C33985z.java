package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.z */
public final class C33985z {

    /* renamed from: e */
    public static final C33986a f87892e = new C33986a(null);

    /* renamed from: a */
    C11207p f87893a;

    /* renamed from: b */
    int f87894b = -1;

    /* renamed from: c */
    boolean f87895c;

    /* renamed from: d */
    final C11180b f87896d;

    /* renamed from: f */
    private C11207p f87897f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.z$a */
    public static final class C33986a {
        private C33986a() {
        }

        public /* synthetic */ C33986a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo71916a() {
        Object obj;
        if (this.f87893a == null || C52711k.m112239a((Object) this.f87897f, (Object) this.f87893a)) {
            StringBuilder sb = new StringBuilder("reportMessageReply lastReportMessage has been replied: ");
            C11207p pVar = this.f87893a;
            Long l = null;
            if (pVar != null) {
                obj = Long.valueOf(pVar.getMsgId());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            C11207p pVar2 = this.f87897f;
            if (pVar2 != null) {
                l = Long.valueOf(pVar2.getMsgId());
            }
            sb.append(l);
            return;
        }
        this.f87897f = this.f87893a;
        mo71917a("replied");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo71917a(String str) {
        C35193ai.m79544a(this.f87896d, str);
    }

    public C33985z(C11180b bVar) {
        C52711k.m112240b(bVar, "conversation");
        this.f87896d = bVar;
    }
}
