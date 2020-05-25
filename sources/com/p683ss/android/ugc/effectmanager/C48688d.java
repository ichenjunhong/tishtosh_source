package com.p683ss.android.ugc.effectmanager;

import android.os.SystemClock;
import com.bef.effectsdk.RequirementResourceMapper;
import com.p683ss.android.ugc.effectmanager.C48580c.C48586a;
import com.p683ss.android.ugc.effectmanager.common.C48590a;
import com.p683ss.android.ugc.effectmanager.common.C48633d;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48591a;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48600g;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48631g;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48657k;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48693a;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a;
import com.p683ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p683ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import com.p683ss.android.ugc.effectmanager.p2432c.C48588a;
import com.p683ss.android.ugc.effectmanager.p2432c.C48589b;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.d */
public final class C48688d implements C48693a {

    /* renamed from: a */
    C48906m f122343a;

    /* renamed from: b */
    private C48564a f122344b;

    /* renamed from: c */
    private C48644a f122345c;

    /* renamed from: d */
    private C48589b f122346d;

    /* renamed from: e */
    private C48600g f122347e;

    /* renamed from: f */
    private C48586a f122348f;

    /* renamed from: g */
    private final C48566b f122349g;

    /* renamed from: h */
    private C48642c f122350h;

    /* renamed from: i */
    private C48631g f122351i;

    /* renamed from: j */
    private final Object f122352j = new Object();

    /* renamed from: com.ss.android.ugc.effectmanager.d$a */
    class C48689a extends C48657k<C48749e> {

        /* renamed from: a */
        C48657k<C48749e> f122353a;

        /* renamed from: b */
        C48694b f122354b;

        /* renamed from: a */
        public final void mo96239a() {
            try {
                mo96240a(this);
                C48688d.this.mo96287b(this.f122354b);
                this.f122353a.mo96239a();
            } catch (RuntimeException e) {
                mo96242a((C48657k<T>) this, new C48649d((Exception) e));
                mo96245b(this);
            } catch (Throwable th) {
                mo96245b(this);
                throw th;
            }
        }

        public C48689a(C48657k<C48749e> kVar, C48694b bVar) {
            this.f122353a = kVar;
            this.f122354b = bVar;
        }
    }

    /* renamed from: a */
    private static String m105356a(String str) {
        return C48633d.m105242a(str);
    }

    /* renamed from: a */
    private boolean m105358a(String[] strArr) {
        for (String c : strArr) {
            if (!m105360c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private boolean m105360c(String str) {
        C48564a aVar = this.f122344b;
        StringBuilder sb = new StringBuilder("model/");
        sb.append(str);
        return aVar.mo96083a(sb.toString());
    }

    /* renamed from: a */
    public final C48657k<C48749e> mo59209a(C48694b bVar) {
        C48762a aVar = new C48762a(this.f122345c, this.f122351i, this.f122350h, this.f122349g.f122060m, this.f122349g.f122061n, this.f122349g.f122058k.f122954G);
        return new C48689a(aVar.mo59209a(bVar), bVar);
    }

    /* renamed from: b */
    private String m105359b(String str) {
        for (C48905a aVar : this.f122343a.mo96717a().f123052a.mo96217a()) {
            if (aVar.mo96709a().equals(str)) {
                return aVar.f123053a.getVersion();
            }
        }
        StringBuilder sb = new StringBuilder("Can not find compatible version from server");
        sb.append(str);
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo96287b(C48694b bVar) {
        List requirements = bVar.f122357a.getRequirements();
        if (requirements == null) {
            requirements = Collections.EMPTY_LIST;
        }
        if (requirements != null && !requirements.isEmpty()) {
            HashSet hashSet = new HashSet(Arrays.asList(RequirementResourceMapper.m7540a((String[]) requirements.toArray(new String[requirements.size()]))));
            String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
            synchronized (this.f122352j) {
                try {
                    m105357a(bVar, mo96286a(strArr, this.f122343a.mo96717a()));
                } catch (RuntimeException e) {
                    if (!m105358a(strArr)) {
                        throw e;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<ModelInfo> mo96286a(String[] strArr, C48904l lVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String a = m105356a(str);
            String b = m105359b(a);
            if (!m105360c(str) || new BigDecimal(C48633d.m105243b(str)).compareTo(new BigDecimal(b)) != 0) {
                LocalModelInfo a2 = this.f122347e.mo96144a(a);
                if (a2 == null || !a2.getVersion().equals(b)) {
                    ExtendedUrlModel a3 = lVar.mo96708a(a);
                    ModelInfo modelInfo = new ModelInfo();
                    modelInfo.setName(a);
                    modelInfo.setVersion(b);
                    modelInfo.setFile_url(a3);
                    arrayList.add(modelInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m105357a(C48694b bVar, Collection<ModelInfo> collection) {
        String str;
        for (ModelInfo modelInfo : collection) {
            C48910p pVar = new C48910p(SystemClock.uptimeMillis());
            try {
                if (this.f122348f != null) {
                    this.f122348f.mo80688a(bVar.f122357a, modelInfo);
                }
                long currentTimeMillis = System.currentTimeMillis();
                long a = this.f122346d.mo96141a(modelInfo, this.f122349g.f122063p) / ((long) C48590a.f122161a);
                modelInfo.setTotalSize(a);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (this.f122350h != null) {
                    C48642c cVar = this.f122350h;
                    String str2 = "resource_download_success_rate";
                    C48670h a2 = C48670h.m105314a().mo96255a("app_id", this.f122349g.f122060m).mo96255a("access_key", this.f122349g.f122061n).mo96254a("duration", Long.valueOf(currentTimeMillis2));
                    String str3 = "resource_name";
                    if (modelInfo == null) {
                        str = "";
                    } else {
                        str = modelInfo.getName();
                    }
                    cVar.mo59187a(str2, 0, a2.mo96255a(str3, str).mo96255a("resource_type", this.f122349g.f122063p.toString()).mo96254a("size", Long.valueOf(a)).mo96256b());
                }
                if (this.f122348f != null) {
                    this.f122348f.mo80689a(bVar.f122357a, modelInfo, SystemClock.uptimeMillis() - pVar.f123060a);
                }
            } catch (RuntimeException e) {
                C48649d dVar = new C48649d((Exception) e);
                String str4 = (String) modelInfo.getFile_url().getUrlList().get(0);
                String str5 = "";
                try {
                    str5 = InetAddress.getByName(new URL(str4).getHost()).getHostAddress();
                } catch (MalformedURLException | UnknownHostException unused) {
                }
                if (this.f122350h != null) {
                    this.f122350h.mo59187a("resource_download_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122349g.f122060m).mo96255a("access_key", this.f122349g.f122061n).mo96255a("resource_name", modelInfo.getName()).mo96255a("resource_type", this.f122349g.f122063p.toString()).mo96255a("error_msg", e.getMessage()).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("download_url", str4).mo96255a("host_ip", str5).mo96256b());
                }
                if (this.f122348f != null) {
                    this.f122348f.mo80690a(bVar.f122357a, modelInfo, (Exception) e);
                    throw e;
                }
            }
        }
    }

    public C48688d(C48566b bVar, C48564a aVar, C48600g gVar, C48644a aVar2, C48906m mVar, C48586a aVar3) {
        this.f122349g = bVar;
        this.f122350h = bVar.f122062o;
        this.f122344b = aVar;
        this.f122345c = aVar2;
        this.f122343a = mVar;
        this.f122347e = gVar;
        this.f122351i = bVar.f122058k.f122953F;
        if (bVar.f122058k.f122954G) {
            this.f122346d = new C48588a((C48591a) this.f122347e, aVar2, bVar.f122064q);
        } else {
            this.f122346d = new C48908n((C48887f) this.f122347e, aVar2);
        }
        this.f122348f = aVar3;
    }
}
