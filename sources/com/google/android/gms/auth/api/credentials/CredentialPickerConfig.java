package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new C15123d();

    /* renamed from: a */
    public final boolean f39062a;

    /* renamed from: b */
    public final boolean f39063b;

    /* renamed from: c */
    private final int f39064c;

    /* renamed from: d */
    private final boolean f39065d;

    /* renamed from: e */
    private final int f39066e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C15118a {

        /* renamed from: a */
        boolean f39067a;

        /* renamed from: b */
        boolean f39068b = true;

        /* renamed from: c */
        int f39069c = 1;

        /* renamed from: a */
        public final C15118a mo27886a(boolean z) {
            this.f39068b = true;
            return this;
        }

        /* renamed from: a */
        public final CredentialPickerConfig mo27887a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
      assigns: [?[boolean, int, float, short, byte, char], ?[int, float, short, byte, char], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [boolean, int]
      mth insns count: 17
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialPickerConfig(int r2, boolean r3, boolean r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f39064c = r2
            r1.f39062a = r3
            r1.f39063b = r4
            r3 = 1
            r4 = 3
            r0 = 2
            if (r2 >= r0) goto L_0x0016
            r1.f39065d = r5
            if (r5 == 0) goto L_0x0013
            r3 = 3
        L_0x0013:
            r1.f39066e = r3
            return
        L_0x0016:
            if (r6 != r4) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r1.f39065d = r3
            r1.f39066e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(int, boolean, boolean, boolean, int):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        boolean z = true;
        C15469b.m32189a(parcel, 1, this.f39062a);
        C15469b.m32189a(parcel, 2, this.f39063b);
        if (this.f39066e != 3) {
            z = false;
        }
        C15469b.m32189a(parcel, 3, z);
        C15469b.m32195b(parcel, 4, this.f39066e);
        C15469b.m32195b(parcel, 1000, this.f39064c);
        C15469b.m32197c(parcel, a);
    }

    private CredentialPickerConfig(C15118a aVar) {
        this(2, aVar.f39067a, aVar.f39068b, false, aVar.f39069c);
    }
}
