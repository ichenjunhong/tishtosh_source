package com.p683ss.android.p1103ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1103ad.splash.C18759k;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18603c.C18604a;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18609g;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18614l;
import com.p683ss.android.p1103ad.splash.core.p1118g.C18648a;
import com.p683ss.android.p1103ad.splash.core.p1118g.C18650b;
import com.p683ss.android.p1103ad.splash.core.video2.BDASplashVideoView;
import com.p683ss.android.p1103ad.splash.core.video2.C18710b;
import com.p683ss.android.p1103ad.splash.core.video2.C18711c;
import com.p683ss.android.p1103ad.splash.core.video2.C18712d;
import com.p683ss.android.p1103ad.splash.core.video2.C18715e;
import com.p683ss.android.p1103ad.splash.p1123g.C18735a;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j.C187451;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.p1103ad.splash.p1123g.C18748m;
import com.p683ss.android.p1103ad.splash.p1123g.C18752p;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r.C18755a;
import com.ss.android.ugc.trill.R;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c */
public final class C18587c extends RelativeLayout implements C18651h, C18755a {

    /* renamed from: A */
    private String f51235A;

    /* renamed from: B */
    private String f51236B;

    /* renamed from: C */
    private int f51237C = 0;

    /* renamed from: D */
    private Timer f51238D;

    /* renamed from: E */
    private Space f51239E;

    /* renamed from: a */
    Space f51240a;

    /* renamed from: b */
    ImageView f51241b;

    /* renamed from: c */
    TextView f51242c;

    /* renamed from: d */
    public BDASplashVideoView f51243d;

    /* renamed from: e */
    public RelativeLayout f51244e;

    /* renamed from: f */
    TextView f51245f;

    /* renamed from: g */
    public LinearLayout f51246g;

    /* renamed from: h */
    FrameLayout f51247h;

    /* renamed from: i */
    public boolean f51248i;

    /* renamed from: j */
    long f51249j;

    /* renamed from: k */
    public int f51250k = -1;

    /* renamed from: l */
    public C18602b f51251l;

    /* renamed from: m */
    public C18659o f51252m;

    /* renamed from: n */
    public C18754r f51253n = new C18754r(this);

    /* renamed from: o */
    public C18715e f51254o;

    /* renamed from: p */
    private LinearLayout f51255p;

    /* renamed from: q */
    private ViewStub f51256q;

    /* renamed from: r */
    private RelativeLayout f51257r;

    /* renamed from: s */
    private FrameLayout f51258s;

    /* renamed from: t */
    private BDASplashImageView f51259t;

    /* renamed from: u */
    private RelativeLayout f51260u;

    /* renamed from: v */
    private ImageView f51261v;

    /* renamed from: w */
    private TextView f51262w;

    /* renamed from: x */
    private TextView f51263x;

    /* renamed from: y */
    private C18648a f51264y;

    /* renamed from: z */
    private boolean f51265z;

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo37942a() {
        this.f51246g.addOnLayoutChangeListener(new OnLayoutChangeListener() {

            /* renamed from: b */
            private int f51271b;

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onLayoutChange(android.view.View r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
                /*
                    r2 = this;
                    com.ss.android.ad.splash.core.c r3 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r3 = r3.f51246g
                    if (r3 != 0) goto L_0x0007
                    return
                L_0x0007:
                    int r3 = r2.f51271b
                    r4 = 1
                    int r3 = r3 + r4
                    r2.f51271b = r3
                    r3 = 2
                    int[] r5 = new int[r3]
                    r5 = {0, 0} // fill-array
                    com.ss.android.ad.splash.core.c r6 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r6 = r6.f51246g
                    r6.getLocationOnScreen(r5)
                    r5 = r5[r4]
                    com.ss.android.ad.splash.core.c r6 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r6 = r6.f51246g
                    int r6 = r6.getPaddingTop()
                    com.ss.android.ad.splash.core.c r7 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r7 = r7.f51246g
                    r8 = 3
                    r9 = 0
                    if (r7 != 0) goto L_0x002e
                    goto L_0x0161
                L_0x002e:
                    android.content.Context r10 = r7.getContext()
                    if (r10 != 0) goto L_0x0036
                    goto L_0x0161
                L_0x0036:
                    if (r7 == 0) goto L_0x0151
                    java.lang.String r11 = android.os.Build.BRAND
                    java.lang.String r11 = r11.toLowerCase()
                    r0 = -1
                    int r1 = r11.hashCode()
                    switch(r1) {
                        case -1206476313: goto L_0x006f;
                        case -759499589: goto L_0x0065;
                        case 3418016: goto L_0x005b;
                        case 3620012: goto L_0x0051;
                        case 97536331: goto L_0x0047;
                        default: goto L_0x0046;
                    }
                L_0x0046:
                    goto L_0x0079
                L_0x0047:
                    java.lang.String r1 = "flyme"
                    boolean r11 = r11.equals(r1)
                    if (r11 == 0) goto L_0x0079
                    r11 = 4
                    goto L_0x007a
                L_0x0051:
                    java.lang.String r1 = "vivo"
                    boolean r11 = r11.equals(r1)
                    if (r11 == 0) goto L_0x0079
                    r11 = 2
                    goto L_0x007a
                L_0x005b:
                    java.lang.String r1 = "oppo"
                    boolean r11 = r11.equals(r1)
                    if (r11 == 0) goto L_0x0079
                    r11 = 1
                    goto L_0x007a
                L_0x0065:
                    java.lang.String r1 = "xiaomi"
                    boolean r11 = r11.equals(r1)
                    if (r11 == 0) goto L_0x0079
                    r11 = 3
                    goto L_0x007a
                L_0x006f:
                    java.lang.String r1 = "huawei"
                    boolean r11 = r11.equals(r1)
                    if (r11 == 0) goto L_0x0079
                    r11 = 0
                    goto L_0x007a
                L_0x0079:
                    r11 = -1
                L_0x007a:
                    if (r11 == 0) goto L_0x007e
                    r11 = 0
                    goto L_0x0096
                L_0x007e:
                    java.util.List<java.lang.String> r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.f51821b
                    if (r11 != 0) goto L_0x008e
                    java.lang.String[] r11 = new java.lang.String[r4]
                    java.lang.String r0 = "GLK-AL00"
                    r11[r9] = r0
                    java.util.List r11 = java.util.Arrays.asList(r11)
                    com.p683ss.android.p1103ad.splash.p1123g.C18737c.f51821b = r11
                L_0x008e:
                    java.util.List<java.lang.String> r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.f51821b
                    java.lang.String r0 = android.os.Build.MODEL
                    boolean r11 = r11.contains(r0)
                L_0x0096:
                    r0 = 28
                    if (r11 == 0) goto L_0x009c
                    r11 = 1
                    goto L_0x00f5
                L_0x009c:
                    java.lang.String r11 = "huawei"
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45675a(r11)
                    if (r11 == 0) goto L_0x00a9
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45676b(r7)
                    goto L_0x00f5
                L_0x00a9:
                    java.lang.String r11 = "oppo"
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45675a(r11)
                    if (r11 == 0) goto L_0x00c4
                    if (r7 != 0) goto L_0x00b5
                L_0x00b3:
                    r11 = 0
                    goto L_0x00f5
                L_0x00b5:
                    android.content.Context r11 = r7.getContext()
                    android.content.pm.PackageManager r11 = r11.getPackageManager()
                    java.lang.String r1 = "com.oppo.feature.screen.heteromorphism"
                    boolean r11 = r11.hasSystemFeature(r1)
                    goto L_0x00f5
                L_0x00c4:
                    java.lang.String r11 = "vivo"
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45675a(r11)
                    if (r11 == 0) goto L_0x00d1
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45677c(r7)
                    goto L_0x00f5
                L_0x00d1:
                    java.lang.String r11 = "xiaomi"
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45675a(r11)
                    if (r11 == 0) goto L_0x00de
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45678d(r7)
                    goto L_0x00f5
                L_0x00de:
                    java.lang.String r11 = "flyme"
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45675a(r11)
                    if (r11 == 0) goto L_0x00eb
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45679e(r7)
                    goto L_0x00f5
                L_0x00eb:
                    if (r7 == 0) goto L_0x00b3
                    int r11 = android.os.Build.VERSION.SDK_INT
                    if (r11 < r0) goto L_0x00b3
                    boolean r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45680f(r7)
                L_0x00f5:
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                    com.p683ss.android.p1103ad.splash.p1123g.C18737c.f51820a = r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x0146
                    int r11 = android.os.Build.VERSION.SDK_INT
                    if (r11 < r0) goto L_0x0135
                    android.app.Activity r11 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45683i(r7)
                    if (r11 == 0) goto L_0x0151
                    android.view.Window r11 = r11.getWindow()
                    android.view.WindowManager$LayoutParams r11 = r11.getAttributes()
                    int r11 = r11.layoutInDisplayCutoutMode
                    if (r11 == r3) goto L_0x0151
                    if (r11 != r4) goto L_0x012a
                    boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45681g(r7)
                    if (r3 != 0) goto L_0x0125
                    boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45682h(r7)
                    if (r3 == 0) goto L_0x0151
                L_0x0125:
                    int r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45674a(r7)
                    goto L_0x0150
                L_0x012a:
                    boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45682h(r7)
                    if (r3 == 0) goto L_0x0151
                    int r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45674a(r7)
                    goto L_0x0150
                L_0x0135:
                    boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45681g(r7)
                    if (r3 != 0) goto L_0x0141
                    boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45682h(r7)
                    if (r3 == 0) goto L_0x0151
                L_0x0141:
                    int r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45674a(r7)
                    goto L_0x0150
                L_0x0146:
                    boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45682h(r7)
                    if (r3 == 0) goto L_0x0151
                    int r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45674a(r7)
                L_0x0150:
                    r9 = r3
                L_0x0151:
                    java.lang.Boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18737c.f51820a
                    boolean r3 = r3.booleanValue()
                    if (r3 == 0) goto L_0x0161
                    if (r9 != 0) goto L_0x0161
                    if (r5 != 0) goto L_0x0161
                    int r9 = com.p683ss.android.p1103ad.splash.p1123g.C18752p.m45756b(r10)
                L_0x0161:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "screenY:"
                    r3.<init>(r4)
                    r3.append(r5)
                    java.lang.String r4 = " paddingTop:"
                    r3.append(r4)
                    r3.append(r6)
                    java.lang.String r4 = " safeInsetTop:"
                    r3.append(r4)
                    r3.append(r9)
                    int r3 = r5 + r6
                    if (r3 >= r9) goto L_0x01ae
                    int r9 = r9 - r5
                    int r9 = r9 - r6
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "adjust translationY:"
                    r3.<init>(r4)
                    r3.append(r9)
                    java.lang.String r4 = ". triedTimes:"
                    r3.append(r4)
                    int r4 = r2.f51271b
                    r3.append(r4)
                    com.ss.android.ad.splash.core.c r3 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r3 = r3.f51246g
                    float r3 = r3.getTranslationY()
                    float r4 = (float) r9
                    float r3 = r3 + r4
                    com.ss.android.ad.splash.core.c r4 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r4 = r4.f51246g
                    r4.setTranslationY(r3)
                    com.ss.android.ad.splash.core.c r3 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r3 = r3.f51246g
                    r3.removeOnLayoutChangeListener(r2)
                    goto L_0x01ba
                L_0x01ae:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "no need to adjust translationY. triedTimes:"
                    r3.<init>(r4)
                    int r4 = r2.f51271b
                    r3.append(r4)
                L_0x01ba:
                    int r3 = r2.f51271b
                    if (r3 < r8) goto L_0x01c5
                    com.ss.android.ad.splash.core.c r3 = com.p683ss.android.p1103ad.splash.core.C18587c.this
                    android.widget.LinearLayout r3 = r3.f51246g
                    r3.removeOnLayoutChangeListener(r2)
                L_0x01c5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.C18587c.C1859011.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
            }
        });
    }

    /* renamed from: b */
    public final void mo37895b() {
        if (this.f51254o != null) {
            this.f51254o.mo38300a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m45003d();
        C18642g.m45181I().mo38040c();
    }

    /* renamed from: c */
    public final void mo37947c() {
        C18735a.m45661a(this.f51251l.mo37863p(), "跳过了广告");
        if (this.f51254o != null) {
            this.f51250k = 2;
            this.f51254o.mo38303c();
        }
        this.f51252m.mo38079a(this.f51251l);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51238D == null) {
            this.f51238D = new Timer();
            this.f51238D.scheduleAtFixedRate(new TimerTask() {
                public final void run() {
                    Message obtainMessage = C18587c.this.f51253n.obtainMessage();
                    obtainMessage.what = 2;
                    C18587c.this.f51253n.sendMessage(obtainMessage);
                }
            }, (this.f51249j % 1000) + 1000, 1000);
        }
        C18658n.m45272a().f51568a = System.currentTimeMillis();
        this.f51252m.mo38084c();
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                C18587c.this.getViewTreeObserver().removeOnPreDrawListener(this);
                C18587c cVar = C18587c.this;
                cVar.f51253n.removeMessages(1);
                cVar.f51253n.sendEmptyMessageDelayed(1, cVar.f51249j);
                C18587c.this.f51252m.mo38082b(C18587c.this.f51251l);
                return true;
            }
        });
    }

    /* renamed from: d */
    private void m45003d() {
        if (this.f51259t != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.f51259t.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f51259t.setImageBitmap(null);
                }
            } catch (Exception unused) {
            }
        }
        C18712d.m45601a().mo38325b();
        if (this.f51254o != null) {
            this.f51254o.mo38307g();
            this.f51254o = null;
            this.f51243d = null;
        }
        if (this.f51238D != null) {
            this.f51238D.cancel();
            this.f51238D = null;
        }
    }

    public final void setSplashAdInteraction(C18659o oVar) {
        this.f51252m = oVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C18710b mo37946c(final C18602b bVar) {
        return new C18711c() {
            /* renamed from: b */
            public final void mo37924b() {
                C18587c.this.f51252m.mo38081b();
            }

            /* renamed from: a */
            public final void mo37921a() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f51328b);
                    String str = "not_real_time";
                    if (bVar.mo37987i()) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    if (C18642g.m45194V() != -1) {
                        int i = 1;
                        if (C18642g.m45194V() != 1) {
                            i = 2;
                        }
                        jSONObject.put("awemelaunch", i);
                    }
                    jSONObject.put("ad_sequence", C18673u.m45399a().mo38172o());
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    if (!C18747l.m45742a(bVar.mo37864r())) {
                        jSONObject2.put("log_extra", bVar.mo37864r());
                    }
                    jSONObject2.put("ad_fetch_time", bVar.mo37862f());
                } catch (JSONException unused) {
                    jSONObject2 = null;
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "play", jSONObject2);
                if (bVar.f51339m != null) {
                    C18642g.m45180H().mo38044c(null, bVar.mo37863p(), bVar.f51339m.f51402a, bVar.mo37864r(), true, -1, null);
                }
                C18642g.m45181I().mo38034a((long) C18587c.this.f51254o.mo38306f(), C18587c.this.f51254o.mo38296a(), C18587c.this.f51254o.mo38302b());
            }

            /* renamed from: a */
            public final void mo37922a(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Long.toString((long) i));
                    jSONObject.put("percent", Integer.toString(100));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.mo37862f());
                    if (!C18747l.m45742a(bVar.mo37864r())) {
                        jSONObject.put("log_extra", bVar.mo37864r());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "play_over", jSONObject);
                if (bVar.f51339m != null) {
                    C18642g.m45180H().mo38045d(null, bVar.mo37863p(), bVar.f51339m.f51403b, bVar.mo37864r(), true, -1, null);
                }
                C18642g.m45181I().mo38033a();
                C18587c.this.f51252m.mo38078a();
            }

            /* renamed from: b */
            public final void mo37925b(int i, int i2) {
                C18642g.m45181I().mo38035a((long) i, (long) i2);
                m45013a(i, i2, "first_quartile");
            }

            /* renamed from: c */
            public final void mo37926c(int i, int i2) {
                C18642g.m45181I().mo38039b((long) i, (long) i2);
                m45013a(i, i2, "midpoint");
            }

            /* renamed from: d */
            public final void mo37927d(int i, int i2) {
                C18642g.m45181I().mo38041c((long) i, (long) i2);
                m45013a(i, i2, "third_quartile");
            }

            /* renamed from: a */
            public final void mo37923a(int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j = (long) i;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C18748m.m45743a(j, (long) i2));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("category", "umeng");
                    jSONObject.put("ad_fetch_time", bVar.mo37862f());
                    jSONObject.put("break_reason", C18587c.this.f51250k);
                    if (!C18747l.m45742a(bVar.mo37864r())) {
                        jSONObject.put("log_extra", bVar.mo37864r());
                    }
                    jSONObject2.put("break_reason", C18587c.this.f51250k);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "play_break", jSONObject);
                C18642g.m45181I().mo38038b();
            }

            /* renamed from: a */
            private void m45013a(int i, int i2, String str) {
                JSONObject jSONObject = new JSONObject();
                try {
                    long j = (long) i2;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C18748m.m45743a((long) i, j));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.mo37862f());
                    if (!TextUtils.isEmpty(bVar.mo37864r())) {
                        jSONObject.put("log_extra", bVar.mo37864r());
                    }
                } catch (Throwable unused) {
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", str, jSONObject);
            }
        };
    }

    private void setSkipClickListener(C18602b bVar) {
        this.f51247h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C18587c.this.mo37947c();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void setImageTouchListener(final C18602b bVar) {
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if ((C18587c.this.getTouchDelegate() == null || !C18587c.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    C18587c.this.mo37943a(bVar, motionEvent.getRawX(), motionEvent.getRawY());
                }
                return true;
            }
        });
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m45003d();
        }
    }

    private void setupWifiPreloadHindLayout(C18602b bVar) {
        String str = bVar.f51294C;
        if (!TextUtils.isEmpty(str)) {
            this.f51242c.setVisibility(0);
            this.f51242c.setText(str);
        }
    }

    private void setupSkipButtonHitArea(C18602b bVar) {
        C18614l lVar = bVar.f51293B;
        if (lVar != null && this.f51247h.getVisibility() == 0 && this.f51247h.getParent() != null) {
            FrameLayout frameLayout = this.f51247h;
            int a = lVar.mo38013a();
            int a2 = lVar.mo38013a();
            int b = lVar.mo38014b();
            int b2 = lVar.mo38014b();
            View view = (View) frameLayout.getParent();
            C187451 r1 = new Runnable(frameLayout, a, a2, b, b2) {

                /* renamed from: a */
                final /* synthetic */ View f51830a;

                /* renamed from: b */
                final /* synthetic */ int f51831b;

                /* renamed from: c */
                final /* synthetic */ int f51832c;

                /* renamed from: d */
                final /* synthetic */ int f51833d;

                /* renamed from: e */
                final /* synthetic */ int f51834e;

                public final void run() {
                    if (this.f51830a != null && this.f51830a.getParent() != null) {
                        Rect rect = new Rect();
                        this.f51830a.setEnabled(true);
                        this.f51830a.getHitRect(rect);
                        rect.top -= this.f51831b;
                        rect.bottom += this.f51832c;
                        rect.left -= this.f51833d;
                        rect.right += this.f51834e;
                        TouchDelegate touchDelegate = new TouchDelegate(rect, this.f51830a);
                        if (View.class.isInstance(this.f51830a.getParent())) {
                            ((View) this.f51830a.getParent()).setTouchDelegate(touchDelegate);
                        }
                    }
                }

                {
                    this.f51830a = r1;
                    this.f51831b = r2;
                    this.f51832c = r3;
                    this.f51833d = r4;
                    this.f51834e = r5;
                }
            };
            view.post(r1);
        }
    }

    /* renamed from: a */
    private GradientDrawable m44999a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = (float) i;
        gradientDrawable.setCornerRadii(new float[]{C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f), C18752p.m45750a(getContext(), f)});
        return gradientDrawable;
    }

    private void setupAdLabelLayout(C18602b bVar) {
        C18609g gVar = bVar.f51292A;
        if (gVar != null) {
            if (!TextUtils.isEmpty(gVar.mo38012d())) {
                this.f51263x.setText(gVar.mo38012d());
            }
            if (!TextUtils.isEmpty(gVar.mo38012d())) {
                this.f51263x.setTextColor(C18744j.m45703a(gVar.mo38011c(), "#ffffff"));
            }
            if (!TextUtils.isEmpty(gVar.mo38009a())) {
                GradientDrawable a = m44999a(2);
                a.setColor(C18744j.m45703a(gVar.mo38009a(), "#32222222"));
                if (VERSION.SDK_INT >= 16) {
                    this.f51263x.setBackground(a);
                    return;
                }
                this.f51263x.setBackgroundDrawable(a);
            }
        }
    }

    /* renamed from: a */
    static void m45001a(C18602b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = "not_real_time";
        try {
            if (bVar.mo37987i()) {
                str = "real_time";
            }
            jSONObject.putOpt("show_type", str);
            jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f51328b));
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            jSONObject2.putOpt("log_extra", bVar.mo37864r());
            jSONObject2.putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
        } catch (JSONException unused) {
            jSONObject2 = null;
        }
        C18642g.m45201a(bVar.mo37863p(), "splash_ad", "banner_show", jSONObject2);
    }

    /* renamed from: b */
    private CharSequence m45002b(int i) {
        if (i < 0) {
            i = 0;
        }
        C18609g gVar = this.f51251l.f51292A;
        if (gVar == null || gVar.mo38010b() != 3) {
            if (gVar == null || gVar.mo38010b() != 2) {
                if (!this.f51265z) {
                    return this.f51235A;
                }
                return C2240a.m6772a("%d%s %s", new Object[]{Integer.valueOf(i), this.f51236B, this.f51235A});
            } else if (!this.f51265z) {
                return this.f51235A;
            } else {
                String a = C2240a.m6772a("%d%s", new Object[]{Integer.valueOf(i), this.f51236B});
                if (this.f51251l.mo37985h()) {
                    return m45000a(a, 18, "丨", 13, "#66222222", this.f51235A, 16);
                }
                return m45000a(a, 18, "丨", 13, "#66F8F8F8", this.f51235A, 16);
            }
        } else if (this.f51251l.mo37996t()) {
            return m45000a(this.f51235A, 18, "丨", 14, "#4DFFFFFF", C2240a.m6772a("%02d%s", new Object[]{Integer.valueOf(i), this.f51236B}), 18);
        } else if (!this.f51251l.mo37998u()) {
            return this.f51235A;
        } else {
            if (i > ((int) (this.f51249j / 1000)) - this.f51251l.mo37999v()) {
                return m45000a("广告", 18, "丨", 14, "#4DFFFFFF", C2240a.m6772a("%02d%s", new Object[]{Integer.valueOf(i), this.f51236B}), 18);
            }
            return m45000a(this.f51235A, 18, "丨", 14, "#4DFFFFFF", C2240a.m6772a("%02d%s", new Object[]{Integer.valueOf(i), this.f51236B}), 18);
        }
    }

    private void setupSkipLayout(C18602b bVar) {
        this.f51237C = (int) (this.f51249j / 1000);
        C18648a aVar = this.f51264y;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51237C);
        aVar.setText(sb.toString());
        this.f51264y.setDuration(this.f51249j);
        C18614l lVar = bVar.f51293B;
        if (lVar == null || TextUtils.isEmpty(lVar.mo38016d())) {
            this.f51247h.setVisibility(8);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            int a = (int) C18752p.m45750a(getContext(), 16.0f);
            layoutParams.setMargins(0, (int) C18752p.m45750a(getContext(), 16.0f), a, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21, -1);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a);
            } else {
                layoutParams.addRule(11, -1);
            }
            this.f51242c.setLayoutParams(layoutParams);
            return;
        }
        this.f51247h.setVisibility(0);
        this.f51235A = lVar.mo38016d();
        this.f51265z = lVar.f51391b;
        this.f51236B = lVar.f51390a;
        this.f51262w.setText(m45002b(this.f51237C));
        if (!TextUtils.isEmpty(lVar.mo38017e())) {
            this.f51262w.setTextColor(C18744j.m45703a(lVar.mo38017e(), "#ffffff"));
            this.f51264y.setTextColor(C18744j.m45703a(lVar.mo38017e(), "#ffffff"));
        }
        if (!TextUtils.isEmpty(lVar.mo38015c())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            GradientDrawable a2 = m44999a(12);
            int a3 = C18744j.m45703a(lVar.mo38015c(), "#32222222");
            a2.setColor(a3);
            gradientDrawable.setColor(a3);
            if (VERSION.SDK_INT >= 16) {
                this.f51262w.setBackground(a2);
                this.f51264y.setBackground(gradientDrawable);
            } else {
                this.f51262w.setBackgroundDrawable(a2);
                this.f51264y.setBackgroundDrawable(gradientDrawable);
            }
        }
        setSkipClickListener(bVar);
    }

    /* renamed from: a */
    public final void mo37892a(Message message) {
        if (message.what == 1) {
            if (this.f51238D != null) {
                this.f51238D.cancel();
                this.f51238D = null;
            }
            this.f51252m.mo38078a();
            return;
        }
        if (message.what == 2) {
            int i = this.f51237C - 1;
            this.f51237C = i;
            new StringBuilder("splash count down. display seconds left: ").append(this.f51237C);
            if (i == 0) {
                if (this.f51238D != null) {
                    this.f51238D.cancel();
                    this.f51238D = null;
                }
                return;
            }
            if (this.f51262w.getVisibility() == 0 && this.f51265z) {
                this.f51262w.setText(m45002b(i));
            }
            if (this.f51264y.getVisibility() == 0) {
                C18648a aVar = this.f51264y;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                aVar.setText(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo37945b(C18602b bVar) {
        int i;
        C18602b bVar2 = bVar;
        if (bVar.mo37985h()) {
            ViewGroup.LayoutParams layoutParams = this.f51240a.getLayoutParams();
            layoutParams.height = C18744j.m45701a();
            this.f51240a.setLayoutParams(layoutParams);
            this.f51240a.setVisibility(4);
            this.f51241b.setVisibility(8);
        } else {
            this.f51240a.setVisibility(8);
            this.f51241b.setVisibility(0);
        }
        String b = C18744j.m45724b(bVar2.f51317a);
        if (C18747l.m45742a(b) || C18642g.m45252y() == null) {
            return false;
        }
        C18642g.m45252y().mo38374a(this.f51259t, b, bVar.mo38000w(), new C18759k() {
            /* renamed from: a */
            public final void mo37920a() {
                C18587c.this.f51252m.mo38078a();
            }
        });
        try {
            if (bVar.mo37865x() == 0 || bVar.mo37865x() == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar2.f51328b));
                String str = "not_real_time";
                if (bVar.mo37987i()) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (C18642g.m45194V() != -1) {
                    if (C18642g.m45194V() == 1) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jSONObject.put("awemelaunch", i);
                }
                jSONObject.put("ad_sequence", C18673u.m45399a().mo38172o());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", "1");
                if (!C18747l.m45742a(bVar.mo37864r())) {
                    jSONObject2.put("log_extra", bVar.mo37864r());
                }
                jSONObject2.put("ad_fetch_time", bVar.mo37862f());
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "show", jSONObject2);
                C18642g.m45180H().mo38042a(null, bVar.mo37863p(), bVar.mo38001z(), bVar.mo37864r(), true, -1, null);
            }
            this.f51259t.f51153a = bVar2;
            this.f51259t.setInteraction(this.f51252m);
            this.f51259t.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f51252m.mo38081b();
            return false;
        }
    }

    public C18587c(Context context) {
        super(context);
        if (C18642g.m45244q() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C18642g.m45244q()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f51255p = linearLayout;
        addView(linearLayout);
        this.f51256q = new ViewStub(context);
        this.f51256q.setLayoutParams(new LinearLayout.LayoutParams(-1, 27));
        this.f51256q.setLayoutResource(R.layout.aet);
        this.f51256q.setVisibility(8);
        this.f51255p.addView(this.f51256q);
        this.f51257r = new RelativeLayout(context);
        this.f51257r.setLayoutParams(new LayoutParams(-1, -1));
        this.f51240a = new Space(context);
        this.f51240a.setId(R.id.cqo);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f51240a.setLayoutParams(layoutParams);
        this.f51240a.setBackgroundColor(getResources().getColor(R.color.a5y));
        this.f51240a.setVisibility(4);
        this.f51258s = new FrameLayout(context);
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.f51240a.getId());
        this.f51258s.setLayoutParams(layoutParams2);
        this.f51259t = new BDASplashImageView(context);
        LayoutParams layoutParams3 = new LayoutParams(-1, -1);
        this.f51259t.setScaleType(ScaleType.FIT_XY);
        this.f51259t.setVisibility(8);
        this.f51259t.setLayoutParams(layoutParams3);
        this.f51243d = new BDASplashVideoView(context);
        this.f51243d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f51243d.setVisibility(8);
        this.f51244e = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) C18752p.m45750a(context, 60.0f));
        layoutParams4.gravity = 80;
        this.f51244e.setLayoutParams(layoutParams4);
        this.f51244e.setBackgroundColor(getResources().getColor(R.color.a5s));
        this.f51244e.setVisibility(8);
        this.f51260u = new RelativeLayout(context);
        LayoutParams layoutParams5 = new LayoutParams(-2, -2);
        layoutParams5.addRule(13, -1);
        this.f51260u.setLayoutParams(layoutParams5);
        this.f51245f = new TextView(context);
        LayoutParams layoutParams6 = new LayoutParams(-2, -2);
        layoutParams6.addRule(15, -1);
        this.f51245f.setEllipsize(TruncateAt.END);
        this.f51245f.setLines(1);
        this.f51245f.setMaxWidth((int) C18752p.m45750a(context, 200.0f));
        this.f51245f.setText(R.string.dlq);
        this.f51245f.setTextColor(getResources().getColor(R.color.a5y));
        this.f51245f.setTextSize(1, 20.0f);
        this.f51245f.setLayoutParams(layoutParams6);
        this.f51245f.setId(R.id.cqs);
        this.f51260u.addView(this.f51245f);
        this.f51261v = new ImageView(context);
        LayoutParams layoutParams7 = new LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        layoutParams7.addRule(1, this.f51245f.getId());
        layoutParams7.setMargins((int) C18752p.m45750a(context, 4.0f), 0, 0, 0);
        this.f51261v.setPadding(0, (int) C18752p.m45750a(context, 1.0f), 0, 0);
        this.f51261v.setImageDrawable(getResources().getDrawable(R.drawable.bbv));
        this.f51261v.setLayoutParams(layoutParams7);
        this.f51260u.addView(this.f51261v);
        this.f51244e.addView(this.f51260u);
        this.f51241b = new ImageView(context);
        LayoutParams layoutParams8 = new LayoutParams(-2, -2);
        if (VERSION.SDK_INT >= 17) {
            layoutParams8.addRule(20, -1);
        } else {
            layoutParams8.addRule(9, -1);
        }
        layoutParams8.addRule(10, -1);
        int a = (int) C18752p.m45750a(context, 14.0f);
        layoutParams8.setMargins(a, (int) C18752p.m45750a(context, 14.0f), 0, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart(a);
            layoutParams8.setMarginEnd(0);
        }
        this.f51241b.setVisibility(8);
        this.f51241b.setLayoutParams(layoutParams8);
        this.f51246g = new LinearLayout(context);
        LayoutParams layoutParams9 = new LayoutParams(-1, -2);
        this.f51246g.setOrientation(0);
        this.f51246g.setLayoutParams(layoutParams9);
        this.f51246g.setFitsSystemWindows(true);
        this.f51239E = new Space(context);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(0, 1);
        layoutParams10.weight = 1.0f;
        this.f51239E.setLayoutParams(layoutParams10);
        this.f51247h = new FrameLayout(context);
        LayoutParams layoutParams11 = new LayoutParams(-2, (int) C18752p.m45750a(context, 36.0f));
        if (VERSION.SDK_INT >= 17) {
            layoutParams11.addRule(21, -1);
        } else {
            layoutParams11.addRule(11, -1);
        }
        layoutParams11.addRule(10, -1);
        int a2 = (int) C18752p.m45750a(context, 16.0f);
        layoutParams11.setMargins(0, (int) C18752p.m45750a(context, 8.0f), a2, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams11.setMarginStart(0);
            layoutParams11.setMarginEnd(a2);
        }
        this.f51247h.setLayoutParams(layoutParams11);
        this.f51247h.setVisibility(8);
        this.f51247h.setId(R.id.cqu);
        this.f51262w = new TextView(context);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, (int) C18752p.m45750a(context, 24.0f));
        this.f51262w.setBackgroundResource(R.drawable.bbw);
        if (VERSION.SDK_INT >= 16) {
            this.f51262w.setPaddingRelative((int) C18752p.m45750a(context, 10.0f), 0, (int) C18752p.m45750a(context, 10.0f), 0);
        } else {
            this.f51262w.setPadding((int) C18752p.m45750a(context, 10.0f), 0, (int) C18752p.m45750a(context, 10.0f), 0);
        }
        layoutParams12.gravity = 17;
        this.f51262w.setGravity(17);
        this.f51262w.setTextSize(1, 12.0f);
        this.f51262w.setLayoutParams(layoutParams12);
        this.f51247h.addView(this.f51262w);
        this.f51242c = new TextView(context);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        int a3 = (int) C18752p.m45750a(context, 9.0f);
        layoutParams13.setMargins(0, (int) C18752p.m45750a(context, 16.0f), a3, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart(0);
            layoutParams13.setMarginEnd(a3);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f51242c.setPaddingRelative(3, 3, 3, 3);
        } else {
            this.f51242c.setPadding(3, 3, 3, 3);
        }
        this.f51242c.setTextColor(Color.parseColor("#ffffff"));
        this.f51242c.setShadowLayer(12.0f, 0.0f, 0.0f, Color.parseColor("#7f000000"));
        this.f51242c.setTextSize(1, 12.0f);
        this.f51242c.setVisibility(8);
        this.f51242c.setLayoutParams(layoutParams13);
        this.f51264y = new C18648a(context);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams((int) C18752p.m45750a(context, 40.0f), (int) C18752p.m45750a(context, 40.0f));
        int a4 = (int) C18752p.m45750a(context, 44.0f);
        layoutParams14.setMargins(0, (int) C18752p.m45750a(context, 30.0f), a4, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginStart(0);
            layoutParams14.setMarginEnd(a4);
        }
        this.f51264y.setLayoutParams(layoutParams14);
        this.f51264y.setGravity(17);
        this.f51264y.setTextSize(1, 18.0f);
        this.f51264y.setVisibility(8);
        this.f51263x = new TextView(context);
        if (VERSION.SDK_INT >= 16) {
            this.f51263x.setPaddingRelative((int) C18752p.m45750a(context, 4.0f), (int) C18752p.m45750a(context, 2.0f), (int) C18752p.m45750a(context, 4.0f), (int) C18752p.m45750a(context, 2.0f));
        } else {
            this.f51263x.setPadding((int) C18752p.m45750a(context, 4.0f), (int) C18752p.m45750a(context, 2.0f), (int) C18752p.m45750a(context, 4.0f), (int) C18752p.m45750a(context, 2.0f));
        }
        this.f51263x.setTextSize(1, 10.0f);
        this.f51263x.setVisibility(8);
        this.f51255p.addView(this.f51257r);
        this.f51258s.addView(this.f51259t);
        this.f51258s.addView(this.f51243d);
        this.f51258s.addView(this.f51244e);
        this.f51257r.addView(this.f51258s);
        this.f51257r.addView(this.f51240a);
        this.f51246g.addView(this.f51241b);
        this.f51246g.addView(this.f51239E);
        this.f51257r.addView(this.f51246g);
        if (C18642g.m45243p() != 0) {
            this.f51241b.setImageResource(C18642g.m45243p());
        }
        if (C18642g.m45239l() != 0) {
            this.f51242c.setText(C18642g.m45239l());
        } else {
            this.f51242c.setText(R.string.dm8);
        }
        if (C18642g.m45241n() != 0) {
            this.f51262w.setText(C18642g.m45241n());
        } else {
            this.f51262w.setText(R.string.dlt);
        }
        if (C18642g.m45240m() != 0) {
            this.f51262w.setBackgroundResource(C18642g.m45240m());
        }
        if (C18642g.m45190R() == 1) {
            this.f51259t.setScaleType(ScaleType.CENTER_CROP);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* access modifiers changed from: 0000 */
    public void setupUIWidgets(C18602b bVar) {
        int i;
        C18602b bVar2 = bVar;
        setupSkipLayout(bVar);
        setupWifiPreloadHindLayout(bVar);
        setupAdLabelLayout(bVar);
        C18609g gVar = bVar2.f51292A;
        if (gVar != null) {
            StringBuilder sb = new StringBuilder("开屏新样式，position: ");
            sb.append(gVar.mo38010b());
            C18735a.m45667b(sb.toString());
            C18752p.m45752a((View) this.f51242c);
            C18752p.m45752a((View) this.f51263x);
            C18752p.m45752a((View) this.f51247h);
            switch (gVar.mo38010b()) {
                case 1:
                    C18752p.m45754a((View) this.f51242c, (ViewGroup) this.f51246g);
                    C18752p.m45754a((View) this.f51247h, (ViewGroup) this.f51246g);
                    this.f51263x.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    if (bVar2.f51335i == 3 && this.f51244e.getVisibility() == 0) {
                        i = this.f51244e.getLayoutParams().height;
                    } else {
                        i = 0;
                    }
                    int a = (int) C18752p.m45750a(getContext(), 16.0f);
                    layoutParams.setMargins(0, 0, a, ((int) C18752p.m45750a(getContext(), 20.0f)) + i);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart(0);
                        layoutParams.setMarginEnd(a);
                    }
                    this.f51263x.setLayoutParams(layoutParams);
                    C18752p.m45754a((View) this.f51263x, (ViewGroup) this.f51258s);
                    break;
                case 2:
                    if (this.f51242c.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) C18752p.m45750a(getContext(), 18.0f));
                        int a2 = (int) C18752p.m45750a(getContext(), 9.0f);
                        layoutParams2.setMargins(0, 0, a2, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams2.setMarginStart(0);
                            layoutParams2.setMarginEnd(a2);
                        }
                        this.f51242c.setLayoutParams(layoutParams2);
                        this.f51242c.setTextSize(1, 12.0f);
                        GradientDrawable a3 = m44999a(2);
                        a3.setColor(Color.parseColor("#1A000000"));
                        if (VERSION.SDK_INT >= 16) {
                            this.f51242c.setBackground(a3);
                            this.f51242c.setPaddingRelative((int) C18752p.m45750a(getContext(), 4.0f), 0, (int) C18752p.m45750a(getContext(), 4.0f), 0);
                        } else {
                            this.f51242c.setBackgroundDrawable(a3);
                            this.f51242c.setPadding((int) C18752p.m45750a(getContext(), 4.0f), 0, (int) C18752p.m45750a(getContext(), 4.0f), 0);
                        }
                        C18752p.m45754a((View) this.f51242c, (ViewGroup) this.f51246g);
                    }
                    if (!TextUtils.isEmpty(this.f51263x.getText())) {
                        this.f51263x.setVisibility(0);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) C18752p.m45750a(getContext(), 18.0f));
                        int a4 = (int) C18752p.m45750a(getContext(), 16.0f);
                        layoutParams3.setMargins(0, 0, a4, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams3.setMarginStart(0);
                            layoutParams3.setMarginEnd(a4);
                        }
                        this.f51263x.setLayoutParams(layoutParams3);
                        this.f51263x.setTextSize(1, 12.0f);
                        if (VERSION.SDK_INT >= 16) {
                            this.f51263x.setPaddingRelative((int) C18752p.m45750a(getContext(), 4.0f), 0, (int) C18752p.m45750a(getContext(), 4.0f), 0);
                        } else {
                            this.f51263x.setPadding((int) C18752p.m45750a(getContext(), 4.0f), 0, (int) C18752p.m45750a(getContext(), 4.0f), 0);
                        }
                        C18752p.m45754a((View) this.f51263x, (ViewGroup) this.f51246g);
                    }
                    if (this.f51247h.getVisibility() == 0) {
                        if (!bVar2.f51295D) {
                            this.f51262w.setTextSize(1, 16.0f);
                        }
                        C18752p.m45754a((View) this.f51247h, (ViewGroup) this.f51257r);
                        int g = C18744j.m45736g();
                        LayoutParams layoutParams4 = new LayoutParams(-2, (int) C18752p.m45750a(getContext(), 30.0f));
                        layoutParams4.addRule(12, -1);
                        int a5 = (int) C18752p.m45750a(getContext(), 15.0f);
                        if (bVar.mo37985h()) {
                            if (C18642g.m45227e() != null && "13".equals(C18642g.m45227e().mo38025a())) {
                                g += (int) C18752p.m45750a(getContext(), 5.5f);
                            }
                            layoutParams4.setMargins(0, 0, a5, g);
                        } else {
                            layoutParams4.setMargins(0, 0, a5, (int) C18752p.m45750a(getContext(), 35.0f));
                        }
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams4.addRule(21, -1);
                            layoutParams4.setMarginStart(0);
                            layoutParams4.setMarginEnd(a5);
                        } else {
                            layoutParams4.addRule(11, -1);
                        }
                        this.f51247h.setLayoutParams(layoutParams4);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
                        this.f51262w.setMinimumWidth((int) C18752p.m45750a(getContext(), 64.0f));
                        this.f51262w.setLayoutParams(layoutParams5);
                        C18614l lVar = bVar2.f51293B;
                        if (lVar != null && !TextUtils.isEmpty(lVar.mo38015c())) {
                            GradientDrawable a6 = m44999a(16);
                            a6.setColor(C18744j.m45703a(lVar.mo38015c(), "#32222222"));
                            if (bVar.mo37985h()) {
                                a6.setStroke((int) C18752p.m45750a(getContext(), 0.5f), Color.parseColor("#66222222"));
                            } else {
                                a6.setStroke((int) C18752p.m45750a(getContext(), 0.5f), Color.parseColor("#99FAFAFA"));
                            }
                            if (VERSION.SDK_INT >= 16) {
                                this.f51262w.setBackground(a6);
                            } else {
                                this.f51262w.setBackgroundDrawable(a6);
                            }
                        }
                    }
                    if (this.f51241b.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                        int a7 = (int) C18752p.m45750a(getContext(), 14.0f);
                        layoutParams6.setMargins(a7, 0, 0, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams6.setMarginStart(a7);
                            layoutParams6.setMarginEnd(0);
                        }
                        this.f51241b.setLayoutParams(layoutParams6);
                    }
                    if (this.f51246g != null) {
                        LayoutParams layoutParams7 = new LayoutParams(-1, -2);
                        layoutParams7.setMargins(0, (int) C18752p.m45750a(getContext(), 35.0f), 0, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams7.setMarginStart(0);
                            layoutParams7.setMarginEnd(0);
                        }
                        this.f51246g.setOrientation(0);
                        this.f51246g.setLayoutParams(layoutParams7);
                        break;
                    }
                    break;
                case 3:
                    StringBuilder sb2 = new StringBuilder("西瓜 TV 样式，是否可点击: ");
                    sb2.append(bVar.mo37996t());
                    sb2.append(", 是否可跳过: ");
                    sb2.append(bVar.mo37998u());
                    C18735a.m45667b(sb2.toString());
                    if (bVar.mo37996t() || bVar.mo37998u()) {
                        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) C18752p.m45750a(getContext(), 40.0f));
                        int a8 = (int) C18752p.m45750a(getContext(), 44.0f);
                        layoutParams8.setMargins(0, (int) C18752p.m45750a(getContext(), 30.0f), a8, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams8.setMarginStart(0);
                            layoutParams8.setMarginEnd(a8);
                        }
                        this.f51247h.setLayoutParams(layoutParams8);
                        this.f51262w.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        GradientDrawable a9 = m44999a(20);
                        C18614l lVar2 = bVar2.f51293B;
                        if (lVar2 == null || TextUtils.isEmpty(lVar2.mo38015c())) {
                            a9.setAlpha(153);
                            a9.setColor(-16777216);
                        } else {
                            a9.setColor(C18744j.m45703a(lVar2.mo38015c(), "#32222222"));
                        }
                        int a10 = (int) C18752p.m45750a(getContext(), 14.0f);
                        int a11 = (int) C18752p.m45750a(getContext(), 8.0f);
                        int a12 = (int) C18752p.m45750a(getContext(), 14.0f);
                        int a13 = (int) C18752p.m45750a(getContext(), 7.0f);
                        if (VERSION.SDK_INT >= 16) {
                            this.f51262w.setPaddingRelative(a10, a11, a12, a13);
                            this.f51262w.setBackground(a9);
                        } else {
                            this.f51262w.setPadding(a10, a11, a12, a13);
                            this.f51262w.setBackgroundDrawable(a9);
                        }
                        this.f51262w.setTextSize(1, 18.0f);
                        C18752p.m45754a((View) this.f51247h, (ViewGroup) this.f51246g);
                    } else {
                        this.f51264y.setVisibility(0);
                        C18752p.m45754a((View) this.f51264y, (ViewGroup) this.f51246g);
                    }
                    if (!TextUtils.isEmpty(gVar.mo38012d()) && (bVar.mo37996t() || !bVar.mo37998u())) {
                        this.f51263x.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) C18752p.m45750a(getContext(), 40.0f), (int) C18752p.m45750a(getContext(), 22.0f));
                        layoutParams9.gravity = 8388691;
                        int a14 = (int) C18752p.m45750a(getContext(), 8.0f);
                        layoutParams9.setMargins(a14, 0, 0, (int) C18752p.m45750a(getContext(), 8.0f));
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams9.setMarginStart(a14);
                            layoutParams9.setMarginEnd(0);
                        }
                        this.f51263x.setGravity(17);
                        GradientDrawable a15 = m44999a(4);
                        if (!TextUtils.isEmpty(gVar.mo38009a())) {
                            a15.setColor(C18744j.m45703a(gVar.mo38009a(), "#32222222"));
                        } else {
                            a15.setColor(-16777216);
                            a15.setAlpha(153);
                        }
                        if (VERSION.SDK_INT >= 16) {
                            this.f51263x.setBackground(a15);
                        } else {
                            this.f51263x.setBackgroundDrawable(a15);
                        }
                        if (!TextUtils.isEmpty(gVar.mo38011c())) {
                            this.f51263x.setTextColor(C18744j.m45703a(gVar.mo38011c(), "#ffffff"));
                        } else {
                            this.f51263x.setTextColor(-1);
                        }
                        this.f51263x.setTextSize(1, 12.0f);
                        this.f51263x.setText(gVar.mo38012d());
                        this.f51263x.setLayoutParams(layoutParams9);
                        C18752p.m45754a((View) this.f51263x, (ViewGroup) this.f51258s);
                        break;
                    }
                    break;
                default:
                    C18752p.m45754a((View) this.f51242c, (ViewGroup) this.f51246g);
                    C18752p.m45754a((View) this.f51247h, (ViewGroup) this.f51246g);
                    if (gVar.mo38010b() != 0) {
                        this.f51263x.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
        setupSkipButtonHitArea(bVar);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i != 66) {
                switch (i) {
                    case 23:
                        break;
                    case 24:
                        C18712d.m45601a().mo38326c();
                        break;
                    case 25:
                        C18712d.m45601a().mo38326c();
                        break;
                }
            }
            if (this.f51251l.mo37996t()) {
                switch (this.f51251l.mo37865x()) {
                    case 0:
                    case 1:
                    case 4:
                        mo37943a(this.f51251l, 0.0f, 0.0f);
                        break;
                    case 2:
                    case 3:
                        mo37944a(this.f51251l, 0.0f, 0.0f, true);
                        break;
                }
            }
        } else if (this.f51251l.mo37998u() && ((long) this.f51237C) * 1000 <= this.f51249j - (((long) this.f51251l.mo37999v()) * 1000)) {
            mo37947c();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public final void mo37943a(C18602b bVar, float f, float f2) {
        String str;
        C18735a.m45661a(bVar.mo37863p(), "点击了广告");
        if (this.f51248i) {
            str = "click_normal_area";
        } else {
            str = "";
        }
        this.f51252m.mo38080a(bVar, new C18604a().mo38002a(0).mo38003a((int) f, (int) f2).mo38007b(this.f51248i).mo38004a(str).mo38006a());
    }

    /* renamed from: a */
    public final void mo37944a(C18602b bVar, float f, float f2, boolean z) {
        C18735a.m45661a(bVar.mo37863p(), "点击了广告");
        boolean b = this.f51252m.mo38083b(bVar, new C18604a().mo38005a(z).mo38003a((int) f, (int) f2).mo38006a());
        if (this.f51254o != null && b) {
            this.f51250k = 1;
            this.f51254o.mo38303c();
        }
    }

    /* renamed from: a */
    private SpannableString m45000a(String str, int i, String str2, int i2, String str3, String str4, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str4);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i3, true), str.length() + str2.length(), spannableString.length(), 33);
        int max = Math.max(18, Math.max(i2, i3));
        spannableString.setSpan(new C18650b((int) C18752p.m45750a(getContext(), (float) ((-Math.abs(max - 18)) / 2))), 0, str.length(), 33);
        spannableString.setSpan(new C18650b((int) C18752p.m45750a(getContext(), (float) ((-Math.abs(max - i2)) / 2))), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new C18650b((int) C18752p.m45750a(getContext(), (float) ((-Math.abs(max - i3)) / 2))), str.length() + str2.length(), spannableString.length(), 33);
        return spannableString;
    }
}
