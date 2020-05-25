package com.p683ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.utils.permission.PermissionViewModel.C47936a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.a */
public final class C47937a {

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.a$a */
    public interface C47939a {
        /* renamed from: a */
        void mo60068a();

        /* renamed from: b */
        void mo60069b();
    }

    /* renamed from: a */
    public static boolean m103722a(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m103721a(Context context, String[] strArr) {
        List b = m103723b(context, strArr);
        if (b == null || b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static List<String> m103723b(Context context, String... strArr) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (C0726c.m2090a(context, str) == -1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m103719a(Activity activity, int i, String[] strArr, C47939a aVar) {
        if (activity != null) {
            PermissionViewModel permissionViewModel = (PermissionViewModel) C0214z.m440a((FragmentActivity) activity).mo359a(PermissionViewModel.class);
            C47936a aVar2 = new C47936a();
            aVar2.f120536a = aVar;
            aVar2.f120537b = i;
            permissionViewModel.f120535a = aVar2;
            List b = m103723b(activity, strArr);
            if (b == null || b.isEmpty()) {
                if (aVar != null) {
                    aVar.mo60068a();
                }
                return;
            }
            C0636b.m1718a(activity, (String[]) b.toArray(new String[b.size()]), i);
        }
    }

    /* renamed from: b */
    public static void m103724b(Activity activity, int i, String[] strArr, final C47939a aVar) {
        if (activity != null) {
            List b = m103723b(activity, strArr);
            if (b == null || b.isEmpty()) {
                aVar.mo60068a();
            } else {
                C23361b.m57419a(activity, strArr, new C23364b() {
                    /* renamed from: a */
                    public final void mo40906a(String[] strArr, int[] iArr) {
                        if (aVar != null) {
                            if (C47937a.m103722a(iArr)) {
                                aVar.mo60068a();
                                return;
                            }
                            aVar.mo60069b();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m103720a(Activity activity, int i, String[] strArr, int[] iArr) {
        C47936a aVar = ((PermissionViewModel) C0214z.m440a((FragmentActivity) activity).mo359a(PermissionViewModel.class)).f120535a;
        if (!(aVar == null || aVar.f120537b == -1 || i != aVar.f120537b || aVar.f120536a == null)) {
            if (m103722a(iArr)) {
                aVar.f120536a.mo60068a();
                return;
            }
            aVar.f120536a.mo60069b();
        }
    }
}
