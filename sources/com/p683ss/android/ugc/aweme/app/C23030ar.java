package com.p683ss.android.ugc.aweme.app;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.ar */
public class C23030ar {

    /* renamed from: b */
    private static C23030ar f61379b;

    /* renamed from: a */
    public ArrayList<C23031as> f61380a = new ArrayList<>();

    /* renamed from: a */
    public static C23030ar m56548a() {
        if (f61379b == null) {
            synchronized (C23030ar.class) {
                if (f61379b == null) {
                    f61379b = new C23030ar();
                }
            }
        }
        return f61379b;
    }
}
