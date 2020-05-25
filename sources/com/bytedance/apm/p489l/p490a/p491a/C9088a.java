package com.bytedance.apm.p489l.p490a.p491a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.a.a.a */
public final class C9088a {
    /* renamed from: a */
    private static void m18006a(View view) {
        if (view.getBackground() != null) {
            try {
                view.getBackground().setCallback(null);
                view.setBackgroundDrawable(null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m18009a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setCallback(null);
            }
            imageView.setImageDrawable(null);
        }
    }

    /* renamed from: a */
    private static void m18010a(TextView textView) {
        Drawable[] compoundDrawables;
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setCallback(null);
            }
        }
        textView.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public static void m18011a(String str) {
        boolean b = ApmDelegate.m17947a().mo16433b("activity_leak_event");
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("activity_leak_event : ");
            sb.append(b);
            String[] strArr = {sb.toString()};
        }
        if (b && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, 1);
                C8936b.m17657a("activity_leak_event", jSONObject, (JSONObject) null, (JSONObject) null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m18007a(View view, Activity activity) {
        if (view != null && view.getContext() != null) {
            if (view.getContext() == activity) {
                m18006a(view);
                if (view instanceof ImageView) {
                    m18009a((ImageView) view);
                }
                if (view instanceof TextView) {
                    m18010a((TextView) view);
                }
            }
            if (view instanceof ViewGroup) {
                m18008a((ViewGroup) view, activity);
            }
        }
    }

    /* renamed from: a */
    private static void m18008a(ViewGroup viewGroup, Activity activity) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m18007a(viewGroup.getChildAt(i), activity);
        }
    }
}
