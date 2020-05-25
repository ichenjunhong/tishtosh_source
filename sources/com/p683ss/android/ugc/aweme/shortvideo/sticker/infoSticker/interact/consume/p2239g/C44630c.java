package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44660f;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.c */
public final class C44630c extends C44628a {

    /* renamed from: a */
    public PoiStruct f112906a = new PoiStruct();

    /* renamed from: b */
    public float[] f112907b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct) {
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        return C44588c.m97540a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90493a(int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        eVar.mo90580a(this.f112902d.mo90608a(f, f2));
    }

    public C44630c(Context context, C44660f fVar, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        float[] fArr;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(context, fVar, interactStickerStruct, mVar);
        this.f112906a.fromStickerPoiStruct(interactStickerStruct.getPoiStruct());
        NormalTrackTimeStamp b = C44588c.m97543b(this.f112903e);
        if (b == null) {
            fArr = null;
        } else {
            RectF a = mo90583a(b);
            float[] fArr2 = {a.left, a.top, a.right, a.top, a.left, a.bottom, a.right, a.bottom};
            Matrix matrix = new Matrix();
            matrix.postRotate(b.getRotation(), ((fArr2[2] - fArr2[0]) / 2.0f) + fArr2[0], ((fArr2[5] - fArr2[3]) / 2.0f) + fArr2[3]);
            matrix.mapPoints(fArr2);
            fArr = fArr2;
        }
        this.f112907b = fArr;
    }
}
