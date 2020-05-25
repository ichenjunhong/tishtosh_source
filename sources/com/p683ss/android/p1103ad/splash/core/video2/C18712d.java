package com.p683ss.android.p1103ad.splash.core.video2;

import android.content.Context;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.video2.C18718h.C18720b;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video2.d */
public class C18712d {

    /* renamed from: d */
    private static volatile C18712d f51773d = null;

    /* renamed from: e */
    private static long f51774e = 500;

    /* renamed from: f */
    private static long f51775f = 3000;

    /* renamed from: a */
    public Timer f51776a;

    /* renamed from: b */
    public boolean f51777b;

    /* renamed from: c */
    public int f51778c;

    /* renamed from: g */
    private C18718h f51779g;

    /* renamed from: c */
    public final void mo38326c() {
        this.f51777b = false;
        if (this.f51776a != null) {
            this.f51776a.cancel();
            this.f51776a = null;
        }
    }

    /* renamed from: a */
    public static C18712d m45601a() {
        if (f51773d == null) {
            synchronized (C18712d.class) {
                if (f51773d == null) {
                    f51773d = new C18712d();
                }
            }
        }
        return f51773d;
    }

    /* renamed from: b */
    public final void mo38325b() {
        if (this.f51779g != null) {
            this.f51779g.mo38332d();
            this.f51779g = null;
        }
        if (this.f51776a != null) {
            this.f51776a.cancel();
            this.f51776a = null;
        }
    }

    /* renamed from: a */
    public static void m45602a(C18602b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", bVar.mo37864r());
            jSONObject.put("ad_fetch_time", bVar.mo37862f());
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "mute", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m45603a(C18602b bVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format((double) f));
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", bVar.mo37864r());
            jSONObject.put("ad_fetch_time", bVar.mo37862f());
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "unmute", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo38323a(final C18602b bVar, Context context) {
        if (bVar.mo37972H() != 0) {
            if (this.f51779g == null) {
                this.f51779g = new C18718h(context);
            }
            final int b = this.f51779g.mo38330b();
            this.f51778c = this.f51779g.mo38329a();
            final float f = (((float) this.f51778c) * 1.0f) / ((float) b);
            if (f == 0.0f) {
                m45602a(bVar);
            } else {
                m45603a(bVar, f);
            }
            this.f51777b = false;
            this.f51779g.f51788a = new C18720b() {

                /* renamed from: a */
                float f51780a = f;

                /* renamed from: a */
                public final void mo38327a(int i) {
                    if (!C18712d.this.f51777b) {
                        if (this.f51780a == 0.0f && i > 0) {
                            this.f51780a = (((float) i) * 1.0f) / ((float) b);
                            C18712d.m45603a(bVar, this.f51780a);
                        } else if (this.f51780a > 0.0f && i == 0) {
                            this.f51780a = (float) i;
                            C18712d.m45602a(bVar);
                        }
                    }
                }
            };
            new StringBuilder("Init volume:").append(this.f51778c);
            this.f51779g.mo38331c();
        }
    }

    /* renamed from: a */
    public final void mo38324a(final C18715e eVar, int i, long j) {
        if (eVar == null || this.f51779g == null || j <= f51775f) {
            if (eVar != null) {
                eVar.mo38300a(true);
            }
            return;
        }
        switch (i) {
            case 0:
                eVar.mo38300a(true);
                return;
            case 1:
                eVar.mo38300a(false);
                eVar.mo38297a(0.0f, 0.0f);
                return;
            case 2:
                eVar.mo38300a(false);
                this.f51776a = new Timer();
                this.f51777b = true;
                final float a = (((float) this.f51779g.mo38329a()) * 1.0f) / ((float) f51775f);
                if (a > 0.0f) {
                    this.f51776a.schedule(new TimerTask() {
                        public final void run() {
                            try {
                                float e = a * ((float) eVar.mo38305e());
                                if (e >= ((float) C18712d.this.f51778c)) {
                                    eVar.mo38297a((float) C18712d.this.f51778c, (float) C18712d.this.f51778c);
                                    C18712d.this.f51776a.cancel();
                                    return;
                                }
                                eVar.mo38297a(e, e);
                            } catch (Exception unused) {
                            }
                        }
                    }, 0, f51774e);
                    return;
                }
                break;
            case 3:
                int a2 = this.f51779g.mo38329a();
                eVar.mo38300a(false);
                float f = ((float) a2) * 1.0f;
                eVar.mo38297a(f, f);
                return;
            default:
                eVar.mo38300a(true);
                break;
        }
    }
}
