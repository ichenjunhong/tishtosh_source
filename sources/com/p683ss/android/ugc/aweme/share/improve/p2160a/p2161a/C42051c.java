package com.p683ss.android.ugc.aweme.share.improve.p2160a.p2161a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42053ab;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.c */
public final class C42051c extends C42053ab {

    /* renamed from: b */
    private final C46069d f106444b;

    /* renamed from: c */
    private final String f106445c;

    public C42051c(C46069d dVar, String str) {
        C52711k.m112240b(dVar, "sticker");
        super(null, false, 3, null);
        this.f106444b = dVar;
        this.f106445c = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("prop_id", this.f106444b.f116246id).mo47829a("to_user_id", this.f106444b.ownerId).mo47829a("group_id", this.f106445c).mo47829a("enter_from", "prop_page").mo47829a("enter_method", "click_name").f61491a);
        ShareDependService a = C41922a.m91868a();
        C40954a a2 = new C40954a().mo83446a(17, this.f106444b.f116246id, "sticker");
        String str = this.f106444b.name;
        long j = this.f106444b.userCount;
        a2.f104177a.title = str;
        a2.f104177a.describe = C33095b.m76071b(j);
        C40952c cVar = a2.f104177a;
        C52711k.m112236a((Object) cVar, "QRCodeParams.Builder()\n …                 .build()");
        a.startQrCodeActivityV2(context, cVar);
    }
}
