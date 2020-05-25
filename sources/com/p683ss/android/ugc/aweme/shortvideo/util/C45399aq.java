package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aq */
public final class C45399aq {

    /* renamed from: a */
    protected Activity f114783a;

    /* renamed from: b */
    private String f114784b = "";

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91724a() {
        if (this.f114783a != null) {
            C9432q.m18689b((Context) this.f114783a, (int) R.string.hr, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91727a(String str) {
        if (this.f114783a != null) {
            C27965f.m66720a(C11016e.m22312g(), str, "click_duet_button", C47661ab.m103163a().mo94972a("login_title", this.f114783a.getString(R.string.dij)).f120139a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91726a(Builder builder, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f114783a, builder.build());
    }

    /* renamed from: a */
    public final void mo91725a(Aweme aweme, Activity activity, String str) {
        boolean z;
        this.f114783a = activity;
        if (!C20902b.m53242a().isLogin() && AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().needLoginBeforeRecord()) {
            C18842a.m45934b(new C45401as(this, str));
        } else if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishable()) {
            C18842a.m45934b(new C45400ar(this));
        } else {
            this.f114784b = str;
            if (!(aweme == null || aweme.getAuthor() == null)) {
                if (this.f114783a != null) {
                    if (!C48016e.m103957g()) {
                        C10691a.m21542b(this.f114783a.getApplicationContext(), (int) R.string.da8).mo19066a();
                    } else if (C48016e.m103958h() < 20971520) {
                        C10691a.m21542b(this.f114783a.getApplicationContext(), (int) R.string.da9).mo19066a();
                    } else {
                        z = true;
                        if (z && C45403au.m98962a(C11010c.m22280a())) {
                            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C45402at(this, new Builder().enterFrom(this.f114784b).creationId(UUID.randomUUID().toString()).prepareFilter(false).defaultTab(1).shootWay("status")));
                            C23208an.m56934a(this.f114784b);
                        }
                    }
                }
                z = false;
                AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C45402at(this, new Builder().enterFrom(this.f114784b).creationId(UUID.randomUUID().toString()).prepareFilter(false).defaultTab(1).shootWay("status")));
                C23208an.m56934a(this.f114784b);
            }
        }
    }
}
