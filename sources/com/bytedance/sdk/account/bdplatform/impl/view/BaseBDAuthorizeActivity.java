package com.bytedance.sdk.account.bdplatform.impl.view;

import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.sdk.account.bdplatform.impl.C13050a;
import com.bytedance.sdk.account.bdplatform.impl.C13065c;
import com.bytedance.sdk.account.bdplatform.p854a.C13035a.C13037b;
import com.bytedance.sdk.account.bdplatform.p854a.C13035a.C13038c;
import com.bytedance.sdk.account.bdplatform.p854a.C13039b;
import com.bytedance.sdk.account.bdplatform.p854a.C13040c;
import com.bytedance.sdk.account.bdplatform.p854a.C13041d;
import com.bytedance.sdk.account.bdplatform.p855b.C13043b;
import com.bytedance.sdk.account.bdplatform.p855b.C13044c;
import com.bytedance.sdk.account.p849b.p850a.C13024a;
import com.bytedance.sdk.account.p849b.p852c.C13027a;
import com.bytedance.sdk.account.p849b.p852c.C13028b;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.bytedance.sdk.account.p849b.p853d.C13034c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class BaseBDAuthorizeActivity extends FragmentActivity implements C13024a, C13038c {
    protected C13039b authorizePlatformDepend;
    protected C13037b authorizePresenter;
    private C13041d bdPlatformApi;
    protected C13044c configuration;
    private ImageView mApplyAuthAppIcon;
    private TextView mApplyAuthAppName;
    public RelativeLayout mAuthContent;
    private TextView mAuthDescTitle;
    protected C13043b mAuthInfoResponse;
    private String mAuthLoadingText;
    public LinearLayout mAuthScopeLayout;
    private View mBorder;
    private TextView mCancelTxt;
    protected RelativeLayout mContainer;
    public ScrollView mContentLayout;
    private TextView mGrantAuthTxt;
    private String mInitLoadingText;
    protected C13030a mLastRequest;
    private ImageView mLeftCube;
    private C13040c mLoadingDialog;
    public TextView mLoginBtn;
    public TextView mProtocol;
    private ImageView mRightCube;
    protected RelativeLayout mRootView;
    protected boolean mStatusDestroyed;
    private FrameLayout mTitleBarLayout;
    private TextView mUserName;
    private ImageView mUserPortrait;

    public abstract C13039b createDepend();

    public String getAuthLoadingText() {
        return this.mAuthLoadingText;
    }

    public String getInitLoadingText() {
        return this.mInitLoadingText;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.ae;
    }

    public abstract Drawable getLoadingProgressBar();

    /* access modifiers changed from: protected */
    public abstract C13044c initPlatformConfiguration();

    public abstract void onCancel();

    public abstract void onLoginClick();

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void initDynamicViewByDataAndShow() {
        initStateListView();
        initAuthButtonLayout();
    }

    public void showContainerView() {
        this.mContainer.setVisibility(0);
    }

    private void initAuthButtonLayout() {
        this.mContentLayout.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (BaseBDAuthorizeActivity.this.mContentLayout != null) {
                    if (VERSION.SDK_INT >= 16) {
                        BaseBDAuthorizeActivity.this.mContentLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        BaseBDAuthorizeActivity.this.mContentLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
                if (!(BaseBDAuthorizeActivity.this.mAuthContent == null || BaseBDAuthorizeActivity.this.mRootView == null)) {
                    int measuredHeight = BaseBDAuthorizeActivity.this.mAuthContent.getMeasuredHeight();
                    if (BaseBDAuthorizeActivity.this.mRootView.getMeasuredHeight() - measuredHeight <= ((int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 220.0f))) {
                        if (BaseBDAuthorizeActivity.this.mContentLayout != null) {
                            LayoutParams layoutParams = (LayoutParams) BaseBDAuthorizeActivity.this.mContentLayout.getLayoutParams();
                            layoutParams.setMargins(0, 0, 0, (int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 60.0f));
                            BaseBDAuthorizeActivity.this.mContentLayout.setLayoutParams(layoutParams);
                        }
                        if (BaseBDAuthorizeActivity.this.mLoginBtn != null) {
                            LayoutParams layoutParams2 = new LayoutParams(-1, (int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 44.0f));
                            if (BaseBDAuthorizeActivity.this.mProtocol.getVisibility() == 8) {
                                layoutParams2.addRule(12);
                            } else {
                                layoutParams2.addRule(2, R.id.f5w);
                            }
                            int a = (int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 15.0f);
                            layoutParams2.setMargins(a, 0, a, a);
                            BaseBDAuthorizeActivity.this.mLoginBtn.setLayoutParams(layoutParams2);
                        }
                    } else if (BaseBDAuthorizeActivity.this.mLoginBtn != null) {
                        LayoutParams layoutParams3 = new LayoutParams(-1, (int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 44.0f));
                        layoutParams3.addRule(3, R.id.b7b);
                        int a2 = (int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 15.0f);
                        layoutParams3.setMargins(a2, (int) C13034c.m26208a(BaseBDAuthorizeActivity.this, 56.0f), a2, a2);
                        BaseBDAuthorizeActivity.this.mLoginBtn.setLayoutParams(layoutParams3);
                    }
                }
                BaseBDAuthorizeActivity.this.showContainerView();
            }
        });
    }

    public void onBackPressed() {
        this.authorizePresenter.mo24685a(-33, "back pressed");
        onCancel();
    }

    private void initListener() {
        this.mCancelTxt.setOnClickListener(new C13069a() {
            /* renamed from: a */
            public final void mo24743a(View view) {
                BaseBDAuthorizeActivity.this.authorizePresenter.mo24685a(-32, "click cancel");
                BaseBDAuthorizeActivity.this.onCancel();
            }
        });
        this.mLoginBtn.setOnClickListener(new C13069a() {
            /* renamed from: a */
            public final void mo24743a(View view) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < BaseBDAuthorizeActivity.this.mAuthScopeLayout.getChildCount(); i++) {
                    CheckBox checkBox = (CheckBox) BaseBDAuthorizeActivity.this.mAuthScopeLayout.getChildAt(i);
                    if (!checkBox.isEnabled() || checkBox.isChecked()) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append((String) checkBox.getTag());
                    }
                }
                BaseBDAuthorizeActivity.this.mLastRequest.f34049f = sb.toString();
                BaseBDAuthorizeActivity.this.authorizePresenter.mo24687b(BaseBDAuthorizeActivity.this.mLastRequest);
                BaseBDAuthorizeActivity.this.onLoginClick();
            }
        });
    }

    public void dismissLoadingDialog() {
        if (!isFinishing() && !isDestroyed() && this.mLoadingDialog != null && this.mLoadingDialog.isShowing()) {
            this.mLoadingDialog.dismiss();
        }
    }

    public boolean isDestroyed() {
        if (VERSION.SDK_INT < 17) {
            return this.mStatusDestroyed;
        }
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.mStatusDestroyed;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.mStatusDestroyed = true;
        if (this.mLoadingDialog != null && this.mLoadingDialog.isShowing()) {
            this.mLoadingDialog.dismiss();
        }
        this.mLoadingDialog = null;
    }

    private void initLoadingDialog() {
        if (!TextUtils.isEmpty(this.configuration.f34089z)) {
            this.mInitLoadingText = this.configuration.f34089z;
        }
        if (!TextUtils.isEmpty(this.configuration.f34061A)) {
            this.mAuthLoadingText = this.configuration.f34061A;
        }
        if (TextUtils.isEmpty(this.mInitLoadingText)) {
            this.mInitLoadingText = getResources().getString(R.string.foj);
        }
        if (TextUtils.isEmpty(this.mAuthLoadingText)) {
            this.mAuthLoadingText = getResources().getString(R.string.foi);
        }
        C13071b.f34139a = getLoadingProgressBar();
        this.mLoadingDialog = this.configuration.f34062B;
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = new C13071b(this);
        }
    }

    private void initView() {
        try {
            setContentView(getLayout());
            this.mTitleBarLayout = (FrameLayout) findViewById(R.id.b_e);
            this.mCancelTxt = (TextView) findViewById(R.id.dk_);
            this.mRootView = (RelativeLayout) findViewById(R.id.b71);
            this.mContainer = (RelativeLayout) findViewById(R.id.zn);
            this.mContentLayout = (ScrollView) findViewById(R.id.b7b);
            this.mAuthContent = (RelativeLayout) findViewById(R.id.gz);
            this.mLeftCube = (ImageView) findViewById(R.id.as3);
            this.mRightCube = (ImageView) findViewById(R.id.as4);
            this.mApplyAuthAppIcon = (ImageView) findViewById(R.id.aqj);
            this.mApplyAuthAppName = (TextView) findViewById(R.id.dk7);
            this.mGrantAuthTxt = (TextView) findViewById(R.id.dkh);
            this.mUserPortrait = (ImageView) findViewById(R.id.dn9);
            this.mUserName = (TextView) findViewById(R.id.dn1);
            this.mBorder = findViewById(R.id.li);
            this.mAuthDescTitle = (TextView) findViewById(R.id.h0);
            this.mAuthScopeLayout = (LinearLayout) findViewById(R.id.b6x);
            this.mLoginBtn = (TextView) findViewById(R.id.o9);
            this.mProtocol = (TextView) findViewById(R.id.f5w);
            this.configuration = initPlatformConfiguration();
            if (this.configuration != null) {
                initStaticView();
                initLoadingDialog();
                return;
            }
            throw new IllegalArgumentException("initDynamicViewByDataAndShow view fail, configuration is null");
        } catch (NotFoundException unused) {
            finish();
        }
    }

    private void initStateListView() {
        if (this.mAuthInfoResponse != null && this.mAuthInfoResponse.f34060d != null && this.mAuthInfoResponse.f34060d.length() > 0) {
            HashMap hashMap = new HashMap(this.mAuthInfoResponse.f34060d.length());
            Iterator keys = this.mAuthInfoResponse.f34060d.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String optString = this.mAuthInfoResponse.f34060d.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    hashMap.put(str, optString);
                }
            }
            int size = hashMap.size();
            if (size == 0 || size == 1) {
                this.mAuthDescTitle.setVisibility(8);
            } else {
                this.mAuthDescTitle.setVisibility(0);
            }
            if (hashMap.entrySet() != null && hashMap.entrySet().size() > 0) {
                for (Entry entry : hashMap.entrySet()) {
                    View inflate = LayoutInflater.from(this).inflate(R.layout.gv, this.mAuthScopeLayout, false);
                    CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.t0);
                    checkBox.setTextColor(this.configuration.f34080q);
                    checkBox.setButtonDrawable(initStateListDrawable(this.configuration));
                    if (size == 1) {
                        checkBox.setText(C2240a.m6772a(getResources().getString(R.string.qv), new Object[]{entry.getValue()}));
                    } else {
                        checkBox.setText((CharSequence) entry.getValue());
                    }
                    checkBox.setTag(entry.getKey());
                    int checkboxType = getCheckboxType((String) entry.getKey());
                    if (checkboxType == 2) {
                        checkBox.setEnabled(false);
                        this.mAuthScopeLayout.addView(inflate, 0);
                    } else {
                        if (checkboxType == 0) {
                            checkBox.setEnabled(true);
                            checkBox.setChecked(false);
                        } else if (checkboxType == 1) {
                            checkBox.setEnabled(true);
                            checkBox.setChecked(true);
                        }
                        this.mAuthScopeLayout.addView(inflate);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void initStaticView() {
        this.mTitleBarLayout.setBackgroundColor(this.configuration.f34064a);
        if (!TextUtils.isEmpty(this.configuration.f34066c)) {
            this.mCancelTxt.setText(this.configuration.f34066c);
        }
        this.mCancelTxt.setTextColor(this.configuration.f34067d);
        this.mRootView.setBackgroundColor(this.configuration.f34065b);
        if (this.configuration.f34068e) {
            this.mLeftCube.setVisibility(0);
            this.mRightCube.setVisibility(0);
            if (this.configuration.f34069f != null) {
                this.mLeftCube.setImageDrawable(this.configuration.f34069f);
            }
            if (this.configuration.f34070g != null) {
                this.mRightCube.setImageDrawable(this.configuration.f34070g);
            }
        } else {
            this.mLeftCube.setVisibility(8);
            this.mRightCube.setVisibility(8);
        }
        this.mApplyAuthAppIcon.setBackgroundColor(this.configuration.f34071h);
        this.mApplyAuthAppName.setTextColor(this.configuration.f34072i);
        this.mGrantAuthTxt.setTextColor(this.configuration.f34074k);
        this.mUserPortrait.setBackgroundColor(this.configuration.f34075l);
        this.mUserName.setTextColor(this.configuration.f34076m);
        this.mBorder.setBackgroundColor(this.configuration.f34077n);
        this.mAuthDescTitle.setTextColor(this.configuration.f34079p);
        if (!TextUtils.isEmpty(this.configuration.f34078o)) {
            this.mAuthDescTitle.setText(this.configuration.f34078o);
        }
        this.mLoginBtn.setTextColor(this.configuration.f34085v);
        ((GradientDrawable) this.mLoginBtn.getBackground()).setColor(this.configuration.f34086w);
        if (!TextUtils.isEmpty(this.configuration.f34084u)) {
            this.mLoginBtn.setText(this.configuration.f34084u);
        }
        if (!TextUtils.isEmpty(this.configuration.f34073j)) {
            this.mGrantAuthTxt.setText(this.configuration.f34073j);
        }
        SpannableString spannableString = this.configuration.f34063C;
        if (!TextUtils.isEmpty(spannableString)) {
            this.mProtocol.setText(spannableString);
            this.mProtocol.setMovementMethod(LinkMovementMethod.getInstance());
            this.mProtocol.setVisibility(0);
        }
        initListener();
    }

    public void onResp(C13028b bVar) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void showView(C13043b bVar) {
        this.mAuthInfoResponse = bVar;
        initDynamicViewByDataAndShow();
    }

    public void onReq(C13027a aVar) {
        if (aVar instanceof C13030a) {
            this.mLastRequest = (C13030a) aVar;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_start_login", false);
    }

    public void setAppIcon(Drawable drawable) {
        if (drawable != null && !isFinishing() && this.mApplyAuthAppIcon != null) {
            this.mApplyAuthAppIcon.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void setAppName(String str) {
        if (!TextUtils.isEmpty(str) && !isFinishing() && this.mApplyAuthAppName != null) {
            this.mApplyAuthAppName.setText(str);
        }
    }

    public void setUserAvatar(Drawable drawable) {
        if (drawable != null && !isFinishing() && this.mUserPortrait != null) {
            this.mUserPortrait.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void setUserName(String str) {
        if (!TextUtils.isEmpty(str) && !isFinishing() && this.mUserName != null) {
            this.mUserName.setText(str);
        }
    }

    public void showLoadingDialog(String str) {
        if (!isFinishing() && !isDestroyed() && this.mLoadingDialog != null && !this.mLoadingDialog.isShowing()) {
            this.mLoadingDialog.mo24706a(str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.bdPlatformApi = C13065c.m26245a(this);
        handleIntent(getIntent(), this);
        this.authorizePlatformDepend = createDepend();
        this.authorizePresenter = new C13050a(this, this.authorizePlatformDepend, this);
        initView();
        this.authorizePresenter.mo24684a();
    }

    public void onLoginResult(int i) {
        if (!isFinishing() && !isDestroyed()) {
            if (i != 0) {
                if (this.authorizePresenter != null) {
                    if (i == -1) {
                        this.authorizePresenter.mo24685a(-30, "login fail");
                    } else {
                        this.authorizePresenter.mo24685a(-31, "cancel login");
                    }
                }
            } else if (!(this.authorizePresenter == null || this.mLastRequest == null)) {
                this.authorizePresenter.mo24686a(this.mLastRequest);
            }
        }
    }

    private int getCheckboxType(String str) {
        String[] split;
        String[] split2;
        if (!TextUtils.isEmpty(this.mLastRequest.f34050g)) {
            for (String str2 : this.mLastRequest.f34050g.split(",")) {
                if (str != null && str.equals(str2)) {
                    return 0;
                }
            }
        }
        if (!TextUtils.isEmpty(this.mLastRequest.f34051h)) {
            for (String str3 : this.mLastRequest.f34051h.split(",")) {
                if (str != null && str.equals(str3)) {
                    return 1;
                }
            }
        }
        return 2;
    }

    private StateListDrawable initStateListDrawable(C13044c cVar) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        if (cVar.f34081r != null) {
            drawable = cVar.f34081r;
        } else {
            drawable = getResources().getDrawable(R.drawable.gd);
        }
        stateListDrawable.addState(iArr, drawable);
        int[] iArr2 = {16842910, 16842912};
        if (cVar.f34082s != null) {
            drawable2 = cVar.f34082s;
        } else {
            drawable2 = getResources().getDrawable(R.drawable.gb);
        }
        stateListDrawable.addState(iArr2, drawable2);
        int[] iArr3 = {16842910, -16842912};
        if (cVar.f34083t != null) {
            drawable3 = cVar.f34083t;
        } else {
            drawable3 = getResources().getDrawable(R.drawable.gc);
        }
        stateListDrawable.addState(iArr3, drawable3);
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    public boolean handleIntent(Intent intent, C13024a aVar) {
        return this.bdPlatformApi.mo24709a(intent, aVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 == -1) {
                this.authorizePresenter.mo24686a(this.mLastRequest);
            } else if (i2 == 0) {
                this.authorizePresenter.mo24685a(-30, "login fail");
            }
        }
    }
}
