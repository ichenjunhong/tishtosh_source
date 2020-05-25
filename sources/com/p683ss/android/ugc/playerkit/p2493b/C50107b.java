package com.p683ss.android.ugc.playerkit.p2493b;

import android.support.p030v4.p038f.C0786h;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.b.b */
public final class C50107b {

    /* renamed from: a */
    public static final boolean f125504a = false;

    /* renamed from: b */
    public static volatile String f125505b;

    /* renamed from: c */
    public static C50106a f125506c;

    /* renamed from: d */
    private static volatile C0786h<String, List<C50108a>> f125507d = new C0786h<>(4);

    /* renamed from: com.ss.android.ugc.playerkit.b.b$a */
    public static class C50108a {

        /* renamed from: a */
        int f125508a;

        /* renamed from: b */
        String f125509b;

        public final int hashCode() {
            return this.f125508a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.f125508a == ((C50108a) obj).f125508a) {
                return true;
            }
            return false;
        }

        C50108a(int i, String str) {
            this.f125508a = i;
            this.f125509b = str;
        }
    }

    /* renamed from: a */
    public static void m108065a(String str) {
        if (!TextUtils.isEmpty(str) && ((List) f125507d.mo2501a(str)) == null) {
            f125507d.mo2502a(str, new CopyOnWriteArrayList());
        }
    }

    /* renamed from: b */
    public static String m108067b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List list = (List) f125507d.mo2501a(str);
        if (list == null || list.isEmpty()) {
            return "";
        }
        C50108a[] aVarArr = (C50108a[]) list.toArray(new C50108a[list.size()]);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < aVarArr.length - 1; i++) {
                jSONArray.put(aVarArr[i].f125508a);
                sb.append(aVarArr[i].f125509b);
                sb.append(",");
            }
            jSONArray.put(aVarArr[aVarArr.length - 1].f125508a);
            sb.append(aVarArr[aVarArr.length - 1].f125509b);
            sb.append("]");
            list.clear();
            jSONObject.put("codes", jSONArray);
            jSONObject.put("extra", sb.toString());
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static void m108066a(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            List list = (List) f125507d.mo2501a(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                f125507d.mo2502a(str, list);
            }
            if (list.size() < 16) {
                C50108a aVar = new C50108a(i, str2);
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
    }
}
