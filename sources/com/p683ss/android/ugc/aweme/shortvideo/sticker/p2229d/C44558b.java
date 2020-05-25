package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2229d;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity.C44603a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44628a;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b */
public final class C44558b extends C44628a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f112739a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44558b.class), "stickerLocation", "getStickerLocation()[F"))};

    /* renamed from: b */
    public static final C44559a f112740b = new C44559a(null);

    /* renamed from: g */
    private final C52668f f112741g = C52732g.m112285a(new C44562d(this));

    /* renamed from: h */
    private final C44626f f112742h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b$a */
    public static final class C44559a {
        private C44559a() {
        }

        public /* synthetic */ C44559a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b$b */
    public static final class C44560b extends C17956a<HashMap<String, String>> {
        C44560b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b$c */
    static final class C44561c extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44558b f112743a;

        C44561c(C44558b bVar) {
            this.f112743a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putString("title", this.f112743a.f112901c.getString(R.string.g9a));
            bundle.putString("enter_from", "donation_sticker_consume");
            bundle.putString("hide_more", "false");
            C44603a.m97561a(this.f112743a.f112901c, bundle);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b$d */
    static final class C44562d extends C52712l implements C52670a<float[]> {

        /* renamed from: a */
        final /* synthetic */ C44558b f112744a;

        C44562d(C44558b bVar) {
            this.f112744a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f112744a.mo90501a();
        }
    }

    /* renamed from: a */
    public final float[] mo90501a() {
        long j;
        boolean z;
        C44626f fVar = this.f112742h;
        if (fVar != null) {
            j = fVar.mo60220ak();
        } else {
            j = 0;
        }
        List a = mo90492a(j, this.f112903e);
        Collection collection = a;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || a.get(0) == null) {
            return null;
        }
        Object obj = a.get(0);
        if (obj == null) {
            C52711k.m112234a();
        }
        RectF a2 = mo90583a((NormalTrackTimeStamp) obj);
        float[] fArr = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
        Matrix matrix = new Matrix();
        Object obj2 = a.get(0);
        if (obj2 == null) {
            C52711k.m112234a();
        }
        matrix.postRotate(((NormalTrackTimeStamp) obj2).getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct) {
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        return C44588c.m97544b(j, interactStickerStruct);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[Catch:{ u -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8 A[Catch:{ u -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2 A[Catch:{ u -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc A[Catch:{ u -> 0x00df }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90493a(int r2, float r3, float r4, com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e r5) {
        /*
            r1 = this;
            java.lang.String r2 = "poiPopListener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r2 = r1.f112902d
            r3 = 6
            android.view.View r2 = r2.mo90485a(r3)
            boolean r2 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r2)
            if (r2 == 0) goto L_0x0013
            return
        L_0x0013:
            com.ss.android.ugc.aweme.feed.h.l r2 = new com.ss.android.ugc.aweme.feed.h.l
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r3 = r1.f112902d
            int r3 = r3.mo90579h()
            r2.<init>(r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r2)
            java.lang.String r2 = "sticker_click"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r1.f112904f
            r0 = 0
            if (r5 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0035
            java.lang.String r5 = r5.f116214d
            goto L_0x0036
        L_0x0035:
            r5 = r0
        L_0x0036:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r1.f112904f
            if (r5 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = r5.f116213c
            goto L_0x0048
        L_0x0047:
            r5 = r0
        L_0x0048:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r5 = r1.f112904f
            if (r5 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0059
            java.lang.String r5 = r5.f116215e
            goto L_0x005a
        L_0x0059:
            r5 = r0
        L_0x005a:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r5 = r1.f112904f
            if (r5 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x006b
            java.lang.String r5 = r5.f116212b
            goto L_0x006c
        L_0x006b:
            r5 = r0
        L_0x006c:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "sticker_type"
            java.lang.String r5 = "donation"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r3)
            com.ss.android.ugc.aweme.utils.GsonProvider r2 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()     // Catch:{ u -> 0x00df }
            java.lang.String r3 = "GsonProvider.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ u -> 0x00df }
            com.google.gson.f r2 = r2.getGson()     // Catch:{ u -> 0x00df }
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r1.f112903e     // Catch:{ u -> 0x00df }
            java.lang.String r3 = r3.getAttr()     // Catch:{ u -> 0x00df }
            com.ss.android.ugc.aweme.shortvideo.sticker.d.b$b r4 = new com.ss.android.ugc.aweme.shortvideo.sticker.d.b$b     // Catch:{ u -> 0x00df }
            r4.<init>()     // Catch:{ u -> 0x00df }
            java.lang.reflect.Type r4 = r4.f49843c     // Catch:{ u -> 0x00df }
            java.lang.Object r2 = r2.mo34885a(r3, r4)     // Catch:{ u -> 0x00df }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ u -> 0x00df }
            if (r2 == 0) goto L_0x00a8
            java.lang.String r3 = "donation_url"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ u -> 0x00df }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ u -> 0x00df }
            goto L_0x00a9
        L_0x00a8:
            r2 = r0
        L_0x00a9:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ u -> 0x00df }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ u -> 0x00df }
            if (r3 != 0) goto L_0x00cc
            if (r2 != 0) goto L_0x00b7
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ u -> 0x00df }
        L_0x00b7:
            com.ss.android.ugc.aweme.shortvideo.util.x r3 = com.p683ss.android.ugc.aweme.shortvideo.util.C45461x.f114877a     // Catch:{ u -> 0x00df }
            android.content.Context r4 = r1.f112901c     // Catch:{ u -> 0x00df }
            com.ss.android.ugc.aweme.sticker.m r5 = r1.f112904f     // Catch:{ u -> 0x00df }
            if (r5 == 0) goto L_0x00c1
            java.lang.String r0 = r5.f116219d     // Catch:{ u -> 0x00df }
        L_0x00c1:
            com.ss.android.ugc.aweme.shortvideo.sticker.d.b$c r5 = new com.ss.android.ugc.aweme.shortvideo.sticker.d.b$c     // Catch:{ u -> 0x00df }
            r5.<init>(r1)     // Catch:{ u -> 0x00df }
            d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5     // Catch:{ u -> 0x00df }
            r3.mo91748a(r4, r0, r2, r5)     // Catch:{ u -> 0x00df }
            return
        L_0x00cc:
            android.content.Context r2 = r1.f112901c     // Catch:{ u -> 0x00df }
            android.content.Context r3 = r1.f112901c     // Catch:{ u -> 0x00df }
            r4 = 2132544115(0x7f1c0a73, float:2.0741382E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ u -> 0x00df }
            com.bytedance.ies.dmt.ui.d.a r2 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r2, r3)     // Catch:{ u -> 0x00df }
            r2.mo19066a()     // Catch:{ u -> 0x00df }
            return
        L_0x00df:
            r2 = move-exception
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.p2229d.C44558b.mo90493a(int, float, float, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.e):void");
    }

    public C44558b(Context context, C44556a aVar, InteractStickerStruct interactStickerStruct, C46063m mVar, C44626f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(context, aVar, interactStickerStruct, mVar);
        this.f112742h = fVar;
    }
}
