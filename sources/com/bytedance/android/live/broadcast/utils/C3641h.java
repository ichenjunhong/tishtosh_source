package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader.C3628c;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import java.io.File;
import p064c.p065a.C1686aj;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.utils.h */
final /* synthetic */ class C3641h implements C1710e {

    /* renamed from: a */
    private final StickerImageUploader f10369a;

    /* renamed from: b */
    private final C3628c f10370b;

    C3641h(StickerImageUploader stickerImageUploader, C3628c cVar) {
        this.f10369a = stickerImageUploader;
        this.f10370b = cVar;
    }

    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10369a;
        C3628c cVar = this.f10370b;
        File file = (File) obj;
        if (file == null) {
            StringBuilder sb = new StringBuilder("compress file fail->");
            sb.append(cVar.f10336b);
            C3831a.m9716d("StickerImageUploader", sb.toString());
            stickerImageUploader.f10330c = false;
            stickerImageUploader.mo9004b();
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("image/jpeg", file));
        stickerImageUploader.f10328a = ((UploadStickerImageApi) C4157e.m10322a().mo9550a(UploadStickerImageApi.class)).upload(multipartTypedOutput, cVar.f10337c, cVar.f10338d).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6152a((C1710e<? super T>) new C3643j<Object>(stickerImageUploader, cVar), (C1710e<? super Throwable>) new C3644k<Object>(stickerImageUploader, cVar));
    }
}
