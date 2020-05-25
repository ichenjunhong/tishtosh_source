package com.p683ss.android.ttvecamera.p1229d;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.d.a */
public final class C20184a extends C20186c {
    /* renamed from: b */
    public final String mo42769b() {
        if (m49822c()) {
            return "3";
        }
        return super.mo42769b();
    }

    /* renamed from: a */
    public final boolean mo42768a() {
        if (!"0".equals(mo42769b()) || m49822c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m49822c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    public C20184a(Context context) {
        super(context);
    }
}
