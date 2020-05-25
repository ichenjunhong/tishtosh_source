package com.google.android.play.core.p1049b;

import com.C2240a;
import com.google.android.play.core.p1049b.p1050a.C17246a;
import com.google.android.play.core.p1056f.C17376n;

/* renamed from: com.google.android.play.core.b.a */
public final class C17245a extends C17376n {

    /* renamed from: a */
    private final int f48714a;

    public final int getErrorCode() {
        return this.f48714a;
    }

    public C17245a(int i) {
        String str;
        String str2 = "Install Error(%d): %s";
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        if (!C17246a.f48715a.containsKey(Integer.valueOf(i)) || !C17246a.f48716b.containsKey(Integer.valueOf(i))) {
            str = "";
        } else {
            String str3 = (String) C17246a.f48715a.get(Integer.valueOf(i));
            String str4 = (String) C17246a.f48716b.get(Integer.valueOf(i));
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 103 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
            sb.append(str4);
            sb.append(")");
            str = sb.toString();
        }
        objArr[1] = str;
        super(C2240a.m6772a(str2, objArr));
        if (i != 0) {
            this.f48714a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
