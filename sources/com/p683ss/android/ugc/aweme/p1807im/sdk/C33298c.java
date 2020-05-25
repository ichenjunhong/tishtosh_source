package com.p683ss.android.ugc.aweme.p1807im.sdk;

import android.app.Activity;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33631o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.c */
public class C33298c<DATA> extends C1352v {

    /* renamed from: a */
    protected C33631o f86358a;

    /* renamed from: a */
    public void mo70626a(DATA data) {
    }

    /* renamed from: a */
    public void mo70627a(DATA data, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70628b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70625a() {
        mo70628b();
        mo70629c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo70629c() {
        C35221bc.m79614a(this.itemView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final FragmentActivity mo70630d() {
        Activity d = C23729p.m58270d(this.itemView);
        if (d instanceof FragmentActivity) {
            return (FragmentActivity) d;
        }
        return null;
    }

    public C33298c(View view) {
        super(view);
        mo70625a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> T mo70624a(int i) {
        T findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return null;
    }

    public C33298c(View view, C33631o oVar) {
        super(view);
        this.f86358a = oVar;
        mo70625a();
    }

    public C33298c(ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        mo70625a();
    }
}
