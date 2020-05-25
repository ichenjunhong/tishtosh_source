package com.p683ss.android.ugc.aweme.p1396ay;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.ay.a */
public abstract class C23329a<PARAM_TYPE, SUB> {

    /* renamed from: b */
    protected WeakHashMap<View, PARAM_TYPE> f62337b = new WeakHashMap<>();

    /* renamed from: a */
    public final void mo48393a(View view) {
        this.f62337b.remove(view);
    }

    /* renamed from: b */
    public final PARAM_TYPE mo48394b(View view) {
        PARAM_TYPE param_type = this.f62337b.get(view);
        int i = 0;
        while (view.getId() != 16908290) {
            if (i <= 30) {
                param_type = this.f62337b.get(view);
                if (param_type != null) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
                i++;
            } else {
                return null;
            }
        }
        return param_type;
    }

    /* renamed from: a */
    public final SUB mo48392a(View view, PARAM_TYPE param_type) {
        this.f62337b.put(view, param_type);
        return this;
    }
}
