package com.p683ss.android.ugc.aweme.draft.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.effect.EffectListModel;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43895j;
import com.p683ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45623a;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.aweme.sticker.C46071n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.draft.model.c */
public final class C29059c {

    /* renamed from: A */
    public long f76123A;

    /* renamed from: B */
    public int f76124B;

    /* renamed from: C */
    public EffectListModel f76125C;

    /* renamed from: D */
    public long f76126D;

    /* renamed from: E */
    public int f76127E;

    /* renamed from: F */
    public String f76128F;
    @C17952c(mo34828a = "time")

    /* renamed from: G */
    public long f76129G;

    /* renamed from: H */
    public String f76130H;

    /* renamed from: I */
    public int f76131I;

    /* renamed from: J */
    public int f76132J;

    /* renamed from: K */
    public String f76133K;

    /* renamed from: L */
    public String f76134L;

    /* renamed from: M */
    float[] f76135M;

    /* renamed from: N */
    public String f76136N;

    /* renamed from: O */
    public int f76137O;

    /* renamed from: P */
    public float f76138P;

    /* renamed from: Q */
    public String f76139Q;

    /* renamed from: R */
    public String f76140R;

    /* renamed from: S */
    int f76141S;

    /* renamed from: T */
    public C29058b f76142T = new C29058b();
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public int f76143a;
    @C17952c(mo34828a = "aweme")

    /* renamed from: b */
    public C29057a f76144b;
    @C17952c(mo34828a = "photoMovieContext")

    /* renamed from: c */
    public PhotoMovieContext f76145c;

    /* renamed from: d */
    public String f76146d;

    /* renamed from: e */
    public C42482c f76147e;

    /* renamed from: f */
    public String f76148f;

    /* renamed from: g */
    public String f76149g;

    /* renamed from: h */
    public String f76150h;

    /* renamed from: i */
    public int f76151i;

    /* renamed from: j */
    public int f76152j;

    /* renamed from: k */
    public int f76153k;

    /* renamed from: l */
    public int f76154l;

    /* renamed from: m */
    public int f76155m;

    /* renamed from: n */
    public int f76156n;

    /* renamed from: o */
    public String f76157o;

    /* renamed from: p */
    public String f76158p;

    /* renamed from: q */
    public UrlModel f76159q;

    /* renamed from: r */
    public int f76160r;

    /* renamed from: s */
    public String f76161s;

    /* renamed from: t */
    public int f76162t;

    /* renamed from: u */
    public int f76163u;

    /* renamed from: v */
    public int f76164v;

    /* renamed from: w */
    public boolean f76165w;

    /* renamed from: x */
    public boolean f76166x;

    /* renamed from: y */
    public C29060a f76167y = C29060a.all;

    /* renamed from: z */
    public int f76168z = -1;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.c$a */
    public enum C29060a {
        all,
        half,
        none
    }

    /* renamed from: A */
    public final int mo58724A() {
        return this.f76142T.f76101e;
    }

    /* renamed from: B */
    public final boolean mo58725B() {
        return this.f76142T.f76102f;
    }

    /* renamed from: C */
    public final int mo58726C() {
        return this.f76142T.f76104h;
    }

    /* renamed from: D */
    public final int mo58727D() {
        return this.f76142T.f76105i;
    }

    /* renamed from: E */
    public final String mo58728E() {
        return this.f76142T.f76100d;
    }

    /* renamed from: H */
    public final ExtractFramesModel mo58731H() {
        return this.f76142T.f76118v;
    }

    /* renamed from: I */
    public final AVUploadSaveModel mo58732I() {
        return this.f76142T.f76120x;
    }

    /* renamed from: J */
    public final String mo58733J() {
        return this.f76142T.f76117u;
    }

    /* renamed from: K */
    public final String mo58734K() {
        return this.f76142T.f76107k;
    }

    /* renamed from: M */
    public final C43758o mo58736M() {
        return this.f76142T.f76035B;
    }

    /* renamed from: N */
    public final int mo58737N() {
        return this.f76142T.f76036C;
    }

    /* renamed from: O */
    public final List<String> mo58738O() {
        return this.f76142T.f76037D;
    }

    /* renamed from: P */
    public final boolean mo58739P() {
        return this.f76142T.f76038E;
    }

    /* renamed from: Q */
    public final SocialModel mo58740Q() {
        return this.f76142T.f76040G;
    }

    /* renamed from: R */
    public final C23289b mo58741R() {
        return this.f76142T.f76043J;
    }

    /* renamed from: S */
    public final StatusCreateVideoData mo58742S() {
        return this.f76142T.f76044K;
    }

    /* renamed from: Z */
    public final C43895j mo58749Z() {
        return this.f76142T.f76045L;
    }

    /* renamed from: a */
    public final VideoCategoryParam mo58750a() {
        return this.f76142T.f76058Y;
    }

    /* renamed from: aA */
    public final String mo58758aA() {
        return this.f76142T.f76064aD;
    }

    /* renamed from: aB */
    public final StitchParams mo58759aB() {
        return this.f76142T.f76066aF;
    }

    /* renamed from: aC */
    public final boolean mo58760aC() {
        return this.f76142T.f76067aG;
    }

    /* renamed from: aD */
    public final String mo58761aD() {
        return this.f76142T.f76068aH;
    }

    /* renamed from: aE */
    public final ArrayList<GreenScreenImage> mo58762aE() {
        return this.f76142T.f76069aI;
    }

    /* renamed from: aF */
    public final ArrayList<String> mo58763aF() {
        return this.f76142T.f76070aJ;
    }

    /* renamed from: aa */
    public final boolean mo58764aa() {
        return this.f76142T.f76078ag;
    }

    /* renamed from: ab */
    public final boolean mo58765ab() {
        return this.f76142T.f76093av;
    }

    /* renamed from: ac */
    public final String mo58766ac() {
        return this.f76142T.f76087ap;
    }

    /* renamed from: ad */
    public final boolean mo58767ad() {
        return this.f76142T.f76046M;
    }

    /* renamed from: ae */
    public final String mo58768ae() {
        return this.f76142T.f76047N;
    }

    /* renamed from: af */
    public final C29068f mo58769af() {
        return this.f76142T.f76050Q;
    }

    /* renamed from: ah */
    public final AudioRecorderParam mo58771ah() {
        return this.f76142T.f76077af;
    }

    /* renamed from: ai */
    public final String mo58772ai() {
        return this.f76142T.f76059Z;
    }

    /* renamed from: aj */
    public final CommentVideoModel mo58773aj() {
        return this.f76142T.f76097az;
    }

    /* renamed from: al */
    public final boolean mo58775al() {
        return this.f76142T.f76122z;
    }

    /* renamed from: am */
    public final int mo58776am() {
        return this.f76142T.f76034A;
    }

    /* renamed from: an */
    public final MultiEditVideoStatusRecordData mo58777an() {
        return this.f76142T.f76092au;
    }

    /* renamed from: ao */
    public final CutSameEditData mo58778ao() {
        return this.f76142T.f76071aK;
    }

    /* renamed from: ap */
    public final StickerChallenge mo58779ap() {
        return this.f76142T.f76075ad;
    }

    /* renamed from: aq */
    public final float mo58780aq() {
        return this.f76142T.f76086ao;
    }

    /* renamed from: ar */
    public final int mo58781ar() {
        return this.f76142T.f76088aq;
    }

    /* renamed from: as */
    public final String mo58782as() {
        return this.f76142T.f76090as;
    }

    /* renamed from: at */
    public final boolean mo58783at() {
        return this.f76142T.f76091at;
    }

    /* renamed from: au */
    public final C45623a mo58784au() {
        return this.f76142T.f76094aw;
    }

    /* renamed from: av */
    public final String mo58785av() {
        return this.f76142T.f76095ax;
    }

    /* renamed from: aw */
    public final String mo58786aw() {
        return this.f76142T.f76110n;
    }

    /* renamed from: ax */
    public final C46071n mo58787ax() {
        return this.f76142T.f76096ay;
    }

    /* renamed from: ay */
    public final LivePublishModel mo58788ay() {
        return this.f76142T.f76065aE;
    }

    /* renamed from: b */
    public final String mo58790b() {
        return this.f76142T.f76119w;
    }

    /* renamed from: d */
    public final String mo58794d() {
        return this.f76142T.f76079ah;
    }

    /* renamed from: e */
    public final int mo58795e() {
        return this.f76142T.f76051R;
    }

    /* renamed from: f */
    public final int mo58796f() {
        return this.f76142T.f76052S;
    }

    /* renamed from: g */
    public final int mo58797g() {
        return this.f76142T.f76053T;
    }

    /* renamed from: h */
    public final int mo58798h() {
        return this.f76142T.f76054U;
    }

    /* renamed from: l */
    public final C29067e mo58802l() {
        return this.f76142T.f76042I;
    }

    /* renamed from: m */
    public final String mo58803m() {
        return this.f76142T.f76049P;
    }

    /* renamed from: n */
    public final int mo58804n() {
        return this.f76142T.f76039F;
    }

    /* renamed from: o */
    public final String mo58805o() {
        return this.f76142T.f76072aa;
    }

    /* renamed from: p */
    public final int mo58806p() {
        return this.f76142T.f76073ab;
    }

    /* renamed from: q */
    public final ArrayList<BeautyMetadata> mo58807q() {
        return this.f76142T.f76061aA;
    }

    /* renamed from: r */
    public final ArrayList<ImportVideoInfo> mo58808r() {
        return this.f76142T.f76074ac;
    }

    /* renamed from: s */
    public final int mo58809s() {
        return this.f76142T.f76084am;
    }

    /* renamed from: t */
    public final int mo58810t() {
        return this.f76142T.f76085an;
    }

    /* renamed from: u */
    public final Map<String, Object> mo58812u() {
        return this.f76142T.f76076ae;
    }

    /* renamed from: v */
    public final int mo58813v() {
        return this.f76142T.f76098b;
    }

    /* renamed from: w */
    public final int mo58814w() {
        return this.f76142T.f76060a;
    }

    /* renamed from: x */
    public final String mo58815x() {
        return this.f76142T.f76109m;
    }

    /* renamed from: y */
    public final boolean mo58816y() {
        return this.f76142T.f76103g;
    }

    /* renamed from: F */
    public final ReactionParams mo58729F() {
        if (this.f76142T != null) {
            return this.f76142T.f76106j;
        }
        return null;
    }

    /* renamed from: G */
    public final boolean mo58730G() {
        if (this.f76142T != null) {
            return this.f76142T.f76108l;
        }
        return false;
    }

    /* renamed from: L */
    public final InfoStickerModel mo58735L() {
        if (this.f76142T != null) {
            return this.f76142T.f76121y;
        }
        return null;
    }

    /* renamed from: T */
    public final boolean mo58743T() {
        if (mo58741R() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean mo58744U() {
        if (mo58742S() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final String mo58746W() {
        if (mo58741R() == null) {
            return null;
        }
        return mo58741R().videoCoverImgPath;
    }

    /* renamed from: Y */
    public final String mo58748Y() {
        if (mo58777an() == null) {
            return null;
        }
        return mo58777an().coverImagePath;
    }

    /* renamed from: ag */
    public final C29070h mo58770ag() {
        if (this.f76142T != null) {
            return this.f76142T.f76056W;
        }
        return null;
    }

    /* renamed from: az */
    public final boolean mo58789az() {
        if (this.f76142T.f76065aE != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final int mo58799i() {
        if (this.f76142T == null) {
            return 0;
        }
        return this.f76142T.f76055V;
    }

    /* renamed from: j */
    public final boolean mo58800j() {
        if (this.f76142T == null || !this.f76142T.f76089ar) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int mo58801k() {
        return this.f76142T.f76057X.intValue();
    }

    /* renamed from: V */
    public final boolean mo58745V() {
        boolean z;
        if (mo58814w() == 13) {
            z = true;
        } else {
            z = false;
        }
        if (!z && mo58777an() != null && mo58777an().isSupportMultiEdit) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final String mo58747X() {
        if (mo58742S() == null) {
            return null;
        }
        return mo58742S().getVideoCoverImgPath();
    }

    /* renamed from: ak */
    public final String mo58774ak() {
        if (TextUtils.isEmpty(this.f76146d)) {
            this.f76146d = mo58817z();
        }
        return this.f76146d;
    }

    /* renamed from: c */
    public final boolean mo58793c() {
        if (this.f76164v == 0 || this.f76164v == 1 || this.f76164v == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final String mo58817z() {
        String str = this.f76142T.f76099c;
        if (TextUtils.isEmpty(str)) {
            return UUID.randomUUID().toString();
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeDraft{id=");
        sb.append(this.f76143a);
        sb.append(", aweme=");
        sb.append(this.f76144b);
        sb.append(", photoMovieContext=");
        sb.append(this.f76145c);
        sb.append(", musicModel=");
        sb.append(this.f76147e);
        sb.append(", videoPath='");
        sb.append(this.f76148f);
        sb.append('\'');
        sb.append(", musicPath='");
        sb.append(this.f76149g);
        sb.append('\'');
        sb.append(", voicePath='");
        sb.append(this.f76150h);
        sb.append('\'');
        sb.append(", videoVolume=");
        sb.append(this.f76151i);
        sb.append(", musicVolume=");
        sb.append(this.f76152j);
        sb.append(", filter=");
        sb.append(this.f76153k);
        sb.append(", musicStart=");
        sb.append(this.f76154l);
        sb.append(", effect=");
        sb.append(this.f76155m);
        sb.append(", origin=");
        sb.append(this.f76156n);
        sb.append(", mReversePath='");
        sb.append(this.f76157o);
        sb.append('\'');
        sb.append(", videoSpeed='");
        sb.append(this.f76158p);
        sb.append('\'');
        sb.append(", audioTrack=");
        sb.append(this.f76159q);
        sb.append(", fiterLabel='");
        sb.append(this.f76161s);
        sb.append('\'');
        sb.append(", cameraPos=");
        sb.append(this.f76162t);
        sb.append(", useBeauty=");
        sb.append(this.f76163u);
        sb.append(", type=");
        sb.append(this.f76164v);
        sb.append(", isWidthDivider=");
        sb.append(this.f76166x);
        sb.append(", privateVideo=");
        sb.append(this.f76124B);
        sb.append(", mEffectListModel=");
        sb.append(this.f76125C);
        sb.append(", maxDuration=");
        sb.append(this.f76126D);
        sb.append(", faceBeauty=");
        sb.append(this.f76127E);
        sb.append(", userId='");
        sb.append(this.f76128F);
        sb.append('\'');
        sb.append(", time=");
        sb.append(this.f76129G);
        sb.append(", videoSegmentsDesc='");
        sb.append(this.f76130H);
        sb.append('\'');
        sb.append(", hardEncode=");
        sb.append(this.f76131I);
        sb.append(", specialPoints=");
        sb.append(this.f76132J);
        sb.append(", stickerPath='");
        sb.append(this.f76133K);
        sb.append('\'');
        sb.append(", stickerID='");
        sb.append(this.f76134L);
        sb.append('\'');
        sb.append(", volumeTaps=");
        sb.append(Arrays.toString(this.f76135M));
        sb.append(", musicEffectSegments='");
        sb.append(this.f76136N);
        sb.append('\'');
        sb.append(", newVersion=");
        sb.append(this.f76137O);
        sb.append(", customCoverStart=");
        sb.append(this.f76138P);
        sb.append(", duetFrom='");
        sb.append(this.f76139Q);
        sb.append('\'');
        sb.append(", syncPlatforms='");
        sb.append(this.f76140R);
        sb.append('\'');
        sb.append(", from='");
        sb.append(this.f76141S);
        sb.append('\'');
        sb.append(", extras=");
        sb.append(this.f76142T);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C29059c mo58751a(float f) {
        this.f76138P = f;
        return this;
    }

    /* renamed from: a */
    public final C29059c mo58752a(int i) {
        this.f76137O = i;
        return this;
    }

    /* renamed from: b */
    public final void mo58791b(int i) {
        this.f76142T.f76101e = i;
    }

    /* renamed from: a */
    public final void mo58753a(EditPreviewInfo editPreviewInfo) {
        this.f76142T.f76082ak = editPreviewInfo;
    }

    /* renamed from: b */
    public final void mo58792b(String str) {
        this.f76142T.f76059Z = str;
    }

    /* renamed from: a */
    public final void mo58754a(AVUploadSaveModel aVUploadSaveModel) {
        this.f76142T.f76120x = aVUploadSaveModel;
    }

    /* renamed from: a */
    public final void mo58755a(String str) {
        this.f76142T.f76117u = str;
    }

    /* renamed from: a */
    public final void mo58756a(List<EditVideoSegment> list) {
        this.f76142T.f76083al = list;
    }

    /* renamed from: a */
    public final void mo58757a(Map<String, Object> map) {
        this.f76142T.f76076ae = map;
    }
}
