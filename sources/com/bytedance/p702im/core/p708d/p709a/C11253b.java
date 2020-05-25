package com.bytedance.p702im.core.p708d.p709a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.C11261a;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11406q;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessagesCheckInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.a.b */
public final class C11253b extends C11406q {

    /* renamed from: a */
    public long f30309a;

    public C11253b() {
        super(IMCMD.GET_MESSAGES_CHECKINFO_IN_CONVERSATION.getValue());
    }

    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar == null || fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.get_messages_checkinfo_in_conversation_body == null) {
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
            final String str = (String) fVar.f30730e[0];
            final int intValue = fVar.f30731f.inbox_type.intValue();
            final List<MessagesCheckInfo> list = fVar.f30732g.body.get_messages_checkinfo_in_conversation_body.msgs_checkinfo_list;
            if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
                C11452a.m23424a().execute(new Runnable() {
                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        int i = 0;
                        int i2 = 0;
                        for (MessagesCheckInfo messagesCheckInfo : list) {
                            if (messagesCheckInfo != null) {
                                C11319r.m23086a();
                                int a = C11319r.m23080a(str, messagesCheckInfo.head_msg_index.longValue(), messagesCheckInfo.tail_msg_index.longValue());
                                if (a != -1) {
                                    i = (i + messagesCheckInfo.msg_count.intValue()) - a;
                                }
                                StringBuilder sb = new StringBuilder("CheckConversationMsgHandler computeMsgCount, head:");
                                sb.append(messagesCheckInfo.head_msg_index);
                                sb.append(", tail:");
                                sb.append(messagesCheckInfo.tail_msg_index);
                                sb.append(", count:");
                                sb.append(messagesCheckInfo.msg_count);
                                sb.append(", localCount:");
                                sb.append(a);
                                C11467e.m23467b(sb.toString());
                                i2 += messagesCheckInfo.msg_count.intValue();
                            }
                        }
                        float f = (((float) i) * 1.0f) / ((float) i2);
                        StringBuilder sb2 = new StringBuilder("CheckConversationMsgHandler compareWithLocal, totalCount:");
                        sb2.append(i2);
                        sb2.append(", totalLeakCount:");
                        sb2.append(i);
                        sb2.append(", leakRatio:");
                        sb2.append(f);
                        C11467e.m23467b(sb2.toString());
                        HashMap hashMap = new HashMap();
                        hashMap.put("conversation_id", str);
                        hashMap.put("total_count", String.valueOf(i2));
                        hashMap.put("leak_count", String.valueOf(i));
                        if (f > C11261a.f30333g) {
                            C11259e eVar = new C11259e(i2);
                            C11180b a2 = C11182d.m22641a().mo20658a(str);
                            long j = C11253b.this.f30309a;
                            if (a2 == null) {
                                eVar.mo21054a(C11202k.m22730a(C11447f.m23381a(-1015)));
                            } else {
                                eVar.mo20954a(a2.getInboxType(), a2.getConversationId(), a2.getConversationShortId(), a2.getConversationType(), j);
                            }
                            new C11255c().mo20950a(intValue, "check_msg_leak", 1, hashMap);
                        }
                        new C11255c().mo20951b(intValue, "check_msg_cost", System.currentTimeMillis() - currentTimeMillis, hashMap);
                    }
                });
            }
        }
    }
}
