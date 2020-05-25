package com.p683ss.android.ugc.aweme.mediaplayer;

import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.e */
final /* synthetic */ class C36760e implements C0011g {

    /* renamed from: a */
    private final MediaPlayerModule f93940a;

    C36760e(MediaPlayerModule mediaPlayerModule) {
        this.f93940a = mediaPlayerModule;
    }

    public final Object then(C0013i iVar) {
        MediaPlayerModule mediaPlayerModule = this.f93940a;
        int intValue = ((Integer) iVar.mo34e()).intValue();
        mediaPlayerModule.f93935h.setValue(new C36764i(1, intValue >= 0));
        return Integer.valueOf(intValue);
    }
}
