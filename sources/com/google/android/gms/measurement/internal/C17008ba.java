package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.C15386i;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15529t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.ba */
public final class C17008ba extends C17125j {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final C17092ed f47992a;

    /* renamed from: b */
    private Boolean f47993b;

    /* renamed from: c */
    private String f47994c;

    public C17008ba(C17092ed edVar) {
        this(edVar, null);
    }

    private C17008ba(C17092ed edVar, String str) {
        C15464q.m32123a(edVar);
        this.f47992a = edVar;
        this.f47994c = null;
    }

    /* renamed from: b */
    public final void mo32957b(zzk zzk) {
        m41304b(zzk, false);
        m41302a((Runnable) new C17009bb(this, zzk));
    }

    /* renamed from: a */
    public final void mo32950a(zzag zzag, zzk zzk) {
        C15464q.m32123a(zzag);
        m41304b(zzk, false);
        m41302a((Runnable) new C17020bm(this, zzag, zzk));
    }

    /* renamed from: a */
    public final void mo32951a(zzag zzag, String str, String str2) {
        C15464q.m32123a(zzag);
        C15464q.m32125a(str);
        m41303a(str, true);
        m41302a((Runnable) new C17021bn(this, zzag, str));
    }

    /* renamed from: a */
    public final byte[] mo32956a(zzag zzag, String str) {
        C15464q.m32125a(str);
        C15464q.m32123a(zzag);
        m41303a(str, true);
        this.f47992a.mo32854q().f48452i.mo33377a("Log and bundle. event", this.f47992a.mo33110g().mo33369a(zzag.f48475a));
        long c = this.f47992a.mo32849l().mo28525c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f47992a.mo32853p().mo32913b((Callable<V>) new C17022bo<V>(this, zzag, str)).get();
            if (bArr == null) {
                this.f47992a.mo32854q().f48445b.mo33377a("Log and bundle returned null. appId", C17133r.m41997a(str));
                bArr = new byte[0];
            }
            this.f47992a.mo32854q().f48452i.mo33379a("Log and bundle processed. event, size, time_ms", this.f47992a.mo33110g().mo33369a(zzag.f48475a), Integer.valueOf(bArr.length), Long.valueOf((this.f47992a.mo32849l().mo28525c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f47992a.mo32854q().f48445b.mo33379a("Failed to log and bundle. appId, event, error", C17133r.m41997a(str), this.f47992a.mo33110g().mo33369a(zzag.f48475a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo32952a(zzfv zzfv, zzk zzk) {
        C15464q.m32123a(zzfv);
        m41304b(zzk, false);
        if (zzfv.mo33393a() == null) {
            m41302a((Runnable) new C17023bp(this, zzfv, zzk));
        } else {
            m41302a((Runnable) new C17024bq(this, zzfv, zzk));
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo32944a(zzk zzk, boolean z) {
        m41304b(zzk, false);
        try {
            List<C17101el> list = (List) this.f47992a.mo32853p().mo32911a((Callable<V>) new C17025br<V>(this, zzk)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C17101el elVar : list) {
                if (z || !C17102em.m41673e(elVar.f48274c)) {
                    arrayList.add(new zzfv(elVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f47992a.mo32854q().f48445b.mo33378a("Failed to get user attributes. appId", C17133r.m41997a(zzk.f48487a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo32953a(zzk zzk) {
        m41304b(zzk, false);
        m41302a((Runnable) new C17026bs(this, zzk));
    }

    /* renamed from: b */
    private final void m41304b(zzk zzk, boolean z) {
        C15464q.m32123a(zzk);
        m41303a(zzk.f48487a, false);
        this.f47992a.mo33111h().mo33150b(zzk.f48488b, zzk.f48504r);
    }

    /* renamed from: a */
    private final void m41303a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f47993b == null) {
                        if (!"com.google.android.gms".equals(this.f47994c) && !C15529t.m32309a(this.f47992a.mo32850m(), Binder.getCallingUid())) {
                            if (!C15386i.m31967a(this.f47992a.mo32850m()).mo28332a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f47993b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f47993b = Boolean.valueOf(z2);
                    }
                    if (this.f47993b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f47992a.mo32854q().f48445b.mo33377a("Measurement Service called with invalid calling package. appId", C17133r.m41997a(str));
                    throw e;
                }
            }
            if (this.f47994c == null && C15384g.m31959a(this.f47992a.mo32850m(), Binder.getCallingUid(), str)) {
                this.f47994c = str;
            }
            if (!str.equals(this.f47994c)) {
                throw new SecurityException(C2240a.m6772a("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f47992a.mo32854q().f48445b.mo33376a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: a */
    public final void mo32949a(long j, String str, String str2, String str3) {
        C17027bt btVar = new C17027bt(this, str2, str3, str, j);
        m41302a((Runnable) btVar);
    }

    /* renamed from: c */
    public final String mo32958c(zzk zzk) {
        m41304b(zzk, false);
        return this.f47992a.mo33107d(zzk);
    }

    /* renamed from: a */
    public final void mo32955a(zzo zzo, zzk zzk) {
        C15464q.m32123a(zzo);
        C15464q.m32123a(zzo.f48507c);
        m41304b(zzk, false);
        zzo zzo2 = new zzo(zzo);
        zzo2.f48505a = zzk.f48487a;
        if (zzo.f48507c.mo33393a() == null) {
            m41302a((Runnable) new C17011bd(this, zzo2, zzk));
        } else {
            m41302a((Runnable) new C17012be(this, zzo2, zzk));
        }
    }

    /* renamed from: a */
    public final void mo32954a(zzo zzo) {
        C15464q.m32123a(zzo);
        C15464q.m32123a(zzo.f48507c);
        m41303a(zzo.f48505a, true);
        zzo zzo2 = new zzo(zzo);
        if (zzo.f48507c.mo33393a() == null) {
            m41302a((Runnable) new C17013bf(this, zzo2));
        } else {
            m41302a((Runnable) new C17014bg(this, zzo2));
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo32948a(String str, String str2, boolean z, zzk zzk) {
        m41304b(zzk, false);
        try {
            List<C17101el> list = (List) this.f47992a.mo32853p().mo32911a((Callable<V>) new C17015bh<V>(this, zzk, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C17101el elVar : list) {
                if (z || !C17102em.m41673e(elVar.f48274c)) {
                    arrayList.add(new zzfv(elVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f47992a.mo32854q().f48445b.mo33378a("Failed to get user attributes. appId", C17133r.m41997a(zzk.f48487a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo32947a(String str, String str2, String str3, boolean z) {
        m41303a(str, true);
        try {
            List<C17101el> list = (List) this.f47992a.mo32853p().mo32911a((Callable<V>) new C17016bi<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C17101el elVar : list) {
                if (z || !C17102em.m41673e(elVar.f48274c)) {
                    arrayList.add(new zzfv(elVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f47992a.mo32854q().f48445b.mo33378a("Failed to get user attributes. appId", C17133r.m41997a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo32945a(String str, String str2, zzk zzk) {
        m41304b(zzk, false);
        try {
            return (List) this.f47992a.mo32853p().mo32911a((Callable<V>) new C17017bj<V>(this, zzk, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f47992a.mo32854q().f48445b.mo33377a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo32946a(String str, String str2, String str3) {
        m41303a(str, true);
        try {
            return (List) this.f47992a.mo32853p().mo32911a((Callable<V>) new C17018bk<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f47992a.mo32854q().f48445b.mo33377a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public final void mo32959d(zzk zzk) {
        m41303a(zzk.f48487a, false);
        m41302a((Runnable) new C17019bl(this, zzk));
    }

    /* renamed from: a */
    private final void m41302a(Runnable runnable) {
        C15464q.m32123a(runnable);
        if (!((Boolean) C17122h.f48367ac.mo33351b()).booleanValue() || !this.f47992a.mo32853p().mo32915f()) {
            this.f47992a.mo32853p().mo32912a(runnable);
        } else {
            runnable.run();
        }
    }
}
