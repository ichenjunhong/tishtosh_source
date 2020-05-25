package com.p683ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.base.mvvm.C23561d;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.C23565c;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.LoginItemMoreView */
public class LoginItemMoreView extends IViewDefault<C23565c> {
    public ImageView mImageView;

    public LoginItemMoreView(Context context) {
        super(context);
    }

    public void bind(C23565c cVar) {
        this.mView.setOnClickListener(cVar.f62682b);
    }

    public C23561d create(Context context, ViewGroup viewGroup) {
        this.mImageView = new AutoRTLImageView(context);
        int b = (int) C9432q.m18687b(context, 36.0f);
        int b2 = (int) C9432q.m18687b(context, 8.0f);
        this.mImageView.setLayoutParams(new LayoutParams(b, C23723j.m58220c(R.dimen.x2)));
        this.mImageView.setPadding(b2, b2, b2, b2);
        this.mImageView.setScaleType(ScaleType.CENTER);
        this.mView = this.mImageView;
        this.mView.setOnTouchListener(new C48221a(0.5f, 150, null));
        return this;
    }
}
