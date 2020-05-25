package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g;

import android.content.Context;
import android.graphics.RectF;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44622b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44643a;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a */
public abstract class C44628a implements C44622b {

    /* renamed from: a */
    private final String f112900a = "BaseStickerPresenter";

    /* renamed from: c */
    public final Context f112901c;

    /* renamed from: d */
    public final C44643a f112902d;

    /* renamed from: e */
    public final InteractStickerStruct f112903e;

    /* renamed from: f */
    public C46063m f112904f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo90493a(int i, float f, float f2, C44625e eVar);

    /* renamed from: a */
    public final void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        this.f112904f = mVar;
    }

    /* renamed from: a */
    public final RectF mo90583a(NormalTrackTimeStamp normalTrackTimeStamp) {
        float f;
        float f2;
        float f3;
        C52711k.m112240b(normalTrackTimeStamp, "location");
        float f4 = 0.0f;
        if (this.f112904f == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C46063m mVar = this.f112904f;
        if (mVar != null) {
            f = mVar.f116216a;
        } else {
            f = 0.0f;
        }
        float width = f * normalTrackTimeStamp.getWidth();
        C46063m mVar2 = this.f112904f;
        if (mVar2 != null) {
            f2 = mVar2.f116217b;
        } else {
            f2 = 0.0f;
        }
        float height = f2 * normalTrackTimeStamp.getHeight();
        C46063m mVar3 = this.f112904f;
        if (mVar3 != null) {
            f3 = mVar3.f116216a;
        } else {
            f3 = 0.0f;
        }
        float x = (f3 * normalTrackTimeStamp.getX()) - (width / 2.0f);
        C46063m mVar4 = this.f112904f;
        if (mVar4 != null) {
            f4 = mVar4.f116217b;
        }
        float y = (f4 * normalTrackTimeStamp.getY()) - (height / 2.0f);
        return new RectF(x, y, width + x, height + y);
    }

    public C44628a(Context context, C44643a aVar, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        this.f112901c = context;
        this.f112902d = aVar;
        this.f112903e = interactStickerStruct;
        this.f112904f = mVar;
    }

    /* renamed from: a */
    public boolean mo90487a(long j, int i, float f, float f2) {
        List<NormalTrackTimeStamp> a = mo90492a(j, this.f112903e);
        if (a == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList<>();
        if (a != null) {
            for (NormalTrackTimeStamp normalTrackTimeStamp : a) {
                if (normalTrackTimeStamp == null) {
                    C52711k.m112234a();
                }
                arrayList.add(mo90583a(normalTrackTimeStamp));
            }
        }
        int i2 = 0;
        for (RectF rectF : arrayList) {
            if (!(a == null || a.get(i2) == null)) {
                Object obj = a.get(i2);
                if (obj == null) {
                    C52711k.m112234a();
                }
                if (C43454a.m95253b(rectF, f, f2, ((NormalTrackTimeStamp) obj).getRotation())) {
                    return true;
                }
            }
            i2++;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        if (!mo90487a(j, i, f, f2)) {
            return false;
        }
        mo90493a(i, f, f2, eVar);
        return true;
    }
}
