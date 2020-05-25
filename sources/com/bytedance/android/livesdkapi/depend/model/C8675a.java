package com.bytedance.android.livesdkapi.depend.model;

import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.a */
public final class C8675a {
    @C17952c(mo34828a = "data")

    /* renamed from: a */
    public List<ChargeDeal> f23711a;
    @C17952c(mo34828a = "extra")

    /* renamed from: b */
    public C8676a f23712b;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$a */
    public static class C8676a {
        @C17952c(mo34828a = "default_packet_id")

        /* renamed from: a */
        public long f23713a;
        @C17952c(mo34828a = "first_charge_packet_id")

        /* renamed from: b */
        public long f23714b;
        @C17952c(mo34828a = "hotsoonHint")

        /* renamed from: c */
        public String f23715c;
        @C17952c(mo34828a = "recently_purchased_packet_id")

        /* renamed from: d */
        public int f23716d;
        @C17952c(mo34828a = "allow_diamond_exchange")

        /* renamed from: e */
        public boolean f23717e;
    }

    public C8675a() {
    }

    public C8675a(C8675a aVar) {
        ArrayList arrayList;
        String str;
        long j;
        if (aVar.f23711a == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(aVar.f23711a);
        }
        this.f23711a = arrayList;
        C8676a aVar2 = new C8676a();
        if (aVar.f23712b != null) {
            str = aVar.f23712b.f23715c;
        } else {
            str = "";
        }
        aVar2.f23715c = str;
        long j2 = 0;
        if (aVar.f23712b != null) {
            j = aVar.f23712b.f23713a;
        } else {
            j = 0;
        }
        aVar2.f23713a = j;
        if (aVar.f23712b != null) {
            j2 = aVar.f23712b.f23714b;
        }
        aVar2.f23714b = j2;
    }
}
