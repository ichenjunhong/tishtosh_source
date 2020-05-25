package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class apy {

    /* renamed from: a */
    static final ConcurrentMap<String, aph> f41209a = new ConcurrentHashMap();

    /* renamed from: b */
    static final ConcurrentMap<Class<?>, apx<?>> f41210b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Logger f41211c = Logger.getLogger(apy.class.getName());

    /* renamed from: d */
    private static final ConcurrentMap<String, apo> f41212d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, Boolean> f41213e = new ConcurrentHashMap();

    /* renamed from: a */
    public static synchronized void m33906a(String str, aph<?> aph) throws GeneralSecurityException {
        synchronized (apy.class) {
            if (f41209a.containsKey(str.toLowerCase())) {
                if (!aph.getClass().equals(((aph) f41209a.get(str.toLowerCase())).getClass())) {
                    Logger logger = f41211c;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                    sb.append("catalogue for name ");
                    sb.append(str);
                    sb.append(" has been already registered");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            f41209a.put(str.toLowerCase(), aph);
        }
    }

    /* renamed from: a */
    static <T> T m33900a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static synchronized <P> void m33903a(apo<P> apo) throws GeneralSecurityException {
        synchronized (apy.class) {
            m33904a(apo, true);
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m33904a(apo<P> apo, boolean z) throws GeneralSecurityException {
        synchronized (apy.class) {
            if (apo != null) {
                String a = apo.mo29447a();
                if (f41212d.containsKey(a)) {
                    apo a2 = m33897a(a, null);
                    boolean booleanValue = ((Boolean) f41213e.get(a)).booleanValue();
                    if (!apo.getClass().equals(a2.getClass()) || (!booleanValue && z)) {
                        Logger logger = f41211c;
                        Level level = Level.WARNING;
                        String str = "com.google.crypto.tink.Registry";
                        String str2 = "registerKeyManager";
                        String str3 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(a);
                        logger.logp(level, str, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        throw new GeneralSecurityException(C2240a.m6772a("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{a, a2.getClass().getName(), apo.getClass().getName()}));
                    }
                }
                f41212d.put(a, apo);
                f41213e.put(a, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m33905a(apx<P> apx) throws GeneralSecurityException {
        synchronized (apy.class) {
            if (apx != null) {
                Class a = apx.mo29462a();
                if (f41210b.containsKey(a)) {
                    apx apx2 = (apx) f41210b.get(a);
                    if (!apx.getClass().equals(apx2.getClass())) {
                        Logger logger = f41211c;
                        Level level = Level.WARNING;
                        String str = "com.google.crypto.tink.Registry";
                        String str2 = "registerPrimitiveWrapper";
                        String str3 = "Attempted overwrite of a registered SetWrapper for type ";
                        String valueOf = String.valueOf(a.toString());
                        logger.logp(level, str, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        throw new GeneralSecurityException(C2240a.m6772a("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), apx2.getClass().getName(), apx.getClass().getName()}));
                    }
                }
                f41210b.put(a, apx);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: a */
    private static <P> apo<P> m33897a(String str, Class<P> cls) throws GeneralSecurityException {
        apo<P> apo = (apo) f41212d.get(str);
        if (apo == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("No key manager found for key type: ");
            sb.append(str);
            sb.append(".  Check the configuration of the registry.");
            throw new GeneralSecurityException(sb.toString());
        } else if (cls == null || apo.mo29450b().equals(cls)) {
            return apo;
        } else {
            String name = apo.mo29450b().getName();
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80 + String.valueOf(str).length() + String.valueOf(name2).length());
            sb2.append("Primitive type ");
            sb2.append(name);
            sb2.append(" of keymanager for type ");
            sb2.append(str);
            sb2.append(" does not match requested primitive type ");
            sb2.append(name2);
            throw new GeneralSecurityException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static synchronized ate m33898a(atj atj) throws GeneralSecurityException {
        ate c;
        synchronized (apy.class) {
            apo a = m33897a(atj.zzflw, null);
            if (((Boolean) f41213e.get(atj.zzflw)).booleanValue()) {
                c = a.mo29451c(atj.zzflx);
            } else {
                String str = "newKey-operation not permitted for key type ";
                String valueOf = String.valueOf(atj.zzflw);
                throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return c;
    }

    /* renamed from: b */
    public static synchronized azj m33907b(atj atj) throws GeneralSecurityException {
        azj b;
        synchronized (apy.class) {
            apo a = m33897a(atj.zzflw, null);
            if (((Boolean) f41213e.get(atj.zzflw)).booleanValue()) {
                b = a.mo29448b(atj.zzflx);
            } else {
                String str = "newKey-operation not permitted for key type ";
                String valueOf = String.valueOf(atj.zzflw);
                throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static synchronized azj m33899a(String str, azj azj) throws GeneralSecurityException {
        azj b;
        synchronized (apy.class) {
            apo a = m33897a(str, null);
            if (((Boolean) f41213e.get(str)).booleanValue()) {
                b = a.mo29449b(azj);
            } else {
                String str2 = "newKey-operation not permitted for key type ";
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static <P> P m33902a(String str, azj azj, Class<P> cls) throws GeneralSecurityException {
        return m33897a(str, (Class) m33900a((T) cls)).mo29446a(azj);
    }

    /* renamed from: a */
    static <P> P m33901a(String str, awo awo, Class<P> cls) throws GeneralSecurityException {
        return m33897a(str, cls).mo29445a(awo);
    }
}
