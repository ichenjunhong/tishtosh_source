package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView.C23615b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30325ap;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31125d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31136f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31138h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.p1738a.C31122a;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.main.C36651f;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.NewVideoPlayerProgressbar;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.em */
public final class C30953em extends C30241a implements C0199s<C23274a> {

    /* renamed from: A */
    private View f81056A;

    /* renamed from: B */
    private LayoutParams f81057B;

    /* renamed from: C */
    private long f81058C = 0;

    /* renamed from: p */
    public AudioControlView f81059p;

    /* renamed from: q */
    NewVideoPlayerProgressbar f81060q;

    /* renamed from: r */
    LineProgressBar f81061r;

    /* renamed from: s */
    boolean f81062s = true;

    /* renamed from: t */
    private View f81063t;

    /* renamed from: u */
    private Activity f81064u;

    /* renamed from: v */
    private final C23422a f81065v;

    /* renamed from: w */
    private AnimatorSet f81066w;

    /* renamed from: x */
    private AnimatorSet f81067x;

    /* renamed from: y */
    private AnimatorSet f81068y;

    /* renamed from: z */
    private boolean f81069z;

    /* renamed from: d */
    public final void mo60597d() {
        super.mo60597d();
        C47718bf.m103291d(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo63712l() {
        if (this.f81061r != null) {
            this.f81061r.mo64035b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo63714n() {
        if (this.f81064u instanceof C36651f) {
            ((C36651f) this.f81064u).registerActivityOnKeyDownListener(this.f81065v);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo63715o() {
        if (this.f81064u instanceof C36651f) {
            ((C36651f) this.f81064u).unRegisterActivityOnKeyDownListener(this.f81065v);
        }
    }

    /* renamed from: j */
    public final void mo63710j() {
        if (this.f81060q != null && this.f81059p != null) {
            if (!(this.f81067x == null && this.f81066w == null)) {
                this.f81068y = new AnimatorSet();
                this.f81068y.play(this.f81060q.getShowAnim()).after(this.f81059p.getHideVolumeAnim());
                this.f81068y.start();
            }
        }
    }

    /* renamed from: k */
    public final void mo63711k() {
        if (this.f81060q != null && this.f81059p != null) {
            if (this.f81068y != null) {
                this.f81068y.cancel();
            }
            this.f81060q.setAlpha(0.0f);
            this.f81059p.setAlpha(1.0f);
        }
    }

    /* renamed from: e */
    public final void mo60599e() {
        mo63711k();
        if (this.f81066w != null) {
            this.f81066w.removeAllListeners();
            this.f81066w.cancel();
        }
        if (this.f81067x != null) {
            this.f81067x.removeAllListeners();
            this.f81067x.cancel();
        }
        if (this.f81059p != null) {
            this.f81059p.mo48946e();
        }
        if (this.f81061r != null) {
            this.f81061r.mo64036c();
            this.f81061r.clearAnimation();
        }
        if (this.f81060q != null) {
            this.f81060q.clearAnimation();
        }
        mo63715o();
        this.f81064u = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo63713m() {
        this.f81058C = SystemClock.elapsedRealtime();
        if (this.f79011d != null) {
            if (this.f79011d.getVideoControl() == null || this.f79011d.getVideoControl().showProgressBar != 1) {
                C23729p.m58257a((View) this.f81060q, 8);
                return;
            }
            this.f81060q.setProgress(0);
            if (this.f79011d.getVideo() != null) {
                this.f81060q.setMax(this.f79011d.getVideo().getDuration());
            }
            C23729p.m58257a((View) this.f81060q, 0);
        }
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        return aVar;
    }

    @C53771m
    public final void onShareEndEvent(C30325ap apVar) {
        C23729p.m58257a(this.f81063t, 0);
    }

    @C53771m
    public final void onAwesomeSplashEvent(C26216b bVar) {
        boolean z;
        if (bVar.f69221a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f81069z = z;
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        if (aVar != null) {
            C30255o.f79039a.mo60617a(new C30256p(false, new C30958eo(this, aVar.f62242a, aVar)));
        }
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("load_progress_bar", (C0199s<C23274a>) this.f79009b).mo48226a("in_video_view_holder", (C0199s<C23274a>) this.f79009b).mo48226a("on_page_unselected", (C0199s<C23274a>) this.f79009b).mo48226a("on_page_selected", (C0199s<C23274a>) this.f79009b).mo48226a("stopPlayAnimation", (C0199s<C23274a>) this.f79009b);
        }
    }

    @C53771m
    public final void onStopTrackingTouchEvent(C31136f fVar) {
        if (this.f79011d != null && fVar.f81507b != null && fVar.f81507b.getAid().equals(this.f79011d.getAid())) {
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f81060q;
            double duration = (double) this.f79011d.getVideo().getDuration();
            double d = fVar.f81506a / 100.0d;
            Double.isNaN(duration);
            newVideoPlayerProgressbar.setProgress((int) (duration * d));
        }
    }

    @C53771m
    public final void onVideoCleanModeEvent(C31122a aVar) {
        if (this.f79011d != null && aVar.f81466b != null && aVar.f81466b.getAid().equals(this.f79011d.getAid())) {
            if (aVar.f81465a) {
                C23729p.m58257a((View) this.f81060q, 8);
            } else {
                C23729p.m58257a((View) this.f81060q, 0);
            }
        }
    }

    @C53771m
    public final void videoSeekBarHideEvent(C31138h hVar) {
        if (this.f79011d != null && hVar.f81513a != null && hVar.f81513a.getAid().equals(this.f79011d.getAid())) {
            if (this.f79011d.getVideoControl() == null || this.f79011d.getVideoControl().showProgressBar != 1) {
                C23729p.m58257a((View) this.f81060q, 8);
            } else {
                C23729p.m58257a((View) this.f81060q, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        if (view instanceof FrameLayout) {
            this.f81056A = view;
            this.f81063t = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b7h);
            this.f81059p = (AudioControlView) this.f81063t.findViewById(R.id.gy);
            this.f81060q = (NewVideoPlayerProgressbar) this.f81063t.findViewById(R.id.dpu);
            this.f81061r = (LineProgressBar) this.f81063t.findViewById(R.id.baz);
            LayoutParams layoutParams = new LayoutParams(-1, C23728o.m58241a(1.0d));
            layoutParams.gravity = 80;
            if (C22453b.m55505a().f60476n) {
                int a = C23728o.m58241a(8.0d);
                layoutParams.leftMargin = a;
                layoutParams.rightMargin = a;
            }
            this.f81057B = layoutParams;
        }
    }

    @C53771m
    public final void onPlayerControllerVideoPlayProgressEvent(C31125d dVar) {
        if (this.f79011d != null && dVar.f81476a != null && dVar.f81476a.getAid().equals(this.f79011d.getAid())) {
            if (this.f81060q.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.f81058C + 600) {
                this.f81060q.setMax(this.f79011d.getVideo().getDuration());
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f81060q;
                double duration = (double) this.f79011d.getVideo().getDuration();
                double d = (double) dVar.f81479d;
                Double.isNaN(d);
                double d2 = d / 100.0d;
                Double.isNaN(duration);
                newVideoPlayerProgressbar.setProgress((int) (duration * d2));
            }
        }
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
        if (this.f81059p != null) {
            this.f81059p.setOnAudioControlViewHideListener(new C23615b() {
                /* renamed from: a */
                public final void mo48961a() {
                    C30953em.this.mo63710j();
                }

                /* renamed from: b */
                public final void mo48962b() {
                    C30953em.this.mo63711k();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f81056A instanceof FrameLayout) {
                ((FrameLayout) this.f81056A).addView(this.f81063t, this.f81057B);
            }
        }
        if (aVar != null) {
        }
    }

    public C30953em(View view, Activity activity) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
        C47718bf.m103290c(this);
        this.f81064u = activity;
        this.f81065v = new C30957en(this);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ boolean mo63709a(int r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            r0 = 24
            r1 = 25
            r2 = 0
            if (r12 == r1) goto L_0x000a
            if (r12 == r0) goto L_0x000a
            return r2
        L_0x000a:
            com.ss.android.ugc.aweme.audio.a r3 = com.p683ss.android.ugc.aweme.audio.C23294a.m57302a()
            r4 = 1
            if (r12 != r0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.mo48313a(r0)
            com.ss.android.ugc.aweme.base.ui.AudioControlView r0 = r11.f81059p
            if (r0 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.base.ui.AudioControlView r0 = r11.f81059p
            boolean r0 = r0.mo48947f()
            if (r0 != 0) goto L_0x00ad
        L_0x0023:
            android.app.Activity r0 = r11.f81064u
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.main.C36663h
            if (r0 == 0) goto L_0x0067
            android.app.Activity r0 = r11.f81064u
            android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.m75876a(r0)
            java.lang.String r3 = "page_feed"
            boolean r0 = r0.mo69868b(r3)
            if (r0 == 0) goto L_0x0067
            android.app.Activity r0 = r11.f81064u
            com.ss.android.ugc.aweme.main.h r0 = (com.p683ss.android.ugc.aweme.main.C36663h) r0
            android.support.v4.app.Fragment r0 = r0.getCurFragment()
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.main.C36664i
            if (r0 == 0) goto L_0x0067
            android.app.Activity r0 = r11.f81064u
            com.ss.android.ugc.aweme.main.h r0 = (com.p683ss.android.ugc.aweme.main.C36663h) r0
            android.support.v4.app.Fragment r0 = r0.getCurFragment()
            com.ss.android.ugc.aweme.main.i r0 = (com.p683ss.android.ugc.aweme.main.C36664i) r0
            boolean r0 = r0.mo75504d()
            if (r0 != 0) goto L_0x0065
            android.app.Activity r0 = r11.f81064u
            com.ss.android.ugc.aweme.main.h r0 = (com.p683ss.android.ugc.aweme.main.C36663h) r0
            android.support.v4.app.Fragment r0 = r0.getCurFragment()
            com.ss.android.ugc.aweme.main.i r0 = (com.p683ss.android.ugc.aweme.main.C36664i) r0
            boolean r0 = r0.mo75505e()
            if (r0 == 0) goto L_0x0067
        L_0x0065:
            r0 = 1
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            android.app.Activity r3 = r11.f81064u
            boolean r3 = r3 instanceof com.p683ss.android.ugc.aweme.detail.p1628ui.C27488ae
            if (r3 == 0) goto L_0x0080
            android.app.Activity r3 = r11.f81064u
            android.support.v4.app.FragmentActivity r3 = (android.support.p030v4.app.FragmentActivity) r3
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r3 = com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.m75876a(r3)
            java.lang.String r5 = "page_feed"
            boolean r3 = r3.mo69868b(r5)
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            android.app.Activity r5 = r11.f81064u
            boolean r5 = r5 instanceof com.p683ss.android.ugc.aweme.main.C36663h
            if (r5 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.main.k r5 = com.p683ss.android.ugc.aweme.C23794bh.m58388b()
            boolean r5 = r5.mo75671b()
            if (r5 == 0) goto L_0x00a5
            android.app.Activity r5 = r11.f81064u
            android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
            com.ss.android.ugc.aweme.main.TabChangeManager r5 = com.p683ss.android.ugc.aweme.main.TabChangeManager.m82396a(r5)
            java.lang.String r5 = r5.f93538c
            java.lang.String r6 = "DISCOVER"
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x00a5
            r5 = 1
            goto L_0x00a6
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            if (r0 != 0) goto L_0x00af
            if (r3 != 0) goto L_0x00af
            if (r5 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r0 = 0
            goto L_0x00b0
        L_0x00af:
            r0 = 1
        L_0x00b0:
            if (r0 == 0) goto L_0x014b
            com.ss.android.ugc.aweme.feed.ui.seekbar.g r0 = new com.ss.android.ugc.aweme.feed.ui.seekbar.g
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r11.f79011d
            java.lang.String r7 = r11.f79012e
            int r8 = r11.f79015h
            r5 = r0
            r9 = r12
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81060q
            if (r13 == 0) goto L_0x00cd
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81060q
            r0 = 0
            r13.setAlpha(r0)
        L_0x00cd:
            if (r12 != r1) goto L_0x010d
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81059p
            if (r12 == 0) goto L_0x014a
            boolean r12 = r11.f81069z
            if (r12 == 0) goto L_0x00dd
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81059p
            r12.mo48942b()
            goto L_0x014a
        L_0x00dd:
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r12 = r11.f81060q
            if (r12 == 0) goto L_0x014a
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            r11.f81066w = r12
            android.animation.AnimatorSet r12 = r11.f81066w
            com.ss.android.ugc.aweme.base.ui.AudioControlView r13 = r11.f81059p
            android.animation.ObjectAnimator r13 = r13.getShowVolumeAnim()
            android.animation.AnimatorSet$Builder r12 = r12.play(r13)
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81060q
            android.animation.ObjectAnimator r13 = r13.getHideAnim()
            r12.after(r13)
            android.animation.AnimatorSet r12 = r11.f81066w
            com.ss.android.ugc.aweme.feed.ui.em$2 r13 = new com.ss.android.ugc.aweme.feed.ui.em$2
            r13.<init>()
            r12.addListener(r13)
            android.animation.AnimatorSet r12 = r11.f81066w
            r12.start()
            goto L_0x014a
        L_0x010d:
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81059p
            if (r12 == 0) goto L_0x014a
            boolean r12 = r11.f81069z
            if (r12 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81059p
            r12.mo48943c()
            goto L_0x014a
        L_0x011b:
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r12 = r11.f81060q
            if (r12 == 0) goto L_0x014a
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            r11.f81067x = r12
            android.animation.AnimatorSet r12 = r11.f81067x
            com.ss.android.ugc.aweme.base.ui.AudioControlView r13 = r11.f81059p
            android.animation.ObjectAnimator r13 = r13.getShowVolumeAnim()
            android.animation.AnimatorSet$Builder r12 = r12.play(r13)
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81060q
            android.animation.ObjectAnimator r13 = r13.getHideAnim()
            r12.after(r13)
            android.animation.AnimatorSet r12 = r11.f81067x
            com.ss.android.ugc.aweme.feed.ui.em$3 r13 = new com.ss.android.ugc.aweme.feed.ui.em$3
            r13.<init>()
            r12.addListener(r13)
            android.animation.AnimatorSet r12 = r11.f81067x
            r12.start()
        L_0x014a:
            return r4
        L_0x014b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30953em.mo63709a(int, android.view.KeyEvent):boolean");
    }
}
