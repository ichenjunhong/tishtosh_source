package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50000f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.an */
public final class C44976an implements C50000f {

    /* renamed from: a */
    private FaceStickerBean f113908a;

    /* renamed from: b */
    private final FragmentActivity f113909b;

    /* renamed from: c */
    private final ShortVideoContext f113910c;

    /* renamed from: a */
    private final C49607a m98325a() {
        return C49608a.m107073b(this.f113909b);
    }

    /* renamed from: b */
    private static boolean m98326b() {
        C42482c b = C43214dh.m94817a().mo50201b();
        if (b != null && b.getMusicPriority() >= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91268a(com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean r4) {
        /*
            r3 = this;
            android.support.v4.app.FragmentActivity r0 = r3.f113909b
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f113910c
            boolean r0 = r0.mo86365f()
            if (r0 != 0) goto L_0x007d
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f113910c
            boolean r0 = r0.mo86366g()
            if (r0 == 0) goto L_0x001a
            goto L_0x007d
        L_0x001a:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f113910c
            com.ss.android.ugc.aweme.shortvideo.em r0 = r0.f107119l
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 0
            goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 != 0) goto L_0x0031
            return
        L_0x0031:
            if (r4 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r3.f113908a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x007b
            boolean r0 = r4.isForceBind()
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r4.getMusicIds()
            boolean r0 = com.bytedance.common.utility.C9414h.m18631b(r0)
            if (r0 == 0) goto L_0x0079
            boolean r0 = m98326b()
            if (r0 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.shortvideo.c r0 = r4.getForceBindMusic()
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = r4.getForceBindMusicPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0066
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r1 = 1
        L_0x0067:
            if (r1 == 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            com.ss.android.ugc.gamora.recorder.c.a r1 = r3.m98325a()
            if (r1 == 0) goto L_0x0079
            r1.mo97518a(r0)
        L_0x0079:
            r3.f113908a = r4
        L_0x007b:
            return
        L_0x007c:
            return
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44976an.mo91268a(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean):void");
    }

    public C44976an(FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f113909b = fragmentActivity;
        this.f113910c = shortVideoContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91269a(com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sticker"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            android.support.v4.app.FragmentActivity r0 = r9.f113909b
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f113910c
            boolean r0 = r0.mo86365f()
            if (r0 != 0) goto L_0x00ca
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f113910c
            boolean r0 = r0.mo86366g()
            if (r0 != 0) goto L_0x00ca
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f113910c
            boolean r0 = r0.mo86362d()
            if (r0 == 0) goto L_0x0028
            goto L_0x00ca
        L_0x0028:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f113910c
            com.ss.android.ugc.aweme.shortvideo.em r0 = r0.f107119l
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = 0
            goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            com.ss.android.ugc.aweme.shortvideo.c r0 = r10.getForceBindMusic()
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r0 != 0) goto L_0x0058
            if (r3 == 0) goto L_0x0056
            int r0 = r3.getMusicPriority()
            if (r0 >= 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r0 = 0
            goto L_0x0067
        L_0x0058:
            if (r3 != 0) goto L_0x005c
        L_0x005a:
            r0 = 1
            goto L_0x0067
        L_0x005c:
            int r0 = r0.getMusicPriority()
            int r3 = r3.getMusicPriority()
            if (r0 < r3) goto L_0x0056
            goto L_0x005a
        L_0x0067:
            if (r0 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            if (r0 == r10) goto L_0x008a
            com.ss.android.ugc.aweme.shortvideo.c r0 = r10.getForceBindMusic()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r10.getForceBindMusicPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0084
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r0 = 0
            goto L_0x0085
        L_0x0084:
            r0 = 1
        L_0x0085:
            if (r0 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r4 = 0
            goto L_0x008b
        L_0x008a:
            r4 = 1
        L_0x008b:
            com.ss.android.ugc.gamora.recorder.c.a r0 = r9.m98325a()
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.shortvideo.c r2 = r10.getForceBindMusic()
            java.lang.String r3 = r10.getForceBindMusicPath()
            r0.mo97520a(r4, r1, r2, r3)
        L_0x009e:
            com.ss.android.ugc.aweme.bw.a.d r0 = new com.ss.android.ugc.aweme.bw.a.d
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.shortvideo.c r6 = r10.getForceBindMusic()
            java.lang.String r7 = r10.getForceBindMusicPath()
            r8 = r11 ^ 1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r2 = r10.getForceBindMusic()
            r1.mo50200a(r2)
            com.ss.android.ugc.gamora.recorder.c.a r1 = r9.m98325a()
            if (r1 == 0) goto L_0x00c4
            r1.mo97514a(r0)
        L_0x00c4:
            if (r11 != 0) goto L_0x00c9
            r9.mo91268a(r10)
        L_0x00c9:
            return
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44976an.mo91269a(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, boolean):void");
    }
}
