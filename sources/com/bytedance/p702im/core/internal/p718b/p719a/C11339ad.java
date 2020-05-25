package com.bytedance.p702im.core.internal.p718b.p719a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.proto.ConversationOperationStatus;
import com.bytedance.p702im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.p702im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.ad */
public final class C11339ad extends C11406q<List<C11206o>> {
    C11339ad() {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue());
    }

    public C11339ad(C11162b<List<C11206o>> bVar) {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.conversation_remove_participants_body == null || fVar.f30732g.body.conversation_remove_participants_body.status == null || fVar.f30732g.body.conversation_remove_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<C11206o> m23169a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l != null) {
                C11206o oVar = new C11206o();
                oVar.setUid(l.longValue());
                oVar.setConversationId(str);
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, final Runnable runnable) {
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            runnable.run();
            C11176d.m22630a(fVar, false).mo20530b();
            return;
        }
        final String str = (String) fVar.f30730e[0];
        final List list = (List) fVar.f30730e[1];
        final ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = fVar.f30732g.body.conversation_remove_participants_body;
        C11457e.m23434a(new C11456d<Pair<C11180b, List<C11206o>>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                if (conversationRemoveParticipantsResponseBody.failed_participants != null) {
                    list.removeAll(conversationRemoveParticipantsResponseBody.failed_participants);
                }
                if (list.size() <= 0) {
                    return null;
                }
                C11313n.m23051a();
                List a = C11313n.m23053a(str, list);
                C11313n.m23051a();
                int b = C11313n.m23055b(str, list);
                C11312m.m23038a();
                C11180b a2 = C11312m.m23037a(str);
                if (a2 != null && b > 0) {
                    a2.setMemberCount(Math.max(0, a2.getMemberCount() - b));
                    C11312m.m23038a();
                    C11312m.m23044b(a2);
                }
                if (a == null || a.isEmpty()) {
                    a = C11339ad.m23169a(str, list);
                }
                return new Pair(a2, a);
            }
        }, new C11455c<Pair<C11180b, List<C11206o>>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                List list;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    if (pair.first != null) {
                        C11182d.m22641a().mo20668b((C11180b) pair.first);
                    }
                    C11472i.m23483a().mo20670b((List) pair.second);
                    C11176d.m22630a(fVar, true).mo20530b();
                }
                C11339ad adVar = C11339ad.this;
                if (pair != null) {
                    list = (List) pair.second;
                } else {
                    list = null;
                }
                adVar.mo21055a(list);
                runnable.run();
            }
        });
    }
}
