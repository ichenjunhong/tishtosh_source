package dmt.p2652av.video;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.p1743b.C31427a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43954a;
import java.util.ArrayList;

/* renamed from: dmt.av.video.VEVideoPublishEditViewModel */
public class VEVideoPublishEditViewModel extends C0209x {

    /* renamed from: a */
    public ArrayList<EffectPointModel> f131145a = new ArrayList<>();

    /* renamed from: b */
    private C0198r<VEPreviewParams> f131146b;

    /* renamed from: c */
    private C0198r<VEPreviewMusicParams> f131147c;

    /* renamed from: d */
    private C0198r<C31427a> f131148d;

    /* renamed from: e */
    private C52967f<C53026u> f131149e;

    /* renamed from: f */
    private C0198r<C53030y> f131150f;

    /* renamed from: g */
    private C52970h<C52906ab> f131151g;

    /* renamed from: h */
    private C0198r<VEVolumeChangeOp> f131152h;

    /* renamed from: i */
    private C0198r<C53029x> f131153i;

    /* renamed from: j */
    private C0198r<Boolean> f131154j;

    /* renamed from: k */
    private C0198r<InfoStickerModel> f131155k;

    /* renamed from: l */
    private C0198r<Boolean> f131156l;

    /* renamed from: m */
    private C0198r<C53031z> f131157m;

    /* renamed from: n */
    private C0198r<C52904aa> f131158n;

    /* renamed from: o */
    private C0198r<Boolean> f131159o;

    /* renamed from: p */
    private C0198r<AudioRecorderParam> f131160p;

    /* renamed from: q */
    private C52970h<C52977l> f131161q;

    /* renamed from: r */
    private C0198r<AudioEffectParam> f131162r;

    /* renamed from: s */
    private C0198r<Boolean> f131163s;

    /* renamed from: t */
    private C0198r<Boolean> f131164t;

    /* renamed from: u */
    private C0198r<C43442b> f131165u;

    /* renamed from: v */
    private C0198r<C43954a> f131166v;

    /* renamed from: i */
    public final LiveData<C31427a> mo110464i() {
        m112492v();
        return this.f131148d;
    }

    /* renamed from: j */
    public final C52967f<C53026u> mo110465j() {
        m112493w();
        return this.f131149e;
    }

    /* renamed from: l */
    public final C52970h<C52906ab> mo110467l() {
        m112494x();
        return this.f131151g;
    }

    /* renamed from: m */
    public final C0198r<VEVolumeChangeOp> mo110468m() {
        m112495y();
        return this.f131152h;
    }

    /* renamed from: w */
    private void m112493w() {
        if (this.f131149e == null) {
            this.f131149e = new C52967f<>();
        }
    }

    /* renamed from: x */
    private void m112494x() {
        if (this.f131151g == null) {
            this.f131151g = new C52970h<>();
        }
    }

    /* renamed from: y */
    private void m112495y() {
        if (this.f131152h == null) {
            this.f131152h = new C0198r<>();
        }
    }

    /* renamed from: a */
    public final C0198r<VEPreviewParams> mo110455a() {
        if (this.f131146b == null) {
            this.f131146b = new C0198r<>();
        }
        return this.f131146b;
    }

    /* renamed from: b */
    public final C0198r<AudioRecorderParam> mo110457b() {
        if (this.f131160p == null) {
            this.f131160p = new C0198r<>();
        }
        return this.f131160p;
    }

    /* renamed from: c */
    public final C52970h<C52977l> mo110458c() {
        if (this.f131161q == null) {
            this.f131161q = new C52970h<>();
        }
        return this.f131161q;
    }

    /* renamed from: d */
    public final C0198r<AudioEffectParam> mo110459d() {
        if (this.f131162r == null) {
            this.f131162r = new C0198r<>();
        }
        return this.f131162r;
    }

    /* renamed from: e */
    public final C0198r<VEPreviewMusicParams> mo110460e() {
        if (this.f131147c == null) {
            this.f131147c = new C0198r<>();
        }
        return this.f131147c;
    }

    /* renamed from: f */
    public final C0198r<C53031z> mo110461f() {
        if (this.f131157m == null) {
            this.f131157m = new C0198r<>();
        }
        return this.f131157m;
    }

    /* renamed from: g */
    public final C0198r<C52904aa> mo110462g() {
        if (this.f131158n == null) {
            this.f131158n = new C0198r<>();
        }
        return this.f131158n;
    }

    /* renamed from: h */
    public final C0198r<Boolean> mo110463h() {
        if (this.f131159o == null) {
            this.f131159o = new C0198r<>();
        }
        return this.f131159o;
    }

    /* renamed from: k */
    public final C0198r<C53030y> mo110466k() {
        if (this.f131150f == null) {
            this.f131150f = new C0198r<>();
        }
        return this.f131150f;
    }

    /* renamed from: n */
    public final C0198r<C53029x> mo110469n() {
        if (this.f131153i == null) {
            this.f131153i = new C0198r<>();
        }
        return this.f131153i;
    }

    /* renamed from: o */
    public final C0198r<Boolean> mo110470o() {
        if (this.f131154j == null) {
            this.f131154j = new C0198r<>();
        }
        return this.f131154j;
    }

    /* renamed from: p */
    public final C0198r<InfoStickerModel> mo110471p() {
        if (this.f131155k == null) {
            this.f131155k = new C0198r<>();
        }
        return this.f131155k;
    }

    /* renamed from: q */
    public final C0198r<Boolean> mo110472q() {
        if (this.f131156l == null) {
            this.f131156l = new C0198r<>();
        }
        return this.f131156l;
    }

    /* renamed from: t */
    public final C0198r<C43442b> mo110475t() {
        if (this.f131165u == null) {
            this.f131165u = new C0198r<>();
        }
        return this.f131165u;
    }

    /* renamed from: u */
    public final C0198r<C43954a> mo110476u() {
        if (this.f131166v == null) {
            this.f131166v = new C0198r<>();
        }
        return this.f131166v;
    }

    /* renamed from: r */
    public final C0198r<Boolean> mo110473r() {
        if (this.f131163s == null) {
            this.f131163s = new C0198r<>();
            this.f131163s.setValue(Boolean.valueOf(false));
        }
        return this.f131163s;
    }

    /* renamed from: s */
    public final C0198r<Boolean> mo110474s() {
        if (this.f131164t == null) {
            this.f131164t = new C0198r<>();
            this.f131164t.setValue(Boolean.valueOf(false));
        }
        return this.f131164t;
    }

    /* renamed from: v */
    private void m112492v() {
        if (this.f131148d == null) {
            this.f131148d = new C0198r<>();
            this.f131148d.setValue(new C31427a(true, C39629l.m88232a().mo58584o().mo64333c().mo64348c()));
        }
    }

    /* renamed from: a */
    public final void mo110456a(C31459g gVar, boolean z) {
        m112492v();
        this.f131148d.setValue(new C31427a(z, gVar));
    }
}
