package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k */
public final class C33660k extends C23526a {

    /* renamed from: a */
    private C33655i f87285a;

    /* renamed from: b */
    private RemoteImageView f87286b;

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("photo_param", this.f87285a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f87285a = (C33655i) bundle.getSerializable("photo_param");
        } else {
            this.f87285a = (C33655i) getArguments().getSerializable("photo_param");
        }
        this.f87286b = (RemoteImageView) view.findViewById(R.id.bxn);
        RemoteImageView remoteImageView = this.f87286b;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f87285a.getPath());
        C23515d.m57677a(remoteImageView, sb.toString());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rg, viewGroup, false);
    }
}
