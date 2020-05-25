package com.bytedance.p126ad.symphony.provider;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.p126ad.symphony.p127a.C2673a;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p129b.C2682a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2724b;
import com.bytedance.p126ad.symphony.p137g.C2737b.C2738a;
import com.bytedance.p126ad.symphony.p138h.C2739a;
import com.bytedance.p126ad.symphony.p139i.C2742a;
import com.bytedance.p126ad.symphony.p139i.C2747f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ad.symphony.provider.a */
public abstract class C2749a<AD extends C2673a, AM extends C2682a<? extends AD>> implements C2752b<AD> {
    protected C2723a mAdConfig;
    protected AM mAdManager;
    protected Map<String, AD> mAdPool = new ConcurrentHashMap();
    protected Context mContext;
    protected Handler mHandler = new Handler(C2742a.m7828a());
    public Map<String, Runnable> mRunnableMap = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ad.symphony.provider.a$a */
    public static class C2751a {

        /* renamed from: a */
        public int f8303a;

        /* renamed from: b */
        public String f8304b;

        /* renamed from: c */
        public String f8305c;

        public C2751a(int i, String str, String str2) {
            this.f8303a = i;
            this.f8304b = str;
            this.f8305c = str2;
        }
    }

    public static boolean isInvalidAdProvider(int i) {
        return i == -1;
    }

    /* access modifiers changed from: protected */
    public abstract String getTag();

    /* access modifiers changed from: protected */
    public abstract void loadAdAsync(String str, C2724b bVar, C2739a aVar, C2738a aVar2);

    /* access modifiers changed from: protected */
    public void onAdFill(AD ad) {
    }

    public int getProviderId() {
        if (this.mAdConfig == null) {
            return 0;
        }
        return this.mAdConfig.f8227a;
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getTag());
            sb.append(":");
            sb.append(this.mAdPool);
            return sb.toString();
        } catch (Exception unused) {
            getTag();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getTag());
            sb2.append(":error");
            return sb2.toString();
        }
    }

    public static int getRealProviderId(int i) {
        return i / 1000;
    }

    public void setAdConfig(C2723a aVar) {
        if (aVar != null) {
            this.mAdConfig = aVar;
        }
    }

    public String getPlacementId(String str) {
        C2724b a = this.mAdConfig.mo7275a(str);
        if (a == null) {
            return null;
        }
        return a.f8235a;
    }

    /* access modifiers changed from: protected */
    public boolean needPreload(String str) {
        C2747f.m7838a();
        if (!hasValidAd(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void cancelTimeoutCheck(String str) {
        Runnable runnable = (Runnable) this.mRunnableMap.get(str);
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mRunnableMap.remove(runnable);
        }
    }

    public AD getNextAd(String str) {
        AD ad = (C2673a) this.mAdPool.get(str);
        if (ad != null) {
            this.mAdPool.remove(str);
            if (!ad.mo7233b()) {
                onAdFill(ad);
                return ad;
            }
        }
        return null;
    }

    public AD getNextAdWithoutFill(String str) {
        AD ad = (C2673a) this.mAdPool.get(str);
        if (ad == null || ad.mo7233b()) {
            return null;
        }
        return ad;
    }

    public boolean hasValidAd(String str) {
        C2673a aVar = (C2673a) this.mAdPool.get(str);
        if (aVar == null || aVar.mo7233b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void runOnAdThread(Runnable runnable) {
        if (Looper.myLooper() == C2742a.m7828a()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void printAdMap(List<C2676c> list) {
        int i = 0;
        for (C2676c cVar : list) {
            getTag();
            StringBuilder sb = new StringBuilder("list[");
            int i2 = i + 1;
            sb.append(i);
            sb.append("]:");
            sb.append(cVar);
            i = i2;
        }
    }

    /* access modifiers changed from: protected */
    public void addToPool(String str, AD ad) {
        C2747f.m7838a();
        if (ad != null) {
            this.mAdPool.put(str, ad);
        }
    }

    /* access modifiers changed from: protected */
    public void startTimeoutCheck(final String str, final C2738a aVar) {
        C27501 r0 = new Runnable() {
            public final void run() {
                if (aVar != null) {
                    C2747f.m7838a();
                    C2749a.this.getTag();
                    String str = "";
                    C2724b a = C2749a.this.mAdConfig.mo7275a(str);
                    if (a != null) {
                        str = a.f8235a;
                    }
                    aVar.mo7287a(str, "Request Timeout");
                    C2749a.this.mRunnableMap.remove(str);
                }
            }
        };
        this.mRunnableMap.put(str, r0);
        long j = this.mAdConfig.f8229c;
        if (j <= 0) {
            j = 3000;
        }
        this.mHandler.postDelayed(r0, j);
    }

    public C2749a(Context context, C2723a aVar, AM am) {
        this.mContext = context;
        this.mAdConfig = aVar;
        this.mAdManager = am;
    }

    public void tryPreloadAd(String str, C2739a aVar, C2738a aVar2) {
        getTag();
        new StringBuilder("config:").append(this.mAdConfig.toString());
        if (this.mAdConfig == null) {
            getTag();
            new StringBuilder("tryPreloadAdAsync, config is not valid, type:").append(str);
            if (aVar2 != null) {
                aVar2.mo7287a(null, "Config Invalid");
            }
        } else if (!needPreload(str)) {
            getTag();
            StringBuilder sb = new StringBuilder("tryPreloadAdAsync, type-->");
            sb.append(str);
            sb.append(", needPreload false");
            if (aVar2 != null) {
                aVar2.mo7286a(str);
            }
        } else {
            C2724b a = this.mAdConfig.mo7275a(str);
            if (a == null || !a.mo7277a()) {
                getTag();
                new StringBuilder("tryPreloadAdAsync, placementId invalid, type-->").append(str);
                if (aVar2 != null) {
                    aVar2.mo7287a(null, "Placement Invalid");
                }
                return;
            }
            getTag();
            StringBuilder sb2 = new StringBuilder("loadAdAsync start,placement type:");
            sb2.append(str);
            sb2.append(",placement config:");
            sb2.append(a.toString());
            loadAdAsync(str, a, aVar, aVar2);
        }
    }
}
