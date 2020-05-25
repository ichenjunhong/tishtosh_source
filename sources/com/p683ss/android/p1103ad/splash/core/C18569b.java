package com.p683ss.android.p1103ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1103ad.splash.C18759k;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18603c.C18604a;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18617n;
import com.p683ss.android.p1103ad.splash.core.video.C18687b.C18688a;
import com.p683ss.android.p1103ad.splash.core.video.C18689c;
import com.p683ss.android.p1103ad.splash.core.video.C18699e;
import com.p683ss.android.p1103ad.splash.core.video.C18699e.C18701a;
import com.p683ss.android.p1103ad.splash.core.video.C18702f;
import com.p683ss.android.p1103ad.splash.core.video2.BDASplashVideoView;
import com.p683ss.android.p1103ad.splash.core.video2.C18708a;
import com.p683ss.android.p1103ad.splash.core.video2.C18710b;
import com.p683ss.android.p1103ad.splash.core.video2.C18711c;
import com.p683ss.android.p1103ad.splash.core.video2.C18712d;
import com.p683ss.android.p1103ad.splash.core.video2.C18715e;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
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

/* renamed from: com.ss.android.ad.splash.core.b */
public final class C18569b extends RelativeLayout implements C18651h, C18755a {

    /* renamed from: A */
    boolean f51167A = false;

    /* renamed from: B */
    private long f51168B = 0;

    /* renamed from: C */
    private Space f51169C;

    /* renamed from: D */
    private TextView f51170D;

    /* renamed from: E */
    private Timer f51171E;

    /* renamed from: a */
    public C18602b f51172a;

    /* renamed from: b */
    public BDASplashImageView f51173b;

    /* renamed from: c */
    ImageView f51174c;

    /* renamed from: d */
    Space f51175d;

    /* renamed from: e */
    ViewGroup f51176e;

    /* renamed from: f */
    TextView f51177f;

    /* renamed from: g */
    ImageView f51178g;

    /* renamed from: h */
    RotateAnimation f51179h;

    /* renamed from: i */
    ViewGroup f51180i;

    /* renamed from: j */
    FrameLayout f51181j;

    /* renamed from: k */
    TextView f51182k;

    /* renamed from: l */
    public View f51183l;

    /* renamed from: m */
    TextView f51184m;

    /* renamed from: n */
    public C18702f f51185n;

    /* renamed from: o */
    public C18659o f51186o;

    /* renamed from: p */
    public C18754r f51187p = new C18754r(this);

    /* renamed from: q */
    boolean f51188q = false;

    /* renamed from: r */
    long f51189r = 0;

    /* renamed from: s */
    public boolean f51190s = false;

    /* renamed from: t */
    FrameLayout f51191t;

    /* renamed from: u */
    TextView f51192u;

    /* renamed from: v */
    TextView f51193v;

    /* renamed from: w */
    BDASplashVideoView f51194w;

    /* renamed from: x */
    public C18715e f51195x;

    /* renamed from: y */
    public int f51196y = -1;

    /* renamed from: z */
    int f51197z = -1;

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo37891a() {
        C18658n.m45272a().f51568a = System.currentTimeMillis();
        this.f51186o.mo38084c();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m44953e();
        C18642g.m45181I().mo38040c();
    }

    /* renamed from: f */
    private void m44954f() {
        if (this.f51173b != null && C18642g.m45190R() == 1) {
            this.f51173b.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: b */
    public final void mo37895b() {
        if (this.f51185n != null) {
            C18702f fVar = this.f51185n;
            if (fVar.f51723d != null) {
                C18689c cVar = fVar.f51723d;
                if (cVar.f51646a != null) {
                    cVar.f51646a.mo38203a(0.0f, 0.0f);
                }
            }
        }
        if (this.f51195x != null && this.f51195x.mo38304d()) {
            this.f51195x.mo38300a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                C18569b.this.getViewTreeObserver().removeOnPreDrawListener(this);
                C18569b bVar = C18569b.this;
                if (bVar.f51188q) {
                    bVar.f51187p.removeMessages(1);
                    bVar.f51187p.sendEmptyMessageDelayed(1, bVar.f51189r);
                    bVar.mo37891a();
                }
                C18569b.this.f51186o.mo38082b(C18569b.this.f51172a);
                return true;
            }
        });
        if (this.f51167A && this.f51171E == null) {
            this.f51171E = new Timer();
            this.f51171E.scheduleAtFixedRate(new TimerTask() {
                public final void run() {
                    Message obtainMessage = C18569b.this.f51187p.obtainMessage();
                    obtainMessage.what = 2;
                    C18569b.this.f51187p.sendMessage(obtainMessage);
                }
            }, (this.f51189r % 1000) + 1000, 1000);
        }
    }

    /* renamed from: d */
    private void m44952d() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int a = (int) C18752p.m45750a(getContext(), 9.0f);
        layoutParams.setMargins(0, (int) C18752p.m45750a(getContext(), 14.0f), a, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams.addRule(21);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(a);
        } else {
            layoutParams.addRule(11);
        }
        this.f51182k.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private void m44953e() {
        if (this.f51185n != null) {
            this.f51185n.mo38269c();
            this.f51185n = null;
        }
        if (this.f51179h != null) {
            this.f51179h.cancel();
            this.f51179h = null;
        }
        if (this.f51173b != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.f51173b.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f51173b.setImageBitmap(null);
                }
            } catch (Exception unused) {
            }
        }
        C18712d.m45601a().mo38325b();
        if (this.f51195x != null) {
            this.f51195x.mo38307g();
            this.f51195x = null;
            this.f51194w = null;
        }
        if (this.f51171E != null) {
            this.f51171E.cancel();
            this.f51171E = null;
        }
    }

    /* renamed from: c */
    private void m44951c() {
        if (C18752p.m45757c(getContext())) {
            findViewById(R.id.cqn).setVisibility(0);
        }
        try {
            this.f51173b = (BDASplashImageView) findViewById(R.id.cqy);
            try {
                this.f51194w = (BDASplashVideoView) findViewById(R.id.cqx);
                this.f51175d = (Space) findViewById(R.id.j_);
                this.f51182k = (TextView) findViewById(R.id.cq);
                this.f51183l = findViewById(R.id.cqr);
                this.f51184m = (TextView) findViewById(R.id.cqt);
                this.f51176e = (ViewGroup) findViewById(R.id.bz);
                this.f51177f = (TextView) findViewById(R.id.co);
                this.f51174c = (ImageView) findViewById(R.id.ct);
                this.f51191t = (FrameLayout) findViewById(R.id.b2);
                this.f51192u = (TextView) findViewById(R.id.b3);
                this.f51169C = (Space) findViewById(R.id.b1);
                this.f51193v = (TextView) findViewById(R.id.b5);
                this.f51170D = (TextView) findViewById(R.id.b4);
                if (C18642g.m45243p() != 0) {
                    this.f51174c.setImageResource(C18642g.m45243p());
                }
                if (C18642g.m45239l() != 0) {
                    this.f51182k.setText(C18642g.m45239l());
                    this.f51193v.setText(C18642g.m45239l());
                } else {
                    this.f51182k.setText(R.string.dm8);
                    this.f51193v.setText(R.string.dm8);
                }
                if (C18642g.m45241n() != 0) {
                    this.f51177f.setText(C18642g.m45241n());
                } else {
                    this.f51177f.setText(R.string.dlt);
                }
                if (C18642g.m45240m() != 0) {
                    this.f51177f.setBackgroundResource(C18642g.m45240m());
                    this.f51192u.setBackgroundResource(C18642g.m45240m());
                }
                this.f51178g = (ImageView) findViewById(R.id.cn);
                if (C18642g.m45242o() != 0) {
                    this.f51178g.setImageResource(C18642g.m45242o());
                } else {
                    this.f51178g.setImageResource(R.drawable.bbx);
                }
                this.f51180i = (ViewGroup) findViewById(R.id.cqw);
                this.f51181j = (FrameLayout) findViewById(R.id.cqv);
                m44954f();
            } catch (ClassCastException e) {
                StringBuilder sb = new StringBuilder("curClassLoader: ");
                sb.append(BDASplashImageView.class.getClassLoader());
                sb.append("; objClassLoader:");
                sb.append(findViewById(R.id.cqx).getClass().getClassLoader());
                throw new RuntimeException(sb.toString(), e);
            }
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder("curClassLoader: ");
            sb2.append(BDASplashImageView.class.getClassLoader());
            sb2.append("; objClassLoader:");
            sb2.append(findViewById(R.id.cqy).getClass().getClassLoader());
            throw new RuntimeException(sb2.toString(), e2);
        }
    }

    public final void setSplashAdInteraction(C18659o oVar) {
        this.f51186o = oVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C18710b mo37897c(final C18602b bVar) {
        return new C18711c() {
            /* renamed from: b */
            public final void mo37924b() {
                C18569b.this.f51186o.mo38081b();
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
                    C18642g.m45180H().mo38044c(C18569b.this.f51173b, bVar.mo37863p(), bVar.f51339m.f51402a, bVar.mo37864r(), true, -1, null);
                }
                C18642g.m45181I().mo38034a((long) C18569b.this.f51195x.mo38306f(), C18569b.this.f51195x.mo38296a(), C18569b.this.f51195x.mo38302b());
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
                    C18642g.m45180H().mo38045d(C18569b.this.f51173b, bVar.mo37863p(), bVar.f51339m.f51403b, bVar.mo37864r(), true, -1, null);
                }
                C18642g.m45181I().mo38033a();
                C18569b.this.f51186o.mo38078a();
            }

            /* renamed from: b */
            public final void mo37925b(int i, int i2) {
                C18642g.m45181I().mo38035a((long) i, (long) i2);
                m44968a(i, i2, "first_quartile");
            }

            /* renamed from: c */
            public final void mo37926c(int i, int i2) {
                C18642g.m45181I().mo38039b((long) i, (long) i2);
                m44968a(i, i2, "midpoint");
            }

            /* renamed from: d */
            public final void mo37927d(int i, int i2) {
                C18642g.m45181I().mo38041c((long) i, (long) i2);
                m44968a(i, i2, "third_quartile");
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
                    jSONObject.put("break_reason", C18569b.this.f51196y);
                    if (!C18747l.m45742a(bVar.mo37864r())) {
                        jSONObject.put("log_extra", bVar.mo37864r());
                    }
                    jSONObject2.put("break_reason", C18569b.this.f51196y);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "play_break", jSONObject);
                C18642g.m45181I().mo38038b();
            }

            /* renamed from: a */
            private void m44968a(int i, int i2, String str) {
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

    /* access modifiers changed from: 0000 */
    public void setImageTouchListener(final C18602b bVar) {
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((C18569b.this.getTouchDelegate() == null || !C18569b.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (C18569b.this.f51190s) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    C18569b.this.f51186o.mo38080a(bVar, new C18604a().mo38002a(0).mo38003a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo38007b(C18569b.this.f51190s).mo38004a(str).mo38006a());
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void setSplashAdListener(final C18602b bVar) {
        this.f51185n.f51724e = new C18688a() {
            /* renamed from: a */
            public final void mo37913a() {
                C18569b.this.f51186o.mo38078a();
            }

            /* renamed from: b */
            public final void mo37916b(long j, int i) {
                C18569b.this.f51186o.mo38081b();
            }

            /* renamed from: c */
            public final void mo37917c(long j, int i) {
                C18569b.this.f51186o.mo38079a(bVar);
            }

            /* renamed from: a */
            public final void mo37914a(long j, int i) {
                new StringBuilder("Video play Complete ").append(j);
                C18569b.this.f51186o.mo38078a();
            }

            /* renamed from: a */
            public final void mo37915a(long j, int i, int i2, int i3) {
                C18569b.this.f51186o.mo38083b(bVar, new C18604a().mo38005a(true).mo38003a(i2, i3).mo38006a());
            }
        };
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m44953e();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setSkipClickListener(final C18602b bVar) {
        this.f51191t.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C18569b.this.f51185n != null) {
                    C18569b.this.f51185n.mo38268b();
                }
                if (C18569b.this.f51195x != null) {
                    C18569b.this.f51196y = 2;
                    C18569b.this.f51195x.mo38303c();
                }
                C18569b.this.f51186o.mo38079a(bVar);
            }
        });
        this.f51176e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C18569b.this.f51185n != null) {
                    C18569b.this.f51185n.mo38268b();
                }
                if (C18569b.this.f51195x != null) {
                    C18569b.this.f51196y = 2;
                    C18569b.this.f51195x.mo38303c();
                }
                if (C18642g.f51520p) {
                    C18569b bVar = C18569b.this;
                    bVar.f51177f.setVisibility(4);
                    bVar.f51178g.setVisibility(0);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    bVar.f51179h = rotateAnimation;
                    bVar.f51179h.setDuration(800);
                    bVar.f51179h.setRepeatCount(-1);
                    bVar.f51179h.setRepeatMode(1);
                    bVar.f51179h.setInterpolator(new LinearInterpolator());
                    bVar.f51178g.startAnimation(bVar.f51179h);
                }
                C18569b.this.f51186o.mo38079a(bVar);
            }
        });
    }

    public C18569b(Context context) {
        super(context);
        inflate(getContext(), R.layout.aev, this);
        if (C18642g.m45244q() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C18642g.m45244q()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        m44951c();
    }

    /* renamed from: a */
    static String m44950a(int i) {
        if (i < 0) {
            i = 0;
        }
        if (C18642g.m45241n() != 0) {
            return C2240a.m6772a("%ds %s", new Object[]{Integer.valueOf(i), C18642g.m45184L().getResources().getString(C18642g.m45241n())});
        }
        return C2240a.m6772a("%ds %s", new Object[]{Integer.valueOf(i), C18642g.m45184L().getResources().getString(R.string.dlt)});
    }

    /* access modifiers changed from: 0000 */
    public void setSkipAndWifiPreloadLayout(C18602b bVar) {
        if (bVar.mo37969E()) {
            if (bVar.f51336j == 1) {
                this.f51191t.setVisibility(0);
            } else {
                this.f51191t.setVisibility(8);
            }
            if (C18642g.m45221b()) {
                this.f51193v.setVisibility(0);
            }
            this.f51170D.setVisibility(0);
            mo37893a(bVar.mo37969E(), bVar.mo37985h());
            return;
        }
        if (bVar.f51336j == 1) {
            this.f51176e.setVisibility(0);
        } else {
            this.f51176e.setVisibility(8);
            m44952d();
        }
        if (C18642g.m45221b()) {
            this.f51182k.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setSplashInfoStyle(C18602b bVar) {
        if (!bVar.mo37969E()) {
            if (bVar.mo37985h() || C18642g.m45233h() != 1) {
                if (!(bVar == null || bVar.f51336j == 1)) {
                    m44952d();
                }
                return;
            }
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(12);
            int a = (int) C18752p.m45750a(getContext(), 10.0f);
            layoutParams.setMargins(0, 0, a, (int) C18752p.m45750a(getContext(), 10.0f));
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a);
            } else {
                layoutParams.addRule(11);
            }
            this.f51176e.setLayoutParams(layoutParams);
            m44952d();
        }
    }

    /* renamed from: a */
    public final void mo37892a(Message message) {
        if (message.what == 1) {
            if (this.f51171E != null) {
                this.f51171E.cancel();
                this.f51171E = null;
            }
            this.f51186o.mo38078a();
            return;
        }
        if (message.what == 2) {
            int i = this.f51197z - 1;
            this.f51197z = i;
            new StringBuilder("splash count down. display seconds left: ").append(i);
            if (i == 0) {
                if (this.f51171E != null) {
                    this.f51171E.cancel();
                    this.f51171E = null;
                }
                return;
            }
            String a = m44950a(i);
            this.f51177f.setText(a);
            this.f51192u.setText(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo37896b(C18602b bVar) {
        int i;
        C18602b bVar2 = bVar;
        try {
            boolean h = bVar.mo37985h();
            mo37893a(bVar.mo37969E(), h);
            if (h) {
                ViewGroup.LayoutParams layoutParams = this.f51175d.getLayoutParams();
                layoutParams.height = C18744j.m45701a();
                this.f51175d.setLayoutParams(layoutParams);
                this.f51175d.setVisibility(4);
                this.f51174c.setVisibility(8);
            } else {
                this.f51175d.setVisibility(8);
                this.f51174c.setVisibility(0);
            }
            if (C18642g.m45221b() && bVar.mo38000w() == 1) {
                if (bVar.mo37969E()) {
                    this.f51193v.setVisibility(0);
                } else {
                    this.f51182k.setVisibility(0);
                }
            }
            String b = C18744j.m45724b(bVar2.f51317a);
            if (C18747l.m45742a(b) || C18642g.m45252y() == null) {
                return false;
            }
            C18642g.m45252y().mo38374a(this.f51173b, b, bVar.mo38000w(), new C18759k() {
                /* renamed from: a */
                public final void mo37920a() {
                    C18569b.this.f51186o.mo38078a();
                }
            });
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
                C18642g.m45180H().mo38042a(this.f51173b, bVar.mo37863p(), bVar.mo38001z(), bVar.mo37864r(), true, -1, null);
            }
            this.f51173b.f51153a = bVar2;
            this.f51173b.setInteraction(this.f51186o);
            this.f51173b.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f51186o.mo38081b();
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo37894a(final C18602b bVar) {
        boolean z = false;
        if (bVar.f51339m == null || bVar.f51317a == null) {
            return false;
        }
        JSONObject jSONObject = null;
        if (C18642g.m45196X()) {
            this.f51194w.setVisibility(0);
            int i = getResources().getDisplayMetrics().heightPixels;
            if (bVar.mo37985h()) {
                i -= C18744j.m45701a();
                this.f51174c.setVisibility(8);
            } else {
                this.f51174c.setVisibility(0);
            }
            C18617n nVar = bVar.f51339m;
            int i2 = bVar.f51317a.f51374c;
            int i3 = nVar.f51408g;
            if (i2 == 0 || i3 == 0) {
                return false;
            }
            boolean b = mo37896b(bVar);
            int i4 = (int) (((float) i3) * (((float) i) / ((float) i2)));
            this.f51195x = new C18708a(this.f51194w);
            this.f51195x.mo38299a(mo37897c(bVar));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i5 = (i - i4) / 2;
            layoutParams.topMargin = i5;
            layoutParams.bottomMargin = i5;
            this.f51194w.setSurfaceLayoutParams(layoutParams);
            String b2 = C18744j.m45725b(nVar);
            if (C18747l.m45742a(b2)) {
                return false;
            }
            if (this.f51195x.mo38301a(b2) && b) {
                z = true;
            }
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = C18569b.this.f51186o.mo38083b(bVar, new C18604a().mo38005a(false).mo38003a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo38006a());
                        if (C18569b.this.f51195x != null && b) {
                            C18569b.this.f51196y = 1;
                            C18569b.this.f51195x.mo38303c();
                        }
                    }
                    return true;
                }
            });
            this.f51194w.setTextureViewOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = C18569b.this.f51186o.mo38083b(bVar, new C18604a().mo38005a(true).mo38003a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo38006a());
                        if (C18569b.this.f51195x != null && b) {
                            C18569b.this.f51196y = 1;
                            C18569b.this.f51195x.mo38303c();
                        }
                    }
                    return true;
                }
            });
            if (z) {
                C18712d.m45601a().mo38323a(bVar, C18642g.m45184L());
                C18712d.m45601a().mo38324a(this.f51195x, bVar.mo37972H(), bVar.mo37979c());
                mo37891a();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str = "not_real_time";
                try {
                    if (bVar.mo37987i()) {
                        str = "real_time";
                    }
                    jSONObject2.putOpt("show_type", str);
                    jSONObject2.putOpt("show_expected", Integer.valueOf(bVar.f51328b));
                    jSONObject3.putOpt("ad_extra_data", jSONObject2);
                    jSONObject3.putOpt("is_ad_event", "1");
                    jSONObject3.putOpt("log_extra", bVar.mo37864r());
                    jSONObject3.putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
                    jSONObject = jSONObject3;
                } catch (JSONException unused) {
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "banner_show", jSONObject);
            }
            return z;
        }
        this.f51180i.setVisibility(0);
        LayoutParams layoutParams2 = (LayoutParams) this.f51180i.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f51180i.setLayoutParams(layoutParams2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i6 = displayMetrics.heightPixels;
        if (bVar.mo37985h()) {
            i6 -= C18744j.m45701a();
            this.f51174c.setVisibility(8);
        } else {
            this.f51174c.setVisibility(0);
        }
        C18617n nVar2 = bVar.f51339m;
        int i7 = bVar.f51317a.f51374c;
        int i8 = nVar2.f51408g;
        if (i7 == 0 || i8 == 0) {
            return false;
        }
        boolean b3 = mo37896b(bVar);
        int i9 = (int) (((float) i8) * (((float) i6) / ((float) i7)));
        this.f51185n = new C18702f(C18642g.m45184L(), this.f51181j);
        setSplashAdListener(bVar);
        String b4 = C18744j.m45725b(nVar2);
        if (C18747l.m45742a(b4)) {
            return false;
        }
        C18699e a = new C18701a().mo38256a(b4).mo38261b(nVar2.f51405d).mo38255a(bVar.mo37863p()).mo38254a(displayMetrics.widthPixels).mo38260b(i9).mo38257a(nVar2.f51402a).mo38264c(bVar.mo37864r()).mo38263c((i6 - i9) / 2).mo38266d(bVar.f51328b).mo38258a(false).mo38262b(false).mo38265c(bVar.mo37969E()).mo38259a();
        this.f51185n.f51725f = bVar.mo37987i();
        if (this.f51185n.mo38267a(a) && b3) {
            z = true;
        }
        setSkipAndWifiPreloadLayout(bVar);
        setSkipClickListener(bVar);
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (C18569b.this.f51185n != null) {
                        C18569b.this.f51185n.mo38268b();
                    }
                    C18569b.this.f51186o.mo38083b(bVar, new C18604a().mo38005a(false).mo38003a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo38006a());
                }
                return true;
            }
        });
        if (z) {
            mo37891a();
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            String str2 = "not_real_time";
            try {
                if (bVar.mo37987i()) {
                    str2 = "real_time";
                }
                jSONObject4.putOpt("show_type", str2);
                jSONObject4.putOpt("show_expected", Integer.valueOf(bVar.f51328b));
                jSONObject5.putOpt("ad_extra_data", jSONObject4);
                jSONObject5.putOpt("is_ad_event", "1");
                jSONObject5.putOpt("log_extra", bVar.mo37864r());
                jSONObject5.putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
                jSONObject = jSONObject5;
            } catch (JSONException unused2) {
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "banner_show", jSONObject);
        }
        return z;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                C18712d.m45601a().mo38326c();
                break;
            case 25:
                C18712d.m45601a().mo38326c();
                break;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo37893a(boolean z, boolean z2) {
        if (z) {
            LayoutParams layoutParams = (LayoutParams) this.f51169C.getLayoutParams();
            layoutParams.height = C18744j.m45736g() - 4;
            this.f51169C.setLayoutParams(layoutParams);
            if (VERSION.SDK_INT >= 17) {
                this.f51191t.setPaddingRelative(4, 4, 0, 4);
            } else {
                this.f51191t.setPadding(4, 4, 0, 4);
            }
            if (!z2) {
                this.f51192u.setBackgroundResource(R.drawable.bbt);
                this.f51192u.setTextColor(getResources().getColor(R.color.a5p));
            } else {
                this.f51192u.setBackgroundResource(R.drawable.bbs);
                this.f51192u.setTextColor(getResources().getColor(R.color.a5q));
            }
            this.f51170D.setVisibility(0);
        }
    }
}
