package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.p833c.C12727a;
import java.util.List;

/* renamed from: com.bytedance.ies.ugc.aweme.network.a */
final class C11025a implements C11029e {

    /* renamed from: a */
    String f29618a;

    /* renamed from: b */
    boolean f29619b;

    /* renamed from: c */
    boolean f29620c = true;

    /* renamed from: d */
    boolean f29621d = true;

    /* renamed from: e */
    List<C12727a> f29622e = RetrofitFactory.allCommonInterceptor(null);

    /* renamed from: f */
    List<C12745a> f29623f = RetrofitFactory.allCommonConvertFactories();

    /* renamed from: g */
    List<C12726a> f29624g = RetrofitFactory.allCommonCallAdapters();

    /* renamed from: a */
    public final C11030f mo19925a() {
        return new C11034h(this);
    }

    public final int hashCode() {
        return (((((this.f29618a.hashCode() * 31) + (this.f29619b ? 1 : 0)) * 31) + (this.f29620c ? 1 : 0)) * 31) + (this.f29621d ? 1 : 0);
    }

    /* renamed from: a */
    public final C11029e mo19924a(boolean z) {
        this.f29619b = true;
        return this;
    }

    /* renamed from: b */
    public final C11029e mo19926b(boolean z) {
        this.f29620c = z;
        return this;
    }

    /* renamed from: c */
    public final C11029e mo19927c(boolean z) {
        this.f29621d = false;
        return this;
    }

    /* renamed from: a */
    public final C11029e mo19923a(C12727a aVar) {
        this.f29622e.add(aVar);
        return this;
    }

    C11025a(String str) {
        this.f29618a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11025a aVar = (C11025a) obj;
        if (this.f29619b == aVar.f29619b && this.f29620c == aVar.f29620c && this.f29621d == aVar.f29621d) {
            return this.f29618a.equals(aVar.f29618a);
        }
        return false;
    }
}
