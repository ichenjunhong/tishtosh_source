package com.p683ss.android.ugc.aweme.profile.adapter;

import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.r */
final /* synthetic */ class C39773r extends C52720t {

    /* renamed from: a */
    public static final C52771j f101526a = new C39773r();

    C39773r() {
    }

    public final String getName() {
        return "mediaMixOfFirstPage";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(MediaMixListState.class);
    }

    public final String getSignature() {
        return "getMediaMixOfFirstPage()Lcom/ss/android/ugc/aweme/profile/model/MediaMixList;";
    }

    public final Object get(Object obj) {
        return ((MediaMixListState) obj).getMediaMixOfFirstPage();
    }
}
