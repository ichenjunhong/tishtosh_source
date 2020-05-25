package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.e */
public final class C29344e extends C29360o {

    /* renamed from: a */
    private String f76841a;

    public C29344e(String str) {
        this.f76841a = str;
    }

    /* renamed from: a */
    public final View mo59272a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.la, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.d9v)).setText(this.f76841a);
        return inflate;
    }
}
