package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16626dm.C16627a;
import com.google.android.gms.internal.measurement.C16626dm.C16629b;
import com.google.android.gms.internal.measurement.C16647eb;
import com.google.android.gms.internal.measurement.C16648ec;
import com.google.android.gms.internal.measurement.C16649ed;
import com.google.android.gms.internal.measurement.C16650ee;
import com.google.android.gms.internal.measurement.C16653eh;
import com.google.android.gms.internal.measurement.C16736hd;
import com.google.android.gms.internal.measurement.C16841ks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.cn */
final class C17048cn extends C17091ec {
    public C17048cn(C17092ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32904d() {
        return false;
    }

    /* renamed from: a */
    public final byte[] mo33017a(zzag zzag, String str) {
        Integer num;
        C17104eo eoVar;
        C16649ed edVar;
        C16650ee eeVar;
        Bundle bundle;
        C17061d dVar;
        long j;
        C17101el elVar;
        zzag zzag2 = zzag;
        String str2 = str;
        mo32840c();
        this.f48052r.mo32937t();
        C15464q.m32123a(zzag);
        C15464q.m32125a(str);
        if (!mo32856s().mo33280d(str2, C17122h.f48385au)) {
            mo32854q().f48452i.mo33377a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzag2.f48475a) || "_iapx".equals(zzag2.f48475a)) {
            C16649ed edVar2 = new C16649ed();
            mo32910h().mo33326e();
            try {
                C17104eo b = mo32910h().mo33317b(str2);
                if (b == null) {
                    mo32854q().f48452i.mo33377a("Log and bundle not available. package_name", str2);
                    return new byte[0];
                } else if (!b.mo33198n()) {
                    mo32854q().f48452i.mo33377a("Log and bundle disabled. package_name", str2);
                    byte[] bArr = new byte[0];
                    mo32910h().mo33332v();
                    return bArr;
                } else {
                    C16650ee eeVar2 = new C16650ee();
                    edVar2.f46798a = new C16650ee[]{eeVar2};
                    eeVar2.f46815a = Integer.valueOf(1);
                    eeVar2.f46823i = "android";
                    eeVar2.f46829o = b.mo33165a();
                    eeVar2.f46828n = b.mo33195k();
                    eeVar2.f46830p = b.mo33192i();
                    long j2 = b.mo33194j();
                    if (j2 == -2147483648L) {
                        num = null;
                    } else {
                        num = Integer.valueOf((int) j2);
                    }
                    eeVar2.f46802C = num;
                    eeVar2.f46831q = Long.valueOf(b.mo33196l());
                    eeVar2.f46839y = b.mo33173c();
                    if (TextUtils.isEmpty(eeVar2.f46839y)) {
                        eeVar2.f46808I = b.mo33177d();
                    }
                    eeVar2.f46836v = Long.valueOf(b.mo33197m());
                    if (this.f48052r.mo32936s() && C17110eu.m41773t() && mo32856s().mo33277c(eeVar2.f46829o)) {
                        eeVar2.f46806G = null;
                    }
                    Pair a = mo32855r().mo32863a(b.mo33165a());
                    if (b.mo33205u() && !TextUtils.isEmpty((CharSequence) a.first)) {
                        eeVar2.f46833s = m41388a((String) a.first, Long.toString(zzag2.f48478d));
                        eeVar2.f46834t = (Boolean) a.second;
                    }
                    mo32848k().mo32980w();
                    eeVar2.f46825k = Build.MODEL;
                    mo32848k().mo32980w();
                    eeVar2.f46824j = VERSION.RELEASE;
                    eeVar2.f46827m = Integer.valueOf((int) mo32848k().mo32941P_());
                    eeVar2.f46826l = mo32848k().mo32943f();
                    try {
                        eeVar2.f46835u = m41388a(b.mo33169b(), Long.toString(zzag2.f48478d));
                        eeVar2.f46801B = b.mo33183f();
                        String str3 = eeVar2.f46829o;
                        List a2 = mo32910h().mo33304a(str3);
                        if (mo32856s().mo33279d(str2)) {
                            Iterator it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    elVar = null;
                                    break;
                                }
                                elVar = (C17101el) it.next();
                                if ("_lte".equals(elVar.f48274c)) {
                                    break;
                                }
                            }
                            if (elVar == null || elVar.f48276e == null) {
                                C17101el elVar2 = new C17101el(str3, "auto", "_lte", mo32849l().mo28523a(), Long.valueOf(0));
                                a2.add(elVar2);
                                mo32910h().mo33314a(elVar2);
                            }
                        }
                        C16653eh[] ehVarArr = new C16653eh[a2.size()];
                        for (int i = 0; i < a2.size(); i++) {
                            C16653eh ehVar = new C16653eh();
                            ehVarArr[i] = ehVar;
                            ehVar.f46850b = ((C17101el) a2.get(i)).f48274c;
                            ehVar.f46849a = Long.valueOf(((C17101el) a2.get(i)).f48275d);
                            mo32906f().mo33126a(ehVar, ((C17101el) a2.get(i)).f48276e);
                        }
                        eeVar2.f46817c = ehVarArr;
                        Bundle b2 = zzag2.f48476b.mo33384b();
                        b2.putLong("_c", 1);
                        mo32854q().f48452i.mo33376a("Marking in-app purchase as real-time");
                        b2.putLong("_r", 1);
                        b2.putString("_o", zzag2.f48477c);
                        if (mo32852o().mo33154f(eeVar2.f46829o)) {
                            mo32852o().mo33143a(b2, "_dbg", (Object) Long.valueOf(1));
                            mo32852o().mo33143a(b2, "_r", (Object) Long.valueOf(1));
                        }
                        C17061d a3 = mo32910h().mo33301a(str2, zzag2.f48475a);
                        if (a3 == null) {
                            bundle = b2;
                            eeVar = eeVar2;
                            edVar = edVar2;
                            eoVar = b;
                            C17061d dVar2 = new C17061d(str, zzag2.f48475a, 0, 0, zzag2.f48478d, 0, null, null, null, null);
                            dVar = dVar2;
                            j = 0;
                        } else {
                            bundle = b2;
                            eeVar = eeVar2;
                            edVar = edVar2;
                            eoVar = b;
                            j = a3.f48151e;
                            dVar = a3.mo33044a(zzag2.f48478d);
                        }
                        mo32910h().mo33308a(dVar);
                        C17034c cVar = new C17034c(this.f48052r, zzag2.f48477c, str, zzag2.f48475a, zzag2.f48478d, j, bundle);
                        C16647eb ebVar = new C16647eb();
                        C16650ee eeVar3 = eeVar;
                        eeVar3.f46816b = new C16647eb[]{ebVar};
                        ebVar.f46789c = Long.valueOf(cVar.f48062c);
                        ebVar.f46788b = cVar.f48061b;
                        ebVar.f46790d = Long.valueOf(cVar.f48063d);
                        ebVar.f46787a = new C16648ec[cVar.f48064e.mo33382a()];
                        Iterator it2 = cVar.f48064e.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            C16648ec ecVar = new C16648ec();
                            int i3 = i2 + 1;
                            ebVar.f46787a[i2] = ecVar;
                            ecVar.f46793a = str4;
                            mo32906f().mo33125a(ecVar, cVar.f48064e.mo33383a(str4));
                            i2 = i3;
                        }
                        eeVar3.f46809J = (C16629b) ((C16736hd) C16629b.m39718a().mo31920a((C16627a) ((C16736hd) C16627a.m39714a().mo31918a(dVar.f48149c).mo31919a(zzag2.f48475a).mo32239d())).mo32239d());
                        eeVar3.f46800A = mo32908g().mo33269a(eoVar.mo33165a(), (C16647eb[]) null, eeVar3.f46817c);
                        eeVar3.f46819e = ebVar.f46789c;
                        eeVar3.f46820f = ebVar.f46789c;
                        long h = eoVar.mo33189h();
                        eeVar3.f46822h = h != 0 ? Long.valueOf(h) : null;
                        long g = eoVar.mo33186g();
                        if (g != 0) {
                            h = g;
                        }
                        eeVar3.f46821g = h != 0 ? Long.valueOf(h) : null;
                        eoVar.mo33202r();
                        eeVar3.f46837w = Integer.valueOf((int) eoVar.mo33199o());
                        eeVar3.f46832r = Long.valueOf(14710);
                        eeVar3.f46818d = Long.valueOf(mo32849l().mo28523a());
                        eeVar3.f46840z = Boolean.TRUE;
                        C17104eo eoVar2 = eoVar;
                        eoVar2.mo33166a(eeVar3.f46819e.longValue());
                        eoVar2.mo33170b(eeVar3.f46820f.longValue());
                        mo32910h().mo33309a(eoVar2);
                        mo32910h().mo33331u();
                        mo32910h().mo33332v();
                        try {
                            byte[] bArr2 = new byte[edVar.mo32479e()];
                            C16841ks a4 = C16841ks.m40859a(bArr2, 0, bArr2.length);
                            edVar.mo31924a(a4);
                            a4.mo32439a();
                            return mo32906f().mo33132b(bArr2);
                        } catch (IOException e) {
                            mo32854q().f48445b.mo33378a("Data loss. Failed to bundle and serialize. appId", C17133r.m41997a(str), e);
                            return null;
                        }
                    } catch (SecurityException e2) {
                        mo32854q().f48452i.mo33377a("app instance id encryption failed", e2.getMessage());
                        byte[] bArr3 = new byte[0];
                        mo32910h().mo33332v();
                        return bArr3;
                    }
                }
            } catch (SecurityException e3) {
                mo32854q().f48452i.mo33377a("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                mo32910h().mo33332v();
            }
        } else {
            mo32854q().f48452i.mo33378a("Generating a payload for this event is not available. package_name, event_name", str2, zzag2.f48475a);
            return null;
        }
    }

    /* renamed from: a */
    private static String m41388a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
