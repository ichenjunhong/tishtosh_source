package com.bytedance.android.live.core.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p230g.C3913t;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.core.setting.c */
final /* synthetic */ class C4081c implements OnClickListener {

    /* renamed from: a */
    private final C4078a f11237a;

    C4081c(C4078a aVar) {
        this.f11237a = aVar;
    }

    public final void onClick(View view) {
        C4078a aVar = this.f11237a;
        try {
            Type c = C4098q.m10223c(aVar.f11231b);
            String str = c == String.class ? (String) aVar.mo9419a(String.class, C4078a.m10195a((ViewGroup) aVar.f11230a, (Object) C4098q.m10216a(aVar.f11231b))) : c instanceof Class ? C3913t.m9891a(aVar.mo9419a((Class) c, C4078a.m10195a((ViewGroup) aVar.f11230a, (Object) C4098q.m10216a(aVar.f11231b)))) : null;
            if (C4098q.m10219a(aVar.f11231b, str)) {
                aVar.f11233d.accept(Integer.valueOf(aVar.f11232c));
                aVar.dismiss();
            }
        } catch (Exception unused) {
        }
    }
}
