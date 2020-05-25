package com.p683ss.android.ugc.aweme.profile.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingSettings */
public final class ThirdPartyBindingSettings {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ThirdPartyBindingSettings.class), "DEFAULT", "getDEFAULT()Lcom/ss/android/ugc/aweme/profile/settings/ThirdPartyBindingEntry;"))};
    private static final C52668f DEFAULT$delegate = C52732g.m112285a(C40028a.f101968a);
    public static final ThirdPartyBindingSettings INSTANCE = new ThirdPartyBindingSettings();
    @C10179b
    private static ThirdPartyBindingEntry thirdPartyBindingEntry;

    /* renamed from: com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingSettings$a */
    static final class C40028a extends C52712l implements C52670a<ThirdPartyBindingEntry> {

        /* renamed from: a */
        public static final C40028a f101968a = new C40028a();

        C40028a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ThirdPartyBindingEntry thirdPartyBindingEntry = new ThirdPartyBindingEntry(false, false, false, 7, null);
            return thirdPartyBindingEntry;
        }
    }

    private ThirdPartyBindingSettings() {
    }

    public final ThirdPartyBindingEntry getDEFAULT() {
        return (ThirdPartyBindingEntry) DEFAULT$delegate.getValue();
    }

    public final ThirdPartyBindingEntry getThirdPartyBindingEntry() {
        return thirdPartyBindingEntry;
    }

    public static final ThirdPartyBindingEntry readSettings() {
        ThirdPartyBindingEntry thirdPartyBindingEntry2;
        try {
            thirdPartyBindingEntry2 = (ThirdPartyBindingEntry) C10193n.m20607a().mo18202a(ThirdPartyBindingSettings.class, "third_party_binding", C10181b.m20511a().mo18175c().getThirdPartyBinding(), "com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingEntry", ThirdPartyBindingEntry.class);
        } catch (Throwable unused) {
            thirdPartyBindingEntry2 = null;
        }
        if (thirdPartyBindingEntry2 == null) {
            return INSTANCE.getDEFAULT();
        }
        return thirdPartyBindingEntry2;
    }

    public final void setThirdPartyBindingEntry(ThirdPartyBindingEntry thirdPartyBindingEntry2) {
        thirdPartyBindingEntry = thirdPartyBindingEntry2;
    }
}
