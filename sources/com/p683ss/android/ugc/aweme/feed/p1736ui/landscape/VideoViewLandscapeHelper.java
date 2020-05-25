package com.p683ss.android.ugc.aweme.feed.p1736ui.landscape;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.support.p030v4.app.Fragment;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p669e.C10704b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper */
public final class VideoViewLandscapeHelper implements C0183j, C0199s<C23274a> {

    /* renamed from: u */
    public static final C31017a f81217u = new C31017a(null);

    /* renamed from: A */
    private final int f81218A;

    /* renamed from: a */
    public int f81219a;

    /* renamed from: b */
    public int f81220b;

    /* renamed from: c */
    public Aweme f81221c;

    /* renamed from: d */
    public float f81222d = 1.0f;

    /* renamed from: e */
    public boolean f81223e;

    /* renamed from: f */
    public int f81224f = -1;

    /* renamed from: g */
    public int f81225g;

    /* renamed from: h */
    public int f81226h = -1;

    /* renamed from: i */
    public int f81227i = -1;

    /* renamed from: j */
    public int f81228j;

    /* renamed from: k */
    public int f81229k;

    /* renamed from: l */
    public int f81230l;

    /* renamed from: m */
    public int f81231m;

    /* renamed from: n */
    public long f81232n = -1;

    /* renamed from: o */
    public final Runnable f81233o;

    /* renamed from: p */
    public final FrameLayout f81234p;

    /* renamed from: q */
    public final View f81235q;

    /* renamed from: r */
    public final TextView f81236r;

    /* renamed from: s */
    public final DataCenter f81237s;

    /* renamed from: t */
    public final C44576a f81238t;

    /* renamed from: v */
    private final Runnable f81239v;

    /* renamed from: w */
    private final Fragment f81240w;

    /* renamed from: x */
    private final View f81241x;

    /* renamed from: y */
    private final View f81242y;

    /* renamed from: z */
    private final String f81243z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$ViewWrapper */
    public static final class ViewWrapper {
        private final View mTargetView;

        public final int getHeight() {
            return this.mTargetView.getLayoutParams().height;
        }

        public final int getWidth() {
            return this.mTargetView.getLayoutParams().width;
        }

        public ViewWrapper(View view) {
            C52711k.m112240b(view, "mTargetView");
            this.mTargetView = view;
        }

        public final void setHeight(int i) {
            this.mTargetView.getLayoutParams().height = i;
            this.mTargetView.requestLayout();
        }

        public final void setWidth(int i) {
            this.mTargetView.getLayoutParams().width = i;
            this.mTargetView.requestLayout();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$a */
    public static final class C31017a {
        private C31017a() {
        }

        public /* synthetic */ C31017a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$b */
    public static final class C31018b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ VideoViewLandscapeHelper f81244a;

        public final void onGlobalLayout() {
            this.f81244a.f81219a = this.f81244a.f81234p.getWidth();
            this.f81244a.f81220b = this.f81244a.f81234p.getHeight();
            this.f81244a.mo63799d();
            this.f81244a.f81234p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public C31018b(VideoViewLandscapeHelper videoViewLandscapeHelper) {
            this.f81244a = videoViewLandscapeHelper;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$c */
    static final class C31019c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoViewLandscapeHelper f81245a;

        C31019c(VideoViewLandscapeHelper videoViewLandscapeHelper) {
            this.f81245a = videoViewLandscapeHelper;
        }

        public final void run() {
            switch (this.f81245a.f81225g) {
                case 0:
                    this.f81245a.f81237s.mo48228a("action_is_landscape", (Object) Boolean.valueOf(false));
                    this.f81245a.f81238t.mo90509a("action_is_landscape", false);
                    if (!this.f81245a.mo63796a()) {
                        this.f81245a.f81235q.postDelayed(this.f81245a.f81233o, 5000);
                    }
                    if (this.f81245a.f81224f == 1) {
                        this.f81245a.f81234p.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C31019c f81250a;

                            {
                                this.f81250a = r1;
                            }

                            public final void run() {
                                this.f81250a.f81245a.mo63794a(this.f81250a.f81245a.f81222d, 1.0f, 90.0f, 0.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f81245a.mo63798c();
                    }
                    if (this.f81245a.f81224f == 2) {
                        this.f81245a.f81234p.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C31019c f81251a;

                            {
                                this.f81251a = r1;
                            }

                            public final void run() {
                                this.f81251a.f81245a.mo63794a(this.f81251a.f81245a.f81222d, 1.0f, -90.0f, 0.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f81245a.mo63798c();
                        break;
                    }
                    break;
                case 1:
                    this.f81245a.f81237s.mo48228a("action_is_landscape", (Object) Boolean.valueOf(true));
                    this.f81245a.f81238t.mo90509a("action_is_landscape", true);
                    this.f81245a.f81236r.setVisibility(8);
                    if (!this.f81245a.mo63796a()) {
                        this.f81245a.f81235q.removeCallbacks(this.f81245a.f81233o);
                        this.f81245a.mo63795a(true);
                    }
                    if (this.f81245a.f81224f == -1 || this.f81245a.f81224f == 0) {
                        this.f81245a.f81234p.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C31019c f81246a;

                            {
                                this.f81246a = r1;
                            }

                            public final void run() {
                                this.f81246a.f81245a.mo63794a(1.0f, this.f81246a.f81245a.f81222d, 0.0f, 90.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f81245a.mo63797b();
                    }
                    if (this.f81245a.f81224f == 2) {
                        this.f81245a.f81234p.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C31019c f81247a;

                            {
                                this.f81247a = r1;
                            }

                            public final void run() {
                                this.f81247a.f81245a.mo63793a(this.f81247a.f81245a.f81222d, 1.0f, this.f81247a.f81245a.f81222d, -90.0f, -180.0f, -270.0f, null);
                            }
                        }, 250);
                        break;
                    }
                    break;
                case 2:
                    this.f81245a.f81237s.mo48228a("action_is_landscape", (Object) Boolean.valueOf(true));
                    this.f81245a.f81238t.mo90509a("action_is_landscape", true);
                    this.f81245a.f81236r.setVisibility(8);
                    if (!this.f81245a.mo63796a()) {
                        this.f81245a.f81235q.removeCallbacks(this.f81245a.f81233o);
                        this.f81245a.mo63795a(true);
                    }
                    if (this.f81245a.f81224f == -1 || this.f81245a.f81224f == 0) {
                        this.f81245a.f81234p.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C31019c f81248a;

                            {
                                this.f81248a = r1;
                            }

                            public final void run() {
                                this.f81248a.f81245a.mo63794a(1.0f, this.f81248a.f81245a.f81222d, 0.0f, -90.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f81245a.mo63797b();
                    }
                    if (this.f81245a.f81224f == 1) {
                        this.f81245a.f81234p.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C31019c f81249a;

                            {
                                this.f81249a = r1;
                            }

                            public final void run() {
                                this.f81249a.f81245a.mo63793a(this.f81249a.f81245a.f81222d, 1.0f, this.f81249a.f81245a.f81222d, 90.0f, 180.0f, 270.0f, null);
                            }
                        }, 250);
                        break;
                    }
                    break;
                case 3:
                    return;
            }
            this.f81245a.f81224f = this.f81245a.f81225g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$d */
    static final class C31026d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoViewLandscapeHelper f81252a;

        C31026d(VideoViewLandscapeHelper videoViewLandscapeHelper) {
            this.f81252a = videoViewLandscapeHelper;
        }

        public final void run() {
            int i;
            ContentResolver contentResolver;
            String str;
            if (this.f81252a.f81225g == -1 || this.f81252a.f81225g == 0) {
                String str2 = "";
                try {
                    Context context = this.f81252a.f81235q.getContext();
                    if (context != null) {
                        contentResolver = context.getContentResolver();
                    } else {
                        contentResolver = null;
                    }
                    if (System.getInt(contentResolver, "accelerometer_rotation") == 0) {
                        str = this.f81252a.f81234p.getContext().getString(R.string.fbh);
                        C52711k.m112236a((Object) str, "mRootPlayerView.context.…deo_open_auto_rotate_tip)");
                    } else {
                        str = this.f81252a.f81234p.getContext().getString(R.string.fbo);
                        C52711k.m112236a((Object) str, "mRootPlayerView.context.….string.video_rotate_tip)");
                    }
                    str2 = str;
                    this.f81252a.f81236r.setText(str2);
                } catch (SettingNotFoundException unused) {
                }
                int b = (int) C9432q.m18687b(this.f81252a.f81235q.getContext(), 240.0f);
                TextPaint paint = this.f81252a.f81236r.getPaint();
                C52711k.m112236a((Object) paint, "textView.paint");
                StaticLayout staticLayout = new StaticLayout(str2, paint, b, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout.getLineCount() > 5) {
                    int lineStart = staticLayout.getLineStart(5) - 1;
                    if (str2 != null) {
                        String substring = str2.substring(0, lineStart);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        StaticLayout staticLayout2 = new StaticLayout(substring, paint, b, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        i = staticLayout2.getHeight();
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    i = staticLayout.getHeight();
                }
                int top = this.f81252a.f81235q.getTop() - (i + ((int) C9432q.m18687b(this.f81252a.f81235q.getContext(), 32.0f)));
                LayoutParams layoutParams = this.f81252a.f81236r.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = top;
                    this.f81252a.f81236r.setLayoutParams(layoutParams2);
                    this.f81252a.f81236r.setVisibility(0);
                    this.f81252a.mo63795a(true);
                    this.f81252a.f81235q.postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C31026d f81253a;

                        {
                            this.f81253a = r1;
                        }

                        public final void run() {
                            this.f81253a.f81252a.f81236r.setVisibility(8);
                        }
                    }, 5000);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$e */
    public static final class C31028e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f81254a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C31028e(Runnable runnable) {
            this.f81254a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f81254a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$f */
    public static final class C31029f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f81255a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C31029f(Runnable runnable) {
            this.f81255a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f81255a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    private static float m72620a(int i, int i2, int i3, int i4, int i5) {
        float f = (float) i;
        float f2 = ((float) i2) / f;
        return ((float) i3) / ((float) i4) > f2 ? f2 : f / ((float) i5);
    }

    /* renamed from: e */
    private static String m72621e() {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        String str = "rotate_";
        if (TextUtils.isEmpty(curUserId)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("default");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(curUserId);
        return sb2.toString();
    }

    /* renamed from: a */
    public final boolean mo63796a() {
        return Keva.getRepo("landscape").getBoolean(m72621e(), false);
    }

    /* renamed from: f */
    private final void m72622f() {
        if (this.f81228j == 0 || this.f81229k == 0 || this.f81230l == 0 || this.f81231m == 0) {
            this.f81228j = this.f81235q.getLayoutParams().height;
            this.f81229k = (int) (((float) this.f81235q.getLayoutParams().height) * this.f81222d);
            this.f81230l = C10704b.m21577a(this.f81234p.getContext());
            this.f81231m = (int) (((float) C10704b.m21577a(this.f81234p.getContext())) * this.f81222d);
        }
    }

    /* renamed from: b */
    public final void mo63797b() {
        String str;
        String str2 = "enter_full_screen";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f81243z);
        String str3 = "author_id";
        Aweme aweme = this.f81221c;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str3, str).mo47829a("enter_method", "auto").mo47829a("impr_type", C23198ae.m56883s(this.f81221c));
        String str5 = "group_id";
        Aweme aweme2 = this.f81221c;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        C26890h.m65011a(str2, a2.mo47829a(str5, str4).f61491a);
        this.f81232n = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo63798c() {
        String str;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f81243z);
        String str2 = "author_id";
        Aweme aweme = this.f81221c;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str2, str).mo47829a("enter_method", "auto").mo47829a("impr_type", C23198ae.m56883s(this.f81221c));
        String str4 = "group_id";
        Aweme aweme2 = this.f81221c;
        if (aweme2 != null) {
            str3 = aweme2.getAid();
        }
        C23089d a3 = a2.mo47829a(str4, str3);
        if (this.f81232n > 0) {
            a3.mo47827a("play_time", SystemClock.elapsedRealtime() - this.f81232n);
        }
        C26890h.m65011a("cancel_full_screen", a3.f61491a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63799d() {
        /*
            r5 = this;
            boolean r0 = r5.f81223e
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f81221c
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f81221c
            if (r0 == 0) goto L_0x0011
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f81219a
            if (r0 <= 0) goto L_0x004f
            int r0 = r5.f81220b
            if (r0 > 0) goto L_0x001d
            goto L_0x004f
        L_0x001d:
            int r0 = r5.f81219a
            int r1 = r5.f81220b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f81221c
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            if (r2 == 0) goto L_0x0031
            int r2 = r2.getWidth()
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.f81221c
            if (r4 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.getVideo()
            if (r4 == 0) goto L_0x0040
            int r3 = r4.getHeight()
        L_0x0040:
            android.view.View r4 = r5.f81235q
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.height
            float r0 = m72620a(r0, r1, r2, r3, r4)
            r5.f81222d = r0
            return
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.VideoViewLandscapeHelper.mo63799d():void");
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final void mo63795a(boolean z) {
        Keva.getRepo("landscape").storeBoolean(m72621e(), true);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 350216171) {
                if (hashCode == 1628582276 && str.equals("on_page_unselected")) {
                    this.f81235q.removeCallbacks(this.f81233o);
                    this.f81236r.setVisibility(8);
                    if (this.f81225g == 1) {
                        mo63794a(this.f81222d, 1.0f, 90.0f, 0.0f, (Runnable) null);
                        mo63798c();
                    }
                    if (this.f81225g == 2) {
                        mo63794a(this.f81222d, 1.0f, -90.0f, 0.0f, (Runnable) null);
                        mo63798c();
                    }
                    this.f81224f = -1;
                    this.f81225g = 0;
                }
            } else if (str.equals("on_page_selected")) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScreenRotateEvent(com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.C31032b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "screenRotateEvent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f81221c
            if (r0 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f81257a
            if (r0 != 0) goto L_0x000f
            goto L_0x0080
        L_0x000f:
            boolean r0 = r4.f81223e
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            int r0 = r4.f81226h
            r1 = -1
            if (r0 != r1) goto L_0x001e
            int r5 = r5.f81259c
            r4.f81226h = r5
            return
        L_0x001e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f81221c
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r0 = ""
        L_0x002a:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f81257a
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.getAid()
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x007f
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x007f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004d
            goto L_0x007f
        L_0x004d:
            int r0 = r4.f81227i
            if (r0 != r1) goto L_0x0056
            int r5 = r5.f81259c
            r4.f81227i = r5
            return
        L_0x0056:
            int r0 = r5.f81259c
            r4.f81227i = r0
            int r0 = r4.f81226h
            r1 = 1
            if (r0 == r1) goto L_0x0064
            int r0 = r4.f81226h
            r1 = 2
            if (r0 != r1) goto L_0x006f
        L_0x0064:
            int r0 = r4.f81227i
            int r1 = r4.f81226h
            if (r0 != r1) goto L_0x006f
            int r5 = r5.f81259c
            r4.f81226h = r5
            return
        L_0x006f:
            int r0 = r5.f81259c
            r4.f81226h = r0
            int r5 = r5.f81259c
            r4.f81225g = r5
            android.widget.FrameLayout r5 = r4.f81234p
            java.lang.Runnable r0 = r4.f81239v
            r5.post(r0)
            return
        L_0x007f:
            return
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.VideoViewLandscapeHelper.onScreenRotateEvent(com.ss.android.ugc.aweme.feed.ui.landscape.b):void");
    }

    /* renamed from: a */
    public final void mo63794a(float f, float f2, float f3, float f4, Runnable runnable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (f == 1.0f && f2 > 1.0f) {
            m72622f();
            i3 = this.f81230l;
            i2 = this.f81231m;
            i = this.f81228j;
            i4 = this.f81229k;
        } else if (f > 1.0f && f2 == 1.0f) {
            i3 = this.f81231m;
            i2 = this.f81230l;
            i = this.f81229k;
            i4 = this.f81228j;
        } else {
            return;
        }
        ViewWrapper viewWrapper = new ViewWrapper(this.f81235q);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", new int[]{i3, i2});
        C52711k.m112236a((Object) ofInt, "ObjectAnimator.ofInt(vie…fromWidthInt, toWidthInt)");
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", new int[]{i, i4});
        C52711k.m112236a((Object) ofInt2, "ObjectAnimator.ofInt(vie…omHeightInt, toHeightInt)");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f81235q, "rotation", new float[]{f3, f4});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…fromRotation, toRotation)");
        ViewWrapper viewWrapper2 = new ViewWrapper(this.f81241x);
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(viewWrapper2, "width", new int[]{i3, i2});
        C52711k.m112236a((Object) ofInt3, "ObjectAnimator.ofInt(cov…fromWidthInt, toWidthInt)");
        ObjectAnimator ofInt4 = ObjectAnimator.ofInt(viewWrapper2, "height", new int[]{i, i4});
        C52711k.m112236a((Object) ofInt4, "ObjectAnimator.ofInt(cov…omHeightInt, toHeightInt)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f81241x, "rotation", new float[]{f3, f4});
        C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(m…fromRotation, toRotation)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f81242y, "rotation", new float[]{f3, f4});
        C52711k.m112236a((Object) ofFloat3, "ObjectAnimator.ofFloat(m…fromRotation, toRotation)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2, ofFloat, ofInt3, ofInt4, ofFloat2, ofFloat3});
        animatorSet.setDuration(300);
        animatorSet.addListener(new C31028e(null));
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo63793a(float f, float f2, float f3, float f4, float f5, float f6, Runnable runnable) {
        if (f > 1.0f && f3 > 1.0f) {
            int i = this.f81231m;
            int i2 = this.f81230l;
            int i3 = this.f81231m;
            int i4 = this.f81229k;
            int i5 = this.f81228j;
            int i6 = this.f81229k;
            ViewWrapper viewWrapper = new ViewWrapper(this.f81235q);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", new int[]{i, i2, i3});
            C52711k.m112236a((Object) ofInt, "ObjectAnimator.ofInt(vie…ddleWidthInt, toWidthInt)");
            ObjectAnimator objectAnimator = ofInt;
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", new int[]{i4, i5, i6});
            C52711k.m112236a((Object) ofInt2, "ObjectAnimator.ofInt(vie…leHeightInt, toHeightInt)");
            ObjectAnimator objectAnimator2 = ofInt2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f81235q, "rotation", new float[]{f4, f5, f6});
            C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…ddleRotation, toRotation)");
            ViewWrapper viewWrapper2 = new ViewWrapper(this.f81241x);
            ObjectAnimator objectAnimator3 = ofFloat;
            ObjectAnimator ofInt3 = ObjectAnimator.ofInt(viewWrapper2, "width", new int[]{i, i2, i3});
            C52711k.m112236a((Object) ofInt3, "ObjectAnimator.ofInt(cov…ddleWidthInt, toWidthInt)");
            ObjectAnimator ofInt4 = ObjectAnimator.ofInt(viewWrapper2, "height", new int[]{i4, i5, i6});
            C52711k.m112236a((Object) ofInt4, "ObjectAnimator.ofInt(cov…leHeightInt, toHeightInt)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f81241x, "rotation", new float[]{f4, f5, f6});
            C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(m…ddleRotation, toRotation)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f81242y, "rotation", new float[]{f4, f5, f6});
            C52711k.m112236a((Object) ofFloat3, "ObjectAnimator.ofFloat(m…ddleRotation, toRotation)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2, objectAnimator3, ofInt4, ofInt3, ofFloat2, ofFloat3});
            animatorSet.setDuration(600);
            animatorSet.addListener(new C31029f(null));
            animatorSet.start();
        }
    }

    public VideoViewLandscapeHelper(Fragment fragment, FrameLayout frameLayout, View view, View view2, TextView textView, View view3, DataCenter dataCenter, C44576a aVar, String str, int i) {
        C52711k.m112240b(fragment, "mFragment");
        C52711k.m112240b(frameLayout, "mRootPlayerView");
        C52711k.m112240b(view, "mPlayerView");
        C52711k.m112240b(view2, "mCoverView");
        C52711k.m112240b(textView, "mLandscapeTextView");
        C52711k.m112240b(view3, "mPlayButton");
        C52711k.m112240b(dataCenter, "mDataCenter");
        C52711k.m112240b(aVar, "mFeedInteractStickerManager");
        C52711k.m112240b(str, "mEventType");
        this.f81240w = fragment;
        this.f81234p = frameLayout;
        this.f81235q = view;
        this.f81241x = view2;
        this.f81236r = textView;
        this.f81242y = view3;
        this.f81237s = dataCenter;
        this.f81238t = aVar;
        this.f81243z = str;
        this.f81218A = i;
        this.f81240w.getLifecycle().mo324a(this);
        C0199s sVar = this;
        this.f81237s.mo48226a("on_page_unselected", sVar);
        this.f81237s.mo48226a("on_page_selected", sVar);
        C47718bf.m103290c(this);
        this.f81233o = new C31026d(this);
        this.f81239v = new C31019c(this);
    }
}
