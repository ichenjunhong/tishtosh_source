package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11311l;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.ConversationCoreInfo;
import com.bytedance.p702im.core.proto.ConversationOperationStatus;
import com.bytedance.p702im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.ak */
public final class C11354ak extends C11406q<C11180b> {
    C11354ak() {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue());
    }

    public C11354ak(C11162b<C11180b> bVar) {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.set_conversation_core_info_body == null || fVar.f30732g.body.set_conversation_core_info_body.status == null || fVar.f30732g.body.set_conversation_core_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.f30732g.body.set_conversation_core_info_body.conversation_core_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        final String str = (String) fVar.f30730e[0];
        final String str2 = (String) fVar.f30730e[1];
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            runnable.run();
            C11176d.m22630a(fVar, false).mo20527a("conversation_id", str).mo20527a("keys", str2).mo20530b();
            return;
        }
        final ConversationCoreInfo conversationCoreInfo = fVar.f30732g.body.set_conversation_core_info_body.conversation_core_info;
        C113551 r1 = new C11456d<C11180b>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo20683a() {
                C11311l.m23032a();
                C11181c a = C11464c.m23448a(conversationCoreInfo.conversation_id, C11311l.m23031a(conversationCoreInfo.conversation_id), conversationCoreInfo);
                C11311l.m23032a();
                if (!C11311l.m23033a(a)) {
                    return null;
                }
                C11312m.m23038a();
                return C11312m.m23037a(conversationCoreInfo.conversation_id);
            }
        };
        final C11447f fVar2 = fVar;
        final Runnable runnable2 = runnable;
        C113562 r2 = new C11455c<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11180b bVar = (C11180b) obj;
                if (bVar != null) {
                    C11182d.m22641a().mo20668b(bVar);
                    C11354ak.this.mo21055a(bVar);
                    C11176d.m22630a(fVar2, true).mo20527a("conversation_id", str).mo20527a("keys", str2).mo20530b();
                } else {
                    C11354ak.this.mo21058b(C11447f.m23381a(-3001));
                    C11176d.m22630a(fVar2, false).mo20527a("conversation_id", str).mo20527a("keys", str2).mo20530b();
                }
                runnable2.run();
            }
        };
        C11457e.m23434a(r1, r2);
    }
}
