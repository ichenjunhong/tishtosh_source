package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.msghelper.MessageHelperActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.f */
public final class C34589f extends C35456b {
    /* renamed from: b */
    public final int mo72634b() {
        return 10;
    }

    public final String bm_() {
        return "message_helper_session";
    }

    public final int bn_() {
        return 1;
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C35457c() {
            /* renamed from: a */
            public final void mo72636a(Context context, C35456b bVar, int i) {
                String str;
                if (i == 1 || i == 2) {
                    if (bVar.f91122m == null) {
                        str = "";
                    } else {
                        str = (String) bVar.f91122m.get("position");
                    }
                    int i2 = bVar.f91119j;
                    HashMap hashMap = new HashMap();
                    hashMap.put("account_type", "message_assistant");
                    hashMap.put("client_order", str);
                    if (i2 > 0) {
                        hashMap.put("notice_type", "yellow_dot");
                    }
                    C26890h.m65011a("enter_official_message", (Map<String, String>) hashMap);
                    C34589f fVar = C34589f.this;
                    C35284t.m79782a().mo73392a(fVar.f91119j);
                    C34032k.m77795a().mo71981a((C35456b) fVar);
                    context.startActivity(new Intent(context, MessageHelperActivity.class));
                }
            }
        };
    }

    /* renamed from: f */
    public final int mo72648f() {
        return this.f91119j - C35284t.m79782a().mo73400b();
    }

    /* renamed from: d */
    public final void mo72643d() {
        this.f91116g = C11010c.m22280a().getString(R.string.bnp);
        this.f91115f = C23556a.m57755a(R.drawable.dbt);
    }
}
