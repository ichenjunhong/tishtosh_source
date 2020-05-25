package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.w */
final /* synthetic */ class C40398w implements OnClickListener {

    /* renamed from: a */
    private final C40396a f103093a;

    /* renamed from: b */
    private final int f103094b;

    C40398w(C40396a aVar, int i) {
        this.f103093a = aVar;
        this.f103094b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40396a aVar = this.f103093a;
        int i = this.f103094b;
        C40394v.this.mo82627b(i);
        if (C40394v.this.f103088c != null) {
            C40394v.this.f103088c.mo82386a(i);
        }
        if (C40394v.this.f103086a) {
            Boolean bool = (Boolean) C40394v.this.f103089d.get(Integer.valueOf(i));
            C40394v.this.f103089d.put(Integer.valueOf(i), Boolean.valueOf(bool == null || !bool.booleanValue()));
            C40394v vVar = C40394v.this;
            if (bool == null || !bool.booleanValue()) {
                for (Entry entry : vVar.f103089d.entrySet()) {
                    if (((Integer) entry.getKey()).intValue() != i) {
                        entry.setValue(Boolean.valueOf(false));
                    }
                }
            }
        }
    }
}
