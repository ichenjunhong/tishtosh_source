package com.bytedance.ies.uikit.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.content.C0732g;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.ies.uikit.base.C11081c.C11082a;
import com.bytedance.ies.uikit.base.C11081c.C11083b;
import com.bytedance.ies.uikit.base.C11081c.C11084c;
import com.bytedance.ies.uikit.layout.C11120b;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.ies.uikit.p697a.C11066b;
import com.bytedance.ies.uikit.p699c.C11089b;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbsActivity extends AppCompatActivity implements C11086d {
    public static int mStartNum = 0;
    private static volatile int sActivityId;
    private static Set<String> sActivitySet = new HashSet();
    private static C9379e<AbsActivity> sFinishedActivityContainer = new C9379e<>();
    private boolean mDisableOptimizeViewHierarchy;
    private BroadcastReceiver mExitAppReceiver;
    private String mKey;
    private C9379e<C11087e> mMonitors = new C9379e<>();
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    public C11066b mTintManager;

    /* access modifiers changed from: protected */
    public boolean enableInitHook() {
        return true;
    }

    public boolean enableMobClick() {
        return true;
    }

    public int getRootViewId() {
        return 0;
    }

    public int getStatusBarBgColor() {
        return -16777216;
    }

    public int getWindowsFlags() {
        return 0;
    }

    public boolean isActive() {
        return this.mStatusActive;
    }

    /* access modifiers changed from: protected */
    public void requestDisableOptimizeViewHierarchy() {
        this.mDisableOptimizeViewHierarchy = true;
    }

    /* access modifiers changed from: protected */
    public boolean useImmerseMode() {
        return true;
    }

    public boolean isViewValid() {
        if (!this.mStatusDestroyed) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getStatusBarColor() {
        return getResources().getColor(R.color.f8);
    }

    public void onStart() {
        super.onStart();
        if (mStartNum == 0) {
            C11084c d = C11081c.m22432d();
            if (d != null) {
                d.mo20107a(false);
            }
        }
        mStartNum++;
    }

    /* access modifiers changed from: protected */
    public void setStatusBarColor() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getStatusBarColor());
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C11065a.m22392a(this, getStatusBarColor());
        }
    }

    public void onDestroy() {
        C0732g.m2130a((Context) this).mo2402a(this.mExitAppReceiver);
        super.onDestroy();
        this.mStatusDestroyed = true;
        if (!this.mMonitors.mo17007b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bi_();
                }
            }
            this.mMonitors.mo17004a();
        }
        onActivityDestroy(this);
    }

    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
        C11082a b = C11081c.m22430b();
        if (b != null) {
            b.mo20105b(this);
        }
        if (!this.mMonitors.mo17007b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.mStatusActive = true;
        C11082a b = C11081c.m22430b();
        if (b != null) {
            b.mo20104a(this);
        }
        if (!this.mMonitors.mo17007b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.mo20108a();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        int i = mStartNum - 1;
        mStartNum = i;
        if (i == 0) {
            C11084c d = C11081c.m22432d();
            if (d != null) {
                d.mo20107a(true);
            }
        }
        this.mStatusActive = false;
        if (!this.mMonitors.mo17007b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bj_();
                }
            }
        }
    }

    public static String getAliveActivitiesString() {
        if (sActivitySet == null || sActivitySet.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : sActivitySet) {
                if (i < sActivitySet.size() - 1) {
                    sb.append(str);
                    sb.append("|");
                } else {
                    sb.append(str);
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getFinishedActivitiesString() {
        if (sFinishedActivityContainer == null || sFinishedActivityContainer.mo17007b()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Iterator it = sFinishedActivityContainer.iterator();
            while (it.hasNext()) {
                AbsActivity absActivity = (AbsActivity) it.next();
                if (absActivity != null && !sActivitySet.contains(absActivity.mKey) && absActivity.isFinishing()) {
                    if (i < sFinishedActivityContainer.mo17008c() - 1) {
                        sb.append(absActivity.mKey);
                        sb.append("|");
                    } else {
                        sb.append(absActivity.mKey);
                    }
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        if (!this.mDisableOptimizeViewHierarchy) {
            View findViewById = findViewById(R.id.a7);
            if (findViewById != null) {
                ViewParent parent = findViewById.getParent();
                if (FrameLayout.class.isInstance(parent)) {
                    View findViewById2 = findViewById(16908290);
                    if (FrameLayout.class.isInstance(findViewById2)) {
                        FrameLayout frameLayout = (FrameLayout) findViewById2;
                        if (frameLayout.getChildCount() == 1) {
                            View childAt = frameLayout.getChildAt(0);
                            frameLayout.removeAllViews();
                            FrameLayout frameLayout2 = (FrameLayout) parent;
                            frameLayout2.addView(childAt);
                            findViewById2.setId(-1);
                            frameLayout2.setId(16908290);
                        }
                    }
                }
            }
        }
    }

    public void registerLifeCycleMonitor(C11087e eVar) {
        this.mMonitors.mo17005a(eVar);
    }

    public void setStatusBarBgColor(int i) {
        this.mTintManager.mo20049a(i);
    }

    public void unregisterLifeCycleMonitor(C11087e eVar) {
        this.mMonitors.mo17006b(eVar);
    }

    public static void onActivityCreate(AbsActivity absActivity) {
        if (absActivity != null) {
            try {
                sFinishedActivityContainer.mo17005a(absActivity);
                sActivitySet.add(absActivity.mKey);
            } catch (Throwable unused) {
            }
        }
    }

    public static void onActivityDestroy(AbsActivity absActivity) {
        if (absActivity != null) {
            try {
                sActivitySet.remove(absActivity.mKey);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.mKey = bundle.getString("abs_Activity_Key");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putString("abs_Activity_Key", this.mKey);
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
    }

    /* access modifiers changed from: protected */
    public void onSetContentView(View view) {
        C11120b bVar = new C11120b(this);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        bVar.setPadding(0, 0, 0, 0);
        bVar.setLayoutParams(layoutParams);
        super.setContentView(bVar, new LayoutParams(-1, -1));
        bVar.addView(view, -1, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContentView(int r3) {
        /*
            r2 = this;
            boolean r0 = com.bytedance.ies.uikit.p699c.C11089b.f29789a
            if (r0 == 0) goto L_0x0011
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)     // Catch:{ InflateException -> 0x0011 }
            r1 = 0
            android.view.View r0 = r0.inflate(r3, r1)     // Catch:{ InflateException -> 0x0011 }
            r2.onSetContentView(r0)     // Catch:{ InflateException -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            super.setContentView(r3)
        L_0x0014:
            boolean r3 = r2.useImmerseMode()
            if (r3 == 0) goto L_0x001d
            r2.setStatusBarColor()
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.base.AbsActivity.setContentView(int):void");
    }

    public void setContentView(View view) {
        if (C11089b.f29789a) {
            onSetContentView(view);
        } else {
            super.setContentView(view);
        }
        if (useImmerseMode()) {
            setStatusBarColor();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !bundle.containsKey("abs_Activity_Key")) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append("@");
            int i = sActivityId;
            sActivityId = i + 1;
            sb.append(i);
            this.mKey = sb.toString();
        } else {
            this.mKey = bundle.getString("abs_Activity_Key");
        }
        if (C11081c.m22429a() != null) {
            enableInitHook();
        }
        this.mExitAppReceiver = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (!AbsActivity.this.isFinishing()) {
                    AbsActivity.this.finish();
                }
            }
        };
        C0732g.m2130a((Context) this).mo2403a(this.mExitAppReceiver, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        onActivityCreate(this);
    }

    public void initImmersion(View view, boolean z) {
        if (view == null && getRootViewId() > 0) {
            view = findViewById(getRootViewId());
        }
        if (view == null || getRootViewId() < 0) {
            if (getRootViewId() == -1 && VERSION.SDK_INT > 19) {
                Window window = getWindow();
                window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                window.setStatusBarColor(getStatusBarBgColor());
            }
            return;
        }
        immersionWindow(view, z);
    }

    public void immersionWindow(View view, boolean z) {
        int i;
        if (VERSION.SDK_INT >= 19) {
            Window window = getWindow();
            window.clearFlags(67108864);
            int windowsFlags = getWindowsFlags();
            int statusBarBgColor = getStatusBarBgColor();
            if (VERSION.SDK_INT >= 21) {
                View decorView = window.getDecorView();
                if (z) {
                    i = 0;
                } else {
                    i = VideoCacheReadBuffersizeExperiment.DEFAULT;
                }
                decorView.setSystemUiVisibility(i | 1280);
                window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                window.setStatusBarColor(getResources().getColor(17170445));
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(67108864);
            }
            this.mTintManager = new C11066b(this, view, windowsFlags);
            C11066b bVar = this.mTintManager;
            bVar.mo20049a(statusBarBgColor);
            if (bVar.f29702d) {
                bVar.f29706h.setBackgroundColor(statusBarBgColor);
            }
            C11066b bVar2 = this.mTintManager;
            bVar2.f29703e = true;
            if (bVar2.f29701c) {
                bVar2.f29705g.setVisibility(0);
            }
            C11066b bVar3 = this.mTintManager;
            bVar3.f29704f = false;
            if (bVar3.f29702d) {
                bVar3.f29706h.setVisibility(8);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C11083b c = C11081c.m22431c();
        if (c == null || !c.mo20106a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
