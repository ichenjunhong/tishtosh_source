package com.bytedance.p753k.p758b.p759a;

import com.bytedance.p753k.p754a.p755a.C12112g;

/* renamed from: com.bytedance.k.b.a.g */
public final class C12122g implements C12112g {

    /* renamed from: a */
    private static volatile C12112g f32045a;

    private C12122g() {
    }

    /* renamed from: a */
    public static C12112g m24550a() {
        if (f32045a == null) {
            synchronized (C12119d.class) {
                if (f32045a == null) {
                    f32045a = new C12122g();
                }
            }
        }
        return f32045a;
    }
}
