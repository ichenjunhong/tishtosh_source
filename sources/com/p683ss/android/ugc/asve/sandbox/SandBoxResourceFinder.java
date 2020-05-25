package com.p683ss.android.ugc.asve.sandbox;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.C2592c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20370d;
import java.util.HashMap;
import java.util.HashSet;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxResourceFinder */
public final class SandBoxResourceFinder implements C2592c {
    public static final C20582a Companion = new C20582a(null);
    private final AssetResourceFinder assetResourceFinder;
    private final HashSet<Long> initialledHandler;
    private final C20800m remoteFinder;
    private final HashMap<String, String> urlMap;

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxResourceFinder$a */
    public static final class C20582a {
        private C20582a() {
        }

        public /* synthetic */ C20582a(C52707g gVar) {
            this();
        }
    }

    public final native long createResourceFinder(long j);

    public final native String nativeGetResourceUrl(long j, long j2, String str, String str2);

    public final native void releaseResourceFinder(long j);

    static {
        C11511a.m23579a("asve", C20315a.m50093b());
    }

    public final long createNativeResourceFinder(long j) {
        this.assetResourceFinder.createNativeResourceFinder(j);
        return createResourceFinder(j);
    }

    public final void release(long j) {
        this.assetResourceFinder.release(j);
        this.remoteFinder.mo43731b(j);
        releaseResourceFinder(j);
    }

    public final void releaseLoacl(long j) {
        this.assetResourceFinder.release(j);
        releaseResourceFinder(j);
    }

    public SandBoxResourceFinder(C20800m mVar) {
        C52711k.m112240b(mVar, "remoteFinder");
        AssetManager assets = C20315a.m50093b().getAssets();
        C52711k.m112236a((Object) assets, "AS.applicationContext.assets");
        this(mVar, assets, "");
    }

    public SandBoxResourceFinder(C20800m mVar, AssetManager assetManager, String str) {
        C52711k.m112240b(mVar, "remoteFinder");
        C52711k.m112240b(assetManager, "assetManager");
        C52711k.m112240b(str, "downloadPath");
        this.remoteFinder = mVar;
        this.urlMap = new HashMap<>(16);
        this.initialledHandler = new HashSet<>(8);
        this.assetResourceFinder = new AssetResourceFinder(assetManager, str);
    }

    public final String getResourceUrl(long j, String str, String str2) {
        C52711k.m112240b(str, "dir");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
        C20370d b = C20315a.m50092a().mo43148b();
        StringBuilder sb = new StringBuilder("getResourceUrl before:  dir:");
        sb.append(str);
        sb.append("// path ");
        sb.append(str2);
        b.mo42962c(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(j));
        sb2.append(str);
        sb2.append(str2);
        String sb3 = sb2.toString();
        String str3 = (String) this.urlMap.get(sb3);
        if (!TextUtils.isEmpty(str3)) {
            C20370d b2 = C20315a.m50092a().mo43148b();
            StringBuilder sb4 = new StringBuilder("getResourceUrl cache: ");
            if (str3 == null) {
                C52711k.m112234a();
            }
            sb4.append(str3);
            b2.mo42962c(sb4.toString());
            return str3;
        }
        if (!this.initialledHandler.contains(Long.valueOf(j))) {
            this.remoteFinder.mo43729a(j);
            this.initialledHandler.add(Long.valueOf(j));
        }
        C20315a.m50092a().mo43148b().mo42962c("getResourceUrl invoke native function  nativePtr ");
        String a = this.remoteFinder.mo43730a(j, str, str2);
        if (a == null) {
            C20315a.m50092a().mo43148b().mo42961b("path is null ,check !!!");
            return "";
        }
        this.urlMap.put(sb3, a);
        C20370d b3 = C20315a.m50092a().mo43148b();
        StringBuilder sb5 = new StringBuilder("getResourceUrl after: ");
        sb5.append(a);
        b3.mo42962c(sb5.toString());
        return a;
    }
}
