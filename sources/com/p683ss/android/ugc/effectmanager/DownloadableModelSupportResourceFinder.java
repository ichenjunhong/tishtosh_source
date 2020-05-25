package com.p683ss.android.ugc.effectmanager;

import android.text.TextUtils;
import android.util.Log;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.effectmanager.C48580c.C48586a;
import com.p683ss.android.ugc.effectmanager.common.C48633d;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48600g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.io.File;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder */
public class DownloadableModelSupportResourceFinder implements C2592c {
    public static final String TAG = "ResourceFinder";
    private static volatile boolean sLibraryLoaded;
    private final C48906m mArbiter;
    private C48564a mAssetManagerWrapper;
    private AssetResourceFinder mAssetResourceFinder;
    private final C48586a mEventListener;
    C48600g mModelCache;

    private native long nativeCreateResourceFinder(long j);

    public void release(long j) {
        this.mAssetResourceFinder.release(j);
    }

    public boolean isResourceAvailable(String str) {
        if (findResourceUri(str) != null) {
            return true;
        }
        return false;
    }

    private boolean isExactBuiltInResource(String str) {
        C48564a aVar = this.mAssetManagerWrapper;
        StringBuilder sb = new StringBuilder("model/");
        sb.append(str);
        return aVar.mo96083a(sb.toString());
    }

    private void onModelNotFound(String str) {
        StringBuilder sb = new StringBuilder("model not found neither in asset nor disk ");
        sb.append(str);
        RuntimeException runtimeException = new RuntimeException(sb.toString());
        if (this.mEventListener != null) {
            try {
                this.mEventListener.mo80691a((Effect) null, (Exception) runtimeException);
            } catch (Throwable unused) {
            }
        }
    }

    public long createNativeResourceFinder(long j) {
        if (!sLibraryLoaded) {
            C48580c.f122130a.mo80693a("downloadable_model_support");
            sLibraryLoaded = true;
        }
        this.mAssetResourceFinder.createNativeResourceFinder(j);
        return nativeCreateResourceFinder(j);
    }

    public String findResourceUri(String str) {
        boolean z;
        LocalModelInfo a = this.mModelCache.mo96144a(C48633d.m105242a(str));
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a.getUri().toString();
        }
        if (!isExactBuiltInResource(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("asset://model/");
        sb.append(str);
        return sb.toString();
    }

    public static String findResourceUri(String str, String str2) {
        DownloadableModelSupportResourceFinder e = C48580c.m105110b().mo96136e();
        String findResourceUri = e.findResourceUri(str2);
        try {
            String a = C48633d.m105242a(str2);
            LocalModelInfo a2 = e.mModelCache.mo96144a(a);
            if (!e.isExactBuiltInResource(str2)) {
                String a3 = C48675k.m105341a(new File(a2.getUri().getPath()));
                String uri = e.mArbiter.f123055b.mo96708a(a).getUri();
                if (!TextUtils.equals(a3, uri)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" md5 = ");
                    sb.append(a3);
                    sb.append(" expectedMd5 = ");
                    sb.append(uri);
                    e.onModelNotFound(sb.toString());
                    return "asset://md5_error";
                }
            }
        } catch (RuntimeException e2) {
            String stackTraceString = Log.getStackTraceString(e2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(stackTraceString);
            e.onModelNotFound(sb2.toString());
        }
        if (findResourceUri != null) {
            return findResourceUri;
        }
        e.onModelNotFound(str2);
        return "asset://not_found";
    }

    public DownloadableModelSupportResourceFinder(C48906m mVar, C48600g gVar, C48564a aVar, C48586a aVar2) {
        this.mArbiter = mVar;
        this.mModelCache = gVar;
        this.mAssetResourceFinder = new AssetResourceFinder(aVar.f122045a, this.mModelCache.mo96160a());
        this.mAssetManagerWrapper = aVar;
        this.mEventListener = aVar2;
    }
}
