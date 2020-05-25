package com.bytedance.scene;

import android.content.Intent;
import android.os.Messenger;

/* renamed from: com.bytedance.scene.v */
public final class C12983v {

    /* renamed from: b */
    private static String f33993b = "SingeProcessMessengerHandler";

    /* renamed from: a */
    public Messenger f33994a;

    private C12983v(Messenger messenger) {
        this.f33994a = messenger;
    }

    /* renamed from: a */
    public static C12983v m26110a(Intent intent) {
        Messenger messenger = (Messenger) intent.getParcelableExtra(f33993b);
        if (messenger != null) {
            return new C12983v(messenger);
        }
        return null;
    }
}
