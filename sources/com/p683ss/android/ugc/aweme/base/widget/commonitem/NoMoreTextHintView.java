package com.p683ss.android.ugc.aweme.base.widget.commonitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.mvvm.C23561d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.p1424a.C23754a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.commonitem.NoMoreTextHintView */
public class NoMoreTextHintView implements C23561d<C23754a> {
    private TextView mView;

    public View getAndroidView() {
        return this.mView;
    }

    public void refresh() {
    }

    public NoMoreTextHintView(Context context) {
    }

    public void bind(C23754a aVar) {
        C23729p.m58260a(this.mView, (CharSequence) aVar.f63327a);
        if (aVar.f63328b != 0) {
            this.mView.setBackgroundColor(aVar.f63328b);
        }
    }

    public C23561d create(Context context, ViewGroup viewGroup) {
        this.mView = (TextView) LayoutInflater.from(context).inflate(R.layout.aww, viewGroup, false);
        return this;
    }
}
