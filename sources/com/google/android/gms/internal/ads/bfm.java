package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfm extends bgm {
    public bfm(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        this.f42315b.mo29280b(aug.ENUM_FAILURE);
        try {
            this.f42315b.mo29280b(((Boolean) this.f42316c.invoke(null, new Object[]{this.f42314a.f42216a})).booleanValue() ? aug.ENUM_TRUE : aug.ENUM_FALSE);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
