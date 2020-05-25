package com.p683ss.android.ugc.effectmanager.common.p2436c;

import android.util.Log;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.c.d */
public final class C48627d {

    /* renamed from: a */
    private C48631g f122255a;

    /* renamed from: b */
    private C48632h f122256b;

    /* renamed from: c */
    private C48630f f122257c;

    /* renamed from: com.ss.android.ugc.effectmanager.common.c.d$a */
    public static final class C48628a {

        /* renamed from: a */
        public C48631g f122258a;

        /* renamed from: b */
        public C48630f f122259b;

        /* renamed from: c */
        public C48632h f122260c;

        /* renamed from: a */
        public final C48627d mo96211a() {
            if (this.f122258a != null) {
                return new C48627d(this, null);
            }
            throw new IllegalArgumentException("handleInputStream is required to setup!");
        }

        /* renamed from: a */
        public final C48628a mo96208a(C48630f fVar) {
            C48628a aVar = this;
            aVar.f122259b = fVar;
            return aVar;
        }

        /* renamed from: a */
        public final C48628a mo96209a(C48631g gVar) {
            C52711k.m112240b(gVar, "downloader");
            C48628a aVar = this;
            aVar.f122258a = gVar;
            return aVar;
        }

        /* renamed from: a */
        public final C48628a mo96210a(C48632h hVar) {
            C52711k.m112240b(hVar, "unZipper");
            C48628a aVar = this;
            aVar.f122260c = hVar;
            return aVar;
        }
    }

    private C48627d(C48628a aVar) {
        C48631g gVar = aVar.f122258a;
        if (gVar == null) {
            C52711k.m112237a("downloader");
        }
        this(gVar, aVar.f122260c, aVar.f122259b);
    }

    /* renamed from: a */
    private final boolean m105232a(String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            new URL(str).toURI();
            m105231a("checkDownloadUrlValid", System.currentTimeMillis() - currentTimeMillis);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public /* synthetic */ C48627d(C48628a aVar, C52707g gVar) {
        this(aVar);
    }

    /* renamed from: a */
    private final void m105231a(String str, long j) {
        String str2;
        StringBuilder sb = new StringBuilder();
        C48630f fVar = this.f122257c;
        if (fVar != null) {
            str2 = fVar.name();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append("-->");
        sb.append(str);
        sb.append(" , cost ");
        sb.append(j);
        sb.append(" mills.");
    }

    /* renamed from: a */
    public final long mo96207a(String str, C48625b bVar) {
        String str2;
        boolean z;
        C52711k.m112240b(str, "downloadUrl");
        new StringBuilder("downloadUrl=").append(str);
        C48629e eVar = new C48629e();
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (m105232a(str)) {
            C48605b bVar2 = new C48605b("GET", str);
            InputStream a = this.f122255a.mo96142a(bVar2);
            if (a == null) {
                eVar.f122261a = System.currentTimeMillis() - currentTimeMillis;
                eVar.f122266f = new C48623a(-1002);
                m105231a("fetchInputStream failed", eVar.f122261a);
                if (bVar != null) {
                    bVar.mo96206a(eVar);
                }
                return -1;
            }
            eVar.f122262b = System.currentTimeMillis() - currentTimeMillis;
            m105231a("fetchInputStream success", eVar.f122261a);
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                str2 = this.f122255a.mo96143a(a, bVar2.f122199c, bVar);
            } catch (Exception e) {
                Log.getStackTraceString(e);
                str2 = null;
            }
            new StringBuilder("downloadFilePath=").append(str2);
            if (str2 != null) {
                j = new File(str2).length();
            }
            eVar.f122265e = j;
            eVar.f122263c = System.currentTimeMillis() - currentTimeMillis2;
            if (j > 0) {
                m105231a("writeToDisk success", eVar.f122263c);
                if (this.f122256b == null) {
                    eVar.f122261a = System.currentTimeMillis() - currentTimeMillis;
                    m105231a("unnecessary to unzip,download success", eVar.f122261a);
                    if (bVar != null) {
                        bVar.mo96206a(eVar);
                    }
                    return j;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                try {
                    C48632h hVar = this.f122256b;
                    if (hVar == null) {
                        C52711k.m112234a();
                    }
                    if (str2 == null) {
                        C52711k.m112234a();
                    }
                    z = hVar.mo96212a(str2);
                } catch (Exception e2) {
                    Log.getStackTraceString(e2);
                    z = false;
                }
                eVar.f122264d = System.currentTimeMillis() - currentTimeMillis3;
                eVar.f122261a = System.currentTimeMillis() - currentTimeMillis;
                if (z) {
                    m105231a("unzip success", eVar.f122264d);
                    m105231a("download success", eVar.f122261a);
                    if (bVar != null) {
                        bVar.mo96206a(eVar);
                    }
                } else {
                    eVar.f122266f = new C48623a(-1004);
                    m105231a("unzip failed", eVar.f122264d);
                    m105231a("download failed", eVar.f122261a);
                    if (bVar != null) {
                        bVar.mo96206a(eVar);
                    }
                }
                return j;
            }
            m105231a("writeToDisk failed", eVar.f122263c);
            eVar.f122261a = System.currentTimeMillis() - currentTimeMillis;
            eVar.f122266f = new C48623a(-1003);
            if (bVar != null) {
                bVar.mo96206a(eVar);
            }
            return j;
        }
        eVar.f122261a = System.currentTimeMillis() - currentTimeMillis;
        eVar.f122266f = new C48623a(-1001);
        m105231a("download failed", eVar.f122261a);
        if (bVar != null) {
            bVar.mo96206a(eVar);
        }
        return -1;
    }

    private C48627d(C48631g gVar, C48632h hVar, C48630f fVar) {
        C52711k.m112240b(gVar, "downloader");
        this.f122255a = gVar;
        this.f122256b = hVar;
        this.f122257c = fVar;
    }
}
