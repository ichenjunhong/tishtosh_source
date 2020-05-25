package com.p683ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.CDNLog;
import com.p683ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.toutiao.proxyserver.p2609a.C51798c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.video.preload.f */
public final class C48083f {

    /* renamed from: q */
    public static final String f120829q = f120829q;

    /* renamed from: r */
    public static final String f120830r = f120830r;

    /* renamed from: s */
    public static final List<String> f120831s = C52575l.m112099b((Object[]) new String[]{"snssdk.com", "amemv.com", "tiktokv.com", "musical.ly"});

    /* renamed from: t */
    public static final C48084a f120832t = new C48084a(null);

    /* renamed from: a */
    public String f120833a;

    /* renamed from: b */
    public String f120834b;

    /* renamed from: c */
    public String f120835c;

    /* renamed from: d */
    public String f120836d;

    /* renamed from: e */
    public String f120837e;

    /* renamed from: f */
    public String f120838f;

    /* renamed from: g */
    public String f120839g;

    /* renamed from: h */
    public String f120840h;

    /* renamed from: i */
    public long f120841i;

    /* renamed from: j */
    public long f120842j;

    /* renamed from: k */
    public Map<String, String> f120843k;

    /* renamed from: l */
    public int f120844l;

    /* renamed from: m */
    public int f120845m;

    /* renamed from: n */
    public int f120846n;

    /* renamed from: o */
    public long f120847o;

    /* renamed from: p */
    public int f120848p;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.f$a */
    public static final class C48084a {
        private C48084a() {
        }

        /* renamed from: a */
        public static String m104140a() {
            return C48083f.f120829q;
        }

        /* renamed from: b */
        public static String m104141b() {
            return C48083f.f120830r;
        }

        public /* synthetic */ C48084a(C52707g gVar) {
            this();
        }
    }

    public C48083f() {
        this.f120845m = -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestInfo(key=");
        sb.append(this.f120833a);
        sb.append(", hostName=");
        sb.append(this.f120834b);
        sb.append(", dnsAddr=");
        sb.append(this.f120835c);
        sb.append(", originUrl=");
        sb.append(this.f120836d);
        sb.append(", finalUrl=");
        sb.append(this.f120837e);
        sb.append(", localIp=");
        sb.append(this.f120838f);
        sb.append(", remoteIp=");
        sb.append(this.f120839g);
        sb.append(", userAgent=");
        sb.append(this.f120840h);
        sb.append(", duration=");
        sb.append(this.f120841i);
        sb.append(", size=");
        sb.append(this.f120842j);
        sb.append(", headers=");
        sb.append(this.f120843k);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m104139a(String str) {
        C52711k.m112240b(str, "url");
        for (String b : f120831s) {
            if (C52830p.m112456b((CharSequence) str, (CharSequence) b, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public C48083f(DataLoaderCDNLog dataLoaderCDNLog) {
        C52711k.m112240b(dataLoaderCDNLog, "cdnLog");
        this();
        this.f120833a = dataLoaderCDNLog.fileKey;
        this.f120834b = dataLoaderCDNLog.host;
        this.f120837e = dataLoaderCDNLog.url;
        this.f120839g = dataLoaderCDNLog.serverIp;
        this.f120842j = dataLoaderCDNLog.contentLength;
        this.f120841i = dataLoaderCDNLog.reqEndT - dataLoaderCDNLog.reqStartT;
        this.f120843k = new HashMap();
        if (!TextUtils.isEmpty(dataLoaderCDNLog.xCache)) {
            Map<String, String> map = this.f120843k;
            if (map != null) {
                ((HashMap) map).put(f120829q, dataLoaderCDNLog.xCache);
            } else {
                throw new C52857u("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            }
        }
        if (!TextUtils.isEmpty(dataLoaderCDNLog.xMCache)) {
            Map<String, String> map2 = this.f120843k;
            if (map2 != null) {
                ((HashMap) map2).put(f120830r, dataLoaderCDNLog.xMCache);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        }
    }

    public C48083f(CDNLog cDNLog) {
        C52711k.m112240b(cDNLog, "cdnLog");
        this();
        this.f120833a = cDNLog.fileKey;
        this.f120834b = cDNLog.host;
        this.f120837e = cDNLog.finalUrl;
        this.f120844l = cDNLog.statusCode;
        this.f120839g = cDNLog.serverIp;
        this.f120842j = cDNLog.contentLength;
        this.f120847o = cDNLog.ttfb;
        this.f120841i = cDNLog.reqEndT - cDNLog.reqStartT;
        this.f120843k = new HashMap();
        if (!TextUtils.isEmpty(cDNLog.xCache)) {
            Map<String, String> map = this.f120843k;
            if (map != null) {
                ((HashMap) map).put(f120829q, cDNLog.xCache);
            } else {
                throw new C52857u("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            }
        }
        if (!TextUtils.isEmpty(cDNLog.xMCache)) {
            Map<String, String> map2 = this.f120843k;
            if (map2 != null) {
                ((HashMap) map2).put(f120830r, cDNLog.xMCache);
            } else {
                throw new C52857u("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            }
        }
        String str = cDNLog.oriUrl;
        C52711k.m112236a((Object) str, "cdnLog.oriUrl");
        if (m104139a(str)) {
            this.f120848p = cDNLog.isRedirect;
        }
    }

    public C48083f(C51798c cVar) {
        C52711k.m112240b(cVar, "requestModel");
        this();
        this.f120833a = cVar.f129246a;
        this.f120834b = cVar.f129247b;
        this.f120835c = cVar.f129248c;
        this.f120836d = cVar.f129249d;
        this.f120837e = cVar.f129250e;
        this.f120838f = cVar.f129251f;
        this.f120839g = cVar.f129252g;
        this.f120840h = cVar.f129253h;
        this.f120841i = cVar.f129254i;
        this.f120842j = (long) cVar.f129255j;
        this.f120843k = cVar.f129256k;
        this.f120844l = cVar.f129257l;
        this.f120845m = cVar.f129258m;
        this.f120846n = cVar.f129259n;
        if (!TextUtils.equals(cVar.f129249d, cVar.f129250e)) {
            String str = cVar.f129249d;
            C52711k.m112236a((Object) str, "requestModel.originUrl");
            if (m104139a(str)) {
                this.f120848p = 1;
            }
        }
    }
}
