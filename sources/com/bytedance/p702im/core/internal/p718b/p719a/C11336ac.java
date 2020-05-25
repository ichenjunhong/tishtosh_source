package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11318q;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.IMCMD;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.b.a.ac */
final class C11336ac extends C11406q<C11207p> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    C11336ac() {
        super(IMCMD.RECALL_MESSAGE.getValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21033a(final C11207p pVar) {
        C11457e.m23434a(new C11456d<Boolean>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                Map ext = pVar.getExt();
                ext.put("s:is_recalled", "true");
                pVar.putExt(ext);
                List mentionIds = pVar.getMentionIds();
                if (mentionIds != null && !mentionIds.isEmpty()) {
                    C11318q.m23074a();
                    if (C11318q.m23076a(pVar.getUuid())) {
                        C11182d a = C11182d.m22641a();
                        C11312m.m23038a();
                        a.mo20668b(C11312m.m23037a(pVar.getConversationId()));
                    }
                }
                return Boolean.valueOf(C11319r.m23086a().mo21021a(pVar));
            }
        }, new C11455c<Boolean>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C11336ac.this.mo21055a(pVar);
                    C11472i.m23483a().mo20729b(pVar);
                    return;
                }
                C11336ac.this.mo21058b(C11447f.m23381a(-3001));
            }
        });
    }

    C11336ac(C11162b<C11207p> bVar) {
        super(IMCMD.RECALL_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        C11207p pVar = (C11207p) fVar.f30730e[0];
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
        } else {
            mo21033a(pVar);
        }
    }
}
