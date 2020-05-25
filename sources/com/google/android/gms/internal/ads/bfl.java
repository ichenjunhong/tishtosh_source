package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfl extends bgm {

    /* renamed from: d */
    private final Activity f42277d;

    /* renamed from: e */
    private final View f42278e;

    public bfl(bey bey, String str, String str2, C15588a aVar, int i, int i2, View view, Activity activity) {
        super(bey, str, str2, aVar, i, 62);
        this.f42278e = view;
        this.f42277d = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (this.f42278e != null) {
            boolean booleanValue = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44313bu)).booleanValue();
            Object[] objArr = (Object[]) this.f42316c.invoke(null, new Object[]{this.f42278e, this.f42277d, Boolean.valueOf(booleanValue)});
            synchronized (this.f42315b) {
                this.f42315b.mo29266E(((Long) objArr[0]).longValue());
                this.f42315b.mo29267F(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f42315b.mo29295h((String) objArr[2]);
                }
            }
        }
    }
}
