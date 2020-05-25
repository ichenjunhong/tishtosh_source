package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.r */
public final class C40813r extends C0677p {

    /* renamed from: a */
    private final FragmentActivity f103945a;

    public final int getCount() {
        return 3;
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        switch (i) {
            case 0:
                C40817v vVar = new C40817v();
                FragmentActivity fragmentActivity = this.f103945a;
                C0209x a = C0214z.m440a(this.f103945a).mo359a(ABAndSettingViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ou…ingViewModel::class.java)");
                vVar.mo83156a((C40814s) new C40830y(fragmentActivity, new C40787f((ABAndSettingViewModel) a)));
                return vVar;
            case 1:
                C40817v vVar2 = new C40817v();
                FragmentActivity fragmentActivity2 = this.f103945a;
                C0209x a2 = C0214z.m440a(this.f103945a).mo359a(ABAndSettingViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ou…ingViewModel::class.java)");
                vVar2.mo83156a((C40814s) new C40830y(fragmentActivity2, new C40767ae((ABAndSettingViewModel) a2)));
                return vVar2;
            default:
                C40817v vVar3 = new C40817v();
                FragmentActivity fragmentActivity3 = this.f103945a;
                C0209x a3 = C0214z.m440a(this.f103945a).mo359a(ABAndSettingViewModel.class);
                C52711k.m112236a((Object) a3, "ViewModelProviders.of(ou…ingViewModel::class.java)");
                vVar3.mo83156a((C40814s) new C40830y(fragmentActivity3, new C40774aj((ABAndSettingViewModel) a3)));
                return vVar3;
        }
    }

    public C40813r(C0654k kVar, FragmentActivity fragmentActivity) {
        C52711k.m112240b(kVar, "fm");
        C52711k.m112240b(fragmentActivity, "outActivity");
        super(kVar);
        this.f103945a = fragmentActivity;
    }
}
