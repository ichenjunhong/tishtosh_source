package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader.C3628c;
import com.bytedance.android.live.core.p224c.C3831a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.utils.i */
final /* synthetic */ class C3642i implements C1710e {

    /* renamed from: a */
    private final StickerImageUploader f10371a;

    /* renamed from: b */
    private final C3628c f10372b;

    C3642i(StickerImageUploader stickerImageUploader, C3628c cVar) {
        this.f10371a = stickerImageUploader;
        this.f10372b = cVar;
    }

    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10371a;
        C3628c cVar = this.f10372b;
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder("compress file  throw error->");
        sb.append(cVar.f10336b);
        C3831a.m9716d("StickerImageUploader", sb.toString());
        stickerImageUploader.f10330c = false;
        stickerImageUploader.mo9004b();
    }
}
