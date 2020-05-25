package com.p683ss.android.ugc.aweme.mediaplayer;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.c */
final /* synthetic */ class C36758c implements C0199s {

    /* renamed from: a */
    private final MediaPlayerModule f93938a;

    C36758c(MediaPlayerModule mediaPlayerModule) {
        this.f93938a = mediaPlayerModule;
    }

    public final void onChanged(Object obj) {
        MediaPlayerModule mediaPlayerModule = this.f93938a;
        C36764i iVar = (C36764i) obj;
        if (iVar != null) {
            switch (iVar.f93950b) {
                case 1:
                    if (iVar.f93949a) {
                        mediaPlayerModule.f93932e = true;
                        return;
                    }
                    break;
                case 2:
                case 4:
                    mediaPlayerModule.f93931d = true;
                    return;
                case 3:
                case 5:
                    mediaPlayerModule.f93931d = false;
                    return;
                case 6:
                    mediaPlayerModule.f93932e = false;
                    mediaPlayerModule.f93931d = false;
                    break;
            }
        }
    }
}
