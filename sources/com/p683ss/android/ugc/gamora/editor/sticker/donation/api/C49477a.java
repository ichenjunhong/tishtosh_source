package com.p683ss.android.ugc.gamora.editor.sticker.donation.api;

import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49482c;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.a */
public final class C49477a {

    /* renamed from: a */
    public static final C49477a f124152a = new C49477a();

    private C49477a() {
    }

    /* renamed from: a */
    public static C2201v<C49482c> m106731a(C49478b bVar) {
        C52711k.m112240b(bVar, "param");
        return ((OrganizationListApi) C39629l.m88232a().mo58595z().retrofitCreate(TutorialVideoApiManager.f96873a, OrganizationListApi.class)).getOrganizationList(bVar.f124153a, bVar.f124154b);
    }
}
