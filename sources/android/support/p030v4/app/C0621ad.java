package android.support.p030v4.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.app.ad */
public final class C0621ad {

    /* renamed from: a */
    private static final Object f2255a = new Object();

    /* renamed from: b */
    private static String f2256b;

    /* renamed from: c */
    private static Set<String> f2257c = new HashSet();

    /* renamed from: f */
    private static final Object f2258f = new Object();

    /* renamed from: g */
    private static C0624c f2259g;

    /* renamed from: d */
    private final Context f2260d;

    /* renamed from: e */
    private final NotificationManager f2261e = ((NotificationManager) this.f2260d.getSystemService("notification"));

    /* renamed from: android.support.v4.app.ad$a */
    static class C0622a implements C0626d {

        /* renamed from: a */
        final String f2262a;

        /* renamed from: b */
        final int f2263b;

        /* renamed from: c */
        final String f2264c;

        /* renamed from: d */
        final boolean f2265d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.f2262a);
            sb.append(", id:");
            sb.append(this.f2263b);
            sb.append(", tag:");
            sb.append(this.f2264c);
            sb.append(", all:");
            sb.append(this.f2265d);
            sb.append("]");
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo2145a(C0696w wVar) throws RemoteException {
            if (this.f2265d) {
                wVar.mo2342a(this.f2262a);
            } else {
                wVar.mo2343a(this.f2262a, this.f2263b, this.f2264c);
            }
        }

        C0622a(String str, int i, String str2) {
            this.f2262a = str;
            this.f2263b = i;
            this.f2264c = str2;
        }
    }

    /* renamed from: android.support.v4.app.ad$b */
    static class C0623b {

        /* renamed from: a */
        final ComponentName f2266a;

        /* renamed from: b */
        final IBinder f2267b;

        C0623b(ComponentName componentName, IBinder iBinder) {
            this.f2266a = componentName;
            this.f2267b = iBinder;
        }
    }

    /* renamed from: android.support.v4.app.ad$c */
    static class C0624c implements ServiceConnection, Callback {

        /* renamed from: a */
        final Handler f2268a;

        /* renamed from: b */
        private final Context f2269b;

        /* renamed from: c */
        private final HandlerThread f2270c;

        /* renamed from: d */
        private final Map<ComponentName, C0625a> f2271d = new HashMap();

        /* renamed from: e */
        private Set<String> f2272e = new HashSet();

        /* renamed from: android.support.v4.app.ad$c$a */
        static class C0625a {

            /* renamed from: a */
            final ComponentName f2273a;

            /* renamed from: b */
            boolean f2274b;

            /* renamed from: c */
            C0696w f2275c;

            /* renamed from: d */
            ArrayDeque<C0626d> f2276d = new ArrayDeque<>();

            /* renamed from: e */
            int f2277e = 0;

            C0625a(ComponentName componentName) {
                this.f2273a = componentName;
            }
        }

        /* renamed from: b */
        private void m1702b(C0625a aVar) {
            if (aVar.f2274b) {
                this.f2269b.unbindService(this);
                aVar.f2274b = false;
            }
            aVar.f2275c = null;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f2268a.obtainMessage(2, componentName).sendToTarget();
        }

        C0624c(Context context) {
            this.f2269b = context;
            this.f2270c = new HandlerThread("NotificationManagerCompat");
            this.f2270c.start();
            this.f2268a = new Handler(this.f2270c.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m1701a(C0625a aVar) {
            boolean z = true;
            if (aVar.f2274b) {
                return true;
            }
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2273a);
            Context context = this.f2269b;
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, component)) {
                z = context.bindService(component, this, 33);
            }
            aVar.f2274b = z;
            if (aVar.f2274b) {
                aVar.f2277e = 0;
            } else {
                this.f2269b.unbindService(this);
            }
            return aVar.f2274b;
        }

        /* renamed from: c */
        private void m1703c(C0625a aVar) {
            if (!this.f2268a.hasMessages(3, aVar.f2273a)) {
                aVar.f2277e++;
                if (aVar.f2277e > 6) {
                    aVar.f2276d.clear();
                    return;
                }
                int i = (1 << (aVar.f2277e - 1)) * 1000;
                this.f2268a.sendMessageDelayed(this.f2268a.obtainMessage(3, aVar.f2273a), (long) i);
            }
        }

        /* renamed from: d */
        private void m1704d(C0625a aVar) {
            if (!aVar.f2276d.isEmpty()) {
                if (!m1701a(aVar) || aVar.f2275c == null) {
                    m1703c(aVar);
                    return;
                }
                while (true) {
                    C0626d dVar = (C0626d) aVar.f2276d.peek();
                    if (dVar == null) {
                        break;
                    }
                    try {
                        dVar.mo2145a(aVar.f2275c);
                        aVar.f2276d.remove();
                    } catch (DeadObjectException | RemoteException unused) {
                    }
                }
                if (!aVar.f2276d.isEmpty()) {
                    m1703c(aVar);
                }
            }
        }

        public final boolean handleMessage(Message message) {
            C0696w wVar;
            switch (message.what) {
                case 0:
                    C0626d dVar = (C0626d) message.obj;
                    Set<String> b = C0621ad.m1697b(this.f2269b);
                    if (!b.equals(this.f2272e)) {
                        this.f2272e = b;
                        List<ResolveInfo> queryIntentServices = this.f2269b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                        HashSet<ComponentName> hashSet = new HashSet<>();
                        for (ResolveInfo resolveInfo : queryIntentServices) {
                            if (b.contains(resolveInfo.serviceInfo.packageName)) {
                                ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                                if (resolveInfo.serviceInfo.permission == null) {
                                    hashSet.add(componentName);
                                }
                            }
                        }
                        for (ComponentName componentName2 : hashSet) {
                            if (!this.f2271d.containsKey(componentName2)) {
                                this.f2271d.put(componentName2, new C0625a(componentName2));
                            }
                        }
                        Iterator it = this.f2271d.entrySet().iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            if (!hashSet.contains(entry.getKey())) {
                                m1702b((C0625a) entry.getValue());
                                it.remove();
                            }
                        }
                    }
                    for (C0625a aVar : this.f2271d.values()) {
                        aVar.f2276d.add(dVar);
                        m1704d(aVar);
                    }
                    return true;
                case 1:
                    C0623b bVar = (C0623b) message.obj;
                    ComponentName componentName3 = bVar.f2266a;
                    IBinder iBinder = bVar.f2267b;
                    C0625a aVar2 = (C0625a) this.f2271d.get(componentName3);
                    if (aVar2 != null) {
                        if (iBinder == null) {
                            wVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0696w)) {
                                wVar = new C0698a(iBinder);
                            } else {
                                wVar = (C0696w) queryLocalInterface;
                            }
                        }
                        aVar2.f2275c = wVar;
                        aVar2.f2277e = 0;
                        m1704d(aVar2);
                    }
                    return true;
                case 2:
                    C0625a aVar3 = (C0625a) this.f2271d.get((ComponentName) message.obj);
                    if (aVar3 != null) {
                        m1702b(aVar3);
                    }
                    return true;
                case 3:
                    C0625a aVar4 = (C0625a) this.f2271d.get((ComponentName) message.obj);
                    if (aVar4 != null) {
                        m1704d(aVar4);
                    }
                    return true;
                default:
                    return false;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f2268a.obtainMessage(1, new C0623b(componentName, iBinder)).sendToTarget();
        }
    }

    /* renamed from: android.support.v4.app.ad$d */
    interface C0626d {
        /* renamed from: a */
        void mo2145a(C0696w wVar) throws RemoteException;
    }

    /* renamed from: a */
    public final boolean mo2144a() {
        if (VERSION.SDK_INT >= 24) {
            return this.f2261e.areNotificationsEnabled();
        }
        if (VERSION.SDK_INT < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2260d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2260d.getApplicationInfo();
        String packageName = this.f2260d.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static C0621ad m1696a(Context context) {
        return new C0621ad(context);
    }

    private C0621ad(Context context) {
        this.f2260d = context;
    }

    /* renamed from: b */
    public static Set<String> m1697b(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2255a) {
            if (string != null) {
                try {
                    if (!string.equals(f2256b)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f2257c = hashSet;
                        f2256b = string;
                    }
                } finally {
                }
            }
            set = f2257c;
        }
        return set;
    }

    /* renamed from: a */
    public final void mo2143a(String str, int i) {
        this.f2261e.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            C0622a aVar = new C0622a(this.f2260d.getPackageName(), i, str);
            synchronized (f2258f) {
                if (f2259g == null) {
                    f2259g = new C0624c(this.f2260d.getApplicationContext());
                }
                f2259g.f2268a.obtainMessage(0, aVar).sendToTarget();
            }
        }
    }
}
