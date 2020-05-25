package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import com.C2240a;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31548b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31486b;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45398ap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.a */
public final class C31503a implements C31567e {

    /* renamed from: a */
    private final Context f82413a;

    /* renamed from: b */
    private final String f82414b;

    /* renamed from: c */
    private final int f82415c;

    /* renamed from: d */
    private final List<C52847n<int[], String>> f82416d;

    /* renamed from: e */
    private final C31504b f82417e;

    /* renamed from: b */
    public final void mo64427b() {
        Object a = C26888e.m65000a(this.f82413a, C39666o.class);
        C52711k.m112236a(a, "SharedPreferencesHelper\n…dPreferences::class.java)");
        ((C39666o) a).mo48450a(-1);
    }

    /* renamed from: a */
    public final List<C31493f> mo64425a() {
        List list;
        C39666o oVar = (C39666o) C26888e.m65000a(this.f82413a, C39666o.class);
        int i = this.f82415c;
        C52711k.m112236a((Object) oVar, "preferences");
        if (i != oVar.mo48448a()) {
            for (C52847n nVar : this.f82416d) {
                C45398ap.m98956a(this.f82413a, (int[]) nVar.getFirst(), (String) nVar.getSecond());
            }
            oVar.mo48450a(this.f82415c);
        }
        String[] stringArray = this.f82413a.getResources().getStringArray(this.f82417e.f82418a);
        String[] stringArray2 = this.f82413a.getResources().getStringArray(this.f82417e.f82419b);
        C52711k.m112236a((Object) stringArray, "localFilterNames");
        Collection arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str = stringArray[i3];
            int i5 = i4 + 1;
            TypedArray obtainTypedArray = this.f82413a.getResources().obtainTypedArray(this.f82417e.f82420c);
            int resourceId = obtainTypedArray.getResourceId(i4, i2);
            obtainTypedArray.recycle();
            int i6 = -1 - i4;
            C52711k.m112236a((Object) str, "filterName");
            String str2 = stringArray2[i4];
            if (i4 == 0) {
                String[] strArr = new String[1];
                strArr[i2] = C31483a.f82385b;
                list = C52575l.m112101c(strArr);
            } else {
                list = C52575l.m112097a();
            }
            StringBuilder sb = new StringBuilder("res://");
            sb.append(this.f82413a.getPackageName());
            sb.append('/');
            sb.append(resourceId);
            List list2 = list;
            C31493f fVar = r8;
            C31493f fVar2 = new C31493f(i6, str, str2, null, list2, Uri.parse(sb.toString()));
            arrayList.add(fVar);
            i3++;
            i4 = i5;
            i2 = 0;
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public final boolean mo64426a(C31493f fVar) {
        C52711k.m112240b(fVar, "filterMeta");
        if (fVar.f82404a < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C31550d mo64424a(int i) {
        int i2 = -1 - i;
        StringBuilder sb = new StringBuilder();
        sb.append(C31486b.m73322a(this.f82414b));
        String a = C2240a.m6772a("filter_%02d/", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        sb.append(a);
        String a2 = C31548b.m73412a(sb.toString());
        return new C31550d(a2, C31548b.m73413b(a2), "");
    }

    public C31503a(Context context, String str, int i, List<C52847n<int[], String>> list, C31504b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "filterRootDir");
        C52711k.m112240b(list, "filterRawAndUnzipPath");
        C52711k.m112240b(bVar, "resourceTable");
        this.f82413a = context;
        this.f82414b = str;
        this.f82415c = i;
        this.f82416d = list;
        this.f82417e = bVar;
    }
}
