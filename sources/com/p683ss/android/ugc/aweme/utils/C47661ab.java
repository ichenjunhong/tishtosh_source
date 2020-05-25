package com.p683ss.android.ugc.aweme.utils;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.utils.ab */
public final class C47661ab {

    /* renamed from: a */
    public Bundle f120139a = new Bundle();

    /* renamed from: a */
    public static C47661ab m103163a() {
        return new C47661ab();
    }

    /* renamed from: a */
    public final C47661ab mo94968a(String str, float f) {
        this.f120139a.putFloat(str, 0.1f);
        return this;
    }

    /* renamed from: a */
    public final C47661ab mo94969a(String str, int i) {
        this.f120139a.putInt(str, i);
        return this;
    }

    /* renamed from: a */
    public final C47661ab mo94970a(String str, Parcelable parcelable) {
        this.f120139a.putParcelable(str, parcelable);
        return this;
    }

    /* renamed from: a */
    public final C47661ab mo94971a(String str, Serializable serializable) {
        this.f120139a.putSerializable(str, serializable);
        return this;
    }

    /* renamed from: a */
    public final C47661ab mo94972a(String str, String str2) {
        this.f120139a.putString(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C47661ab mo94973a(String str, boolean z) {
        this.f120139a.putBoolean(str, z);
        return this;
    }

    /* renamed from: a */
    public final C47661ab mo94974a(String str, String[] strArr) {
        this.f120139a.putStringArray(str, strArr);
        return this;
    }
}
