package com.p683ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p030v4.app.FragmentActivity;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42545e;
import com.p683ss.android.vesdk.VESize;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.e */
final /* synthetic */ class C45486e implements Runnable {

    /* renamed from: a */
    private final C45480a f114934a;

    /* renamed from: b */
    private final C42545e f114935b;

    C45486e(C45480a aVar, C42545e eVar) {
        this.f114934a = aVar;
        this.f114935b = eVar;
    }

    public final void run() {
        C45480a aVar = this.f114934a;
        C42545e eVar = this.f114935b;
        FragmentActivity activity = eVar.getActivity();
        if (!eVar.isDetached() && activity != null && !activity.isFinishing()) {
            int color = ChooseCoverActivity.this.getResources().getColor(R.color.b1n);
            int measuredHeight = eVar.f107598d.getMeasuredHeight();
            int measuredHeight2 = eVar.f107600f.getMeasuredHeight();
            int measuredHeight3 = eVar.f107599e.getMeasuredHeight();
            int d = C43303dy.m94973d(activity);
            ChooseCoverActivity.this.f114909b.f131275u.mo43038b(color);
            int e = C43303dy.m94974e(eVar.getActivity());
            int width = ChooseCoverActivity.this.f114911d.getWidth();
            VESize b = ChooseCoverActivity.this.f114909b.f131275u.mo43037b();
            float f = (float) b.height;
            float f2 = ((float) b.width) / f;
            float f3 = (float) width;
            float f4 = (float) measuredHeight3;
            if (f2 > f3 / f4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, (float) ((int) (f3 / f2))});
                ofFloat.setDuration(0);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                C45487f fVar = new C45487f(aVar, f2, e, measuredHeight2, measuredHeight, 0, d);
                ofFloat.addUpdateListener(fVar);
                ofFloat.start();
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f, f4});
                ofFloat2.setDuration(0);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.addUpdateListener(new AnimatorUpdateListener(f2, width, measuredHeight) {

                    /* renamed from: a */
                    final /* synthetic */ float f114919a;

                    /* renamed from: b */
                    final /* synthetic */ int f114920b;

                    /* renamed from: c */
                    final /* synthetic */ int f114921c;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f = this.f114919a * floatValue;
                        int i = (int) ((((float) this.f114920b) - f) / 2.0f);
                        int i2 = (int) (((float) this.f114921c) * animatedFraction);
                        int i3 = (int) f;
                        int i4 = (int) floatValue;
                        ChooseCoverActivity.this.f114909b.f131275u.mo43015a(i, i2, i3, i4);
                        C45480a.this.mo91760a(i, i2, i3, i4);
                        ChooseCoverActivity.this.mo91757a(i, i2, i3, i4);
                    }

                    {
                        this.f114919a = r2;
                        this.f114920b = r3;
                        this.f114921c = r4;
                    }
                });
                ofFloat2.start();
            }
            ChooseCoverActivity.this.f114909b.f131275u.mo43019a(true);
            if (!ChooseCoverActivity.this.f114908a.isMvThemeVideoType()) {
                ChooseCoverActivity.this.f114910c.mo86770c(0.0f);
            }
        }
    }
}
