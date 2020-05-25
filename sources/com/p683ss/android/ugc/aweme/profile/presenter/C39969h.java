package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.h */
public final class C39969h {

    /* renamed from: a */
    public String f101898a = "";

    /* renamed from: b */
    public String f101899b = "";

    /* renamed from: c */
    public int f101900c = -1;

    /* renamed from: d */
    public int f101901d;

    /* renamed from: e */
    public int f101902e = -1;

    /* renamed from: f */
    public String f101903f;

    /* renamed from: g */
    public String f101904g;

    /* renamed from: h */
    public Aweme f101905h;

    /* renamed from: i */
    public String f101906i;

    /* renamed from: j */
    public int f101907j = -1;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.h$a */
    public static final class C39970a {

        /* renamed from: a */
        private final C39969h f101908a = new C39969h();

        /* renamed from: a */
        public final C39969h mo81872a() {
            boolean z;
            if (this.f101908a.f101900c != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f101908a;
            }
            throw new IllegalStateException("You must set an action.".toString());
        }

        /* renamed from: a */
        public final C39970a mo81869a(int i) {
            this.f101908a.f101900c = i;
            return this;
        }

        /* renamed from: b */
        public final C39970a mo81873b(int i) {
            this.f101908a.f101901d = i;
            return this;
        }

        /* renamed from: c */
        public final C39970a mo81875c(int i) {
            this.f101908a.f101902e = i;
            return this;
        }

        /* renamed from: d */
        public final C39970a mo81877d(int i) {
            this.f101908a.f101907j = i;
            return this;
        }

        /* renamed from: e */
        public final C39970a mo81879e(String str) {
            this.f101908a.f101906i = str;
            return this;
        }

        /* renamed from: a */
        public final C39970a mo81870a(Aweme aweme) {
            this.f101908a.f101905h = aweme;
            return this;
        }

        /* renamed from: b */
        public final C39970a mo81874b(String str) {
            C39969h hVar = this.f101908a;
            if (str == null) {
                str = "";
            }
            hVar.f101899b = str;
            return this;
        }

        /* renamed from: c */
        public final C39970a mo81876c(String str) {
            this.f101908a.f101903f = str;
            return this;
        }

        /* renamed from: d */
        public final C39970a mo81878d(String str) {
            this.f101908a.f101904g = str;
            return this;
        }

        /* renamed from: a */
        public final C39970a mo81871a(String str) {
            C39969h hVar = this.f101908a;
            if (str == null) {
                str = "";
            }
            hVar.f101898a = str;
            return this;
        }
    }
}
