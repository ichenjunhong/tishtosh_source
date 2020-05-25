package com.p683ss.android.ugc.aweme.feed.utils;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.i */
final /* synthetic */ class C31193i implements Callable {

    /* renamed from: a */
    private final JSONObject f81613a;

    /* renamed from: b */
    private final Aweme f81614b;

    /* renamed from: c */
    private final String f81615c;

    /* renamed from: d */
    private final String f81616d;

    /* renamed from: e */
    private final Context f81617e;

    /* renamed from: f */
    private final String f81618f;

    /* renamed from: g */
    private final C30669b f81619g;

    C31193i(JSONObject jSONObject, Aweme aweme, String str, String str2, Context context, String str3, C30669b bVar) {
        this.f81613a = jSONObject;
        this.f81614b = aweme;
        this.f81615c = str;
        this.f81616d = str2;
        this.f81617e = context;
        this.f81618f = str3;
        this.f81619g = bVar;
    }

    public final Object call() {
        return C31191g.m72849a(this.f81613a, this.f81614b, this.f81615c, this.f81616d, this.f81617e, this.f81618f, this.f81619g);
    }
}
