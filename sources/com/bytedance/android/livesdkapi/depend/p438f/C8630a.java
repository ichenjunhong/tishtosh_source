package com.bytedance.android.livesdkapi.depend.p438f;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.depend.f.a */
public class C8630a<T> {

    /* renamed from: a */
    public String f23612a;

    /* renamed from: b */
    public String f23613b;

    /* renamed from: c */
    public T f23614c;

    /* renamed from: d */
    public Class<T> f23615d;

    /* renamed from: a */
    public T mo10345a() {
        return C8631b.m17033a(this);
    }

    /* renamed from: a */
    public void mo10346a(T t) {
        String str = this.f23613b;
        if (t == null) {
            C8631b.m17032a(str).edit().remove(this.f23612a).apply();
        } else if (this.f23615d == Boolean.class) {
            C8631b.m17032a(str).edit().putBoolean(this.f23612a, ((Boolean) t).booleanValue()).apply();
        } else if (this.f23615d == Integer.class) {
            C8631b.m17032a(str).edit().putInt(this.f23612a, ((Integer) t).intValue()).apply();
        } else if (this.f23615d == Float.class) {
            C8631b.m17032a(str).edit().putFloat(this.f23612a, ((Float) t).floatValue()).apply();
        } else if (this.f23615d == Long.class) {
            C8631b.m17032a(str).edit().putLong(this.f23612a, ((Long) t).longValue()).apply();
        } else if (this.f23615d == Double.class) {
            C8631b.m17032a(str).edit().putString(this.f23612a, String.valueOf(((Double) t).doubleValue())).apply();
        } else if (this.f23615d == String.class) {
            C8631b.m17032a(str).edit().putString(this.f23612a, (String) t).apply();
        } else {
            Map map = (Map) C8631b.f23616a.get(str);
            if (map != null) {
                map.put(this.f23612a, t);
            }
            C8631b.m17032a(str).edit().putString(this.f23612a, C8631b.f23617b.mo34889b(t)).apply();
        }
    }

    public C8630a(String str, T t) {
        this("tt_live_sdk", str, t.getClass(), t);
    }

    public C8630a(String str, String str2, T t) {
        this(str, str2, t.getClass(), t);
    }

    private C8630a(String str, String str2, Class<T> cls, T t) {
        this.f23613b = str;
        this.f23612a = str2;
        this.f23614c = t;
        this.f23615d = cls;
        if (t == null) {
            if (this.f23615d == Integer.class || this.f23615d == Short.class) {
                this.f23614c = Integer.valueOf(0);
            } else if (this.f23615d == Long.class) {
                this.f23614c = Long.valueOf(0);
            } else if (this.f23615d == Double.class) {
                this.f23614c = Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            } else if (this.f23615d == Float.class) {
                this.f23614c = Float.valueOf(0.0f);
            } else if (this.f23615d == Boolean.class) {
                this.f23614c = Boolean.valueOf(false);
            }
        }
    }
}
