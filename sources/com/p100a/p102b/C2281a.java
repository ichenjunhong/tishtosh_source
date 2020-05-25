package com.p100a.p102b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p100a.p102b.p103a.C2282a;

/* renamed from: com.a.b.a */
public final class C2281a {

    /* renamed from: a */
    static C2282a f7093a = null;

    /* renamed from: b */
    private static boolean f7094b = true;

    /* renamed from: a */
    public static View m6814a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return m6815a(context, i, viewGroup, false, -1);
    }

    /* renamed from: a */
    public static View m6815a(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        if (!f7094b) {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        C2283b bVar = (C2283b) C2284c.f7095a.get(i);
        if (bVar == null) {
            StringBuilder sb = new StringBuilder("layout id :");
            sb.append(Integer.toHexString(i));
            sb.append(" does not match any inflator, inflate with android.view.LayoutInflater");
            if (f7093a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        try {
            View a = bVar.mo6630a(context, viewGroup, z);
            if (f7093a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return a;
        } catch (Exception e) {
            if (f7093a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            StringBuilder sb2 = new StringBuilder("the inflator with id: ");
            sb2.append(Integer.toHexString(i));
            sb2.append(" inflated failed ");
            sb2.append(e.getMessage());
            sb2.append(" , inflate with android.view.LayoutInflater");
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
    }
}
