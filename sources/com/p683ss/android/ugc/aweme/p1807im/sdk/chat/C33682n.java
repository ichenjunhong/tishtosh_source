package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.n */
public final class C33682n {

    /* renamed from: a */
    public static final C33682n f87334a = new C33682n();

    private C33682n() {
    }

    /* renamed from: a */
    public static final void m77130a(IMUser iMUser, String str, Integer num, String str2) {
        C52711k.m112240b(str2, "invokeClass");
        if (iMUser != null) {
            try {
                if (TextUtils.isEmpty(iMUser.getUid())) {
                    Map hashMap = new HashMap();
                    String iMUser2 = iMUser.toString();
                    C52711k.m112236a((Object) iMUser2, "user.toString()");
                    hashMap.put("user", iMUser2);
                    String str3 = "key_enter_from";
                    if (num == null) {
                        num = Integer.valueOf(-1);
                    }
                    hashMap.put(str3, num);
                    String str4 = "conversation_id";
                    if (str == null) {
                        str = "empty";
                    }
                    hashMap.put(str4, str);
                    hashMap.put("error_msg", str2);
                    C35265e.m79731b("empty_user", hashMap);
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }
}
