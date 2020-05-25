package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.p2249a.C45332a;
import com.zhihu.matisse.p2627ui.MatisseActivity;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.zhihu.matisse.c */
public final class C45337c {

    /* renamed from: a */
    public final C45353c f114621a;

    /* renamed from: b */
    private final C45331a f114622b;

    /* renamed from: a */
    public final C45337c mo91627a(float f) {
        this.f114621a.f114678o = 0.85f;
        return this;
    }

    /* renamed from: b */
    public final C45337c mo91632b(boolean z) {
        this.f114621a.f114669f = z;
        return this;
    }

    /* renamed from: c */
    public final C45337c mo91633c(int i) {
        this.f114621a.f114668e = -1;
        return this;
    }

    /* renamed from: a */
    public final C45337c mo91628a(int i) {
        this.f114621a.f114667d = R.style.hh;
        return this;
    }

    /* renamed from: a */
    public final C45337c mo91629a(C45332a aVar) {
        if (this.f114621a.f114673j == null) {
            this.f114621a.f114673j = new ArrayList();
        }
        this.f114621a.f114673j.add(aVar);
        return this;
    }

    /* renamed from: d */
    public final void mo91634d(int i) {
        Activity a = this.f114622b.mo91621a();
        if (a != null) {
            Intent intent = new Intent(a, MatisseActivity.class);
            Fragment b = this.f114622b.mo91623b();
            if (b != null) {
                b.startActivityForResult(intent, i);
            } else {
                a.startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: a */
    public final C45337c mo91630a(boolean z) {
        this.f114621a.f114666c = true;
        return this;
    }

    /* renamed from: b */
    public final C45337c mo91631b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
        } else if (this.f114621a.f114671h > 0 || this.f114621a.f114672i > 0) {
            throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
        } else {
            this.f114621a.f114670g = i;
            return this;
        }
    }

    C45337c(C45331a aVar, Set<C45333b> set, boolean z) {
        this.f114622b = aVar;
        C45353c a = C45353c.m98893a();
        a.f114667d = R.style.hi;
        a.f114668e = 0;
        a.f114669f = false;
        a.f114670g = 1;
        a.f114671h = 0;
        a.f114672i = 0;
        a.f114673j = null;
        a.f114674k = false;
        a.f114675l = null;
        a.f114676m = 3;
        a.f114677n = 0;
        a.f114678o = 0.5f;
        a.f114679p = true;
        a.f114681r = false;
        a.f114682s = false;
        a.f114683t = Integer.MAX_VALUE;
        this.f114621a = a;
        this.f114621a.f114664a = set;
        this.f114621a.f114665b = z;
        this.f114621a.f114668e = -1;
    }
}
