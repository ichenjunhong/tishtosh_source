package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.b */
public final class C34576b extends C35456b {

    /* renamed from: a */
    public int f89121a;

    /* renamed from: b */
    public final int mo72634b() {
        return 17;
    }

    public final String bm_() {
        return "flip_chat_helper_session";
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C35457c() {
            /* renamed from: a */
            public final void mo72636a(Context context, C35456b bVar, int i) {
                if (i == 1 || i == 2) {
                    C35460j f = C34004b.m77717a().mo71949f();
                    if (f != null) {
                        f.openFFSdkSchema("sslocal://fusion_fuel/main");
                        C35190af.m79442a();
                        boolean isFFSDKBind = f.isFFSDKBind();
                        HashMap hashMap = new HashMap();
                        hashMap.put("action_type", "click");
                        C26890h.m65011a("flipchat_message_entrance", (Map<String, String>) hashMap);
                        HashMap hashMap2 = new HashMap();
                        if (isFFSDKBind) {
                            hashMap2.put("need_login", "no");
                        } else {
                            hashMap2.put("need_login", "yes");
                        }
                        C26890h.m65011a("flipchat_sdk_entrance_click", (Map<String, String>) hashMap2);
                    }
                    return;
                }
                if (i == 0) {
                    C26891a aVar = new C26891a(context);
                    aVar.mo54844a((CharSequence[]) new String[]{context.getString(R.string.bge)}, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            if (i == 0) {
                                C35460j f = C34004b.m77717a().mo71949f();
                                if (f != null && f.isFFSDKBind()) {
                                    C35286u.m79867a(1);
                                }
                                C35284t.m79782a().mo73404b(true);
                                C34032k.m77795a().mo71990g();
                            }
                        }
                    });
                    aVar.mo54845b();
                }
            }
        };
    }

    /* renamed from: d */
    public final void mo72643d() {
        this.f91116g = C11010c.m22280a().getString(R.string.bnm);
        this.f91115f = C23556a.m57755a(R.drawable.azy);
    }
}
