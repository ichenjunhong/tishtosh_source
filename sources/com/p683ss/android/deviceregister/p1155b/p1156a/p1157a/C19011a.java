package com.p683ss.android.deviceregister.p1155b.p1156a.p1157a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p523c.C9393e;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.deviceregister.b.a.a.a */
public final class C19011a extends C19013b {

    /* renamed from: a */
    public final AccountManager f52341a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, String> f52342b = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Account f52343d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo38861a(String str) {
        if (this.f52343d == null) {
            return null;
        }
        try {
            return this.f52341a.getUserData(this.f52343d, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C19011a(Context context) {
        this.f52341a = AccountManager.get(context);
    }

    /* renamed from: a */
    public final void mo38862a(final Account account) {
        if (account != null) {
            this.f52343d = account;
            if (this.f52342b != null && this.f52342b.size() > 0) {
                C9393e.submitRunnable(new Runnable() {
                    public final void run() {
                        try {
                            if (C19011a.this.f52342b != null && C19011a.this.f52342b.size() > 0) {
                                if (C19011a.this.f52341a != null) {
                                    for (Entry entry : C19011a.this.f52342b.entrySet()) {
                                        if (entry != null) {
                                            C19011a.this.f52341a.setUserData(account, (String) entry.getKey(), (String) entry.getValue());
                                        }
                                    }
                                    C19011a.this.f52342b.clear();
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo38865b(String str) {
        String a = mo38861a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return a.split("\n");
    }

    /* renamed from: c */
    public final void mo38866c(String str) {
        if (this.f52342b != null && this.f52342b.containsKey(str)) {
            this.f52342b.remove(str);
        }
        try {
            if (!(this.f52343d == null || this.f52341a == null)) {
                this.f52341a.setUserData(this.f52343d, str, null);
            }
        } catch (Exception unused) {
        }
        super.mo38866c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38863a(String str, String str2) {
        if (this.f52343d == null) {
            this.f52342b.put(str, str2);
        } else if (str != null && str2 != null) {
            try {
                this.f52341a.setUserData(this.f52343d, str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38864a(String str, String[] strArr) {
        if (strArr != null) {
            mo38863a(str, TextUtils.join("\n", strArr));
        }
    }
}
