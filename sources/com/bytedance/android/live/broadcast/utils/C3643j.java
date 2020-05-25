package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader.C3628c;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.utils.j */
final /* synthetic */ class C3643j implements C1710e {

    /* renamed from: a */
    private final StickerImageUploader f10373a;

    /* renamed from: b */
    private final C3628c f10374b;

    C3643j(StickerImageUploader stickerImageUploader, C3628c cVar) {
        this.f10373a = stickerImageUploader;
        this.f10374b = cVar;
    }

    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10373a;
        C3628c cVar = this.f10374b;
        C4177d dVar = (C4177d) obj;
        StringBuilder sb = new StringBuilder("upload sticker success pic->");
        sb.append(cVar.f10336b);
        C3831a.m9716d("StickerImageUploader", sb.toString());
        stickerImageUploader.f10330c = false;
        stickerImageUploader.mo9004b();
    }
}
