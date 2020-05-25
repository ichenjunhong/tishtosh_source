package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.internal.C52114g;
import java.lang.ref.WeakReference;

public class TwitterLoginButton extends Button {

    /* renamed from: a */
    final WeakReference<Activity> f129678a;

    /* renamed from: b */
    volatile TwitterAuthClient f129679b;

    /* renamed from: c */
    OnClickListener f129680c;

    /* renamed from: d */
    C52068b<C52231v> f129681d;

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterLoginButton$a */
    class C52081a implements OnClickListener {
        private C52081a() {
        }

        public final void onClick(View view) {
            if (TwitterLoginButton.this.f129681d == null) {
                C52114g.m111469a("Twitter", "Callback must not be null, did you call setCallback?");
            }
            Activity activity = (Activity) TwitterLoginButton.this.f129678a.get();
            if (activity == null || activity.isFinishing()) {
                C52114g.m111469a("Twitter", "TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
            }
            TwitterLoginButton.this.getTwitterAuthClient().mo108777a((Activity) TwitterLoginButton.this.f129678a.get(), TwitterLoginButton.this.f129681d);
            if (TwitterLoginButton.this.f129680c != null) {
                TwitterLoginButton.this.f129680c.onClick(view);
            }
        }
    }

    public C52068b<C52231v> getCallback() {
        return this.f129681d;
    }

    public TwitterAuthClient getTwitterAuthClient() {
        if (this.f129679b == null) {
            synchronized (TwitterLoginButton.class) {
                if (this.f129679b == null) {
                    this.f129679b = new TwitterAuthClient();
                }
            }
        }
        return this.f129679b;
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if ((getContext() instanceof ContextThemeWrapper) && (((ContextThemeWrapper) getContext()).getBaseContext() instanceof Activity)) {
            return (Activity) ((ContextThemeWrapper) getContext()).getBaseContext();
        }
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f129680c = onClickListener;
    }

    public TwitterLoginButton(Context context) {
        this(context, null);
    }

    public void setCallback(C52068b<C52231v> bVar) {
        if (bVar != null) {
            this.f129681d = bVar;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    private TwitterLoginButton(Context context, AttributeSet attributeSet, int i, TwitterAuthClient twitterAuthClient) {
        super(context, attributeSet, i);
        this.f129678a = new WeakReference<>(getActivity());
        this.f129679b = null;
        Resources resources = getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(2131956647), null, null, null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(2131886982));
        super.setText(R.string.f4q);
        super.setTextColor(resources.getColor(R.color.amh));
        super.setTextSize(0, (float) resources.getDimensionPixelSize(2131886987));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(2131886984), 0, resources.getDimensionPixelSize(2131886986), 0);
        super.setBackgroundResource(R.drawable.c96);
        super.setOnClickListener(new C52081a());
        if (VERSION.SDK_INT >= 21) {
            super.setAllCaps(false);
        }
        if (!isInEditMode()) {
            try {
                C52225r.m111638a();
            } catch (IllegalStateException e) {
                e.getMessage();
                setEnabled(false);
            }
        }
    }
}
