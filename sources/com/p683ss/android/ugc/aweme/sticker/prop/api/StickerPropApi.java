package com.p683ss.android.ugc.aweme.sticker.prop.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.sticker.prop.p2315b.C46362a;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.StickerPropApi */
public interface StickerPropApi {
    @C53075f(mo110603a = "/aweme/v1/sticker/detail/")
    C17832m<C46070e> getStickerDetail(@C53089t(mo110619a = "sticker_ids") String str);

    @C53075f(mo110603a = "/aweme/v1/sticker/aweme/")
    C17832m<C46362a> queryStickerAwemeList(@C53089t(mo110619a = "sticker_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i);
}
