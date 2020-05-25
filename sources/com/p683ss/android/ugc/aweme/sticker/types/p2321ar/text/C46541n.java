package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d.C46749a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.n */
public class C46541n {

    /* renamed from: a */
    public EffectTextInputView f117427a;

    /* renamed from: b */
    protected C46747d f117428b;

    /* renamed from: c */
    protected C20489b f117429c;

    /* renamed from: d */
    public C46540m f117430d;

    /* renamed from: e */
    protected C46543b f117431e;

    /* renamed from: f */
    protected FragmentActivity f117432f;

    /* renamed from: g */
    protected boolean f117433g;

    /* renamed from: h */
    public int f117434h;

    /* renamed from: i */
    protected int f117435i;

    /* renamed from: j */
    protected String f117436j;

    /* renamed from: k */
    public boolean f117437k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.n$a */
    class C46542a implements C46749a {
        /* renamed from: c */
        public final void mo73972c(int i) {
        }

        C46542a() {
        }

        /* renamed from: a */
        public final void mo73970a(int i) {
            if (C46541n.this.f117433g) {
                if (C46541n.this.f117427a != null) {
                    C46541n.this.f117427a.mo93299d();
                    C46541n.this.f117427a.mo93276a(i);
                }
                if (C46541n.this.f117431e != null) {
                    C46541n.this.f117431e.mo93327a(true);
                }
            }
        }

        /* renamed from: b */
        public final void mo73971b(int i) {
            if (C46541n.this.f117433g) {
                C46541n.this.f117433g = false;
                if (C46541n.this.f117427a != null) {
                    C46541n.this.mo93320a(C46541n.this.f117427a.getText());
                    C46541n.this.f117427a.dismiss();
                    C46541n.this.f117427a.setText("");
                }
                if (C46541n.this.f117429c != null) {
                    C46541n.this.f117429c.mo43515d(true);
                }
                if (C46541n.this.f117431e != null) {
                    C46541n.this.f117431e.mo93327a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.n$b */
    public interface C46543b {
        /* renamed from: a */
        void mo93327a(boolean z);
    }

    /* renamed from: a */
    public int mo93306a(int i, String str) {
        return 0;
    }

    /* renamed from: a */
    public void mo93311a() {
    }

    /* renamed from: b */
    public final void mo93322b() {
        this.f117433g = true;
        if (this.f117427a != null) {
            this.f117427a.mo93298c();
        }
    }

    /* renamed from: c */
    public final void mo93324c() {
        if (this.f117427a != null) {
            this.f117427a.mo93297b();
        }
    }

    /* renamed from: d */
    public final void mo93325d() {
        if (this.f117428b != null) {
            this.f117428b.mo93877a();
        }
        mo93320a("");
    }

    /* renamed from: e */
    public final void mo93326e() {
        if (this.f117428b != null) {
            this.f117428b.mo93878a(new C46542a());
        }
    }

    /* renamed from: a */
    public final C46541n mo93318a(int i) {
        this.f117434h = i;
        return this;
    }

    /* renamed from: a */
    public C46541n mo93307a(EffectTextInputView effectTextInputView) {
        this.f117427a = effectTextInputView;
        this.f117427a.setVisibility(8);
        return this;
    }

    /* renamed from: a */
    public final C46541n mo93319a(C46543b bVar) {
        this.f117431e = bVar;
        return this;
    }

    /* renamed from: a */
    public final void mo93320a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (this.f117429c != null && this.f117430d != null) {
            this.f117436j = str;
            this.f117429c.mo43471a(str, this.f117430d.f117424b, this.f117430d.f117425c, this.f117430d.f117426d);
        }
    }

    public C46541n(FragmentActivity fragmentActivity, C20489b bVar) {
        if (fragmentActivity != null) {
            this.f117432f = fragmentActivity;
            this.f117429c = bVar;
            this.f117428b = new C46747d(fragmentActivity);
        }
    }

    /* renamed from: b */
    public final void mo93323b(int i, String str) {
        int a = mo93306a(i, str);
        if (this.f117427a != null) {
            this.f117427a.setMaxTextCount(a);
        }
    }

    /* renamed from: a */
    public final void mo93321a(String str, int i) {
        if (!TextUtils.isEmpty(str) && this.f117427a != null) {
            if (i == 0) {
                this.f117427a.setText(str);
                return;
            }
            this.f117427a.setHintText(str);
        }
    }
}
