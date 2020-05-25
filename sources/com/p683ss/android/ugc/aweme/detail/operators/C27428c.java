package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.detail.p1625g.C27337a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27366a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27368b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.c */
public class C27428c implements C27419al {

    /* renamed from: a */
    protected C27366a f72185a = new C27366a(1);

    /* renamed from: b */
    private String f72186b;

    /* renamed from: c */
    private C27368b f72187c = new C27368b();

    public boolean cannotLoadLatest() {
        return false;
    }

    public boolean cannotLoadMore() {
        return false;
    }

    public int getPageType(int i) {
        return i + 3000;
    }

    public Object getViewModel() {
        return this.f72185a;
    }

    public boolean init(Fragment fragment) {
        return true;
    }

    public boolean isLoading() {
        return this.f72187c.mo54804o();
    }

    public void unInit() {
        this.f72187c.mo46991S_();
        this.f72187c.aq_();
    }

    public boolean isDataEmpty() {
        if (this.f72185a.getData() == null || C9376b.m18558a((Collection<T>) ((C27337a) this.f72185a.getData()).f72085a)) {
            return true;
        }
        return false;
    }

    public void bindView(C27424ao aoVar) {
        this.f72187c.mo54800a(aoVar);
        this.f72187c.mo54799a(this.f72185a);
    }

    public C27428c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("]");
            str2 = sb.toString();
        }
        this.f72186b = str2;
    }

    public boolean deleteItem(String str) {
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (awemeById == null) {
            awemeById = C23324d.m57378a().getProfileSelfSeeAweme(str);
        }
        if (awemeById == null) {
            return false;
        }
        C27368b bVar = this.f72187c;
        if (bVar.f70700f == null || ((C27366a) bVar.f70700f).getData() == null || ((C27337a) ((C27366a) bVar.f70700f).getData()).f72085a == null || !((C27337a) ((C27366a) bVar.f70700f).getData()).f72085a.remove(awemeById)) {
            return false;
        }
        return true;
    }

    public void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72187c.mo44934a_(this.f72186b, bVar.getPushParams(), bVar.getEventType());
    }
}
