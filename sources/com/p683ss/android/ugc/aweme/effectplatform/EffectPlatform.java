package com.p683ss.android.ugc.aweme.effectplatform;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48893h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EffectPlatform */
public class EffectPlatform implements C0183j, C29252f {

    /* renamed from: a */
    public static final File f76569a = new File(C39629l.m88233b().getFilesDir(), "effect");

    /* renamed from: b */
    public static final File f76570b = new File(C39629l.m88233b().getFilesDir(), "pin");

    /* renamed from: e */
    private static ArrayList<String> f76571e;

    /* renamed from: c */
    private C29243d f76572c = new C29243d();

    /* renamed from: d */
    private C48890g f76573d;

    /* renamed from: b */
    public static String m68835b() {
        return C23018b.f61360b;
    }

    /* renamed from: a */
    public final void mo59138a(String str, boolean z, C48702g gVar) {
        m68838g();
        this.f76572c.mo59175a(str, z, gVar);
    }

    /* renamed from: a */
    public final void mo59139a(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
        this.f76572c.mo59182b(str, z, str2, i, i2, lVar);
    }

    /* renamed from: a */
    public final void mo59134a(String str, String str2, boolean z, int i, int i2, int i3, String str3, C48701f fVar) {
        this.f76572c.mo59171a(str, str2, z, i, i2, i3, str3, fVar);
    }

    /* renamed from: a */
    public final void mo59137a(String str, boolean z, int i, int i2, C48708m mVar) {
        m68838g();
        this.f76572c.mo59174a(str, z, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo59130a(String str, String str2, int i, int i2, C48708m mVar) {
        m68838g();
        this.f76572c.mo59167a(str, str2, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo59132a(String str, String str2, C48705j jVar) {
        m68838g();
        this.f76572c.mo59169a(str, str2, jVar);
    }

    /* renamed from: a */
    public final void mo59141a(List<String> list, Map<String, String> map, boolean z, C48704i iVar) {
        m68838g();
        this.f76572c.mo59178a(list, map, z, iVar);
    }

    /* renamed from: a */
    public final void mo59140a(List<String> list, Map<String, String> map, C48703h hVar) {
        m68838g();
        this.f76572c.mo59177a(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo59131a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
        this.f76572c.mo59168a(str, str2, i, i2, map, sVar);
    }

    /* renamed from: a */
    public final void mo59133a(String str, String str2, C48715t tVar) {
        this.f76572c.mo59170a(str, str2, tVar);
    }

    /* renamed from: a */
    public final void mo59136a(String str, List<String> list, String str2, C48710o oVar) {
        this.f76572c.mo59173a(str, list, str2, oVar);
    }

    /* renamed from: a */
    public final void mo59135a(String str, List<String> list, Boolean bool, C48711p pVar) {
        this.f76572c.mo59172a(str, list, bool, pVar);
    }

    /* renamed from: a */
    public final boolean mo59142a(Effect effect) {
        return this.f76572c.mo59179a(effect);
    }

    /* renamed from: a */
    public static String m68834a() {
        return f76569a.getAbsolutePath();
    }

    /* renamed from: d */
    public final void mo59146d() {
        this.f76572c.mo59184c();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void destroy() {
        this.f76572c.mo59180b();
    }

    /* renamed from: e */
    public final C48893h mo59148e() {
        return this.f76572c.f76577b;
    }

    /* renamed from: c */
    public static String m68836c() {
        String j = C39629l.m88232a().mo58588s().mo74164j();
        C39629l.m88232a().mo58588s();
        return j;
    }

    /* renamed from: g */
    private void m68838g() {
        String str;
        if (this.f76573d == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f76573d.f122959e) || TextUtils.equals("0", this.f76573d.f122959e)) {
            C48890g gVar = this.f76573d;
            if (AppLog.getServerDeviceId() == null) {
                str = "0";
            } else {
                str = AppLog.getServerDeviceId();
            }
            gVar.f122959e = str;
        }
    }

    /* renamed from: f */
    public static ArrayList<String> m68837f() {
        String str;
        String str2;
        if (f76571e != null) {
            return f76571e;
        }
        ArrayList arrayList = new ArrayList();
        List<C29059c> list = null;
        try {
            list = C39629l.m88232a().mo58573d().mo80735c();
        } catch (Exception unused) {
        }
        if (list == null) {
            return new ArrayList<>();
        }
        for (C29059c cVar : list) {
            if (!(cVar.mo58735L() == null || cVar.mo58735L().stickers == null)) {
                for (StickerItemModel stickerItemModel : cVar.mo58735L().stickers) {
                    if (TextUtils.isEmpty(stickerItemModel.path)) {
                        C39567as E = C39629l.m88232a().mo58567E();
                        StringBuilder sb = new StringBuilder("InfoStickers_resdir_null:");
                        if (stickerItemModel.stickerId != null) {
                            str2 = stickerItemModel.stickerId;
                        } else {
                            str2 = "";
                        }
                        sb.append(str2);
                        E.mo49432b(sb.toString());
                    } else {
                        arrayList.add(stickerItemModel.path.substring(stickerItemModel.path.lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (!(cVar.f76125C == null || cVar.f76125C.getEffectPointModels() == null)) {
                Iterator it = cVar.f76125C.getEffectPointModels().iterator();
                while (it.hasNext()) {
                    EffectPointModel effectPointModel = (EffectPointModel) it.next();
                    if (TextUtils.isEmpty(effectPointModel.getResDir())) {
                        C39567as E2 = C39629l.m88232a().mo58567E();
                        StringBuilder sb2 = new StringBuilder("EffectListModel_resdir_null:");
                        if (effectPointModel.getKey() != null) {
                            str = effectPointModel.getKey();
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        E2.mo49432b(sb2.toString());
                    } else {
                        arrayList.add(effectPointModel.getResDir().substring(effectPointModel.getResDir().lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (cVar.mo58770ag() != null) {
                String str3 = cVar.mo58770ag().f76194d;
                if (TextUtils.isEmpty(str3)) {
                    C39567as E3 = C39629l.m88232a().mo58567E();
                    StringBuilder sb3 = new StringBuilder("EffectListModel_resdir_null:");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb3.append(str3);
                    E3.mo49432b(sb3.toString());
                } else {
                    arrayList.add(str3.substring(str3.lastIndexOf(File.separator) + 1));
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(new HashSet(arrayList));
        f76571e = arrayList2;
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo59122a(C0184k kVar) {
        kVar.getLifecycle().mo324a(this);
    }

    public EffectPlatform(C48890g gVar) {
        this.f76573d = gVar;
        C29243d dVar = this.f76572c;
        dVar.f76577b = new C48893h();
        dVar.f76576a = dVar.f76577b.mo96688a(gVar);
        boolean z = dVar.f76576a;
    }

    /* renamed from: b */
    public final boolean mo59145b(Effect effect) {
        return this.f76572c.f76577b.mo96693b(effect);
    }

    /* renamed from: a */
    public final void mo59125a(String str) {
        if (this.f76572c != null) {
            this.f76572c.mo59161a(str);
        }
    }

    /* renamed from: a */
    public final void mo59123a(Effect effect, C48705j jVar) {
        m68838g();
        this.f76572c.mo59159a(effect, jVar);
    }

    /* renamed from: a */
    public final void mo59124a(ProviderEffect providerEffect, C48697b bVar) {
        m68838g();
        this.f76572c.mo59160a(providerEffect, bVar);
    }

    /* renamed from: a */
    public final void mo59126a(String str, C48702g gVar) {
        m68838g();
        this.f76572c.mo59162a(str, gVar);
    }

    /* renamed from: a */
    public final void mo59127a(String str, C48706k kVar) {
        this.f76572c.mo59163a(str, kVar);
    }

    /* renamed from: a */
    public final void mo59128a(String str, C48709n nVar) {
        this.f76572c.mo59164a(str, nVar);
    }

    /* renamed from: b */
    public final void mo59143b(String str, boolean z, C48702g gVar) {
        m68838g();
        this.f76572c.mo59181b(str, z, gVar);
    }

    /* renamed from: b */
    public final void mo59144b(List<String> list, Map<String, String> map, C48703h hVar) {
        if (this.f76572c != null) {
            this.f76572c.mo59183b(list, map, hVar);
        }
    }

    /* renamed from: a */
    public final void mo59129a(String str, String str2, int i, int i2, int i3, String str3, C48701f fVar) {
        this.f76572c.mo59165a(str, str2, i, i2, i3, str3, fVar);
    }
}
