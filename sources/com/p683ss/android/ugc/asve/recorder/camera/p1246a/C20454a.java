package com.p683ss.android.ugc.asve.recorder.camera.p1246a;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a.a */
public final class C20454a {

    /* renamed from: a */
    public static final String[] f56082a = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: b */
    public static final String[] f56083b = {"PCCM00", "PCAM00"};

    /* renamed from: c */
    public static final String[] f56084c = new String[0];

    /* renamed from: a */
    public static int m50912a(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr = f56083b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z2 = false;
                break;
            } else if (strArr[i].equals(str)) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            return 2;
        }
        String[] strArr2 = f56082a;
        int length2 = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z3 = false;
                break;
            } else if (strArr2[i2].equals(str)) {
                z3 = true;
                break;
            } else {
                i2++;
            }
        }
        if (z3) {
            return 1;
        }
        String[] strArr3 = f56084c;
        int length3 = strArr3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                z = false;
                break;
            } else if (strArr3[i3].equals(str)) {
                break;
            } else {
                i3++;
            }
        }
        if (z) {
            return 3;
        }
        return 0;
    }
}
