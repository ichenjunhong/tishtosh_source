package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.os.Message;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11242v;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateMarkDelegate */
public final class ReadStateMarkDelegate extends AbsReadStateDelegate {

    /* renamed from: b */
    public static final C33335a f86446b = new C33335a(null);

    /* renamed from: c */
    private boolean f86447c;

    /* renamed from: d */
    private boolean f86448d = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateMarkDelegate$a */
    public static final class C33335a {
        private C33335a() {
        }

        public /* synthetic */ C33335a(C52707g gVar) {
            this();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo70679c() {
        sendEmptyMessageDelayed(0, 1000);
    }

    public final void onResume() {
        this.f86448d = true;
        m76464d();
    }

    public final void onStop() {
        m76464d();
        this.f86448d = false;
    }

    /* renamed from: b */
    public final void mo70639b() {
        this.f86447c = true;
        sendEmptyMessageDelayed(0, 2000);
    }

    /* renamed from: d */
    private final void m76464d() {
        Object obj;
        if (this.f86448d) {
            Long l = null;
            if (this.f86381a.mo70865e().getChatType() == 1) {
                C11242v.m22830a().mo20938a(this.f86381a.mo70865e().getConversationId(), null);
                return;
            }
            C11180b f = this.f86381a.mo70866f();
            if (f == null || f.isTemp() || f.getConversationShortId() <= 0) {
                StringBuilder sb = new StringBuilder("startMarkReadReal conversation not prepared: ");
                if (f != null) {
                    obj = Boolean.valueOf(f.isTemp());
                } else {
                    obj = null;
                }
                sb.append(obj);
                sb.append(", ");
                if (f != null) {
                    l = Long.valueOf(f.getConversationShortId());
                }
                sb.append(l);
                return;
            }
            C11182d.m22641a();
            C11182d.m22644b(f.getConversationId());
        }
    }

    public ReadStateMarkDelegate(C33449f fVar) {
        C52711k.m112240b(fVar, "dataCenter");
        super(fVar);
    }

    public final void handleMessage(Message message) {
        ReadStateMarkDelegate readStateMarkDelegate;
        if (message != null && message.what == 0) {
            removeMessages(0);
            if (this.f86447c) {
                readStateMarkDelegate = this;
            } else {
                readStateMarkDelegate = null;
            }
            ReadStateMarkDelegate readStateMarkDelegate2 = readStateMarkDelegate;
            if (readStateMarkDelegate2 != null) {
                readStateMarkDelegate2.m76464d();
            }
            this.f86447c = false;
        }
    }
}
