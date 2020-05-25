package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.feedpage.C36082a;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.c */
public class C30828c {

    /* renamed from: a */
    public static final String f80756a = "c";

    /* renamed from: b */
    public boolean f80757b;

    /* renamed from: c */
    public boolean f80758c;

    /* renamed from: d */
    public boolean f80759d;

    /* renamed from: e */
    public User f80760e;

    /* renamed from: f */
    public View f80761f;

    /* renamed from: g */
    public LiveCircleView f80762g;

    /* renamed from: h */
    public ValueAnimator f80763h;

    /* renamed from: i */
    public ValueAnimator f80764i;

    /* renamed from: j */
    public C1710e<C36083b> f80765j;

    /* renamed from: k */
    Aweme f80766k;

    /* renamed from: l */
    private View f80767l;

    /* renamed from: m */
    private AnimatorSet f80768m;

    /* renamed from: n */
    private Class f80769n;

    /* renamed from: o */
    private boolean f80770o;

    /* renamed from: p */
    private OnAttachStateChangeListener f80771p = new OnAttachStateChangeListener() {
        public final void onViewDetachedFromWindow(View view) {
            C30828c.this.mo63565b();
        }

        public final void onViewAttachedToWindow(View view) {
            if (C30828c.this.f80759d) {
                C30828c.this.mo63560a();
            }
        }
    };

    /* renamed from: a */
    public final void mo63560a() {
        mo63561a(0);
        mo63566c();
    }

    public C30828c() {
    }

    /* renamed from: b */
    public final void mo63565b() {
        mo63567d();
        mo63561a(8);
    }

    /* renamed from: d */
    public final void mo63567d() {
        if (this.f80768m != null) {
            this.f80768m.cancel();
            this.f80758c = false;
            this.f80757b = false;
        }
    }

    /* renamed from: c */
    public final void mo63566c() {
        this.f80759d = m72245a(this.f80760e);
        if (!this.f80759d) {
            mo63565b();
            if (!(this.f80765j == null || this.f80760e == null)) {
                try {
                    this.f80765j.accept(new C36083b(Long.parseLong(this.f80760e.getUid()), 0));
                } catch (Exception unused) {
                }
            }
        } else if (this.f80758c) {
            if (this.f80765j != null) {
                mo63562a(this.f80760e, this.f80765j);
            }
        } else {
            if (this.f80763h == null) {
                this.f80763h = ValueAnimator.ofInt(new int[]{0, 800});
                this.f80763h.setRepeatCount(-1);
                this.f80763h.setRepeatMode(1);
                this.f80763h.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (animatedFraction <= 0.5f) {
                            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
                        } else {
                            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
                        }
                        if (C30828c.this.f80761f != null) {
                            C30828c.this.f80761f.setScaleX(f);
                            C30828c.this.f80761f.setScaleY(f);
                        }
                        if (intValue >= 730 && intValue < 740 && !C30828c.this.f80757b) {
                            C30828c.this.f80757b = true;
                            C30828c.this.f80764i.start();
                        }
                    }
                });
            }
            if (this.f80764i == null) {
                this.f80764i = ValueAnimator.ofInt(new int[]{0, 800});
                this.f80764i.setRepeatCount(-1);
                this.f80764i.setRepeatMode(1);
                this.f80764i.setDuration(800);
                this.f80764i.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (intValue >= 0 && intValue <= 640) {
                            float f = (((float) intValue) * 1.0f) / 640.0f;
                            if (C30828c.this.f80762g != null) {
                                C30828c.this.f80762g.setFraction(f);
                            }
                        }
                    }
                });
                this.f80764i.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: b */
                    private int f80776b;

                    public final void onAnimationRepeat(Animator animator) {
                        this.f80776b++;
                        if (C30828c.this.f80765j != null && this.f80776b >= 10) {
                            this.f80776b = 0;
                            C30828c.this.mo63562a(C30828c.this.f80760e, C30828c.this.f80765j);
                        }
                    }
                });
            }
            if (this.f80768m == null) {
                this.f80768m = new AnimatorSet();
                this.f80768m.setDuration(800);
                this.f80768m.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationCancel(Animator animator) {
                        if (C30828c.this.f80764i != null) {
                            C30828c.this.f80764i.cancel();
                        }
                        if (C30828c.this.f80763h != null) {
                            C30828c.this.f80763h.cancel();
                        }
                        C30828c.this.f80758c = false;
                        C30828c.this.f80757b = false;
                    }
                });
            }
            this.f80768m.play(this.f80763h);
            this.f80758c = true;
            this.f80768m.start();
            if (this.f80765j != null) {
                mo63562a(this.f80760e, this.f80765j);
            }
        }
    }

    /* renamed from: a */
    private boolean m72245a(User user) {
        if (user == null) {
            return this.f80759d;
        }
        if (!C26235d.m63570a(this.f80766k)) {
            boolean isLive = user.isLive();
            if (isLive && !C47915gg.m103651b() && ((!user.isSecret() || C47915gg.m103663l(user)) && isLive && C46635b.m101190a() && !user.isBlock())) {
                return true;
            }
            return false;
        } else if (!this.f80770o) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo63561a(int i) {
        if (i == 0) {
            if (this.f80762g != null) {
                this.f80762g.setVisibility(0);
            }
            if (this.f80761f != null) {
                this.f80761f.setVisibility(0);
                if (!(this.f80767l == null || this.f80761f == this.f80767l)) {
                    this.f80767l.setVisibility(8);
                }
            }
        } else {
            if (this.f80762g != null) {
                this.f80762g.setVisibility(8);
            }
            if (!(this.f80761f == null || this.f80761f == this.f80767l)) {
                this.f80761f.setVisibility(8);
            }
            if (this.f80767l != null) {
                this.f80767l.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo63562a(User user, C1710e<C36083b> eVar) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            long parseLong = Long.parseLong(user.getUid());
            C36082a liveStateManager = C36173w.m81665a().getLiveStateManager();
            Class cls = this.f80769n;
            C30895d dVar = new C30895d(this, parseLong, user, eVar);
            liveStateManager.mo74801a(cls, user, (C1710e<Map<Long, Long>>) dVar);
        }
    }

    /* renamed from: a */
    public final void mo63563a(User user, Class cls, C1710e<C36083b> eVar) {
        mo63564a(user, cls, eVar, null, false);
    }

    public C30828c(boolean z, View view, View view2, LiveCircleView liveCircleView) {
        int i;
        this.f80761f = view;
        this.f80767l = view2;
        this.f80762g = liveCircleView;
        this.f80759d = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        liveCircleView.setVisibility(i);
        view.addOnAttachStateChangeListener(this.f80771p);
    }

    public C30828c(boolean z, View view, View view2, LiveCircleView liveCircleView, boolean z2) {
        this.f80761f = view;
        this.f80767l = view2;
        this.f80762g = liveCircleView;
        this.f80759d = z;
        view.addOnAttachStateChangeListener(this.f80771p);
    }

    /* renamed from: a */
    public final void mo63564a(User user, Class cls, C1710e<C36083b> eVar, Aweme aweme, boolean z) {
        this.f80766k = aweme;
        this.f80770o = z;
        this.f80760e = user;
        this.f80765j = eVar;
        this.f80769n = cls;
        this.f80759d = m72245a(user);
        this.f80761f.removeOnAttachStateChangeListener(this.f80771p);
        this.f80761f.addOnAttachStateChangeListener(this.f80771p);
        if (this.f80759d) {
            mo63560a();
        } else {
            mo63565b();
        }
    }
}
