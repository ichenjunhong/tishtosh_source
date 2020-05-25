package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.i */
public final class C44876i {
    @C17952c(mo34828a = "start_time")

    /* renamed from: a */
    public int f113575a;
    @C17952c(mo34828a = "end_time")

    /* renamed from: b */
    public int f113576b;
    @C17952c(mo34828a = "text")

    /* renamed from: c */
    public String f113577c = "";

    public C44876i(StickerItemModel stickerItemModel) {
        C52711k.m112240b(stickerItemModel, "item");
        this.f113575a = stickerItemModel.startTime;
        this.f113576b = stickerItemModel.endTime;
        String text = stickerItemModel.getText();
        C52711k.m112236a((Object) text, "item.text");
        this.f113577c = text;
    }
}
