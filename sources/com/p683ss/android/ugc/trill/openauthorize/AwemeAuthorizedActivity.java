package com.p683ss.android.ugc.trill.openauthorize;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity */
public final class AwemeAuthorizedActivity extends BaseI18nAuthorizedActivity {
    private HashMap _$_findViewCache;

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity", "onCreate", false);
    }
}
