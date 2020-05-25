package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.event.C5192l;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a */
public final class C4817a extends C10782e<C4818a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a$a */
    static final class C4818a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        String f13038a;
        @C17952c(mo34828a = "item")

        /* renamed from: b */
        String f13039b;

        C4818a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        C4818a aVar = (C4818a) obj;
        if (TextUtils.equals(aVar.f13038a, "toolbar")) {
            if (TextUtils.equals(aVar.f13039b, "gift")) {
                C4495a.m10823a().mo10301a((Object) new C5192l(1, 1));
            }
        } else if (TextUtils.equals(aVar.f13038a, "gift_panel") && TextUtils.equals(aVar.f13039b, "prop")) {
            C4495a.m10823a().mo10301a((Object) new C5192l(2, 1));
        }
        return null;
    }
}
