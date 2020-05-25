package com.bytedance.p702im.core.internal.p718b.p719a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.ConversationOperationStatus;
import com.bytedance.p702im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.p702im.core.proto.CreateConversationV2RequestBody.Builder;
import com.bytedance.p702im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.im.core.internal.b.a.f */
public final class C11377f extends C11406q<C11180b> {
    public C11377f() {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue());
    }

    public C11377f(C11162b<C11180b> bVar) {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.create_conversation_v2_body == null || fVar.f30732g.body.create_conversation_v2_body.status == null || fVar.f30732g.body.create_conversation_v2_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.f30732g.body.create_conversation_v2_body.conversation == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, final Runnable runnable) {
        boolean z;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final CreateConversationV2ResponseBody createConversationV2ResponseBody = fVar.f30732g.body.create_conversation_v2_body;
            C11457e.m23434a(new C11456d<C11180b>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    boolean z;
                    int i;
                    boolean z2;
                    C11312m.m23038a();
                    C11180b a = C11312m.m23037a(createConversationV2ResponseBody.conversation.conversation_id);
                    if (a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C11313n.m23051a();
                    String str = createConversationV2ResponseBody.conversation.conversation_id;
                    if (createConversationV2ResponseBody.conversation.conversation_type == null) {
                        i = -1;
                    } else {
                        i = createConversationV2ResponseBody.conversation.conversation_type.intValue();
                    }
                    C11313n.m23054a(str, i, C11464c.m23456a(createConversationV2ResponseBody.conversation.conversation_id, createConversationV2ResponseBody.conversation.first_page_participants.participants));
                    C11180b a2 = C11464c.m23447a(fVar.f30732g.inbox_type.intValue(), a, createConversationV2ResponseBody.conversation, System.currentTimeMillis());
                    a2.setUpdatedTime(System.currentTimeMillis());
                    if (z) {
                        C11312m.m23038a();
                        z2 = C11312m.m23044b(a2);
                    } else {
                        C11312m.m23038a();
                        z2 = C11312m.m23040a(a2);
                    }
                    if (z2) {
                        return a2;
                    }
                    return null;
                }
            }, new C11455c<C11180b>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    C11180b bVar = (C11180b) obj;
                    if (bVar != null) {
                        C11182d.m22641a().mo20673c(bVar);
                        C11377f.this.mo21057a(bVar, fVar);
                    } else {
                        C11377f.this.mo21058b(C11447f.m23381a(-3001));
                    }
                    runnable.run();
                    C11176d.m22630a(fVar, true).mo20527a("conversation_id", createConversationV2ResponseBody.conversation.conversation_id).mo20527a("conversation_type", createConversationV2ResponseBody.conversation.conversation_type).mo20527a("total_count", createConversationV2ResponseBody.conversation.participants_count).mo20530b();
                }
            });
            return;
        }
        mo21058b(fVar);
        runnable.run();
        C11176d.m22630a(fVar, false).mo20530b();
    }

    /* renamed from: a */
    public final long mo21045a(int i, long j, C11446e eVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(C11165c.m22588a().f30108c.mo20490a()));
        arrayList.add(Long.valueOf(j));
        return mo21044a(i, C11170a.f30115a, arrayList, null, null, eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo21044a(int i, int i2, List<Long> list, String str, Map<String, String> map, C11446e eVar) {
        CreateConversationV2RequestBody createConversationV2RequestBody;
        if (list.contains(Long.valueOf(-1)) && C11467e.m23466a()) {
            throw new IllegalArgumentException("id is invalid");
        } else if (list.contains(Long.valueOf(-1))) {
            if (eVar != null) {
                eVar.mo21082b(C11447f.m23381a(-1015));
            }
            mo21058b(C11447f.m23381a(-1015));
            return -1;
        } else {
            Builder participants = new Builder().conversation_type(Integer.valueOf(i2)).participants(list);
            if (map != null) {
                participants.biz_ext(map);
            }
            if (i2 == C11170a.f30115a) {
                createConversationV2RequestBody = participants.build();
            } else {
                boolean z = !TextUtils.isEmpty(str);
                Builder persistent = participants.persistent(Boolean.valueOf(z));
                if (!z) {
                    str = UUID.randomUUID().toString();
                }
                createConversationV2RequestBody = persistent.idempotent_id(str).build();
            }
            return mo21053a(i, new RequestBody.Builder().create_conversation_v2_body(createConversationV2RequestBody).build(), eVar, new Object[0]);
        }
    }
}
