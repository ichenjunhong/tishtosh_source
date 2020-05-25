package com.p683ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.account.util.w */
public final class C22285w implements C9382a {

    /* renamed from: a */
    public long f60051a;

    /* renamed from: b */
    public long f60052b;

    /* renamed from: c */
    public long f60053c;

    /* renamed from: d */
    public C22286a f60054d;

    /* renamed from: e */
    public C9381g f60055e = new C9381g(this);

    /* renamed from: com.ss.android.ugc.aweme.account.util.w$a */
    public interface C22286a {
        /* renamed from: a */
        void mo45762a(long j);
    }

    /* renamed from: a */
    public final void mo46379a() {
        this.f60055e.removeMessages(BaseNotice.HASHTAG);
    }

    /* renamed from: b */
    private void m55158b() {
        this.f60053c = this.f60052b - ((System.currentTimeMillis() - this.f60051a) / 1000);
        if (this.f60053c <= 0) {
            this.f60053c = 0;
        } else {
            this.f60055e.sendEmptyMessageDelayed(BaseNotice.HASHTAG, 1000);
        }
        if (this.f60054d != null) {
            this.f60054d.mo45762a(this.f60053c);
        }
    }

    /* renamed from: a */
    public final void mo46381a(Bundle bundle) {
        this.f60051a = bundle.getLong("ticker_start_time", 0);
        this.f60052b = bundle.getLong("ticker_duration", 0);
        if (bundle.getBoolean("ticker_is_running", false)) {
            m55158b();
        }
    }

    public final void handleMsg(Message message) {
        this.f60053c--;
        if (this.f60053c <= 0) {
            this.f60053c = 0;
        } else {
            this.f60055e.sendEmptyMessageDelayed(BaseNotice.HASHTAG, 1000);
        }
        if (this.f60054d != null) {
            this.f60054d.mo45762a(this.f60053c);
        }
    }

    /* renamed from: b */
    public final void mo46382b(long j, int i, C22286a aVar) {
        mo46379a();
        this.f60051a = j;
        this.f60052b = (long) i;
        this.f60054d = aVar;
        m55158b();
    }

    public C22285w(long j, int i, C22286a aVar) {
        this.f60051a = j;
        this.f60052b = (long) i;
        this.f60054d = aVar;
    }

    /* renamed from: a */
    public final void mo46380a(long j, int i, C22286a aVar) {
        this.f60053c = 60 - ((System.currentTimeMillis() - j) / 1000);
        if (this.f60053c <= 0) {
            this.f60053c = 0;
        } else {
            this.f60055e.sendEmptyMessageDelayed(BaseNotice.HASHTAG, 1000);
        }
        if (aVar != null) {
            aVar.mo45762a(this.f60053c);
        }
    }
}
