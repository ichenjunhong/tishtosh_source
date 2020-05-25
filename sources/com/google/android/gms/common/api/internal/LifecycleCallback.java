package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a */
    protected final C15335g f39334a;

    private static C15335g getChimeraLifecycleFragmentImpl(C15334f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo28140a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo28141a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo28142a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo28143b() {
    }

    /* renamed from: b */
    public void mo28144b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo28145c() {
    }

    /* renamed from: d */
    public void mo28146d() {
    }

    /* renamed from: a */
    public static C15335g m31538a(Activity activity) {
        return m31539a(new C15334f(activity));
    }

    protected LifecycleCallback(C15335g gVar) {
        this.f39334a = gVar;
    }

    /* renamed from: a */
    public final Activity mo28139a() {
        return this.f39334a.mo28246a();
    }

    /* renamed from: a */
    protected static C15335g m31539a(C15334f fVar) {
        if (fVar.f39614a instanceof FragmentActivity) {
            return C15327cz.m31831a((FragmentActivity) fVar.f39614a);
        }
        if (fVar.f39614a instanceof Activity) {
            return C15325cx.m31825a((Activity) fVar.f39614a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
