package com.p683ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.b */
public final class C40051b {
    /* renamed from: a */
    public static MusProfileTabView m89028a(Context context, int i, ViewGroup viewGroup, int i2) {
        if (i == 1) {
            MusProfileTabView musProfileTabView = (MusProfileTabView) LayoutInflater.from(context).inflate(R.layout.bqm, viewGroup, false);
            ((C40052c) musProfileTabView).setText(C23723j.m58217a().getString(i2));
            musProfileTabView.setAnimationEnabled(true);
            return musProfileTabView;
        } else if (i != 0) {
            return null;
        } else {
            MusProfileTabView musProfileTabView2 = (MusProfileTabView) LayoutInflater.from(context).inflate(R.layout.bql, viewGroup, false);
            ((MusProfileTabImageView) musProfileTabView2).setImageResource(i2);
            musProfileTabView2.setAnimationEnabled(true);
            return musProfileTabView2;
        }
    }
}
