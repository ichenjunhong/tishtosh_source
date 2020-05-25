package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41694c;
import com.p683ss.android.ugc.aweme.utils.C47875fa;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BaseControlSettingActivity */
public abstract class BaseControlSettingActivity extends AmeSSActivity implements OnClickListener, C41692a {

    /* renamed from: a */
    protected int f105626a;

    /* renamed from: b */
    protected int f105627b;

    /* renamed from: c */
    protected C41694c f105628c;
    protected CommonItemView mEveryoneItem;
    protected CommonItemView mFriendsItem;
    protected CommonItemView mOffItem;
    protected DmtTextView mTipsView;
    protected TextView mTitle;

    /* renamed from: a */
    public abstract void mo85579a();

    /* renamed from: a */
    public abstract void mo85580a(int i);

    /* renamed from: b */
    public abstract void mo85583b();

    public void back() {
        onBackPressed();
    }

    /* renamed from: c */
    public abstract String mo85586c();

    /* renamed from: d */
    public abstract void mo85587d();

    /* renamed from: g */
    public final void mo55287g() {
    }

    public void setStatusBarColor() {
        C47875fa.m103569b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f105628c.mo46991S_();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo85588e() {
        this.mFriendsItem.setRightIconRes(0);
        this.mEveryoneItem.setRightIconRes(0);
        this.mOffItem.setRightIconRes(0);
    }

    /* renamed from: l */
    public void mo55288l() {
        C10691a.m21542b((Context) this, (int) R.string.cg2).mo19066a();
        mo85580a(this.f105627b);
        this.f105626a = this.f105627b;
    }

    public void onBackPressed() {
        Intent intent = getIntent();
        intent.putExtra("currentSettingsValue", this.f105626a);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85581a(CommonItemView commonItemView) {
        mo85588e();
        commonItemView.setRightIconRes(R.drawable.dwe);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85582a(CharSequence charSequence) {
        if (this.mTipsView != null) {
            this.mTipsView.setVisibility(0);
            this.mTipsView.setText(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo85584b(int i) {
        this.f105628c.mo44934a_(mo85586c(), Integer.valueOf(i));
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            mo85581a((CommonItemView) view);
            this.f105627b = this.f105626a;
            int intValue = ((Integer) view.getTag()).intValue();
            this.f105626a = intValue;
            mo85584b(intValue);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.btv);
        mo85588e();
        this.f105628c = new C41694c();
        this.f105628c.mo54800a(this);
        this.mEveryoneItem.setOnClickListener(this);
        this.mFriendsItem.setOnClickListener(this);
        this.mOffItem.setOnClickListener(this);
        CommonItemView commonItemView = this.mOffItem;
        String string = getString(R.string.h3r);
        if (!(commonItemView == null || string == null)) {
            commonItemView.setLeftText(string);
        }
        mo85587d();
        mo85579a();
        mo85583b();
    }
}
