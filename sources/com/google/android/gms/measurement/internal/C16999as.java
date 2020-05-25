package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.internal.measurement.C16635dq;
import com.google.android.gms.internal.measurement.C16636dr;
import com.google.android.gms.internal.measurement.C16637ds;
import com.google.android.gms.internal.measurement.C16639du;
import com.google.android.gms.internal.measurement.C16641dw;
import com.google.android.gms.internal.measurement.C16642dx;
import com.google.android.gms.internal.measurement.C16643dy;
import com.google.android.gms.internal.measurement.C16839kq;
import com.google.android.gms.internal.measurement.C16841ks;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.as */
public final class C16999as extends C17091ec implements C17112ew {

    /* renamed from: a */
    private static int f47927a = 65535;

    /* renamed from: c */
    private static int f47928c = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f47929d = new C0777a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f47930e = new C0777a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f47931f = new C0777a();

    /* renamed from: g */
    private final Map<String, C16642dx> f47932g = new C0777a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f47933h = new C0777a();

    /* renamed from: i */
    private final Map<String, String> f47934i = new C0777a();

    C16999as(C17092ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32904d() {
        return false;
    }

    /* renamed from: h */
    private final void m41199h(String str) {
        mo33089j();
        mo32840c();
        C15464q.m32125a(str);
        if (this.f47932g.get(str) == null) {
            byte[] d = mo32910h().mo33323d(str);
            if (d == null) {
                this.f47929d.put(str, null);
                this.f47930e.put(str, null);
                this.f47931f.put(str, null);
                this.f47932g.put(str, null);
                this.f47934i.put(str, null);
                this.f47933h.put(str, null);
                return;
            }
            C16642dx a = m41196a(str, d);
            this.f47929d.put(str, m41197a(a));
            m41198a(str, a);
            this.f47932g.put(str, a);
            this.f47934i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16642dx mo32895a(String str) {
        mo33089j();
        mo32840c();
        C15464q.m32125a(str);
        m41199h(str);
        return (C16642dx) this.f47932g.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo32898b(String str) {
        mo32840c();
        return (String) this.f47934i.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo32900c(String str) {
        mo32840c();
        this.f47934i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo32903d(String str) {
        mo32840c();
        this.f47932g.remove(str);
    }

    /* renamed from: a */
    public final String mo32896a(String str, String str2) {
        mo32840c();
        m41199h(str);
        Map map = (Map) this.f47929d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m41197a(C16642dx dxVar) {
        C16643dy[] dyVarArr;
        C0777a aVar = new C0777a();
        if (!(dxVar == null || dxVar.f46765c == null)) {
            for (C16643dy dyVar : dxVar.f46765c) {
                if (dyVar != null) {
                    aVar.put(dyVar.f46772a, dyVar.f46773b);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m41198a(String str, C16642dx dxVar) {
        C16641dw[] dwVarArr;
        C0777a aVar = new C0777a();
        C0777a aVar2 = new C0777a();
        C0777a aVar3 = new C0777a();
        if (!(dxVar == null || dxVar.f46766d == null)) {
            for (C16641dw dwVar : dxVar.f46766d) {
                if (TextUtils.isEmpty(dwVar.f46759a)) {
                    mo32854q().f48448e.mo33376a("EventConfig contained null event name");
                } else {
                    String a = C17031bx.m41343a(dwVar.f46759a);
                    if (!TextUtils.isEmpty(a)) {
                        dwVar.f46759a = a;
                    }
                    aVar.put(dwVar.f46759a, dwVar.f46760b);
                    aVar2.put(dwVar.f46759a, dwVar.f46761c);
                    if (dwVar.f46762d != null) {
                        if (dwVar.f46762d.intValue() < f47928c || dwVar.f46762d.intValue() > f47927a) {
                            mo32854q().f48448e.mo33378a("Invalid sampling rate. Event name, sample rate", dwVar.f46759a, dwVar.f46762d);
                        } else {
                            aVar3.put(dwVar.f46759a, dwVar.f46762d);
                        }
                    }
                }
            }
        }
        this.f47930e.put(str, aVar);
        this.f47931f.put(str, aVar2);
        this.f47933h.put(str, aVar3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo32897a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        C16639du[] duVarArr;
        String str3 = str;
        mo33089j();
        mo32840c();
        C15464q.m32125a(str);
        C16642dx a = m41196a(str, bArr);
        m41198a(str3, a);
        this.f47932g.put(str3, a);
        this.f47934i.put(str3, str2);
        this.f47929d.put(str3, m41197a(a));
        C17107er g = mo32908g();
        C16635dq[] dqVarArr = a.f46767e;
        C15464q.m32123a(dqVarArr);
        int length = dqVarArr.length;
        int i = 0;
        while (i < length) {
            C16635dq dqVar = dqVarArr[i];
            C16636dr[] drVarArr = dqVar.f46727c;
            int length2 = drVarArr.length;
            int i2 = 0;
            while (i2 < length2) {
                C16636dr drVar = drVarArr[i2];
                String a2 = C17031bx.m41343a(drVar.f46732b);
                if (a2 != null) {
                    drVar.f46732b = a2;
                }
                C16637ds[] dsVarArr = drVar.f46733c;
                int length3 = dsVarArr.length;
                int i3 = 0;
                while (i3 < length3) {
                    C16637ds dsVar = dsVarArr[i3];
                    int i4 = length;
                    String a3 = C17049co.m41392a(dsVar.f46742d, C17032by.f48056a, C17032by.f48057b);
                    if (a3 != null) {
                        dsVar.f46742d = a3;
                    }
                    i3++;
                    length = i4;
                }
                int i5 = length;
                i2++;
            }
            int i6 = length;
            for (C16639du duVar : dqVar.f46726b) {
                String a4 = C17049co.m41392a(duVar.f46750b, C17033bz.f48058a, C17033bz.f48059b);
                if (a4 != null) {
                    duVar.f46750b = a4;
                }
            }
            i++;
            length = i6;
        }
        g.mo32910h().mo33310a(str3, dqVarArr);
        try {
            a.f46767e = null;
            bArr2 = new byte[a.mo32479e()];
            a.mo31924a(C16841ks.m40859a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo32854q().f48448e.mo33378a("Unable to serialize reduced-size config. Storing full config instead. appId", C17133r.m41997a(str), e);
            bArr2 = bArr;
        }
        C17113ex h = mo32910h();
        C15464q.m32125a(str);
        h.mo32840c();
        h.mo33089j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) h.mo33333w().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                h.mo32854q().f48445b.mo33377a("Failed to update remote config (got 0). appId", C17133r.m41997a(str));
            }
        } catch (SQLiteException e2) {
            h.mo32854q().f48445b.mo33378a("Error storing remote config. appId", C17133r.m41997a(str), e2);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32899b(String str, String str2) {
        mo32840c();
        m41199h(str);
        if (mo32907f(str) && C17102em.m41673e(str2)) {
            return true;
        }
        if (mo32909g(str) && C17102em.m41662a(str2)) {
            return true;
        }
        Map map = (Map) this.f47930e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo32901c(String str, String str2) {
        mo32840c();
        m41199h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f47931f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo32902d(String str, String str2) {
        mo32840c();
        m41199h(str);
        Map map = (Map) this.f47933h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final long mo32905e(String str) {
        String a = mo32896a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo32854q().f48448e.mo33378a("Unable to parse timezone offset. appId", C17133r.m41997a(str), e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final C16642dx m41196a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C16642dx();
        }
        C16839kq a = C16839kq.m40832a(bArr, 0, bArr.length);
        C16642dx dxVar = new C16642dx();
        try {
            dxVar.mo31923a(a);
            mo32854q().f48453j.mo33378a("Parsed config. version, gmp_app_id", dxVar.f46763a, dxVar.f46764b);
            return dxVar;
        } catch (IOException e) {
            mo32854q().f48448e.mo33378a("Unable to merge remote config. appId", C17133r.m41997a(str), e);
            return new C16642dx();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo32907f(String str) {
        return "1".equals(mo32896a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo32909g(String str) {
        return "1".equals(mo32896a(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17099ej mo32906f() {
        return super.mo32906f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17107er mo32908g() {
        return super.mo32908g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17113ex mo32910h() {
        return super.mo32910h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
