package com.bytedance.p702im.core.p708d.p709a;

import android.util.Pair;
import com.bytedance.p702im.core.internal.p718b.p719a.C11387j;
import com.bytedance.p702im.core.internal.p718b.p719a.C11406q;
import com.bytedance.p702im.core.internal.p718b.p719a.C11423v;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.proto.ConversationInfoV2;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.a.d */
public final class C11256d extends C11406q {
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11256d() {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
    }

    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.get_conversation_info_list_v2_body == null || fVar.f30732g.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        final int intValue = fVar.f30731f.inbox_type.intValue();
        if (fVar.mo21093g() && mo20947a(fVar)) {
            List<ConversationInfoV2> list = fVar.f30732g.body.get_conversation_info_list_v2_body.conversation_info_list;
            if (list != null && !list.isEmpty()) {
                for (final ConversationInfoV2 conversationInfoV2 : list) {
                    if (conversationInfoV2 != null && (conversationInfoV2.is_participant == null || conversationInfoV2.is_participant.booleanValue())) {
                        new C11259e(0, new C11162b<MessageBody>() {
                            /* renamed from: a */
                            public final void mo20508a(C11202k kVar) {
                            }

                            /* renamed from: a */
                            public final /* synthetic */ void mo20506a(Object obj) {
                                final MessageBody messageBody = (MessageBody) obj;
                                if (messageBody != null) {
                                    C11452a.m23424a().execute(new Runnable() {
                                        public final void run() {
                                            Pair a = C11387j.m23240a(intValue, messageBody.create_time.longValue(), conversationInfoV2);
                                            if (a != null && a.first != null) {
                                                C11180b bVar = (C11180b) a.first;
                                                C11182d.m22641a().mo20681f(bVar);
                                                if (conversationInfoV2.first_page_participants != null && conversationInfoV2.first_page_participants.has_more != null && conversationInfoV2.first_page_participants.has_more.booleanValue()) {
                                                    new C11423v().mo21065a(bVar.getConversationId(), (C11446e) null);
                                                }
                                            }
                                        }
                                    });
                                }
                            }
                        }).mo20954a(intValue, conversationInfoV2.conversation_id, conversationInfoV2.conversation_short_id.longValue(), conversationInfoV2.conversation_type.intValue(), 0);
                    }
                }
            }
        }
    }
}
