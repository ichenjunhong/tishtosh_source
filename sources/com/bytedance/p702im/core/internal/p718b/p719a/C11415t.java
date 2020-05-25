package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.t */
public final class C11415t extends C11406q<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    C11415t() {
        super(IMCMD.LEAVE_CONVERSATION.getValue());
    }

    public C11415t(C11162b<String> bVar) {
        super(IMCMD.LEAVE_CONVERSATION.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        final String str = (String) fVar.f30730e[0];
        final boolean booleanValue = ((Boolean) fVar.f30730e[1]).booleanValue();
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            runnable.run();
            C11176d.m22630a(fVar, false).mo20527a("conversation_id", str).mo20530b();
            return;
        }
        C114161 r0 = new C11456d<Boolean>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                C11312m.m23038a();
                C11312m.m23047c(str);
                return Boolean.valueOf(true);
            }
        };
        final Runnable runnable2 = runnable;
        final C11447f fVar2 = fVar;
        C114172 r2 = new C11455c<Boolean>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C11180b a = C11182d.m22641a().mo20658a(str);
                    C11182d.m22641a().mo20662a(a);
                    if (a != null && booleanValue) {
                        new C11380g().mo21046a(a.getInboxType(), str, a.getConversationShortId(), a.getConversationType(), a.getLastMessageIndex());
                    }
                    C11415t.this.mo21055a(str);
                }
                runnable2.run();
                C11176d.m22630a(fVar2, true).mo20527a("conversation_id", str).mo20530b();
            }
        };
        C11457e.m23434a(r0, r2);
    }
}
