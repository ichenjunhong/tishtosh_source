package com.bytedance.lighten.p766a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.bytedance.lighten.p766a.p769c.C12170e;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.bytedance.lighten.p766a.p769c.C12176k;
import com.bytedance.lighten.p766a.p769c.C12178m;
import com.bytedance.lighten.p766a.p770d.C12186c;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.a.t */
public final class C12208t {

    /* renamed from: O */
    public static final C12208t f32222O;

    /* renamed from: A */
    public C12202p f32223A = C12202p.MEDIUM;

    /* renamed from: B */
    public String f32224B;

    /* renamed from: C */
    public Executor f32225C;

    /* renamed from: D */
    public C12180d f32226D = C12180d.DEFAULT;

    /* renamed from: E */
    public C12197k f32227E;

    /* renamed from: F */
    public ImageView f32228F;

    /* renamed from: G */
    public C12175j f32229G;

    /* renamed from: H */
    public C12176k f32230H;

    /* renamed from: I */
    public C12178m f32231I;

    /* renamed from: J */
    public boolean f32232J;

    /* renamed from: K */
    public boolean f32233K;

    /* renamed from: L */
    public C12156a f32234L;

    /* renamed from: M */
    public int f32235M = C12155a.f32088a.f32089b;

    /* renamed from: N */
    public C12170e f32236N;

    /* renamed from: P */
    private Object f32237P;

    /* renamed from: a */
    public Uri f32238a;

    /* renamed from: b */
    public Context f32239b;

    /* renamed from: c */
    public boolean f32240c;

    /* renamed from: d */
    public boolean f32241d = true;

    /* renamed from: e */
    public boolean f32242e;

    /* renamed from: f */
    public int f32243f = -1;

    /* renamed from: g */
    public boolean f32244g;

    /* renamed from: h */
    public int f32245h = -1;

    /* renamed from: i */
    public int f32246i = -1;

    /* renamed from: j */
    public int f32247j = -1;

    /* renamed from: k */
    public int f32248k = -1;

    /* renamed from: l */
    public int f32249l = -1;

    /* renamed from: m */
    public int f32250m = -1;

    /* renamed from: n */
    public Drawable f32251n;

    /* renamed from: o */
    public C12210u f32252o;

    /* renamed from: p */
    public int f32253p = -1;

    /* renamed from: q */
    public C12210u f32254q;

    /* renamed from: r */
    public Drawable f32255r;

    /* renamed from: s */
    public int f32256s;

    /* renamed from: t */
    public C12210u f32257t;

    /* renamed from: u */
    public Config f32258u;

    /* renamed from: v */
    public C12210u f32259v;

    /* renamed from: w */
    public C12187e f32260w;

    /* renamed from: x */
    public C12159b f32261x;

    /* renamed from: y */
    public C12192f f32262y;

    /* renamed from: z */
    public C12212w f32263z;

    /* renamed from: a */
    public final C12208t mo23120a(int[] iArr) {
        if (iArr.length == 2) {
            this.f32245h = iArr[0];
            this.f32246i = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    /* renamed from: a */
    public final void mo23121a() {
        if (this.f32227E == null && this.f32228F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        C12203q.m24647a(m24650e());
    }

    /* renamed from: a */
    public final void mo23122a(C12175j jVar) {
        if (this.f32227E == null && this.f32228F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        this.f32229G = jVar;
        C12203q.m24647a(m24650e());
    }

    /* renamed from: a */
    public final void mo23123a(C12178m mVar) {
        this.f32231I = mVar;
        C12203q.m24649b(m24650e());
    }

    /* renamed from: c */
    public final void mo23128c() {
        C12203q.m24649b(m24650e());
    }

    /* renamed from: d */
    public final void mo23129d() {
        C12207s e = m24650e();
        if (C12203q.f32144c && e != null) {
            C12203q.f32142a.download(e);
        }
    }

    static {
        C12208t tVar = new C12208t(new C12156a(Collections.emptyList()));
        tVar.f32238a = Uri.parse("");
        f32222O = tVar;
    }

    /* renamed from: b */
    public final void mo23126b() {
        C12211v.f32266a.execute(new Runnable() {
            public final void run() {
                C12208t.this.mo23121a();
            }
        });
    }

    /* renamed from: e */
    private C12207s m24650e() {
        boolean z;
        if (!(this.f32237P == null || this.f32234L != null || this.f32238a != null || C12203q.m24641a().f32157l == null || C12203q.m24641a().f32157l.mo23069a() == null)) {
            this.f32234L = (C12156a) C12203q.m24641a().f32157l.mo23069a().mo23068a(this.f32237P, this);
        }
        if (this.f32238a != null || (this.f32234L != null && !this.f32234L.mo23067a())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (this.f32258u == null) {
            this.f32258u = C12203q.m24641a().f32147b;
        }
        if (this.f32243f == -1) {
            this.f32243f = C12203q.m24641a().f32148c;
        }
        if (this == f32222O) {
            this.f32239b = C12203q.m24641a().f32146a.getApplicationContext();
        }
        if (this.f32239b == null) {
            if (this.f32227E instanceof View) {
                this.f32239b = ((View) this.f32227E).getContext();
                if (!(this.f32239b instanceof Activity)) {
                    if (this.f32239b instanceof ContextWrapper) {
                        this.f32239b = ((ContextWrapper) this.f32239b).getBaseContext();
                    }
                }
            } else if (this.f32228F != null) {
                this.f32239b = this.f32228F.getContext();
                if (!(this.f32239b instanceof Activity)) {
                    if (this.f32239b instanceof ContextWrapper) {
                        this.f32239b = ((ContextWrapper) this.f32239b).getBaseContext();
                    }
                }
            }
            if (this.f32239b == null) {
                this.f32239b = C12203q.m24641a().f32146a;
            }
        }
        String str = "";
        if (this.f32239b != null && (this.f32239b instanceof Activity)) {
            str = ((Activity) this.f32239b).getClass().getSimpleName();
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f32224B)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(this.f32224B);
                this.f32224B = sb.toString();
            } else {
                this.f32224B = str;
            }
        }
        TextUtils.isEmpty(this.f32224B);
        return new C12207s(this);
    }

    /* renamed from: a */
    public final C12208t mo23110a(int i) {
        this.f32249l = i;
        return this;
    }

    /* renamed from: c */
    public final C12208t mo23127c(boolean z) {
        this.f32233K = z;
        return this;
    }

    /* renamed from: b */
    public final C12208t mo23124b(boolean z) {
        this.f32232J = true;
        if (this.f32232J) {
            this.f32243f = 1;
        }
        return this;
    }

    /* renamed from: a */
    public final C12208t mo23113a(Config config) {
        this.f32258u = config;
        return this;
    }

    /* renamed from: b */
    public final C12208t mo23125b(int[] iArr) {
        if (iArr.length == 2) {
            this.f32247j = iArr[0];
            this.f32248k = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    public C12208t(Uri uri) {
        this.f32238a = uri;
    }

    /* renamed from: a */
    public final C12208t mo23114a(FragmentActivity fragmentActivity) {
        this.f32239b = fragmentActivity;
        return this;
    }

    public C12208t(C12156a aVar) {
        this.f32234L = aVar;
    }

    /* renamed from: a */
    public final C12208t mo23115a(C12187e eVar) {
        this.f32260w = eVar;
        return this;
    }

    public C12208t(Object obj) {
        this.f32237P = obj;
    }

    /* renamed from: a */
    public final C12208t mo23116a(C12197k kVar) {
        this.f32227E = kVar;
        return this;
    }

    public C12208t(String str) {
        this.f32238a = C12186c.m24631a(str);
    }

    /* renamed from: a */
    public final C12208t mo23117a(C12202p pVar) {
        this.f32223A = pVar;
        return this;
    }

    /* renamed from: a */
    public final C12208t mo23118a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f32224B = str;
        }
        return this;
    }

    /* renamed from: a */
    public final C12208t mo23119a(boolean z) {
        this.f32240c = z;
        return this;
    }

    /* renamed from: a */
    public final C12208t mo23111a(int i, int i2) {
        this.f32245h = i;
        this.f32246i = i2;
        return this;
    }

    /* renamed from: a */
    public final C12208t mo23112a(int i, C12170e eVar) {
        this.f32235M = i;
        this.f32236N = eVar;
        return this;
    }
}
