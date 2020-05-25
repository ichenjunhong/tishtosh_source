package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ir */
public final class C15976ir implements bmz {

    /* renamed from: a */
    volatile C15968ij f45075a;

    /* renamed from: b */
    private final Context f45076b;

    public C15976ir(Context context) {
        this.f45076b = context;
    }

    /* renamed from: a */
    public final bpz mo28726a(brw<?> brw) throws C15812cq {
        Map b = brw.mo28744b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzaju zzaju = new zzaju(brw.f43726b, strArr, strArr2);
        long b2 = C14963ax.m30837g().mo28524b();
        try {
            agl agl = new agl();
            this.f45075a = new C15968ij(this.f45076b, C14963ax.m30844n().mo28747a(), new C15980iv(this, agl), new C15981iw(this, agl));
            this.f45075a.mo28409l();
            aga a = afp.m32821a(afp.m32822a((aga<A>) agl, (afk<? super A, ? extends B>) new C15977is<Object,Object>(this, zzaju), (Executor) acb.f40240a), (long) ((Integer) caf.m37099d().mo30717a(C15740bx.f44364cs)).intValue(), TimeUnit.MILLISECONDS, acb.f40242c);
            a.mo28797a(new C15979iu(this), acb.f40240a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a.get();
            long b3 = C14963ax.m30837g().mo28524b() - b2;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b3);
            sb.append("ms");
            abv.m32494a(sb.toString());
            zzajw zzajw = (zzajw) new zzaxu(parcelFileDescriptor).mo31582a(zzajw.CREATOR);
            if (zzajw == null) {
                return null;
            }
            if (zzajw.f46076a) {
                throw new C15812cq(zzajw.f46077b);
            } else if (zzajw.f46080e.length != zzajw.f46081f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < zzajw.f46080e.length; i2++) {
                    hashMap.put(zzajw.f46080e[i2], zzajw.f46081f[i2]);
                }
                bpz bpz = new bpz(zzajw.f46078c, zzajw.f46079d, (Map<String, String>) hashMap, zzajw.f46082g, zzajw.f46083h);
                return bpz;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b4 = C14963ax.m30837g().mo28524b() - b2;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(b4);
            sb2.append("ms");
            abv.m32494a(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b5 = C14963ax.m30837g().mo28524b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b5);
            sb3.append("ms");
            abv.m32494a(sb3.toString());
            throw th;
        }
    }
}
