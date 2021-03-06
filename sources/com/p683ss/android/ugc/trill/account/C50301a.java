package com.p683ss.android.ugc.trill.account;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.account.a */
public final class C50301a extends AbstractAccountAuthenticator {

    /* renamed from: a */
    private Context f126187a;

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        return null;
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    public C50301a(Context context) {
        super(context);
        this.f126187a = context;
    }

    public final String getAuthTokenLabel(String str) {
        return this.f126187a.getResources().getString(R.string.bcx);
    }

    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        AccountManager accountManager = AccountManager.get(this.f126187a);
        String peekAuthToken = accountManager.peekAuthToken(account, str);
        if (TextUtils.isEmpty(peekAuthToken) && accountManager.getPassword(account) != null) {
            peekAuthToken = "success";
        }
        if (!TextUtils.isEmpty(peekAuthToken)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", account.name);
            bundle2.putString("accountType", account.type);
            bundle2.putString("authtoken", peekAuthToken);
            return bundle2;
        }
        Intent intent = new Intent(this.f126187a, MainActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("intent", intent);
        return bundle3;
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        Intent intent = new Intent(this.f126187a, MainActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }
}
