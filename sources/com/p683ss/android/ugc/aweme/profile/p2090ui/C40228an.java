package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40247c;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.an */
final /* synthetic */ class C40228an implements OnClickListener {

    /* renamed from: a */
    private final C40212af f102761a;

    C40228an(C40212af afVar) {
        this.f102761a = afVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40212af afVar = this.f102761a;
        if (afVar.f103081w != null) {
            String bioEmail = afVar.f103081w.getBioEmail();
            if (!TextUtils.isEmpty(bioEmail)) {
                StringBuilder sb = new StringBuilder("mailto:");
                sb.append(bioEmail);
                try {
                    afVar.getActivity().startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(sb.toString())));
                } catch (Exception unused) {
                }
            }
        }
        C40247c.m89518a("email", afVar.f103081w);
    }
}
