package com.bytedance.ies.bullet.p628b.p636f;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.p628b.p643i.C10384e;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p628b.p643i.C10452u;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.f.b */
public final class C10317b extends C10452u<C10317b, C10316a> {

    /* renamed from: a */
    public final C10316a f27726a = new C10316a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C10423r mo18387a() {
        return this.f27726a;
    }

    public C10317b() {
        Builder authority = new Builder().scheme("bullet").authority("bullet");
        C52711k.m112236a((Object) authority, "Uri.Builder().scheme(\"bullet\").authority(\"bullet\")");
        super(authority);
    }

    /* renamed from: a */
    public final C10317b mo18388a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        this.f27726a.f27725b.mo18456a(uri);
        return this;
    }

    /* renamed from: a */
    public final C10317b mo18389a(C10384e<Builder> eVar) {
        C52711k.m112240b(eVar, "builder");
        this.f27726a.f27725b.mo18456a(((Builder) eVar.mo18453b()).build());
        return this;
    }

    /* renamed from: a */
    public final C10317b mo18390a(List<String> list) {
        C52711k.m112240b(list, "packages");
        this.f27726a.f27724a.mo18456a(list);
        return this;
    }
}
