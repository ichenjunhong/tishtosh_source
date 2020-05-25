package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44673j;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.f */
public final class C44636f extends C44628a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.f$a */
    static final class C44637a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44636f f112919a;

        /* renamed from: b */
        final /* synthetic */ View f112920b;

        C44637a(C44636f fVar, View view) {
            this.f112919a = fVar;
            this.f112920b = view;
        }

        public final void run() {
            this.f112919a.mo90589a(this.f112920b);
        }
    }

    /* renamed from: a */
    public final float[] mo90591a() {
        List a = mo90492a(0, this.f112903e);
        if (a == null || C9376b.m18558a((Collection<T>) a) || a.get(0) == null) {
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
    public final void mo90589a(View view) {
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            List a = C44588c.m97540a(this.f112903e);
            if (a != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
                if (normalTrackTimeStamp != null) {
                    RectF a2 = mo90583a(normalTrackTimeStamp);
                    view.setPivotX(((float) view.getWidth()) / 2.0f);
                    view.setPivotY(((float) view.getHeight()) / 2.0f);
                    view.setTranslationX(a2.left + ((a2.width() - ((float) view.getWidth())) / 2.0f));
                    view.setTranslationY(a2.top + ((a2.height() - ((float) view.getHeight())) / 2.0f));
                    view.setScaleX(a2.width() / ((float) view.getWidth()));
                    view.setScaleY(a2.width() / ((float) view.getWidth()));
                    view.setRotation(normalTrackTimeStamp.getRotation());
                    view.setVisibility(0);
                    view.invalidate();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct) {
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        return C44588c.m97540a(interactStickerStruct);
    }

    /* renamed from: a */
    public final void mo90590a(View view, float f) {
        C52711k.m112240b(view, "view");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new C44637a(this, view));
        } else {
            mo90589a(view);
        }
    }

    public C44636f(Context context, C44673j jVar, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(jVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(context, jVar, interactStickerStruct, mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90493a(int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        eVar.mo90580a(this.f112902d.mo90608a(f, f2));
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        User user;
        C46063m mVar = this.f112904f;
        if (mVar != null) {
            user = mVar.f116218c;
        } else {
            user = null;
        }
        if (!C47915gg.m103664m(user)) {
            return false;
        }
        return super.mo90487a(j, i, f, f2);
    }
}
