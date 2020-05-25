package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* renamed from: android.arch.lifecycle.q */
public final class C0197q {

    /* renamed from: a */
    private Map<String, Integer> f467a = new HashMap();

    /* renamed from: a */
    public final boolean mo344a(String str, int i) {
        int i2;
        boolean z;
        Integer num = (Integer) this.f467a.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f467a.put(str, Integer.valueOf(i | i2));
        if (!z) {
            return true;
        }
        return false;
    }
}
