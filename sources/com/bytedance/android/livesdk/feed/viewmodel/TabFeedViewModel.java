package com.bytedance.android.livesdk.feed.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.C7067q;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import com.bytedance.common.utility.C9431p;

public class TabFeedViewModel extends FragmentFeedViewModel {

    /* renamed from: E */
    protected C7023m f19407E;

    /* renamed from: F */
    public int f19408F;

    /* renamed from: G */
    public int f19409G;

    /* renamed from: H */
    private long f19410H;

    /* renamed from: I */
    private C7067q f19411I;

    /* renamed from: h */
    public final boolean mo13269h() {
        mo13267f();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo13266e() {
        if (!C9431p.m18664a(this.f19385x) || this.f19407E.mo13182a(this.f19410H) == null) {
            return this.f19385x;
        }
        return this.f19407E.mo13182a(this.f19410H).f19012d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final FeedDataKey mo13268g() {
        if (TextUtils.isEmpty(this.f19369A) && this.f19407E.mo13182a(this.f19410H) != null) {
            this.f19369A = this.f19407E.mo13182a(this.f19410H).f19016h;
        }
        if (TextUtils.isEmpty(this.f19369A)) {
            this.f19369A = "video";
        }
        return FeedDataKey.m14536a(this.f19369A, mo13266e(), this.f19410H);
    }

    /* renamed from: c */
    public final void mo13274c(String str) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getPath());
        sb.append("?");
        sb.append(parse.getQuery());
        this.f19385x = sb.toString();
    }

    public TabFeedViewModel(IFeedRepository iFeedRepository, C7005j jVar, C7023m mVar, C6951a aVar, C7067q qVar, long j) {
        super(iFeedRepository, jVar, aVar);
        this.f19407E = mVar;
        this.f19410H = j;
        this.f19411I = qVar;
    }
}
