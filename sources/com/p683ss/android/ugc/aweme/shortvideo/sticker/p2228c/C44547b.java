package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2228c;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44628a;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.b */
public final class C44547b extends C44628a {

    /* renamed from: a */
    public float[] f112718a;

    /* renamed from: b */
    private final C44626f f112719b;

    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct) {
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        return C44588c.m97544b(j, interactStickerStruct);
    }

    /* renamed from: a */
    public final void mo90493a(int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        eVar.mo90580a(this.f112902d.mo90608a(f, f2));
    }

    public C44547b(Context context, C44546a aVar, InteractStickerStruct interactStickerStruct, C46063m mVar, C44626f fVar) {
        long j;
        NormalTrackTimeStamp normalTrackTimeStamp;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(context, aVar, interactStickerStruct, mVar);
        this.f112719b = fVar;
        C44626f fVar2 = this.f112719b;
        if (fVar2 != null) {
            j = fVar2.mo60220ak();
        } else {
            j = 0;
        }
        List a = mo90492a(j, this.f112903e);
        float[] fArr = null;
        if (a != null && (a == null || !a.isEmpty())) {
            if (a != null) {
                normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
            } else {
                normalTrackTimeStamp = null;
            }
            if (normalTrackTimeStamp != null) {
                Object obj = a.get(0);
                if (obj == null) {
                    C52711k.m112234a();
                }
                RectF a2 = mo90583a((NormalTrackTimeStamp) obj);
                float[] fArr2 = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
                Matrix matrix = new Matrix();
                Object obj2 = a.get(0);
                if (obj2 == null) {
                    C52711k.m112234a();
                }
                matrix.postRotate(((NormalTrackTimeStamp) obj2).getRotation(), ((fArr2[2] - fArr2[0]) / 2.0f) + fArr2[0], ((fArr2[5] - fArr2[3]) / 2.0f) + fArr2[3]);
                matrix.mapPoints(fArr2);
                fArr = fArr2;
            }
        }
        this.f112718a = fArr;
    }
}
