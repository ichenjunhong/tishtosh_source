package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C18083m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.f */
public final class C43568f {
    /* renamed from: a */
    public static final void m95713a(InteractStickerStruct interactStickerStruct, List<? extends BaseTrackTimeStamp> list) {
        C52711k.m112240b(interactStickerStruct, "struct");
        C52711k.m112240b(list, "listData");
        if (C9376b.m18558a((Collection<T>) list)) {
            interactStickerStruct.setTrackList("");
            return;
        }
        try {
            interactStickerStruct.setTrackList(C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(list));
        } catch (C18083m unused) {
        }
    }
}
