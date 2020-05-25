package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.l */
public final /* synthetic */ class C46700l implements C17410f {

    /* renamed from: a */
    public static final C17410f f117828a = new C46700l();

    private C46700l() {
    }

    /* renamed from: a */
    public final Object mo33734a(Object obj) {
        String[] textStrAry = ((TextStickerData) C39629l.m88232a().mo58566D().mo34884a(((StickerItemModel) obj).extra, TextStickerData.class)).getTextStrAry();
        if (textStrAry == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (String append : textStrAry) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
