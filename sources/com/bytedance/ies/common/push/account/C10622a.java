package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.bytedance.ies.common.push.account.a */
public final class C10622a {

    /* renamed from: a */
    private Context f28151a;

    /* renamed from: b */
    private int f28152b;

    /* renamed from: c */
    private boolean f28153c;

    /* renamed from: d */
    private long f28154d;

    /* renamed from: com.bytedance.ies.common.push.account.a$a */
    public static final class C10624a {

        /* renamed from: a */
        public Context f28155a;

        /* renamed from: b */
        public int f28156b = 1;

        /* renamed from: c */
        public boolean f28157c = true;

        /* renamed from: d */
        public long f28158d = 900;

        /* renamed from: a */
        public final C10622a mo18853a() {
            return new C10622a(this);
        }

        public C10624a(Context context) {
            this.f28155a = context;
        }
    }

    /* renamed from: b */
    private String m21410b() {
        return TextUtils.concat(new CharSequence[]{this.f28151a.getPackageName(), ".AccountProvider"}).toString();
    }

    /* renamed from: a */
    public final void mo18852a() {
        if (this.f28151a != null) {
            try {
                String packageName = this.f28151a.getPackageName();
                String string = this.f28151a.getString(this.f28151a.getApplicationInfo().labelRes);
                if (!TextUtils.isEmpty(string)) {
                    if (!TextUtils.isEmpty(packageName)) {
                        Account account = new Account(string, packageName);
                        if (AccountManager.get(this.f28151a).addAccountExplicitly(account, null, null)) {
                            ContentResolver.setIsSyncable(account, m21410b(), 1);
                            ContentResolver.setSyncAutomatically(account, m21410b(), true);
                            ContentResolver.addPeriodicSync(account, m21410b(), new Bundle(), 900);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C10622a(C10624a aVar) {
        this.f28151a = aVar.f28155a;
        this.f28152b = aVar.f28156b;
        this.f28153c = aVar.f28157c;
        this.f28154d = aVar.f28158d;
    }
}
