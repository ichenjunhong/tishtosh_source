package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.EasterEggActivityV2.C25577a;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25788h;
import com.p683ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3.C25739a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26084i;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2;
import com.p683ss.android.ugc.aweme.commercialize.views.form.C26731a;
import com.p683ss.android.ugc.aweme.commercialize.views.form.C26731a.C26732a;
import com.p683ss.android.ugc.aweme.commercialize.views.form.C26737b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47485d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.al */
public final class C26386al {

    /* renamed from: a */
    public static int f69609a = 1;

    /* renamed from: b */
    public static final C26386al f69610b = new C26386al();

    private C26386al() {
    }

    /* renamed from: a */
    public static final Intent m63837a(Context context) {
        return new Intent(context, BottomFormDialogV2.class);
    }

    /* renamed from: a */
    public static final void m63838a(Context context, C25930g gVar, int i) {
        C52711k.m112240b(gVar, "easterEggPageParams");
        if (context != null && gVar.getEasterEggInfo() != null) {
            C26084i.f68884a.mo53607a(gVar.getEasterEggInfo());
            C26136q easterEggInfo = gVar.getEasterEggInfo();
            C52711k.m112236a((Object) easterEggInfo, "easterEggPageParams.easterEggInfo");
            if (!C47485d.m102882a(context, easterEggInfo.getOpenUrl(), "AdWebContainerTest")) {
                if (i != -1) {
                    if (context instanceof Activity) {
                        if (C25788h.m62412c()) {
                            C25739a.m62312a((Activity) context, gVar, i);
                            return;
                        }
                        C25577a.m62103a((Activity) context, gVar, i);
                    }
                } else if (C25788h.m62412c()) {
                    C25739a.m62313a(context, gVar);
                } else {
                    C25577a.m62104a(context, gVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m63840a(C0654k kVar, ViewGroup viewGroup, int i, boolean z) {
        C52711k.m112240b(kVar, "fragmentManager");
        C52711k.m112240b(viewGroup, "containerLayout");
        C26732a.m64640a(kVar, viewGroup, i, z);
    }

    /* renamed from: a */
    public static final void m63841a(Aweme aweme, C26737b bVar, C0654k kVar, ViewGroup viewGroup, int i) {
        C52711k.m112240b(aweme, "mAweme");
        C52711k.m112240b(kVar, "fragmentManager");
        C52711k.m112240b(viewGroup, "containerLayout");
        Bundle T = C26512f.m64118T(aweme);
        C52711k.m112236a((Object) T, "AdDataUtils.initAdMaskFormPageBundle(mAweme)");
        C26731a a = C26732a.m64638a(T);
        a.f70432d = bVar;
        C26732a.m64639a(kVar, viewGroup, i, a);
    }
}
