package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR = new C15381c();

    /* renamed from: k */
    private static final C15378a f39665k = new C15380b(new String[0], null);

    /* renamed from: a */
    final String[] f39666a;

    /* renamed from: b */
    Bundle f39667b;

    /* renamed from: c */
    final CursorWindow[] f39668c;

    /* renamed from: d */
    public final int f39669d;

    /* renamed from: e */
    public final Bundle f39670e;

    /* renamed from: f */
    int[] f39671f;

    /* renamed from: g */
    public int f39672g;

    /* renamed from: h */
    private final int f39673h;

    /* renamed from: i */
    private boolean f39674i;

    /* renamed from: j */
    private boolean f39675j = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C15378a {

        /* renamed from: a */
        private final String[] f39676a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f39677b;

        /* renamed from: c */
        private final String f39678c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f39679d;

        /* renamed from: e */
        private boolean f39680e;

        /* renamed from: f */
        private String f39681f;

        private C15378a(String[] strArr, String str) {
            this.f39676a = (String[]) C15464q.m32123a(strArr);
            this.f39677b = new ArrayList<>();
            this.f39678c = null;
            this.f39679d = new HashMap<>();
            this.f39680e = false;
            this.f39681f = null;
        }

        /* synthetic */ C15378a(String[] strArr, String str, C15380b bVar) {
            this(strArr, null);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f39673h = i;
        this.f39666a = strArr;
        this.f39668c = cursorWindowArr;
        this.f39669d = i2;
        this.f39670e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32192a(parcel, 1, this.f39666a, false);
        C15469b.m32191a(parcel, 2, (T[]) this.f39668c, i, false);
        C15469b.m32195b(parcel, 3, this.f39669d);
        C15469b.m32181a(parcel, 4, this.f39670e, false);
        C15469b.m32195b(parcel, 1000, this.f39673h);
        C15469b.m32197c(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: a */
    private boolean m31955a() {
        boolean z;
        synchronized (this) {
            z = this.f39674i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f39674i) {
                this.f39674i = true;
                for (CursorWindow close : this.f39668c) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f39675j && this.f39668c.length > 0 && !m31955a()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
