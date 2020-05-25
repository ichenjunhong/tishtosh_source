package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;

/* renamed from: com.ss.android.ugc.tools.view.widget.c */
public final class C50273c {

    /* renamed from: a */
    public Drawable f126123a;

    /* renamed from: b */
    public CharSequence f126124b;

    /* renamed from: c */
    public CharSequence f126125c;

    /* renamed from: d */
    public C50285i f126126d;

    /* renamed from: e */
    public int f126127e;

    /* renamed from: f */
    public String f126128f;

    /* renamed from: g */
    public OnClickListener f126129g;

    /* renamed from: h */
    public String f126130h;

    /* renamed from: i */
    public OnClickListener f126131i;

    /* renamed from: j */
    public boolean f126132j;

    /* renamed from: k */
    public boolean f126133k;

    /* renamed from: l */
    public boolean f126134l;

    /* renamed from: m */
    public boolean f126135m;

    /* renamed from: n */
    public boolean f126136n;

    /* renamed from: o */
    public boolean f126137o;

    /* renamed from: com.ss.android.ugc.tools.view.widget.c$a */
    public static class C50274a {

        /* renamed from: a */
        public C50273c f126138a = new C50273c();

        /* renamed from: b */
        private Context f126139b;

        /* renamed from: b */
        public final C50274a mo98173b(int i) {
            this.f126138a.f126125c = this.f126139b.getString(i);
            this.f126138a.f126134l = true;
            return this;
        }

        public C50274a(Context context) {
            this.f126139b = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C50274a mo98171a(int i) {
            this.f126138a.f126124b = this.f126139b.getString(i);
            if (!TextUtils.isEmpty(this.f126138a.f126124b)) {
                this.f126138a.f126133k = true;
                return this;
            }
            throw new IllegalArgumentException("title should not be empty string!");
        }

        /* renamed from: a */
        public final C50274a mo98172a(C50285i iVar, int i, OnClickListener onClickListener) {
            this.f126138a.f126126d = iVar;
            this.f126138a.f126128f = this.f126139b.getString(i);
            this.f126138a.f126129g = onClickListener;
            this.f126138a.f126135m = true;
            return this;
        }
    }
}
