package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.google.gson.C17978g;
import com.google.gson.C18085o;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p683ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p683ss.android.ugc.aweme.filter.StrArray;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p683ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.EmbaddedWindowInfo;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoContext */
public class ShortVideoContext implements Parcelable {
    public static final Creator<ShortVideoContext> CREATOR = new Creator<ShortVideoContext>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShortVideoContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShortVideoContext(parcel);
        }
    };

    /* renamed from: A */
    public int f107022A;

    /* renamed from: B */
    public AVETParameter f107023B;

    /* renamed from: C */
    public User f107024C;

    /* renamed from: D */
    public String f107025D;

    /* renamed from: E */
    public String f107026E;

    /* renamed from: F */
    public String f107027F;

    /* renamed from: G */
    public String f107028G;

    /* renamed from: H */
    public float f107029H;

    /* renamed from: I */
    public float f107030I;

    /* renamed from: J */
    public boolean f107031J;

    /* renamed from: K */
    public int f107032K;

    /* renamed from: L */
    public int f107033L;

    /* renamed from: M */
    public String f107034M;

    /* renamed from: N */
    public ReactionParams f107035N;

    /* renamed from: O */
    public StitchParams f107036O;

    /* renamed from: P */
    public TimeSpeedModelExtension f107037P;

    /* renamed from: Q */
    public boolean f107038Q;

    /* renamed from: R */
    public List<EmbaddedWindowInfo> f107039R;

    /* renamed from: S */
    public boolean f107040S;

    /* renamed from: T */
    public String f107041T;

    /* renamed from: U */
    public String f107042U;

    /* renamed from: V */
    public boolean f107043V;

    /* renamed from: W */
    public List<AVTextExtraStruct> f107044W;

    /* renamed from: X */
    public int f107045X;

    /* renamed from: Y */
    public boolean f107046Y;

    /* renamed from: Z */
    public String f107047Z;

    /* renamed from: a */
    public int f107048a;

    /* renamed from: aA */
    public String f107049aA;

    /* renamed from: aB */
    public String f107050aB;

    /* renamed from: aC */
    public String f107051aC;

    /* renamed from: aD */
    public String f107052aD;

    /* renamed from: aE */
    public String f107053aE;

    /* renamed from: aF */
    public C43758o f107054aF;

    /* renamed from: aG */
    public boolean f107055aG;

    /* renamed from: aH */
    public boolean f107056aH;

    /* renamed from: aI */
    public boolean f107057aI;

    /* renamed from: aJ */
    public boolean f107058aJ;

    /* renamed from: aK */
    public String f107059aK;

    /* renamed from: aL */
    public String f107060aL;

    /* renamed from: aM */
    public String f107061aM;

    /* renamed from: aN */
    public StoryFestivalModel f107062aN;

    /* renamed from: aO */
    public ExtraMentionUserModel f107063aO;

    /* renamed from: aP */
    public UrlModel f107064aP;

    /* renamed from: aQ */
    public ArrayList<String> f107065aQ;

    /* renamed from: aR */
    public ArrayList<String> f107066aR;

    /* renamed from: aS */
    public C43895j f107067aS;

    /* renamed from: aT */
    public DraftEditTransferModel f107068aT;

    /* renamed from: aU */
    public ClientCherEffectParam f107069aU;

    /* renamed from: aV */
    public C43203d f107070aV;

    /* renamed from: aW */
    public ArrayList<Integer> f107071aW;

    /* renamed from: aX */
    public String f107072aX;

    /* renamed from: aY */
    public int f107073aY;

    /* renamed from: aZ */
    public float f107074aZ;

    /* renamed from: aa */
    public boolean f107075aa;

    /* renamed from: ab */
    public String f107076ab;

    /* renamed from: ac */
    public ArrayList<String> f107077ac;

    /* renamed from: ad */
    public List<TaskMentionedUser> f107078ad;

    /* renamed from: ae */
    public String f107079ae;

    /* renamed from: af */
    public String f107080af;

    /* renamed from: ag */
    public int f107081ag;

    /* renamed from: ah */
    public StrArray f107082ah;

    /* renamed from: ai */
    public StrArray f107083ai;

    /* renamed from: aj */
    public StrArray f107084aj;

    /* renamed from: ak */
    public StrArray f107085ak;

    /* renamed from: al */
    public StrArray f107086al;

    /* renamed from: am */
    public StrArray f107087am;

    /* renamed from: an */
    public boolean f107088an;

    /* renamed from: ao */
    public boolean f107089ao;

    /* renamed from: ap */
    public boolean f107090ap;

    /* renamed from: aq */
    public boolean f107091aq;

    /* renamed from: ar */
    public ExtractFramesModel f107092ar;

    /* renamed from: as */
    public long f107093as;

    /* renamed from: at */
    public long f107094at;

    /* renamed from: au */
    public int f107095au;

    /* renamed from: av */
    public int f107096av;

    /* renamed from: aw */
    public GameDuetResource f107097aw;

    /* renamed from: ax */
    public String f107098ax;

    /* renamed from: ay */
    public String f107099ay;

    /* renamed from: az */
    public String f107100az;

    /* renamed from: b */
    public final int f107101b;

    /* renamed from: ba */
    public int f107102ba;

    /* renamed from: bb */
    public ArrayList<String> f107103bb;

    /* renamed from: bc */
    public String f107104bc;

    /* renamed from: bd */
    public String f107105bd;

    /* renamed from: be */
    public String f107106be;

    /* renamed from: bf */
    public String f107107bf;

    /* renamed from: bg */
    public GreenScreenImage f107108bg;

    /* renamed from: bh */
    private C43789em f107109bh;

    /* renamed from: c */
    public long f107110c;

    /* renamed from: d */
    public UrlModel f107111d;

    /* renamed from: e */
    public String f107112e;

    /* renamed from: f */
    public int f107113f;

    /* renamed from: g */
    public int f107114g;

    /* renamed from: h */
    public String f107115h;

    /* renamed from: i */
    public int f107116i;

    /* renamed from: j */
    public int f107117j;

    /* renamed from: k */
    public Workspace f107118k;

    /* renamed from: l */
    public C43789em f107119l;

    /* renamed from: m */
    public long f107120m;

    /* renamed from: n */
    public long f107121n;

    /* renamed from: o */
    public boolean f107122o;

    /* renamed from: p */
    public long f107123p;

    /* renamed from: q */
    public RetakeVideoContext f107124q;

    /* renamed from: r */
    public CommentVideoModel f107125r;

    /* renamed from: s */
    public C46066a f107126s;

    /* renamed from: t */
    public int f107127t;

    /* renamed from: u */
    public boolean f107128u;

    /* renamed from: v */
    public int f107129v;

    /* renamed from: w */
    public Map<String, Object> f107130w;

    /* renamed from: x */
    public String f107131x;

    /* renamed from: y */
    public String f107132y;

    /* renamed from: z */
    public String f107133z;

    /* renamed from: b */
    public final void mo86360b() {
        this.f107091aq = true;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: d */
    public final boolean mo86362d() {
        if (this.f107036O != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo86367h() {
        return CommentUtils.isDataValid(this.f107125r);
    }

    /* renamed from: o */
    public final void mo86374o() {
        this.f107036O = null;
        this.f107037P = null;
    }

    /* renamed from: j */
    public final boolean mo86369j() {
        if (this.f107081ag == 13) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final AVETParameter mo86370k() {
        if (this.f107023B == null) {
            this.f107023B = new AVETParameter();
        }
        return this.f107023B;
    }

    /* renamed from: m */
    public final long mo86372m() {
        if (this.f107122o) {
            return this.f107121n;
        }
        return this.f107120m;
    }

    /* renamed from: p */
    public final C43789em mo86375p() {
        if (this.f107122o) {
            return this.f107109bh;
        }
        return this.f107119l;
    }

    /* renamed from: r */
    public final long mo86377r() {
        if (this.f107122o) {
            return this.f107123p;
        }
        return this.f107110c;
    }

    /* renamed from: c */
    public final boolean mo86361c() {
        if (this.f107118k.mo86458e() == null || mo86365f() || mo86366g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo86365f() {
        if (C9431p.m18664a(this.f107027F) || C9431p.m18664a(this.f107028G)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo86366g() {
        if (this.f107035N == null || C9431p.m18664a(this.f107035N.videoPath) || C9431p.m18664a(this.f107035N.wavPath)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo86368i() {
        if (this.f107036O == null) {
            return false;
        }
        if (!this.f107036O.isPGCMusic() || this.f107036O.getMusic() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final String mo86371l() {
        if (mo86361c()) {
            return this.f107118k.mo86458e().getPath();
        }
        return null;
    }

    /* renamed from: n */
    public final long mo86373n() {
        if (this.f107122o) {
            return this.f107124q.f107013b + ((long) this.f107113f);
        }
        return (long) this.f107113f;
    }

    /* renamed from: s */
    public final boolean mo86378s() {
        Iterator it = this.f107119l.iterator();
        while (it.hasNext()) {
            if (((TimeSpeedModelExtension) it.next()).getBackgroundVideo() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo86364e() {
        if (this.f107036O != null && this.f107036O.getMusic() != null && this.f107036O.isPGCMusic() && this.f107036O.getMusicStart() >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final C43789em mo86376q() {
        if (!this.f107122o || C9414h.m18630a(this.f107109bh)) {
            return this.f107119l;
        }
        C43789em emVar = new C43789em(this.f107119l);
        emVar.remove(this.f107124q.f107014c);
        emVar.addAll(this.f107124q.f107014c, this.f107109bh);
        return emVar;
    }

    /* renamed from: a */
    public final boolean mo86359a() {
        if (!this.f107090ap || this.f107091aq) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo86356a(int i) {
        this.f107071aW.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo86357a(long j) {
        if (this.f107122o) {
            this.f107121n = j;
        } else {
            this.f107120m = j;
        }
    }

    /* renamed from: a */
    public static String m93016a(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TimeSpeedModelExtension) it.next()).toJson());
        }
        return new C17978g().mo34892a().mo34900d().mo34889b(arrayList2);
    }

    /* renamed from: a */
    public static ArrayList<TimeSpeedModelExtension> m93017a(String str) {
        try {
            ArrayList arrayList = (ArrayList) C39629l.m88232a().mo58566D().mo34885a(str, new C17956a<ArrayList<C18085o>>() {
            }.f49843c);
            ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(TimeSpeedModelExtension.fromJson((C18085o) it.next()));
            }
            return arrayList2;
        } catch (Exception unused) {
            return m93018b(str);
        }
    }

    /* renamed from: b */
    private static ArrayList<TimeSpeedModelExtension> m93018b(String str) {
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split("\\$");
        if (split.length > 0) {
            for (String split2 : split) {
                String[] split3 = split2.split(",");
                if (split3.length == 2) {
                    try {
                        TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension(Integer.parseInt(split3[0]), (double) Float.parseFloat(split3[1]), null, null, null);
                        arrayList.add(timeSpeedModelExtension);
                    } catch (Exception unused) {
                    }
                }
                if (split3.length == 3) {
                    try {
                        TimeSpeedModelExtension timeSpeedModelExtension2 = new TimeSpeedModelExtension(Integer.parseInt(split3[0]), (double) Float.parseFloat(split3[1]), split3[2], null, null);
                        arrayList.add(timeSpeedModelExtension2);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    ShortVideoContext(int i) {
        this.f107119l = new C43789em();
        this.f107109bh = new C43789em();
        this.f107029H = 1.0f;
        this.f107030I = 1.0f;
        this.f107031J = false;
        this.f107039R = new ArrayList();
        this.f107040S = false;
        this.f107043V = false;
        this.f107077ac = new ArrayList<>();
        this.f107082ah = new StrArray();
        this.f107083ai = new StrArray();
        this.f107084aj = new StrArray();
        this.f107085ak = new StrArray();
        this.f107086al = new StrArray();
        this.f107087am = new StrArray();
        this.f107088an = true;
        this.f107089ao = true;
        this.f107090ap = false;
        this.f107091aq = false;
        this.f107093as = 0;
        this.f107094at = 0;
        this.f107053aE = "";
        this.f107065aQ = new ArrayList<>();
        this.f107066aR = new ArrayList<>();
        this.f107067aS = new C43895j();
        this.f107070aV = null;
        this.f107071aW = new ArrayList<>();
        this.f107073aY = 0;
        this.f107074aZ = -1.0f;
        this.f107102ba = 0;
        this.f107103bb = new ArrayList<>();
        this.f107101b = i;
    }

    /* renamed from: a */
    public final void mo86358a(StitchParams stitchParams) {
        if (stitchParams != null && stitchParams.getVideoSegment() != null && stitchParams.getVideoSegment().getVideoFileInfo() != null) {
            this.f107036O = stitchParams;
            this.f107040S = this.f107036O.isMuted();
            this.f107037P = new TimeSpeedModelExtension();
            this.f107037P.setDuration((int) stitchParams.getVideoSegment().getVideoFileInfo().getDuration());
        }
    }

    private ShortVideoContext(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        this.f107119l = new C43789em();
        this.f107109bh = new C43789em();
        this.f107029H = 1.0f;
        this.f107030I = 1.0f;
        boolean z10 = false;
        this.f107031J = false;
        this.f107039R = new ArrayList();
        this.f107040S = false;
        this.f107043V = false;
        this.f107077ac = new ArrayList<>();
        this.f107082ah = new StrArray();
        this.f107083ai = new StrArray();
        this.f107084aj = new StrArray();
        this.f107085ak = new StrArray();
        this.f107086al = new StrArray();
        this.f107087am = new StrArray();
        this.f107088an = true;
        this.f107089ao = true;
        this.f107090ap = false;
        this.f107091aq = false;
        this.f107093as = 0;
        this.f107094at = 0;
        this.f107053aE = "";
        this.f107065aQ = new ArrayList<>();
        this.f107066aR = new ArrayList<>();
        this.f107067aS = new C43895j();
        this.f107070aV = null;
        this.f107071aW = new ArrayList<>();
        this.f107073aY = 0;
        this.f107074aZ = -1.0f;
        this.f107102ba = 0;
        this.f107103bb = new ArrayList<>();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f107090ap = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f107091aq = z2;
        this.f107101b = parcel.readInt();
        this.f107110c = parcel.readLong();
        this.f107111d = (UrlModel) parcel.readSerializable();
        this.f107112e = parcel.readString();
        this.f107113f = parcel.readInt();
        this.f107114g = parcel.readInt();
        this.f107115h = parcel.readString();
        this.f107116i = parcel.readInt();
        this.f107117j = parcel.readInt();
        this.f107118k = (Workspace) parcel.readParcelable(Workspace.class.getClassLoader());
        this.f107119l = new C43789em(m93017a(parcel.readString()));
        this.f107120m = parcel.readLong();
        this.f107127t = parcel.readInt();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f107128u = z3;
        this.f107131x = parcel.readString();
        this.f107132y = parcel.readString();
        this.f107125r = (CommentVideoModel) parcel.readSerializable();
        this.f107022A = parcel.readInt();
        this.f107024C = (User) parcel.readSerializable();
        this.f107025D = parcel.readString();
        this.f107026E = parcel.readString();
        this.f107027F = parcel.readString();
        this.f107028G = parcel.readString();
        this.f107032K = parcel.readInt();
        this.f107033L = parcel.readInt();
        this.f107047Z = parcel.readString();
        this.f107076ab = parcel.readString();
        this.f107077ac = parcel.createStringArrayList();
        this.f107078ad = parcel.createTypedArrayList(TaskMentionedUser.CREATOR);
        this.f107079ae = parcel.readString();
        this.f107080af = parcel.readString();
        this.f107081ag = parcel.readInt();
        this.f107082ah = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f107083ai = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f107084aj = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f107085ak = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f107035N = (ReactionParams) parcel.readParcelable(ReactionParams.class.getClassLoader());
        this.f107039R = parcel.createTypedArrayList(EmbaddedWindowInfo.CREATOR);
        this.f107041T = parcel.readString();
        this.f107044W = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.f107045X = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f107046Y = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f107088an = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f107089ao = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f107040S = z7;
        this.f107095au = parcel.readInt();
        this.f107096av = parcel.readInt();
        this.f107097aw = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.f107034M = parcel.readString();
        this.f107086al = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f107087am = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f107098ax = parcel.readString();
        this.f107099ay = parcel.readString();
        this.f107100az = parcel.readString();
        this.f107049aA = parcel.readString();
        this.f107050aB = parcel.readString();
        this.f107051aC = parcel.readString();
        this.f107052aD = parcel.readString();
        this.f107092ar = (ExtractFramesModel) parcel.readSerializable();
        this.f107054aF = (C43758o) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f107055aG = z8;
        this.f107023B = (AVETParameter) parcel.readSerializable();
        this.f107062aN = (StoryFestivalModel) parcel.readParcelable(StoryFestivalModel.class.getClassLoader());
        this.f107063aO = (ExtraMentionUserModel) parcel.readSerializable();
        this.f107065aQ = parcel.createStringArrayList();
        this.f107066aR = parcel.createStringArrayList();
        this.f107067aS = (C43895j) parcel.readSerializable();
        this.f107068aT = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.f107069aU = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.f107064aP = (UrlModel) parcel.readSerializable();
        this.f107061aM = parcel.readString();
        this.f107133z = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f107038Q = z9;
        this.f107073aY = parcel.readInt();
        this.f107074aZ = parcel.readFloat();
        parcel.readList(this.f107071aW, Integer.class.getClassLoader());
        this.f107072aX = parcel.readString();
        this.f107029H = parcel.readFloat();
        this.f107030I = parcel.readFloat();
        this.f107042U = parcel.readString();
        if (parcel.readByte() != 0) {
            z10 = true;
        }
        this.f107043V = z10;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f107090ap ? 1 : 0);
        parcel.writeInt(this.f107091aq ? 1 : 0);
        parcel.writeInt(this.f107101b);
        parcel.writeLong(this.f107110c);
        parcel.writeSerializable(this.f107111d);
        parcel.writeString(this.f107112e);
        parcel.writeInt(this.f107113f);
        parcel.writeInt(this.f107114g);
        parcel.writeString(this.f107115h);
        parcel.writeInt(this.f107116i);
        parcel.writeInt(this.f107117j);
        parcel.writeParcelable(this.f107118k, i);
        parcel.writeString(m93016a((ArrayList<TimeSpeedModelExtension>) this.f107119l));
        parcel.writeLong(this.f107120m);
        parcel.writeInt(this.f107127t);
        parcel.writeInt(this.f107128u ? 1 : 0);
        parcel.writeString(this.f107131x);
        parcel.writeString(this.f107132y);
        parcel.writeSerializable(this.f107125r);
        parcel.writeInt(this.f107022A);
        parcel.writeSerializable(this.f107024C);
        parcel.writeString(this.f107025D);
        parcel.writeString(this.f107026E);
        parcel.writeString(this.f107027F);
        parcel.writeString(this.f107028G);
        parcel.writeInt(this.f107032K);
        parcel.writeInt(this.f107033L);
        parcel.writeString(this.f107047Z);
        parcel.writeString(this.f107076ab);
        parcel.writeStringList(this.f107077ac);
        parcel.writeTypedList(this.f107078ad);
        parcel.writeString(this.f107079ae);
        parcel.writeString(this.f107080af);
        parcel.writeInt(this.f107081ag);
        parcel.writeParcelable(this.f107082ah, i);
        parcel.writeParcelable(this.f107083ai, i);
        parcel.writeParcelable(this.f107084aj, i);
        parcel.writeParcelable(this.f107085ak, i);
        parcel.writeParcelable(this.f107035N, i);
        parcel.writeTypedList(this.f107039R);
        parcel.writeString(this.f107041T);
        parcel.writeTypedList(this.f107044W);
        parcel.writeInt(this.f107045X);
        parcel.writeByte(this.f107046Y ? (byte) 1 : 0);
        parcel.writeByte(this.f107088an ? (byte) 1 : 0);
        parcel.writeByte(this.f107089ao ? (byte) 1 : 0);
        parcel.writeByte(this.f107040S ? (byte) 1 : 0);
        parcel.writeInt(this.f107095au);
        parcel.writeInt(this.f107096av);
        parcel.writeParcelable(this.f107097aw, i);
        parcel.writeString(this.f107034M);
        parcel.writeParcelable(this.f107086al, i);
        parcel.writeParcelable(this.f107087am, i);
        parcel.writeString(this.f107098ax);
        parcel.writeString(this.f107099ay);
        parcel.writeString(this.f107100az);
        parcel.writeString(this.f107049aA);
        parcel.writeString(this.f107050aB);
        parcel.writeString(this.f107051aC);
        parcel.writeString(this.f107052aD);
        parcel.writeSerializable(this.f107092ar);
        parcel.writeSerializable(this.f107054aF);
        parcel.writeInt(this.f107055aG ? 1 : 0);
        parcel.writeSerializable(this.f107023B);
        parcel.writeParcelable(this.f107062aN, i);
        parcel.writeSerializable(this.f107063aO);
        parcel.writeStringList(this.f107065aQ);
        parcel.writeStringList(this.f107066aR);
        parcel.writeSerializable(this.f107067aS);
        parcel.writeParcelable(this.f107068aT, i);
        parcel.writeParcelable(this.f107069aU, i);
        parcel.writeSerializable(this.f107064aP);
        parcel.writeString(this.f107061aM);
        parcel.writeString(this.f107133z);
        parcel.writeByte(this.f107038Q ? (byte) 1 : 0);
        parcel.writeInt(this.f107073aY);
        parcel.writeFloat(this.f107074aZ);
        parcel.writeList(this.f107071aW);
        parcel.writeString(this.f107072aX);
        parcel.writeFloat(this.f107029H);
        parcel.writeFloat(this.f107030I);
        parcel.writeString(this.f107042U);
        parcel.writeByte(this.f107043V ? (byte) 1 : 0);
    }
}
