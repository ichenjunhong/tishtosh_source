package com.p683ss.android.ugc.aweme.comment;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.GifEmojiServiceImpl */
public final class GifEmojiServiceImpl implements IGifEmojiService {
    public static IGifEmojiService createIGifEmojiServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IGifEmojiService.class);
        if (a != null) {
            return (IGifEmojiService) a;
        }
        return new GifEmojiServiceImpl();
    }

    public final List<TextExtraStruct> getGifEmojiDetailTailSpan(C29366a aVar, int i, int i2) {
        C52711k.m112240b(aVar, "emoji");
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setStart(i);
        textExtraStruct.setEnd(i2);
        textExtraStruct.setCustomSpan(new C25276q());
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setStart(i);
        textExtraStruct2.setEnd(i2);
        textExtraStruct2.setCustomSpan(new C25278r(aVar));
        return C52575l.m112099b((Object[]) new TextExtraStruct[]{textExtraStruct, textExtraStruct2});
    }
}
