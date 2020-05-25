package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.p841c.C12880l;

/* renamed from: com.bytedance.scene.e */
public final class C12887e {

    /* renamed from: com.bytedance.scene.e$a */
    public static final class C12889a {

        /* renamed from: a */
        public final Activity f33723a;

        /* renamed from: b */
        public final Class<? extends C12896b> f33724b;

        /* renamed from: c */
        public Bundle f33725c;

        /* renamed from: d */
        public int f33726d;

        /* renamed from: e */
        public boolean f33727e;

        /* renamed from: f */
        public C12930k f33728f;

        /* renamed from: g */
        public String f33729g;

        /* renamed from: h */
        public boolean f33730h;

        private C12889a(Activity activity, Class<? extends C12896b> cls) {
            this.f33726d = 16908290;
            this.f33729g = "LifeCycleFragment";
            this.f33730h = true;
            this.f33723a = (Activity) C12880l.m25801a(activity, "Activity can't be null");
            this.f33724b = (Class) C12880l.m25801a(cls, "Root Scene class can't be null");
        }
    }
}
