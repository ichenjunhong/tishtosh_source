package com.p683ss.android.ugc.aweme.share.improve.p2160a.p2161a;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42053ab;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.b */
public final class C42050b extends C42053ab {

    /* renamed from: b */
    private final Music f106443b;

    public C42050b(Music music) {
        C52711k.m112240b(music, "music");
        super(null, false, 3, null);
        this.f106443b = music;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        String str;
        int i;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C40954a a = new C40954a().mo83446a(3, this.f106443b.getMid(), "single_song");
        Music music = this.f106443b;
        if (music == null) {
            str = "";
        } else {
            str = music.getMusicName();
        }
        Music music2 = this.f106443b;
        if (music2 == null) {
            i = 0;
        } else {
            i = music2.getUserCount();
        }
        a.f104177a.title = str;
        a.f104177a.describe = String.valueOf(i);
        SmartRouter.buildRoute(context, "//qrcodev2").withParam("extra_params", (Serializable) a.f104177a).open();
        C26890h.m65011a("click_qr_code", C23089d.m56640a().mo47827a("music_id", this.f106443b.getId()).mo47829a("platform", "scan").mo47829a("qr_code_type", "shaped").mo47829a("enter_from", "single_song").f61491a);
    }
}
