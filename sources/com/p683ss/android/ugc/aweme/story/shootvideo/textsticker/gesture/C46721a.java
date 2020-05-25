package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31454c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43455d;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a */
public final class C46721a extends C43455d {

    /* renamed from: a */
    public StickerGesturePresenter f117858a;

    /* renamed from: b */
    public C31459g f117859b;

    /* renamed from: c */
    public C31459g f117860c;

    /* renamed from: d */
    public boolean f117861d;

    /* renamed from: e */
    private ViewGroup f117862e;

    /* renamed from: f */
    private AnimatorListener f117863f;

    /* renamed from: g */
    private AnimatorUpdateListener f117864g;

    /* renamed from: a */
    public final boolean mo88992a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo88993b(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    /* renamed from: a */
    public final void mo88384a(float f) {
        char c;
        int i;
        if (this.f117861d) {
            if (f == 0.0f) {
                c = 0;
            } else if (f < 0.0f) {
                c = 65535;
            } else {
                c = 1;
            }
            C31454c c2 = C39629l.m88232a().mo58584o().mo64333c();
            int a = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), this.f117859b);
            if (c == 0) {
                i = a;
            } else if (c == 65535) {
                int i2 = a - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = a;
                a = i2;
                i = i3;
            } else {
                i = a + 1;
                if (i >= c2.mo64347b().size()) {
                    i = c2.mo64347b().size() - 1;
                }
            }
            c2.mo64346b(a);
            c2.mo64346b(i);
            if (f < 0.0f) {
                Math.abs(f);
            }
        }
    }

    /* renamed from: a */
    public final void mo88385a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator;
        if (this.f117861d) {
            int width = this.f117862e.getWidth();
            C31454c c = C39629l.m88232a().mo58584o().mo64333c();
            C31501n e = C39629l.m88232a().mo58584o().mo64334d().mo64415e();
            if (Math.signum(f2) == Math.signum(f)) {
                this.f117860c = this.f117859b;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) width) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                if (f >= 1.0E-5f) {
                    this.f117860c = c.mo64346b(Math.max(0, C31487c.m73323a(e, this.f117859b) - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    this.f117860c = c.mo64346b(Math.min(c.mo64347b().size() - 1, C31487c.m73323a(e, this.f117859b) + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.f117864g);
            valueAnimator.addListener(this.f117863f);
            valueAnimator.start();
        }
    }
}
