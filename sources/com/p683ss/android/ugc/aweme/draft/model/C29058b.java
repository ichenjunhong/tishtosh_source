package com.p683ss.android.ugc.aweme.draft.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
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
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.b */
public final class C29058b {
    @C17952c(mo34828a = "autoEnhanceType")

    /* renamed from: A */
    public int f76034A;
    @C17952c(mo34828a = "micro_app_info")

    /* renamed from: B */
    public C43758o f76035B;
    @C17952c(mo34828a = "video_type")

    /* renamed from: C */
    public int f76036C;
    @C17952c(mo34828a = "texts")

    /* renamed from: D */
    public List<String> f76037D;
    @C17952c(mo34828a = "usePaint")

    /* renamed from: E */
    public boolean f76038E;
    @C17952c(mo34828a = "commentSetting")

    /* renamed from: F */
    public int f76039F;

    /* renamed from: G */
    public SocialModel f76040G;
    @C17952c(mo34828a = "firstStickerMusicIds")

    /* renamed from: H */
    public String f76041H;

    /* renamed from: I */
    public C29067e f76042I;
    @C17952c(mo34828a = "mv_theme_create_video")

    /* renamed from: J */
    public C23289b f76043J;
    @C17952c(mo34828a = "status_create_video")

    /* renamed from: K */
    public StatusCreateVideoData f76044K;
    @C17952c(mo34828a = "av_upload_misc_struct")

    /* renamed from: L */
    public C43895j f76045L;
    @C17952c(mo34828a = "is_fast_import")

    /* renamed from: M */
    public boolean f76046M;
    @C17952c(mo34828a = "fast_import_resolution")

    /* renamed from: N */
    public String f76047N;
    @C17952c(mo34828a = "draft_video_path")

    /* renamed from: O */
    public String f76048O;
    @C17952c(mo34828a = "videoCoverPath")

    /* renamed from: P */
    public String f76049P;
    @C17952c(mo34828a = "cher_effect_param")

    /* renamed from: Q */
    public C29068f f76050Q;
    @C17952c(mo34828a = "videoOutWidth")

    /* renamed from: R */
    public int f76051R;
    @C17952c(mo34828a = "videoOutHeight")

    /* renamed from: S */
    public int f76052S;
    @C17952c(mo34828a = "videoCanvasWidth")

    /* renamed from: T */
    public int f76053T;
    @C17952c(mo34828a = "videoCanvasHeight")

    /* renamed from: U */
    public int f76054U;

    /* renamed from: V */
    public int f76055V;
    @C17952c(mo34828a = "draft_ve_audio_effect_param")

    /* renamed from: W */
    public C29070h f76056W;
    @C17952c(mo34828a = "draft_time_effect_start_point")

    /* renamed from: X */
    public Integer f76057X;
    @C17952c(mo34828a = "video_category")

    /* renamed from: Y */
    public VideoCategoryParam f76058Y;
    @C17952c(mo34828a = "filter_local_path")

    /* renamed from: Z */
    public String f76059Z;
    @C17952c(mo34828a = "shootMode")

    /* renamed from: a */
    public int f76060a;
    @C17952c(mo34828a = "beauty_metadata")

    /* renamed from: aA */
    public ArrayList<BeautyMetadata> f76061aA;
    @C17952c(mo34828a = "update_info_stickers")

    /* renamed from: aB */
    public boolean f76062aB;
    @C17952c(mo34828a = "stick_point_type")

    /* renamed from: aC */
    public int f76063aC;
    @C17952c(mo34828a = "duet_layout")

    /* renamed from: aD */
    public String f76064aD;
    @C17952c(mo34828a = "live_publish_model")

    /* renamed from: aE */
    public LivePublishModel f76065aE;
    @C17952c(mo34828a = "stitch_params")

    /* renamed from: aF */
    public StitchParams f76066aF;
    @C17952c(mo34828a = "is_commerce_music")

    /* renamed from: aG */
    public boolean f76067aG;
    @C17952c(mo34828a = "green_screen_default_image")

    /* renamed from: aH */
    public String f76068aH;
    @C17952c(mo34828a = "green_screen_image_list")

    /* renamed from: aI */
    public ArrayList<GreenScreenImage> f76069aI;
    @C17952c(mo34828a = "camera_lens_info")

    /* renamed from: aJ */
    public ArrayList<String> f76070aJ;
    @C17952c(mo34828a = "cutsame_data")

    /* renamed from: aK */
    public CutSameEditData f76071aK;
    @C17952c(mo34828a = "camera_ids")

    /* renamed from: aa */
    public String f76072aa;
    @C17952c(mo34828a = "beauty_type")

    /* renamed from: ab */
    public int f76073ab;
    @C17952c(mo34828a = "import_video_infos")

    /* renamed from: ac */
    public ArrayList<ImportVideoInfo> f76074ac;
    @C17952c(mo34828a = "sticker_challenge")

    /* renamed from: ad */
    public StickerChallenge f76075ad;
    @C17952c(mo34828a = "video_part_metadata")

    /* renamed from: ae */
    public Map<String, ? extends Object> f76076ae;
    @C17952c(mo34828a = "audio_recorder_param")

    /* renamed from: af */
    public AudioRecorderParam f76077af;
    @C17952c(mo34828a = "is_stickpoint_mode")

    /* renamed from: ag */
    public boolean f76078ag;
    @C17952c(mo34828a = "upload_path")

    /* renamed from: ah */
    public String f76079ah;
    @C17952c(mo34828a = "draft_preview_configure")

    /* renamed from: ai */
    public C29069g f76080ai;
    @C17952c(mo34828a = "video_segments_copy")

    /* renamed from: aj */
    public List<DraftVideoSegment> f76081aj;
    @C17952c(mo34828a = "preview_info")

    /* renamed from: ak */
    public EditPreviewInfo f76082ak;
    @C17952c(mo34828a = "preview_video_list_copy")

    /* renamed from: al */
    public List<? extends EditVideoSegment> f76083al;
    @C17952c(mo34828a = "videoCount")

    /* renamed from: am */
    public int f76084am;
    @C17952c(mo34828a = "photoCount")

    /* renamed from: an */
    public int f76085an;
    @C17952c(mo34828a = "filter_intensity")

    /* renamed from: ao */
    public float f76086ao;
    @C17952c(mo34828a = "pic2VideoSource")

    /* renamed from: ap */
    public String f76087ap;
    @C17952c(mo34828a = "downloadSetting")

    /* renamed from: aq */
    public int f76088aq;
    @C17952c(mo34828a = "useMusicBeforeEdit")

    /* renamed from: ar */
    public boolean f76089ar;
    @C17952c(mo34828a = "review_video_id")

    /* renamed from: as */
    public String f76090as;
    @C17952c(mo34828a = "support_retake")

    /* renamed from: at */
    public boolean f76091at;
    @C17952c(mo34828a = "multi_edit_video_data")

    /* renamed from: au */
    public MultiEditVideoStatusRecordData f76092au;
    @C17952c(mo34828a = "containBackgroundVideo")

    /* renamed from: av */
    public boolean f76093av;
    @C17952c(mo34828a = "stick_point_data")

    /* renamed from: aw */
    public C45623a f76094aw;
    @C17952c(mo34828a = "backGroundVideoDraftDir")

    /* renamed from: ax */
    public String f76095ax;
    @C17952c(mo34828a = "sticker_info")

    /* renamed from: ay */
    public C46071n f76096ay;
    @C17952c(mo34828a = "comment_sticker_model")

    /* renamed from: az */
    public CommentVideoModel f76097az;
    @C17952c(mo34828a = "from")

    /* renamed from: b */
    public int f76098b;
    @C17952c(mo34828a = "creationId")

    /* renamed from: c */
    public String f76099c;
    @C17952c(mo34828a = "shootWay")

    /* renamed from: d */
    public String f76100d;
    @C17952c(mo34828a = "draftId")

    /* renamed from: e */
    public int f76101e;
    @C17952c(mo34828a = "isMultiVideo")

    /* renamed from: f */
    public boolean f76102f;
    @C17952c(mo34828a = "durationMode")

    /* renamed from: g */
    public boolean f76103g;
    @C17952c(mo34828a = "recordMode")

    /* renamed from: h */
    public int f76104h;
    @C17952c(mo34828a = "gameScore")

    /* renamed from: i */
    public int f76105i;
    @C17952c(mo34828a = "reactionParams")

    /* renamed from: j */
    public ReactionParams f76106j;
    @C17952c(mo34828a = "microAppId")

    /* renamed from: k */
    public String f76107k;
    @C17952c(mo34828a = "isMuted")

    /* renamed from: l */
    public boolean f76108l;
    @C17952c(mo34828a = "musicOrigin")

    /* renamed from: m */
    public String f76109m;
    @C17952c(mo34828a = "mainBusinessData")

    /* renamed from: n */
    public String f76110n;
    @C17952c(mo34828a = "socialData")

    /* renamed from: o */
    public String f76111o;
    @C17952c(mo34828a = "poiData")

    /* renamed from: p */
    public String f76112p;
    @C17952c(mo34828a = "commerceData")

    /* renamed from: q */
    public String f76113q;
    @C17952c(mo34828a = "ugData")

    /* renamed from: r */
    public String f76114r;
    @C17952c(mo34828a = "techData")

    /* renamed from: s */
    public String f76115s;
    @C17952c(mo34828a = "globalData")

    /* renamed from: t */
    public String f76116t;
    @C17952c(mo34828a = "poiId")

    /* renamed from: u */
    public String f76117u;
    @C17952c(mo34828a = "extractFramesModel")

    /* renamed from: v */
    public ExtractFramesModel f76118v;
    @C17952c(mo34828a = "filterId")

    /* renamed from: w */
    public String f76119w;
    @C17952c(mo34828a = "uploadSaveModel")

    /* renamed from: x */
    public AVUploadSaveModel f76120x;
    @C17952c(mo34828a = "infoStickerModel")

    /* renamed from: y */
    public InfoStickerModel f76121y;
    @C17952c(mo34828a = "autoEnhanceOn")

    /* renamed from: z */
    public boolean f76122z;

    public C29058b() {
        this(0, 0, null, null, 0, false, false, 0, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, false, null, null, null, null, null, 0, 0, 0.0f, null, 0, false, null, false, null, false, null, null, null, null, null, false, 0, null, null, null, false, null, null, null, null, -1, -1, 33554431, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29058b) {
                C29058b bVar = (C29058b) obj;
                if (this.f76060a == bVar.f76060a) {
                    if ((this.f76098b == bVar.f76098b) && C52711k.m112239a((Object) this.f76099c, (Object) bVar.f76099c) && C52711k.m112239a((Object) this.f76100d, (Object) bVar.f76100d)) {
                        if (this.f76101e == bVar.f76101e) {
                            if (this.f76102f == bVar.f76102f) {
                                if (this.f76103g == bVar.f76103g) {
                                    if (this.f76104h == bVar.f76104h) {
                                        if ((this.f76105i == bVar.f76105i) && C52711k.m112239a((Object) this.f76106j, (Object) bVar.f76106j) && C52711k.m112239a((Object) this.f76107k, (Object) bVar.f76107k)) {
                                            if ((this.f76108l == bVar.f76108l) && C52711k.m112239a((Object) this.f76109m, (Object) bVar.f76109m) && C52711k.m112239a((Object) this.f76110n, (Object) bVar.f76110n) && C52711k.m112239a((Object) this.f76111o, (Object) bVar.f76111o) && C52711k.m112239a((Object) this.f76112p, (Object) bVar.f76112p) && C52711k.m112239a((Object) this.f76113q, (Object) bVar.f76113q) && C52711k.m112239a((Object) this.f76114r, (Object) bVar.f76114r) && C52711k.m112239a((Object) this.f76115s, (Object) bVar.f76115s) && C52711k.m112239a((Object) this.f76116t, (Object) bVar.f76116t) && C52711k.m112239a((Object) this.f76117u, (Object) bVar.f76117u) && C52711k.m112239a((Object) this.f76118v, (Object) bVar.f76118v) && C52711k.m112239a((Object) this.f76119w, (Object) bVar.f76119w) && C52711k.m112239a((Object) this.f76120x, (Object) bVar.f76120x) && C52711k.m112239a((Object) this.f76121y, (Object) bVar.f76121y)) {
                                                if (this.f76122z == bVar.f76122z) {
                                                    if ((this.f76034A == bVar.f76034A) && C52711k.m112239a((Object) this.f76035B, (Object) bVar.f76035B)) {
                                                        if ((this.f76036C == bVar.f76036C) && C52711k.m112239a((Object) this.f76037D, (Object) bVar.f76037D)) {
                                                            if (this.f76038E == bVar.f76038E) {
                                                                if ((this.f76039F == bVar.f76039F) && C52711k.m112239a((Object) this.f76040G, (Object) bVar.f76040G) && C52711k.m112239a((Object) this.f76041H, (Object) bVar.f76041H) && C52711k.m112239a((Object) this.f76042I, (Object) bVar.f76042I) && C52711k.m112239a((Object) this.f76043J, (Object) bVar.f76043J) && C52711k.m112239a((Object) this.f76044K, (Object) bVar.f76044K) && C52711k.m112239a((Object) this.f76045L, (Object) bVar.f76045L)) {
                                                                    if ((this.f76046M == bVar.f76046M) && C52711k.m112239a((Object) this.f76047N, (Object) bVar.f76047N) && C52711k.m112239a((Object) this.f76048O, (Object) bVar.f76048O) && C52711k.m112239a((Object) this.f76049P, (Object) bVar.f76049P) && C52711k.m112239a((Object) this.f76050Q, (Object) bVar.f76050Q)) {
                                                                        if (this.f76051R == bVar.f76051R) {
                                                                            if (this.f76052S == bVar.f76052S) {
                                                                                if (this.f76053T == bVar.f76053T) {
                                                                                    if (this.f76054U == bVar.f76054U) {
                                                                                        if ((this.f76055V == bVar.f76055V) && C52711k.m112239a((Object) this.f76056W, (Object) bVar.f76056W) && C52711k.m112239a((Object) this.f76057X, (Object) bVar.f76057X) && C52711k.m112239a((Object) this.f76058Y, (Object) bVar.f76058Y) && C52711k.m112239a((Object) this.f76059Z, (Object) bVar.f76059Z) && C52711k.m112239a((Object) this.f76072aa, (Object) bVar.f76072aa)) {
                                                                                            if ((this.f76073ab == bVar.f76073ab) && C52711k.m112239a((Object) this.f76074ac, (Object) bVar.f76074ac) && C52711k.m112239a((Object) this.f76075ad, (Object) bVar.f76075ad) && C52711k.m112239a((Object) this.f76076ae, (Object) bVar.f76076ae) && C52711k.m112239a((Object) this.f76077af, (Object) bVar.f76077af)) {
                                                                                                if ((this.f76078ag == bVar.f76078ag) && C52711k.m112239a((Object) this.f76079ah, (Object) bVar.f76079ah) && C52711k.m112239a((Object) this.f76080ai, (Object) bVar.f76080ai) && C52711k.m112239a((Object) this.f76081aj, (Object) bVar.f76081aj) && C52711k.m112239a((Object) this.f76082ak, (Object) bVar.f76082ak) && C52711k.m112239a((Object) this.f76083al, (Object) bVar.f76083al)) {
                                                                                                    if (this.f76084am == bVar.f76084am) {
                                                                                                        if ((this.f76085an == bVar.f76085an) && Float.compare(this.f76086ao, bVar.f76086ao) == 0 && C52711k.m112239a((Object) this.f76087ap, (Object) bVar.f76087ap)) {
                                                                                                            if (this.f76088aq == bVar.f76088aq) {
                                                                                                                if ((this.f76089ar == bVar.f76089ar) && C52711k.m112239a((Object) this.f76090as, (Object) bVar.f76090as)) {
                                                                                                                    if ((this.f76091at == bVar.f76091at) && C52711k.m112239a((Object) this.f76092au, (Object) bVar.f76092au)) {
                                                                                                                        if ((this.f76093av == bVar.f76093av) && C52711k.m112239a((Object) this.f76094aw, (Object) bVar.f76094aw) && C52711k.m112239a((Object) this.f76095ax, (Object) bVar.f76095ax) && C52711k.m112239a((Object) this.f76096ay, (Object) bVar.f76096ay) && C52711k.m112239a((Object) this.f76097az, (Object) bVar.f76097az) && C52711k.m112239a((Object) this.f76061aA, (Object) bVar.f76061aA)) {
                                                                                                                            if (this.f76062aB == bVar.f76062aB) {
                                                                                                                                if ((this.f76063aC == bVar.f76063aC) && C52711k.m112239a((Object) this.f76064aD, (Object) bVar.f76064aD) && C52711k.m112239a((Object) this.f76065aE, (Object) bVar.f76065aE) && C52711k.m112239a((Object) this.f76066aF, (Object) bVar.f76066aF)) {
                                                                                                                                    if (!(this.f76067aG == bVar.f76067aG) || !C52711k.m112239a((Object) this.f76068aH, (Object) bVar.f76068aH) || !C52711k.m112239a((Object) this.f76069aI, (Object) bVar.f76069aI) || !C52711k.m112239a((Object) this.f76070aJ, (Object) bVar.f76070aJ) || !C52711k.m112239a((Object) this.f76071aK, (Object) bVar.f76071aK)) {
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f76060a * 31) + this.f76098b) * 31;
        String str = this.f76099c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76100d;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f76101e) * 31;
        boolean z = this.f76102f;
        if (z) {
            z = true;
        }
        int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f76103g;
        if (z2) {
            z2 = true;
        }
        int i4 = (((((i3 + (z2 ? 1 : 0)) * 31) + this.f76104h) * 31) + this.f76105i) * 31;
        ReactionParams reactionParams = this.f76106j;
        int hashCode3 = (i4 + (reactionParams != null ? reactionParams.hashCode() : 0)) * 31;
        String str3 = this.f76107k;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z3 = this.f76108l;
        if (z3) {
            z3 = true;
        }
        int i5 = (hashCode4 + (z3 ? 1 : 0)) * 31;
        String str4 = this.f76109m;
        int hashCode5 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f76110n;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f76111o;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f76112p;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f76113q;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f76114r;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f76115s;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f76116t;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f76117u;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        ExtractFramesModel extractFramesModel = this.f76118v;
        int hashCode14 = (hashCode13 + (extractFramesModel != null ? extractFramesModel.hashCode() : 0)) * 31;
        String str13 = this.f76119w;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.f76120x;
        int hashCode16 = (hashCode15 + (aVUploadSaveModel != null ? aVUploadSaveModel.hashCode() : 0)) * 31;
        InfoStickerModel infoStickerModel = this.f76121y;
        int hashCode17 = (hashCode16 + (infoStickerModel != null ? infoStickerModel.hashCode() : 0)) * 31;
        boolean z4 = this.f76122z;
        if (z4) {
            z4 = true;
        }
        int i6 = (((hashCode17 + (z4 ? 1 : 0)) * 31) + this.f76034A) * 31;
        C43758o oVar = this.f76035B;
        int hashCode18 = (((i6 + (oVar != null ? oVar.hashCode() : 0)) * 31) + this.f76036C) * 31;
        List<String> list = this.f76037D;
        int hashCode19 = (hashCode18 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z5 = this.f76038E;
        if (z5) {
            z5 = true;
        }
        int i7 = (((hashCode19 + (z5 ? 1 : 0)) * 31) + this.f76039F) * 31;
        SocialModel socialModel = this.f76040G;
        int hashCode20 = (i7 + (socialModel != null ? socialModel.hashCode() : 0)) * 31;
        String str14 = this.f76041H;
        int hashCode21 = (hashCode20 + (str14 != null ? str14.hashCode() : 0)) * 31;
        C29067e eVar = this.f76042I;
        int hashCode22 = (hashCode21 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C23289b bVar = this.f76043J;
        int hashCode23 = (hashCode22 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        StatusCreateVideoData statusCreateVideoData = this.f76044K;
        int hashCode24 = (hashCode23 + (statusCreateVideoData != null ? statusCreateVideoData.hashCode() : 0)) * 31;
        C43895j jVar = this.f76045L;
        int hashCode25 = (hashCode24 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        boolean z6 = this.f76046M;
        if (z6) {
            z6 = true;
        }
        int i8 = (hashCode25 + (z6 ? 1 : 0)) * 31;
        String str15 = this.f76047N;
        int hashCode26 = (i8 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f76048O;
        int hashCode27 = (hashCode26 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f76049P;
        int hashCode28 = (hashCode27 + (str17 != null ? str17.hashCode() : 0)) * 31;
        C29068f fVar = this.f76050Q;
        int hashCode29 = (((((((((((hashCode28 + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.f76051R) * 31) + this.f76052S) * 31) + this.f76053T) * 31) + this.f76054U) * 31) + this.f76055V) * 31;
        C29070h hVar = this.f76056W;
        int hashCode30 = (hashCode29 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Integer num = this.f76057X;
        int hashCode31 = (hashCode30 + (num != null ? num.hashCode() : 0)) * 31;
        VideoCategoryParam videoCategoryParam = this.f76058Y;
        int hashCode32 = (hashCode31 + (videoCategoryParam != null ? videoCategoryParam.hashCode() : 0)) * 31;
        String str18 = this.f76059Z;
        int hashCode33 = (hashCode32 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.f76072aa;
        int hashCode34 = (((hashCode33 + (str19 != null ? str19.hashCode() : 0)) * 31) + this.f76073ab) * 31;
        ArrayList<ImportVideoInfo> arrayList = this.f76074ac;
        int hashCode35 = (hashCode34 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        StickerChallenge stickerChallenge = this.f76075ad;
        int hashCode36 = (hashCode35 + (stickerChallenge != null ? stickerChallenge.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.f76076ae;
        int hashCode37 = (hashCode36 + (map != null ? map.hashCode() : 0)) * 31;
        AudioRecorderParam audioRecorderParam = this.f76077af;
        int hashCode38 = (hashCode37 + (audioRecorderParam != null ? audioRecorderParam.hashCode() : 0)) * 31;
        boolean z7 = this.f76078ag;
        if (z7) {
            z7 = true;
        }
        int i9 = (hashCode38 + (z7 ? 1 : 0)) * 31;
        String str20 = this.f76079ah;
        int hashCode39 = (i9 + (str20 != null ? str20.hashCode() : 0)) * 31;
        C29069g gVar = this.f76080ai;
        int hashCode40 = (hashCode39 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        List<DraftVideoSegment> list2 = this.f76081aj;
        int hashCode41 = (hashCode40 + (list2 != null ? list2.hashCode() : 0)) * 31;
        EditPreviewInfo editPreviewInfo = this.f76082ak;
        int hashCode42 = (hashCode41 + (editPreviewInfo != null ? editPreviewInfo.hashCode() : 0)) * 31;
        List<? extends EditVideoSegment> list3 = this.f76083al;
        int hashCode43 = (((((((hashCode42 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.f76084am) * 31) + this.f76085an) * 31) + Float.floatToIntBits(this.f76086ao)) * 31;
        String str21 = this.f76087ap;
        int hashCode44 = (((hashCode43 + (str21 != null ? str21.hashCode() : 0)) * 31) + this.f76088aq) * 31;
        boolean z8 = this.f76089ar;
        if (z8) {
            z8 = true;
        }
        int i10 = (hashCode44 + (z8 ? 1 : 0)) * 31;
        String str22 = this.f76090as;
        int hashCode45 = (i10 + (str22 != null ? str22.hashCode() : 0)) * 31;
        boolean z9 = this.f76091at;
        if (z9) {
            z9 = true;
        }
        int i11 = (hashCode45 + (z9 ? 1 : 0)) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f76092au;
        int hashCode46 = (i11 + (multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.hashCode() : 0)) * 31;
        boolean z10 = this.f76093av;
        if (z10) {
            z10 = true;
        }
        int i12 = (hashCode46 + (z10 ? 1 : 0)) * 31;
        C45623a aVar = this.f76094aw;
        int hashCode47 = (i12 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str23 = this.f76095ax;
        int hashCode48 = (hashCode47 + (str23 != null ? str23.hashCode() : 0)) * 31;
        C46071n nVar = this.f76096ay;
        int hashCode49 = (hashCode48 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        CommentVideoModel commentVideoModel = this.f76097az;
        int hashCode50 = (hashCode49 + (commentVideoModel != null ? commentVideoModel.hashCode() : 0)) * 31;
        ArrayList<BeautyMetadata> arrayList2 = this.f76061aA;
        int hashCode51 = (hashCode50 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        boolean z11 = this.f76062aB;
        if (z11) {
            z11 = true;
        }
        int i13 = (((hashCode51 + (z11 ? 1 : 0)) * 31) + this.f76063aC) * 31;
        String str24 = this.f76064aD;
        int hashCode52 = (i13 + (str24 != null ? str24.hashCode() : 0)) * 31;
        LivePublishModel livePublishModel = this.f76065aE;
        int hashCode53 = (hashCode52 + (livePublishModel != null ? livePublishModel.hashCode() : 0)) * 31;
        StitchParams stitchParams = this.f76066aF;
        int hashCode54 = (hashCode53 + (stitchParams != null ? stitchParams.hashCode() : 0)) * 31;
        boolean z12 = this.f76067aG;
        if (z12) {
            z12 = true;
        }
        int i14 = (hashCode54 + (z12 ? 1 : 0)) * 31;
        String str25 = this.f76068aH;
        int hashCode55 = (i14 + (str25 != null ? str25.hashCode() : 0)) * 31;
        ArrayList<GreenScreenImage> arrayList3 = this.f76069aI;
        int hashCode56 = (hashCode55 + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31;
        ArrayList<String> arrayList4 = this.f76070aJ;
        int hashCode57 = (hashCode56 + (arrayList4 != null ? arrayList4.hashCode() : 0)) * 31;
        CutSameEditData cutSameEditData = this.f76071aK;
        if (cutSameEditData != null) {
            i2 = cutSameEditData.hashCode();
        }
        return hashCode57 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AVDraftExtras(shootMode=");
        sb.append(this.f76060a);
        sb.append(", from=");
        sb.append(this.f76098b);
        sb.append(", creationId=");
        sb.append(this.f76099c);
        sb.append(", shootWay=");
        sb.append(this.f76100d);
        sb.append(", draftId=");
        sb.append(this.f76101e);
        sb.append(", isMultiVideo=");
        sb.append(this.f76102f);
        sb.append(", durationMode=");
        sb.append(this.f76103g);
        sb.append(", recordMode=");
        sb.append(this.f76104h);
        sb.append(", gameScore=");
        sb.append(this.f76105i);
        sb.append(", reactionParams=");
        sb.append(this.f76106j);
        sb.append(", microAppId=");
        sb.append(this.f76107k);
        sb.append(", isMuted=");
        sb.append(this.f76108l);
        sb.append(", musicOrigin=");
        sb.append(this.f76109m);
        sb.append(", mainBusinessData=");
        sb.append(this.f76110n);
        sb.append(", socialData=");
        sb.append(this.f76111o);
        sb.append(", poiData=");
        sb.append(this.f76112p);
        sb.append(", commerceData=");
        sb.append(this.f76113q);
        sb.append(", ugData=");
        sb.append(this.f76114r);
        sb.append(", techData=");
        sb.append(this.f76115s);
        sb.append(", globalData=");
        sb.append(this.f76116t);
        sb.append(", poiId=");
        sb.append(this.f76117u);
        sb.append(", extractFramesModel=");
        sb.append(this.f76118v);
        sb.append(", filterId=");
        sb.append(this.f76119w);
        sb.append(", uploadSaveModel=");
        sb.append(this.f76120x);
        sb.append(", infoStickerModel=");
        sb.append(this.f76121y);
        sb.append(", autoEnhanceOn=");
        sb.append(this.f76122z);
        sb.append(", autoEnhanceType=");
        sb.append(this.f76034A);
        sb.append(", microAppInfo=");
        sb.append(this.f76035B);
        sb.append(", videoType=");
        sb.append(this.f76036C);
        sb.append(", texts=");
        sb.append(this.f76037D);
        sb.append(", usePaint=");
        sb.append(this.f76038E);
        sb.append(", commentSetting=");
        sb.append(this.f76039F);
        sb.append(", socialModel=");
        sb.append(this.f76040G);
        sb.append(", firstStickerMusicIds=");
        sb.append(this.f76041H);
        sb.append(", defaultSelectStickerPoi=");
        sb.append(this.f76042I);
        sb.append(", mvCreateVideoData=");
        sb.append(this.f76043J);
        sb.append(", statusCreateVideoData=");
        sb.append(this.f76044K);
        sb.append(", avUploadMiscInfoStruct=");
        sb.append(this.f76045L);
        sb.append(", isFastImport=");
        sb.append(this.f76046M);
        sb.append(", fastImportResolution=");
        sb.append(this.f76047N);
        sb.append(", draftVideoPath=");
        sb.append(this.f76048O);
        sb.append(", videoCoverPath=");
        sb.append(this.f76049P);
        sb.append(", draftCherEffectParam=");
        sb.append(this.f76050Q);
        sb.append(", videoOutWidth=");
        sb.append(this.f76051R);
        sb.append(", videoOutHeight=");
        sb.append(this.f76052S);
        sb.append(", videoCanvasWidth=");
        sb.append(this.f76053T);
        sb.append(", videoCanvasHeight=");
        sb.append(this.f76054U);
        sb.append(", musicEnd=");
        sb.append(this.f76055V);
        sb.append(", draftVEAudioEffectParam=");
        sb.append(this.f76056W);
        sb.append(", timeEffectStartPoint=");
        sb.append(this.f76057X);
        sb.append(", videoCategory=");
        sb.append(this.f76058Y);
        sb.append(", filterLocalPath=");
        sb.append(this.f76059Z);
        sb.append(", cameraIds=");
        sb.append(this.f76072aa);
        sb.append(", beautyType=");
        sb.append(this.f76073ab);
        sb.append(", importVideoInfos=");
        sb.append(this.f76074ac);
        sb.append(", stickerChallenge=");
        sb.append(this.f76075ad);
        sb.append(", videoPartMetadata=");
        sb.append(this.f76076ae);
        sb.append(", audioRecorderParam=");
        sb.append(this.f76077af);
        sb.append(", isStickPointMode=");
        sb.append(this.f76078ag);
        sb.append(", uploadPath=");
        sb.append(this.f76079ah);
        sb.append(", previewConfigure=");
        sb.append(this.f76080ai);
        sb.append(", videoSegmentsCopy=");
        sb.append(this.f76081aj);
        sb.append(", previewInfo=");
        sb.append(this.f76082ak);
        sb.append(", previewVideoListCopy=");
        sb.append(this.f76083al);
        sb.append(", videoCount=");
        sb.append(this.f76084am);
        sb.append(", photoCount=");
        sb.append(this.f76085an);
        sb.append(", filterIntensity=");
        sb.append(this.f76086ao);
        sb.append(", pic2VideoSource=");
        sb.append(this.f76087ap);
        sb.append(", downloadSetting=");
        sb.append(this.f76088aq);
        sb.append(", useMusicBeforeEdit=");
        sb.append(this.f76089ar);
        sb.append(", reviewVideoId=");
        sb.append(this.f76090as);
        sb.append(", supportRetake=");
        sb.append(this.f76091at);
        sb.append(", multiEditVideoData=");
        sb.append(this.f76092au);
        sb.append(", containBackgroundVideo=");
        sb.append(this.f76093av);
        sb.append(", stickPointData=");
        sb.append(this.f76094aw);
        sb.append(", backgroundVideoDraftDir=");
        sb.append(this.f76095ax);
        sb.append(", stickerInfo=");
        sb.append(this.f76096ay);
        sb.append(", commentVideoModel=");
        sb.append(this.f76097az);
        sb.append(", beautyMetadata=");
        sb.append(this.f76061aA);
        sb.append(", isUpdateInfoStickers=");
        sb.append(this.f76062aB);
        sb.append(", stickPointType=");
        sb.append(this.f76063aC);
        sb.append(", duetLayout=");
        sb.append(this.f76064aD);
        sb.append(", livePublishModel=");
        sb.append(this.f76065aE);
        sb.append(", stitchParams=");
        sb.append(this.f76066aF);
        sb.append(", commerceMusic=");
        sb.append(this.f76067aG);
        sb.append(", greenScreenDefaultImage=");
        sb.append(this.f76068aH);
        sb.append(", greenScreenImages=");
        sb.append(this.f76069aI);
        sb.append(", cameraLensInfo=");
        sb.append(this.f76070aJ);
        sb.append(", cutSameData=");
        sb.append(this.f76071aK);
        sb.append(")");
        return sb.toString();
    }

    private C29058b(int i, int i2, String str, String str2, int i3, boolean z, boolean z2, int i4, int i5, ReactionParams reactionParams, String str3, boolean z3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ExtractFramesModel extractFramesModel, String str13, AVUploadSaveModel aVUploadSaveModel, InfoStickerModel infoStickerModel, boolean z4, int i6, C43758o oVar, int i7, List<String> list, boolean z5, int i8, SocialModel socialModel, String str14, C29067e eVar, C23289b bVar, StatusCreateVideoData statusCreateVideoData, C43895j jVar, boolean z6, String str15, String str16, String str17, C29068f fVar, int i9, int i10, int i11, int i12, int i13, C29070h hVar, Integer num, VideoCategoryParam videoCategoryParam, String str18, String str19, int i14, ArrayList<ImportVideoInfo> arrayList, StickerChallenge stickerChallenge, Map<String, ? extends Object> map, AudioRecorderParam audioRecorderParam, boolean z7, String str20, C29069g gVar, List<DraftVideoSegment> list2, EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list3, int i15, int i16, float f, String str21, int i17, boolean z8, String str22, boolean z9, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z10, C45623a aVar, String str23, C46071n nVar, CommentVideoModel commentVideoModel, ArrayList<BeautyMetadata> arrayList2, boolean z11, int i18, String str24, LivePublishModel livePublishModel, StitchParams stitchParams, boolean z12, String str25, ArrayList<GreenScreenImage> arrayList3, ArrayList<String> arrayList4, CutSameEditData cutSameEditData) {
        String str26 = str21;
        C52711k.m112240b(str26, "pic2VideoSource");
        this.f76060a = i;
        this.f76098b = i2;
        this.f76099c = str;
        this.f76100d = str2;
        this.f76101e = i3;
        this.f76102f = z;
        this.f76103g = z2;
        this.f76104h = i4;
        this.f76105i = i5;
        this.f76106j = reactionParams;
        this.f76107k = str3;
        this.f76108l = z3;
        this.f76109m = str4;
        this.f76110n = str5;
        this.f76111o = str6;
        this.f76112p = str7;
        this.f76113q = str8;
        this.f76114r = str9;
        this.f76115s = str10;
        this.f76116t = str11;
        this.f76117u = str12;
        this.f76118v = extractFramesModel;
        this.f76119w = str13;
        this.f76120x = aVUploadSaveModel;
        this.f76121y = infoStickerModel;
        this.f76122z = z4;
        this.f76034A = i6;
        this.f76035B = oVar;
        this.f76036C = i7;
        this.f76037D = list;
        this.f76038E = z5;
        this.f76039F = i8;
        this.f76040G = socialModel;
        this.f76041H = str14;
        this.f76042I = eVar;
        this.f76043J = bVar;
        this.f76044K = statusCreateVideoData;
        this.f76045L = jVar;
        this.f76046M = z6;
        this.f76047N = str15;
        this.f76048O = str16;
        this.f76049P = str17;
        this.f76050Q = fVar;
        this.f76051R = i9;
        this.f76052S = i10;
        this.f76053T = i11;
        this.f76054U = i12;
        this.f76055V = i13;
        this.f76056W = hVar;
        this.f76057X = num;
        this.f76058Y = videoCategoryParam;
        this.f76059Z = str18;
        this.f76072aa = str19;
        this.f76073ab = i14;
        this.f76074ac = arrayList;
        this.f76075ad = stickerChallenge;
        this.f76076ae = map;
        this.f76077af = audioRecorderParam;
        this.f76078ag = z7;
        this.f76079ah = str20;
        this.f76080ai = gVar;
        this.f76081aj = list2;
        this.f76082ak = editPreviewInfo;
        this.f76083al = list3;
        this.f76084am = i15;
        this.f76085an = i16;
        this.f76086ao = f;
        this.f76087ap = str26;
        this.f76088aq = i17;
        this.f76089ar = z8;
        this.f76090as = str22;
        this.f76091at = z9;
        this.f76092au = multiEditVideoStatusRecordData;
        this.f76093av = z10;
        this.f76094aw = aVar;
        this.f76095ax = str23;
        this.f76096ay = nVar;
        this.f76097az = commentVideoModel;
        this.f76061aA = arrayList2;
        this.f76062aB = z11;
        this.f76063aC = i18;
        this.f76064aD = str24;
        this.f76065aE = livePublishModel;
        this.f76066aF = stitchParams;
        this.f76067aG = z12;
        this.f76068aH = str25;
        this.f76069aI = arrayList3;
        this.f76070aJ = arrayList4;
        this.f76071aK = cutSameEditData;
    }

    public /* synthetic */ C29058b(int i, int i2, String str, String str2, int i3, boolean z, boolean z2, int i4, int i5, ReactionParams reactionParams, String str3, boolean z3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ExtractFramesModel extractFramesModel, String str13, AVUploadSaveModel aVUploadSaveModel, InfoStickerModel infoStickerModel, boolean z4, int i6, C43758o oVar, int i7, List list, boolean z5, int i8, SocialModel socialModel, String str14, C29067e eVar, C23289b bVar, StatusCreateVideoData statusCreateVideoData, C43895j jVar, boolean z6, String str15, String str16, String str17, C29068f fVar, int i9, int i10, int i11, int i12, int i13, C29070h hVar, Integer num, VideoCategoryParam videoCategoryParam, String str18, String str19, int i14, ArrayList arrayList, StickerChallenge stickerChallenge, Map map, AudioRecorderParam audioRecorderParam, boolean z7, String str20, C29069g gVar, List list2, EditPreviewInfo editPreviewInfo, List list3, int i15, int i16, float f, String str21, int i17, boolean z8, String str22, boolean z9, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z10, C45623a aVar, String str23, C46071n nVar, CommentVideoModel commentVideoModel, ArrayList arrayList2, boolean z11, int i18, String str24, LivePublishModel livePublishModel, StitchParams stitchParams, boolean z12, String str25, ArrayList arrayList3, ArrayList arrayList4, CutSameEditData cutSameEditData, int i19, int i20, int i21, C52707g gVar2) {
        this(0, 3, UUID.randomUUID().toString(), "", 0, false, false, 0, 0, null, null, false, "original", null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, "720*1280", null, null, null, 0, 0, 0, 0, 0, null, Integer.valueOf(0), null, null, null, -1, null, null, null, null, false, null, null, null, null, null, 0, 0, -1.0f, "", 0, false, null, true, null, false, null, null, null, null, null, true, 0, null, null, null, false, null, null, null, null);
    }
}
