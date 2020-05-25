package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.m */
final /* synthetic */ class C44261m extends C52720t {

    /* renamed from: a */
    public static final C52771j f112059a = new C44261m();

    C44261m() {
    }

    public final String getName() {
        return "mediaListState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ChooseMediaState.class);
    }

    public final String getSignature() {
        return "getMediaListState()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MediaListState;";
    }

    public final Object get(Object obj) {
        return ((ChooseMediaState) obj).getMediaListState();
    }
}
