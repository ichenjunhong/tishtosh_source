package com.bytedance.android.live.base.p192sp;

import android.content.SharedPreferences;
import com.google.gson.C18085o;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.live.base.sp.b */
final /* synthetic */ class C3019b implements Callable {

    /* renamed from: a */
    private final SharedPreferences f8894a;

    /* renamed from: b */
    private final C18085o f8895b;

    C3019b(SharedPreferences sharedPreferences, C18085o oVar) {
        this.f8894a = sharedPreferences;
        this.f8895b = oVar;
    }

    public final Object call() {
        return Boolean.valueOf(this.f8894a.edit().putString("key_ttlive_sdk_setting", this.f8895b.toString()).commit());
    }
}
