package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.p683ss.android.ugc.aweme.discover.helper.C28195d;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28121e.C28122a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.g.w */
public final class C28153w extends C26851b<C26832a<SearchSugResponse>, C28122a> {

    /* renamed from: a */
    public int f73933a;

    /* renamed from: b */
    public Handler f73934b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public String f73935c;

    /* renamed from: d */
    public String f73936d;

    /* renamed from: e */
    public String f73937e;

    /* renamed from: h */
    public Runnable f73938h = new Runnable() {
        public final void run() {
            C28153w.this.mo44934a_(C28153w.this.f73935c, C28153w.this.f73936d, C28153w.this.f73937e);
        }
    };

    /* renamed from: i */
    public C28195d f73939i = new C28195d();

    public C28153w() {
        mo54799a(new C26832a<SearchSugResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length == 0 || TextUtils.isEmpty(objArr[0])) {
                    return false;
                }
                return true;
            }

            public final void handleMsg(Message message) {
                if (message.what != C28153w.this.f73933a) {
                    this.mHandler.removeMessages(message.what);
                } else {
                    super.handleMsg(message);
                }
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                this.mIsLoading = false;
                C28153w.this.f73933a = (C28153w.this.f73933a + 1) % 10;
                C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        String str;
                        String str2 = (String) objArr[0];
                        String str3 = null;
                        if (objArr.length > 1) {
                            str = (String) objArr[1];
                        } else {
                            str = null;
                        }
                        if (objArr.length > 2) {
                            str3 = (String) objArr[2];
                        }
                        return SearchSugApi.m66837a(str2, str, str3, C28153w.this.f73939i);
                    }
                }, C28153w.this.f73933a);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        SearchSugResponse searchSugResponse;
        if (this.f70700f != null) {
            searchSugResponse = (SearchSugResponse) this.f70700f.getData();
        } else {
            searchSugResponse = null;
        }
        if (this.f70701g != null) {
            if (searchSugResponse != null) {
                C29981aa.m70153a().mo60162a(searchSugResponse.requestId, searchSugResponse.logPb);
                ((C28122a) this.f70701g).mo56530a(searchSugResponse);
                return;
            }
            ((C28122a) this.f70701g).mo56529a();
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C28122a) this.f70701g).mo56529a();
        }
    }
}
