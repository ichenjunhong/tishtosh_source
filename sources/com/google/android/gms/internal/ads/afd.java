package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C16299uq
public final class afd {
    /* renamed from: a */
    public static <T> T m32800a(Context context, String str, afe<IBinder, T> afe) throws aff {
        try {
            return afe.mo28772a(m32799a(context).mo28530a(str));
        } catch (Exception e) {
            throw new aff(e);
        }
    }

    /* renamed from: b */
    public static <T> T m32802b(Context context, String str, afe<IBinder, T> afe) throws aff {
        try {
            return afe.mo28772a(m32801b(context).mo28530a(str));
        } catch (Exception e) {
            throw new aff(e);
        }
    }

    /* renamed from: a */
    static DynamiteModule m32799a(Context context) throws aff {
        try {
            return DynamiteModule.m32334a(context, DynamiteModule.f40020a, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new aff(e);
        }
    }

    /* renamed from: b */
    private static DynamiteModule m32801b(Context context) throws aff {
        try {
            return DynamiteModule.m32334a(context, DynamiteModule.f40023d, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new aff(e);
        }
    }
}
