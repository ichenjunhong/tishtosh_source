package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35307z;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35307z.C35312a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.c */
final /* synthetic */ class C33649c implements Callable {

    /* renamed from: a */
    private final PhotoDetailActivity f87266a;

    /* renamed from: b */
    private final UrlModel f87267b;

    C33649c(PhotoDetailActivity photoDetailActivity, UrlModel urlModel) {
        this.f87266a = photoDetailActivity;
        this.f87267b = urlModel;
    }

    public final Object call() {
        C35307z.m79887a(this.f87267b, new C35312a() {
            /* renamed from: b */
            public final void mo71090b() {
                C9432q.m18672a(C11010c.m22280a(), (int) R.string.bmn);
            }

            /* renamed from: a */
            public final void mo71089a() {
                C9432q.m18672a(C11010c.m22280a(), (int) R.string.bmp);
                C35190af.m79442a();
                C35190af.m79488c();
            }
        });
        return null;
    }
}
