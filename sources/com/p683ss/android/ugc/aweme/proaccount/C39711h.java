package com.p683ss.android.ugc.aweme.proaccount;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23693g;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct;
import com.p683ss.android.ugc.aweme.proaccount.C39709g.C39710a;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.proaccount.h */
public final class C39711h<T> extends C23693g<C39709g> {

    /* renamed from: b */
    private final List<WelcomePageTextStruct> f101349b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49115a(Fragment fragment, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C39709g mo49117c(int i) {
        if (this.f101349b == null || this.f101349b.isEmpty()) {
            return C39710a.m88413a(i, true);
        }
        WelcomePageTextStruct welcomePageTextStruct = (WelcomePageTextStruct) this.f101349b.get(i);
        try {
            String imageUrl = welcomePageTextStruct.getImageUrl();
            C52711k.m112236a((Object) imageUrl, "pageInfo.imageUrl");
            String title = welcomePageTextStruct.getTitle();
            C52711k.m112236a((Object) title, "pageInfo.title");
            String description = welcomePageTextStruct.getDescription();
            C52711k.m112236a((Object) description, "pageInfo.description");
            Integer pageNum = welcomePageTextStruct.getPageNum();
            C52711k.m112236a((Object) pageNum, "pageInfo.pageNum");
            int intValue = pageNum.intValue();
            C52711k.m112240b(imageUrl, "imgUrl");
            C52711k.m112240b(title, "title");
            C52711k.m112240b(description, "desc");
            C39709g gVar = new C39709g();
            Bundle bundle = new Bundle();
            bundle.putString("image_url", imageUrl);
            bundle.putString("title_text", title);
            bundle.putString("desc_text", description);
            bundle.putInt(IWalletMainProxy.KEY_PAGE_INDEX, intValue);
            bundle.putBoolean("page_default", false);
            gVar.setArguments(bundle);
            return gVar;
        } catch (C10174a unused) {
            return C39710a.m88413a(i, true);
        }
    }

    public C39711h(C0654k kVar, int i, List<WelcomePageTextStruct> list) {
        C52711k.m112240b(kVar, "fm");
        super(kVar, i);
        this.f101349b = list;
    }
}
