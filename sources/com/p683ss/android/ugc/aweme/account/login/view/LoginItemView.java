package com.p683ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.support.p043v7.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22029a;
import com.p683ss.android.ugc.aweme.base.mvvm.C23561d;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.LoginItemView */
public class LoginItemView extends IViewDefault<C22029a> {
    public ImageView mImageView;

    public LoginItemView(Context context) {
        super(context);
    }

    public void bind(C22029a aVar) {
        this.mImageView.setImageResource(aVar.f59521a);
        this.mImageView.setOnClickListener(aVar.f59522b);
    }

    public C23561d create(Context context, ViewGroup viewGroup) {
        this.mImageView = new AppCompatImageView(context);
        int c = C23723j.m58220c(R.dimen.x2);
        this.mImageView.setLayoutParams(new LayoutParams(c, c));
        this.mView = this.mImageView;
        return this;
    }
}
