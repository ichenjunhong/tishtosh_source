package com.p683ss.android.ugc.aweme.utils;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.l */
public final class C47930l {

    /* renamed from: a */
    public static final C47930l f120526a = new C47930l();

    private C47930l() {
    }

    /* renamed from: a */
    public static List<String> m103705a(JSONArray jSONArray) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                num = Integer.valueOf(jSONArray.length());
            } catch (Exception unused) {
            }
        } else {
            num = null;
        }
        int i = 0;
        if (num == null) {
            C52711k.m112234a();
        }
        int intValue = num.intValue();
        if (intValue >= 0) {
            while (true) {
                arrayList.add(jSONArray.getString(i));
                if (i == intValue) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
