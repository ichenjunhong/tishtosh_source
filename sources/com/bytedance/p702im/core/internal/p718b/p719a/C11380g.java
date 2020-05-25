package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.DeleteConversationRequestBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.b.a.g */
public final class C11380g extends C11406q<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    C11380g() {
        super(IMCMD.MARK_CONVERSATION_DELETE.getValue());
    }

    public C11380g(C11162b<String> bVar) {
        super(IMCMD.MARK_CONVERSATION_DELETE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (fVar.f30732g == null || fVar.f30732g.status_code.intValue() != 0) {
            mo21058b(C11447f.m23381a(-9999));
            return;
        }
        final C11180b a = C11182d.m22641a().mo20658a((String) fVar.f30730e[0]);
        if (a == null || a.isTemp()) {
            mo21058b(C11447f.m23381a(-1017));
        } else {
            C11457e.m23434a(new C11456d<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    C11312m.m23038a();
                    return Boolean.valueOf(C11312m.m23047c(a.getConversationId()));
                }
            }, new C11455c<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        C11380g.this.mo21055a(a.getConversationId());
                        C11182d.m22641a().mo20662a(a);
                        return;
                    }
                    C11380g.this.mo21058b(C11447f.m23381a(-3001));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo21046a(int i, String str, long j, int i2, long j2) {
        C11324a.m23127a(i, str);
        mo21053a(i, new Builder().delete_conversation_body(new DeleteConversationRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).last_message_index(Long.valueOf(j2)).build()).build(), null, str);
    }
}
