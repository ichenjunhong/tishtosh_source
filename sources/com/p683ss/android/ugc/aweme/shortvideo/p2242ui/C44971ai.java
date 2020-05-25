package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p683ss.android.ugc.aweme.shortvideo.C43212df;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ai */
public final class C44971ai extends C43212df {

    /* renamed from: d */
    ImageView f113899d;

    /* renamed from: e */
    Bitmap f113900e;

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f113900e != null && !this.f113900e.isRecycled()) {
            bundle.putParcelable("cover_data", this.f113900e);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f113899d = (ImageView) view.findViewById(R.id.k5);
        this.f109277a = (CircularProgressView) view.findViewById(R.id.b25);
        this.f109277a.setIndeterminate(false);
        this.f109278b = (TextView) view.findViewById(R.id.c62);
        C0013i.m16a((Callable<TResult>) new C44972aj<TResult>(this, bundle)).mo20a((C0011g<TResult, TContinuationResult>) new C44973ak<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ph, viewGroup, false);
    }
}
