package com.p683ss.android.ugc.effectmanager.common.p2433a;

import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48615b;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.h */
public final class C48601h extends C48606a {

    /* renamed from: a */
    public static C48598f f122179a;

    /* renamed from: b */
    public static String f122180b;

    /* renamed from: c */
    public static ArrayList<String> f122181c;

    /* renamed from: d */
    public static final C48602a f122182d = new C48602a(null);

    /* renamed from: h */
    private static final C48603b f122183h = new C48603b();

    /* renamed from: g */
    private final C48641b f122184g;

    /* renamed from: com.ss.android.ugc.effectmanager.common.a.h$a */
    public static final class C48602a {
        private C48602a() {
        }

        public /* synthetic */ C48602a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.a.h$b */
    public static final class C48603b implements C48615b {

        /* renamed from: a */
        private final List<String> f122185a = C52575l.m112099b((Object[]) new String[]{"52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781"});

        /* renamed from: b */
        private final List<String> f122186b = C52575l.m112099b((Object[]) new String[]{"52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226"});

        /* JADX INFO: used method not loaded: d.a.n.b(java.lang.Object[]):null, types can be incorrect */
        C48603b() {
        }

        /* renamed from: b */
        private static boolean m105153b(String str) {
            C52711k.m112240b(str, "code");
            if (TextUtils.isEmpty(str) || !C52711k.m112239a((Object) str, (Object) C48601h.f122180b)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo96162a(String str) {
            C52711k.m112240b(str, "key");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C48598f fVar = C48601h.f122179a;
            if (fVar != null) {
                Effect e = fVar.mo96159e(str);
                if (e != null) {
                    if (m105153b("BR") && this.f122185a.contains(e.getEffectId())) {
                        return true;
                    }
                    if (m105153b("RU") && this.f122186b.contains(e.getEffectId())) {
                        return true;
                    }
                }
                ArrayList<String> arrayList = C48601h.f122181c;
                if (arrayList == null || !arrayList.contains(str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo96151a(Pattern pattern) {
        super.mo96151a(pattern);
        C48598f fVar = f122179a;
        if (fVar != null) {
            fVar.mo96151a(pattern);
        }
    }

    public C48601h(C48890g gVar) {
        C52711k.m112240b(gVar, "effectConfiguration");
        File file = gVar.f122964j;
        C52711k.m112236a((Object) file, "effectConfiguration.effectDir");
        String absolutePath = file.getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "effectConfiguration.effectDir.absolutePath");
        super(absolutePath, 0, 0, 115343360, f122183h, 6, null);
        f122179a = new C48598f(gVar);
        f122180b = gVar.f122965k;
        f122181c = gVar.f122974t;
        this.f122184g = gVar.f122976v;
    }

    /* renamed from: a */
    public final void mo96161a(Effect effect, InputStream inputStream, String str, long j, C48625b bVar) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(inputStream, "effectResourceInputStream");
        String f = C48608a.m105182f(effect.getId());
        StringBuilder sb = new StringBuilder();
        sb.append(mo96167a());
        sb.append(File.separator);
        sb.append(f);
        effect.setUnzipPath(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f);
        sb2.append(".zip");
        String f2 = C48608a.m105182f(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(mo96167a());
        sb3.append(File.separator);
        sb3.append(f2);
        effect.setZipPath(sb3.toString());
        C52711k.m112236a((Object) f2, "effectName");
        if (((Boolean) mo96166a(f2, inputStream, str, j, bVar).getSecond()).booleanValue()) {
            C48598f fVar = f122179a;
            if (fVar != null) {
                fVar.mo96158a(effect);
            }
        }
    }
}
