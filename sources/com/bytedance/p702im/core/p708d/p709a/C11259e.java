package com.bytedance.p702im.core.p708d.p709a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p718b.p719a.C11333ab;
import com.bytedance.p702im.core.internal.p718b.p719a.C11406q;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessageDirection;
import com.bytedance.p702im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.p702im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.a.e */
final class C11259e extends C11406q<MessageBody> {

    /* renamed from: a */
    private String f30319a;

    /* renamed from: c */
    private long f30320c;

    /* renamed from: d */
    private int f30321d;

    /* renamed from: e */
    private int f30322e;

    /* renamed from: f */
    private int f30323f;

    /* renamed from: g */
    private int f30324g;

    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    C11259e(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    C11259e(int i, C11162b<MessageBody> bVar) {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue(), bVar);
        this.f30323f = i;
    }

    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            return;
        }
        MessagesInConversationResponseBody messagesInConversationResponseBody = fVar.f30732g.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        if (list == null || list.isEmpty()) {
            mo21055a(null);
            return;
        }
        if (this.f30324g == 0) {
            mo21055a(list.get(list.size() - 1));
        }
        C11452a.m23426c().execute(new Runnable() {
            public final void run() {
                for (MessageBody a : list) {
                    C11333ab.m23156a(a, true, 1);
                }
            }
        });
        this.f30324g += list.size();
        if (this.f30324g < this.f30323f && messagesInConversationResponseBody.has_more.booleanValue()) {
            mo20954a(this.f30322e, this.f30319a, this.f30320c, this.f30321d, ((MessageBody) list.get(0)).index_in_conversation.longValue());
        }
    }

    /* renamed from: a */
    public final void mo20954a(int i, String str, long j, int i2, long j2) {
        if (TextUtils.isEmpty(str)) {
            mo21054a(C11202k.m22730a(C11447f.m23381a(-1015)));
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        this.f30319a = str;
        this.f30320c = j;
        this.f30321d = i2;
        this.f30322e = i;
        mo21053a(i, new Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(this.f30319a).conversation_short_id(Long.valueOf(this.f30320c)).conversation_type(Integer.valueOf(this.f30321d)).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
