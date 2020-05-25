package com.p683ss.android.ugc.aweme.comment.p1523h;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.comment.api.GifEmojiApi;
import com.p683ss.android.ugc.aweme.comment.api.GifEmojiApi.C25135a;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p683ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p683ss.android.ugc.aweme.comment.model.StickerBean;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.h.b */
final class C25200b extends C11585a<C25205d, List<? extends GifEmoji>, C25205d, GifEmojiResponse> {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C25205d dVar = (C25205d) obj;
        C52711k.m112240b(dVar, "req");
        return dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C25205d dVar = (C25205d) obj;
        C52711k.m112240b(dVar, "req");
        C2201v b = ((GifEmojiApi) C25135a.f66577b.getValue()).searchGifEmoji(dVar.f66781a, dVar.f66782b, "comment", dVar.f66783c).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "GifEmojiApi.instance.sea…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        GifEmojiResponse gifEmojiResponse = (GifEmojiResponse) obj2;
        C52711k.m112240b((C25205d) obj, "req");
        C52711k.m112240b(gifEmojiResponse, "resp");
        StickerBean stickers = gifEmojiResponse.getStickers();
        if (stickers != null) {
            List stickerList = stickers.getStickerList();
            if (stickerList != null) {
                return stickerList;
            }
        }
        return C52575l.m112097a();
    }
}
