package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.e */
final /* synthetic */ class C32114e implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f83794a;

    /* renamed from: b */
    private final CharSequence[] f83795b;

    /* renamed from: c */
    private final User f83796c;

    /* renamed from: d */
    private final Resources f83797d;

    C32114e(ViewHolder viewHolder, CharSequence[] charSequenceArr, User user, Resources resources) {
        this.f83794a = viewHolder;
        this.f83795b = charSequenceArr;
        this.f83796c = user;
        this.f83797d = resources;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ViewHolder viewHolder = this.f83794a;
        CharSequence[] charSequenceArr = this.f83795b;
        User user = this.f83796c;
        Resources resources = this.f83797d;
        C26891a aVar = new C26891a(view.getContext());
        aVar.mo54844a(charSequenceArr, (DialogInterface.OnClickListener) new C32115f(viewHolder, view, user, resources));
        aVar.mo54845b();
    }
}
