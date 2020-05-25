package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p030v4.view.p042b.C1024c;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.C3031a.C3032a;
import com.bytedance.android.live.broadcast.api.C3031a.C3033b;
import com.bytedance.android.live.broadcast.api.model.C3057c;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5176av;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomPkWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.p310f.C5234s;
import com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5974c;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.C6300a;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.commerce.coupon.LiveCouponWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.cov19.DonationLuckyWidget;
import com.bytedance.android.livesdk.honor.HonorUpgradeNotifyWidget;
import com.bytedance.android.livesdk.message.model.C7818aw;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.Widget;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.eq */
public final class C6156eq extends C5957b implements C3032a, C3033b, C5974c {

    /* renamed from: S */
    public View f16512S;

    /* renamed from: T */
    LinkControlWidget f16513T;

    /* renamed from: U */
    public C5281ao f16514U;

    /* renamed from: V */
    public C3048a f16515V;

    /* renamed from: W */
    public boolean f16516W;

    /* renamed from: X */
    private View f16517X;

    /* renamed from: Y */
    private View f16518Y;

    /* renamed from: Z */
    private View f16519Z;

    /* renamed from: aa */
    private TextView f16520aa;

    /* renamed from: ab */
    private AnimationSet f16521ab;

    /* renamed from: ac */
    private AnimationSet f16522ac;

    /* renamed from: ad */
    private int f16523ad;

    /* renamed from: ae */
    private FullVideoButtonWidget f16524ae;

    /* renamed from: af */
    private FrameLayout f16525af;

    /* renamed from: ag */
    private View f16526ag;

    /* renamed from: h */
    public final View mo11918h() {
        return this.f16519Z;
    }

    /* renamed from: l */
    public final void mo11920l() {
        if (this.f16513T != null) {
            this.f15813v.add(0, this.f16513T);
        }
        super.mo11920l();
    }

    public final void onDestroy() {
        if (this.f16512S != null) {
            this.f16512S.clearAnimation();
        }
        super.onDestroy();
    }

    /* renamed from: g */
    public final boolean mo11890g() {
        if (getContext() == null || getContext().getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void mo11895x() {
        if (this.f16526ag != null) {
            this.f16526ag.findViewById(R.id.ls).setVisibility(8);
        }
    }

    /* renamed from: y */
    public final void mo12179y() {
        if (this.f16526ag != null) {
            this.f16526ag.findViewById(R.id.ls).setVisibility(0);
        }
    }

    /* renamed from: z */
    private void m13322z() {
        if (this.f16519Z != null && this.f16519Z.getVisibility() == 0) {
            ((MarginLayoutParams) this.f16519Z.getLayoutParams()).topMargin = this.f15798g - ((int) C9432q.m18687b(getContext(), 48.0f));
        }
    }

    /* renamed from: f */
    public final void mo9591f() {
        boolean z;
        if (mo11941p()) {
            if (!mo11943r().isUsingCamera || TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15409a(C4528e.HAS_SHOW_FILTER_GUIDE)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || getView() == null) {
                this.f16512S.setVisibility(8);
                return;
            }
            View findViewById = getView().findViewById(R.id.dr6);
            View findViewById2 = getView().findViewById(R.id.dr7);
            TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15408a((C8738a) C4528e.HAS_SHOW_FILTER_GUIDE, true);
            this.f16512S.setVisibility(0);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            this.f16520aa.setText(getString(R.string.f1h));
            this.f16512S.setClickable(true);
            this.f16512S.setOnClickListener(new C6159er(this, findViewById, findViewById2));
        }
    }

    /* renamed from: a */
    public final void mo9582a(C3048a aVar) {
        this.f16515V = aVar;
    }

    /* renamed from: a */
    public final void mo9583a(C5281ao aoVar) {
        this.f16514U = aoVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13322z();
    }

    /* renamed from: a */
    public final void mo8245a(boolean z) {
        int i;
        View view = this.f16518Y;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16523ad = C3922z.m9910c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11911b(float f) {
        if (f > 0.0f) {
            if (mo11943r().isUsingCamera) {
                C4495a.m10823a().mo10301a((Object) new C3057c(1));
            }
        } else if (mo11943r().isUsingCamera) {
            C4495a.m10823a().mo10301a((Object) new C3057c(2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11904a(View view) {
        super.mo11904a(view);
        this.f16526ag = view;
        if (this.f16516W) {
            mo11895x();
        } else {
            mo12179y();
        }
        view.findViewById(R.id.blh).setVisibility(0);
        this.f16517X = view.findViewById(R.id.d9);
        this.f16512S = view.findViewById(R.id.afk);
        this.f16518Y = view.findViewById(R.id.bfk);
        this.f16520aa = (TextView) view.findViewById(R.id.afl);
        this.f15806o = view.findViewById(R.id.blh);
        this.f16519Z = view.findViewById(R.id.ak4);
        this.f16525af = (FrameLayout) view.findViewById(R.id.xv);
    }

    /* renamed from: e */
    private AnimationSet m13321e(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = (this.f16523ad - this.f16520aa.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C1024c());
        alphaAnimation.setDuration(300);
        if (z) {
            f = (float) (-width);
        } else {
            f = (float) width;
        }
        float f6 = 50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C1024c());
        translateAnimation.setDuration(300);
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        if (z) {
            f4 = 50.0f;
        } else {
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new C1023b());
        alphaAnimation2.setDuration(300);
        if (!z) {
            f6 = -50.0f;
        }
        if (z) {
            f5 = (float) width;
        } else {
            f5 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new C1023b());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                C6156eq.this.f16512S.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                C6156eq.this.f16512S.setVisibility(0);
            }
        });
        return animationSet;
    }

    /* renamed from: a */
    public final void mo11962a(long j, long j2) {
        if (mo11923o() == null || mo11923o().getStreamType() != C8710m.AUDIO) {
            mo9581a((float) j);
        } else {
            mo9581a((float) j2);
        }
    }

    /* renamed from: a */
    public final void mo8246a(String str, boolean z) {
        if (mo11941p() && !TextUtils.isEmpty(str)) {
            this.f16520aa.setText(str);
            if (z) {
                if (this.f16521ab == null) {
                    this.f16521ab = m13321e(true);
                } else {
                    this.f16512S.clearAnimation();
                }
                this.f16512S.startAnimation(this.f16521ab);
                return;
            }
            if (this.f16522ac == null) {
                this.f16522ac = m13321e(false);
            } else {
                this.f16512S.clearAnimation();
            }
            this.f16512S.startAnimation(this.f16522ac);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11888a(final View view, Bundle bundle) {
        boolean z;
        boolean z2;
        if (mo11943r() == C8710m.VIDEO || mo11943r() == C8710m.AUDIO) {
            this.f16513T = new LinkControlWidget(new C6300a() {
                /* renamed from: a */
                public final void mo12181a(Widget widget) {
                    C6156eq.this.f15690A.unload(widget);
                }

                /* renamed from: a */
                public final Widget mo12180a(int i) {
                    switch (i) {
                        case 0:
                            LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget = new LinkInRoomVideoAnchorWidget(C6156eq.this.f16514U);
                            if (C6156eq.this.f15794c && C8607a.f23572a) {
                                linkInRoomVideoAnchorWidget.f13995i = C6156eq.this;
                            }
                            C6156eq.this.f15690A.load(R.id.brg, linkInRoomVideoAnchorWidget, false);
                            return linkInRoomVideoAnchorWidget;
                        case 1:
                            LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = new LinkInRoomVideoGuestWidget((FrameLayout) view.findViewById(R.id.aua));
                            C6156eq.this.f15690A.load(R.id.brg, linkInRoomVideoGuestWidget, false);
                            return linkInRoomVideoGuestWidget;
                        case 2:
                            LinkCrossRoomWidget linkCrossRoomWidget = new LinkCrossRoomWidget(C6156eq.this.f16514U, (FrameLayout) view.findViewById(R.id.aua));
                            if (C6156eq.this.f15794c && C8607a.f23572a) {
                                linkCrossRoomWidget.f17134g = C6156eq.this;
                            }
                            C6156eq.this.f15690A.load(R.id.by2, linkCrossRoomWidget, false);
                            return linkCrossRoomWidget;
                        case 3:
                            LinkInRoomAudioWidget linkInRoomAudioWidget = new LinkInRoomAudioWidget(C6156eq.this.f16515V, C6156eq.this.f15703O);
                            if (C6156eq.this.f15794c && C8607a.f23572a) {
                                linkInRoomAudioWidget.f17165k = C6156eq.this;
                            }
                            C6156eq.this.f15690A.load(R.id.brg, linkInRoomAudioWidget, false);
                            return linkInRoomAudioWidget;
                        case 4:
                            LinkInRoomPkWidget linkInRoomPkWidget = new LinkInRoomPkWidget();
                            C6156eq.this.f15690A.load(R.id.ed1, linkInRoomPkWidget, false);
                            return linkInRoomPkWidget;
                        default:
                            return null;
                    }
                }
            });
        }
        boolean z3 = false;
        if (this.f15715a.getRoomAuthStatus().isEnableLuckMoney()) {
            this.f15690A.load(R.id.e5o, new DonationLuckyWidget(this.f15715a), false);
        }
        this.f15690A.load(R.id.aue, this.f16513T);
        Bundle arguments = getArguments();
        if (arguments != null && !arguments.getBoolean("live.intent.extra.EXTRA_NO_FULL_VIDEO_BTN", false)) {
            if (!mo11942q() && mo11923o() != null && !mo11923o().isStar() && (mo11923o().isThirdParty || mo11923o().isScreenshot)) {
                this.f16524ae = new FullVideoButtonWidget();
                this.f16519Z.setVisibility(0);
            }
            this.f15690A.load(R.id.ak4, this.f16524ae);
        }
        this.f15690A.load((int) R.id.aph, HonorUpgradeNotifyWidget.class);
        Room room = this.f15715a;
        if (room == null || (!room.hasCommerceGoods() && (room.getOwner() == null || !room.getOwner().isWithCommercePermission()))) {
            z = false;
        } else {
            z = true;
        }
        if (z && !mo11942q()) {
            C9432q.m18691b(view.findViewById(R.id.bci), 0);
            this.f15690A.load((int) R.id.bci, LiveCouponWidget.class);
        }
        if (this.f15715a != null) {
            this.f15715a.isOfficial();
        }
        if (!C5234s.m11850a(this.f15815x) || !((Boolean) LiveSettingKeys.LIVE_MT_FEED_DRAWER_SHOW_MORE_LIVE.mo9431a()).booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (C5234s.m11852b(this.f15815x) && ((Boolean) LiveSettingKeys.LIVE_MT_FORYOU_ENTRANCE_SHOW_MORE_LIVE.mo9431a()).booleanValue()) {
            z3 = true;
        }
        if (this.f15715a != null && !this.f15715a.isOfficial()) {
            if ((z2 || z3) && view != null) {
                this.f15690A.load((int) R.id.dz6, LiveDrawerEntranceWidget.class);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11909a(boolean z, int i) {
        super.mo11909a(z, i);
        if (this.f15804m != null && z) {
            mo11921m();
        }
        if (this.f15806o != null && this.f15796e && this.f15798g > 0 && mo11941p()) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f15806o.getLayoutParams();
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = this.f15798g + ((int) C9432q.m18687b(getContext(), 40.0f));
            this.f15815x.lambda$put$1$DataCenter("cmd_update_sticker_position", new C5176av(C9432q.m18688b(getContext()) - marginLayoutParams.topMargin));
            if (mo11941p()) {
                C7818aw awVar = new C7818aw();
                awVar.f21524a = (C9432q.m18688b(getContext()) - marginLayoutParams.topMargin) + ((int) getContext().getResources().getDimension(R.dimen.pb));
                this.f15815x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f21524a));
                C7818aw awVar2 = new C7818aw();
                awVar2.f21524a = C9432q.m18688b(getContext()) - marginLayoutParams.topMargin;
                this.f15815x.lambda$put$1$DataCenter("cmd_enter_widget_layout_change", awVar2);
            }
            m13322z();
            StringBuilder sb = new StringBuilder("height: MATCH_PARENT, topMargin: ");
            sb.append(marginLayoutParams.topMargin);
            m12978a("update_video_direction", sb.toString());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.akr, viewGroup, false);
    }
}
