package com.bytedance.android.livesdk.p399o.p400a;

import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.android.livesdk.p399o.C8064d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.o.a.a */
public class C8029a {

    /* renamed from: a */
    public static final C8064d f21972a = C8064d.m16005b();

    /* renamed from: b */
    private static volatile C8029a f21973b;

    /* renamed from: a */
    public final void mo14190a(String str, String str2, int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject a = m15936a(jSONObject.toString());
            if (a != null) {
                m15939a(a, "service", str2);
                m15938a(a, "status_code", i);
                f21972a.mo9200b(str, a);
            }
        }
    }

    /* renamed from: a */
    public static C8029a m15933a() {
        if (f21973b == null) {
            synchronized (C8029a.class) {
                if (f21973b == null) {
                    f21973b = new C8029a();
                }
            }
        }
        return f21973b;
    }

    /* renamed from: a */
    private static JSONObject m15936a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m15942d(View view) {
        if (view != null) {
            return (String) view.getContentDescription();
        }
        return "";
    }

    /* renamed from: b */
    private static String m15940b(View view) {
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        return "";
    }

    /* renamed from: c */
    private static String m15941c(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = "";
        }
        if (obj == null) {
            return "";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private static String m15935a(View view) {
        String str;
        String str2 = "";
        if (view == null || view.getId() <= 0 || view.getContext() == null) {
            return str2;
        }
        try {
            StringBuilder sb = new StringBuilder("R.id.");
            sb.append(view.getContext().getResources().getResourceEntryName(view.getId()));
            str = sb.toString();
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }

    /* renamed from: a */
    public static JSONObject m15937a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private String m15934a(int i, ViewGroup viewGroup) {
        StringBuffer stringBuffer = new StringBuffer();
        if (viewGroup == null) {
            return stringBuffer.toString();
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            stringBuffer.append("|index:");
            stringBuffer.append(i);
            stringBuffer.append(i2);
            String b = m15940b(childAt);
            if (!TextUtils.isEmpty(b)) {
                stringBuffer.append("|text:");
                stringBuffer.append(b);
            }
            if (!TextUtils.isEmpty(m15941c(childAt))) {
                stringBuffer.append("|tag:");
                stringBuffer.append(b);
            }
            String d = m15942d(childAt);
            if (!TextUtils.isEmpty(d)) {
                stringBuffer.append("|description:");
                stringBuffer.append(d);
            }
            if (childAt instanceof ViewGroup) {
                stringBuffer.append(m15934a(i2, (ViewGroup) childAt));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final Map<String, String> mo14188a(View view, String str) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("type", "action");
            hashMap.put("action", str);
            if (view == null) {
                return hashMap;
            }
            hashMap.put("class_name", view.toString());
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            String str2 = (String) view.getTag(-16777215);
            if (str2 != null) {
                stringBuffer.append("page_name:");
                stringBuffer.append(str2);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent.getParent() == null || !(parent instanceof View) || !TextUtils.isEmpty(str2)) {
                    break;
                }
                View view2 = (View) parent;
                if (view2.getTag(-16777215) != null) {
                    String str3 = (String) view2.getTag(-16777215);
                    stringBuffer.append("page_name:");
                    stringBuffer.append(str3);
                    break;
                }
                parent = parent.getParent();
            }
            JSONObject jSONObject = new JSONObject();
            String a = m15935a(view);
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("id", a);
                stringBuffer.append("|id:");
                stringBuffer.append(a);
                z = false;
            }
            if (view.getParent() != null) {
                if (view.getParent() instanceof RecyclerView) {
                    int indexOfChild = ((RecyclerView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|RecyclerView|position:");
                    stringBuffer.append(indexOfChild);
                    m15938a(jSONObject, "position", indexOfChild);
                    if (view instanceof ViewGroup) {
                        m15939a(jSONObject, "children_info", m15934a(0, (ViewGroup) view));
                    }
                } else if (view.getParent() instanceof ListView) {
                    int indexOfChild2 = ((ListView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|ListView|position:");
                    stringBuffer.append(indexOfChild2);
                    m15938a(jSONObject, "position", indexOfChild2);
                    if (view instanceof ViewGroup) {
                        m15939a(jSONObject, "children_info", m15934a(0, (ViewGroup) view));
                    }
                }
            }
            String b = m15940b(view);
            if (!TextUtils.isEmpty(b)) {
                m15939a(jSONObject, "text", b);
                stringBuffer.append("|text:");
                stringBuffer.append(b);
                z = false;
            }
            String c = m15941c(view);
            if (!TextUtils.isEmpty(c)) {
                m15939a(jSONObject, "tag", c);
                stringBuffer.append("|tag:");
                stringBuffer.append(c);
                z = false;
            }
            String d = m15942d(view);
            if (!TextUtils.isEmpty(d)) {
                m15939a(jSONObject, "description", d);
                stringBuffer.append("|description:");
                stringBuffer.append(d);
                z = false;
            }
            if (jSONObject.length() > 0) {
                z = false;
            }
            if (z && (view instanceof ViewGroup)) {
                m15939a(jSONObject, "children_info", m15934a(0, (ViewGroup) view));
            }
            hashMap.put("params", jSONObject.toString());
            hashMap.put(LeakCanaryFileProvider.f132050j, stringBuffer.toString());
            return hashMap;
        } catch (Throwable unused) {
            return hashMap;
        }
    }

    /* renamed from: a */
    public static void m15938a(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15939a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo14189a(String str, String str2, int i, Map map) {
        mo14190a(str, str2, i, m15937a(map));
    }
}
