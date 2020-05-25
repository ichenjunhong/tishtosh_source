package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.FlippableViewPager;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.feed.api.FollowFeedApi.C30141a;
import com.p683ss.android.ugc.aweme.feed.experiment.C30225e;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30310ab;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30321al;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30328as;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30354v;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30356x;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31869f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.homepage.experiment.FollowDotColorExperiment;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.experiment.FollowTabNumberDotExperiment;
import com.p683ss.android.ugc.aweme.login.p1637a.C27955b;
import com.p683ss.android.ugc.aweme.main.experiment.C36645a;
import com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip */
public class MainTabStrip extends LinearLayout {

    /* renamed from: A */
    boolean f85763A;

    /* renamed from: B */
    String f85764B;

    /* renamed from: C */
    private Context f85765C;

    /* renamed from: D */
    private int f85766D;

    /* renamed from: E */
    private Paint f85767E;

    /* renamed from: F */
    private int f85768F;

    /* renamed from: G */
    private int f85769G;

    /* renamed from: H */
    private int f85770H;

    /* renamed from: I */
    private int f85771I;

    /* renamed from: J */
    private TextView[] f85772J;

    /* renamed from: K */
    private boolean[] f85773K;

    /* renamed from: L */
    private boolean f85774L;

    /* renamed from: M */
    private long f85775M;

    /* renamed from: N */
    private Rect f85776N;

    /* renamed from: a */
    public FlippableViewPager f85777a;

    /* renamed from: b */
    C33029b f85778b;

    /* renamed from: c */
    public AnimatorSet f85779c;

    /* renamed from: d */
    TextView f85780d;

    /* renamed from: e */
    ImageView f85781e;

    /* renamed from: f */
    View f85782f;

    /* renamed from: g */
    CircleImageView f85783g;

    /* renamed from: h */
    CircleImageView f85784h;

    /* renamed from: i */
    CircleImageView f85785i;

    /* renamed from: j */
    View f85786j;

    /* renamed from: k */
    CircleImageView f85787k;

    /* renamed from: l */
    CircleImageView f85788l;

    /* renamed from: m */
    CircleImageView f85789m;

    /* renamed from: n */
    View f85790n;

    /* renamed from: o */
    DmtTextView f85791o;

    /* renamed from: p */
    View f85792p;

    /* renamed from: q */
    TextView f85793q;

    /* renamed from: r */
    TextView f85794r;

    /* renamed from: s */
    View f85795s;

    /* renamed from: t */
    View f85796t;

    /* renamed from: u */
    public boolean f85797u;

    /* renamed from: v */
    public boolean f85798v;

    /* renamed from: w */
    public View f85799w;

    /* renamed from: x */
    public C33030a f85800x;

    /* renamed from: y */
    boolean f85801y;

    /* renamed from: z */
    public boolean f85802z;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip$a */
    public class C33028a implements AnimatorUpdateListener {
        public C33028a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MainTabStrip.this.mo69959a(0, ((Float) valueAnimator.getAnimatedValue()).floatValue(), MainTabStrip.this.f85799w);
            MainTabStrip.this.mo69960a(0, 0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            MainTabStrip.this.mo69960a(0, 1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip$b */
    public interface C33029b {
        /* renamed from: a */
        boolean mo69994a(int i);
    }

    /* renamed from: c */
    static void m75960c(int i) {
    }

    /* renamed from: a */
    public final void mo69958a(int i) {
        String str;
        if (!m75962g()) {
            if (i <= 0 || C30225e.m70970b()) {
                mo69964a(true, 0);
                return;
            }
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f85791o.setText(str);
            this.f85790n.setVisibility(0);
            this.f85771I = 0;
            this.f85773K[0] = true;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo69964a(boolean z, int i) {
        if (z != this.f85773K[i]) {
            this.f85771I = i;
            this.f85773K[i] = z;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo69960a(int i, int i2, float f) {
        View d = m75961d(i2);
        if (d != null && d.getVisibility() == 0) {
            if (i2 == i) {
                d.setAlpha(1.0f - (f * 0.39999998f));
            } else if (i2 == i + 1) {
                d.setAlpha((f * 0.39999998f) + 0.6f);
            } else {
                d.setAlpha(0.6f);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo69965a(View view) {
        if (this.f85777a == null || view == null) {
            return false;
        }
        View d = m75961d(this.f85777a.getCurrentItemCompat());
        if (d == null || d.getWidth() == 0 || getX() == 0.0f || view.getWidth() == 0) {
            return false;
        }
        view.setX(((getX() + d.getX()) + ((float) (d.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
        return true;
    }

    /* renamed from: a */
    public final void mo69959a(int i, float f, View view) {
        if (C23729p.m58262a(view)) {
            View d = m75961d(i);
            View d2 = m75961d(i + 1);
            if (d != null && d.getVisibility() == 0 && d2 != null && d2.getVisibility() == 0) {
                float x = (d.getX() + ((float) (d.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f * (((d2.getX() + ((float) (d2.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (C23729p.m58262a(d)) {
                view.setX(((getX() + d.getX()) + ((float) (d.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69961a(com.p683ss.android.ugc.aweme.base.p1420ui.FlippableViewPager r4, final android.view.View r5, boolean r6) {
        /*
            r3 = this;
            r3.f85777a = r4
            r3.f85798v = r6
            r3.f85799w = r5
            r6 = 0
            if (r5 == 0) goto L_0x0014
            boolean r0 = r3.f85798v
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0011
        L_0x000f:
            r0 = 8
        L_0x0011:
            r5.setVisibility(r0)
        L_0x0014:
            com.ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment r0 = com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment.INSTANCE
            boolean r0 = com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment.m82551b()
            r1 = 1
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x003a
            boolean r0 = com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment.m82552c()
            if (r0 != 0) goto L_0x003a
            r4.f62942g = r6
            goto L_0x004b
        L_0x003a:
            boolean r6 = r3.f85798v
            r4.f62942g = r6
            boolean r4 = r3.f85798v
            if (r4 == 0) goto L_0x004b
            boolean r4 = com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment.m82552c()
            if (r4 != 0) goto L_0x004b
            com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment.m82549a(r1)
        L_0x004b:
            boolean r4 = r3.f85798v
            if (r4 == 0) goto L_0x0062
            android.view.View r4 = r3.f85795s
            r6 = 4
            if (r4 == 0) goto L_0x0059
            android.view.View r4 = r3.f85795s
            r4.setVisibility(r6)
        L_0x0059:
            android.view.View r4 = r3.f85796t
            if (r4 == 0) goto L_0x0062
            android.view.View r4 = r3.f85796t
            r4.setVisibility(r6)
        L_0x0062:
            com.ss.android.ugc.aweme.base.ui.FlippableViewPager r4 = r3.f85777a
            com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip$2 r6 = new com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip$2
            r6.<init>(r5)
            r4.mo2957a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip.mo69961a(com.ss.android.ugc.aweme.base.ui.FlippableViewPager, android.view.View, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo69962a(String str, int i) {
        if (!this.f85778b.mo69994a(i) && this.f85777a != null) {
            C47718bf.m103288a(new C30310ab(str));
            this.f85777a.mo2956a(i, this.f85798v);
        }
    }

    /* renamed from: a */
    public final void mo69963a(boolean z) {
        if (z) {
            if ((this.f85777a == null || this.f85777a.getCurrentItemCompat() == 0) ? false : true) {
                this.f85792p.setVisibility(0);
                C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", CustomActionPushReceiver.f104061f).mo47829a("action_type", "show").f61491a);
                return;
            }
        }
        this.f85792p.setVisibility(8);
    }

    /* renamed from: f */
    public final boolean mo69973f() {
        return this.f85773K[0];
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C47718bf.m103290c(this);
    }

    /* renamed from: g */
    private boolean m75962g() {
        if (this.f85792p.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo69957a() {
        this.f85790n.setVisibility(8);
        mo69964a(false, 0);
    }

    /* renamed from: c */
    public final void mo69970c() {
        if (C30225e.m70970b() && C30225e.m70971c() != 1) {
            this.f85802z = true;
            mo69966b();
        }
    }

    /* renamed from: e */
    public final void mo69972e() {
        this.f85777a.mo2956a(1, false);
        C32458a.m75141a(4, "MainFragment", "changeToForU");
        m75960c(1);
    }

    /* renamed from: d */
    public final void mo69971d() {
        this.f85777a.mo2956a(0, false);
        C32458a.m75141a(4, "MainFragment", "changeToFollow");
        m75960c(2);
    }

    public String getEnterFollowNoticeType() {
        if (m75962g()) {
            return CustomActionPushReceiver.f104061f;
        }
        if (this.f85801y) {
            return "head";
        }
        if (this.f85790n.getVisibility() == 0) {
            return "number";
        }
        if (this.f85773K[0]) {
            return "dot";
        }
        return null;
    }

    /* renamed from: b */
    public final void mo69966b() {
        if (C30225e.m70970b() && !this.f85801y && this.f85763A && this.f85802z && this.f85777a.getCurrentItemCompat() == 1 && (this.f85775M * 1000) + 300000 <= System.currentTimeMillis() && this.f85777a.getCurrentItemCompat() == 1) {
            Keva repo = Keva.getRepo("MAIN_TAB");
            if (repo != null && this.f85775M == 0) {
                this.f85775M = repo.getLong("following_bubble_last_display_time", 0);
            }
            C30141a.m70743a().getInterestUsers(1, this.f85775M, 0).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C33035aa<Object>(this), (C1710e<? super Throwable>) new C33036ab<Object>(this));
        }
    }

    public void setEnableAnimation(boolean z) {
        this.f85774L = z;
    }

    public void setTabOnClickListener(C33029b bVar) {
        this.f85778b = bVar;
    }

    public MainTabStrip(Context context) {
        this(context, null);
    }

    @C53771m
    public void onHideFollowBubbleEvent(C30356x xVar) {
        mo69969b(true);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onShowFollowBubbleEvent(C30328as asVar) {
        this.f85763A = true;
        mo69966b();
    }

    @C53771m
    public void toogleSkyLightButton(C31869f fVar) {
        this.f85781e.setVisibility(8);
    }

    /* renamed from: d */
    private View m75961d(int i) {
        if (i == 0) {
            if (this.f85780d.getVisibility() == 0) {
                return this.f85780d;
            }
            return this.f85782f;
        } else if (i == 1) {
            return this.f85793q;
        } else {
            if (i == 2) {
                return this.f85794r;
            }
            return null;
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onFollowFeedHideRedDotEvent(C30354v vVar) {
        if (vVar != null && this.f85777a != null) {
            if (vVar.f79269a) {
                mo69958a(-1);
            } else {
                mo69957a();
            }
        }
    }

    @C53771m
    public void onLoginEvent(C27955b bVar) {
        animate().alpha(1.0f).setDuration(500).withStartAction(new Runnable() {
            public final void run() {
                MainTabStrip.this.setVisibility(0);
            }
        }).start();
    }

    /* renamed from: a */
    private View m75953a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(context.getResources().getColor(R.color.vg));
        LayoutParams layoutParams = new LayoutParams(C23728o.m58241a(1.0d), C23728o.m58241a(5.0d));
        layoutParams.gravity = 16;
        addView(view, layoutParams);
        return view;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onResumeSwipeAfterLoginEvent(C30321al alVar) {
        if (alVar != null && this.f85777a != null && MainTabStripSwipeSwitchExperiment.m82551b()) {
            boolean a = MainTabStripSwipeSwitchExperiment.m82550a();
            this.f85777a.f62942g = a;
            if (a && !MainTabStripSwipeSwitchExperiment.m82552c()) {
                MainTabStripSwipeSwitchExperiment.m82549a(true);
            }
        }
    }

    public void setTabMode(int i) {
        switch (i) {
            case 5:
                this.f85794r.setVisibility(8);
                this.f85796t.setVisibility(8);
                break;
            case 6:
                this.f85794r.setVisibility(0);
                this.f85796t.setVisibility(0);
                break;
        }
        this.f85766D = i;
    }

    public void setTitle(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                if (strArr.length > 2) {
                    this.f85780d.setText(strArr[0]);
                    this.f85793q.setText(strArr[1]);
                    this.f85794r.setText(strArr[2]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo69967b(int i) {
        if (!this.f85798v) {
            if (i == R.id.d_h) {
                if (this.f85766D == 6) {
                    m75957a(this.f85794r, 4);
                    m75956a(this.f85795s, 2);
                    m75956a(this.f85796t, 1);
                }
                m75957a(this.f85780d, 3);
                m75957a(this.f85793q, 4);
            } else if (i == R.id.daa) {
                if (this.f85766D == 6) {
                    m75957a(this.f85794r, 4);
                    m75956a(this.f85795s, 0);
                    m75956a(this.f85796t, 2);
                }
                m75957a(this.f85780d, 4);
                m75957a(this.f85793q, 3);
            } else {
                if (i == R.id.d_s && this.f85794r.getVisibility() == 0) {
                    if (this.f85766D == 6) {
                        m75957a(this.f85794r, 3);
                        m75956a(this.f85795s, 1);
                        m75956a(this.f85796t, 0);
                    }
                    m75957a(this.f85780d, 4);
                    m75957a(this.f85793q, 4);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69968b(View view) {
        if (this.f85778b != null) {
            int id = view.getId();
            if (id == R.id.d_h || id == R.id.g_ || id == R.id.e9t || id == R.id.e9s || id == R.id.cwr) {
                if (this.f85801y) {
                    C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", "head").mo47829a("action_type", "click").mo47829a("to_user_id", this.f85764B).f61491a);
                }
                if (m75962g()) {
                    C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", CustomActionPushReceiver.f104061f).mo47829a("action_type", "click").mo47829a("to_user_id", this.f85764B).f61491a);
                }
                mo69962a("homepage_follow", 0);
                m75960c(2);
            } else if (id == R.id.daa) {
                mo69962a("homepage_hot", 1);
                m75960c(1);
                mo69964a(false, 2);
            } else if (id == R.id.d_s && this.f85794r.getVisibility() == 0) {
                mo69962a("homepage_fresh", 2);
                m75960c(3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!C30225e.m70970b() || C30225e.m70971c() != 2 || !this.f85801y) {
            TextView textView = this.f85772J[this.f85771I];
            if (this.f85773K[this.f85771I]) {
                this.f85767E.setColor(this.f85769G);
                if (this.f85771I == 0 && C30225e.m70970b() && C30225e.m70971c() == 1 && this.f85801y) {
                    canvas.drawCircle(this.f85782f.getX() + ((float) this.f85782f.getMeasuredWidth()) + ((float) (this.f85768F / 2)), this.f85782f.getY(), (float) (this.f85768F / 2), this.f85767E);
                    C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", "dot").mo47829a("action_type", "show").f61491a);
                } else if (!((this.f85771I == 0 && this.f85790n != null && this.f85790n.getVisibility() == 0) || textView == null)) {
                    textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().toString().length(), this.f85776N);
                    int x = ((int) textView.getX()) + ((textView.getWidth() - this.f85776N.width()) / 2) + (this.f85768F / 2) + this.f85776N.width();
                    if (this.f85794r.getVisibility() != 0) {
                        x += 2;
                    }
                    canvas.drawCircle((float) x, (float) ((((int) textView.getY()) + ((textView.getHeight() - this.f85776N.height()) / 2)) - 1), (float) (this.f85768F / 2), this.f85767E);
                    C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", "dot").mo47829a("action_type", "show").f61491a);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69969b(boolean z) {
        CircleImageView circleImageView;
        CircleImageView circleImageView2;
        CircleImageView circleImageView3;
        CircleImageView circleImageView4;
        if (C30225e.m70970b() && this.f85801y) {
            CircleImageView circleImageView5 = null;
            if (C30225e.m70971c() == 1) {
                if (this.f85783g.getVisibility() == 0) {
                    circleImageView3 = this.f85783g;
                } else {
                    circleImageView3 = null;
                }
                if (this.f85784h.getVisibility() == 0) {
                    circleImageView4 = this.f85784h;
                } else {
                    circleImageView4 = null;
                }
                if (this.f85785i.getVisibility() == 0) {
                    circleImageView5 = this.f85785i;
                }
                if (this.f85782f.getVisibility() == 0) {
                    m75959a(circleImageView3, circleImageView4, circleImageView5, new C33037ac(this));
                }
            } else {
                if (this.f85800x != null && this.f85800x.isShowing()) {
                    if (!z) {
                        this.f85800x.setOnDismissListener(null);
                    }
                    this.f85800x.dismiss();
                }
                if (this.f85786j != null && this.f85786j.getVisibility() == 0) {
                    if (this.f85787k.getVisibility() == 0) {
                        circleImageView = this.f85787k;
                    } else {
                        circleImageView = null;
                    }
                    if (this.f85788l.getVisibility() == 0) {
                        circleImageView2 = this.f85788l;
                    } else {
                        circleImageView2 = null;
                    }
                    if (this.f85789m.getVisibility() == 0) {
                        circleImageView5 = this.f85789m;
                    }
                    if (this.f85786j.getVisibility() == 0) {
                        m75959a(circleImageView, circleImageView2, circleImageView5, new C33038ad(this));
                    }
                }
            }
            this.f85801y = false;
            this.f85775M = System.currentTimeMillis() / 1000;
            Keva repo = Keva.getRepo("MAIN_TAB");
            if (repo != null) {
                repo.storeLong("following_bubble_last_display_time", this.f85775M);
            }
        }
    }

    /* renamed from: a */
    static CircleImageView m75955a(CircleImageView circleImageView, C30151i iVar) {
        C23515d.m57669a((RemoteImageView) circleImageView, iVar.getUser().getAvatarThumb());
        circleImageView.setVisibility(4);
        return circleImageView;
    }

    /* renamed from: a */
    private void m75956a(View view, int i) {
        float f;
        if (i == 0) {
            f = -C9432q.m18687b(this.f85765C, 4.0f);
        } else if (i == 2) {
            f = C9432q.m18687b(this.f85765C, 4.0f);
        } else {
            f = 0.0f;
        }
        if (this.f85774L) {
            ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getTranslationX(), f}).setDuration(200).start();
            return;
        }
        view.setTranslationX(f);
    }

    /* renamed from: a */
    private void m75957a(TextView textView, int i) {
        ObjectAnimator objectAnimator;
        float f;
        TextView textView2 = textView;
        ObjectAnimator objectAnimator2 = null;
        float f2 = 1.0f;
        if (i == 3) {
            if (this.f85774L) {
                objectAnimator2 = ObjectAnimator.ofFloat(textView2, "scaleX", new float[]{textView.getScaleX(), 1.25f, 1.125f}).setDuration(300);
                objectAnimator2.setInterpolator(new TimeInterpolator() {
                    public final float getInterpolation(float f) {
                        return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
                    }
                });
                objectAnimator = ObjectAnimator.ofFloat(textView2, "scaleY", new float[]{textView.getScaleY(), 1.25f, 1.125f}).setDuration(300);
                objectAnimator.setInterpolator(new TimeInterpolator() {
                    public final float getInterpolation(float f) {
                        return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
                    }
                });
            } else {
                objectAnimator = null;
            }
            f = 1.0f;
            f2 = 1.125f;
        } else {
            f = 0.6f;
            if (this.f85774L) {
                objectAnimator2 = ObjectAnimator.ofFloat(textView2, "scaleX", new float[]{textView.getScaleX(), 1.0f}).setDuration(200);
                objectAnimator = ObjectAnimator.ofFloat(textView2, "scaleY", new float[]{textView.getScaleY(), 1.0f}).setDuration(200);
            } else {
                objectAnimator = null;
            }
        }
        if (this.f85774L) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{textView.getAlpha(), f}).setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{duration, objectAnimator2, objectAnimator});
            animatorSet.start();
            return;
        }
        textView2.setScaleX(f2);
        textView2.setScaleY(f2);
        textView2.setAlpha(f);
    }

    public MainTabStrip(Context context, AttributeSet attributeSet) {
        float f;
        Context context2 = context;
        super(context, attributeSet);
        this.f85779c = new AnimatorSet();
        this.f85768F = 0;
        this.f85769G = 0;
        this.f85797u = true;
        this.f85798v = false;
        this.f85772J = new TextView[5];
        this.f85773K = new boolean[5];
        this.f85774L = true;
        this.f85800x = null;
        this.f85775M = 0;
        this.f85801y = false;
        this.f85802z = true;
        this.f85763A = false;
        this.f85764B = "";
        this.f85776N = new Rect();
        setOrientation(0);
        this.f85780d = m75954a(context2, (int) R.string.b1u, (int) R.id.d_h);
        ImageView imageView = new ImageView(context2);
        imageView.setId(R.id.g_);
        imageView.setImageResource(R.drawable.cyz);
        LayoutParams layoutParams = new LayoutParams(C23728o.m58241a(12.0d), C23728o.m58241a(12.0d));
        int i = 17;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT));
            layoutParams.setMarginEnd(C23728o.m58241a(12.0d));
        }
        layoutParams.setMargins(C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT), 0, C23728o.m58241a(12.0d), 0);
        layoutParams.gravity = 16;
        addView(imageView, layoutParams);
        imageView.setOnClickListener(new C33073m(this));
        imageView.setVisibility(8);
        this.f85781e = imageView;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bbl, this, false);
        LayoutParams layoutParams2 = new LayoutParams(-2, C23728o.m58241a(32.0d));
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(C23728o.m58241a(-6.0d));
            layoutParams2.setMarginEnd(C23728o.m58241a(8.0d));
        }
        layoutParams2.setMargins(C23728o.m58241a(-6.0d), 0, C23728o.m58241a(8.0d), 0);
        layoutParams2.gravity = 16;
        addView(inflate, layoutParams2);
        inflate.setVisibility(8);
        inflate.setOnClickListener(new C33085y(this));
        this.f85787k = (CircleImageView) inflate.findViewById(R.id.eeh);
        this.f85788l = (CircleImageView) inflate.findViewById(R.id.eei);
        this.f85789m = (CircleImageView) inflate.findViewById(R.id.eej);
        this.f85786j = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.bbm, this, false);
        LayoutParams layoutParams3 = new LayoutParams(-2, C23728o.m58241a(30.0d));
        if (VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(C23728o.m58241a(-10.0d));
            layoutParams3.setMarginEnd(C23728o.m58241a(8.0d));
        }
        layoutParams3.setMargins(C23728o.m58241a(-10.0d), 0, C23728o.m58241a(8.0d), 0);
        layoutParams3.gravity = 16;
        addView(inflate2, layoutParams3);
        inflate2.setVisibility(8);
        inflate2.setOnClickListener(new C33086z(this));
        this.f85791o = (DmtTextView) inflate2.findViewById(R.id.f4s);
        this.f85790n = inflate2;
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.baf, this, false);
        int i2 = -Float.valueOf(Math.min(((DmtTextView) inflate3.findViewById(R.id.ejo)).getPaint().measureText("LIVE") + ((float) C23728o.m58241a(8.0d)), (float) (C23728o.m58241a(64.0d) + C23728o.m58241a(4.0d)))).intValue();
        LayoutParams layoutParams4 = new LayoutParams(-2, C23728o.m58241a(14.0d));
        if (VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart(i2);
            layoutParams4.setMarginEnd(C23728o.m58241a(4.0d));
            layoutParams4.topMargin = C23728o.m58241a(13.0d);
        }
        layoutParams4.setMargins(i2, C23728o.m58241a(13.0d), C23728o.m58241a(4.0d), 0);
        addView(inflate3, layoutParams4);
        inflate3.setVisibility(8);
        this.f85792p = inflate3;
        View inflate4 = LayoutInflater.from(context).inflate(R.layout.bbo, this, false);
        LayoutParams layoutParams5 = new LayoutParams(-2, -2);
        layoutParams5.setMargins(0, 0, C23728o.m58241a(12.0d), 0);
        layoutParams5.gravity = 16;
        addView(inflate4, layoutParams5);
        inflate4.setVisibility(8);
        inflate4.setOnClickListener(new C33084x(this));
        this.f85783g = (CircleImageView) inflate4.findViewById(R.id.eeh);
        this.f85784h = (CircleImageView) inflate4.findViewById(R.id.eei);
        this.f85785i = (CircleImageView) inflate4.findViewById(R.id.eej);
        this.f85782f = inflate4;
        this.f85795s = m75953a(context);
        this.f85793q = m75954a(context2, (int) R.string.b1w, (int) R.id.daa);
        this.f85796t = m75953a(context);
        this.f85794r = m75954a(context2, (int) R.string.b1v, (int) R.id.d_s);
        float measureText = this.f85780d.getPaint().measureText(context.getResources().getText(R.string.b1u).toString());
        float measureText2 = this.f85793q.getPaint().measureText(context.getResources().getText(R.string.b1w).toString());
        C33041ag agVar = C33041ag.f85835b;
        float f2 = measureText + measureText2;
        C52711k.m112240b(context2, "context");
        if (C30225e.m70970b() && C30225e.m70971c() == 2) {
            f = C9432q.m18687b(context2, 93.0f);
        } else if (C30225e.m70970b() || !C10181b.m20511a().mo18172a(FollowTabNumberDotExperiment.class, true, "i18n_following_badge_type_number", 31744, false)) {
            f = C9432q.m18687b(context2, 57.0f);
        } else {
            f = C9432q.m18687b(context2, 82.0f);
        }
        float f3 = f2 + f;
        int a = C9432q.m18670a(context);
        float a2 = agVar.mo70005a(context2, true);
        float a3 = agVar.mo70005a(context2, false);
        float f4 = (float) a;
        if (f3 <= f4 - (a2 * 2.0f)) {
            C33041ag.m75984a(true);
        } else if (f3 <= f4 - (a3 * 2.0f)) {
            C33041ag.m75984a(false);
        } else if (f3 < f4 - C9432q.m18687b(context2, 72.0f)) {
            C33041ag.m75984a(false);
            i = 16;
        } else {
            C33041ag.m75984a(false);
            i = 14;
        }
        float f5 = (float) i;
        this.f85780d.setTextSize(1, f5);
        this.f85793q.setTextSize(1, f5);
        this.f85765C = context2;
        this.f85766D = 6;
        this.f85767E = new Paint();
        this.f85767E.setAntiAlias(true);
        this.f85767E.setStyle(Style.FILL);
        if (C10181b.m20511a().mo18172a(FollowDotColorExperiment.class, true, "following_red_dot_reverse", 31744, false)) {
            this.f85769G = getResources().getColor(R.color.a36);
        } else {
            this.f85769G = getResources().getColor(R.color.a3c);
        }
        this.f85768F = context.getResources().getDimensionPixelSize(R.dimen.zx);
        this.f85780d.getPaint().setFakeBoldText(true);
        this.f85793q.getPaint().setFakeBoldText(true);
        this.f85794r.getPaint().setFakeBoldText(true);
        this.f85770H = C36645a.m82553a();
        if (this.f85770H == 2) {
            this.f85780d.setVisibility(8);
            this.f85795s.setVisibility(8);
        } else {
            this.f85780d.setVisibility(0);
            this.f85795s.setVisibility(0);
        }
        this.f85772J[0] = this.f85780d;
        this.f85772J[2] = this.f85793q;
    }

    /* renamed from: a */
    private TextView m75954a(Context context, int i, int i2) {
        DmtTextView dmtTextView = new DmtTextView(context);
        dmtTextView.setId(i2);
        dmtTextView.setText(i);
        dmtTextView.setGravity(17);
        dmtTextView.setLines(1);
        dmtTextView.setPadding(C23728o.m58241a(12.0d), 0, C23728o.m58241a(12.0d), 0);
        dmtTextView.setMinWidth(C23728o.m58241a(53.0d));
        dmtTextView.setTextColor(context.getResources().getColor(R.color.w2));
        dmtTextView.setAlpha(0.6f);
        dmtTextView.setTextSize(1, 17.0f);
        dmtTextView.setFontType(C10751d.f28908g);
        if (MainTabStripSwipeSwitchExperiment.m82550a()) {
            dmtTextView.setShadowLayer(C9432q.m18687b(context, 2.0f), 0.0f, C9432q.m18687b(context, 2.0f), Color.parseColor("#26000000"));
        }
        addView(dmtTextView, new LayoutParams(-2, C23728o.m58241a(58.0d)));
        dmtTextView.setOnClickListener(new C33072l(this));
        return dmtTextView;
    }

    /* renamed from: a */
    static void m75958a(CircleImageView circleImageView, CircleImageView circleImageView2, CircleImageView circleImageView3) {
        if (circleImageView != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(400);
            ofFloat.addUpdateListener(new C33039ae(circleImageView));
            AnimatorSet animatorSet = new AnimatorSet();
            Builder play = animatorSet.play(ofFloat);
            if (circleImageView2 != null) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat2.setDuration(400);
                ofFloat2.setStartDelay(30);
                ofFloat2.addUpdateListener(new C33074n(circleImageView2));
                play.with(ofFloat2);
            }
            if (circleImageView3 != null) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat3.setDuration(400);
                ofFloat3.setStartDelay(60);
                ofFloat3.addUpdateListener(new C33075o(circleImageView3));
                play.with(ofFloat3);
            }
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private void m75959a(CircleImageView circleImageView, CircleImageView circleImageView2, CircleImageView circleImageView3, final Runnable runnable) {
        int i;
        if (circleImageView != null) {
            int i2 = 0;
            AnimatorSet animatorSet = new AnimatorSet();
            Builder builder = null;
            if (circleImageView3 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(400);
                ofFloat.addUpdateListener(new C33076p(circleImageView3));
                builder = animatorSet.play(ofFloat);
                i2 = 30;
            }
            if (circleImageView2 != null) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat2.setDuration(400);
                ofFloat2.setStartDelay((long) i);
                if (i == 0) {
                    i = 30;
                } else {
                    i = 60;
                }
                ofFloat2.addUpdateListener(new C33077q(circleImageView2));
                if (builder == null) {
                    builder = animatorSet.play(ofFloat2);
                } else {
                    builder.with(ofFloat2);
                }
            }
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat3.setDuration(400);
            ofFloat3.setStartDelay((long) i);
            ofFloat3.addUpdateListener(new C33078r(circleImageView));
            if (builder == null) {
                animatorSet.play(ofFloat3);
            } else {
                builder.with(ofFloat3);
            }
            ofFloat3.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    runnable.run();
                }
            });
            animatorSet.start();
        }
    }
}
