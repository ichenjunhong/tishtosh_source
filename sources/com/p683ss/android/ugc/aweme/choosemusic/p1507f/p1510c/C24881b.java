package com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1510c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.choosemusic.api.SearchSugApi.C24831a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24867w;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1510c.C24879a.C24880a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.c.b */
public final class C24881b extends C26851b<C26832a<C24867w>, C24880a> {

    /* renamed from: a */
    public int f65830a;

    /* renamed from: b */
    public Handler f65831b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public String f65832c;

    /* renamed from: d */
    public String f65833d;

    /* renamed from: e */
    public Runnable f65834e = new Runnable() {
        public final void run() {
            C24881b.this.mo44934a_(C24881b.this.f65832c, C24881b.this.f65833d);
        }
    };

    public C24881b() {
        mo54799a(new C26832a<C24867w>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length == 0 || TextUtils.isEmpty(objArr[0])) {
                    return false;
                }
                return true;
            }

            public final void handleMsg(Message message) {
                if (message.what != C24881b.this.f65830a) {
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
                C24881b.this.f65830a = (C24881b.this.f65830a + 1) % 10;
                C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        String str;
                        String str2 = (String) objArr[0];
                        if (objArr.length > 1) {
                            str = (String) objArr[1];
                        } else {
                            str = null;
                        }
                        return C24831a.f65732a.getSearchSugList(str2, str).get();
                    }
                }, C24881b.this.f65830a);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        C24867w wVar;
        if (this.f70700f != null) {
            wVar = (C24867w) this.f70700f.getData();
        } else {
            wVar = null;
        }
        if (this.f70701g != null) {
            if (wVar != null) {
                C29981aa.m70153a().mo60162a(wVar.f65804b, wVar.f65805c);
                ((C24880a) this.f70701g).mo50801a(wVar);
                return;
            }
            ((C24880a) this.f70701g).mo50802p();
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C24880a) this.f70701g).mo50802p();
        }
    }
}
