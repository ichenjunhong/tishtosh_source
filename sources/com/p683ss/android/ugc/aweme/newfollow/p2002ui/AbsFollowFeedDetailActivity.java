package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0732g;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p683ss.android.ugc.aweme.common.widget.DragView;
import com.p683ss.android.ugc.aweme.common.widget.DragView.C26939a;
import com.p683ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31777f;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity */
public abstract class AbsFollowFeedDetailActivity<T extends View> extends AmeSSActivity implements C9382a, C31835c {

    /* renamed from: a */
    protected T f96488a;

    /* renamed from: b */
    protected Aweme f96489b;

    /* renamed from: c */
    public String f96490c;

    /* renamed from: d */
    protected String f96491d;

    /* renamed from: e */
    protected boolean f96492e;

    /* renamed from: f */
    protected C9381g f96493f;

    /* renamed from: g */
    public String f96494g = "list";

    /* renamed from: h */
    public boolean f96495h;

    /* renamed from: i */
    protected DataCenter f96496i;

    /* renamed from: j */
    protected C23279d f96497j;

    /* renamed from: k */
    protected boolean f96498k;

    /* renamed from: l */
    private C31777f f96499l;

    /* renamed from: m */
    private boolean f96500m;
    protected DiggLayout mDiggLayout;
    protected DragView mDragView;
    protected ViewGroup mRootView;

    /* renamed from: n */
    private MotionEvent f96501n;

    /* renamed from: o */
    private MotionEvent f96502o;

    /* renamed from: p */
    private boolean f96503p;

    /* renamed from: q */
    private BroadcastReceiver f96504q;

    /* renamed from: a */
    public final void mo64865a(Aweme aweme) {
    }

    /* renamed from: a */
    public final void mo64869a(C31777f fVar) {
    }

    /* renamed from: a */
    public final void mo64870a(Exception exc, Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo77340f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo77341g() {
    }

    public Context getContext() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo77342h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract T mo77344j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo77345k();

    public void onBackPressed() {
        mo77347m();
    }

    public boolean isActive() {
        if (!super.isActive() || !this.f96503p) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo77346l() {
        if (!this.f96503p) {
            mo77285a();
            mo77291b();
            this.f96503p = true;
        }
    }

    /* renamed from: m */
    public final void mo77347m() {
        if (this.mDragView != null) {
            this.mDragView.mo54900a();
        }
    }

    /* renamed from: b */
    private void mo77291b() {
        if (this.f96489b != null) {
            C31842e c = C31843f.m74206a().mo64954c(this.f96491d);
            if (c != null) {
                c.mo64944a(this.f96490c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo77343i() {
        if (this.f96489b != null) {
            C31842e c = C31843f.m74206a().mo64954c(this.f96491d);
            if (c != null) {
                c.f83202c.mo95018b(16777216);
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Aweme mo77348n() {
        if (this.f96489b == null || this.f96489b.getAwemeType() != 13) {
            return this.f96489b;
        }
        return this.f96489b.getForwardItem();
    }

    public void onResume() {
        super.onResume();
        if (!C47863eu.m103535a()) {
            mo77285a();
            mo77291b();
            this.f96503p = true;
        }
    }

    /* renamed from: a */
    private void mo77285a() {
        if (C22858c.f61208d.equals(C32401a.m74897a())) {
            C37879b.m84582b();
        } else if ("personal_homepage".equals(this.f96490c) || "others_homepage".equals(this.f96490c)) {
            C37879b.m84587b(this.f96490c);
        } else {
            C37879b.m84566a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C31187c.m72823b(this.f96489b);
        C0732g.m2130a(getContext()).mo2402a(this.f96504q);
        if (this.f96499l != null) {
            this.f96499l.mo46991S_();
            this.f96499l.aq_();
        }
    }

    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            if (C22858c.f61208d.equals(C32401a.m74897a())) {
                C37879b.m84588b(this.f96490c, C22858c.f61208d);
            } else if ("personal_homepage".equals(this.f96490c) || "others_homepage".equals(this.f96490c)) {
                String str = this.f96490c;
                String str2 = "list";
                if (C37879b.m84565a(str) != -1) {
                    long currentTimeMillis = System.currentTimeMillis() - C37879b.m84565a(str);
                    if (currentTimeMillis > 0) {
                        C37879b.m84567a(currentTimeMillis, str, str2);
                    }
                    C37879b.m84578a(str, -1);
                }
            } else {
                C37879b.m84580a(this.f96490c, "list");
            }
            if (this.f96489b != null) {
                C31842e c = C31843f.m74206a().mo64954c(this.f96491d);
                if (c != null) {
                    c.mo64947b(this.f96490c);
                }
            }
        }
        this.f96503p = false;
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            mo77345k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getAction()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0062;
                case 1: goto L_0x001a;
                case 2: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x011f
        L_0x000b:
            android.view.MotionEvent r0 = r10.f96501n
            boolean r0 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31845g.m74212a(r2, r0, r11, r10)
            if (r0 == 0) goto L_0x011f
            com.bytedance.common.utility.b.g r0 = r10.f96493f
            r0.removeMessages(r2)
            goto L_0x011f
        L_0x001a:
            boolean r0 = r10.f96500m
            if (r0 != 0) goto L_0x0046
            android.view.MotionEvent r0 = r10.f96501n
            if (r0 == 0) goto L_0x0046
            android.view.MotionEvent r0 = r10.f96501n
            boolean r0 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31845g.m74212a(r2, r0, r11, r10)
            if (r0 != 0) goto L_0x0046
            com.bytedance.common.utility.b.g r0 = r10.f96493f
            com.bytedance.common.utility.b.g r3 = r10.f96493f
            android.os.Message r3 = r3.obtainMessage(r2)
            int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r4 = (long) r4
            long r6 = r11.getEventTime()
            long r4 = r4 - r6
            android.view.MotionEvent r6 = r10.f96501n
            long r6 = r6.getEventTime()
            long r4 = r4 + r6
            r0.sendMessageDelayed(r3, r4)
        L_0x0046:
            android.view.MotionEvent r0 = r10.f96502o
            if (r0 == 0) goto L_0x004f
            android.view.MotionEvent r0 = r10.f96502o
            r0.recycle()
        L_0x004f:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r10.f96502o = r0
            boolean r0 = r10.f96500m
            if (r0 != 0) goto L_0x0061
            boolean r11 = super.dispatchTouchEvent(r11)
            if (r11 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            return r2
        L_0x0061:
            return r1
        L_0x0062:
            com.bytedance.common.utility.b.g r0 = r10.f96493f
            boolean r0 = r0.hasMessages(r2)
            if (r0 == 0) goto L_0x006f
            com.bytedance.common.utility.b.g r0 = r10.f96493f
            r0.removeMessages(r2)
        L_0x006f:
            android.view.MotionEvent r0 = r10.f96501n
            android.view.MotionEvent r3 = r10.f96502o
            boolean r0 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31845g.m74213a(r0, r3, r11, r10)
            if (r0 == 0) goto L_0x0101
            r10.f96500m = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.mo77348n()
            if (r4 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r4.getStatus()
            if (r0 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r4.getStatus()
            int r0 = r0.getPrivateStatus()
            if (r0 == r1) goto L_0x00a2
            com.ss.android.ugc.aweme.common.widget.DiggLayout r0 = r10.mDiggLayout
            android.view.MotionEvent r3 = r10.f96501n
            float r3 = r3.getX()
            android.view.MotionEvent r5 = r10.f96501n
            float r5 = r5.getY()
            r0.mo54895a(r3, r5)
        L_0x00a2:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f96489b
            int r0 = r0.getAwemeType()
            r3 = 13
            if (r0 != r3) goto L_0x00f6
            com.ss.android.ugc.aweme.flowfeed.f.f r0 = r10.f96499l
            if (r0 == 0) goto L_0x0103
            if (r4 == 0) goto L_0x0103
            if (r4 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            java.lang.String r3 = r4.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAwemeById(r3)
            int r3 = r4.getUserDigg()
            if (r0 == 0) goto L_0x00cc
            int r3 = r0.getUserDigg()
        L_0x00cc:
            if (r3 != r1) goto L_0x00d0
            r0 = 1
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            if (r0 != 0) goto L_0x0103
            com.ss.android.ugc.aweme.flowfeed.utils.f r0 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f.m74206a()
            java.lang.String r3 = r10.f96491d
            com.ss.android.ugc.aweme.flowfeed.utils.e r0 = r0.mo64954c(r3)
            long r5 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L_0x00e5
            long r5 = r0.f83205f
        L_0x00e5:
            com.ss.android.ugc.aweme.flowfeed.f.f r3 = r10.f96499l
            r0 = 1
            java.lang.String r7 = "click_double_like"
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r5
            r5 = r0
            r6 = r7
            r7 = r8
            r3.mo64652a(r4, r5, r6, r7)
            goto L_0x0103
        L_0x00f6:
            com.ss.android.ugc.aweme.flowfeed.d.b r0 = new com.ss.android.ugc.aweme.flowfeed.d.b
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f96489b
            r0.<init>(r2, r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            goto L_0x0103
        L_0x0101:
            r10.f96500m = r2
        L_0x0103:
            android.view.MotionEvent r0 = r10.f96501n
            if (r0 == 0) goto L_0x010c
            android.view.MotionEvent r0 = r10.f96501n
            r0.recycle()
        L_0x010c:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r10.f96501n = r0
            boolean r0 = r10.f96500m
            if (r0 != 0) goto L_0x011e
            boolean r11 = super.dispatchTouchEvent(r11)
            if (r11 == 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            return r2
        L_0x011e:
            return r1
        L_0x011f:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p2002ui.AbsFollowFeedDetailActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onCreate(Bundle bundle) {
        this.mActivityAnimType = 1;
        super.onCreate(bundle);
        setContentView(mo77340f());
        this.f96490c = getIntent().getStringExtra("enter_from");
        this.f96491d = getIntent().getStringExtra("share_id");
        this.f96494g = getIntent().getStringExtra("page_type");
        this.f96495h = getIntent().getBooleanExtra("launch_from_origin_detail", false);
        this.f96492e = getIntent().getBooleanExtra("use_follow_flow_strategy", false);
        this.f96489b = C31187c.m72818a();
        this.f96488a = mo77344j();
        DragView dragView = this.mDragView;
        T t = this.f96488a;
        IViewInfo iViewInfo = (IViewInfo) getIntent().getParcelableExtra("view_info");
        if (!(t == null || iViewInfo == null)) {
            dragView.getViewTreeObserver().addOnGlobalLayoutListener(dragView);
            LayoutParams layoutParams = new LayoutParams(iViewInfo.f70892c, iViewInfo.f70893d);
            layoutParams.leftMargin = iViewInfo.f70890a;
            layoutParams.topMargin = iViewInfo.f70891b;
            dragView.f70827a = t;
            dragView.f70828b = iViewInfo;
            dragView.f70831e = iViewInfo.f70894e;
            if (VERSION.SDK_INT >= 21) {
                dragView.f70827a.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        Outline outline2 = outline;
                        outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.max(DragView.this.f70831e, 0.5f));
                    }
                });
                dragView.f70827a.setClipToOutline(true);
                dragView.f70827a.setVisibility(4);
            }
            dragView.addView(dragView.f70827a, layoutParams);
            dragView.f70834h = 0;
            dragView.setBackgroundColor(dragView.f70834h << 24);
        }
        this.mDragView.setDragStateListener(new C26939a() {
            /* renamed from: e */
            public final void mo54929e() {
                AbsFollowFeedDetailActivity.this.mo77343i();
            }

            /* renamed from: c */
            public final void mo54927c() {
                AbsFollowFeedDetailActivity.this.f96498k = false;
                AbsFollowFeedDetailActivity.this.mo77342h();
            }

            /* renamed from: d */
            public final void mo54928d() {
                AbsFollowFeedDetailActivity.this.f96498k = true;
                AbsFollowFeedDetailActivity.this.mo77342h();
            }

            /* renamed from: a */
            public final void mo54925a() {
                AbsFollowFeedDetailActivity.this.f96498k = true;
                AbsFollowFeedDetailActivity.this.mo77342h();
                if ("poi_page".equalsIgnoreCase(AbsFollowFeedDetailActivity.this.f96490c)) {
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().resumePoiDetailListening();
                }
            }

            /* renamed from: b */
            public final void mo54926b() {
                AbsFollowFeedDetailActivity.this.f96498k = true;
                AbsFollowFeedDetailActivity.this.mo77342h();
                if ("poi_page".equalsIgnoreCase(AbsFollowFeedDetailActivity.this.f96490c)) {
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().pausePoiDetailListening();
                }
            }
        });
        this.f96493f = new C9381g(this);
        if (this.f96489b == null) {
            finish();
        } else {
            C37879b.m84571a(this.f96489b, this.f96490c);
            this.f96496i = DataCenter.m57235a(C0214z.m440a((FragmentActivity) this), (C0184k) this);
            this.f96497j = C23279d.m57258a((FragmentActivity) this, (View) this.mRootView);
            this.f96497j.mo48252a(this.f96496i);
            mo77341g();
        }
        getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        this.f96504q = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && AbsFollowFeedDetailActivity.this.mStatusActive) {
                    AbsFollowFeedDetailActivity.this.mo77346l();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0732g.m2130a(getContext()).mo2403a(this.f96504q, intentFilter);
        this.f96499l = new C31777f(this.f96490c, 0);
        this.f96499l.mo64733f();
        this.f96499l.mo54799a(new C30508z());
        this.f96499l.mo54800a((C31835c) this);
    }
}
