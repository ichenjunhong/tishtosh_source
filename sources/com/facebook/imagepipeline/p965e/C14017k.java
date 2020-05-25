package com.facebook.imagepipeline.p965e;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0795l.C0798c;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p920d.C13692l;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p923g.C13705d;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13711i;
import com.facebook.imagepipeline.memory.C14067ac;
import com.facebook.imagepipeline.p956a.p958b.C13915a;
import com.facebook.imagepipeline.p956a.p958b.C13916b;
import com.facebook.imagepipeline.p963c.C13941a;
import com.facebook.imagepipeline.p963c.C13942b;
import com.facebook.imagepipeline.p963c.C13943c;
import com.facebook.imagepipeline.p963c.C13945e;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p964d.C13955a;
import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13971h;
import com.facebook.imagepipeline.p964d.C13985o;
import com.facebook.imagepipeline.p964d.C13987q;
import com.facebook.imagepipeline.p964d.C13988r;
import com.facebook.imagepipeline.p964d.C13989s;
import com.facebook.imagepipeline.p964d.C13993v;
import com.facebook.imagepipeline.p965e.C14012j.C14016c;
import com.facebook.imagepipeline.p967g.C14028b;
import com.facebook.imagepipeline.p967g.C14030c;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p972l.C14051a;
import com.facebook.imagepipeline.p972l.C14053c;
import com.facebook.imagepipeline.p972l.C14054d;
import com.facebook.imagepipeline.p972l.C14055e;
import com.facebook.imagepipeline.p972l.C14056f;
import com.facebook.imagepipeline.p974n.C14163ay;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.imagepipeline.p977q.C14244c;
import com.facebook.imagepipeline.p977q.C14246e;
import com.facebook.imagepipeline.p977q.C14248g;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p916b.C13651i;
import com.facebook.p955h.C13902d;

/* renamed from: com.facebook.imagepipeline.e.k */
public class C14017k {

    /* renamed from: a */
    private static final Class<?> f36594a = C14017k.class;

    /* renamed from: b */
    private static C14017k f36595b;

    /* renamed from: u */
    private static C14030c f36596u;

    /* renamed from: c */
    private final C14163ay f36597c;

    /* renamed from: d */
    private final C14008i f36598d;

    /* renamed from: e */
    private C13971h<C13619c, C14042c> f36599e;

    /* renamed from: f */
    private C13985o<C13619c, C14042c> f36600f;

    /* renamed from: g */
    private C13971h<C13619c, C13709h> f36601g;

    /* renamed from: h */
    private C13985o<C13619c, C13709h> f36602h;

    /* renamed from: i */
    private C13962e f36603i;

    /* renamed from: j */
    private C13651i f36604j;

    /* renamed from: k */
    private C14030c f36605k;

    /* renamed from: l */
    private C14001h f36606l;

    /* renamed from: m */
    private C14244c f36607m;

    /* renamed from: n */
    private C14020m f36608n;

    /* renamed from: o */
    private C14021n f36609o;

    /* renamed from: p */
    private C13962e f36610p;

    /* renamed from: q */
    private C13651i f36611q;

    /* renamed from: r */
    private C13946f f36612r;

    /* renamed from: s */
    private C14056f f36613s;

    /* renamed from: t */
    private C13915a f36614t;

    /* renamed from: a */
    public static C14017k m28587a() {
        return (C14017k) C13689i.m27653a(f36595b, (Object) "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: h */
    private C13971h<C13619c, C14042c> m28591h() {
        if (this.f36599e == null) {
            this.f36599e = C13955a.m28434a(this.f36598d.f36508b, this.f36598d.f36522p, this.f36598d.f36509c);
        }
        return this.f36599e;
    }

    /* renamed from: k */
    private C14056f m28594k() {
        if (this.f36613s == null) {
            this.f36613s = m28588a(this.f36598d.f36526t, this.f36598d.f36531y.f36577o);
        }
        return this.f36613s;
    }

    /* renamed from: b */
    public final C13915a mo26208b() {
        if (this.f36614t == null) {
            this.f36614t = C13916b.m28349a(mo26212f(), this.f36598d.f36515i, m28591h());
        }
        return this.f36614t;
    }

    /* renamed from: c */
    public final C13985o<C13619c, C14042c> mo26209c() {
        if (this.f36600f == null) {
            this.f36600f = new C13985o<>(m28591h(), new C13988r<C13619c>(this.f36598d.f36516j) {

                /* renamed from: a */
                final /* synthetic */ C13984n f36407a;

                {
                    this.f36407a = r1;
                }
            });
        }
        return this.f36600f;
    }

    /* renamed from: d */
    public final C13651i mo26210d() {
        if (this.f36604j == null) {
            this.f36604j = this.f36598d.f36513g.mo26179a(this.f36598d.f36521o);
        }
        return this.f36604j;
    }

    /* renamed from: f */
    public final C13946f mo26212f() {
        if (this.f36612r == null) {
            this.f36612r = m28586a(this.f36598d.f36526t, m28594k());
        }
        return this.f36612r;
    }

    /* renamed from: g */
    public final C13651i mo26213g() {
        if (this.f36611q == null) {
            this.f36611q = this.f36598d.f36513g.mo26179a(this.f36598d.f36529w);
        }
        return this.f36611q;
    }

    /* renamed from: i */
    private C13985o<C13619c, C13709h> m28592i() {
        if (this.f36602h == null) {
            if (this.f36601g == null) {
                C13691k<C13987q> kVar = this.f36598d.f36514h;
                C13705d dVar = this.f36598d.f36522p;
                C13971h<C13619c, C13709h> hVar = new C13971h<>(new C13993v<C13709h>() {
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ int mo23155a(Object obj) {
                        return ((C13709h) obj).mo25608a();
                    }
                }, new C13989s(), kVar);
                dVar.mo23182a(hVar);
                this.f36601g = hVar;
            }
            this.f36602h = new C13985o<>(this.f36601g, new C13988r<C13619c>(this.f36598d.f36516j) {

                /* renamed from: a */
                final /* synthetic */ C13984n f36462a;

                {
                    this.f36462a = r1;
                }
            });
        }
        return this.f36602h;
    }

    /* renamed from: j */
    private C13962e m28593j() {
        if (this.f36603i == null) {
            C13962e eVar = new C13962e(mo26210d(), this.f36598d.f36526t.mo26319a(this.f36598d.f36523q), this.f36598d.f36526t.mo26324e(), this.f36598d.f36515i.mo26174a(), this.f36598d.f36515i.mo26175b(), this.f36598d.f36516j);
            this.f36603i = eVar;
        }
        return this.f36603i;
    }

    /* renamed from: n */
    private C13962e m28597n() {
        if (this.f36610p == null) {
            C13962e eVar = new C13962e(mo26213g(), this.f36598d.f36526t.mo26319a(this.f36598d.f36523q), this.f36598d.f36526t.mo26324e(), this.f36598d.f36515i.mo26174a(), this.f36598d.f36515i.mo26175b(), this.f36598d.f36516j);
            this.f36610p = eVar;
        }
        return this.f36610p;
    }

    /* renamed from: p */
    private C14030c m28599p() {
        if (f36596u == null) {
            try {
                f36596u = (C14030c) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(new Class[]{C13711i.class}).newInstance(new Object[]{this.f36598d.f36526t.mo26323d()});
            } catch (Throwable unused) {
                return null;
            }
        }
        return f36596u;
    }

    /* renamed from: m */
    private C14021n m28596m() {
        boolean z;
        if (VERSION.SDK_INT < 24 || !this.f36598d.f36531y.f36568f) {
            z = false;
        } else {
            z = true;
        }
        if (this.f36609o == null) {
            C14021n nVar = new C14021n(this.f36598d.f36511e.getApplicationContext().getContentResolver(), m28595l(), this.f36598d.f36524r, this.f36598d.f36528v, this.f36598d.f36531y.f36563a, this.f36597c, this.f36598d.f36512f, z, this.f36598d.f36531y.f36574l, this.f36598d.f36532z, m28598o());
            this.f36609o = nVar;
        }
        return this.f36609o;
    }

    /* renamed from: o */
    private C14244c m28598o() {
        if (this.f36607m == null) {
            if (this.f36598d.f36518l == null && this.f36598d.f36519m == null && this.f36598d.f36531y.f36573k) {
                this.f36607m = new C14248g(this.f36598d.f36531y.f36572j);
            } else {
                this.f36607m = new C14246e(this.f36598d.f36531y.f36572j, this.f36598d.f36531y.f36567e, this.f36598d.f36518l, this.f36598d.f36519m);
            }
        }
        return this.f36607m;
    }

    /* renamed from: e */
    public final C14001h mo26211e() {
        if (this.f36606l == null) {
            C14001h hVar = new C14001h(m28596m(), this.f36598d.mo26198a(), this.f36598d.f36520n, mo26209c(), m28592i(), m28593j(), m28597n(), this.f36598d.f36510d, this.f36597c, C13692l.m27661a(Boolean.valueOf(false)), this.f36598d.f36531y.f36576n);
            this.f36606l = hVar;
        }
        return this.f36606l;
    }

    /* renamed from: l */
    private C14020m m28595l() {
        C14030c cVar;
        C14030c cVar2;
        if (this.f36608n == null) {
            C14016c cVar3 = this.f36598d.f36531y.f36575m;
            Context context = this.f36598d.f36511e;
            C13702a f = this.f36598d.f36526t.mo26325f();
            if (this.f36605k == null) {
                if (this.f36598d.f36517k != null) {
                    this.f36605k = this.f36598d.f36517k;
                } else {
                    C13915a b = mo26208b();
                    C14030c p = m28599p();
                    if (b != null) {
                        C14030c gifDecoder = b.getGifDecoder(Config.RGB_565);
                        cVar = b.getWebPDecoder(Config.RGB_565);
                        cVar2 = gifDecoder;
                    } else {
                        cVar2 = null;
                        cVar = null;
                    }
                    if (this.f36598d.f36530x == null) {
                        this.f36605k = new C14028b(cVar2, cVar, p, m28594k());
                    } else {
                        C14028b bVar = new C14028b(cVar2, cVar, p, m28594k(), this.f36598d.f36530x.f36682a);
                        this.f36605k = bVar;
                        C13902d b2 = C13902d.m28315b();
                        b2.f36279a = this.f36598d.f36530x.f36683b;
                        b2.mo26071a();
                    }
                }
            }
            this.f36608n = cVar3.mo26207a(context, f, this.f36605k, this.f36598d.f36527u, this.f36598d.f36512f, this.f36598d.f36528v, this.f36598d.f36531y.f36565c, this.f36598d.f36515i, this.f36598d.f36526t.mo26319a(this.f36598d.f36523q), mo26209c(), m28592i(), m28593j(), m28597n(), this.f36598d.f36510d, mo26212f(), this.f36598d.f36531y.f36569g, this.f36598d.f36531y.f36570h, this.f36598d.f36531y.f36571i, this.f36598d.f36531y.f36572j);
        }
        return this.f36608n;
    }

    /* renamed from: a */
    public static synchronized void m28590a(C14008i iVar) {
        synchronized (C14017k.class) {
            if (f36595b != null) {
                C13697a.m27684b(f36594a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f36595b = new C14017k(iVar);
        }
    }

    private C14017k(C14008i iVar) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ImagePipelineConfig()");
        }
        this.f36598d = (C14008i) C13689i.m27652a(iVar);
        this.f36597c = new C14163ay(iVar.f36515i.mo26178e());
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* renamed from: a */
    public static synchronized void m28589a(Context context) {
        synchronized (C14017k.class) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ImagePipelineFactory#initialize");
            }
            m28590a(C14008i.m28571a(context).mo26206a());
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: a */
    private static C13946f m28586a(C14067ac acVar, C14056f fVar) {
        if (VERSION.SDK_INT >= 21) {
            return new C13941a(acVar.mo26320a());
        }
        if (VERSION.SDK_INT >= 11) {
            return new C13945e(new C13942b(acVar.mo26323d()), fVar);
        }
        return new C13943c();
    }

    /* renamed from: a */
    private static C14056f m28588a(C14067ac acVar, boolean z) {
        if (VERSION.SDK_INT >= 26) {
            int c = acVar.mo26322c();
            return new C14055e(acVar.mo26320a(), c, new C0798c(c));
        } else if (VERSION.SDK_INT >= 21) {
            int c2 = acVar.mo26322c();
            return new C14051a(acVar.mo26320a(), c2, new C0798c(c2));
        } else if (!z || VERSION.SDK_INT >= 19) {
            return new C14054d(acVar.mo26321b());
        } else {
            return new C14053c();
        }
    }
}
