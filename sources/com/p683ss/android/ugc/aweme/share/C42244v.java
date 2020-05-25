package com.p683ss.android.ugc.aweme.share;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.v */
final /* synthetic */ class C42244v implements OnClickListener {

    /* renamed from: a */
    private final PhotoUploadSuccessPopView f106789a;

    /* renamed from: b */
    private final Aweme f106790b;

    /* renamed from: c */
    private final C26131l f106791c;

    C42244v(PhotoUploadSuccessPopView photoUploadSuccessPopView, Aweme aweme, C26131l lVar) {
        this.f106789a = photoUploadSuccessPopView;
        this.f106790b = aweme;
        this.f106791c = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PhotoUploadSuccessPopView photoUploadSuccessPopView = this.f106789a;
        Aweme aweme = this.f106790b;
        C26131l lVar = this.f106791c;
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
            if (!C23165l.m56764c().mo47880a((Context) photoUploadSuccessPopView.f106091b, lVar.f69006a.f69041c, false)) {
                C23165l.m56764c().mo47879a((Context) photoUploadSuccessPopView.f106091b, lVar.f69006a.f69042d, lVar.f69006a.f69043e);
            }
        }
    }
}
