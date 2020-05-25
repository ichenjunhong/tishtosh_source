package com.zhihu.matisse.internal.p2252b;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.p030v4.app.C0699x;
import android.support.p030v4.app.C0699x.C0700a;
import android.support.p030v4.content.C0729f;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.p2251a.C45338a;
import java.lang.ref.WeakReference;

/* renamed from: com.zhihu.matisse.internal.b.a */
public final class C45340a implements C0700a<Cursor> {

    /* renamed from: a */
    public WeakReference<Context> f114631a;

    /* renamed from: b */
    public C0699x f114632b;

    /* renamed from: c */
    public C45341a f114633c;

    /* renamed from: d */
    public int f114634d;

    /* renamed from: e */
    private boolean f114635e;

    /* renamed from: com.zhihu.matisse.internal.b.a$a */
    public interface C45341a {
        /* renamed from: a */
        void mo91635a();

        /* renamed from: a */
        void mo91636a(Cursor cursor);
    }

    /* renamed from: a */
    public final void mo2348a(C0729f<Cursor> fVar) {
        if (((Context) this.f114631a.get()) != null) {
            this.f114633c.mo91635a();
        }
    }

    /* renamed from: a */
    public final C0729f<Cursor> mo2347a(int i, Bundle bundle) {
        String str;
        String[] strArr;
        Context context = (Context) this.f114631a.get();
        if (context == null) {
            return null;
        }
        this.f114635e = false;
        if (C45353c.m98893a().mo91674d()) {
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
            strArr = C45338a.m98835a(1);
        } else if (C45353c.m98893a().mo91675e()) {
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
            strArr = C45338a.m98835a(3);
        } else {
            str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            strArr = C45338a.f114623v;
        }
        return new C45338a(context, str, strArr);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2349a(C0729f fVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (((Context) this.f114631a.get()) != null && !this.f114635e) {
            this.f114635e = true;
            this.f114633c.mo91636a(cursor);
        }
    }
}
