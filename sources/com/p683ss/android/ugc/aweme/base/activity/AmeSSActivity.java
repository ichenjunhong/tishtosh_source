package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.common.utility.C9406f;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32465c;
import com.p683ss.android.ugc.aweme.utils.C47835dx;
import com.p683ss.android.ugc.aweme.utils.C47931m;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSSActivity */
public class AmeSSActivity extends AmeActivity implements C9406f {
    protected int mActivityAnimType;
    private C47931m mAudioManagerHelper;
    private int mCurTheme = -1;
    private C32465c mCustomToast;
    private boolean mFocused = false;
    private boolean mHideCustomToastStatusBar;
    private SparseArray<C23419a> mIOnActivityResultListenerSparseArray = new SparseArray<>();
    private boolean mIsFirstStart = true;
    private int mOriginTheme = -1;

    /* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSSActivity$a */
    public interface C23419a {
        /* renamed from: a */
        void mo48560a(int i, int i2, Intent intent);
    }

    private boolean isBackgroundSwitch() {
        if (mStartNum == 0) {
            return true;
        }
        return false;
    }

    public void onStart() {
        super.onStart();
        this.mIsFirstStart = false;
    }

    public void dismissCustomToast() {
        if (this.mCustomToast != null) {
            this.mCustomToast.mo65742d();
        }
    }

    public void finish() {
        super.finish();
        if (this.mActivityAnimType != 0) {
            C23424c.m57557b(this, this.mActivityAnimType);
        }
    }

    public void hideCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = true;
        if (this.mCustomToast != null) {
            this.mCustomToast.f84544g = true;
        }
    }

    public void showCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = false;
        if (this.mCustomToast != null) {
            this.mCustomToast.f84544g = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkIfCanShowToast() {
        if (!isViewValid()) {
            return false;
        }
        if (this.mCustomToast == null) {
            this.mCustomToast = new C32465c(this);
            this.mCustomToast.f84544g = this.mHideCustomToastStatusBar;
        }
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mCustomToast != null) {
            this.mCustomToast.mo65733a();
        }
        this.mIOnActivityResultListenerSparseArray.clear();
        this.mIOnActivityResultListenerSparseArray = null;
    }

    public void onPause() {
        super.onPause();
        if (this.mCustomToast != null) {
            this.mCustomToast.mo65739b();
        }
        C47835dx.f120393a = getClass();
    }

    public void onResume() {
        super.onResume();
        if (this.mCustomToast != null) {
            this.mCustomToast.mo65741c();
        }
        C47931m audioManagerHelper = getAudioManagerHelper(true);
        if (audioManagerHelper != null) {
            try {
                if (audioManagerHelper.f120527a == null) {
                    audioManagerHelper.f120527a = (AudioManager) getApplicationContext().getSystemService("audio");
                }
                if (!(audioManagerHelper.f120527a == null || audioManagerHelper.f120528b == null)) {
                    audioManagerHelper.f120527a.requestAudioFocus(audioManagerHelper.f120528b, 3, 2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onStop() {
        super.onStop();
        C47931m audioManagerHelper = getAudioManagerHelper(false);
        if (audioManagerHelper != null) {
            try {
                if (audioManagerHelper.f120527a == null) {
                    audioManagerHelper.f120527a = (AudioManager) getApplicationContext().getSystemService("audio");
                }
                if (!(audioManagerHelper.f120527a == null || audioManagerHelper.f120528b == null)) {
                    audioManagerHelper.f120527a.abandonAudioFocus(audioManagerHelper.f120528b);
                }
                audioManagerHelper.f120527a = null;
            } catch (Exception unused) {
            }
        }
    }

    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    private C47931m getAudioManagerHelper(boolean z) {
        if (this.mAudioManagerHelper == null) {
            this.mAudioManagerHelper = new C47931m(this);
        }
        return this.mAudioManagerHelper;
    }

    public void setOnActivityResultListener(C23419a aVar) {
        this.mIOnActivityResultListenerSparseArray.append(1001, aVar);
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            this.mHideCustomToastStatusBar = false;
            if (this.mActivityAnimType != 0) {
                C23424c.m57556a(this, this.mActivityAnimType);
            }
        } catch (NotFoundException unused) {
        }
        if (this.mIOnActivityResultListenerSparseArray == null) {
            this.mIOnActivityResultListenerSparseArray = new SparseArray<>();
        }
    }

    /* access modifiers changed from: protected */
    public void showImeOnce(final View view) {
        if (!this.mFocused) {
            final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    view.post(new Runnable() {
                        public final void run() {
                            if (AmeSSActivity.this.isViewValid()) {
                                InputMethodManager inputMethodManager = (InputMethodManager) AmeSSActivity.this.getSystemService("input_method");
                                if (inputMethodManager != null) {
                                    inputMethodManager.showSoftInput(view, 1);
                                }
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {
                public final void run() {
                    view.requestFocus();
                }
            });
            this.mFocused = true;
        }
    }

    public void showCustomToast(String str) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo65737a(str);
        }
    }

    public void superOverridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void setOnActivityResultListener(int i, C23419a aVar) {
        this.mIOnActivityResultListenerSparseArray.append(i, aVar);
    }

    public void showCustomLongToast(int i, String str) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo65734a(i, str);
        }
    }

    public void showCustomToast(int i, String str) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo65736a(null, i, 0, str, 2000, 17);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C23419a aVar = (C23419a) this.mIOnActivityResultListenerSparseArray.get(1001);
        if (aVar != null) {
            aVar.mo48560a(i, i2, intent);
        }
    }

    public void showCustomToast(String str, int i, int i2) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo65738a(str, i, i2);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo65735a(i, str, i2, i3);
        }
    }
}
