package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.widget.c */
public final class C10722c {

    /* renamed from: a */
    public Drawable f28693a;

    /* renamed from: b */
    public CharSequence f28694b;

    /* renamed from: c */
    public CharSequence f28695c;

    /* renamed from: d */
    public C10720a f28696d;

    /* renamed from: e */
    public int f28697e;

    /* renamed from: f */
    public String f28698f;

    /* renamed from: g */
    public OnClickListener f28699g;

    /* renamed from: h */
    public String f28700h;

    /* renamed from: i */
    public OnClickListener f28701i;

    /* renamed from: j */
    public boolean f28702j;

    /* renamed from: k */
    public boolean f28703k;

    /* renamed from: l */
    public boolean f28704l;

    /* renamed from: m */
    public boolean f28705m;

    /* renamed from: n */
    public boolean f28706n;

    /* renamed from: o */
    public boolean f28707o;

    /* renamed from: p */
    public boolean f28708p;

    /* renamed from: q */
    public boolean f28709q;

    /* renamed from: r */
    public int f28710r;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.c$a */
    public static class C10723a {

        /* renamed from: a */
        public C10722c f28711a = new C10722c();

        /* renamed from: b */
        private Context f28712b;

        /* renamed from: d */
        public final C10723a mo19283d(int i) {
            this.f28711a.f28710r = i;
            return this;
        }

        /* renamed from: a */
        public final C10723a mo19279a(String str) {
            this.f28711a.f28694b = str;
            this.f28711a.f28703k = true;
            return this;
        }

        /* renamed from: b */
        public final C10723a mo19281b(String str) {
            this.f28711a.f28695c = str;
            this.f28711a.f28704l = true;
            return this;
        }

        /* renamed from: c */
        public final C10723a mo19282c(int i) {
            this.f28711a.f28695c = this.f28712b.getString(i);
            this.f28711a.f28704l = true;
            return this;
        }

        public C10723a(Context context) {
            this.f28712b = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C10723a mo19277a(int i) {
            this.f28711a.f28693a = this.f28712b.getResources().getDrawable(i);
            this.f28711a.f28702j = true;
            return this;
        }

        /* renamed from: b */
        public final C10723a mo19280b(int i) {
            this.f28711a.f28694b = this.f28712b.getString(i);
            if (!TextUtils.isEmpty(this.f28711a.f28694b)) {
                this.f28711a.f28703k = true;
                return this;
            }
            throw new IllegalArgumentException("title should not be empty string!");
        }

        /* renamed from: a */
        public final C10723a mo19278a(C10720a aVar, int i, OnClickListener onClickListener) {
            this.f28711a.f28696d = aVar;
            this.f28711a.f28698f = this.f28712b.getString(i);
            this.f28711a.f28699g = onClickListener;
            this.f28711a.f28707o = true;
            return this;
        }
    }
}
