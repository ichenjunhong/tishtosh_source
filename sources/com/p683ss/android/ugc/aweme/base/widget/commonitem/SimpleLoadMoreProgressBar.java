package com.p683ss.android.ugc.aweme.base.widget.commonitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.mvvm.C23561d;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.p1424a.C23755b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.commonitem.SimpleLoadMoreProgressBar */
public class SimpleLoadMoreProgressBar extends IViewDefault<C23755b> {
    private Context mContext;

    public SimpleLoadMoreProgressBar(Context context) {
        super(context);
        this.mContext = context;
    }

    public void bind(C23755b bVar) {
        if (bVar.f63329a != 0) {
            this.mView.setBackgroundColor(bVar.f63329a);
        }
    }

    public C23561d create(Context context, ViewGroup viewGroup) {
        this.mView = LayoutInflater.from(this.mContext).inflate(R.layout.awt, viewGroup, false);
        return this;
    }
}
