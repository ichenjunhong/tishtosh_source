package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.o */
final /* synthetic */ class C46703o implements Comparator {

    /* renamed from: a */
    static final Comparator f117831a = new C46703o();

    private C46703o() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((StickerItemModel) obj).startTime - ((StickerItemModel) obj2).startTime;
    }
}
