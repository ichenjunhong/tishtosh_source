package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a */
public final class C29334a extends C29360o {
    /* renamed from: a */
    public final View mo59272a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.li, viewGroup, false);
        inflate.findViewById(R.id.de).setOnClickListener(new C29339b(context));
        return inflate;
    }
}
