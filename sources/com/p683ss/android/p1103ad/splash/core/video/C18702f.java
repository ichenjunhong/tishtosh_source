package com.p683ss.android.p1103ad.splash.core.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.C18673u;
import com.p683ss.android.p1103ad.splash.core.video.C18687b.C18688a;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.p1103ad.splash.p1123g.C18748m;
import com.p683ss.android.p1103ad.splash.p1123g.C18752p;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r.C18755a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video.f */
public final class C18702f implements C18687b, C18698a, C18755a {

    /* renamed from: a */
    public C18694d f51720a;

    /* renamed from: b */
    public C18754r f51721b = new C18754r(this);

    /* renamed from: c */
    public long f51722c = 0;

    /* renamed from: d */
    public C18689c f51723d;

    /* renamed from: e */
    public C18688a f51724e;

    /* renamed from: f */
    public boolean f51725f;

    /* renamed from: g */
    public Runnable f51726g;

    /* renamed from: h */
    private long f51727h;

    /* renamed from: i */
    private int f51728i;

    /* renamed from: j */
    private ViewGroup f51729j;

    /* renamed from: k */
    private long f51730k = 0;

    /* renamed from: l */
    private String f51731l;

    /* renamed from: m */
    private long f51732m = 0;

    /* renamed from: n */
    private long f51733n;

    /* renamed from: o */
    private List<String> f51734o;

    /* renamed from: p */
    private int[] f51735p = new int[2];

    /* renamed from: q */
    private ArrayList<Runnable> f51736q;

    /* renamed from: r */
    private boolean f51737r;

    /* renamed from: s */
    private WeakReference<Context> f51738s;

    /* renamed from: t */
    private boolean f51739t;

    /* renamed from: u */
    private boolean f51740u;

    /* renamed from: v */
    private long f51741v;

    /* renamed from: w */
    private Runnable f51742w;

    /* renamed from: b */
    public final void mo38268b() {
        if (this.f51723d != null) {
            this.f51723d.mo38233b();
        }
    }

    /* renamed from: a */
    public final void mo38249a() {
        if (this.f51724e != null) {
            this.f51730k = System.currentTimeMillis() - this.f51722c;
            this.f51724e.mo37917c(this.f51730k, C18748m.m45743a(this.f51732m, this.f51733n));
        }
    }

    /* renamed from: c */
    public final void mo38269c() {
        if (this.f51723d != null) {
            this.f51723d.mo38234c();
        }
        if (this.f51720a != null) {
            this.f51720a.mo38245e();
        }
        this.f51721b.removeCallbacks(this.f51742w);
    }

    /* renamed from: d */
    private void m45560d() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", this.f51728i);
            String str = "not_real_time";
            if (this.f51725f) {
                str = "real_time";
            }
            jSONObject.put("show_type", str);
            jSONObject.put("ad_sequence", C18673u.m45399a().mo38172o());
            if (C18642g.m45194V() != -1) {
                int i = 1;
                if (C18642g.m45194V() != 1) {
                    i = 2;
                }
                jSONObject.put("awemelaunch", i);
            }
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!C18747l.m45742a(this.f51731l)) {
                jSONObject2.put("log_extra", this.f51731l);
            }
            jSONObject2.put("ad_fetch_time", this.f51741v);
        } catch (JSONException unused) {
            jSONObject2 = null;
        }
        C18642g.m45201a(this.f51727h, "splash_ad", "play", jSONObject2);
        C18642g.m45180H().mo38044c(null, this.f51727h, this.f51734o, this.f51731l, true, -1, null);
    }

    /* renamed from: a */
    public final void mo37892a(Message message) {
        if (this.f51720a != null && message != null && this.f51738s != null && this.f51738s.get() != null) {
            int i = message.what;
            switch (i) {
                case 108:
                    if (message.obj instanceof Long) {
                        this.f51733n = ((Long) message.obj).longValue();
                        return;
                    }
                    break;
                case 109:
                    if (message.obj instanceof Long) {
                        this.f51732m = ((Long) message.obj).longValue();
                        return;
                    }
                    break;
                default:
                    boolean z = true;
                    switch (i) {
                        case 302:
                            int i2 = message.what;
                            if (this.f51738s == null || this.f51738s.get() == null) {
                                z = false;
                            }
                            if (z && this.f51720a != null) {
                                this.f51720a.mo38243c();
                                if (this.f51724e != null) {
                                    this.f51724e.mo37914a(this.f51730k, 100);
                                }
                            }
                            return;
                        case 303:
                            if (this.f51720a != null) {
                                this.f51720a.mo38243c();
                            }
                            if (this.f51724e != null) {
                                this.f51724e.mo37916b(this.f51730k, C18748m.m45743a(this.f51732m, this.f51733n));
                                return;
                            }
                            break;
                        case 304:
                            int i3 = message.arg1;
                            if (this.f51720a != null) {
                                this.f51720a.mo38243c();
                            }
                            if (this.f51739t && i3 == 3 && !this.f51740u) {
                                m45560d();
                                this.f51740u = true;
                                return;
                            }
                        case 305:
                            if (this.f51721b != null) {
                                this.f51721b.removeCallbacks(this.f51742w);
                            }
                            if (!this.f51739t && !this.f51740u) {
                                m45560d();
                                this.f51740u = true;
                            }
                            if (this.f51720a != null) {
                                this.f51720a.mo38243c();
                                return;
                            }
                            break;
                        case 306:
                            if (this.f51720a != null) {
                                this.f51720a.mo38243c();
                                break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo38267a(C18699e eVar) {
        int i;
        if (C18747l.m45742a(eVar.f51691b) || C18747l.m45742a(eVar.f51690a)) {
            return false;
        }
        this.f51731l = eVar.f51696g;
        this.f51727h = eVar.f51692c;
        this.f51728i = eVar.f51701l;
        this.f51741v = eVar.f51697h;
        this.f51720a.f51685s = eVar.f51704o;
        if (eVar.f51699j) {
            C18694d dVar = this.f51720a;
            int i2 = eVar.f51702m;
            int i3 = eVar.f51703n;
            if (!(dVar.f51672f == null || (i2 == 0 && i3 == 0))) {
                ((LayoutParams) dVar.f51672f.getLayoutParams()).setMargins(i2, i3, i2, i3);
            }
        }
        C18694d dVar2 = this.f51720a;
        boolean z = eVar.f51699j;
        boolean z2 = eVar.f51700k;
        if (dVar2.f51685s) {
            dVar2.f51673g.setVisibility(8);
            if (z) {
                dVar2.f51670d.setVisibility(0);
                dVar2.f51684r.setVisibility(0);
                if (C18642g.m45221b()) {
                    dVar2.f51683q.setVisibility(0);
                }
            }
            if (z2) {
                LayoutParams layoutParams = (LayoutParams) dVar2.f51682p.getLayoutParams();
                layoutParams.height = C18744j.m45736g() - 4;
                dVar2.f51682p.setLayoutParams(layoutParams);
                dVar2.f51682p.setVisibility(4);
                dVar2.f51680n.setPadding(4, 4, 0, 4);
                dVar2.f51680n.setVisibility(0);
                dVar2.f51681o.setBackgroundResource(R.drawable.bbt);
                dVar2.f51681o.setTextColor(dVar2.f51677k.getResources().getColor(R.color.a5p));
            }
        } else {
            dVar2.f51673g.setVisibility(8);
            if (z) {
                dVar2.f51670d.setVisibility(0);
                if (C18642g.m45221b()) {
                    dVar2.f51668b.setVisibility(0);
                }
            }
            if (z2) {
                dVar2.f51667a.setVisibility(0);
                dVar2.f51669c.setVisibility(0);
            }
            if (z && C18642g.m45233h() == 1) {
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
                layoutParams2.setMargins(0, 0, (int) C18752p.m45750a(dVar2.f51677k, 10.0f), 0);
                dVar2.f51667a.setLayoutParams(layoutParams2);
                dVar2.f51667a.setPadding(0, 0, 0, (int) C18752p.m45750a(dVar2.f51677k, 10.0f));
                dVar2.mo38241b();
            } else if (!z2) {
                dVar2.mo38241b();
            }
        }
        C18694d dVar3 = this.f51720a;
        int i4 = eVar.f51693d;
        int i5 = eVar.f51694e;
        dVar3.f51674h = i4;
        dVar3.f51675i = i5;
        C18694d dVar4 = this.f51720a;
        ViewGroup viewGroup = this.f51729j;
        if (dVar4.f51676j.getParent() != null) {
            ((ViewGroup) dVar4.f51676j.getParent()).removeView(dVar4.f51676j);
        }
        viewGroup.addView(dVar4.f51676j);
        dVar4.mo38242b(0);
        int i6 = eVar.f51698i;
        if (this.f51720a.mo38239a() instanceof FrameLayout.LayoutParams) {
            this.f51729j.getLocationInWindow(this.f51735p);
            FrameLayout.LayoutParams a = this.f51720a.mo38239a();
            if (a != null) {
                a.topMargin = i6;
                a.leftMargin = 0;
                a.gravity = 51;
                this.f51720a.f51676j.setLayoutParams(a);
            }
        }
        this.f51721b = new C18754r(this);
        this.f51723d = new C18689c(this.f51721b);
        C18694d dVar5 = this.f51720a;
        int i7 = eVar.f51693d;
        int i8 = eVar.f51694e;
        if (i7 == -1) {
            i7 = dVar5.f51677k.getResources().getDisplayMetrics().widthPixels;
        }
        if (i7 > 0) {
            if (dVar5.f51674h <= 0 || dVar5.f51675i <= 0) {
                i = 0;
            } else {
                i = dVar5.f51677k.getResources().getDimensionPixelSize(R.dimen.mf);
                int dimensionPixelSize = dVar5.f51677k.getResources().getDimensionPixelSize(R.dimen.mg);
                int i9 = (int) (((float) dVar5.f51675i) * ((((float) i7) * 1.0f) / ((float) dVar5.f51674h)));
                if (i9 <= i) {
                    if (i9 < dimensionPixelSize) {
                        i = dimensionPixelSize;
                    } else {
                        i = i9;
                    }
                }
            }
            ViewGroup.LayoutParams layoutParams3 = dVar5.f51676j.getLayoutParams();
            if (i7 == -1 || i7 == -2 || i7 > 0) {
                layoutParams3.width = i7;
            }
            if (i == -1 || i == -2 || i > 0) {
                layoutParams3.height = i;
            }
            dVar5.f51676j.setLayoutParams(layoutParams3);
        }
        this.f51730k = 0;
        this.f51720a.f51673g.setVisibility(0);
        try {
            String str = eVar.f51690a;
            if (this.f51723d != null) {
                C18689c cVar = this.f51723d;
                cVar.mo38232a((Runnable) new Runnable(str) {

                    /* renamed from: a */
                    final /* synthetic */ String f51664a;

                    public final void run() {
                        C18689c.this.mo38231a();
                        if (C18689c.this.f51649d != null) {
                            C18689c.this.f51649d.obtainMessage(107, this.f51664a).sendToTarget();
                        }
                    }

                    {
                        this.f51664a = r2;
                    }
                });
            }
            this.f51722c = System.currentTimeMillis();
            if (!C18747l.m45742a(str)) {
                this.f51720a.mo38240a(8);
                this.f51720a.mo38240a(0);
                C187031 r0 = new Runnable() {
                    public final void run() {
                        C18702f.this.f51722c = System.currentTimeMillis();
                        C18702f.this.f51720a.mo38242b(0);
                        if (C18702f.this.f51723d != null) {
                            C18689c cVar = C18702f.this.f51723d;
                            cVar.f51650e = false;
                            if (cVar.f51646a != null) {
                                try {
                                    cVar.f51646a.mo38203a(0.0f, 0.0f);
                                } catch (Throwable unused) {
                                }
                            }
                            cVar.mo38232a((Runnable) new Runnable() {
                                public final void run() {
                                    if (C18689c.this.f51649d != null) {
                                        C18689c.this.f51649d.sendEmptyMessage(104);
                                    }
                                }
                            });
                            cVar.f51648c = 0;
                        }
                        if (C18702f.this.f51721b != null) {
                            C18702f.this.f51721b.postDelayed(C18702f.this.f51726g, 100);
                        }
                    }
                };
                if (!this.f51720a.f51678l || !this.f51737r) {
                    if (this.f51736q == null) {
                        this.f51736q = new ArrayList<>();
                    }
                    this.f51736q.add(r0);
                } else {
                    r0.run();
                }
            }
            this.f51731l = eVar.f51696g;
            this.f51734o = eVar.f51695f;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo38253b(C18694d dVar, SurfaceHolder surfaceHolder) {
        this.f51737r = false;
    }

    public C18702f(Context context, ViewGroup viewGroup) {
        boolean z = false;
        this.f51740u = false;
        this.f51725f = false;
        this.f51741v = 0;
        this.f51726g = new Runnable() {
            public final void run() {
                if (C18702f.this.f51723d != null) {
                    C18689c cVar = C18702f.this.f51723d;
                    if (cVar.f51649d != null) {
                        cVar.f51649d.obtainMessage(108).sendToTarget();
                    }
                }
            }
        };
        this.f51742w = new Runnable() {
            public final void run() {
                if (C18702f.this.f51724e != null) {
                    C18702f.this.f51724e.mo37913a();
                }
            }
        };
        this.f51729j = viewGroup;
        this.f51738s = new WeakReference<>(context);
        this.f51720a = new C18694d(context, LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.aeu, null, false));
        this.f51720a.f51679m = this;
        if (VERSION.SDK_INT >= 17) {
            z = true;
        }
        this.f51739t = z;
    }

    /* renamed from: a */
    public final void mo38250a(C18694d dVar, SurfaceHolder surfaceHolder) {
        this.f51737r = true;
        if (this.f51723d != null) {
            C18689c cVar = this.f51723d;
            cVar.mo38232a((Runnable) new Runnable(surfaceHolder) {

                /* renamed from: a */
                final /* synthetic */ SurfaceHolder f51662a;

                public final void run() {
                    C18689c.this.mo38231a();
                    if (C18689c.this.f51649d != null) {
                        C18689c.this.f51649d.obtainMessage(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, this.f51662a).sendToTarget();
                    }
                }

                {
                    this.f51662a = r2;
                }
            });
            if (this.f51736q != null && !this.f51736q.isEmpty()) {
                Iterator it = new ArrayList(this.f51736q).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f51736q.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo38252a(C18694d dVar, View view, MotionEvent motionEvent) {
        if (this.f51724e != null) {
            this.f51724e.mo37915a(this.f51730k, C18748m.m45743a(this.f51732m, this.f51733n), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    /* renamed from: a */
    public final void mo38251a(C18694d dVar, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("surfaceChanged, format = ");
        sb.append(i);
        sb.append(", width = ");
        sb.append(i2);
        sb.append(", height = ");
        sb.append(i3);
    }
}
