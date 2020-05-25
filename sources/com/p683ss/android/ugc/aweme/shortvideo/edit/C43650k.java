package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31454c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43899b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout;
import com.p683ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k */
public final class C43650k extends C43455d {

    /* renamed from: a */
    public DefaultGesturePresenter f110555a;

    /* renamed from: b */
    public C43653a f110556b;

    /* renamed from: c */
    public C31459g f110557c;

    /* renamed from: d */
    public C31459g f110558d;

    /* renamed from: e */
    public C43654b f110559e;

    /* renamed from: f */
    public boolean f110560f;

    /* renamed from: g */
    private ViewGroup f110561g;

    /* renamed from: h */
    private Context f110562h;

    /* renamed from: i */
    private VideoRecordGestureLayout f110563i;

    /* renamed from: j */
    private C0184k f110564j;

    /* renamed from: k */
    private C31454c f110565k = C39629l.m88232a().mo58584o().mo64333c();

    /* renamed from: l */
    private C31501n f110566l = C39629l.m88232a().mo58584o().mo64334d().mo64415e();

    /* renamed from: m */
    private AnimatorListener f110567m = new AnimatorListenerAdapter() {
        public final void onAnimationStart(Animator animator) {
            C43650k.this.f110555a.f111119b = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (C43650k.this.f110558d != null) {
                C43650k.this.f110557c = C43650k.this.f110558d;
                C43650k.this.f110555a.f111118a = 0.0f;
                if (C43650k.this.f110556b != null) {
                    C43650k.this.f110556b.mo78603a(C43650k.this.f110557c);
                }
                C43650k.this.f110559e.mo88999a(C43650k.this.f110557c);
            }
            C43650k.this.f110555a.f111119b = false;
        }
    };

    /* renamed from: n */
    private AnimatorUpdateListener f110568n = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C43650k.this.mo88994d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k$a */
    public interface C43653a {
        /* renamed from: a */
        void mo78603a(C31459g gVar);

        /* renamed from: a */
        void mo78604a(C31459g gVar, C31459g gVar2, float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k$b */
    public static class C43654b {

        /* renamed from: a */
        private final Context f110571a;

        /* renamed from: b */
        private final ViewGroup f110572b;

        /* renamed from: c */
        private CompositeStoryFilterIndicator f110573c;

        /* renamed from: d */
        private C31459g f110574d;

        /* renamed from: e */
        private C31501n f110575e;

        /* renamed from: a */
        public final void mo88999a(C31459g gVar) {
            if (this.f110573c != null) {
                int a = C31487c.m73323a(this.f110575e, this.f110574d);
                int a2 = C31487c.m73323a(this.f110575e, gVar);
                if (a != a2) {
                    m95915a(this.f110574d, a, gVar, a2);
                    this.f110574d = gVar;
                }
            }
        }

        /* renamed from: a */
        public final void mo88998a(int i) {
            this.f110573c = new CompositeStoryFilterIndicator(this.f110571a);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f110573c.setLayoutParams(layoutParams);
            this.f110573c.setVisibility(8);
            this.f110572b.addView(this.f110573c, i);
        }

        public C43654b(Context context, ViewGroup viewGroup, C31459g gVar, C31501n nVar) {
            this.f110571a = context;
            this.f110572b = viewGroup;
            if (gVar == null) {
                gVar = C39629l.m88232a().mo58584o().mo64333c().mo64346b(0);
            }
            this.f110574d = gVar;
            this.f110575e = nVar;
        }

        /* renamed from: a */
        private void m95915a(C31459g gVar, int i, C31459g gVar2, int i2) {
            String str;
            boolean z;
            EffectCategoryResponse b = C31487c.m73327b(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
            EffectCategoryResponse b2 = C31487c.m73327b(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar2);
            CompositeStoryFilterIndicator compositeStoryFilterIndicator = this.f110573c;
            String str2 = gVar.f82325b;
            String str3 = null;
            if (b != null) {
                str = b.getName();
            } else {
                str = null;
            }
            C43899b bVar = new C43899b(str2, str);
            String str4 = gVar2.f82325b;
            if (b2 != null) {
                str3 = b2.getName();
            }
            C43899b bVar2 = new C43899b(str4, str3);
            if (i < i2) {
                z = true;
            } else {
                z = false;
            }
            compositeStoryFilterIndicator.mo93944a(bVar, bVar2, z);
        }
    }

    /* renamed from: e */
    private static int m95905e(float f) {
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
    public final void mo88384a(float f) {
        if (this.f110560f) {
            mo88994d(f);
        }
    }

    /* renamed from: a */
    public final void mo88990a(int i) {
        m95904b(1);
        this.f110555a = new DefaultGesturePresenter(this.f110564j, this, this.f110563i);
    }

    /* renamed from: b */
    private void m95904b(int i) {
        this.f110563i = new VideoRecordGestureLayout(this.f110562h);
        this.f110563i.setLayoutParams(new LayoutParams(-1, -1));
        this.f110561g.addView(this.f110563i, i);
        this.f110559e.mo88998a(i + 1);
    }

    /* renamed from: d */
    public final void mo88994d(float f) {
        int i;
        float f2;
        int e = m95905e(f);
        int a = C31487c.m73323a(this.f110566l, this.f110557c);
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
            if (i >= this.f110565k.mo64347b().size()) {
                i = this.f110565k.mo64347b().size() - 1;
            }
        }
        C31459g b = this.f110565k.mo64346b(a);
        C31459g b2 = this.f110565k.mo64346b(i);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        if (this.f110556b != null) {
            this.f110556b.mo78604a(b, b2, f2);
        }
    }

    /* renamed from: a */
    public final void mo88991a(C31459g gVar, boolean z) {
        this.f110557c = gVar;
    }

    /* renamed from: a */
    public final void mo88385a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator;
        if (this.f110560f) {
            int width = this.f110561g.getWidth();
            if (Math.signum(f2) == Math.signum(f)) {
                this.f110558d = this.f110557c;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) width) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                if (f >= 1.0E-5f) {
                    this.f110558d = this.f110565k.mo64346b(Math.max(0, C31487c.m73323a(this.f110566l, this.f110557c) - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    this.f110558d = this.f110565k.mo64346b(Math.min(this.f110565k.mo64347b().size() - 1, C31487c.m73323a(this.f110566l, this.f110557c) + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.f110568n);
            valueAnimator.addListener(this.f110567m);
            valueAnimator.start();
        }
    }

    public C43650k(ViewGroup viewGroup, Context context, C0184k kVar, C31459g gVar) {
        this.f110561g = viewGroup;
        this.f110562h = context;
        this.f110564j = kVar;
        this.f110557c = gVar;
        this.f110559e = new C43654b(context, viewGroup, gVar, this.f110566l);
        this.f110560f = true;
        this.f110565k = C39629l.m88232a().mo58584o().mo64333c();
    }
}
