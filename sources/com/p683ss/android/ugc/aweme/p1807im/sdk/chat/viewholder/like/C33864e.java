package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.e */
public final class C33864e {

    /* renamed from: a */
    public static final C33864e f87851a = new C33864e();

    private C33864e() {
    }

    /* renamed from: c */
    private static String m77631c(C11207p pVar) {
        int msgType = pVar.getMsgType();
        if (msgType == 5) {
            return "GIF";
        }
        switch (msgType) {
            case 7:
                return "text";
            case 8:
                return "video";
            default:
                return "card";
        }
    }

    /* renamed from: b */
    public final void mo71896b(C11207p pVar) {
        C52711k.m112240b(pVar, "msg");
        C26890h.m65011a("cancel_like_message", mo71893a(pVar).f61491a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C23089d mo71893a(C11207p pVar) {
        C23089d a = C23089d.m56640a().mo47829a("to_user_id", String.valueOf(pVar.getSender())).mo47829a(CustomActionPushReceiver.f104056a, m77631c(pVar)).mo47829a("conversation_id", pVar.getConversationId());
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…N_ID, msg.conversationId)");
        return a;
    }

    /* renamed from: a */
    public final void mo71894a(C11207p pVar, String str) {
        C52711k.m112240b(str, "method");
        if (pVar != null) {
            C26890h.m65011a("bubble_message_exit", mo71893a(pVar).mo47829a("exit_method", str).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo71895a(C11207p pVar, boolean z, boolean z2) {
        String str;
        C52711k.m112240b(pVar, "msg");
        String str2 = "like_message";
        C23089d a = mo71893a(pVar);
        String str3 = "like_method";
        if (z) {
            str = "double_click";
        } else {
            str = "button";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("isauthor", z2 ^ true ? 1 : 0).f61491a);
    }
}
