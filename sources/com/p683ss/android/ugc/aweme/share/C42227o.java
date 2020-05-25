package com.p683ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23737a;

/* renamed from: com.ss.android.ugc.aweme.share.o */
public abstract class C42227o extends LinearLayout {

    /* renamed from: a */
    public Fragment f106754a;

    /* renamed from: a */
    public abstract void mo86175a();

    /* renamed from: a */
    public abstract void mo86176a(int i);

    /* renamed from: a */
    public abstract void mo86177a(int i, int i2, Intent intent);

    /* renamed from: a */
    public abstract void mo86178a(int i, C23737a aVar);

    /* renamed from: a */
    public abstract void mo86179a(int i, boolean z);

    /* renamed from: b */
    public abstract String mo86180b();

    public Fragment getFragment() {
        return this.f106754a;
    }

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i);

    public abstract void setSyncShareViewTextColor(int i);

    public abstract void setSyncShareViewTextSize(float f);

    public void setSyncShareViewTitle(String str) {
    }

    public C42227o(Context context) {
        super(context);
    }
}
