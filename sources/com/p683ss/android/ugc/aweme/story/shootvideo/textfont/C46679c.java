package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.p582g.p583a.p593e.C10022a;
import com.google.p1057b.p1058a.C17437s;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.c */
public class C46679c {

    /* renamed from: a */
    public static final String[] f117752a = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: f */
    private static C46679c f117753f;

    /* renamed from: b */
    public Map<String, C46678b> f117754b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c */
    Map<String, Typeface> f117755c = new ConcurrentHashMap();

    /* renamed from: d */
    public String f117756d = "default";

    /* renamed from: e */
    C29252f f117757e;

    /* renamed from: g */
    private String f117758g = "default";

    /* renamed from: e */
    private static boolean m101294e(int i) {
        return i == 1;
    }

    /* renamed from: f */
    public C46678b mo93638f() {
        return (C46678b) this.f117754b.get(this.f117756d);
    }

    private C46679c() {
    }

    /* renamed from: a */
    public static C46679c m101291a() {
        if (f117753f == null) {
            synchronized (C46679c.class) {
                if (f117753f == null) {
                    f117753f = new C46679c();
                }
            }
        }
        return f117753f;
    }

    /* renamed from: d */
    public final Typeface mo93634d() {
        if (this.f117755c.get(this.f117756d) != null) {
            return (Typeface) this.f117755c.get(this.f117756d);
        }
        return Typeface.DEFAULT_BOLD;
    }

    /* renamed from: e */
    public final int mo93637e() {
        C46678b bVar = (C46678b) this.f117754b.get(this.f117756d);
        if (bVar != null) {
            return bVar.f117748f;
        }
        return 0;
    }

    /* renamed from: b */
    public final List<C46678b> mo93629b() {
        boolean z;
        if (this.f117754b.size() == 0) {
            return new ArrayList();
        }
        for (C46678b bVar : this.f117754b.values()) {
            if (bVar != null) {
                if (bVar == null || TextUtils.isEmpty(bVar.f117747e) || this.f117755c.get(bVar.f117747e) == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bVar.f117750h = 1;
                } else {
                    Typeface e = m101293e(bVar.f117749g);
                    if (e != null) {
                        this.f117755c.put(bVar.f117747e, e);
                        bVar.f117750h = 1;
                    } else {
                        bVar.f117750h = 2;
                    }
                }
            }
        }
        return new ArrayList(this.f117754b.values());
    }

    /* renamed from: c */
    public final String mo93633c() {
        List b = mo93629b();
        if (C10022a.m20170a(b) || !((C46678b) b.get(0)).mo93620b()) {
            return null;
        }
        return ((C46678b) b.get(0)).f117747e;
    }

    /* renamed from: b */
    public final String mo93628b(int i) {
        if (m101294e(i)) {
            return this.f117758g;
        }
        return this.f117756d;
    }

    /* renamed from: d */
    public final C46678b mo93636d(int i) {
        return (C46678b) this.f117754b.get(mo93628b(i));
    }

    /* renamed from: e */
    private static Typeface m101293e(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        try {
            return Typeface.createFromFile(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C46678b mo93627b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (C46678b) this.f117754b.get(str);
    }

    /* renamed from: a */
    public final String mo93622a(Typeface typeface) {
        for (String str : this.f117755c.keySet()) {
            if (typeface != null && typeface.equals(this.f117755c.get(str))) {
                return str;
            }
        }
        return "default";
    }

    /* renamed from: b */
    public final void mo93630b(Context context) {
        C0013i.m16a((Callable<TResult>) new C46684e<TResult>(this, context));
    }

    /* renamed from: c */
    public final Typeface mo93631c(int i) {
        if (!m101294e(i)) {
            return mo93634d();
        }
        if (this.f117755c.get(this.f117758g) != null) {
            return (Typeface) this.f117755c.get(this.f117758g);
        }
        return Typeface.DEFAULT_BOLD;
    }

    /* renamed from: d */
    public final Typeface mo93635d(String str) {
        if (TextUtils.isEmpty(str) || this.f117754b.size() == 0) {
            return null;
        }
        for (C46678b bVar : this.f117754b.values()) {
            if (str.equals(bVar.f117743a)) {
                return mo93632c(bVar.f117747e);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final Typeface mo93632c(String str) {
        if (TextUtils.isEmpty(str) || this.f117755c.size() == 0) {
            return null;
        }
        Typeface typeface = (Typeface) this.f117755c.get(str);
        if (typeface == null && this.f117754b.get(str) != null) {
            typeface = m101293e(((C46678b) this.f117754b.get(str)).f117749g);
            if (typeface != null) {
                this.f117755c.put(str, typeface);
            }
        }
        return typeface;
    }

    /* renamed from: a */
    public final void mo93623a(int i) {
        List b = mo93629b();
        if (!C10022a.m20170a(b) && ((C46678b) b.get(0)).mo93620b()) {
            mo93625a(((C46678b) b.get(0)).f117747e, i);
        }
    }

    /* renamed from: a */
    public final C46678b mo93621a(Effect effect) {
        File[] listFiles;
        try {
            C46678b bVar = (C46678b) C39629l.m88232a().mo58566D().mo34884a(effect.getExtra(), C46678b.class);
            if (!TextUtils.isEmpty(bVar.f117747e)) {
                C46678b bVar2 = (C46678b) this.f117754b.get(bVar.f117747e);
                if (bVar2 == null) {
                    this.f117754b.put(bVar.f117747e, bVar);
                } else {
                    bVar2.f117747e = bVar.f117747e;
                    bVar2.f117743a = bVar.f117743a;
                    bVar2.f117748f = bVar.f117748f;
                    bVar2.f117744b = bVar.f117744b;
                    bVar2.f117745c = bVar.f117745c;
                    bVar2.f117746d = bVar.f117746d;
                    bVar = bVar2;
                }
                bVar.f117751i = effect;
                if (this.f117755c.get(bVar.f117747e) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C50200d.m108346a(effect.getUnzipPath())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(effect.getUnzipPath());
                    sb.append(File.separator);
                    sb.append(bVar.f117747e);
                    Typeface e = m101293e(sb.toString());
                    if (e != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(effect.getUnzipPath());
                        sb2.append(File.separator);
                        sb2.append(bVar.f117747e);
                        bVar.f117749g = sb2.toString();
                        bVar.f117750h = 1;
                        this.f117755c.put(bVar.f117747e, e);
                        m101292a(bVar, true, null);
                        return bVar;
                    }
                    for (File file : new File(effect.getUnzipPath()).listFiles()) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json")) {
                            Typeface e2 = m101293e(file.getAbsolutePath());
                            if (e2 != null) {
                                bVar.f117749g = file.getAbsolutePath();
                                bVar.f117750h = 1;
                                this.f117755c.put(bVar.f117747e, e2);
                                m101292a(bVar, true, null);
                                return bVar;
                            }
                        }
                    }
                }
            }
        } catch (Exception e3) {
            StringBuilder sb3 = new StringBuilder("parseTextFontStyleData err: ");
            sb3.append(e3.getMessage());
            C45407ay.m98971b(sb3.toString());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo93624a(Context context) {
        if (context != null) {
            if (this.f117757e == null) {
                this.f117757e = C29242c.m68869a(context.getApplicationContext(), C46683d.f117763a);
            }
            this.f117757e.mo59143b("textfont", false, (C48702g) new C48702g() {
                /* renamed from: a */
                public final void mo8637a(C48649d dVar) {
                    StringBuilder sb = new StringBuilder("prefetch fail err: ");
                    sb.append(dVar.f122280b);
                    C45407ay.m98971b(sb.toString());
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    for (Effect a : ((EffectChannelResponse) obj).getAllCategoryEffects()) {
                        C46679c.this.mo93621a(a);
                    }
                    C46679c cVar = C46679c.this;
                    for (String str : cVar.f117754b.keySet()) {
                        if (cVar.f117755c.get(str) == null) {
                            StringBuilder sb = new StringBuilder("text font ");
                            sb.append(str);
                            sb.append(" is null");
                            C45407ay.m98973d(sb.toString());
                            cVar.f117757e.mo59143b("textfont", true, (C48702g) new C48702g() {
                                /* renamed from: a */
                                public final void mo8637a(C48649d dVar) {
                                    StringBuilder sb = new StringBuilder("textFontDownload err: ");
                                    sb.append(dVar.f122280b);
                                    C45407ay.m98971b(sb.toString());
                                }

                                /* renamed from: a */
                                public final /* synthetic */ void mo8638a(Object obj) {
                                    for (Effect a : ((EffectChannelResponse) obj).getAllCategoryEffects()) {
                                        C46679c.this.mo93621a(a);
                                    }
                                }
                            });
                            return;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo93626a(String str) {
        if (!TextUtils.isEmpty(str) && this.f117755c.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93625a(String str, int i) {
        if (m101294e(i)) {
            this.f117758g = str;
        } else {
            this.f117756d = str;
        }
    }

    /* renamed from: a */
    public static void m101292a(C46678b bVar, boolean z, Exception exc) {
        String str;
        String str2;
        C23088c cVar;
        String str3;
        int i;
        if (bVar != null) {
            if (z) {
                str2 = "font_resource_download_error_state";
                C23088c a = C23088c.m56631a().mo47824a("font_title", bVar.f117744b);
                str3 = "font_name";
                str = bVar.f117747e;
                cVar = a;
                i = 0;
            } else {
                str2 = "font_resource_download_error_state";
                i = 1;
                cVar = C23088c.m56631a().mo47824a("font_title", bVar.f117744b).mo47824a("font_name", bVar.f117747e);
                str3 = "exception";
                if (exc == null) {
                    str = "";
                } else {
                    str = C17437s.m42688b(exc);
                }
            }
            C23569o.m57776a(str2, i, cVar.mo47824a(str3, str).mo47825b());
        }
    }
}
