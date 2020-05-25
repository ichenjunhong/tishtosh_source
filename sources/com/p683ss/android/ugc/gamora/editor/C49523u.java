package com.p683ss.android.ugc.gamora.editor;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0184k;
import android.view.ScaleGestureDetector;
import android.view.animation.DecelerateInterpolator;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31454c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43455d;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StickerGesturePresenter;

/* renamed from: com.ss.android.ugc.gamora.editor.u */
public final class C49523u extends C43455d {

    /* renamed from: a */
    public StickerGesturePresenter f124252a;

    /* renamed from: b */
    public C49526a f124253b;

    /* renamed from: c */
    public C31459g f124254c;

    /* renamed from: d */
    public C31459g f124255d;

    /* renamed from: e */
    public boolean f124256e = true;

    /* renamed from: f */
    public EditFilterIndicatorViewModel f124257f;

    /* renamed from: g */
    private VideoRecordGestureLayout f124258g;

    /* renamed from: h */
    private C0184k f124259h;

    /* renamed from: i */
    private EditGestureViewModel f124260i;

    /* renamed from: j */
    private AnimatorListener f124261j = new AnimatorListenerAdapter() {
        public final void onAnimationStart(Animator animator) {
            C49523u.this.f124252a.f117854c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (C49523u.this.f124255d != null) {
                C49523u.this.f124254c = C49523u.this.f124255d;
                C49523u.this.f124252a.f117853b = 0.0f;
                if (C49523u.this.f124253b != null) {
                    C49523u.this.f124253b.mo97453a(C49523u.this.f124254c);
                }
                C49523u.this.f124257f.mo96820a(false, C49523u.this.f124254c);
            }
            C49523u.this.f124252a.f117854c = false;
        }
    };

    /* renamed from: k */
    private AnimatorUpdateListener f124262k = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C49523u.this.mo97449d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    /* renamed from: com.ss.android.ugc.gamora.editor.u$a */
    public interface C49526a {
        /* renamed from: a */
        void mo97453a(C31459g gVar);

        /* renamed from: a */
        void mo97454a(C31459g gVar, C31459g gVar2, float f);
    }

    /* renamed from: e */
    private static int m106837e(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return f < 0.0f ? -1 : 1;
    }

    /* renamed from: a */
    public final boolean mo88992a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo88993b(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    /* renamed from: a */
    public final void mo97447a(C43866a aVar) {
        this.f124252a.mo93795a(aVar);
    }

    /* renamed from: a */
    public final void mo88384a(float f) {
        if (this.f124256e) {
            mo97449d(f);
        }
    }

    /* renamed from: d */
    public final void mo97449d(float f) {
        int i;
        float f2;
        int e = m106837e(f);
        C31454c c = C39629l.m88232a().mo58584o().mo64333c();
        int a = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), this.f124254c);
        if (e == 0) {
            i = a;
        } else if (e == -1) {
            int i2 = a - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = a;
            a = i2;
            i = i3;
        } else {
            i = a + 1;
            if (i >= c.mo64347b().size()) {
                i = c.mo64347b().size() - 1;
            }
        }
        C31459g b = c.mo64346b(a);
        C31459g b2 = c.mo64346b(i);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        if (this.f124253b != null) {
            this.f124253b.mo97454a(b, b2, f2);
        }
    }

    /* renamed from: a */
    public final void mo97448a(boolean z, C31459g gVar) {
        this.f124254c = gVar;
        this.f124257f.mo96820a(false, gVar);
    }

    /* renamed from: a */
    public final void mo88385a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator;
        if (this.f124256e) {
            int width = this.f124258g.getWidth();
            C31454c c = C39629l.m88232a().mo58584o().mo64333c();
            C31501n e = C39629l.m88232a().mo58584o().mo64334d().mo64415e();
            if (Math.signum(f2) == Math.signum(f)) {
                this.f124255d = this.f124254c;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) width) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                if (f >= 1.0E-5f) {
                    this.f124255d = c.mo64346b(Math.max(0, C31487c.m73323a(e, this.f124254c) - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    this.f124255d = c.mo64346b(Math.min(c.mo64347b().size() - 1, C31487c.m73323a(e, this.f124254c) + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.f124262k);
            valueAnimator.addListener(this.f124261j);
            valueAnimator.start();
        }
    }

    public C49523u(C0184k kVar, VideoRecordGestureLayout videoRecordGestureLayout, EditFilterIndicatorViewModel editFilterIndicatorViewModel, C31459g gVar, EditGestureViewModel editGestureViewModel) {
        this.f124259h = kVar;
        this.f124258g = videoRecordGestureLayout;
        this.f124257f = editFilterIndicatorViewModel;
        this.f124254c = gVar;
        this.f124252a = new StickerGesturePresenter(this.f124259h, this, this.f124258g);
        this.f124257f.mo96820a(true, this.f124254c);
        this.f124260i = editGestureViewModel;
    }
}
