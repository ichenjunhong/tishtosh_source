package com.p683ss.android.ugc.aweme.setting.p2133b;

import android.text.TextUtils;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.setting.b.i */
public final class C41577i {

    /* renamed from: a */
    public Field f105299a;

    /* renamed from: b */
    public C41578j f105300b;

    /* renamed from: c */
    public Object f105301c;

    /* renamed from: b */
    public final String mo85356b() {
        if (TextUtils.isEmpty(this.f105300b.mo85357a())) {
            return this.f105299a.getName();
        }
        return this.f105300b.mo85357a();
    }

    /* renamed from: a */
    public final String mo85355a() throws IllegalAccessException {
        String sb;
        int intValue = ((Integer) this.f105299a.get(this.f105301c)).intValue();
        int[] b = this.f105300b.mo85358b();
        String[] c = this.f105300b.mo85359c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(intValue);
        String sb3 = sb2.toString();
        if (c.length == 0) {
            return sb3;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= b.length) {
                break;
            } else if (b[i] == intValue) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            sb = c[i];
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(intValue);
            sb4.append(" (你没有指定过这个数字)");
            sb = sb4.toString();
        }
        return sb;
    }

    public C41577i(Field field, Object obj) {
        this.f105299a = field;
        this.f105301c = obj;
        field.setAccessible(true);
        this.f105300b = (C41578j) field.getAnnotation(C41578j.class);
    }
}
