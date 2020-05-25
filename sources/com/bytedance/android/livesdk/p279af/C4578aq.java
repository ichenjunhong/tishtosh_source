package com.bytedance.android.livesdk.p279af;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.af.aq */
public final class C4578aq {

    /* renamed from: a */
    private static int f12540a;

    /* renamed from: a */
    private static boolean m10997a(View view) {
        if (view.getId() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m10998b(View view) {
        if (view.getContext() == null || view.getContext().getResources() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        int i = f12540a;
        f12540a = i + 1;
        sb.append(i);
        if (view instanceof ProgressBar) {
            sb.append("#ProgressBar#");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m10995a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject();
        if (m10997a((View) viewGroup)) {
            arrayList.add(Integer.valueOf(viewGroup.getId()));
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(m10998b(viewGroup), m10996a(viewGroup, arrayList, hashSet));
            jSONObject.put("view_info", jSONObject2);
            if (!C9376b.m18558a((Collection<T>) hashSet)) {
                jSONObject.put("repeat_id", TextUtils.join(", ", hashSet));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m10996a(ViewGroup viewGroup, List<Integer> list, HashSet<Integer> hashSet) {
        if (viewGroup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", viewGroup.getId());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (m10997a(childAt)) {
                    if (list.contains(Integer.valueOf(childAt.getId()))) {
                        hashSet.add(Integer.valueOf(childAt.getId()));
                    } else {
                        list.add(Integer.valueOf(childAt.getId()));
                    }
                }
                if (childAt instanceof ViewGroup) {
                    jSONObject.put(m10998b(childAt), m10996a((ViewGroup) childAt, list, hashSet));
                } else {
                    jSONObject.put(m10998b(childAt), String.valueOf(childAt.getId()));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
