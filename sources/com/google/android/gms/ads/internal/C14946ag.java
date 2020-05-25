package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15843dt;
import com.google.android.gms.internal.ads.C16324vo;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.afp;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzyv;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.ag */
final class C14946ag implements Callable<C15843dt> {

    /* renamed from: a */
    private final /* synthetic */ int f38527a;

    /* renamed from: b */
    private final /* synthetic */ JSONArray f38528b;

    /* renamed from: c */
    private final /* synthetic */ int f38529c;

    /* renamed from: d */
    private final /* synthetic */ abc f38530d;

    /* renamed from: e */
    private final /* synthetic */ C14943ad f38531e;

    C14946ag(C14943ad adVar, int i, JSONArray jSONArray, int i2, abc abc) {
        this.f38531e = adVar;
        this.f38527a = i;
        this.f38528b = jSONArray;
        this.f38529c = i2;
        this.f38530d = abc;
    }

    public final /* synthetic */ Object call() throws Exception {
        Bundle bundle;
        if (this.f38527a >= this.f38528b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f38528b.get(this.f38527a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        C14943ad adVar = new C14943ad(this.f38531e.f38501e.f38629c, this.f38531e.f38505i, this.f38531e.f38501e.f38635i, this.f38531e.f38501e.f38628b, this.f38531e.f38659o, this.f38531e.f38501e.f38631e, true);
        C14943ad adVar2 = this.f38531e;
        C14964ay ayVar = this.f38531e.f38501e;
        C14964ay ayVar2 = adVar.f38501e;
        if (ayVar2.f38644r == null) {
            ayVar2.f38644r = ayVar.f38644r;
        }
        if (ayVar2.f38645s == null) {
            ayVar2.f38645s = ayVar.f38645s;
        }
        if (ayVar2.f38648v == null) {
            ayVar2.f38648v = ayVar.f38648v;
        }
        if (ayVar2.f38649w == null) {
            ayVar2.f38649w = ayVar.f38649w;
        }
        if (ayVar2.f38651y == null) {
            ayVar2.f38651y = ayVar.f38651y;
        }
        if (ayVar2.f38650x == null) {
            ayVar2.f38650x = ayVar.f38650x;
        }
        if (ayVar2.f38615I == null) {
            ayVar2.f38615I = ayVar.f38615I;
        }
        if (ayVar2.f38638l == null) {
            ayVar2.f38638l = ayVar.f38638l;
        }
        if (ayVar2.f38616J == null) {
            ayVar2.f38616J = ayVar.f38616J;
        }
        if (ayVar2.f38639m == null) {
            ayVar2.f38639m = ayVar.f38639m;
        }
        if (ayVar2.f38640n == null) {
            ayVar2.f38640n = ayVar.f38640n;
        }
        if (ayVar2.f38635i == null) {
            ayVar2.f38635i = ayVar.f38635i;
        }
        if (ayVar2.f38636j == null) {
            ayVar2.f38636j = ayVar.f38636j;
        }
        if (ayVar2.f38637k == null) {
            ayVar2.f38637k = ayVar.f38637k;
        }
        adVar.mo27509F();
        adVar.mo27458a(this.f38531e.f38498b);
        C15806ck ckVar = adVar.f38497a;
        int i = this.f38527a;
        ckVar.mo30900a("num_ads_requested", String.valueOf(this.f38529c));
        ckVar.mo30900a("ad_index", String.valueOf(i));
        zzaxe zzaxe = this.f38530d.f40129a;
        String jSONObject2 = jSONObject.toString();
        if (zzaxe.f46132c.f46319c != null) {
            bundle = new Bundle(zzaxe.f46132c.f46319c);
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("_ad", jSONObject2);
        zzyv zzyv = r5;
        zzyv zzyv2 = new zzyv(zzaxe.f46132c.f46317a, zzaxe.f46132c.f46318b, bundle2, zzaxe.f46132c.f46320d, zzaxe.f46132c.f46321e, zzaxe.f46132c.f46322f, zzaxe.f46132c.f46323g, zzaxe.f46132c.f46324h, zzaxe.f46132c.f46325i, zzaxe.f46132c.f46326j, zzaxe.f46132c.f46327k, zzaxe.f46132c.f46328l, zzaxe.f46132c.f46329m, zzaxe.f46132c.f46330n, zzaxe.f46132c.f46331o, zzaxe.f46132c.f46332p, zzaxe.f46132c.f46333q, zzaxe.f46132c.f46334r, null, zzaxe.f46132c.f46336t, zzaxe.f46132c.f46337u);
        C16324vo voVar = new C16324vo(zzaxe.f46131b, zzyv, zzaxe.f46133d, zzaxe.f46134e, zzaxe.f46135f, zzaxe.f46136g, zzaxe.f46138i, zzaxe.f46139j, zzaxe.f46140k, zzaxe.f46141l, zzaxe.f46143n, zzaxe.f46155z, zzaxe.f46144o, zzaxe.f46145p, zzaxe.f46146q, zzaxe.f46147r, zzaxe.f46148s, zzaxe.f46149t, zzaxe.f46150u, zzaxe.f46151v, zzaxe.f46152w, zzaxe.f46153x, zzaxe.f46154y, zzaxe.f46098B, zzaxe.f46099C, zzaxe.f46105I, zzaxe.f46100D, zzaxe.f46101E, zzaxe.f46102F, zzaxe.f46103G, afp.m32820a(zzaxe.f46104H), zzaxe.f46106J, zzaxe.f46107K, zzaxe.f46108L, zzaxe.f46109M, zzaxe.f46110N, zzaxe.f46111O, zzaxe.f46112P, zzaxe.f46113Q, zzaxe.f46117U, afp.m32820a(zzaxe.f46137h), zzaxe.f46118V, zzaxe.f46119W, zzaxe.f46120X, 1, zzaxe.f46122Z, zzaxe.f46124aa, zzaxe.f46125ab, zzaxe.f46126ac, zzaxe.f46127ad, zzaxe.f46128ae, zzaxe.f46130ag);
        adVar.mo27585a(voVar, adVar.f38497a);
        return (C15843dt) adVar.f38514j.get();
    }
}
