package org.greenrobot.eventbus.p2694a;

import org.greenrobot.eventbus.C53760e;
import org.greenrobot.eventbus.C53773o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: org.greenrobot.eventbus.a.a */
public abstract class C53749a implements C53751c {

    /* renamed from: a */
    private final Class f133294a;

    /* renamed from: b */
    private final Class<? extends C53751c> f133295b = null;

    /* renamed from: c */
    private final boolean f133296c;

    /* renamed from: a */
    public final Class mo112949a() {
        return this.f133294a;
    }

    /* renamed from: b */
    public final C53751c mo112951b() {
        if (this.f133295b == null) {
            return null;
        }
        try {
            return (C53751c) this.f133295b.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected C53749a(Class cls, Class<? extends C53751c> cls2, boolean z) {
        this.f133294a = cls;
        this.f133296c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C53773o mo112950a(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        try {
            C53773o oVar = new C53773o(this.f133294a.getDeclaredMethod(str, new Class[]{cls}), cls, threadMode, i, z);
            return oVar;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Could not find subscriber method in ");
            sb.append(this.f133294a);
            sb.append(". Maybe a missing ProGuard rule?");
            throw new C53760e(sb.toString(), e);
        }
    }
}
