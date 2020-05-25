package com.bytedance.retrofit2.p830a;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.a.d */
public final class C12688d {

    /* renamed from: a */
    public final String f33346a;

    /* renamed from: b */
    public final int f33347b;

    /* renamed from: c */
    public final String f33348c;

    /* renamed from: d */
    public final List<C12685b> f33349d;

    /* renamed from: e */
    public final TypedInput f33350e;

    /* renamed from: f */
    public Object f33351f;

    /* renamed from: a */
    public final boolean mo23866a() {
        if (this.f33347b < 200 || this.f33347b >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C12685b mo23865a(String str) {
        if (this.f33349d == null) {
            return null;
        }
        for (C12685b bVar : this.f33349d) {
            if (str.equalsIgnoreCase(bVar.f33318a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final List<C12685b> mo23867b(String str) {
        ArrayList arrayList = null;
        if (str == null || this.f33349d == null) {
            return null;
        }
        for (C12685b bVar : this.f33349d) {
            if (str.equalsIgnoreCase(bVar.f33318a)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public C12688d(String str, int i, String str2, List<C12685b> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i < 200) {
            StringBuilder sb = new StringBuilder("Invalid status code: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list != null) {
            this.f33346a = str;
            this.f33347b = i;
            this.f33348c = str2;
            this.f33349d = Collections.unmodifiableList(new ArrayList(list));
            this.f33350e = typedInput;
        } else {
            throw new IllegalArgumentException("headers == null");
        }
    }
}
