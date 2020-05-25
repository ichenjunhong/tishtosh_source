package com.bytedance.p702im.core.internal.p718b.p719a;

import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.proto.ConversationInfoV2;
import com.bytedance.p702im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.im.core.internal.b.a.j */
public final class C11387j extends C11406q<C11180b> {
    C11387j() {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.get_conversation_info_v2_body == null || fVar.f30732g.body.get_conversation_info_v2_body.conversation_info == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo21050a(String str) {
        C11180b a = C11182d.m22641a().mo20658a(str);
        if (a == null || a.isTemp()) {
            mo21058b(C11447f.m23381a(-1017));
        } else if (C11324a.m23132a(str)) {
            StringBuilder sb = new StringBuilder("Get Conversation Info running: ");
            sb.append(str);
            C11467e.m23470c(sb.toString());
            mo21058b(C11447f.m23381a(-1018));
        } else {
            RequestBody build = new Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).build()).build();
            mo21053a(a.getInboxType(), build, null, str, Long.valueOf(a.getConversationShortId()), Integer.valueOf(a.getConversationType()), Long.valueOf(a.getUpdatedTime()));
            C11324a.m23134b(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        int intValue = fVar.f30731f.inbox_type.intValue();
        String str = (String) fVar.f30730e[0];
        boolean z = true;
        final long longValue = ((Long) fVar.f30730e[1]).longValue();
        final int intValue2 = ((Integer) fVar.f30730e[2]).intValue();
        long longValue2 = ((Long) fVar.f30730e[3]).longValue();
        C11324a.f30472b.remove(str);
        StringBuilder sb = new StringBuilder("Get Conversation Info finish: ");
        sb.append(str);
        C11467e.m23470c(sb.toString());
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        }
        if (z) {
            ConversationInfoV2 conversationInfoV2 = fVar.f30732g.body.get_conversation_info_v2_body.conversation_info;
            final int i = intValue;
            final long j = longValue2;
            final ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
            C113881 r1 = new C11456d<Pair<C11180b, Boolean>>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo20683a() {
                    return C11387j.m23240a(i, j, conversationInfoV22);
                }
            };
            final ConversationInfoV2 conversationInfoV23 = conversationInfoV2;
            final int i2 = intValue;
            final String str2 = str;
            final C11447f fVar2 = fVar;
            final Runnable runnable2 = runnable;
            C113892 r12 = new C11455c<Pair<C11180b, Boolean>>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    Pair pair = (Pair) obj;
                    if (pair != null) {
                        C11182d.m22641a().mo20668b((C11180b) pair.first);
                        if (((Boolean) pair.second).booleanValue() && conversationInfoV23.first_page_participants.has_more != null && conversationInfoV23.first_page_participants.has_more.booleanValue()) {
                            new C11423v().mo21065a(((C11180b) pair.first).getConversationId(), (C11446e) null);
                        }
                        C11387j.this.mo21055a(pair.first);
                        C11324a.m23127a(i2, str2);
                        C11176d.m22630a(fVar2, true).mo20527a("conversation_id", str2).mo20530b();
                    } else {
                        C11387j.this.mo21058b(C11447f.m23381a(-3001));
                    }
                    runnable2.run();
                }
            };
            C11457e.m23434a(r1, r12);
            return;
        }
        mo21058b(fVar);
        runnable.run();
        C11176d.m22630a(fVar, false).mo20527a("conversation_id", str).mo20530b();
        if (fVar.f30734i == -1000) {
            if (C11165c.m22588a().mo20513b().f30160x) {
                final int i3 = intValue;
                final String str3 = str;
                final long j2 = longValue2;
                C113903 r13 = new C11456d<C11180b>() {
                    /* renamed from: a */
                    public final /* synthetic */ Object mo20683a() {
                        return C11387j.m23242b(i3, str3, longValue, intValue2, j2);
                    }
                };
                C11457e.m23434a(r13, new C11455c<C11180b>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo20684a(Object obj) {
                        C11180b bVar = (C11180b) obj;
                        if (bVar != null) {
                            C11182d.m22641a().mo20668b(bVar);
                        }
                    }
                });
                return;
            }
            C11324a.m23128a(intValue, str, longValue, intValue2, longValue2);
        }
    }

    /* renamed from: a */
    public static Pair<C11180b, Boolean> m23240a(int i, long j, ConversationInfoV2 conversationInfoV2) {
        int i2;
        boolean z;
        boolean z2;
        C11312m.m23038a();
        C11180b a = C11312m.m23037a(conversationInfoV2.conversation_id);
        if (a == null || a.isMember() || conversationInfoV2.is_participant == null || conversationInfoV2.is_participant.booleanValue()) {
            C11313n.m23051a();
            C11313n.m23061d(conversationInfoV2.conversation_id);
            C11313n.m23051a();
            String str = conversationInfoV2.conversation_id;
            if (conversationInfoV2.conversation_type == null) {
                i2 = -1;
            } else {
                i2 = conversationInfoV2.conversation_type.intValue();
            }
            C11313n.m23054a(str, i2, C11464c.m23456a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
            C11180b a2 = C11464c.m23447a(i, a, conversationInfoV2, j);
            if (a == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C11312m.m23038a();
                z2 = C11312m.m23040a(a2);
            } else {
                C11312m.m23038a();
                z2 = C11312m.m23044b(a2);
            }
            if (z2) {
                return new Pair<>(a2, Boolean.valueOf(z));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo21049a(int i, String str, long j, int i2, long j2) {
        try {
            m23241a(i, str, j, i2, j2, false);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public static C11180b m23242b(int i, String str, long j, int i2, long j2) {
        C11312m.m23038a();
        if (C11312m.m23045b(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("create local conversation for net error: convId=");
        sb.append(str);
        sb.append(", shortId=");
        sb.append(j);
        sb.append(", type=");
        sb.append(i2);
        sb.append(", time=");
        sb.append(j2);
        C11467e.m23467b(sb.toString());
        C11180b bVar = new C11180b();
        bVar.setInboxType(i);
        bVar.setConversationId(str);
        bVar.setConversationShortId(j);
        bVar.setConversationType(i2);
        bVar.setUpdatedTime(j2);
        if (bVar.isSingleChat()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(C11165c.m22588a().f30108c.mo20490a()));
            arrayList.add(Long.valueOf(C11190e.m22685a(str)));
            bVar.setMemberIds(arrayList);
            bVar.setMemberCount(2);
        }
        bVar.setIsMember(true);
        bVar.setLastMessageIndex(C11319r.m23086a().mo21022h(str));
        C11319r.m23086a();
        bVar.setLastMessage(C11319r.m23098i(str));
        HashMap hashMap = new HashMap();
        hashMap.put("s:conv_wait_info", "1");
        bVar.setLocalExt(hashMap);
        C11312m.m23038a();
        if (C11312m.m23040a(bVar)) {
            return bVar;
        }
        return null;
    }

    /* renamed from: a */
    private synchronized void m23241a(int i, String str, long j, int i2, long j2, boolean z) {
        if (C11324a.m23132a(str)) {
            StringBuilder sb = new StringBuilder("Get Conversation Info running: ");
            sb.append(str);
            C11467e.m23470c(sb.toString());
            return;
        }
        mo21053a(i, new Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).build()).build(), null, str, Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
        C11324a.m23134b(str);
    }
}
