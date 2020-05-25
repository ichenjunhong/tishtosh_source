package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CheckMessage;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35215a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ag */
public final /* synthetic */ class C35191ag implements C1710e {

    /* renamed from: a */
    private final long f90477a;

    public C35191ag(long j) {
        this.f90477a = j;
    }

    public final void accept(Object obj) {
        int i;
        long j = this.f90477a;
        C11207p pVar = (C11207p) obj;
        String i2 = C35197am.m79571i(pVar);
        if (!TextUtils.isEmpty(i2)) {
            boolean z = false;
            try {
                i = ((CheckMessage) C35277o.m79760a((String) pVar.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class)).status_code;
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                String str = (String) pVar.getLocalExt().get("s:err_code");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i = Integer.parseInt(str);
                    } catch (Exception unused2) {
                    }
                }
            }
            long a = C11190e.m22685a(pVar.getConversationId());
            String str2 = pVar.getConversationType() == C11170a.f30116b ? "group" : "private";
            if (pVar != null) {
                Map localExt = pVar.getLocalExt();
                if (localExt == null || !localExt.containsKey("s:send_response_check_code")) {
                    z = true;
                } else {
                    z = TextUtils.equals("0", (String) localExt.get("s:send_response_check_code"));
                }
            }
            String str3 = z ? "success" : "failure";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("conversation_id", pVar.getConversationId());
            if (a > 0) {
                jSONObject.put("to_user_id", String.valueOf(a));
            }
            jSONObject.put("chat_type", str2);
            jSONObject.put(CustomActionPushReceiver.f104056a, i2);
            jSONObject.put("send_status", str3);
            jSONObject.put("status_code", String.valueOf(i));
            String str4 = C35190af.f90475b;
            if (TextUtils.isEmpty(str4) && pVar.getLocalExt() != null) {
                str4 = (String) pVar.getLocalExt().get("process_id");
            }
            jSONObject.put("process_id", str4);
            if (pVar.getMsgStatus() != 2 || pVar.getLocalExt().get("send_sdk_time") == null) {
                C35215a.m79605a(jSONObject, pVar, -1);
            } else {
                try {
                    long parseLong = j - Long.parseLong((String) pVar.getLocalExt().get("send_sdk_time"));
                    if (parseLong > 0) {
                        jSONObject.put("delay_duration", String.valueOf(parseLong));
                        C35215a.m79605a(jSONObject, pVar, parseLong);
                    } else {
                        StringBuilder sb = new StringBuilder("wrong duration:");
                        sb.append(parseLong);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } catch (Exception e) {
                    C32458a.m75143a(e);
                }
            }
            C26890h.m65012a("send_message_response", jSONObject);
        }
    }
}
