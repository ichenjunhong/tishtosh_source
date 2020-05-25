package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.a */
public class C17944a {

    /* renamed from: a */
    public static final Pattern f49833a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: c */
    private static C17944a f49834c;

    /* renamed from: b */
    public final FirebaseInstanceId f49835b;

    /* renamed from: a */
    public static synchronized C17944a m43985a() {
        C17944a aVar;
        synchronized (C17944a.class) {
            if (f49834c == null) {
                f49834c = new C17944a(FirebaseInstanceId.m43841a());
            }
            aVar = f49834c;
        }
        return aVar;
    }

    private C17944a(FirebaseInstanceId firebaseInstanceId) {
        this.f49835b = firebaseInstanceId;
    }
}
