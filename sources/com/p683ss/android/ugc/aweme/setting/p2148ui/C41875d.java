package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.d */
final /* synthetic */ class C41875d implements OnClickListener {

    /* renamed from: a */
    private final AdSettingsActivity f106023a;

    C41875d(AdSettingsActivity adSettingsActivity) {
        this.f106023a = adSettingsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AdSettingsActivity adSettingsActivity = this.f106023a;
        if (adSettingsActivity.f105604b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f61282b);
            sb.append("/aweme/v1/ad/video/code/get/");
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", adSettingsActivity.f105604b.getAid());
            adSettingsActivity.f105605c.doPost(sb2, hashMap).enqueue(new C12743e<String>() {
                /* renamed from: a */
                public final void mo19943a(C12690b<String> bVar, Throwable th) {
                    C10691a.m21551c(AdSettingsActivity.this.f105603a.getContext(), "Request Faild").mo19066a();
                }

                /* renamed from: a */
                public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                    if (uVar != null && uVar.mo23960c() && uVar.f33552b != null) {
                        C18085o a = AdSettingsActivity.this.mo85572a((String) uVar.f33552b);
                        if (!TextUtils.isEmpty(AdSettingsActivity.m91606a(a, "status_msg"))) {
                            C10691a.m21551c((Context) AdSettingsActivity.this, a.mo35022b("status_msg").mo34905c()).mo19066a();
                        }
                        String a2 = AdSettingsActivity.m91606a(a, "video_code");
                        if (!TextUtils.isEmpty(a2)) {
                            AdSettingsActivity.m91607a(a2, (Context) AdSettingsActivity.this);
                            C10691a.m21537a((Context) AdSettingsActivity.this, AdSettingsActivity.this.getResources().getString(R.string.fzs)).mo19066a();
                        }
                    }
                }
            });
        }
    }
}
