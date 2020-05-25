package com.bytedance.p582g.p583a.p585b;

import android.content.Context;
import com.bytedance.p582g.p583a.p585b.p587b.C9957a;
import com.bytedance.p582g.p583a.p585b.p589d.C9968a.C9971b;
import com.bytedance.p582g.p583a.p585b.p590e.C9979b;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.g.a.b.d */
public final class C9967d implements C9971b {

    /* renamed from: a */
    public boolean f27079a = true;

    /* renamed from: b */
    private C9958c f27080b;

    /* renamed from: c */
    private final LinkedList<C9957a> f27081c = new LinkedList<>();

    /* renamed from: d */
    private final int f27082d = 5;

    /* renamed from: e */
    private long f27083e = 0;

    /* renamed from: f */
    private final int f27084f = 120000;

    /* renamed from: g */
    private String f27085g;

    /* renamed from: a */
    public final void mo17920a(long j) {
        if (this.f27079a) {
            m20051a(j, false);
        }
    }

    public C9967d(Context context, String str) {
        this.f27080b = C9958c.m20025a(context);
        this.f27085g = str;
    }

    /* renamed from: a */
    private boolean m20051a(long j, boolean z) {
        LinkedList linkedList;
        int size = this.f27081c.size();
        if (size <= 0 || (size < 5 && j - this.f27083e <= 120000)) {
            return false;
        }
        this.f27083e = j;
        synchronized (this.f27081c) {
            linkedList = new LinkedList(this.f27081c);
            this.f27081c.clear();
        }
        if (!C9979b.m20068a(linkedList)) {
            try {
                this.f27080b.mo17925a(this.f27085g, (List<C9957a>) linkedList);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo17938a(String str, String str2, JSONObject jSONObject) {
        if (this.f27079a && jSONObject != null) {
            C9957a aVar = new C9957a(this.f27085g, str, str2, jSONObject.toString(), System.currentTimeMillis());
            if (this.f27081c.size() >= 2000) {
                this.f27081c.poll();
            }
            this.f27081c.add(aVar);
        }
    }
}
