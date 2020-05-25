package com.bytedance.jirafast.p749b;

import android.app.Activity;
import android.provider.MediaStore.Images.Media;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.p751d.C12015a;
import com.bytedance.jirafast.p751d.C12020d;
import com.bytedance.jirafast.p751d.C12044m;

/* renamed from: com.bytedance.jirafast.b.f */
public class C12002f implements C11998b {

    /* renamed from: a */
    private static C12002f f31751a;

    private C12002f() {
    }

    /* renamed from: c */
    public static C11998b m24401c() {
        if (f31751a == null) {
            synchronized (C12002f.class) {
                if (f31751a == null) {
                    f31751a = new C12002f();
                }
            }
        }
        return f31751a;
    }

    /* renamed from: b */
    public final void mo22741b() {
        C12020d.m24434a();
        if (C11991a.m24390a() != null) {
            C12044m mVar = C12044m.f31838c;
            mVar.f31840a.getContentResolver().unregisterContentObserver(mVar);
            C12044m.f31837b = false;
        }
    }

    /* renamed from: a */
    public final void mo22735a() {
        C12020d.m24434a();
        if (C11991a.m24390a() != null) {
            if (C12044m.f31838c == null) {
                C12044m.f31838c = new C12044m(C11991a.m24390a());
            }
            C12044m mVar = C12044m.f31838c;
            mVar.f31840a.getContentResolver().registerContentObserver(Media.EXTERNAL_CONTENT_URI, false, mVar);
            C12044m.f31837b = true;
        }
    }

    /* renamed from: a */
    public final void mo22736a(Activity activity) {
        C12020d.m24434a().mo22764a(activity);
    }

    /* renamed from: a */
    public final void mo22737a(C11997a aVar) {
        C12020d.m24434a().f31796b = aVar;
    }

    /* renamed from: a */
    public final void mo22738a(C12000d dVar) {
        C12020d.m24434a().mo22765a(dVar);
    }

    /* renamed from: a */
    public final void mo22739a(C12003g gVar) {
        C12020d.m24434a().f31795a = gVar;
    }

    /* renamed from: a */
    public final void mo22740a(String str) {
        C12015a.m24416a().mo22756a(C12015a.f31781v, str);
    }
}
