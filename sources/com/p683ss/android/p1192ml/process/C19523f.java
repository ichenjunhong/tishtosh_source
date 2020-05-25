package com.p683ss.android.p1192ml.process;

import com.p683ss.android.p1192ml.process.p1193a.C19508a;
import com.p683ss.android.p1192ml.process.p1193a.C19509b;
import com.p683ss.android.p1192ml.process.p1193a.C19510c;
import com.p683ss.android.p1192ml.process.p1193a.C19511d;
import com.p683ss.android.p1192ml.process.p1193a.C19512e;
import com.p683ss.android.p1192ml.process.p1193a.C19513f;
import com.p683ss.android.p1192ml.process.p1193a.C19514g;
import com.p683ss.android.p1192ml.process.p1193a.C19515h;
import com.p683ss.android.p1192ml.process.p1193a.C19516i;
import com.p683ss.android.p1192ml.process.p1193a.C19517j;
import com.p683ss.android.p1192ml.process.p1193a.C19518k;
import java.util.HashMap;

/* renamed from: com.ss.android.ml.process.f */
public final class C19523f {

    /* renamed from: a */
    private static C19523f f53870a = new C19523f();

    /* renamed from: b */
    private HashMap<String, C19522e> f53871b = new HashMap<>();

    /* renamed from: a */
    public static C19523f m47796a() {
        return f53870a;
    }

    public C19523f() {
        this.f53871b.put("log", new C19510c());
        this.f53871b.put("log1p", new C19509b());
        this.f53871b.put("sigmoid", new C19517j());
        this.f53871b.put("div", new C19508a());
        this.f53871b.put("max", new C19511d());
        this.f53871b.put("min", new C19512e());
        this.f53871b.put("normalize", new C19513f());
        this.f53871b.put("standardize", new C19518k());
        this.f53871b.put("predict_regression", new C19516i());
        this.f53871b.put("predict_bin", new C19515h());
        this.f53871b.put("onehotEncode", new C19514g());
    }

    /* renamed from: a */
    public final C19522e mo40688a(String str) {
        return (C19522e) this.f53871b.get(str);
    }
}
