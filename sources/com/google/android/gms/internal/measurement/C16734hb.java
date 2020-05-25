package com.google.android.gms.internal.measurement;

import com.C2240a;
import com.google.android.gms.internal.measurement.C16721gq;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.hb */
abstract class C16734hb<T extends C16721gq> {

    /* renamed from: a */
    private static final Logger f47083a = Logger.getLogger(C16709gj.class.getName());

    /* renamed from: b */
    private static String f47084b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C16734hb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo32223a();

    /* renamed from: a */
    static <T extends C16721gq> T m40272a(Class<T> cls) {
        String str;
        ClassLoader classLoader = C16734hb.class.getClassLoader();
        if (cls.equals(C16721gq.class)) {
            str = f47084b;
        } else if (cls.getPackage().equals(C16734hb.class.getPackage())) {
            str = C2240a.m6772a("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C16721gq) cls.cast(((C16734hb) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo32223a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(C16734hb.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C16721gq) cls.cast(((C16734hb) it.next()).mo32223a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f47083a;
                    Level level = Level.SEVERE;
                    String str2 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    String str3 = "load";
                    String str4 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C16721gq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C16721gq) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
