package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1816c;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.C33703c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34622g;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.c.a */
public final class C33370a {

    /* renamed from: a */
    public final C0184k f86535a;

    /* renamed from: b */
    public final View f86536b;

    /* renamed from: c */
    public final RecyclerView f86537c;

    /* renamed from: d */
    public final C33689r f86538d;

    public C33370a(C0184k kVar, View view, RecyclerView recyclerView, C33689r rVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(rVar, "adapter");
        this.f86535a = kVar;
        this.f86536b = view;
        this.f86537c = recyclerView;
        this.f86538d = rVar;
        this.f86538d.mo71708a((C33703c) new C33703c(this) {

            /* renamed from: a */
            final /* synthetic */ C33370a f86539a;

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.c.a$1$a */
            static final class C33372a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ int f86540a;

                /* renamed from: b */
                final /* synthetic */ C333711 f86541b;

                C33372a(int i, C333711 r2) {
                    this.f86540a = i;
                    this.f86541b = r2;
                }

                public final void run() {
                    this.f86541b.f86539a.f86537c.mo4833d(this.f86540a);
                }
            }

            {
                this.f86539a = r1;
            }

            /* renamed from: a */
            public final void mo70733a() {
                C11180b a = C11182d.m22641a().mo20658a(this.f86539a.f86538d.f87368m.getConversationId());
                if (a != null) {
                    if (C34604d.f89152b.mo72653a(a)) {
                        C34622g c = C34604d.m78559c(a);
                        if (c != null && c.getMark_read() == 1) {
                            C32458a.m75141a(4, "DmHelper", "DmLikeLocateDelegate->not locate cause mark_read");
                            return;
                        } else if (c != null) {
                            String message_id = c.getMessage_id();
                            if (message_id != null) {
                                int a2 = this.f86539a.f86538d.mo71703a(message_id);
                                if (a2 != -1) {
                                    StringBuilder sb = new StringBuilder("DmLikeLocateDelegate->locate:");
                                    sb.append(a2);
                                    C32458a.m75141a(4, "DmHelper", sb.toString());
                                    this.f86539a.f86537c.post(new C33372a(a2, this));
                                }
                            }
                        }
                    }
                    C34604d dVar = C34604d.f89152b;
                    if (a != null) {
                        C34622g c2 = C34604d.m78559c(a);
                        if (c2 != null) {
                            c2.setMark_read(1);
                            Map localExt = a.getLocalExt();
                            if (localExt != null) {
                                localExt.put("a:s_latest_message_property", C34604d.f89151a.mo34889b(c2));
                                a.setLocalExt(localExt);
                                String conversationId = a.getConversationId();
                                StringBuilder sb2 = new StringBuilder("markLastPropertyRead :");
                                sb2.append(conversationId);
                                C32458a.m75141a(3, "DmHelper", sb2.toString());
                                C11190e.m22688a(conversationId, localExt, (Runnable) null);
                            }
                        }
                    }
                }
            }
        });
    }
}
