package com.bytedance.p126ad.symphony;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.p126ad.symphony.C2670a.C2672a;
import com.bytedance.p126ad.symphony.p129b.p130a.C2691c;
import com.bytedance.p126ad.symphony.p129b.p130a.C2692d;
import com.bytedance.p126ad.symphony.p129b.p130a.C2693e;
import com.bytedance.p126ad.symphony.p129b.p130a.C2694f;
import com.bytedance.p126ad.symphony.p129b.p130a.C2695g;
import com.bytedance.p126ad.symphony.p129b.p130a.C2696h;
import com.bytedance.p126ad.symphony.p131c.C2713g;
import com.bytedance.p126ad.symphony.p132d.C2720d;
import com.bytedance.p126ad.symphony.p134e.p135a.C2728f;
import com.bytedance.p126ad.symphony.p136f.C2733b;
import com.bytedance.p126ad.symphony.p136f.C2734c;
import com.bytedance.p126ad.symphony.p136f.C2735d;
import com.bytedance.p126ad.symphony.p139i.C2742a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.b */
public class C2680b {

    /* renamed from: a */
    public static volatile C2680b f8141a = null;

    /* renamed from: g */
    private static boolean f8142g = false;

    /* renamed from: h */
    private static boolean f8143h = true;

    /* renamed from: i */
    private static C2720d f8144i;

    /* renamed from: b */
    public Context f8145b;

    /* renamed from: c */
    public C2734c f8146c;

    /* renamed from: d */
    public C2695g f8147d;

    /* renamed from: e */
    public C2693e f8148e;

    /* renamed from: f */
    public C2691c f8149f;

    /* renamed from: b */
    public static boolean m7713b() {
        return f8142g;
    }

    /* renamed from: a */
    public static C2680b m7710a() {
        if (f8141a == null) {
            if (!m7713b()) {
                m7714c();
            } else {
                throw new IllegalStateException("instance is null");
            }
        }
        return f8141a;
    }

    /* renamed from: c */
    private static void m7714c() {
        if (f8141a == null) {
            synchronized (C2680b.class) {
                if (f8141a == null) {
                    if (SymphonyContentProvider.f8125a != null) {
                        f8141a = new C2680b(new C2700c(SymphonyContentProvider.f8125a, new C2733b()));
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
                m7711a((Exception) new IllegalStateException("create fake symphony instance"));
            }
        }
    }

    /* renamed from: a */
    public static void m7712a(boolean z) {
        f8143h = false;
    }

    /* renamed from: a */
    private static void m7711a(Exception exc) {
        if (f8144i != null) {
            f8144i.mo7274a(exc);
        }
        exc.getMessage();
    }

    public C2680b(C2700c cVar) {
        this.f8145b = cVar.f8181b.getApplicationContext();
        f8144i = cVar.f8190k;
        C2715d.f8220b = cVar.f8190k;
        if (cVar.f8180a != null) {
            C2742a.m7830a(cVar.f8180a);
        }
        boolean z = cVar.f8183d;
        f8142g = z;
        if (z) {
            C9415i.m18633a(3);
        }
        this.f8146c = cVar.f8182c;
        if (cVar.f8184e != null) {
            C2713g.f8211b = cVar.f8184e;
        }
        if (cVar.f8185f != null) {
            C2713g.f8210a = cVar.f8185f;
        }
        C2696h hVar = cVar.f8186g;
        if (hVar == null) {
            hVar = new C2696h(cVar.f8181b);
        }
        this.f8147d = new C2695g(hVar);
        C2694f fVar = cVar.f8187h;
        if (fVar == null) {
            fVar = new C2694f(cVar.f8181b);
        }
        this.f8148e = new C2693e(fVar);
        C2692d dVar = cVar.f8188i;
        if (dVar == null) {
            dVar = new C2692d(cVar.f8181b);
        }
        this.f8149f = new C2691c(dVar);
        C2715d.f8219a = cVar.f8189j;
        C2742a.m7829a((Runnable) new Runnable() {
            public final void run() {
                C2680b.this.mo7243a(C2670a.m7671a(C2680b.this.f8145b).mo7228a());
                C2670a a = C2670a.m7671a(C2680b.this.f8145b);
                a.mo7230c().scheduleAtFixedRate(new Runnable(C2680b.this.f8146c) {

                    /* renamed from: a */
                    final /* synthetic */ C2734c f8132a;

                    public final void run() {
                        boolean z;
                        String str;
                        try {
                            if (C2670a.this.f8128a <= C2670a.f8126b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                C2670a.this.mo7230c().shutdown();
                                return;
                            }
                            String a = this.f8132a.mo7282a();
                            Context context = C2670a.this.f8130d;
                            String str2 = "/api/ad/v1/setting/";
                            if (C9431p.m18664a(a)) {
                                str = "";
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("https://");
                                sb.append(a);
                                sb.append(str2);
                                StringBuilder sb2 = new StringBuilder(PreloadTask.BYTE_UNIT_NUMBER);
                                String e = C9425l.m18654e(context);
                                sb2.append("?device_platform=android");
                                if (!C9431p.m18664a(e)) {
                                    sb2.append("&ac=");
                                    sb2.append(Uri.encode(e));
                                }
                                sb2.append("&device_type=");
                                sb2.append(Uri.encode(Build.MODEL));
                                sb2.append("&os_version=");
                                sb2.append(VERSION.RELEASE);
                                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                sb2.append("&resolution=");
                                sb2.append(displayMetrics.heightPixels);
                                sb2.append("*");
                                sb2.append(displayMetrics.widthPixels);
                                if (!C9431p.m18664a(C2735d.m7798a(context))) {
                                    sb2.append("&sim_region=");
                                    sb2.append(Uri.encode(C2735d.m7798a(context).toUpperCase()));
                                }
                                if (!C9431p.m18664a(C2735d.m7797a())) {
                                    sb2.append("&sys_region=");
                                    sb2.append(Uri.encode(C2735d.m7797a().toUpperCase()));
                                }
                                sb.append(sb2);
                                if (C2715d.m7768a() != null) {
                                    sb.append(C2715d.m7768a());
                                }
                                str = sb.toString();
                            }
                            new StringBuilder("setting url:").append(str);
                            JSONObject a2 = this.f8132a.mo7283a(str);
                            if (a2 != null) {
                                C2680b.m7710a().mo7243a(C2670a.m7670a(a2));
                                C2670a aVar = C2670a.this;
                                String jSONObject = a2.toString();
                                Editor edit = aVar.mo7229b().edit();
                                edit.clear();
                                edit.putString("config", jSONObject);
                                edit.putInt("version_code", 1);
                                edit.apply();
                                C2670a.this.f8128a = 0;
                                return;
                            }
                            C2670a.this.f8128a++;
                        } catch (Exception unused) {
                        }
                    }

                    {
                        this.f8132a = r2;
                    }
                }, 10, (long) a.f8129c, TimeUnit.SECONDS);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7243a(C2672a aVar) {
        if (aVar != null) {
            if (this.f8147d != null) {
                this.f8147d.mo7269b(aVar.f8134a);
                this.f8147d.f8159i = aVar.f8137d;
                this.f8147d.mo7250a(aVar.f8138e);
            }
            if (this.f8148e != null) {
                this.f8148e.mo7266b(aVar.f8135b);
                this.f8148e.mo7250a(aVar.f8138e);
            }
            if (this.f8149f != null) {
                this.f8149f.mo7265b(aVar.f8136c);
                this.f8149f.mo7250a(aVar.f8138e);
            }
            C2728f a = C2728f.m7790a();
            if (aVar.f8139f != null) {
                a = aVar.f8139f;
            }
            C2715d.m7769a(a);
        }
    }
}
