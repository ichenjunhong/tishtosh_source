package com.p683ss.android.ugc.aweme.account.activity;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;

/* renamed from: com.ss.android.ugc.aweme.account.activity.BaseAccountActivity */
public class BaseAccountActivity extends AmeSSActivity {

    /* renamed from: a */
    protected String f56801a;

    /* renamed from: b */
    protected String f56802b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f56801a = getIntent().getStringExtra("enter_from");
        this.f56802b = getIntent().getStringExtra("enter_method");
    }
}
