package com.p683ss.android.ugc.aweme.account.login.p1284d;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1058a.C17431p;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.d.a */
public class C21134a {

    /* renamed from: a */
    private static final boolean f57405a = false;

    /* renamed from: b */
    private static int f57406b = 86;

    /* renamed from: c */
    private static volatile C21134a f57407c;

    /* renamed from: d */
    private List<C21386a> f57408d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.a$a */
    public static class C21135a implements Serializable {
        @C17952c(mo34828a = "countryIso_")

        /* renamed from: a */
        private String f57409a = Locale.CHINA.getCountry();
        @C17952c(mo34828a = "rawInput_")

        /* renamed from: b */
        private String f57410b = "";
        @C17952c(mo34828a = "countryCode_")

        /* renamed from: c */
        private int f57411c = 86;
        @C17952c(mo34828a = "nationalNumber_")

        /* renamed from: d */
        private long f57412d = 0;

        public final int getCountryCode() {
            return this.f57411c;
        }

        public final String getCountryIso() {
            return this.f57409a;
        }

        public final long getNationalNumber() {
            return this.f57412d;
        }

        public final String getRawInput() {
            return this.f57410b;
        }

        public final C21135a setCountryCode(int i) {
            this.f57411c = i;
            return this;
        }

        public final void setCountryIso(String str) {
            this.f57409a = str;
        }

        public final C21135a setNationalNumber(long j) {
            this.f57412d = j;
            return this;
        }

        public final C21135a setRawInput(String str) {
            this.f57410b = str;
            return this;
        }

        public static C21135a create(int i, long j) {
            return new C21135a().setCountryCode(i).setNationalNumber(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.a$b */
    public static class C21136b implements TextWatcher {

        /* renamed from: a */
        private boolean f57413a;

        /* renamed from: b */
        private boolean f57414b;

        /* renamed from: c */
        private int f57415c;

        /* renamed from: a */
        private void m53624a() {
            this.f57414b = true;
        }

        public final synchronized void afterTextChanged(Editable editable) {
            boolean z = false;
            if (this.f57414b) {
                if (editable.length() != 0) {
                    z = true;
                }
                this.f57414b = z;
            } else if (!this.f57413a) {
                int selectionEnd = Selection.getSelectionEnd(editable);
                int length = editable.length();
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    int digit = Character.digit(editable.charAt(i2), 10);
                    if (digit != -1) {
                        sb.append(digit);
                        if ((sb.length() + 1) % 4 == 0) {
                            sb.append(' ');
                            if (i2 < selectionEnd) {
                                i--;
                            }
                        }
                    } else if (i2 < selectionEnd) {
                        i++;
                    }
                }
                this.f57415c = selectionEnd - i;
                String sb2 = sb.toString();
                this.f57413a = true;
                editable.replace(0, editable.length(), sb2, 0, sb2.length());
                if (sb2.equals(editable.toString())) {
                    Selection.setSelection(editable, this.f57415c);
                }
                this.f57413a = false;
            }
        }

        /* renamed from: a */
        private static boolean m53625a(CharSequence charSequence, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                    return true;
                }
            }
            return false;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f57413a && !this.f57414b && i2 > 0 && m53625a(charSequence, i, i2)) {
                m53624a();
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f57413a && !this.f57414b && i3 > 0 && m53625a(charSequence, i, i3)) {
                m53624a();
            }
        }
    }

    /* renamed from: a */
    public static C21134a m53618a(Context context) {
        if (f57407c == null) {
            synchronized (C21134a.class) {
                if (f57407c == null) {
                    C21134a aVar = new C21134a();
                    f57407c = aVar;
                    aVar.f57408d = C21386a.m54007b();
                }
            }
        }
        return f57407c;
    }

    /* renamed from: a */
    public static String m53619a(C21135a aVar) {
        if (aVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("+");
        sb.append(aVar.getCountryCode());
        sb.append(" ");
        sb.append(aVar.getNationalNumber());
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m53621b(C21135a aVar) {
        if (aVar.getCountryCode() == 86) {
            if (String.valueOf(aVar.getNationalNumber()).length() == 11) {
                return true;
            }
            return false;
        } else if (aVar.getCountryCode() == 0 || aVar.getNationalNumber() < 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static String m53620a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length < 4) {
            return str;
        }
        int max = Math.max(length - 7, 2);
        int min = Math.min(max + 4, length - 1);
        return new StringBuilder(str).replace(max, min, C17431p.m42682a("*", min - max)).toString();
    }

    /* renamed from: b */
    public static boolean m53622b(String str, String str2) {
        int i = 0;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        long j = 0;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        if (str2 != null) {
            j = Long.parseLong(str2);
        }
        return m53621b(new C21135a().setCountryCode(i).setNationalNumber(j));
    }

    /* renamed from: a */
    public final int mo45244a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        for (C21386a aVar : this.f57408d) {
            if (TextUtils.equals(aVar.f58043c, str)) {
                return aVar.mo45568a();
            }
        }
        return f57406b;
    }
}
