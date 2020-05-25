package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewState;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l.C46761c;
import com.p683ss.android.ugc.aweme.utils.C47743c;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c */
public final class C46740c {

    /* renamed from: a */
    public C46761c f118026a;

    /* renamed from: b */
    public float f118027b;

    /* renamed from: c */
    public float f118028c;

    /* renamed from: d */
    public float f118029d;

    /* renamed from: e */
    public float f118030e;

    /* renamed from: f */
    public long f118031f;

    /* renamed from: g */
    public float f118032g;

    /* renamed from: h */
    public float f118033h;

    /* renamed from: i */
    public boolean f118034i;

    /* renamed from: j */
    public int f118035j = 2;

    /* renamed from: k */
    public final int f118036k = 200;

    /* renamed from: l */
    public int f118037l;

    /* renamed from: m */
    public int f118038m;

    /* renamed from: n */
    public boolean f118039n;

    /* renamed from: o */
    public SafeHandler f118040o;

    /* renamed from: p */
    public C46757l f118041p;

    /* renamed from: q */
    public boolean f118042q;

    /* renamed from: r */
    public boolean f118043r;

    /* renamed from: s */
    public C46743b f118044s;

    /* renamed from: t */
    private Runnable f118045t = new C46742a();

    /* renamed from: u */
    private boolean f118046u = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);

    /* renamed from: v */
    private TextStickerViewModel f118047v;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c$a */
    class C46742a implements Runnable {
        public final void run() {
            C46740c.this.f118034i = false;
            if (C46740c.this.f118041p != null) {
                C46740c.this.f118041p.invalidate();
            }
            if (C46740c.this.f118044s != null) {
                C46740c.this.f118044s.mo93874a(false, true);
            }
        }

        private C46742a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c$b */
    public interface C46743b {
        /* renamed from: a */
        void mo93874a(boolean z, boolean z2);
    }

    /* renamed from: a */
    public final boolean mo93868a() {
        if (this.f118035j == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo93870b() {
        if (this.f118035j == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo93871c() {
        if (this.f118035j != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private TextStickerViewModel m101504e() {
        if (this.f118047v == null) {
            this.f118047v = (TextStickerViewModel) C48927d.m105736a((FragmentActivity) this.f118041p.getContext()).mo96760a(TextStickerViewModel.class);
        }
        return this.f118047v;
    }

    /* renamed from: d */
    public final boolean mo93872d() {
        return ((TextStickerViewState) m101504e().mo97464a((FragmentActivity) C47743c.m103371a(this.f118041p.getContext()))).getInTimeEditView();
    }

    /* renamed from: a */
    public final void mo93867a(boolean z) {
        this.f118034i = z;
        if (this.f118045t != null) {
            this.f118041p.removeCallbacks(this.f118045t);
            this.f118045t = null;
        }
        if (z && this.f118040o != null && this.f118045t == null) {
            this.f118045t = new C46742a();
            this.f118041p.postDelayed(this.f118045t, 3000);
        }
        this.f118041p.invalidate();
        if (this.f118044s != null) {
            this.f118044s.mo93874a(z, false);
        }
    }

    /* renamed from: a */
    public final boolean mo93869a(float f, float f2) {
        this.f118031f = System.currentTimeMillis();
        float f3 = f - ((float) this.f118037l);
        float f4 = f2 - ((float) this.f118038m);
        this.f118029d = f3;
        this.f118030e = f4;
        boolean z = false;
        if (this.f118043r) {
            this.f118035j = 2;
            this.f118043r = false;
        }
        if (this.f118034i && !this.f118046u) {
            if (this.f118041p.mo93901f(f3, f4)) {
                this.f118035j = 5;
            } else if (this.f118041p.mo93895c(f3, f4)) {
                this.f118035j = 4;
                this.f118032g = this.f118041p.getRotateRect().centerX();
                this.f118033h = this.f118041p.getRotateRect().centerY();
            } else if (this.f118041p.mo93899e(f3, f4)) {
                this.f118035j = 6;
                this.f118032g = this.f118041p.getEditRect().centerX();
                this.f118033h = this.f118041p.getEditRect().centerY();
            } else if (this.f118041p.mo93897d(f3, f4)) {
                this.f118035j = 7;
                this.f118032g = this.f118041p.getTimeRect().centerX();
                this.f118033h = this.f118041p.getTimeRect().centerY();
            }
            z = true;
        }
        if (this.f118035j != 2 && !mo93872d()) {
            return z;
        }
        this.f118039n = this.f118041p.mo93893b(f3, f4);
        if (!this.f118039n) {
            return z;
        }
        this.f118035j = 3;
        this.f118032g = f3;
        this.f118033h = f4;
        return true;
    }
}
