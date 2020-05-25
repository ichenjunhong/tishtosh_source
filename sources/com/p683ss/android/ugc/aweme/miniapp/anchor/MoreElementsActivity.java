package com.p683ss.android.ugc.aweme.miniapp.anchor;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.OSUtils;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25632i;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b.C36814c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Stack;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity */
public class MoreElementsActivity extends AmeSSActivity {

    /* renamed from: a */
    public Stack<Fragment> f94048a;

    /* renamed from: b */
    private ImmersionBar f94049b;

    /* renamed from: c */
    private View f94050c;

    /* renamed from: a */
    public void mo75982a(String str) {
    }

    public void onDestroy() {
        if (C47718bf.m103292e(this)) {
            C47718bf.m103291d(this);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo75984a() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void onBackPressed() {
        Fragment fragment = (Fragment) this.f94048a.peek();
        if (fragment instanceof C36814c) {
            super.onBackPressed();
        } else {
            mo75985a(fragment);
        }
    }

    public void setStatusBarColor() {
        super.setStatusBarColor();
        if (!OSUtils.isEMUI3_0() && !OSUtils.isEMUI3_1()) {
            Window window = getWindow();
            if (window != null && VERSION.SDK_INT >= 28) {
                LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
                this.f94049b = ImmersionBar.with((Activity) this).statusBarDarkFont(true);
                this.f94049b.init();
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void finishCommandFromMiniApp(C25632i iVar) {
        if (iVar.f67851a) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo75985a(Fragment fragment) {
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2177a(fragment);
        a.mo2195c();
        mo75984a();
        this.f94048a.pop();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cs);
        C47718bf.m103290c(this);
        this.f94050c = findViewById(R.id.csm);
        ViewGroup.LayoutParams layoutParams = this.f94050c.getLayoutParams();
        layoutParams.height = C20141b.m49701c(this);
        this.f94050c.setLayoutParams(layoutParams);
        this.f94048a = new Stack<>();
    }

    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(R.anim.f2, R.anim.f4);
    }
}
