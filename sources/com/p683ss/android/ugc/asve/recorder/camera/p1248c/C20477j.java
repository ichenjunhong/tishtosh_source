package com.p683ss.android.ugc.asve.recorder.camera.p1248c;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.j */
public final class C20477j {

    /* renamed from: a */
    public static final String[] f56130a = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: b */
    public static final String[] f56131b = new String[0];

    /* renamed from: a */
    public static int m51057a(String str) {
        for (String equals : f56130a) {
            if (equals.equals(str)) {
                return 3;
            }
        }
        for (String equals2 : f56131b) {
            if (equals2.equals(str)) {
                return 2;
            }
        }
        return 0;
    }
}
