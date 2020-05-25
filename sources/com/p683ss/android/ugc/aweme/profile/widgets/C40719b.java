package com.p683ss.android.ugc.aweme.profile.widgets;

import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.b */
final /* synthetic */ class C40719b extends C52720t {

    /* renamed from: a */
    public static final C52771j f103752a = new C40719b();

    C40719b() {
    }

    public final String getName() {
        return "loadAvatar";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ProfileState.class);
    }

    public final String getSignature() {
        return "getLoadAvatar()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((ProfileState) obj).getLoadAvatar();
    }
}
