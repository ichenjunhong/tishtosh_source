package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g;

import android.content.Context;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.TextStruct;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.d */
public final class C44631d extends C44628a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f112908a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44631d.class), "textStruct", "getTextStruct()Lcom/ss/android/ugc/aweme/sticker/data/TextStruct;"))};

    /* renamed from: b */
    private final C52668f f112909b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.d$a */
    static final class C44632a extends C52712l implements C52670a<TextStruct> {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f112910a;

        C44632a(InteractStickerStruct interactStickerStruct) {
            this.f112910a = interactStickerStruct;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextStruct invoke() {
            try {
                GsonProvider a = C47759cc.m103382a();
                C52711k.m112236a((Object) a, "GsonProvider.get()");
                return (TextStruct) a.getGson().mo34884a(this.f112910a.getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                return new TextStruct(null, 1, null);
            }
        }
    }

    /* renamed from: a */
    public final TextStruct mo90584a() {
        return (TextStruct) this.f112909b.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r2 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo90585b() {
        /*
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "close"
            java.lang.String r2 = "false"
            r0.put(r1, r2)
            java.lang.String r1 = "back"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
            java.lang.String r1 = "hide_nav_bar"
            java.lang.String r2 = "false"
            r0.put(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r2 = r3.f112904f
            if (r2 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.sticker.l r2 = r2.f116231p
            if (r2 == 0) goto L_0x002a
            java.lang.String r2 = r2.f116213c
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r2 = ""
        L_0x002c:
            r0.put(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r2 = r3.f112904f
            if (r2 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.sticker.l r2 = r2.f116231p
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r2.f116214d
            if (r2 != 0) goto L_0x003f
        L_0x003d:
            java.lang.String r2 = ""
        L_0x003f:
            r0.put(r1, r2)
            java.lang.String r1 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r2 = r3.f112904f
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.sticker.l r2 = r2.f116231p
            if (r2 == 0) goto L_0x0050
            java.lang.String r2 = r2.f116212b
            if (r2 != 0) goto L_0x0052
        L_0x0050:
            java.lang.String r2 = ""
        L_0x0052:
            r0.put(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44631d.mo90585b():java.util.Map");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct) {
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        return C44588c.m97544b(j, interactStickerStruct);
    }

    public C44631d(Context context, C44662h hVar, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(context, hVar, interactStickerStruct, mVar);
        this.f112909b = C52732g.m112285a(new C44632a(interactStickerStruct));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90493a(int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        eVar.mo90580a(this.f112902d.mo90608a(f, f2));
    }
}
