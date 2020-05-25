package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p720c.C11442b;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11469g;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11501n;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessageDirection;
import com.bytedance.p702im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.p702im.core.proto.RecallMessageRequestBody;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.b.a.r */
public final class C11409r implements C11502a {

    /* renamed from: c */
    private static C11409r f30658c;

    /* renamed from: a */
    public C11501n f30659a = new C11501n(Looper.getMainLooper(), this);

    /* renamed from: b */
    public boolean f30660b;

    /* renamed from: a */
    public final void mo20961a(Message message) {
        if (message.obj instanceof C11447f) {
            C11447f fVar = (C11447f) message.obj;
            if (fVar.f30733h != null) {
                fVar.f30733h.mo21059c(fVar);
            }
        }
    }

    /* renamed from: a */
    public static void m23301a(String str, List<Long> list, Map<String, String> map, C11162b<List<C11206o>> bVar) {
        C11325a aVar = new C11325a(bVar);
        if (list != null && !list.isEmpty()) {
            C11180b a = C11182d.m22641a().mo20658a(str);
            if (a != null) {
                aVar.mo21028a(str, a.getConversationShortId(), list, a.getConversationType(), a.getInboxType(), map, null);
            }
        }
    }

    private C11409r() {
        C11442b a = C11442b.m23355a();
        C11501n nVar = this.f30659a;
        a.f30715a.mo21077a(nVar);
        a.f30716b.mo21077a(nVar);
    }

    /* renamed from: a */
    public static C11409r m23292a() {
        if (f30658c == null) {
            synchronized (C11409r.class) {
                if (f30658c == null) {
                    f30658c = new C11409r();
                }
            }
        }
        return f30658c;
    }

    /* renamed from: a */
    public final void mo21062a(Runnable runnable) {
        this.f30659a.post(runnable);
    }

    /* renamed from: a */
    public static void m23294a(int i) {
        new C11342ae(i).mo21034b();
    }

    /* renamed from: b */
    public static void m23302b(String str) {
        new C11387j().mo21050a(str);
    }

    /* renamed from: c */
    public static void m23303c(String str) {
        new C11423v().mo21065a(str, (C11446e) null);
    }

    /* renamed from: a */
    public static void m23299a(String str) {
        C11418u uVar = new C11418u();
        C11180b a = C11182d.m22641a().mo20658a(str);
        if (a == null || !a.hasMore() || a.isLocal()) {
            C11472i.m23483a().mo21117b(str, null);
        } else {
            C11457e.m23435a(new C11456d<Long>(str, a) {

                /* renamed from: a */
                final /* synthetic */ String f30678a;

                /* renamed from: b */
                final /* synthetic */ C11180b f30679b;

                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    C11319r.m23086a();
                    C11207p f = C11319r.m23096f(this.f30678a);
                    if (f == null) {
                        return Long.valueOf(this.f30679b.getLastMessageIndex());
                    }
                    return Long.valueOf(f.getIndex());
                }

                {
                    this.f30678a = r2;
                    this.f30679b = r3;
                }
            }, new C11455c<Long>(str, a) {

                /* renamed from: a */
                final /* synthetic */ String f30681a;

                /* renamed from: b */
                final /* synthetic */ C11180b f30682b;

                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    Long l = (Long) obj;
                    if (l.longValue() == -1) {
                        C11472i.m23483a().mo21117b(this.f30681a, null);
                        return;
                    }
                    C11418u uVar = C11418u.this;
                    C11180b bVar = this.f30682b;
                    RequestBody build = new Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(bVar.getConversationId()).conversation_short_id(Long.valueOf(bVar.getConversationShortId())).conversation_type(Integer.valueOf(bVar.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(l.longValue())).build()).build();
                    uVar.mo21053a(bVar.getInboxType(), build, null, bVar.getConversationId());
                }

                {
                    this.f30681a = r2;
                    this.f30682b = r3;
                }
            }, C11452a.m23426c());
        }
    }

    /* renamed from: a */
    public static C11447f m23293a(IMCMD imcmd, C11447f fVar) {
        if (imcmd == IMCMD.NEW_MSG_NOTIFY) {
            fVar.f30733h = new C11333ab();
        } else if (imcmd == IMCMD.MARK_READ_NOTIFY) {
            fVar.f30733h = new C11430y();
        } else if (imcmd != IMCMD.STRANGER_NEW_MSG_NOTIFY) {
            return null;
        } else {
            fVar.f30733h = new C11360am();
        }
        return fVar;
    }

    /* renamed from: a */
    public static void m23295a(int i, int i2) {
        new C11402o(i).mo21051a(i2);
    }

    /* renamed from: a */
    public static void m23298a(C11207p pVar, C11162b<C11207p> bVar) {
        C11336ac acVar = new C11336ac(bVar);
        if (pVar.isSelf()) {
            if (C11469g.m23481c(pVar)) {
                C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
                RequestBody build = new Builder().recall_message_body(new RecallMessageRequestBody.Builder().conversation_id(pVar.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).server_message_id(Long.valueOf(pVar.getMsgId())).build()).build();
                acVar.mo21053a(a.getInboxType(), build, null, pVar);
                return;
            }
            acVar.mo21033a(pVar);
        }
    }

    /* renamed from: a */
    public static void m23297a(int i, Map<String, MessageBody> map, boolean z) {
        C11392k.m23252a(i, map, z);
    }

    /* renamed from: a */
    public static void m23296a(int i, List<Long> list, String str, Map<String, String> map, C11162b<C11180b> bVar) {
        C11377f fVar = new C11377f(bVar);
        if (list != null && !list.isEmpty()) {
            if (!list.contains(Long.valueOf(C11165c.m22588a().f30108c.mo20490a()))) {
                list.add(0, Long.valueOf(C11165c.m22588a().f30108c.mo20490a()));
            }
            fVar.mo21044a(i, C11170a.f30116b, list, str, map, null);
        }
    }

    /* renamed from: a */
    public static void m23300a(String str, long j, List<Long> list, Map<String, String> map, C11162b<List<C11206o>> bVar) {
        C11325a aVar = new C11325a(bVar);
        aVar.f30481a = j;
        aVar.mo21028a(str, j, list, C11170a.f30116b, 0, map, null);
    }
}
