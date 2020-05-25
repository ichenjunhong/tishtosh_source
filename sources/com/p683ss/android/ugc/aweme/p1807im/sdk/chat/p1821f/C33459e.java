package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f;

import android.text.TextUtils;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.e */
public final class C33459e {

    /* renamed from: a */
    public static final C33459e f86712a = new C33459e();

    private C33459e() {
    }

    /* renamed from: a */
    public static final String m76689a(C11207p pVar, String str) {
        String str2;
        C52711k.m112240b(pVar, "msg");
        C52711k.m112240b(str, "msgHint");
        if (pVar.isSelf()) {
            IMUser b = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(pVar.getConversationId())));
            if (b != null) {
                str2 = b.getNickName();
            } else {
                str2 = null;
            }
        } else {
            User c = C35265e.m79732c();
            C52711k.m112236a((Object) c, "AppUtil.getCurrentUser()");
            str2 = c.getNickname();
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(str2);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }
}
