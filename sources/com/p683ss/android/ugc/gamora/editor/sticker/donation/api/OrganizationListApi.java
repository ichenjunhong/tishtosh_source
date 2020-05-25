package com.p683ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49482c;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationListApi */
public interface OrganizationListApi {

    /* renamed from: a */
    public static final C49476a f124150a = C49476a.f124151a;

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationListApi$a */
    public static final class C49476a {

        /* renamed from: a */
        static final /* synthetic */ C49476a f124151a = new C49476a();

        private C49476a() {
        }
    }

    @C12706h(mo23876a = "/aweme/v1/donation/orgs/")
    C2201v<C49482c> getOrganizationList(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2);
}
