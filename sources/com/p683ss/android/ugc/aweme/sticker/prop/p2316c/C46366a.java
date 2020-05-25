package com.p683ss.android.ugc.aweme.sticker.prop.p2316c;

import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.sticker.prop.fragment.C46403r;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.c.a */
public final class C46366a extends C26851b<C26832a<C46070e>, C46403r> {

    /* renamed from: a */
    public EffectPlatformLoader f116980a;

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70701g != null && this.f70700f != null) {
            ((C46403r) this.f70701g).mo93098a((C46070e) this.f70700f.getData());
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C46403r) this.f70701g).mo93099a(exc);
        }
    }

    public C46366a(EffectPlatformLoader effectPlatformLoader, boolean z) {
        this.f116980a = effectPlatformLoader;
        mo54799a(new C26832a<C46070e>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C9381g gVar = this.mHandler;
                String str = objArr[0];
                objArr[1].intValue();
                C23566n.f62684b.mo48750a(gVar, new C46370b(str), 0);
                return true;
            }
        });
    }
}
