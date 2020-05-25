package com.p683ss.android.ugc.aweme.sticker.panel.guide;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.effectplatform.C29240a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43862ga;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46050a;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.aweme.utils.C47743c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.a */
public final class C46170a implements C46185e {

    /* renamed from: a */
    public View f116511a;

    /* renamed from: b */
    private TextView f116512b;

    /* renamed from: c */
    private SimpleDraweeView f116513c;

    /* renamed from: d */
    private View f116514d;

    /* renamed from: e */
    private FrameLayout f116515e;

    /* renamed from: f */
    private Effect f116516f;

    /* renamed from: g */
    private Runnable f116517g = new Runnable() {
        public final void run() {
            Animation a = C46050a.m100043a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C46170a.this.mo88287a(true);
                }
            });
            C46170a.this.f116511a.startAnimation(a);
        }
    };

    public C46170a(Effect effect) {
        this.f116516f = effect;
    }

    /* renamed from: a */
    public final void mo88287a(boolean z) {
        if (this.f116516f != null && !TextUtils.isEmpty(this.f116516f.getHint())) {
            this.f116512b.removeCallbacks(this.f116517g);
            this.f116515e.removeView(this.f116514d);
        }
    }

    /* renamed from: a */
    public final void mo88286a(FrameLayout frameLayout) {
        boolean z;
        this.f116515e = frameLayout;
        if (this.f116516f != null && !TextUtils.isEmpty(this.f116516f.getHint())) {
            int i = 0;
            this.f116514d = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.a82, frameLayout, false);
            this.f116515e.addView(this.f116514d);
            this.f116511a = this.f116514d.findViewById(R.id.agn);
            this.f116512b = (TextView) this.f116514d.findViewById(R.id.ct6);
            String hint = this.f116516f.getHint();
            Activity a = C47743c.m103371a(frameLayout.getContext());
            if (a instanceof FragmentActivity) {
                EffectStickerViewModel effectStickerViewModel = (EffectStickerViewModel) C0214z.m440a((FragmentActivity) a).mo359a(EffectStickerViewModel.class);
                ShortVideoContext d = effectStickerViewModel.mo93416a().mo91264d();
                if (!d.mo86365f() && !d.mo86366g() && !d.mo86362d()) {
                    File e = d.f107118k.mo86458e();
                    boolean z2 = true;
                    if (e == null || e.getPath().startsWith(C43307ea.f109506s)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C50275d.m108533a(frameLayout.getContext(), frameLayout.getContext().getString(R.string.o2)).mo98174a();
                        return;
                    }
                    String a2 = C39629l.m88232a().mo58585p().mo80705a(d.f107112e);
                    C42482c f = effectStickerViewModel.mo93416a().mo91266f();
                    if (f != null && f.strongBeatUrl != null && !TextUtils.isEmpty(a2) && !new File(a2).exists()) {
                        C50275d.m108538b(frameLayout.getContext(), (int) R.string.o1).mo98174a();
                    } else if (e == null) {
                        this.f116512b.setText(hint);
                        this.f116513c = (SimpleDraweeView) this.f116514d.findViewById(R.id.ct7);
                        if (this.f116516f.getHintIcon() == null || C50201e.m108355a(this.f116516f.getHintIcon().getUrlList())) {
                            z2 = false;
                        }
                        SimpleDraweeView simpleDraweeView = this.f116513c;
                        if (!z2) {
                            i = 8;
                        }
                        C43862ga.m96321a((View) simpleDraweeView, i);
                        if (z2) {
                            C50181a.m108287a(this.f116513c, C29240a.m68865a(this.f116516f.getHintIcon()));
                        }
                        this.f116511a.startAnimation(C46050a.m100043a(0.0f, 1.0f, 300));
                        this.f116511a.postDelayed(this.f116517g, 5000);
                    }
                }
            }
        }
    }
}
