package com.p683ss.android.ugc.aweme.sticker;

import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29742k;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;

/* renamed from: com.ss.android.ugc.aweme.sticker.s */
public final class C46411s implements C46039j {
    /* renamed from: a */
    public final AbsInteractStickerWidget mo92586a() {
        return new InteractStickerWidget();
    }

    /* renamed from: b */
    public final C23526a mo92588b() {
        return new C29742k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92587a(com.p683ss.android.ugc.aweme.feed.model.Aweme r8, android.content.Context r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = r8.getStickerIDs()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = r8.getStickerIDs()
            java.lang.String r1 = "aweme.stickerIDs"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = ","
            d.m.l r2 = new d.m.l
            r2.<init>(r1)
            r1 = 0
            java.util.List r0 = r2.split(r0, r1)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0066
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x0040:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r2.previous()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 1
            if (r3 != 0) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            if (r3 != 0) goto L_0x0040
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r4
            java.util.List r0 = p2628d.p2629a.C52575l.m112129b(r0, r2)
            goto L_0x006a
        L_0x0066:
            java.util.List r0 = p2628d.p2629a.C52575l.m112097a()
        L_0x006a:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            if (r0 == 0) goto L_0x00ec
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
        L_0x0077:
            if (r1 >= r2) goto L_0x0087
            r3 = r0[r1]
            boolean r4 = r5.contains(r3)
            if (r4 != 0) goto L_0x0084
            r5.add(r3)
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x0077
        L_0x0087:
            java.lang.String r2 = r8.getAid()
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            r1 = 0
            if (r0 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            boolean r0 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84056a(r0)
            if (r0 != 0) goto L_0x00af
            com.ss.android.ugc.aweme.shortvideo.y.c r0 = new com.ss.android.ugc.aweme.shortvideo.y.c
            r0.<init>()
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r0.convertToMusicModel()
            com.ss.android.ugc.aweme.shortvideo.c r0 = com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45627c.m99362a(r0)
            r3 = r0
            goto L_0x00b0
        L_0x00af:
            r3 = r1
        L_0x00b0:
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            if (r0 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            boolean r0 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84056a(r0)
            if (r0 != 0) goto L_0x00c4
            com.ss.android.ugc.aweme.music.model.Music r1 = r8.getMusic()
        L_0x00c4:
            r4 = r1
            java.io.Serializable r4 = (java.io.Serializable) r4
            boolean r8 = com.p683ss.android.ugc.aweme.sticker.prop.p2317d.C46371a.m100720a(r8)
            java.lang.String r6 = "reuse"
            r1 = r9
            android.content.Intent r0 = com.p683ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.m100711a(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "extra_log_pb"
            r0.putExtra(r1, r10)
            java.lang.String r10 = "is_green_screen_mode"
            r0.putExtra(r10, r8)
            boolean r8 = r9 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00e8
            android.app.Activity r9 = (android.app.Activity) r9
            r8 = 10086(0x2766, float:1.4133E-41)
            r9.startActivityForResult(r0, r8)
            return
        L_0x00e8:
            r9.startActivity(r0)
            goto L_0x00f4
        L_0x00ec:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r9)
            throw r8
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.C46411s.mo92587a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, java.lang.String):void");
    }
}
