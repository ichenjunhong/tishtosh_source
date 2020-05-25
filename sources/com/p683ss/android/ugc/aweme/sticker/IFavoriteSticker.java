package com.p683ss.android.ugc.aweme.sticker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.favorites.p1702b.C29685a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.panel.p2304c.C46104a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtView;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.widget.C50286j;
import com.p683ss.android.ugc.tools.view.widget.CheckableImageView;
import com.p683ss.android.ugc.tools.view.widget.CheckableImageView.C50248a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53755c;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.sticker.IFavoriteSticker */
public interface IFavoriteSticker {

    /* renamed from: com.ss.android.ugc.aweme.sticker.IFavoriteSticker$FavoriteSticker */
    public static class FavoriteSticker implements C0183j, OnClickListener, IFavoriteSticker {

        /* renamed from: a */
        public C46354l f115759a;

        /* renamed from: b */
        public AVDmtView f115760b;

        /* renamed from: c */
        public float f115761c;

        /* renamed from: d */
        public float f115762d;

        /* renamed from: e */
        public boolean f115763e = false;

        /* renamed from: f */
        private AppCompatActivity f115764f;

        /* renamed from: g */
        private FrameLayout f115765g;

        /* renamed from: h */
        private CheckableImageView f115766h;

        /* renamed from: i */
        private Drawable f115767i;

        /* renamed from: j */
        private Drawable f115768j;

        /* renamed from: k */
        private TextView f115769k;

        /* renamed from: l */
        private C1689b f115770l;

        /* renamed from: m */
        private C45805a f115771m;

        /* renamed from: a */
        public final C1689b mo92230a() {
            if (this.f115770l == null) {
                this.f115770l = new C1689b();
            }
            return this.f115770l;
        }

        @C0200t(mo345a = C0177a.ON_DESTROY)
        public void onDestroy() {
            if (this.f115770l != null) {
                this.f115770l.mo6180a();
            }
        }

        /* renamed from: a */
        public final void mo92228a(Effect effect) {
            mo92231b(mo92232b(effect));
        }

        /* renamed from: b */
        public final boolean mo92232b(Effect effect) {
            if (effect == null) {
                return false;
            }
            return C45859b.m99700a(this.f115759a, effect.getEffectId());
        }

        /* renamed from: a */
        public final void mo92229a(boolean z) {
            C46104a.m100190a().f116351a = z;
            if (z) {
                if (this.f115764f != null && !this.f115764f.isFinishing() && !this.f115763e) {
                    C46104a.m100190a().mo92798a(this.f115760b, this.f115764f);
                }
                if (this.f115763e) {
                    this.f115769k.setVisibility(0);
                    LayoutParams layoutParams = this.f115760b.getLayoutParams();
                    if (mo92232b(this.f115759a.mo92985c())) {
                        layoutParams.width = (int) this.f115764f.getResources().getDimension(R.dimen.ya);
                    } else {
                        layoutParams.width = (int) this.f115764f.getResources().getDimension(R.dimen.y8);
                    }
                    this.f115760b.setLayoutParams(layoutParams);
                }
                this.f115765g.setVisibility(0);
                return;
            }
            this.f115765g.setVisibility(8);
        }

        /* renamed from: b */
        public final void mo92231b(boolean z) {
            if (z) {
                this.f115766h.setImageDrawable(this.f115767i);
                this.f115769k.setTextColor(this.f115764f.getResources().getColor(R.color.axf));
                this.f115769k.setText(this.f115764f.getString(R.string.hku));
                return;
            }
            this.f115766h.setImageDrawable(this.f115768j);
            this.f115769k.setTextColor(this.f115764f.getResources().getColor(R.color.axe));
            this.f115769k.setText(this.f115764f.getString(R.string.drc));
        }

        public void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C39629l.m88232a().mo58593x().mo74282b()) {
                C39629l.m88232a().mo58593x().mo74276a((Activity) this.f115764f, "favorite_sticker", "click_favorite_prop", (Bundle) null, (C39528a) new C39528a() {
                    /* renamed from: b */
                    public final void mo64372b() {
                    }

                    /* renamed from: a */
                    public final void mo64371a() {
                        FavoriteSticker.this.f115759a.mo92990h();
                    }
                });
            } else if (this.f115763e) {
                CheckableImageView checkableImageView = this.f115766h;
                if (checkableImageView.f125964a != null) {
                    checkableImageView.f125964a.mo92236a(0);
                    checkableImageView.postDelayed(new C50286j(checkableImageView, 200), 100);
                }
            } else {
                CheckableImageView checkableImageView2 = this.f115766h;
                checkableImageView2.clearAnimation();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(checkableImageView2, "scaleX", new float[]{1.0f, 1.08f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(checkableImageView2, "scaleY", new float[]{1.0f, 1.08f});
                ofFloat.setDuration(100);
                ofFloat2.setDuration(100);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(checkableImageView2, "scaleX", new float[]{1.08f, 0.0f});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(checkableImageView2, "scaleY", new float[]{1.08f, 0.0f});
                ofFloat3.setDuration(100);
                ofFloat4.setDuration(100);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(checkableImageView2, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(checkableImageView2, "alpha", new float[]{1.0f, 0.0f});
                ofFloat6.setDuration(100);
                ofFloat5.setDuration(100);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2);
                animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(checkableImageView2, "scaleX", new float[]{0.0f, 1.08f});
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(checkableImageView2, "scaleY", new float[]{0.0f, 1.08f});
                ofFloat7.setDuration(100);
                ofFloat8.setDuration(100);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(checkableImageView2, "scaleX", new float[]{1.08f, 1.0f});
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(checkableImageView2, "scaleY", new float[]{1.08f, 1.0f});
                ofFloat9.setDuration(100);
                ofFloat9.setDuration(100);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
                animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
                animatorSet.addListener(new AnimatorListenerAdapter(animatorSet2) {

                    /* renamed from: a */
                    final /* synthetic */ AnimatorSet f125965a;

                    public final void onAnimationStart(Animator animator) {
                        if (CheckableImageView.this.f125964a != null) {
                            CheckableImageView.this.f125964a.mo92236a(0);
                        }
                    }

                    public final void onAnimationEnd(Animator animator) {
                        this.f125965a.start();
                        if (CheckableImageView.this.f125964a != null) {
                            CheckableImageView.this.f125964a.mo92236a(1);
                        }
                    }

                    {
                        this.f125965a = r2;
                    }
                });
                animatorSet2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (CheckableImageView.this.f125964a != null) {
                            CheckableImageView.this.f125964a.mo92235a();
                        }
                    }
                });
                animatorSet.start();
            }
        }

        public FavoriteSticker(AppCompatActivity appCompatActivity, final C46354l lVar, final C45889c cVar, C45805a aVar, FrameLayout frameLayout, CheckableImageView checkableImageView) {
            this.f115759a = lVar;
            this.f115771m = aVar;
            this.f115764f = appCompatActivity;
            this.f115765g = frameLayout;
            this.f115766h = checkableImageView;
            this.f115765g.setOnClickListener(this);
            this.f115769k = (TextView) this.f115765g.findViewById(R.id.eyc);
            this.f115760b = (AVDmtView) this.f115765g.findViewById(R.id.b9x);
            this.f115761c = this.f115764f.getResources().getDimension(R.dimen.y8);
            this.f115762d = this.f115764f.getResources().getDimension(R.dimen.ya);
            final LayoutParams layoutParams = this.f115760b.getLayoutParams();
            this.f115767i = C0809a.m2337f(this.f115764f.getResources().getDrawable(R.drawable.ae9));
            this.f115768j = C0809a.m2337f(this.f115764f.getResources().getDrawable(R.drawable.d32));
            this.f115766h.setOnStateChangeListener(new C50248a() {

                /* renamed from: a */
                Effect f115772a;

                /* renamed from: f */
                private Effect f115777f;

                /* renamed from: a */
                public final void mo92235a() {
                    if (this.f115772a != null) {
                        Effect effect = this.f115772a;
                        if (effect != null) {
                            C46069d dVar = new C46069d();
                            dVar.f116246id = effect.getId();
                            C53755c.m114319a().mo112960d(new C29685a(dVar));
                        }
                        if (FavoriteSticker.this.mo92232b(this.f115772a)) {
                            FavoriteSticker.this.mo92230a().mo6181a(lVar.mo92973a().mo92533e().mo92498a(this.f115772a, true).mo6152a((C1710e<? super T>) new C45857d<Object>(this), C45869e.f115891a));
                            return;
                        }
                        cVar.mo92482a(this.f115772a, false, "click_main_panel");
                        if (this.f115777f != null) {
                            cVar.mo92482a(this.f115777f, true, "click_banner");
                        }
                        FavoriteSticker.this.mo92230a().mo6181a(lVar.mo92973a().mo92533e().mo92498a(this.f115772a, false).mo6152a((C1710e<? super T>) new C45880f<Object>(this), C45886g.f115903a));
                    }
                }

                /* renamed from: a */
                public final void mo92236a(int i) {
                    if (i == 0) {
                        this.f115772a = lVar.mo92985c();
                        Effect effect = (Effect) lVar.mo92989g().mo93014b().getValue();
                        if (effect != null && !TextUtils.isEmpty(effect.getParentId())) {
                            this.f115777f = effect;
                        }
                        if (FavoriteSticker.this.f115763e) {
                            if (FavoriteSticker.this.mo92232b(lVar.mo92985c())) {
                                if (((float) layoutParams.width) != FavoriteSticker.this.f115761c) {
                                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) FavoriteSticker.this.f115762d, (int) FavoriteSticker.this.f115761c});
                                    ofInt.setTarget(FavoriteSticker.this.f115760b);
                                    ofInt.setInterpolator(new LinearInterpolator());
                                    ofInt.setDuration(200).start();
                                    ofInt.addUpdateListener(new C45820b(this, layoutParams));
                                }
                            } else if (((float) layoutParams.width) != FavoriteSticker.this.f115762d) {
                                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{(int) FavoriteSticker.this.f115761c, (int) FavoriteSticker.this.f115762d});
                                ofInt2.setTarget(FavoriteSticker.this.f115760b);
                                ofInt2.setInterpolator(new LinearInterpolator());
                                ofInt2.setDuration(200).start();
                                ofInt2.addUpdateListener(new C45845c(this, layoutParams));
                            }
                        }
                        lVar.mo92973a().mo92533e().mo92502b(!FavoriteSticker.this.mo92232b(lVar.mo92985c()));
                    }
                    if (i == 1) {
                        FavoriteSticker.this.mo92231b(true ^ FavoriteSticker.this.mo92232b(lVar.mo92985c()));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    void mo92228a(Effect effect);

    /* renamed from: a */
    void mo92229a(boolean z);
}
