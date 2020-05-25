package com.google.android.play.core.p1053e;

import com.C2240a;
import com.google.android.play.core.p1053e.p1054a.C17319a;
import com.google.android.play.core.p1056f.C17376n;

/* renamed from: com.google.android.play.core.e.a */
public final class C17318a extends C17376n {

    /* renamed from: a */
    private final int f48787a;

    public final int getErrorCode() {
        return this.f48787a;
    }

    public C17318a(int i) {
        String str;
        String str2 = "Split Install Error(%d): %s";
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        if (!C17319a.f48788a.containsKey(Integer.valueOf(i)) || !C17319a.f48789b.containsKey(Integer.valueOf(i))) {
            str = "";
        } else {
            String str3 = (String) C17319a.f48788a.get(Integer.valueOf(i));
            String str4 = (String) C17319a.f48789b.get(Integer.valueOf(i));
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 118 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#");
            sb.append(str4);
            sb.append(")");
            str = sb.toString();
        }
        objArr[1] = str;
        super(C2240a.m6772a(str2, objArr));
        if (i != 0) {
            this.f48787a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
