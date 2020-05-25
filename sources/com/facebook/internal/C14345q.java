package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.p030v4.app.Fragment;

/* renamed from: com.facebook.internal.q */
public final class C14345q {

    /* renamed from: a */
    public Fragment f37324a;

    /* renamed from: b */
    public android.app.Fragment f37325b;

    /* renamed from: a */
    public final Activity mo26546a() {
        if (this.f37324a != null) {
            return this.f37324a.getActivity();
        }
        return this.f37325b.getActivity();
    }

    public C14345q(android.app.Fragment fragment) {
        C14283ab.m29306a((Object) fragment, "fragment");
        this.f37325b = fragment;
    }

    public C14345q(Fragment fragment) {
        C14283ab.m29306a((Object) fragment, "fragment");
        this.f37324a = fragment;
    }

    /* renamed from: a */
    public final void mo26547a(Intent intent, int i) {
        if (this.f37324a != null) {
            this.f37324a.startActivityForResult(intent, i);
        } else {
            this.f37325b.startActivityForResult(intent, i);
        }
    }
}
