package com.p683ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace */
public final class Workspace implements Parcelable {
    public static final Creator<Workspace> CREATOR = new Creator<Workspace>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Workspace[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Workspace(parcel);
        }
    };

    /* renamed from: a */
    public final WorkspaceImpl f107189a;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public final File mo86455c() {
        return this.f107189a.mo86431a();
    }

    /* renamed from: d */
    public final File mo86456d() {
        return this.f107189a.mo86435b();
    }

    /* renamed from: e */
    public final File mo86458e() {
        return this.f107189a.mo86436c();
    }

    /* renamed from: f */
    public final void mo86459f() {
        this.f107189a.mo86439e();
    }

    /* renamed from: g */
    public final File mo86460g() {
        return this.f107189a.mo86437d();
    }

    /* renamed from: h */
    public final void mo86461h() {
        this.f107189a.mo86440f();
    }

    /* renamed from: i */
    public final void mo86462i() {
        this.f107189a.mo86441g();
    }

    /* renamed from: j */
    public final File mo86463j() {
        return this.f107189a.mo86442h();
    }

    /* renamed from: k */
    public final File mo86464k() {
        return this.f107189a.mo86443i();
    }

    /* renamed from: l */
    public final File mo86465l() {
        return this.f107189a.mo86444j();
    }

    /* renamed from: m */
    public final void mo86466m() {
        this.f107189a.mo86434a(C43308eb.f109492e);
    }

    /* renamed from: n */
    public final File mo86467n() {
        return this.f107189a.mo86445k();
    }

    /* renamed from: o */
    public final File mo86468o() {
        return this.f107189a.mo86446l();
    }

    /* renamed from: p */
    public final File mo86469p() {
        return this.f107189a.mo86447m();
    }

    /* renamed from: q */
    public final File mo86470q() {
        return this.f107189a.mo86448n();
    }

    /* renamed from: a */
    public static Workspace m93091a() {
        OldImpl oldImpl = new OldImpl();
        Workspace workspace = new Workspace((WorkspaceImpl) oldImpl);
        oldImpl.f107185o = workspace;
        return workspace;
    }

    /* renamed from: b */
    public static String m93095b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109494g);
        sb.append(simpleDateFormat.format(new Date()));
        return sb.toString();
    }

    private Workspace(WorkspaceImpl workspaceImpl) {
        this.f107189a = workspaceImpl;
    }

    /* renamed from: a */
    public final void mo86453a(File file) {
        this.f107189a.mo86433a(file);
    }

    /* renamed from: b */
    public final void mo86454b(String str) {
        this.f107189a.mo86434a(str);
    }

    protected Workspace(Parcel parcel) {
        this.f107189a = (WorkspaceImpl) parcel.readParcelable(WorkspaceImpl.class.getClassLoader());
        if (this.f107189a instanceof OldImpl) {
            ((OldImpl) this.f107189a).f107185o = this;
        }
    }

    /* renamed from: a */
    public static String m93093a(String str) {
        String a = C9395d.m18571a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109493f);
        sb.append(a);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107189a, i);
    }

    /* renamed from: a */
    public static Workspace m93092a(String str, String str2, String str3, String str4) {
        OldImpl oldImpl = new OldImpl();
        oldImpl.f107171a = 1;
        oldImpl.f107174d = str;
        oldImpl.f107175e = str2;
        oldImpl.f107177g = str3;
        oldImpl.f107176f = str4;
        oldImpl.f107173c = m93093a(str);
        Workspace workspace = new Workspace((WorkspaceImpl) oldImpl);
        oldImpl.f107185o = workspace;
        return workspace;
    }

    /* renamed from: b */
    public static Workspace m93094b(String str, String str2, String str3, String str4) {
        OldImpl oldImpl = new OldImpl();
        oldImpl.f107171a = 0;
        oldImpl.f107174d = null;
        oldImpl.f107175e = null;
        oldImpl.f107177g = str3;
        oldImpl.f107176f = str4;
        Workspace workspace = new Workspace((WorkspaceImpl) oldImpl);
        oldImpl.f107185o = workspace;
        return workspace;
    }
}
