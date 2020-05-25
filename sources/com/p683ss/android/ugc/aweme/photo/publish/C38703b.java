package com.p683ss.android.ugc.aweme.photo.publish;

import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.b */
final /* synthetic */ class C38703b implements Callback {

    /* renamed from: a */
    private final PhotoPublishFragment f98451a;

    C38703b(PhotoPublishFragment photoPublishFragment) {
        this.f98451a = photoPublishFragment;
    }

    public final void onContentModified() {
        this.f98451a.f98428d = true;
    }
}
