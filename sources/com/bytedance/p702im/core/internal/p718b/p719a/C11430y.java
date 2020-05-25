package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11318q;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MarkConversationReadNotify;
import com.bytedance.p702im.core.proto.ResponseBody;

/* renamed from: com.bytedance.im.core.internal.b.a.y */
final class C11430y extends C11364b {
    C11430y() {
        super(IMCMD.MARK_READ_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21032a(int i, ResponseBody responseBody) {
        final MarkConversationReadNotify markConversationReadNotify = responseBody.mark_conversation_read_notify;
        C11457e.m23434a(new C11456d<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                long j;
                C11312m.m23038a();
                C11180b a = C11312m.m23037a(markConversationReadNotify.conversation_id);
                if (a != null && markConversationReadNotify.read_index.longValue() > a.getReadIndex()) {
                    long unreadCount = a.getUnreadCount();
                    C11319r.m23086a();
                    long a2 = unreadCount - C11319r.m23082a(a.getConversationId(), a.getReadIndex(), markConversationReadNotify.read_index.longValue(), C11165c.m22588a().f30108c.mo20490a());
                    if (a2 >= 0) {
                        j = a2;
                    } else {
                        j = 0;
                    }
                    a.setUnreadCount(j);
                    a.setReadIndex(markConversationReadNotify.read_index.longValue());
                    if (a2 <= 0) {
                        C11318q.m23074a();
                        C11318q.m23078b(markConversationReadNotify.conversation_id);
                        a.setMentionMessages(null);
                    } else {
                        C11318q.m23074a();
                        a.setMentionMessages(C11318q.m23075a(markConversationReadNotify.conversation_id, markConversationReadNotify.read_index.longValue()));
                    }
                    C11312m.m23038a();
                    if (C11312m.m23044b(a)) {
                        return a;
                    }
                }
                return null;
            }
        }, new C11455c<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11180b bVar = (C11180b) obj;
                if (bVar != null) {
                    C11182d.m22641a().mo20668b(bVar);
                }
            }
        });
    }
}
