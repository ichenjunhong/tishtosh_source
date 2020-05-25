package com.p683ss.p2549c.p2550a.p2551a.p2554b;

import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51169a;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51176d;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.p2553a.C51170a;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.c.a.a.b.d */
public final class C51200d implements Callable<C51170a> {

    /* renamed from: a */
    private final String f127876a;

    public final /* synthetic */ Object call() throws Exception {
        C51169a aVar = C51176d.m110086a().f127823b;
        String str = this.f127876a;
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.f127802a);
        sb.append("/video/live/qos/v2/ipSettings");
        return new C51170a(new JSONObject(aVar.f127803b.mo14020a(C51169a.m110078a(sb.toString(), aVar.f127804c), str.toString().getBytes("UTF-8"), "gzip", "application/json; charset=utf-8")));
    }

    C51200d(String str) {
        this.f127876a = str;
    }
}
