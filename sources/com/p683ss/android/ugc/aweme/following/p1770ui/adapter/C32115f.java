package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.f */
final /* synthetic */ class C32115f implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f83798a;

    /* renamed from: b */
    private final View f83799b;

    /* renamed from: c */
    private final User f83800c;

    /* renamed from: d */
    private final Resources f83801d;

    C32115f(ViewHolder viewHolder, View view, User user, Resources resources) {
        this.f83798a = viewHolder;
        this.f83799b = view;
        this.f83800c = user;
        this.f83801d = resources;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ViewHolder viewHolder = this.f83798a;
        View view = this.f83799b;
        User user = this.f83800c;
        Resources resources = this.f83801d;
        if (i == 0) {
            C26890h.m65011a("click_remove_fans", C23089d.m56640a().mo47829a("enter_from", "fans").f61491a);
            Dialog c = new C10643a(view.getContext()).mo18885a((int) R.string.d6q).mo18902b(C2240a.m6772a(view.getResources().getString(R.string.d6p), new Object[]{C47915gg.m103656e(user)})).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.d6o, (OnClickListener) new C32116g(viewHolder, user)).mo18897a().mo18883c();
            if (c.findViewById(R.id.dez) instanceof TextView) {
                ((TextView) c.findViewById(R.id.dez)).setTextColor(resources.getColor(R.color.j7));
            }
        }
    }
}
