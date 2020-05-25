package dmt.p2652av.video;

import java.util.Arrays;

/* renamed from: dmt.av.video.u */
public final class C53026u {

    /* renamed from: a */
    public int[] f131487a;

    /* renamed from: b */
    public long f131488b;

    /* renamed from: c */
    public long f131489c;

    /* renamed from: d */
    public long f131490d;

    /* renamed from: e */
    public long f131491e;

    /* renamed from: f */
    public int f131492f;

    /* renamed from: g */
    public boolean f131493g;

    /* renamed from: h */
    public int f131494h;

    /* renamed from: i */
    public String f131495i;

    /* renamed from: j */
    public String f131496j;

    /* renamed from: k */
    public String f131497k;

    /* renamed from: l */
    public int f131498l;

    /* renamed from: m */
    public String f131499m;

    /* renamed from: n */
    public String f131500n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEFilterEffectOp{mEffectIndexes=");
        sb.append(Arrays.toString(this.f131487a));
        sb.append(", mStartTimePoint=");
        sb.append(this.f131488b);
        sb.append(", mOp=");
        sb.append(this.f131492f);
        sb.append(", mReverse=");
        sb.append(this.f131493g);
        sb.append(", mColor=");
        sb.append(this.f131494h);
        sb.append(", mResource='");
        sb.append(this.f131495i);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.f131497k);
        sb.append('\'');
        sb.append(", mKey='");
        sb.append(this.f131496j);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C53026u m112765a(long j) {
        C53026u uVar = new C53026u();
        uVar.f131492f = 1;
        uVar.f131488b = j;
        return uVar;
    }

    /* renamed from: b */
    public static C53026u m112769b(int[] iArr) {
        C53026u uVar = new C53026u();
        uVar.f131492f = 3;
        uVar.f131487a = iArr;
        return uVar;
    }

    /* renamed from: a */
    public static C53026u m112764a(int i) {
        C53026u uVar = new C53026u();
        uVar.f131492f = 7;
        uVar.f131487a = new int[]{i};
        return uVar;
    }

    /* renamed from: b */
    public static C53026u m112768b(int i) {
        C53026u uVar = new C53026u();
        uVar.f131492f = 2;
        uVar.f131487a = new int[]{i};
        return uVar;
    }

    /* renamed from: a */
    public static C53026u m112767a(int[] iArr) {
        C53026u uVar = new C53026u();
        uVar.f131492f = 4;
        uVar.f131487a = iArr;
        return uVar;
    }

    /* renamed from: a */
    public static C53026u m112766a(String str, long j) {
        C53026u uVar = new C53026u();
        uVar.f131492f = 0;
        uVar.f131495i = str;
        uVar.f131488b = j;
        return uVar;
    }
}
