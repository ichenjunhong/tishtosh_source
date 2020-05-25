package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessagesInConversationResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.b.a.u */
public final class C11418u extends C11406q {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11418u() {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            C11176d.m22630a(fVar, false).mo20530b();
            return;
        }
        final String str = (String) fVar.f30730e[0];
        MessagesInConversationResponseBody messagesInConversationResponseBody = fVar.f30732g.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        final boolean booleanValue = messagesInConversationResponseBody.has_more.booleanValue();
        C11457e.m23435a(new C11456d<List<C11207p>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<C11207p> mo20683a() {
                int i;
                C11266d.m22878a();
                C11266d.m22880a("LoadHistoryHandler.saveMsg(String,List,boolean)");
                ArrayList arrayList = new ArrayList();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (list != null) {
                    for (MessageBody a : list) {
                        Pair a2 = C11333ab.m23156a(a, true, 1);
                        if (!(a2 == null || a2.first == null)) {
                            arrayList.add(a2.first);
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    String str = "msg_count";
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    jSONObject.put(str, i);
                    jSONObject.put("msg_source", 1);
                    C11176d.m22637a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
                } catch (Exception unused) {
                }
                if (!booleanValue) {
                    C11333ab.m23159a(str);
                }
                C11266d.m22878a().mo20960b("LoadHistoryHandler.saveMsg(String,List,boolean)");
                Collections.sort(arrayList);
                return arrayList;
            }
        }, new C11455c<List<C11207p>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11472i.m23483a().mo21117b(str, (List) obj);
            }
        }, C11452a.m23426c());
        C11176d.m22630a(fVar, true).mo20530b();
    }
}
