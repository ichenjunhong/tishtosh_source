package com.p683ss.android.ugc.aweme.tools.live.sticker;

import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46320e;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.a */
public final class C47080a extends C46320e {
    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        if (aVar.f116856e == null) {
            return true;
        }
        Bundle bundle = aVar.f116856e;
        if (bundle == null) {
            C52711k.m112234a();
        }
        if (!bundle.getBoolean("is_video_used_sticker")) {
            return true;
        }
        return false;
    }

    public C47080a(AppCompatActivity appCompatActivity, C46354l lVar, C45889c cVar, boolean z, C45805a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(cVar, "stickerMobHelper");
        super(appCompatActivity, lVar, cVar, aVar, true);
    }
}
