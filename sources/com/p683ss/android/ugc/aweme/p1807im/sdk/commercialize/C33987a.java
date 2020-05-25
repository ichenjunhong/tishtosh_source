package com.p683ss.android.ugc.aweme.p1807im.sdk.commercialize;

import android.text.TextUtils;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.commercialize.a */
public final class C33987a {
    /* renamed from: a */
    private static Map<String, String> m77685a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C11180b a = C11182d.m22641a().mo20658a(str);
        if (a == null) {
            return null;
        }
        return a.getLocalExt();
    }

    /* renamed from: a */
    private static Integer m77684a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = (String) map.get("commercialize.personal_info_count");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m77688a(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            for (C11207p pVar : list) {
                if (pVar != null && !pVar.isSelf()) {
                    BaseContent content = C33888y.content(pVar);
                    if (content != null && content.getType() == 770) {
                        Map a = m77685a(pVar.getConversationId());
                        if (a == null) {
                            a = new HashMap();
                        }
                        a.put("commercialize.personal_info_count", "3");
                        m77687a(pVar.getConversationId(), a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m77686a(String str, BaseContent baseContent) {
        if (baseContent != null) {
            Map a = m77685a(str);
            Integer a2 = m77684a(a);
            if (a2 != null) {
                if (a2.intValue() > 0) {
                    baseContent.setType(771);
                }
                int intValue = a2.intValue() - 1;
                if (intValue > 0) {
                    a.put("commercialize.personal_info_count", Integer.toString(intValue));
                } else {
                    a.remove("commercialize.personal_info_count");
                }
                m77687a(str, a);
            }
        }
    }

    /* renamed from: a */
    private static void m77687a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            new C11190e(str).mo20693a(map, (Runnable) null);
        }
    }
}
