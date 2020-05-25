package com.bytedance.android.live.broadcast.effect;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.core.p224c.C3831a;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.live.broadcast.effect.m */
final /* synthetic */ class C3263m implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C3261l f9423a;

    /* renamed from: b */
    private final int f9424b;

    /* renamed from: c */
    private final int f9425c;

    /* renamed from: d */
    private final int f9426d;

    C3263m(C3261l lVar, int i, int i2, int i3) {
        this.f9423a = lVar;
        this.f9424b = i;
        this.f9425c = i2;
        this.f9426d = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C3261l lVar = this.f9423a;
        int i = this.f9424b;
        int i2 = this.f9425c;
        int i3 = this.f9426d;
        if (i == 0) {
            String str = "LiveFilterHelper";
            try {
                StringBuilder sb = new StringBuilder("FilterEffect update left file:");
                sb.append(((FilterModel) lVar.f9418a.get(i2)).getFilterPath());
                sb.append(" right file:");
                sb.append(((FilterModel) lVar.f9418a.get(i3)).getFilterPath());
                sb.append(" pos:");
                sb.append((Float) valueAnimator.getAnimatedValue());
                C3831a.m9707a(str, sb.toString());
                lVar.f9419b.mo8767a(((FilterModel) lVar.f9418a.get(i2)).getFilterPath(), ((FilterModel) lVar.f9418a.get(i3)).getFilterPath(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            } catch (FileNotFoundException unused) {
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("FilterEffect update left file:");
        sb2.append(((FilterModel) lVar.f9418a.get(i3)).getFilterPath());
        sb2.append(" right file:");
        sb2.append(((FilterModel) lVar.f9418a.get(i2)).getFilterPath());
        sb2.append(" pos:");
        sb2.append(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C3831a.m9707a("LiveFilterHelper", sb2.toString());
        lVar.f9419b.mo8767a(((FilterModel) lVar.f9418a.get(i3)).getFilterPath(), ((FilterModel) lVar.f9418a.get(i2)).getFilterPath(), 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
