package com.google.android.gms.p1027a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.internal.p1043d.C16480b;

/* renamed from: com.google.android.gms.a.b */
public interface C14882b extends IInterface {

    /* renamed from: com.google.android.gms.a.b$a */
    public static abstract class C14883a extends C16480b implements C14882b {

        /* renamed from: com.google.android.gms.a.b$a$a */
        public static class C14884a extends C16479a implements C14882b {
            C14884a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C14883a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C14882b m30535a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C14882b) {
                return (C14882b) queryLocalInterface;
            }
            return new C14884a(iBinder);
        }
    }
}
