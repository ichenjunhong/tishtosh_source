package com.p683ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43761q;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.OldImpl */
public class OldImpl implements WorkspaceImpl {
    public static final Creator<OldImpl> CREATOR = new Creator<OldImpl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OldImpl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new OldImpl(parcel);
        }
    };

    /* renamed from: a */
    int f107171a;

    /* renamed from: b */
    String f107172b = C43308eb.f109492e;

    /* renamed from: c */
    String f107173c;

    /* renamed from: d */
    String f107174d;

    /* renamed from: e */
    String f107175e;

    /* renamed from: f */
    String f107176f;

    /* renamed from: g */
    String f107177g;

    /* renamed from: h */
    String f107178h;

    /* renamed from: i */
    String f107179i;

    /* renamed from: j */
    String f107180j;

    /* renamed from: k */
    String f107181k;

    /* renamed from: l */
    String f107182l;

    /* renamed from: m */
    String f107183m;

    /* renamed from: n */
    String f107184n;

    /* renamed from: o */
    Workspace f107185o;

    /* renamed from: p */
    public Handler f107186p = new Handler(Looper.getMainLooper());

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo86439e() {
        this.f107177g = null;
    }

    /* renamed from: d */
    public final File mo86437d() {
        return new File(this.f107172b);
    }

    /* renamed from: c */
    public final File mo86436c() {
        if (this.f107177g == null) {
            return null;
        }
        return new File(this.f107177g);
    }

    public OldImpl() {
    }

    /* renamed from: a */
    public final File mo86431a() {
        if (this.f107174d == null) {
            this.f107174d = C43308eb.m94998b("-concat-v");
        }
        return new File(this.f107174d);
    }

    /* renamed from: b */
    public final File mo86435b() {
        if (this.f107175e == null) {
            this.f107175e = C43308eb.m94998b("-concat-a");
        }
        return new File(this.f107175e);
    }

    /* renamed from: g */
    public final void mo86441g() {
        if (mo86437d().exists()) {
            C50200d.m108342a(mo86437d());
        }
        mo86440f();
    }

    /* renamed from: m */
    public final File mo86447m() {
        if (C50200d.m108346a(this.f107183m)) {
            return new File(this.f107183m);
        }
        return null;
    }

    /* renamed from: n */
    public final File mo86448n() {
        if (C50200d.m108346a(this.f107184n)) {
            return new File(this.f107184n);
        }
        return null;
    }

    /* renamed from: i */
    public final File mo86443i() {
        if (this.f107181k == null) {
            File b = mo86435b();
            new C43761q();
            String path = b.getPath();
            C52711k.m112240b(path, "concatAudioPath");
            String path2 = new File(C43308eb.f109497j, new File(path).getName()).getPath();
            C52711k.m112236a((Object) path2, "originalSoundFile.path");
            this.f107181k = path2;
        }
        return new File(this.f107181k);
    }

    /* renamed from: j */
    public final File mo86444j() {
        if (this.f107182l == null) {
            File a = mo86431a();
            new C43761q();
            String path = a.getPath();
            C52711k.m112240b(path, "concatVideoPath");
            String path2 = new File(C43308eb.f109499l, new File(path).getName()).getPath();
            C52711k.m112236a((Object) path2, "synthetiseOutputFile.path");
            this.f107182l = path2;
        }
        return new File(this.f107182l);
    }

    /* renamed from: k */
    public final File mo86445k() {
        String str = C43308eb.f109495h;
        if (!C50200d.m108346a(str)) {
            C50200d.m108339a(str, false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C43308eb.m94999c("-bgv-v"));
        this.f107183m = sb.toString();
        return new File(this.f107183m);
    }

    /* renamed from: l */
    public final File mo86446l() {
        String str = C43308eb.f109495h;
        if (!C50200d.m108346a(str)) {
            C50200d.m108339a(str, false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C43308eb.m94999c("-bgv-a"));
        this.f107184n = sb.toString();
        return new File(this.f107184n);
    }

    /* renamed from: f */
    public final void mo86440f() {
        if (this.f107179i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f107177g);
            sb.append(".wav");
            this.f107179i = new File(sb.toString()).getPath();
        }
        File file = new File(this.f107179i);
        if (file.exists()) {
            file.delete();
        }
        if (this.f107178h == null) {
            this.f107178h = new File(C43308eb.f109491d, "mix.wav").getPath();
        }
        File file2 = new File(this.f107178h);
        if (file2.exists()) {
            file2.delete();
        }
    }

    /* renamed from: h */
    public final File mo86442h() {
        if (this.f107180j == null) {
            File a = mo86431a();
            new C43761q();
            String path = a.getPath();
            C52711k.m112240b(path, "concatVideoPath");
            File file = new File(path);
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder("synthetise_");
            sb.append(file.getName());
            String path2 = new File(parent, sb.toString()).getPath();
            C52711k.m112236a((Object) path2, "synthetiseOutputFile.path");
            this.f107180j = path2;
        }
        return new File(this.f107180j);
    }

    /* renamed from: a */
    public final void mo86434a(String str) {
        this.f107172b = str;
    }

    /* renamed from: a */
    public final void mo86433a(File file) {
        this.f107177g = file.getPath();
    }

    /* renamed from: a */
    public final void mo86432a(final C42385a aVar) {
        C46797a.m101642a().execute(new Runnable() {
            public final void run() {
                String a = Workspace.m93093a(OldImpl.this.mo86431a().getPath());
                File[] listFiles = new File(a).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            file.delete();
                        }
                    }
                }
                String path = OldImpl.this.mo86437d().getPath();
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(File.separator);
                C50200d.m108343a(path, sb.toString(), true);
                if (aVar != null) {
                    aVar.mo86474a(OldImpl.this.f107185o);
                }
            }
        });
    }

    protected OldImpl(Parcel parcel) {
        this.f107171a = parcel.readInt();
        this.f107172b = parcel.readString();
        this.f107173c = parcel.readString();
        this.f107174d = parcel.readString();
        this.f107175e = parcel.readString();
        this.f107176f = parcel.readString();
        this.f107177g = parcel.readString();
        this.f107179i = parcel.readString();
        this.f107178h = parcel.readString();
        this.f107180j = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f107171a);
        parcel.writeString(this.f107172b);
        parcel.writeString(this.f107173c);
        parcel.writeString(this.f107174d);
        parcel.writeString(this.f107175e);
        parcel.writeString(this.f107176f);
        parcel.writeString(this.f107177g);
        parcel.writeString(this.f107179i);
        parcel.writeString(this.f107178h);
        parcel.writeString(this.f107180j);
    }
}
