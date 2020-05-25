package com.bytedance.android.livesdk.p416t;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.t.e */
public final class C8300e {

    /* renamed from: a */
    Map<String, List<Object>> f22642a = new HashMap();

    /* renamed from: com.bytedance.android.livesdk.t.e$a */
    static final class C8301a {

        /* renamed from: a */
        public static final C8300e f22643a = new C8300e();
    }

    /* renamed from: a */
    public static final C8300e m16448a() {
        return C8301a.f22643a;
    }

    /* renamed from: a */
    public final List<Object> mo14475a(String str) {
        List<Object> list = (List) this.f22642a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f22642a.put(str, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14476a(String[] strArr) {
        for (String a : strArr) {
            Iterator it = mo14475a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14478b(String[] strArr, String[] strArr2) {
        for (String a : strArr2) {
            Iterator it = mo14475a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14477a(String[] strArr, String[] strArr2) {
        for (String a : strArr2) {
            Iterator it = mo14475a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
