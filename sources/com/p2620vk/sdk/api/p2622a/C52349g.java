package com.p2620vk.sdk.api.p2622a;

import com.p2620vk.sdk.api.C52326a;
import com.p2620vk.sdk.api.C52353d;
import com.p2620vk.sdk.api.model.VKApiModel;
import com.p2620vk.sdk.api.p2622a.C52333b.C52337a;

/* renamed from: com.vk.sdk.api.a.g */
public final class C52349g extends C52347f {

    /* renamed from: g */
    protected final C52353d f130342g;

    /* renamed from: h */
    public Object f130343h;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo109153d() {
        if (super.mo109153d() && this.f130342g != null) {
            try {
                this.f130343h = this.f130342g.mo109138a(mo109158f());
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public C52349g(C52337a aVar, C52353d dVar) {
        super(aVar);
        this.f130342g = dVar;
    }

    public C52349g(C52337a aVar, Class<? extends VKApiModel> cls) {
        super(aVar);
        this.f130342g = new C52326a(cls);
    }
}
