package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.ae */
public final class C22464ae {

    /* renamed from: a */
    static final LinkedList<WeakReference<Activity>> f60517a = new LinkedList<>();

    /* renamed from: b */
    public static final C22464ae f60518b = new C22464ae();

    /* renamed from: com.ss.android.ugc.aweme.ae$a */
    static final class C22465a extends C52712l implements C52671b<WeakReference<Activity>, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Activity f60519a;

        C22465a(Activity activity) {
            this.f60519a = activity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            WeakReference weakReference = (WeakReference) obj;
            C52711k.m112240b(weakReference, "it");
            Activity activity = (Activity) weakReference.get();
            if (activity == null || C52711k.m112239a((Object) activity, (Object) this.f60519a)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private C22464ae() {
    }

    /* renamed from: a */
    static void m55520a(Activity activity) {
        C52575l.m112110a((List) f60517a, (C52671b) new C22465a(activity));
    }

    /* renamed from: a */
    public static final int m55519a(Context context) {
        Activity activity;
        if (!(context instanceof Activity)) {
            return 1;
        }
        WeakReference weakReference = (WeakReference) C52575l.m112140f((List<? extends T>) f60517a);
        if (weakReference != null) {
            activity = (Activity) weakReference.get();
        } else {
            activity = null;
        }
        if (!C52711k.m112239a((Object) activity, (Object) context)) {
            return 2;
        }
        return 3;
    }
}
