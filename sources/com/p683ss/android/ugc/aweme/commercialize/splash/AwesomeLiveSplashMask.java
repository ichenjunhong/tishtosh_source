package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeLiveSplashMask */
public final class AwesomeLiveSplashMask extends RelativeLayout implements C26245m {

    /* renamed from: a */
    Aweme f69213a;

    /* renamed from: b */
    private int f69214b = 4;

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ig);
        if (findViewById != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin += C23724k.m58225c();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnClickListener(new C26215a(this));
    }

    public AwesomeLiveSplashMask(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f69214b == 4 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        if (this.f69214b != 2 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onEvent(C26216b bVar) {
        this.f69214b = bVar.f69221a;
        this.f69213a = bVar.f69222b;
        if (this.f69214b == 3) {
            animate().alpha(0.0f).setDuration(260).start();
        }
    }

    public AwesomeLiveSplashMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AwesomeLiveSplashMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
