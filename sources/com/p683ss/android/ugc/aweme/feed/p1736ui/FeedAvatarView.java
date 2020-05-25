package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30253m;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.feed.utils.C31217y;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedAvatarView */
public class FeedAvatarView extends C30241a {

    /* renamed from: r */
    private static final String f80385r;
    ViewGroup mFollowContainerView;
    AnimationImageView mFollowView;

    /* renamed from: p */
    public C31107p f80386p;

    /* renamed from: q */
    public boolean f80387q = false;

    /* renamed from: c */
    public final void mo60596c() {
        super.mo60596c();
        if (this.f80386p != null) {
            this.f80386p.mo63887a();
        }
    }

    /* renamed from: e */
    public final void mo60599e() {
        C47718bf.m103291d(this);
        if (this.f80386p != null) {
            C47718bf.m103291d(this.f80386p);
        }
    }

    static {
        String str;
        if (C23794bh.m58388b().mo75673d()) {
            str = "home_follow_lottie.json";
        } else {
            str = "anim_follow_people.json";
        }
        f80385r = str;
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    /* renamed from: a */
    private static boolean m71999a(Aweme aweme) {
        return C30253m.m71086b(aweme);
    }

    public FeedAvatarView(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("update_ad_user_follow_ui", (C0199s<C23274a>) this.f79009b).mo48226a("bind_follow_view", (C0199s<C23274a>) this.f79009b);
        }
    }

    @C53771m
    public void onFollowEvent(FollowStatus followStatus) {
        C31114r rVar = new C31114r(this, followStatus, this.f79011d);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            rVar.run();
        } else if (this.mFollowView != null) {
            this.mFollowView.post(rVar);
        } else {
            C32458a.m75144a("onFollowEvent mFollowView is null!");
        }
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        User user = null;
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!TextUtils.equals(aVar.f62242a, "video_params")) {
            return null;
        }
        Aweme aweme = this.f79011d;
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("ui_state", hashMap);
        hashMap.put("aweme_state", aweme);
        C31107p pVar = this.f80386p;
        VideoItemParams videoItemParams = (VideoItemParams) aVar.mo48246a();
        C52711k.m112240b(hashMap, "state");
        if (videoItemParams != null) {
            pVar.f81404k = videoItemParams.mAdViewController;
            pVar.f81394a = videoItemParams.mAweme;
            pVar.f81398e = videoItemParams.mPageType;
            pVar.f81395b = videoItemParams.mEventType;
            pVar.f81396c = videoItemParams.mRequestId;
            pVar.f81397d = videoItemParams.isMyProfile;
        }
        Aweme aweme2 = pVar.f81394a;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        }
        pVar.f81401h = user;
        pVar.mo63891a(hashMap, pVar.f81401h);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6_);
        ButterKnife.bind((Object) this, this.f79019l);
        this.f80386p = new C31107p(this.f79019l);
        C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
            public final void run() {
                if (FeedAvatarView.this.f80386p != null) {
                    C31107p pVar = FeedAvatarView.this.f80386p;
                    DataCenter dataCenter = FeedAvatarView.this.f79016i;
                    GenericWidget genericWidget = FeedAvatarView.this.f79009b;
                    C52711k.m112240b(genericWidget, "widget");
                    pVar.f81399f = dataCenter;
                    if (dataCenter != null) {
                        C0199s sVar = genericWidget;
                        DataCenter a = dataCenter.mo48226a("startPlayAnimation", sVar);
                        if (a != null) {
                            DataCenter a2 = a.mo48226a("stopPlayAnimation", sVar);
                            if (a2 != null) {
                                DataCenter a3 = a2.mo48226a("on_page_selected", sVar);
                                if (a3 != null) {
                                    a3.mo48226a("image_pause", sVar);
                                }
                            }
                        }
                    }
                }
            }
        }));
        C47718bf.m103290c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r3.equals("stopPlayAnimation") != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r3.equals("image_pause") != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        if (r0.equals("bind_follow_view") != false) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60600e(final com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.aweme.feed.ui.p r0 = r7.f80386p
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x00aa
            java.lang.String r3 = r8.f62242a
            int r4 = r3.hashCode()
            r5 = -1780252142(0xffffffff95e38212, float:-9.1889785E-26)
            if (r4 == r5) goto L_0x009f
            r5 = -1661876786(0xffffffff9cf1c5ce, float:-1.5999174E-21)
            if (r4 == r5) goto L_0x0096
            r5 = 307897710(0x125a256e, float:6.8834807E-28)
            if (r4 == r5) goto L_0x004b
            r5 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r4 == r5) goto L_0x0025
            goto L_0x00aa
        L_0x0025:
            java.lang.String r4 = "on_page_selected"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00aa
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f81394a
            java.lang.String r5 = "aweme_state"
            r3.put(r5, r4)
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r4 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r5 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.p$b r6 = new com.ss.android.ugc.aweme.feed.ui.p$b
            r6.<init>(r0, r3)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.<init>(r2, r6)
            r4.mo60617a(r5)
            goto L_0x00aa
        L_0x004b:
            java.lang.String r4 = "startPlayAnimation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f81394a
            if (r3 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f81394a
            if (r3 != 0) goto L_0x005e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005e:
            int r3 = r3.getAwemeType()
            r4 = 101(0x65, float:1.42E-43)
            if (r3 != r4) goto L_0x0075
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f81394a
            if (r3 != 0) goto L_0x006d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006d:
            com.ss.android.ugc.aweme.feed.model.StreamUrlModel r3 = r3.getStreamUrlModel()
            if (r3 == 0) goto L_0x0075
            r3 = 1
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            if (r3 != 0) goto L_0x00aa
            boolean r3 = r0.f81406m
            if (r3 != 0) goto L_0x00aa
            r0.f81406m = r1
            com.ss.android.ugc.aweme.feed.ui.c r3 = r0.f81405l
            if (r3 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.feed.ui.c r0 = r0.f81405l
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r4 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.p$c r5 = new com.ss.android.ugc.aweme.feed.ui.p$c
            r5.<init>(r0)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r4.<init>(r2, r5)
            r3.mo60617a(r4)
            goto L_0x00aa
        L_0x0096:
            java.lang.String r4 = "stopPlayAnimation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x009f:
            java.lang.String r4 = "image_pause"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00aa
        L_0x00a7:
            r0.mo63887a()
        L_0x00aa:
            java.lang.String r0 = r8.f62242a
            r3 = -1
            int r4 = r0.hashCode()
            r5 = -1860252652(0xffffffff911ecc14, float:-1.2526889E-28)
            if (r4 == r5) goto L_0x00d4
            r5 = -1486328463(0xffffffffa7686d71, float:-3.2255796E-15)
            if (r4 == r5) goto L_0x00cb
            r1 = 1759823748(0x68e4c784, float:8.64304E24)
            if (r4 == r1) goto L_0x00c1
            goto L_0x00de
        L_0x00c1:
            java.lang.String r1 = "awesome_update_data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00de
            r1 = 2
            goto L_0x00df
        L_0x00cb:
            java.lang.String r4 = "bind_follow_view"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00d4:
            java.lang.String r1 = "update_ad_user_follow_ui"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00de
            r1 = 0
            goto L_0x00df
        L_0x00de:
            r1 = -1
        L_0x00df:
            switch(r1) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00f2;
                case 2: goto L_0x00e3;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x0158
        L_0x00e3:
            com.ss.android.ugc.aweme.arch.widgets.base.a r0 = new com.ss.android.ugc.aweme.arch.widgets.base.a
            java.lang.String r1 = "video_params"
            java.lang.Object r8 = r8.mo48246a()
            r0.<init>(r1, r8)
            r7.onChanged(r0)
            goto L_0x0158
        L_0x00f2:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            java.lang.String r3 = "aweme_state"
            r0.put(r3, r1)
            java.lang.String r1 = r7.f79012e
            java.lang.String r3 = "event_type_state"
            r0.put(r3, r1)
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r1 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r3 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.FeedAvatarView$5 r4 = new com.ss.android.ugc.aweme.feed.ui.FeedAvatarView$5
            r4.<init>(r8, r0)
            r3.<init>(r2, r4)
            r1.mo60617a(r3)
            return
        L_0x0115:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            boolean r8 = m71999a(r8)
            if (r8 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getAuthor()
            if (r8 == 0) goto L_0x0147
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            java.lang.String r3 = "aweme_state"
            r0.put(r3, r1)
            java.lang.String r1 = r7.f79012e
            java.lang.String r3 = "event_type_state"
            r0.put(r3, r1)
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r1 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r3 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.FeedAvatarView$3 r4 = new com.ss.android.ugc.aweme.feed.ui.FeedAvatarView$3
            r4.<init>(r8, r0)
            r3.<init>(r2, r4)
            r1.mo60617a(r3)
        L_0x0147:
            return
        L_0x0148:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r8 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.FeedAvatarView$4 r1 = new com.ss.android.ugc.aweme.feed.ui.FeedAvatarView$4
            r1.<init>()
            r0.<init>(r2, r1)
            r8.mo60617a(r0)
            return
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.FeedAvatarView.mo60600e(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ai3 && ((view == null || view.getVisibility() != 4) && !C26503d.m64057a(this.f79011d) && !mo60602f() && this.f79011d != null && !this.f79011d.isDelete())) {
            User author = this.f79011d.getAuthor();
            if (author != null) {
                if (author.getFollowStatus() != 0) {
                    if (C23794bh.m58388b().mo75673d()) {
                        C31217y.m72906a(this.f79011d, "head_icon");
                        Dialog c = new C10643a(view.getContext()).mo18885a((int) R.string.wq).mo18886a((int) R.string.f9m, (OnClickListener) new C31115s(this, view)).mo18900b((int) R.string.pc, C31139t.f81514a).mo18897a().mo18883c();
                        if (c.findViewById(R.id.dez) instanceof TextView) {
                            ((TextView) c.findViewById(R.id.dez)).setTextColor(view.getResources().getColor(R.color.j7));
                        }
                        if (c.findViewById(R.id.d8j) != null) {
                            c.findViewById(R.id.d8j).setVisibility(8);
                        }
                    }
                } else if (!TextUtils.equals(author.getUid(), C20854a.m53167g().getCurUserId())) {
                    if (this.f80386p != null && this.f80386p.f81404k != null && this.f80386p.f81404k.mo53244a() && !C26503d.m64065h(this.f79011d)) {
                        C25945k.m62911b().mo53118a(view.getContext(), this.f79011d);
                    }
                    if (C26503d.m64067j(this.f79011d) || C26503d.m64065h(this.f79011d)) {
                        C25945k.m62911b().mo53121a(this.f79017j, this.f79011d, "plus_sign");
                    }
                    if (!C23718g.m58207b().mo49153d()) {
                        C10691a.m21542b(this.f79017j, (int) R.string.cg1).mo19066a();
                        return;
                    }
                    if (this.f79016i != null) {
                        C30332aw awVar = new C30332aw(12, this.f79011d);
                        awVar.f79231d = C22858c.f61207c;
                        this.f79016i.mo48228a("feed_internal_event", (Object) awVar);
                    }
                    if (C20854a.m53167g().isLogin()) {
                        C28220g.f74083b.mo56652a(author, 5);
                        this.mFollowView.setAnimation(f80385r);
                        this.mFollowView.mo6654b();
                        this.mFollowView.mo6652a((AnimatorListener) new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                FeedAvatarView.this.f80387q = false;
                            }
                        });
                        this.f80387q = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m71998a(int i, Aweme aweme) {
        int i2;
        float f;
        this.mFollowView.setAnimation(f80385r);
        AnimationImageView animationImageView = this.mFollowView;
        if (C26503d.m64062e(aweme) || aweme.isDelete()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        animationImageView.setVisibility(i2);
        AnimationImageView animationImageView2 = this.mFollowView;
        if (i == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animationImageView2.setProgress(f);
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        int i2;
        AnimationImageView animationImageView;
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
        }
        if (aVar != null) {
            HashMap hashMap = (HashMap) aVar.mo48246a();
            if (hashMap.get("aweme_state") != null) {
                Aweme aweme = (Aweme) hashMap.get("aweme_state");
                C31208r.m72879a(aweme, this.f79018k, true, true);
                ViewGroup viewGroup = this.mFollowContainerView;
                if (C47915gg.m103651b()) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                viewGroup.setVisibility(i2);
                int i3 = 8;
                if (C26469cc.m63997a(aweme, 3)) {
                    animationImageView = this.mFollowView;
                } else {
                    animationImageView = this.mFollowView;
                    if (!C26503d.m64062e(aweme) && !aweme.isDelete()) {
                        i3 = 0;
                    }
                }
                animationImageView.setVisibility(i3);
                this.f80386p.mo63890a(aweme.getAuthor(), hashMap);
            }
        }
    }

    /* renamed from: a */
    public final void mo63302a(int i, Map<String, Object> map) {
        Aweme aweme;
        String str;
        boolean z;
        if (map == null) {
            aweme = this.f79011d;
            str = this.f79012e;
        } else {
            Aweme aweme2 = (Aweme) map.get("aweme_state");
            str = (String) map.get("event_type_state");
            aweme = aweme2;
        }
        if (aweme == null) {
            StringBuilder sb = new StringBuilder("aweme is null. FollowStatus is :");
            sb.append(i);
            C32458a.m75151c(4, "FeedAvatarView", sb.toString());
        } else if (aweme.getAuthor() == null) {
            StringBuilder sb2 = new StringBuilder("author is null. AwemeId is :");
            sb2.append(aweme.getAid());
            sb2.append(", FollowStatus is :");
            sb2.append(i);
            C32458a.m75151c(4, "FeedAvatarView", sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("AuthorUid is: ");
            sb3.append(aweme.getAuthorUid());
            sb3.append(", AwemeId is :");
            sb3.append(aweme.getAid());
            sb3.append(", FollowStatus is :");
            sb3.append(i);
            C32458a.m75151c(4, "FeedAvatarView", sb3.toString());
            if (aweme.isDelete()) {
                this.mFollowView.setVisibility(4);
                this.mFollowContainerView.setVisibility(4);
                C32458a.m75151c(4, "FeedAvatarView", "aweme is delete!updateFollowView!");
                return;
            }
            this.mFollowView.clearAnimation();
            User author = aweme.getAuthor();
            boolean z2 = true;
            int i2 = 0;
            if (C9431p.m18665a(author.getUid(), C20854a.m53167g().getCurUserId()) || C9431p.m18665a(str, "homepage_follow") || !aweme.isCanPlay()) {
                if (!C9431p.m18665a(str, "homepage_follow") || C9431p.m18665a(author.getUid(), C20854a.m53167g().getCurUserId()) || !aweme.isCanPlay() || (!C23794bh.m58388b().mo75673d() && i != 0)) {
                    this.mFollowView.setVisibility(4);
                } else {
                    m71998a(i, aweme);
                }
                if (!C26235d.m63570a(aweme) ? author == null || !author.isLive() || !C46635b.m101190a() || author.isBlock() || C47915gg.m103651b() : C31208r.m72886a(aweme)) {
                    z2 = false;
                }
                if (z2) {
                    if (!(this.f80386p == null || this.f80386p.f81403j == null)) {
                        ((LayoutParams) this.f80386p.f81403j.getLayoutParams()).bottomMargin = (int) C9432q.m18687b(this.f79017j, 12.5f);
                    }
                } else if (!(this.f80386p == null || this.f80386p.f81402i == null)) {
                    ((LayoutParams) this.f80386p.f81402i.getLayoutParams()).bottomMargin = (int) C9432q.m18687b(this.f79017j, 10.0f);
                }
                return;
            }
            if (i == 0) {
                try {
                    if (this.f79011d == null || !this.f79011d.isImage()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || m71999a(aweme)) {
                        this.mFollowView.setImageDrawable(C0726c.m2091a(this.f79017j, (int) R.drawable.cs9));
                        AnimationImageView animationImageView = this.mFollowView;
                        if (C26503d.m64062e(aweme) || aweme.isDelete()) {
                            i2 = 8;
                        }
                        animationImageView.setVisibility(i2);
                    }
                } catch (Exception unused) {
                }
            }
            if (!this.f80387q) {
                if (aweme == null || !aweme.isImage()) {
                    z2 = false;
                }
                if ((z2 || m71999a(aweme)) && C23794bh.m58388b().mo75673d()) {
                    m71998a(i, aweme);
                } else {
                    this.mFollowView.setVisibility(4);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63303a(FollowStatus followStatus, Aweme aweme) {
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(C23198ae.m56846a(aweme), followStatus.userId)) {
            if (aweme.getAuthor() != null) {
                aweme.getAuthor().setFollowStatus(followStatus.followStatus);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("aweme_state", this.f79011d);
            hashMap.put("event_type_state", this.f79012e);
            mo63302a(followStatus.followStatus, (Map<String, Object>) hashMap);
        }
    }
}
