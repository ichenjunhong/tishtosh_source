package com.p683ss.android.ugc.aweme.filter;

import android.net.Uri;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.g */
public final class C31459g {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public int f82324a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    public String f82325b;
    @C17952c(mo34828a = "en_name")

    /* renamed from: c */
    public String f82326c;
    @C17952c(mo34828a = "resource")

    /* renamed from: d */
    public ToolsUrlModel f82327d;

    /* renamed from: e */
    public int f82328e;

    /* renamed from: f */
    public Uri f82329f;

    /* renamed from: g */
    public String f82330g;

    /* renamed from: h */
    public String f82331h;

    /* renamed from: i */
    public String f82332i;

    /* renamed from: j */
    public List<String> f82333j;

    /* renamed from: k */
    public float f82334k = -1.0f;

    /* renamed from: l */
    public boolean f82335l;

    /* renamed from: m */
    public boolean f82336m = true;

    public final int hashCode() {
        return this.f82324a;
    }

    /* renamed from: a */
    public final List<String> mo64357a() {
        if (this.f82333j == null || this.f82333j.isEmpty()) {
            return new ArrayList();
        }
        return this.f82333j;
    }

    public final String toString() {
        String str = "";
        if (this.f82327d != null) {
            str = this.f82327d.toString();
        }
        StringBuilder sb = new StringBuilder("FilterBean{mId=");
        sb.append(this.f82324a);
        sb.append(", mName='");
        sb.append(this.f82325b);
        sb.append('\'');
        sb.append(", mEnName='");
        sb.append(this.f82326c);
        sb.append('\'');
        sb.append(", mResource=");
        sb.append(str);
        sb.append(", mIndex=");
        sb.append(this.f82328e);
        sb.append(", mThumbnailFileUri=");
        sb.append(this.f82329f);
        sb.append(", mThumbnailFilePath='");
        sb.append(this.f82330g);
        sb.append('\'');
        sb.append(", mFilterFilePath='");
        sb.append(this.f82331h);
        sb.append('\'');
        sb.append(", mFilterFolder='");
        sb.append(this.f82332i);
        sb.append('\'');
        sb.append(", tags=");
        sb.append(this.f82333j);
        sb.append(", internalDefaultIntensity=");
        sb.append(this.f82334k);
        sb.append(", executeSetFilterFolder=");
        sb.append(this.f82335l);
        sb.append(", isSaveFilter2BeautySequence=");
        sb.append(this.f82336m);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31459g)) {
            return false;
        }
        if (this.f82324a == ((C31459g) obj).f82324a) {
            return true;
        }
        return false;
    }
}
