package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ca */
public final /* synthetic */ class C30834ca implements OnClickListener {

    /* renamed from: a */
    private final C30824bz f80778a;

    /* renamed from: b */
    private final Aweme f80779b;

    /* renamed from: c */
    private final C26131l f80780c;

    public C30834ca(C30824bz bzVar, Aweme aweme, C26131l lVar) {
        this.f80778a = bzVar;
        this.f80779b = aweme;
        this.f80780c = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30824bz bzVar = this.f80778a;
        Aweme aweme = this.f80779b;
        C26131l lVar = this.f80780c;
        if (NonStandardAdPostExperiment.m92640b()) {
            HashMap hashMap = new HashMap();
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                switch (status.getPrivateStatus()) {
                    case 0:
                        hashMap.put("privacy_status", "public");
                        break;
                    case 1:
                        hashMap.put("privacy_status", "private");
                        break;
                    case 2:
                        hashMap.put("privacy_status", "friend");
                        break;
                }
            }
            hashMap.put("enter_from", "release");
            C26890h.m65011a("click_ad_sticker", (Map<String, String>) hashMap);
            if (!C25945k.m62914e().mo53193a((Context) bzVar.f80746f, lVar.f69006a.f69041c, false)) {
                C25945k.m62914e().mo53192a((Context) bzVar.f80746f, lVar.f69006a.f69042d, lVar.f69006a.f69043e);
            }
        }
    }
}
