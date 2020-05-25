package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.f */
final /* synthetic */ class C43532f implements Callable {

    /* renamed from: a */
    private final C43530d f110128a;

    /* renamed from: b */
    private final StickerItemModel f110129b;

    C43532f(C43530d dVar, StickerItemModel stickerItemModel) {
        this.f110128a = dVar;
        this.f110129b = stickerItemModel;
    }

    public final Object call() {
        C43530d dVar = this.f110128a;
        StickerItemModel stickerItemModel = this.f110129b;
        ByteBuffer a = C43504ap.m95365a(stickerItemModel.pinAlgorithmFile);
        if (a != null) {
            dVar.f110111e.mo42986a(stickerItemModel.f91605id, a);
        }
        return C52860x.f131107a;
    }
}
