package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3899m.C3903b;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p231a.C3848a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.p455i.C8813c;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.drawee.p936c.C13791d;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class LiveGiftFirstChargeWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    public HSImageView f19718a;

    /* renamed from: b */
    public AnimatorSet f19719b;

    /* renamed from: c */
    public final C1689b f19720c = new C1689b();

    /* renamed from: d */
    private final GiftViewModel f19721d;

    public int getLayoutId() {
        return R.layout.bvi;
    }

    /* renamed from: a */
    public final void mo13497a() {
        this.f19718a.setVisibility(8);
    }

    public void onUnload() {
        if (!this.f19720c.isDisposed()) {
            this.f19720c.dispose();
        }
        this.f19721d.mo13529a((C0184k) this);
    }

    public LiveGiftFirstChargeWidget(GiftViewModel giftViewModel) {
        this.f19721d = giftViewModel;
    }

    public void onInit(Object[] objArr) {
        this.f19718a = (HSImageView) findViewById(R.id.e8u);
    }

    public void onLoad(Object[] objArr) {
        User user = (User) this.dataCenter.get("data_user_in_room");
        if (user != null && user.isNeverRecharge()) {
            String str = (String) C4525b.f12357aZ.mo10345a();
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date());
            if (!TextUtils.equals(str, format)) {
                final C8813c cVar = (C8813c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.mo9431a();
                if (cVar != null && !TextUtils.isEmpty(cVar.f24057d) && cVar.f24059f == 1) {
                    C3848a.m9760a(this.containerView.getContext()).mo9225a(cVar.f24057d).mo9222a(ScaleType.CENTER_INSIDE).mo9224a((C13791d) new C3903b(null, new C3910a() {
                        /* renamed from: a */
                        public final void mo9270a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo9272a(ImageModel imageModel, Exception exc) {
                            LiveGiftFirstChargeWidget.this.mo13497a();
                        }

                        /* renamed from: a */
                        public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                            LiveGiftFirstChargeWidget.this.f19719b = new AnimatorSet();
                            LiveGiftFirstChargeWidget.this.f19718a.clearAnimation();
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LiveGiftFirstChargeWidget.this.f19718a, "scaleX", new float[]{0.8f, 1.0f, 1.0f});
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LiveGiftFirstChargeWidget.this.f19718a, "scaleY", new float[]{0.8f, 1.0f, 1.0f});
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LiveGiftFirstChargeWidget.this.f19718a, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                            LiveGiftFirstChargeWidget.this.f19718a.setPivotX((float) (C3922z.m9910c() - C3922z.m9899a(72.0f)));
                            LiveGiftFirstChargeWidget.this.f19718a.setPivotY((float) (i2 / 2));
                            LiveGiftFirstChargeWidget.this.f19719b.setDuration(300);
                            LiveGiftFirstChargeWidget.this.f19719b.play(ofFloat).with(ofFloat2).with(ofFloat3);
                            LiveGiftFirstChargeWidget.this.f19719b.start();
                            LiveGiftFirstChargeWidget.this.f19719b.addListener(new AnimatorListener() {
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    LiveGiftFirstChargeWidget.this.mo13497a();
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    LiveGiftFirstChargeWidget.this.f19720c.mo6181a(C2201v.m6592a(cVar.f24058e, TimeUnit.MILLISECONDS).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6545f((C1710e<? super T>) new C1710e<Long>() {
                                        public final /* synthetic */ void accept(Object obj) throws Exception {
                                            Long l = (Long) obj;
                                            LiveGiftFirstChargeWidget.this.mo13497a();
                                        }
                                    }));
                                }
                            });
                        }
                    })).mo9227a((ImageView) this.f19718a);
                    C4525b.f12357aZ.mo10346a(format);
                }
            }
        }
        this.f19721d.mo13530a((C0184k) this, (C0199s<C7290b>) new C7265g<C7290b>(this));
    }
}
