package com.p683ss.android.ugc.bogut.library.view;

import android.os.Parcel;

/* renamed from: com.ss.android.ugc.bogut.library.view.a */
class C48503a {

    /* renamed from: a */
    private static final ClassLoader f121945a = C48503a.class.getClassLoader();

    C48503a() {
    }

    /* renamed from: a */
    static byte[] m104936a(Object obj) {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(obj);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: a */
    static <T> T m104935a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T readValue = obtain.readValue(f121945a);
        obtain.recycle();
        return readValue;
    }
}
