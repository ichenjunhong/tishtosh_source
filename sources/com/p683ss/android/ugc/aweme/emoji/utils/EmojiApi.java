package com.p683ss.android.ugc.aweme.emoji.utils;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29357b;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29388d;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.EmojiApi */
public interface EmojiApi {
    @C53084o(mo110612a = "im/resources/sticker/create/")
    C17832m<C29357b> addSelfEmoji(@C53089t(mo110619a = "hash") String str, @C53089t(mo110619a = "animate_uri") String str2, @C53089t(mo110619a = "static_uri") String str3, @C53089t(mo110619a = "animate_type") String str4, @C53089t(mo110619a = "static_type") String str5, @C53089t(mo110619a = "width") int i, @C53089t(mo110619a = "height") int i2);

    @C53084o(mo110612a = "im/resources/sticker/collect/")
    C0013i<C29357b> collectEmoji(@C53089t(mo110619a = "action") int i, @C53089t(mo110619a = "sticker_ids") String str);

    @C53084o(mo110612a = "im/resources/sticker/collect/")
    C0013i<C29357b> collectEmoji(@C53089t(mo110619a = "action") int i, @C53089t(mo110619a = "sticker_ids") String str, @C53089t(mo110619a = "sticker_uri") String str2, @C53089t(mo110619a = "sticker_url") String str3, @C53089t(mo110619a = "resource_id") long j, @C53089t(mo110619a = "sticker_type") int i2);

    @C53075f(mo110603a = "im/resources/")
    C17832m<ResourcesResponse> getResources(@C53089t(mo110619a = "resource_type") String str);

    @C53075f(mo110603a = "im/resources/sticker/list/")
    C0013i<EmojiResourcesResponse> getSelfEmojis();

    @C53075f(mo110603a = "im/resources/emoji/")
    C2201v<C29388d> getSmallEmojiResources();

    @C53075f(mo110603a = "im/resources/emoticon/trending/")
    C0013i<Object> getTrendingEmojis(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "source") String str, @C53089t(mo110619a = "group_id") String str2);

    @C53084o(mo110612a = "im/resources/sticker/collect/")
    C2201v<C29357b> rxCollectEmoji(@C53089t(mo110619a = "action") int i, @C53089t(mo110619a = "sticker_ids") String str);

    @C53084o(mo110612a = "im/resources/sticker/collect/")
    C2201v<C29357b> rxCollectEmoji(@C53089t(mo110619a = "action") int i, @C53089t(mo110619a = "sticker_ids") String str, @C53089t(mo110619a = "sticker_uri") String str2, @C53089t(mo110619a = "sticker_url") String str3, @C53089t(mo110619a = "resource_id") long j, @C53089t(mo110619a = "sticker_type") int i2);
}
