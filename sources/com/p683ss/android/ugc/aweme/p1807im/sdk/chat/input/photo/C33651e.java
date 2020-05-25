package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import com.p683ss.android.ugc.aweme.base.C23371a;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.e */
final /* synthetic */ class C33651e implements C23371a {

    /* renamed from: a */
    private final PhotoDetailActivity f87269a;

    C33651e(PhotoDetailActivity photoDetailActivity) {
        this.f87269a = photoDetailActivity;
    }

    public final void run(Object obj) {
        PhotoDetailActivity photoDetailActivity = this.f87269a;
        if (((Boolean) obj).booleanValue()) {
            C0013i.m16a((Callable<TResult>) new C33649c<TResult>(photoDetailActivity, photoDetailActivity.f87182i));
        }
    }
}
