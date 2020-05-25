package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.C2240a;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.internal.ads.bye.C15742a.C15744b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C16299uq
public final class byc {

    /* renamed from: a */
    private final byh f44542a;

    /* renamed from: b */
    private final bzh f44543b;

    /* renamed from: c */
    private final boolean f44544c;

    /* renamed from: a */
    public static byc m36979a() {
        return new byc();
    }

    public byc(byh byh) {
        this.f44542a = byh;
        this.f44544c = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44326cG)).booleanValue();
        this.f44543b = new bzh();
        m36980b();
    }

    private byc() {
        this.f44542a = new byh();
        this.f44543b = new bzh();
        m36980b();
    }

    /* renamed from: a */
    public final synchronized void mo30861a(C15744b bVar) {
        if (this.f44544c) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44327cH)).booleanValue()) {
                m36982c(bVar);
            } else {
                m36981b(bVar);
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m36981b(C15744b bVar) {
        this.f44543b.f44666d = m36983c();
        this.f44542a.mo30862a(bby.m35340a((bby) this.f44543b)).mo30865b(bVar.zzac()).mo30864a();
        String str = "Logging Event with event code : ";
        String valueOf = String.valueOf(Integer.toString(bVar.zzac(), 10));
        abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: c */
    private final synchronized void m36982c(C15744b bVar) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m36984d(bVar).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        abv.m32494a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    abv.m32494a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        abv.m32494a("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                abv.m32494a("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    abv.m32494a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: d */
    private final synchronized String m36984d(C15744b bVar) {
        return C2240a.m6772a("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f44543b.f44665c, Long.valueOf(C14963ax.m30837g().mo28524b()), Integer.valueOf(bVar.zzac()), Base64.encodeToString(bby.m35340a((bby) this.f44543b), 3)});
    }

    /* renamed from: a */
    public final synchronized void mo30860a(byd byd) {
        if (this.f44544c) {
            try {
                byd.mo27505a(this.f44543b);
            } catch (NullPointerException e) {
                C14963ax.m30834d().mo28588a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m36980b() {
        this.f44543b.f44668f = new bzd();
        this.f44543b.f44668f.f44642d = new bze();
        this.f44543b.f44667e = new bzf();
    }

    /* renamed from: c */
    private static long[] m36983c() {
        int i;
        List b = C15740bx.m36942b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = ((String) it.next()).split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    abv.m32494a("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}
