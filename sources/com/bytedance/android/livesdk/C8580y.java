package com.bytedance.android.livesdk;

import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.y */
public class C8580y implements IWidgetProvider {

    /* renamed from: a */
    private static volatile C8580y f23511a;

    /* renamed from: b */
    private Map<Class, IRecyclableWidget> f23512b = new HashMap();

    /* renamed from: a */
    public static C8580y m16962a() {
        if (f23511a == null) {
            synchronized (C8580y.class) {
                if (f23511a == null) {
                    f23511a = new C8580y();
                }
            }
        }
        return f23511a;
    }

    /* renamed from: b */
    public final void mo15067b() {
        for (Entry value : this.f23512b.entrySet()) {
            ((IRecyclableWidget) value.getValue()).setClearAfterDestroyed();
        }
        this.f23512b.clear();
    }

    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        T t = (IRecyclableWidget) this.f23512b.get(cls);
        if (t != null && t.isAlive()) {
            t.setClearAfterDestroyed();
            t = null;
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (IRecyclableWidget) cls.newInstance();
            this.f23512b.put(cls, t2);
            return t2;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }
}
