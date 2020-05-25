package com.p683ss.android.p1192ml;

import android.os.SystemClock;
import com.p683ss.android.p1192ml.process.C19507a;
import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ml.c */
public final class C19498c implements C19499d {

    /* renamed from: a */
    C19499d f53845a;

    /* renamed from: b */
    C19496a f53846b;

    /* renamed from: a */
    public final String mo40658a() {
        return this.f53845a.mo40658a();
    }

    /* renamed from: b */
    public final boolean mo40661b() {
        return this.f53845a.mo40661b();
    }

    public C19498c(C19499d dVar, C19496a aVar) {
        this.f53845a = dVar;
        this.f53846b = aVar;
    }

    /* renamed from: a */
    private void m47736a(String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("model", this.f53845a.mo40658a());
        hashMap.put("engine", this.f53845a.getClass().getName());
        hashMap.put("method", str);
        hashMap.put("consume", String.valueOf(j));
        this.f53846b.mo40654a("MLCountEngine", hashMap);
    }

    /* renamed from: a */
    public final void mo40660a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) throws Throwable {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f53845a.mo40660a(fileInputStream, mLConfigModel);
        m47736a("loadEvaluator", SystemClock.uptimeMillis() - uptimeMillis);
    }

    /* renamed from: a */
    public final float mo40657a(Map<String, Object> map, List<? extends C19520c> list, C19507a aVar, List<String> list2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float a = this.f53845a.mo40657a(map, list, aVar, list2);
        m47736a("calculate", SystemClock.uptimeMillis() - uptimeMillis);
        return a;
    }

    /* renamed from: a */
    public final List<String> mo40659a(Map<String, Object> map, List<? extends C19520c> list, C19507a aVar, List<String> list2, Map<String, Float> map2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        List<String> a = this.f53845a.mo40659a(map, list, aVar, list2, map2);
        m47736a("classify", SystemClock.uptimeMillis() - uptimeMillis);
        return a;
    }
}
