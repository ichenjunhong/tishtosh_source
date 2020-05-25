package com.p683ss.android.ugc.effectmanager.effect.p2443b;

import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48631g;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48634a;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.b.a */
public final class C48695a implements C48631g {

    /* renamed from: a */
    public Effect f122360a;

    /* renamed from: b */
    public C48644a f122361b;

    /* renamed from: a */
    public final InputStream mo96142a(C48605b bVar) {
        C52711k.m112240b(bVar, "request");
        return this.f122361b.mo96221a(bVar);
    }

    public C48695a(Effect effect, C48644a aVar) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(aVar, "effectNetWorker");
        this.f122360a = effect;
        this.f122361b = aVar;
    }

    /* renamed from: a */
    public final String mo96143a(InputStream inputStream, long j, C48625b bVar) {
        C52711k.m112240b(inputStream, "inputStream");
        String parent = new File(this.f122360a.getZipPath()).getParent();
        StringBuilder sb = new StringBuilder("writeToDisk Thread=");
        Thread currentThread = Thread.currentThread();
        C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        C48593c a = C48594a.m105132a();
        C52711k.m112236a((Object) parent, "dirPath");
        if (a.mo96146a(parent) instanceof C48596d) {
            C48596d dVar = (C48596d) C48594a.m105132a().mo96146a(parent);
            if (dVar != null) {
                Effect effect = this.f122360a;
                UrlModel fileUrl = this.f122360a.getFileUrl();
                C52711k.m112236a((Object) fileUrl, "effect.fileUrl");
                dVar.mo96150a(effect, inputStream, fileUrl.getUri(), j, bVar);
            }
        } else {
            String a2 = C48675k.m105341a(C48669g.m105305a(inputStream, this.f122360a.getZipPath(), j, bVar));
            UrlModel fileUrl2 = this.f122360a.getFileUrl();
            C52711k.m112236a((Object) fileUrl2, "effect.fileUrl");
            if (!C52711k.m112239a((Object) a2, (Object) fileUrl2.getUri())) {
                C48671i.f122310a.mo96260b(this.f122360a.getZipPath());
                StringBuilder sb2 = new StringBuilder("downloadMD5: ");
                sb2.append(a2);
                sb2.append(" expectMD5:");
                UrlModel fileUrl3 = this.f122360a.getFileUrl();
                C52711k.m112236a((Object) fileUrl3, "effect.fileUrl");
                sb2.append(fileUrl3.getUri());
                throw new C48634a(sb2.toString());
            }
        }
        String zipPath = this.f122360a.getZipPath();
        C52711k.m112236a((Object) zipPath, "effect.zipPath");
        return zipPath;
    }
}
