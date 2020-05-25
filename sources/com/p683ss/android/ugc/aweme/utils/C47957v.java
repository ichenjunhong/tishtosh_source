package com.p683ss.android.ugc.aweme.utils;

import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.utils.v */
public final class C47957v {

    /* renamed from: a */
    static final boolean f120567a = false;

    /* renamed from: a */
    public static void m103768a(Runnable runnable) {
        m103772b(runnable, "BoltsUtils");
    }

    /* renamed from: b */
    public static void m103771b(Runnable runnable) {
        m103769a(runnable, "BoltsUtils");
    }

    /* renamed from: a */
    public static boolean m103770a(C0013i iVar) {
        if (iVar == null || iVar.mo33d() || iVar.mo31c() || iVar.mo34e() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m103769a(Runnable runnable, String str) {
        C0013i.m16a((Callable<TResult>) new C47958w<TResult>(runnable, str)).mo19a((C0011g<TResult, TContinuationResult>) new C47959x<TResult,TContinuationResult>(str));
    }

    /* renamed from: b */
    private static void m103772b(Runnable runnable, String str) {
        C0013i.m18a((Callable<TResult>) new C47960y<TResult>(runnable, str), C0013i.f25b).mo19a((C0011g<TResult, TContinuationResult>) new C47961z<TResult,TContinuationResult>(str));
    }
}
