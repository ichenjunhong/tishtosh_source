package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p521a.C9369a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.l */
final /* synthetic */ class C27118l implements OnClickListener {

    /* renamed from: a */
    private final C27117k f71541a;

    C27118l(C27117k kVar) {
        this.f71541a = kVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C27117k kVar = this.f71541a;
        int id = view.getId();
        kVar.mo55429a().dismiss();
        String currentUrl = kVar.f71538f.mo54149e().getCurrentUrl();
        if (id == R.id.buz) {
            Activity activity = kVar.f71537e;
            if (!C9431p.m18664a(currentUrl)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(currentUrl));
                    intent.setAction("android.intent.action.VIEW");
                    activity.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        } else if (id == R.id.a0m) {
            Activity activity2 = kVar.f71537e;
            if (!C9431p.m18664a(currentUrl)) {
                C9369a.m18549a(activity2, "", currentUrl);
                C9432q.m18673a((Context) activity2, 2131952872, (int) R.string.e0n);
            }
        } else if (id == R.id.f133595cat) {
            kVar.f71538f.mo54149e().mo54150f();
        }
    }
}
