package com.p683ss.android.ugc.aweme.main;

import android.widget.TextView;
import com.p683ss.android.ugc.aweme.language.C35837h.C35838a;

/* renamed from: com.ss.android.ugc.aweme.main.bd */
final /* synthetic */ class C36523bd implements C35838a {

    /* renamed from: a */
    private final MainFragment f93599a;

    /* renamed from: b */
    private final TextView f93600b;

    C36523bd(MainFragment mainFragment, TextView textView) {
        this.f93599a = mainFragment;
        this.f93600b = textView;
    }

    /* renamed from: a */
    public final void mo74497a(String str) {
        MainFragment mainFragment = this.f93599a;
        TextView textView = this.f93600b;
        if (mainFragment.getActivity() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(MainFragment.m82270n());
            textView.setText(sb.toString());
        }
    }
}
