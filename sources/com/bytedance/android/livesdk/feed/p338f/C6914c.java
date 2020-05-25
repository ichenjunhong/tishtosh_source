package com.bytedance.android.livesdk.feed.p338f;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C9414h;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.p975o.C14229b;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.f.c */
final /* synthetic */ class C6914c implements C0199s {

    /* renamed from: a */
    private final C6911a f18925a;

    C6914c(C6911a aVar) {
        this.f18925a = aVar;
    }

    public final void onChanged(Object obj) {
        C6911a aVar = this.f18925a;
        for (ImageModel imageModel : (List) obj) {
            Context context = aVar.getContext();
            if (!(context == null || imageModel == null || C9414h.m18630a(imageModel.getUrls()))) {
                C13771c.m27875c().mo26188b(C14229b.fromUri((String) imageModel.getUrls().get(0)), context);
            }
        }
    }
}
