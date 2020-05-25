package com.bytedance.p702im.core.internal.p718b.p719a;

import com.C2240a;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.ParticipantReadIndex;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.m */
public final class C11398m extends C11406q<List<ParticipantReadIndex>> {
    public C11398m() {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue());
    }

    public C11398m(C11162b<List<ParticipantReadIndex>> bVar) {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar == null || fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.participants_read_index_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        boolean z;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        C11180b bVar = (C11180b) fVar.f30730e[0];
        String conversationId = bVar.getConversationId();
        if (z) {
            mo21055a(fVar.f30732g.body.participants_read_index_body.indexes);
            C11467e.m23462a(C2240a.m6772a("request readIndex result=%s", new Object[]{C11466d.f30773a.mo34889b(fVar.f30732g.body.participants_read_index_body.indexes)}));
        } else {
            mo21058b(fVar);
            C11467e.m23462a("request readIndex error");
        }
        C11176d.m22630a(fVar, z).mo20527a("conversation_id", conversationId).mo20527a("conversation_type", Integer.valueOf(bVar.getConversationType())).mo20530b();
    }
}
