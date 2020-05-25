package com.p683ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.p683ss.android.newmedia.redbadge.p1199a.C19573a;
import com.p683ss.android.newmedia.redbadge.p1199a.C19574b;
import com.p683ss.android.newmedia.redbadge.p1199a.C19575c;
import com.p683ss.android.newmedia.redbadge.p1199a.C19576d;
import com.p683ss.android.newmedia.redbadge.p1199a.C19577e;
import com.p683ss.android.newmedia.redbadge.p1199a.C19578f;
import com.p683ss.android.newmedia.redbadge.p1199a.C19579g;
import com.p683ss.android.newmedia.redbadge.p1199a.C19580h;
import com.p683ss.android.newmedia.redbadge.p1199a.C19581i;
import com.p683ss.android.newmedia.redbadge.p1199a.C19582j;
import com.p683ss.android.newmedia.redbadge.p1199a.C19583k;
import com.p683ss.android.newmedia.redbadge.p1199a.C19584l;
import com.p683ss.android.newmedia.redbadge.p1199a.C19588m;
import com.p683ss.android.newmedia.redbadge.p1199a.C19589n;
import com.p683ss.android.newmedia.redbadge.p1199a.C19590o;
import com.p683ss.android.newmedia.redbadge.p1199a.C19591p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.h */
public class C19611h {

    /* renamed from: a */
    private static final List<Class<? extends C19572a>> f54026a;

    /* renamed from: d */
    private static volatile C19611h f54027d;

    /* renamed from: b */
    private C19572a f54028b;

    /* renamed from: c */
    private ComponentName f54029c;

    private C19611h() {
    }

    /* renamed from: a */
    public static synchronized C19611h m47955a() {
        C19611h hVar;
        synchronized (C19611h.class) {
            if (f54027d == null) {
                synchronized (C19611h.class) {
                    if (f54027d == null) {
                        f54027d = new C19611h();
                    }
                }
            }
            hVar = f54027d;
        }
        return hVar;
    }

    static {
        LinkedList linkedList = new LinkedList();
        f54026a = linkedList;
        linkedList.add(C19573a.class);
        f54026a.add(C19574b.class);
        f54026a.add(C19579g.class);
        f54026a.add(C19580h.class);
        f54026a.add(C19584l.class);
        f54026a.add(C19589n.class);
        f54026a.add(C19575c.class);
        f54026a.add(C19578f.class);
        f54026a.add(C19581i.class);
        f54026a.add(C19588m.class);
        f54026a.add(C19590o.class);
        f54026a.add(C19591p.class);
        f54026a.add(C19582j.class);
        f54026a.add(C19577e.class);
        f54026a.add(C19583k.class);
    }

    /* renamed from: a */
    public final boolean mo40865a(Context context) {
        return mo40866a(context, 0);
    }

    /* renamed from: b */
    private boolean m47956b(Context context) {
        C19572a aVar;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return false;
            }
            this.f54029c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (!(resolveActivity == null || resolveActivity.activityInfo == null || TextUtils.isEmpty(resolveActivity.activityInfo.name))) {
                if (!resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveActivity.activityInfo.packageName;
                    Iterator it = f54026a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            aVar = (C19572a) ((Class) it.next()).newInstance();
                        } catch (Throwable unused) {
                            aVar = null;
                        }
                        if (aVar != null) {
                            if (aVar.mo40825a().contains(str)) {
                                this.f54028b = aVar;
                                z = true;
                                break;
                            }
                        }
                    }
                    if (this.f54028b == null) {
                        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                            this.f54028b = new C19581i();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                            this.f54028b = new C19588m();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                            this.f54028b = new C19589n();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                            this.f54028b = new C19591p();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
                            this.f54028b = new C19590o();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("SONY")) {
                            this.f54028b = new C19584l();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
                            this.f54028b = new C19582j();
                        } else {
                            this.f54028b = new C19576d();
                        }
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final boolean mo40866a(Context context, int i) {
        try {
            mo40867b(context, i);
            return true;
        } catch (C19610g unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo40867b(Context context, int i) throws C19610g {
        if (this.f54028b != null || m47956b(context)) {
            try {
                this.f54028b.mo40826a(context, this.f54029c, i);
            } catch (Exception e) {
                throw new C19610g("Unable to execute badge", e);
            }
        } else {
            throw new C19610g("No default launcher available");
        }
    }
}
