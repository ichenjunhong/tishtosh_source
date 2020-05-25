package com.bytedance.p702im.core.internal.p718b.p719a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.proto.ConversationAddParticipantsRequestBody.Builder;
import com.bytedance.p702im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.p702im.core.proto.ConversationOperationStatus;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.SecUidPair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.b.a.a */
final class C11325a extends C11406q<List<C11206o>> {

    /* renamed from: a */
    public long f30481a = -1;

    C11325a() {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue());
    }

    C11325a(C11162b<List<C11206o>> bVar) {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.conversation_add_participants_body == null || fVar.f30732g.body.conversation_add_participants_body.status == null || fVar.f30732g.body.conversation_add_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
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
        String str = (String) fVar.f30730e[0];
        final List list = (List) fVar.f30730e[1];
        int size = list.size();
        if (z) {
            final ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = fVar.f30732g.body.conversation_add_participants_body;
            final String str2 = str;
            final C11447f fVar2 = fVar;
            C113261 r4 = new C11456d<Pair<C11180b, List<C11206o>>>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    int i;
                    if (conversationAddParticipantsResponseBody.failed_participants != null) {
                        list.removeAll(conversationAddParticipantsResponseBody.failed_participants);
                    }
                    C11313n.m23051a();
                    long c = C11313n.m23060c(str2);
                    C11180b a = C11182d.m22641a().mo20658a(str2);
                    if (C11325a.this.f30481a > 0 && a == null) {
                        C11325a aVar = C11325a.this;
                        String str = str2;
                        C11180b bVar = new C11180b();
                        bVar.setConversationId(str);
                        bVar.setConversationShortId(aVar.f30481a);
                        bVar.setConversationType(C11170a.f30116b);
                        bVar.setIsMember(true);
                        C11312m.m23038a();
                        C11312m.m23044b(bVar);
                    }
                    C11313n.m23051a();
                    String str2 = str2;
                    if (a == null) {
                        i = -1;
                    } else {
                        i = a.getConversationType();
                    }
                    String str3 = str2;
                    List list = list;
                    ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = conversationAddParticipantsResponseBody;
                    HashMap hashMap = null;
                    if (conversationAddParticipantsResponseBody != null) {
                        List<SecUidPair> list2 = conversationAddParticipantsResponseBody.sec_success_participants;
                        if (list2 != null && !list2.isEmpty()) {
                            hashMap = new HashMap();
                            for (SecUidPair secUidPair : list2) {
                                if (!(secUidPair == null || secUidPair.uid == null)) {
                                    hashMap.put(secUidPair.uid, secUidPair.sec_uid);
                                }
                            }
                        }
                    }
                    C11313n.m23054a(str2, i, C11464c.m23457a(str3, list, (Map<Long, String>) hashMap, c));
                    C11312m.m23038a();
                    C11180b a2 = C11312m.m23037a(str2);
                    if (a2 != null) {
                        if (fVar2.f30732g != null) {
                            a2.setInboxType(fVar2.f30732g.inbox_type.intValue());
                        }
                        a2.setMemberCount(a2.getMemberCount() + list.size());
                        C11312m.m23038a();
                        C11312m.m23044b(a2);
                    }
                    C11313n.m23051a();
                    return new Pair(a2, C11313n.m23053a(str2, list));
                }
            };
            final C11447f fVar3 = fVar;
            final String str3 = str;
            final int i = size;
            final Runnable runnable2 = runnable;
            C113272 r42 = new C11455c<Pair<C11180b, List<C11206o>>>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    Pair pair = (Pair) obj;
                    if (pair.first != null) {
                        C11182d.m22641a().mo20668b((C11180b) pair.first);
                    }
                    C11325a.this.mo21057a(pair.second, fVar3);
                    C11472i.m23483a().mo20665a((List) pair.second);
                    C11176d.m22630a(fVar3, true).mo20527a("conversation_id", str3).mo20527a("total_count", Integer.valueOf(i)).mo20527a("count", Integer.valueOf(((List) pair.second).size())).mo20530b();
                    runnable2.run();
                }
            };
            C11457e.m23434a(r4, r42);
            return;
        }
        mo21058b(fVar);
        runnable.run();
        C11176d.m22630a(fVar, false).mo20527a("conversation_id", str).mo20527a("total_count", Integer.valueOf(size)).mo20530b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo21028a(String str, long j, List<Long> list, int i, int i2, Map<String, String> map, C11446e eVar) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        }
        Builder participants = new Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i)).participants(list);
        if (map != null) {
            participants.biz_ext(map);
        }
        return mo21053a(i2, new RequestBody.Builder().conversation_add_participants_body(participants.build()).build(), eVar, str, list);
    }
}
