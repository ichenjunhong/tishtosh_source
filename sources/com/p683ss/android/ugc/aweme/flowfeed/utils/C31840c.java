package com.p683ss.android.ugc.aweme.flowfeed.utils;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.GifEmojiServiceImpl;
import com.p683ss.android.ugc.aweme.comment.IGifEmojiService;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.c */
public final class C31840c {
    /* renamed from: a */
    public static final List<TextExtraStruct> m74198a(Aweme aweme) {
        int i;
        int i2;
        long j;
        boolean z;
        boolean z2;
        C52711k.m112240b(aweme, "$this$compatTextExtra");
        List<TextExtraStruct> arrayList = new ArrayList<>();
        List textExtra = aweme.getTextExtra();
        if (textExtra != null) {
            for (Object next : textExtra) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) next;
                C52711k.m112236a((Object) textExtraStruct, "it");
                if (textExtraStruct.getType() != 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
        }
        List textExtra2 = aweme.getTextExtra();
        if (textExtra2 != null) {
            Iterable iterable = textExtra2;
            Collection arrayList2 = new ArrayList();
            for (Object next2 : iterable) {
                TextExtraStruct textExtraStruct2 = (TextExtraStruct) next2;
                C52711k.m112236a((Object) textExtraStruct2, "it");
                if (textExtraStruct2.getType() == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            for (TextExtraStruct textExtraStruct3 : (List) arrayList2) {
                IGifEmojiService createIGifEmojiServicebyMonsterPlugin = GifEmojiServiceImpl.createIGifEmojiServicebyMonsterPlugin();
                C29366a aVar = new C29366a();
                C52711k.m112236a((Object) textExtraStruct3, "it");
                UrlModel stickerUrl = textExtraStruct3.getStickerUrl();
                if (stickerUrl == null) {
                    stickerUrl = new UrlModel();
                }
                aVar.setAnimateUrl(stickerUrl);
                UrlModel stickerUrl2 = textExtraStruct3.getStickerUrl();
                if (stickerUrl2 == null) {
                    stickerUrl2 = new UrlModel();
                }
                aVar.setStaticUrl(stickerUrl2);
                UrlModel stickerUrl3 = textExtraStruct3.getStickerUrl();
                if (stickerUrl3 != null) {
                    i = stickerUrl3.getWidth();
                } else {
                    i = 0;
                }
                aVar.setWidth(i);
                UrlModel stickerUrl4 = textExtraStruct3.getStickerUrl();
                if (stickerUrl4 != null) {
                    i2 = stickerUrl4.getHeight();
                } else {
                    i2 = 0;
                }
                aVar.setHeight(i2);
                String stickerId = textExtraStruct3.getStickerId();
                if (stickerId != null) {
                    Long d = C52830p.m112396d(stickerId);
                    if (d != null) {
                        j = d.longValue();
                        aVar.setId(j);
                        aVar.setStickerType(textExtraStruct3.getStickerSource());
                        aVar.setAnimateType("gif");
                        arrayList.addAll(createIGifEmojiServicebyMonsterPlugin.getGifEmojiDetailTailSpan(aVar, textExtraStruct3.getStart(), textExtraStruct3.getEnd()));
                    }
                }
                j = 0;
                aVar.setId(j);
                aVar.setStickerType(textExtraStruct3.getStickerSource());
                aVar.setAnimateType("gif");
                arrayList.addAll(createIGifEmojiServicebyMonsterPlugin.getGifEmojiDetailTailSpan(aVar, textExtraStruct3.getStart(), textExtraStruct3.getEnd()));
            }
        }
        return arrayList;
    }
}
