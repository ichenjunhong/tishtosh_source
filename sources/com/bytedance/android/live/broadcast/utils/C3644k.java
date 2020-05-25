package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader.C3628c;
import com.bytedance.android.live.core.p224c.C3831a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.utils.k */
final /* synthetic */ class C3644k implements C1710e {

    /* renamed from: a */
    private final StickerImageUploader f10375a;

    /* renamed from: b */
    private final C3628c f10376b;

    C3644k(StickerImageUploader stickerImageUploader, C3628c cVar) {
        this.f10375a = stickerImageUploader;
        this.f10376b = cVar;
    }

    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10375a;
        C3628c cVar = this.f10376b;
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder("upload sticker fail pic->");
        sb.append(cVar.f10336b);
        C3831a.m9716d("StickerImageUploader", sb.toString());
        stickerImageUploader.f10330c = false;
        stickerImageUploader.mo9004b();
    }
}
