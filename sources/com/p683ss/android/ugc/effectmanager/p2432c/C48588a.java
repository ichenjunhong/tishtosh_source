package com.p683ss.android.ugc.effectmanager.p2432c;

import com.p683ss.android.ugc.effectmanager.C48901i;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48591a;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48627d;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48627d.C48628a;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48630f;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48631g;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.c.a */
public final class C48588a implements C48589b, C48631g {

    /* renamed from: a */
    public ModelInfo f122156a;

    /* renamed from: b */
    public C48901i f122157b;

    /* renamed from: c */
    public C48644a f122158c;

    /* renamed from: d */
    private C48627d f122159d;

    /* renamed from: e */
    private C48591a f122160e;

    /* renamed from: a */
    public final InputStream mo96142a(C48605b bVar) {
        C52711k.m112240b(bVar, "request");
        return this.f122158c.mo96221a(bVar);
    }

    /* renamed from: a */
    public final long mo96141a(ModelInfo modelInfo, C48901i iVar) {
        C52711k.m112240b(modelInfo, "modelInfo");
        C52711k.m112240b(iVar, "fetchModelType");
        this.f122156a = modelInfo;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        this.f122157b = iVar;
        C52711k.m112236a((Object) file_url, "urlModel");
        if (file_url.getUrlList() == null || file_url.getUrlList().isEmpty()) {
            this.f122157b = C48901i.ZIP;
        }
        if (file_url.getZipUrlList() == null || file_url.getZipUrlList().isEmpty()) {
            this.f122157b = C48901i.ORIGIN;
        }
        String str = (String) modelInfo.getFile_url().getUrl(iVar).get(0);
        C48627d dVar = this.f122159d;
        C52711k.m112236a((Object) str, "downloadUrl");
        return dVar.mo96207a(str, (C48625b) null);
    }

    public C48588a(C48591a aVar, C48644a aVar2, C48631g gVar) {
        C52711k.m112240b(aVar, "algorithmModelCache");
        C52711k.m112240b(aVar2, "netWorker");
        this.f122160e = aVar;
        this.f122158c = aVar2;
        C48628a aVar3 = new C48628a();
        if (gVar == null) {
            gVar = this;
        }
        this.f122159d = aVar3.mo96209a(gVar).mo96208a(C48630f.ALGORITHM).mo96211a();
    }

    /* renamed from: a */
    public final String mo96143a(InputStream inputStream, long j, C48625b bVar) {
        C52711k.m112240b(inputStream, "inputStream");
        C48591a aVar = this.f122160e;
        C48588a aVar2 = this;
        if (aVar2.f122157b != null) {
            C48901i iVar = this.f122157b;
            if (iVar == null) {
                C52711k.m112237a("fetchModelType");
            }
            if (aVar2.f122156a != null) {
                ModelInfo modelInfo = this.f122156a;
                if (modelInfo == null) {
                    C52711k.m112237a("modelInfo");
                }
                return aVar.mo96145a(iVar, modelInfo, inputStream);
            }
            throw new IllegalArgumentException("modelInfo is required!");
        }
        throw new IllegalArgumentException("fetchModelType is required!");
    }
}
