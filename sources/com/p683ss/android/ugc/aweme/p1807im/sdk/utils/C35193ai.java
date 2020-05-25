package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ai */
public final class C35193ai {

    /* renamed from: a */
    public static final C35193ai f90479a = new C35193ai();

    private C35193ai() {
    }

    /* renamed from: a */
    public static void m79544a(C11180b bVar, String str) {
        String str2;
        C23089d dVar;
        C52711k.m112240b(bVar, "conversation");
        C52711k.m112240b(str, "readStatus");
        String str3 = "message_read_status";
        C23089d a = C23089d.m56640a().mo47829a("conversation_id", bVar.getConversationId());
        String str4 = "chat_type";
        if (bVar.isGroupChat()) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C23089d a2 = a.mo47829a(str4, str2);
        if (!bVar.isGroupChat()) {
            dVar = a2;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.mo47827a("to_user_id", C11190e.m22685a(bVar.getConversationId()));
        }
        C26890h.m65011a(str3, a2.mo47829a("read_status", str).f61491a);
    }

    /* renamed from: a */
    public static final void m79542a(Bundle bundle, String str, boolean z) {
        long j;
        String str2;
        C52711k.m112240b(bundle, "shareExtra");
        C52711k.m112240b(str, "conversationId");
        if (z) {
            j = -1;
        } else {
            j = C11190e.m22685a(str);
        }
        String str3 = "share_video_success";
        C23089d a = C23089d.m56640a().mo47829a("platform", bundle.getString("platform", "chat")).mo47829a("group_id", bundle.getString("aid")).mo47829a("author_id", bundle.getString("author_id")).mo47829a("enter_from", bundle.getString("enter_from")).mo47829a("conversation_id", str);
        if (j > 0) {
            a.mo47827a("to_user_id", j);
        }
        String str4 = "chat_type";
        if (z) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str2).mo47829a("enter_method", bundle.getString("enter_method", "more_button")).f61491a);
    }

    /* renamed from: a */
    public static final void m79545a(String str, String str2, String str3) {
        String str4;
        C52711k.m112240b(str, "conversationId");
        if (TextUtils.equals(str3, C11010c.m22280a().getResources().getString(R.string.gss))) {
            str4 = "address_list";
        } else {
            str4 = "might_know";
        }
        String str5 = "im_cell_label_show";
        C23089d a = C23089d.m56640a().mo47829a("conversation_id", str);
        String str6 = "to_user_id";
        if (str2 == null) {
            str2 = "";
        }
        C26890h.m65011a(str5, a.mo47829a(str6, str2).mo47829a("label_type", str4).f61491a);
    }

    /* renamed from: a */
    public static final void m79546a(String str, boolean z, String str2, String str3) {
        C52711k.m112240b(str, "event");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("online_dot", z ? 1 : 0);
            jSONObject.put("online_status", str2);
            jSONObject.put("to_user_id", str3);
        } catch (Throwable unused) {
        }
        C26890h.m65012a(str, jSONObject);
    }

    /* renamed from: a */
    public static final void m79543a(Bundle bundle, String str, boolean z, boolean z2, String str2) {
        long j;
        String str3;
        String str4;
        C52711k.m112240b(bundle, "shareExtra");
        C52711k.m112240b(str, "conversationId");
        if (z) {
            j = -1;
        } else {
            j = C11190e.m22685a(str);
        }
        String str5 = "share_video_response";
        C23089d a = C23089d.m56640a().mo47829a("platform", "chat").mo47829a("group_id", bundle.getString("aid")).mo47829a("author_id", bundle.getString("author_id")).mo47829a("enter_from", bundle.getString("enter_from")).mo47829a("conversation_id", str);
        if (j > 0) {
            a.mo47827a("to_user_id", j);
        }
        String str6 = "chat_type";
        if (z) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        C23089d a2 = a.mo47829a(str6, str3).mo47829a("enter_method", "more_button");
        String str7 = "status";
        if (z2) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C26890h.m65011a(str5, a2.mo47829a(str7, str4).mo47829a("error_code", str2).f61491a);
    }
}
