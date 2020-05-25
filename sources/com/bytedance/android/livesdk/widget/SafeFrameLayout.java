package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.p279af.C4578aq;
import org.json.JSONException;
import org.json.JSONObject;

public class SafeFrameLayout extends FrameLayout {
    public SafeFrameLayout(Context context) {
        super(context);
    }

    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            C3833a.m9731a(jSONObject, "error_msg", e.toString());
            JSONObject a = C4578aq.m10995a((ViewGroup) this);
            try {
                jSONObject.put("dump", a);
            } catch (JSONException unused) {
            }
            int i = 0;
            if (a.optJSONObject("repeat_id") != null) {
                i = 1;
            }
            C3837e.m9744a("ttlive_xg_restore_dump", i, jSONObject);
        }
    }

    public SafeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SafeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
