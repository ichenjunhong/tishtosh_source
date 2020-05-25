package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.support.p030v4.view.C1056u;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.g */
final class C39377g {

    /* renamed from: a */
    final View f100729a;

    /* renamed from: b */
    public int f100730b;

    /* renamed from: c */
    public int f100731c;

    /* renamed from: d */
    public int f100732d;

    /* renamed from: e */
    public int f100733e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo80344a() {
        C1056u.m3058g(this.f100729a, this.f100732d - (this.f100729a.getTop() - this.f100730b));
        C1056u.m3060h(this.f100729a, this.f100733e - (this.f100729a.getLeft() - this.f100731c));
    }

    C39377g(View view) {
        this.f100729a = view;
    }

    /* renamed from: b */
    public final boolean mo80346b(int i) {
        if (this.f100733e == i) {
            return false;
        }
        this.f100733e = i;
        mo80344a();
        return true;
    }

    /* renamed from: a */
    public final boolean mo80345a(int i) {
        StringBuilder sb = new StringBuilder("setTopAndBottomOffset...");
        sb.append(i);
        sb.append("/");
        sb.append(this.f100732d);
        if (this.f100732d == i) {
            return false;
        }
        this.f100732d = i;
        mo80344a();
        return true;
    }
}
