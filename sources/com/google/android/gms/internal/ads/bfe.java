package com.google.android.gms.internal.ads;

import com.C2240a;
import com.google.android.gms.internal.ads.ate.C15645b;
import com.google.android.gms.internal.ads.atn.C15649b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class bfe {

    /* renamed from: a */
    static apn f42245a;

    /* renamed from: a */
    static boolean m35537a(bey bey) throws IllegalAccessException, InvocationTargetException {
        byte[] bArr;
        if (f42245a != null) {
            return true;
        }
        String str = (String) caf.m37099d().mo30717a(C15740bx.f44267bA);
        if (str == null || str.length() == 0) {
            str = null;
            if (bey != null) {
                Method a = bey.mo30094a("K5wwdM8iz8mAAoB1ZEL0/WelqLOVbmUKX2FOjKTd7XksfgJTw3SESwwZFTHnLk6D", "U3CsIeStq4zhCq0CtDyp7613iRyjSaX5gHXCXG5e1EQ=");
                if (a != null) {
                    str = (String) a.invoke(null, new Object[0]);
                }
            }
            if (str == null) {
                return false;
            }
        }
        try {
            try {
                apq a2 = apu.m33893a(azm.m34871a(str, true));
                C15613api.m33866a(aqp.f41222a);
                apy.m33905a((apx<P>) new aqt<P>());
                Class cls = (Class) apy.m33900a(apn.class);
                atn atn = a2.f41199a;
                int i = atn.zzfmu;
                int i2 = 0;
                boolean z = false;
                boolean z2 = true;
                for (C15649b bVar : atn.zzfmv) {
                    if (bVar.mo29534b() != ath.DESTROYED) {
                        i2++;
                        if (!(bVar.zzfmx != null)) {
                            throw new GeneralSecurityException(C2240a.m6772a("key %d has no key data", new Object[]{Integer.valueOf(bVar.zzfmz)}));
                        } else if (bVar.mo29535c() == atz.UNKNOWN_PREFIX) {
                            throw new GeneralSecurityException(C2240a.m6772a("key %d has unknown prefix", new Object[]{Integer.valueOf(bVar.zzfmz)}));
                        } else if (bVar.mo29534b() != ath.UNKNOWN_STATUS) {
                            if (bVar.mo29534b() == ath.ENABLED && bVar.zzfmz == i) {
                                if (!z) {
                                    z = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (bVar.mo29533a().mo29524a() != C15645b.ASYMMETRIC_PUBLIC) {
                                z2 = false;
                            }
                        } else {
                            throw new GeneralSecurityException(C2240a.m6772a("key %d has unknown status", new Object[]{Integer.valueOf(bVar.zzfmz)}));
                        }
                    }
                }
                if (i2 != 0) {
                    if (!z) {
                        if (!z2) {
                            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                        }
                    }
                    apv apv = new apv(cls);
                    for (C15649b bVar2 : a2.f41199a.zzfmv) {
                        if (bVar2.mo29534b() == ath.ENABLED) {
                            Object a3 = apy.m33901a(bVar2.mo29533a().zzflw, bVar2.mo29533a().zzflx, cls);
                            switch (bVar2.mo29535c()) {
                                case LEGACY:
                                case CRUNCHY:
                                    bArr = ByteBuffer.allocate(5).put(0).putInt(bVar2.zzfmz).array();
                                    break;
                                case TINK:
                                    bArr = ByteBuffer.allocate(5).put(1).putInt(bVar2.zzfmz).array();
                                    break;
                                case RAW:
                                    bArr = apj.f41192a;
                                    break;
                                default:
                                    throw new GeneralSecurityException("unknown output prefix type");
                            }
                            apw<P> apw = new apw<>(a3, bArr, bVar2.mo29534b(), bVar2.mo29535c());
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(apw);
                            String str2 = new String(apw.mo29461a(), apv.f41201a);
                            List list = (List) apv.f41202b.put(str2, Collections.unmodifiableList(arrayList));
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(list);
                                arrayList2.add(apw);
                                apv.f41202b.put(str2, Collections.unmodifiableList(arrayList2));
                            }
                            if (bVar2.zzfmz == a2.f41199a.zzfmu) {
                                apv.f41203c = apw;
                            }
                        }
                    }
                    apx apx = (apx) apy.f41210b.get(apv.f41204d);
                    if (apx == null) {
                        String str3 = "No wrapper found for ";
                        String valueOf = String.valueOf(apv.f41204d.getName());
                        throw new GeneralSecurityException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    f42245a = (apn) apx.mo29463a(apv);
                    if (f42245a != null) {
                        return true;
                    }
                    return false;
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (IllegalArgumentException unused2) {
            return false;
        }
    }
}
