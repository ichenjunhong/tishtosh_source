package com.p683ss.android.ugc.aweme.mediaplayer;

import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.d */
final /* synthetic */ class C36759d implements Callable {

    /* renamed from: a */
    private final MediaPlayerModule f93939a;

    C36759d(MediaPlayerModule mediaPlayerModule) {
        this.f93939a = mediaPlayerModule;
    }

    public final Object call() {
        int i;
        MediaPlayerModule mediaPlayerModule = this.f93939a;
        String str = mediaPlayerModule.f93928a;
        if (mediaPlayerModule.f93932e) {
            i = 0;
        } else if (!TextUtils.isEmpty(str)) {
            i = mediaPlayerModule.f93929b.mo75873a(str);
            if (i >= 0) {
                if (mediaPlayerModule.f93933f.f93947d >= 0 && mediaPlayerModule.f93933f.f93948e - mediaPlayerModule.f93933f.f93947d > 0) {
                    mediaPlayerModule.f93929b.mo75876a(mediaPlayerModule.f93933f.f93947d, mediaPlayerModule.f93933f.f93948e);
                }
                mediaPlayerModule.f93929b.mo75877a(mediaPlayerModule.f93933f.f93946c);
                mediaPlayerModule.f93929b.mo75881b((double) mediaPlayerModule.f93933f.f93944a);
                mediaPlayerModule.f93929b.mo75875a((double) mediaPlayerModule.f93933f.f93945b);
            }
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
