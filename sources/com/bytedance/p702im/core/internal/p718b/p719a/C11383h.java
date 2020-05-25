package com.bytedance.p702im.core.internal.p718b.p719a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.DeleteMessageRequestBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.b.a.h */
public final class C11383h extends C11406q<C11207p> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    public C11383h() {
        super(IMCMD.DELETE_MESSAGE.getValue());
    }

    public C11383h(C11162b<C11207p> bVar) {
        super(IMCMD.DELETE_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: a */
    public final void mo21047a(final C11207p pVar, boolean z) {
        final String uuid = pVar.getUuid();
        final String conversationId = pVar.getConversationId();
        if (!TextUtils.isEmpty(uuid) && !TextUtils.isEmpty(conversationId)) {
            C11180b a = C11182d.m22641a().mo20658a(conversationId);
            if (a != null && pVar.getMsgId() > 0 && !z) {
                m23230a(a.getInboxType(), conversationId, pVar.getConversationShortId(), pVar.getConversationType(), pVar.getMsgId());
            }
            C11457e.m23434a(new C11456d<C11180b>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    C11319r.m23086a();
                    boolean b = C11319r.m23092b(uuid);
                    C11180b a = C11182d.m22641a().mo20658a(conversationId);
                    if (!b || a == null || ((a.getLastMessage() == null || !uuid.equals(a.getLastMessage().getUuid())) && !pVar.isMention())) {
                        return null;
                    }
                    C11312m.m23038a();
                    return C11312m.m23037a(conversationId);
                }
            }, new C11455c<C11180b>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    C11180b bVar = (C11180b) obj;
                    if (bVar != null) {
                        C11182d.m22641a().mo20668b(bVar);
                        C11383h.this.mo21055a(pVar);
                        return;
                    }
                    C11383h.this.mo21058b(C11447f.m23381a(-3001));
                }
            });
            C11472i.m23483a().mo20724a(pVar);
        }
    }

    /* renamed from: a */
    private void m23230a(int i, String str, long j, int i2, long j2) {
        mo21053a(i, new Builder().delete_message_body(new DeleteMessageRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).message_id(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
