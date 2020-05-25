package com.p888c.p889a.p890a.p891a.p896d;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import com.p888c.p889a.p890a.p891a.p896d.C13416a.C13417a;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.d.d */
public final class C13420d implements C13416a {

    /* renamed from: a */
    private final int[] f34976a = new int[2];

    /* renamed from: a */
    public final JSONObject mo25121a(View view) {
        if (view == null) {
            return C13422b.m27058a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f34976a);
        return C13422b.m27058a(this.f34976a[0], this.f34976a[1], width, height);
    }

    /* renamed from: a */
    public final void mo25122a(View view, JSONObject jSONObject, C13417a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z || VERSION.SDK_INT < 21) {
                while (i < viewGroup.getChildCount()) {
                    aVar.mo25123a(viewGroup.getChildAt(i), this, jSONObject);
                    i++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    aVar.mo25123a((View) it2.next(), this, jSONObject);
                }
            }
        }
    }
}
