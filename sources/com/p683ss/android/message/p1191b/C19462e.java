package com.p683ss.android.message.p1191b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.p683ss.android.message.p1191b.C19453a.C19455b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.message.b.e */
public class C19462e {

    /* renamed from: a */
    private static List<String> f53781a;

    /* renamed from: b */
    private static List<ServiceInfo> f53782b;

    /* renamed from: c */
    private static List<ActivityInfo> f53783c;

    /* renamed from: d */
    private static List<ActivityInfo> f53784d;

    /* renamed from: e */
    private static List<ProviderInfo> f53785e;

    /* renamed from: a */
    private static List<String> m47618a(Context context) throws NameNotFoundException {
        if (f53781a == null) {
            synchronized (C19462e.class) {
                if (f53781a == null) {
                    String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                    if (strArr != null) {
                        f53781a = Arrays.asList(strArr);
                    }
                }
            }
        }
        return f53781a;
    }

    /* renamed from: b */
    private static List<ServiceInfo> m47621b(Context context) throws NameNotFoundException {
        if (f53782b == null) {
            synchronized (C19462e.class) {
                if (f53782b == null) {
                    ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services;
                    if (serviceInfoArr != null) {
                        f53782b = Arrays.asList(serviceInfoArr);
                    }
                }
            }
        }
        return f53782b;
    }

    /* renamed from: c */
    private static List<ActivityInfo> m47624c(Context context) throws NameNotFoundException {
        if (f53783c == null) {
            synchronized (C19462e.class) {
                if (f53783c == null) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 514).receivers;
                    if (activityInfoArr != null) {
                        f53783c = Arrays.asList(activityInfoArr);
                    }
                }
            }
        }
        return f53783c;
    }

    /* renamed from: d */
    private static List<ActivityInfo> m47627d(Context context) throws NameNotFoundException {
        if (f53784d == null) {
            synchronized (C19462e.class) {
                if (f53784d == null) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 513).activities;
                    if (activityInfoArr != null) {
                        f53784d = Arrays.asList(activityInfoArr);
                    }
                }
            }
        }
        return f53784d;
    }

    /* renamed from: e */
    private static List<ProviderInfo> m47629e(Context context) throws NameNotFoundException {
        if (f53785e == null) {
            synchronized (C19462e.class) {
                if (f53785e == null) {
                    ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 520).providers;
                    if (providerInfoArr != null) {
                        f53785e = Arrays.asList(providerInfoArr);
                    }
                }
            }
        }
        return f53785e;
    }

    /* renamed from: a */
    private static boolean m47619a(Context context, String str, C19455b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f53776b != null) {
            for (String addCategory : bVar.f53776b) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str2);
        if (bVar.f53777c != null) {
            intent.setData(bVar.f53777c);
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 64);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null && TextUtils.equals(resolveInfo.activityInfo.name, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m47622b(Context context, String str, C19455b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f53776b != null) {
            for (String addCategory : bVar.f53776b) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str2);
        if (bVar.f53777c != null) {
            intent.setData(bVar.f53777c);
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo != null && (TextUtils.isEmpty(str) || TextUtils.equals(resolveInfo.serviceInfo.name, str))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m47625c(Context context, String str, C19455b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f53776b != null) {
            for (String addCategory : bVar.f53776b) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str2);
        if (bVar.f53777c != null) {
            intent.setData(bVar.f53777c);
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && TextUtils.equals(resolveInfo.activityInfo.name, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m47620a(Context context, String str, String str2, List<String> list) throws NameNotFoundException {
        List a = m47618a(context);
        if (a == null || a.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            if (!a.contains(str3)) {
                arrayList.add(str3);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m47623b(Context context, String str, String str2, List<C19453a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List b = m47621b(context);
        if (b == null || b.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19453a aVar : list) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ServiceInfo serviceInfo = (ServiceInfo) it.next();
                if (TextUtils.equals(serviceInfo.name, aVar.f53770b)) {
                    boolean equals = TextUtils.equals(aVar.f53771c, serviceInfo.processName);
                    if (!TextUtils.isEmpty(aVar.f53772d)) {
                        z3 = TextUtils.equals(serviceInfo.permission, aVar.f53772d);
                    } else {
                        z3 = true;
                    }
                    if (!equals) {
                        z4 = false;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                    if (aVar.f53769a != null) {
                        boolean z5 = true;
                        for (C19455b bVar : aVar.f53769a) {
                            if (bVar.f53775a != null) {
                                for (String b2 : bVar.f53775a) {
                                    if (!m47622b(context, aVar.f53770b, bVar, b2)) {
                                        z5 = false;
                                    }
                                }
                            }
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    z = z4;
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m47626c(Context context, String str, String str2, List<C19453a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List c = m47624c(context);
        if (c == null || c.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19453a aVar : list) {
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                if (TextUtils.equals(activityInfo.name, aVar.f53770b)) {
                    if (!TextUtils.equals(aVar.f53771c, activityInfo.processName)) {
                        z4 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f53772d)) {
                        z3 = TextUtils.equals(activityInfo.permission, aVar.f53772d);
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                    if (aVar.f53769a != null) {
                        boolean z5 = true;
                        for (C19455b bVar : aVar.f53769a) {
                            if (bVar.f53775a != null) {
                                for (String a : bVar.f53775a) {
                                    if (!m47619a(context, aVar.f53770b, bVar, a)) {
                                        z5 = false;
                                    }
                                }
                            }
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    z = z4;
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m47628d(Context context, String str, String str2, List<C19453a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List d = m47627d(context);
        if (d == null || d.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19453a aVar : list) {
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                if (TextUtils.equals(activityInfo.name, aVar.f53770b)) {
                    if (!TextUtils.equals(aVar.f53771c, activityInfo.processName)) {
                        z4 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f53772d)) {
                        z3 = TextUtils.equals(activityInfo.permission, aVar.f53772d);
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                    if (aVar.f53769a != null) {
                        boolean z5 = true;
                        for (C19455b bVar : aVar.f53769a) {
                            if (bVar.f53775a != null) {
                                for (String c : bVar.f53775a) {
                                    if (!m47625c(context, aVar.f53770b, bVar, c)) {
                                        z5 = false;
                                    }
                                }
                            }
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    z = z4;
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m47630e(Context context, String str, String str2, List<C19453a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List e = m47629e(context);
        if (e == null || e.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19453a aVar : list) {
            Iterator it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ProviderInfo providerInfo = (ProviderInfo) it.next();
                if (TextUtils.equals(providerInfo.name, aVar.f53770b)) {
                    if (!TextUtils.equals(aVar.f53771c, providerInfo.processName)) {
                        z4 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f53773e)) {
                        z3 = TextUtils.equals(providerInfo.authority, aVar.f53773e);
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        z2 = true;
                        z = false;
                    } else {
                        z = z4;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }
}
