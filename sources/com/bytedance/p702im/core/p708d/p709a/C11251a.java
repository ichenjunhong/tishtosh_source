package com.bytedance.p702im.core.p708d.p709a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p718b.p719a.C11406q;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.proto.ConversationCheckInfo;
import com.bytedance.p702im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.p702im.core.proto.GetConversationInfoV2RequestBody.Builder;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.a.a */
public final class C11251a extends C11406q {
    public C11251a() {
        super(IMCMD.GET_CONVERSATIONS_CHECKINFO.getValue());
    }

    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar == null || fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.get_conversations_checkinfo_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        boolean z;
        if (!mo20947a(fVar) || !fVar.mo21093g()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final List<ConversationCheckInfo> list = fVar.f30732g.body.get_conversations_checkinfo_body.conversation_checkinfo_list;
            if (list != null && !list.isEmpty()) {
                final int intValue = fVar.f30731f.inbox_type.intValue();
                C11452a.m23424a().execute(new Runnable() {
                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        C11312m.m23038a();
                        List a = C11312m.m23039a(intValue);
                        if (a == null || a.isEmpty()) {
                            C11251a.m22846a(intValue, list, currentTimeMillis);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ConversationCheckInfo conversationCheckInfo : list) {
                            if (conversationCheckInfo != null && !TextUtils.isEmpty(conversationCheckInfo.conversation_id)) {
                                boolean z = true;
                                Iterator it = a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (conversationCheckInfo.conversation_id.equals((String) it.next())) {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    arrayList.add(conversationCheckInfo);
                                }
                            }
                        }
                        C11251a.m22846a(intValue, arrayList, currentTimeMillis);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m22846a(int i, List<ConversationCheckInfo> list, long j) {
        C11256d dVar = new C11256d();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ConversationCheckInfo conversationCheckInfo : list) {
                if (conversationCheckInfo != null) {
                    arrayList.add(new Builder().conversation_id(conversationCheckInfo.conversation_id).conversation_short_id(conversationCheckInfo.conversation_short_id).conversation_type(conversationCheckInfo.conversation_type).build());
                    if (arrayList.size() == 50) {
                        dVar.mo21053a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, new Object[0]);
                        arrayList = new ArrayList();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                dVar.mo21053a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, new Object[0]);
            }
        }
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("leak_conversation_count", String.valueOf(list.size()));
            new C11255c().mo20950a(i, "check_conversation_leak", 1, hashMap);
        }
        new C11255c().mo20951b(i, "check_conversation_cost", System.currentTimeMillis() - j, null);
    }
}
