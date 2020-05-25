package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a */
public final class C34213a {

    /* renamed from: a */
    public static final C34213a f88386a = new C34213a();

    private C34213a() {
    }

    /* renamed from: a */
    public static final boolean m78052a(String str) {
        return m78051a(C11182d.m22641a().mo20658a(str));
    }

    /* renamed from: a */
    public static final boolean m78051a(C11180b bVar) {
        if (!(bVar == null || !bVar.isGroupChat() || bVar.getCoreInfo() == null)) {
            C11181c coreInfo = bVar.getCoreInfo();
            C52711k.m112236a((Object) coreInfo, "conversation.coreInfo");
            if (coreInfo.getExt() != null) {
                C11181c coreInfo2 = bVar.getCoreInfo();
                C52711k.m112236a((Object) coreInfo2, "conversation.coreInfo");
                if (C52711k.m112239a((Object) (String) coreInfo2.getExt().get("a:s_banned"), (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }
}
