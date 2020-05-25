package com.zhihu.matisse.internal.p2254ui.widget;

import android.content.Context;
import android.database.Cursor;
import android.support.p043v7.widget.ListPopupWindow;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.p2253c.C45348d;

/* renamed from: com.zhihu.matisse.internal.ui.widget.a */
public final class C52539a {

    /* renamed from: a */
    public CursorAdapter f130839a;

    /* renamed from: b */
    public TextView f130840b;

    /* renamed from: c */
    public ListPopupWindow f130841c;

    /* renamed from: d */
    public OnItemSelectedListener f130842d;

    public C52539a(Context context) {
        this.f130841c = new ListPopupWindow(context, null, R.attr.st);
        this.f130841c.mo4772a(true);
        float f = context.getResources().getDisplayMetrics().density;
        this.f130841c.mo4774b((int) (216.0f * f));
        this.f130841c.f4605h = (int) (16.0f * f);
        this.f130841c.mo4769a((int) (f * -48.0f));
    }

    /* renamed from: a */
    public final void mo110089a(Context context, int i) {
        this.f130841c.dismiss();
        Cursor cursor = this.f130839a.getCursor();
        cursor.moveToPosition(i);
        String a = Album.m98883a(cursor).mo91655a(context);
        if (this.f130840b.getVisibility() == 0) {
            this.f130840b.setText(a);
        } else if (C45348d.m98881a()) {
            this.f130840b.setAlpha(0.0f);
            this.f130840b.setVisibility(0);
            this.f130840b.setText(a);
            this.f130840b.animate().alpha(1.0f).setDuration((long) context.getResources().getInteger(17694722)).start();
        } else {
            this.f130840b.setVisibility(0);
            this.f130840b.setText(a);
        }
    }
}
