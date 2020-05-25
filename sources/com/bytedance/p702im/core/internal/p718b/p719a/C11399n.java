package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.p703a.p704a.C11161a;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.ConversationInfoV2;
import com.bytedance.p702im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.n */
public final class C11399n extends C11406q<List<C11180b>> {

    /* renamed from: a */
    public int f30639a;

    public C11399n() {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.get_conversation_list_body == null || fVar.f30732g.body.get_conversation_list_body.list == null) {
            return false;
        }
        return true;
    }

    public C11399n(C11161a<List<C11180b>> aVar, int i) {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue(), aVar);
        this.f30639a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            C11176d.m22630a(fVar, false).mo20530b();
            mo21058b(fVar);
            return;
        }
        final List<ConversationInfoV2> list = fVar.f30732g.body.get_conversation_list_body.list;
        final boolean booleanValue = fVar.f30732g.body.get_conversation_list_body.has_more.booleanValue();
        final long longValue = fVar.f30732g.body.get_conversation_list_body.next_cursor.longValue();
        C114001 r0 = new C11456d<List<C11180b>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                int i;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    C11312m.m23038a();
                    C11180b a = C11312m.m23037a(conversationInfoV2.conversation_id);
                    if (a == null) {
                        C11313n.m23051a();
                        String str = conversationInfoV2.conversation_id;
                        if (conversationInfoV2.conversation_type == null) {
                            i = -1;
                        } else {
                            i = conversationInfoV2.conversation_type.intValue();
                        }
                        C11313n.m23058b(str, i, C11464c.m23456a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                        a = C11464c.m23447a(C11399n.this.f30639a, (C11180b) null, conversationInfoV2, 0);
                        C11312m.m23038a();
                        C11312m.m23040a(a);
                        C11182d.m22641a().mo20668b(a);
                    }
                    arrayList.add(a);
                }
                return arrayList;
            }
        };
        final C11447f fVar2 = fVar;
        C114012 r1 = new C11455c<List<C11180b>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                List list = (List) obj;
                C11176d.m22630a(fVar2, true).mo20530b();
                C11399n.this.mo21056a(list, longValue, booleanValue);
            }
        };
        C11457e.m23434a(r0, r1);
    }
}
