package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData */
public class MvThemeData implements Parcelable {
    public static final Creator<MvThemeData> CREATOR = new Creator<MvThemeData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MvThemeData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MvThemeData(parcel);
        }
    };

    /* renamed from: a */
    public Effect f119230a;

    /* renamed from: b */
    public List<String> f119231b;

    /* renamed from: c */
    public int f119232c;

    /* renamed from: d */
    public int f119233d;

    /* renamed from: e */
    public String f119234e;

    /* renamed from: f */
    public String f119235f;

    /* renamed from: g */
    public int f119236g;

    /* renamed from: h */
    public int f119237h;

    /* renamed from: i */
    public boolean f119238i;

    /* renamed from: j */
    public int f119239j;

    /* renamed from: k */
    public boolean f119240k;

    /* renamed from: l */
    String f119241l;

    /* renamed from: m */
    public String f119242m;

    /* renamed from: n */
    public List<String> f119243n;

    /* renamed from: o */
    public int f119244o;

    /* renamed from: p */
    public int f119245p;

    /* renamed from: q */
    public String f119246q;

    /* renamed from: r */
    public boolean f119247r;

    /* renamed from: s */
    private String f119248s;

    public MvThemeData() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo94472a() {
        if (this.f119230a != null) {
            return this.f119230a.getEffectId();
        }
        return null;
    }

    /* renamed from: b */
    public final List<String> mo94474b() {
        if (this.f119230a != null) {
            return this.f119230a.getMusic();
        }
        return null;
    }

    /* renamed from: d */
    public final String mo94476d() {
        if (this.f119230a != null) {
            return this.f119230a.getUnzipPath();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo94481h() {
        if (this.f119230a != null) {
            return this.f119230a.getHint();
        }
        return "";
    }

    /* renamed from: i */
    public final String mo94482i() {
        if (this.f119230a != null) {
            return this.f119230a.getId();
        }
        return null;
    }

    /* renamed from: f */
    public final String mo94479f() {
        if (this.f119230a == null) {
            return "";
        }
        if (this.f119230a.getName() == null) {
            return "";
        }
        return this.f119230a.getName();
    }

    /* renamed from: c */
    public final String mo94475c() {
        if (this.f119230a != null) {
            UrlModel fileUrl = this.f119230a.getFileUrl();
            if (fileUrl != null && !C23715d.m58202a((Collection<T>) fileUrl.getUrlList())) {
                return (String) fileUrl.getUrlList().get(0);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final String mo94478e() {
        if (TextUtils.isEmpty(this.f119234e) || C23715d.m58202a((Collection<T>) this.f119231b)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.f119231b.get(0));
        sb.append(this.f119234e);
        return sb.toString();
    }

    /* renamed from: g */
    public final String mo94480g() {
        if (TextUtils.isEmpty(this.f119248s) || C23715d.m58202a((Collection<T>) this.f119231b)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.f119231b.get(0));
        sb.append(this.f119248s);
        return sb.toString();
    }

    /* renamed from: j */
    private void m102493j() {
        if (this.f119230a != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f119230a.getExtra());
                this.f119232c = jSONObject.optInt("template_min_material", 0);
                this.f119233d = jSONObject.optInt("template_max_material", 0);
                this.f119234e = jSONObject.optString("template_video_cover", "");
                this.f119248s = jSONObject.optString("template_picture_cover", "");
                this.f119235f = jSONObject.optString("template_pic_fill_mode", "AspectFit");
                this.f119236g = jSONObject.optInt("template_pic_input_width", 720);
                this.f119237h = jSONObject.optInt("template_pic_input_height", 1280);
                this.f119239j = jSONObject.optInt(MovieDetailAPi.f94893c, 0);
                this.f119241l = jSONObject.optString("mv_algorithm_hint");
                this.f119242m = jSONObject.optString("mv_auto_save_toast");
                this.f119246q = jSONObject.optString("mv_resolution_limited_toast");
                this.f119244o = jSONObject.optInt("mv_resolution_limited_width");
                this.f119245p = jSONObject.optInt("mv_resolution_limited_height");
                this.f119243n = (List) C39618d.f101161b.mo34885a(jSONObject.optString("mv_server_algorithm_result_save_keys"), new C17956a<List<String>>() {
                }.f49843c);
                this.f119247r = jSONObject.optBoolean("is_commerce_music", false);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo94473a(Effect effect) {
        this.f119230a = effect;
        m102493j();
    }

    protected MvThemeData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f119230a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f119231b = parcel.createStringArrayList();
        this.f119232c = parcel.readInt();
        this.f119233d = parcel.readInt();
        this.f119234e = parcel.readString();
        this.f119248s = parcel.readString();
        this.f119235f = parcel.readString();
        this.f119236g = parcel.readInt();
        this.f119237h = parcel.readInt();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f119238i = z;
        this.f119239j = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f119240k = z2;
        this.f119241l = parcel.readString();
        this.f119242m = parcel.readString();
        this.f119243n = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.f119247r = z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f119230a, i);
        parcel.writeStringList(this.f119231b);
        parcel.writeInt(this.f119232c);
        parcel.writeInt(this.f119233d);
        parcel.writeString(this.f119234e);
        parcel.writeString(this.f119248s);
        parcel.writeString(this.f119235f);
        parcel.writeInt(this.f119236g);
        parcel.writeInt(this.f119237h);
        parcel.writeByte(this.f119238i ? (byte) 1 : 0);
        parcel.writeInt(this.f119239j);
        parcel.writeByte(this.f119240k ? (byte) 1 : 0);
        parcel.writeString(this.f119241l);
        parcel.writeString(this.f119242m);
        parcel.writeStringList(this.f119243n);
        parcel.writeByte(this.f119247r ? (byte) 1 : 0);
    }
}
