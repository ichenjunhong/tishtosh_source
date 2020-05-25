package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView.C23615b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
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

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ep */
public final class C30959ep extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    public AudioControlView f81077a;

    /* renamed from: b */
    private View f81078b;

    /* renamed from: c */
    private Activity f81079c;

    /* renamed from: d */
    private NewVideoPlayerProgressbar f81080d;

    /* renamed from: e */
    private LineProgressBar f81081e;

    /* renamed from: f */
    private final C23422a f81082f;

    /* renamed from: g */
    private AnimatorSet f81083g;

    /* renamed from: h */
    private AnimatorSet f81084h;

    /* renamed from: i */
    private AnimatorSet f81085i;

    /* renamed from: j */
    private boolean f81086j;

    /* renamed from: k */
    private boolean f81087k = true;

    /* renamed from: w */
    private long f81088w;

    /* renamed from: j */
    private void m72523j() {
        if (this.f81081e != null) {
            this.f81081e.mo64035b();
        }
    }

    /* renamed from: l */
    private void m72525l() {
        if (this.f81079c instanceof C36651f) {
            ((C36651f) this.f81079c).registerActivityOnKeyDownListener(this.f81082f);
        }
    }

    /* renamed from: m */
    private void m72526m() {
        if (this.f81079c instanceof C36651f) {
            ((C36651f) this.f81079c).unRegisterActivityOnKeyDownListener(this.f81082f);
        }
    }

    /* renamed from: d */
    public final void mo63726d() {
        if (this.f81080d != null && this.f81077a != null) {
            if (!(this.f81084h == null && this.f81083g == null)) {
                this.f81085i = new AnimatorSet();
                this.f81085i.play(this.f81080d.getShowAnim()).after(this.f81077a.getHideVolumeAnim());
                this.f81085i.start();
            }
        }
    }

    /* renamed from: e */
    public final void mo63727e() {
        if (this.f81080d != null && this.f81077a != null) {
            if (this.f81085i != null) {
                this.f81085i.cancel();
            }
            this.f81080d.setAlpha(0.0f);
            this.f81077a.setAlpha(1.0f);
        }
    }

    /* renamed from: k */
    private void m72524k() {
        this.f81088w = SystemClock.elapsedRealtime();
        if (this.f81192l != null) {
            if (this.f81192l.getVideoControl() == null || this.f81192l.getVideoControl().showProgressBar != 1) {
                C23729p.m58257a((View) this.f81080d, 8);
                return;
            }
            this.f81080d.setProgress(0);
            if (this.f81192l.getVideo() != null) {
                this.f81080d.setMax(this.f81192l.getVideo().getDuration());
            }
            C23729p.m58257a((View) this.f81080d, 0);
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
        mo63727e();
        if (this.f81083g != null) {
            this.f81083g.removeAllListeners();
            this.f81083g.cancel();
        }
        if (this.f81084h != null) {
            this.f81084h.removeAllListeners();
            this.f81084h.cancel();
        }
        if (this.f81077a != null) {
            this.f81077a.mo48946e();
        }
        if (this.f81081e != null) {
            this.f81081e.mo64036c();
            this.f81081e.clearAnimation();
        }
        if (this.f81080d != null) {
            this.f81080d.clearAnimation();
        }
        m72526m();
        C47718bf.m103291d(this);
        this.f81079c = null;
    }

    @C53771m
    public final void onShareEndEvent(C30325ap apVar) {
        C23729p.m58257a(this.f81078b, 0);
    }

    @C53771m
    public final void onAwesomeSplashEvent(C26216b bVar) {
        boolean z;
        if (bVar.f69221a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f81086j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("load_progress_bar", (C0199s<C23274a>) this).mo48226a("in_video_view_holder", (C0199s<C23274a>) this).mo48226a("on_page_unselected", (C0199s<C23274a>) this).mo48226a("on_page_selected", (C0199s<C23274a>) this).mo48226a("stopPlayAnimation", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        if (this.f81077a != null) {
            this.f81077a.setOnAudioControlViewHideListener(new C23615b() {
                /* renamed from: a */
                public final void mo48961a() {
                    C30959ep.this.mo63726d();
                }

                /* renamed from: b */
                public final void mo48962b() {
                    C30959ep.this.mo63727e();
                }
            });
        }
    }

    @C53771m
    public final void onStopTrackingTouchEvent(C31136f fVar) {
        if (this.f81192l != null && fVar.f81507b != null && fVar.f81507b.getAid().equals(this.f81192l.getAid())) {
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f81080d;
            double duration = (double) this.f81192l.getVideo().getDuration();
            double d = fVar.f81506a / 100.0d;
            Double.isNaN(duration);
            newVideoPlayerProgressbar.setProgress((int) (duration * d));
        }
    }

    @C53771m
    public final void onVideoCleanModeEvent(C31122a aVar) {
        if (this.f81192l != null && aVar.f81466b != null && aVar.f81466b.getAid().equals(this.f81192l.getAid())) {
            if (aVar.f81465a) {
                C23729p.m58257a((View) this.f81080d, 8);
            } else {
                C23729p.m58257a((View) this.f81080d, 0);
            }
        }
    }

    @C53771m
    public final void videoSeekBarHideEvent(C31138h hVar) {
        if (this.f81192l != null && hVar.f81513a != null && hVar.f81513a.getAid().equals(this.f81192l.getAid())) {
            if (this.f81192l.getVideoControl() == null || this.f81192l.getVideoControl().showProgressBar != 1) {
                C23729p.m58257a((View) this.f81080d, 8);
            } else {
                C23729p.m58257a((View) this.f81080d, 0);
            }
        }
    }

    @C53771m
    public final void onPlayerControllerVideoPlayProgressEvent(C31125d dVar) {
        if (this.f81192l != null && dVar.f81476a != null && dVar.f81476a.getAid().equals(this.f81192l.getAid())) {
            if (this.f81080d.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.f81088w + 600) {
                this.f81080d.setMax(this.f81192l.getVideo().getDuration());
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f81080d;
                double duration = (double) this.f81192l.getVideo().getDuration();
                double d = (double) dVar.f81479d;
                Double.isNaN(d);
                double d2 = d / 100.0d;
                Double.isNaN(duration);
                newVideoPlayerProgressbar.setProgress((int) (duration * d2));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f81078b = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b7h);
            this.f81077a = (AudioControlView) this.f81078b.findViewById(R.id.gy);
            this.f81080d = (NewVideoPlayerProgressbar) this.f81078b.findViewById(R.id.dpu);
            this.f81081e = (LineProgressBar) this.f81078b.findViewById(R.id.baz);
            LayoutParams layoutParams = new LayoutParams(-1, C23728o.m58241a(1.0d));
            layoutParams.gravity = 80;
            if (C22453b.m55505a().f60476n) {
                int a = C23728o.m58241a(8.0d);
                layoutParams.leftMargin = a;
                layoutParams.rightMargin = a;
            }
            frameLayout.addView(this.f81078b, layoutParams);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1661876786:
                    if (str.equals("stopPlayAnimation")) {
                        c = 4;
                        break;
                    }
                    break;
                case -904341062:
                    if (str.equals("load_progress_bar")) {
                        c = 0;
                        break;
                    }
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1628582276:
                    if (str.equals("on_page_unselected")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2000201256:
                    if (str.equals("in_video_view_holder")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (((Boolean) aVar.mo48246a()).booleanValue()) {
                        if (this.f81081e != null) {
                            this.f81081e.mo64034a();
                        }
                        return;
                    }
                    m72523j();
                    return;
                case 1:
                    if (((Boolean) aVar.mo48246a()).booleanValue()) {
                        m72525l();
                        return;
                    } else {
                        m72526m();
                        return;
                    }
                case 2:
                    this.f81087k = true;
                    mo63726d();
                    m72525l();
                    m72524k();
                    return;
                case 3:
                    this.f81087k = false;
                    m72526m();
                    m72524k();
                    m72523j();
                    return;
                case 4:
                    if (!this.f81087k) {
                        if (this.f81080d != null) {
                            this.f81080d.mo91071a();
                            this.f81080d.clearAnimation();
                            this.f81080d.setVisibility(4);
                        }
                        if (this.f81081e != null) {
                            this.f81081e.clearAnimation();
                            this.f81081e.mo64036c();
                            break;
                        }
                    }
                    break;
            }
        }
    }

    public C30959ep(View view, Activity activity) {
        super(view);
        C47718bf.m103290c(this);
        this.f81079c = activity;
        this.f81082f = new C30963eq(this);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ boolean mo63725a(int r12, android.view.KeyEvent r13) {
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
            com.ss.android.ugc.aweme.base.ui.AudioControlView r0 = r11.f81077a
            if (r0 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.base.ui.AudioControlView r0 = r11.f81077a
            boolean r0 = r0.mo48947f()
            if (r0 != 0) goto L_0x00ad
        L_0x0023:
            android.app.Activity r0 = r11.f81079c
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.main.C36663h
            if (r0 == 0) goto L_0x0067
            android.app.Activity r0 = r11.f81079c
            android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.m75876a(r0)
            java.lang.String r3 = "page_feed"
            boolean r0 = r0.mo69868b(r3)
            if (r0 == 0) goto L_0x0067
            android.app.Activity r0 = r11.f81079c
            com.ss.android.ugc.aweme.main.h r0 = (com.p683ss.android.ugc.aweme.main.C36663h) r0
            android.support.v4.app.Fragment r0 = r0.getCurFragment()
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.main.C36664i
            if (r0 == 0) goto L_0x0067
            android.app.Activity r0 = r11.f81079c
            com.ss.android.ugc.aweme.main.h r0 = (com.p683ss.android.ugc.aweme.main.C36663h) r0
            android.support.v4.app.Fragment r0 = r0.getCurFragment()
            com.ss.android.ugc.aweme.main.i r0 = (com.p683ss.android.ugc.aweme.main.C36664i) r0
            boolean r0 = r0.mo75504d()
            if (r0 != 0) goto L_0x0065
            android.app.Activity r0 = r11.f81079c
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
            android.app.Activity r3 = r11.f81079c
            boolean r3 = r3 instanceof com.p683ss.android.ugc.aweme.detail.p1628ui.C27488ae
            if (r3 == 0) goto L_0x0080
            android.app.Activity r3 = r11.f81079c
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
            android.app.Activity r5 = r11.f81079c
            boolean r5 = r5 instanceof com.p683ss.android.ugc.aweme.main.C36663h
            if (r5 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.main.k r5 = com.p683ss.android.ugc.aweme.C23794bh.m58388b()
            boolean r5 = r5.mo75671b()
            if (r5 == 0) goto L_0x00a5
            android.app.Activity r5 = r11.f81079c
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
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r11.f81192l
            java.lang.String r7 = r11.f81193m
            int r8 = r11.f81196p
            r5 = r0
            r9 = r12
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81080d
            if (r13 == 0) goto L_0x00cd
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81080d
            r0 = 0
            r13.setAlpha(r0)
        L_0x00cd:
            if (r12 != r1) goto L_0x010d
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81077a
            if (r12 == 0) goto L_0x014a
            boolean r12 = r11.f81086j
            if (r12 == 0) goto L_0x00dd
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81077a
            r12.mo48942b()
            goto L_0x014a
        L_0x00dd:
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r12 = r11.f81080d
            if (r12 == 0) goto L_0x014a
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            r11.f81083g = r12
            android.animation.AnimatorSet r12 = r11.f81083g
            com.ss.android.ugc.aweme.base.ui.AudioControlView r13 = r11.f81077a
            android.animation.ObjectAnimator r13 = r13.getShowVolumeAnim()
            android.animation.AnimatorSet$Builder r12 = r12.play(r13)
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81080d
            android.animation.ObjectAnimator r13 = r13.getHideAnim()
            r12.after(r13)
            android.animation.AnimatorSet r12 = r11.f81083g
            com.ss.android.ugc.aweme.feed.ui.ep$2 r13 = new com.ss.android.ugc.aweme.feed.ui.ep$2
            r13.<init>()
            r12.addListener(r13)
            android.animation.AnimatorSet r12 = r11.f81083g
            r12.start()
            goto L_0x014a
        L_0x010d:
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81077a
            if (r12 == 0) goto L_0x014a
            boolean r12 = r11.f81086j
            if (r12 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.base.ui.AudioControlView r12 = r11.f81077a
            r12.mo48943c()
            goto L_0x014a
        L_0x011b:
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r12 = r11.f81080d
            if (r12 == 0) goto L_0x014a
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            r11.f81084h = r12
            android.animation.AnimatorSet r12 = r11.f81084h
            com.ss.android.ugc.aweme.base.ui.AudioControlView r13 = r11.f81077a
            android.animation.ObjectAnimator r13 = r13.getShowVolumeAnim()
            android.animation.AnimatorSet$Builder r12 = r12.play(r13)
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r13 = r11.f81080d
            android.animation.ObjectAnimator r13 = r13.getHideAnim()
            r12.after(r13)
            android.animation.AnimatorSet r12 = r11.f81084h
            com.ss.android.ugc.aweme.feed.ui.ep$3 r13 = new com.ss.android.ugc.aweme.feed.ui.ep$3
            r13.<init>()
            r12.addListener(r13)
            android.animation.AnimatorSet r12 = r11.f81084h
            r12.start()
        L_0x014a:
            return r4
        L_0x014b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30959ep.mo63725a(int, android.view.KeyEvent):boolean");
    }
}
