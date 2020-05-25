package com.bytedance.scene;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.p038f.C0801o;
import com.bytedance.scene.navigation.C12940b;
import com.bytedance.scene.p840b.C12854a;
import com.bytedance.scene.p840b.C12857d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.j */
public final class C12929j extends Fragment {

    /* renamed from: a */
    public final C0801o<C12854a> f33856a;

    /* renamed from: b */
    public final C0801o<C12857d> f33857b;

    /* renamed from: c */
    public final List<C12940b> f33858c;

    /* renamed from: d */
    private final Set<Object> f33859d;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Iterator it = new HashSet(this.f33859d).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = new ArrayList(this.f33858c);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (((C12854a) this.f33856a.mo2591a(i)) != null) {
            this.f33856a.mo2594b(i);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((C12857d) this.f33857b.mo2591a(i)) != null) {
            this.f33857b.mo2594b(i);
        }
    }
}
