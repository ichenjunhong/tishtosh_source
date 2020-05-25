package com.zhihu.matisse.internal.p2252b;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.p030v4.app.C0699x;
import android.support.p030v4.app.C0699x.C0700a;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0729f;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.p2251a.C45339b;
import java.lang.ref.WeakReference;

/* renamed from: com.zhihu.matisse.internal.b.b */
public final class C45342b implements C0700a<Cursor> {

    /* renamed from: a */
    private WeakReference<Context> f114636a;

    /* renamed from: b */
    private C0699x f114637b;

    /* renamed from: c */
    private C45343a f114638c;

    /* renamed from: com.zhihu.matisse.internal.b.b$a */
    public interface C45343a {
        /* renamed from: a */
        void mo91640a();

        /* renamed from: a */
        void mo91641a(Cursor cursor);
    }

    /* renamed from: a */
    public final void mo91637a() {
        if (this.f114637b != null) {
            this.f114637b.mo2083a(2);
        }
        this.f114638c = null;
    }

    /* renamed from: a */
    public final void mo2348a(C0729f<Cursor> fVar) {
        if (((Context) this.f114636a.get()) != null) {
            this.f114638c.mo91640a();
        }
    }

    /* renamed from: a */
    public final void mo91638a(FragmentActivity fragmentActivity, C45343a aVar) {
        this.f114636a = new WeakReference<>(fragmentActivity);
        this.f114637b = fragmentActivity.getSupportLoaderManager();
        this.f114638c = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2349a(C0729f fVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (((Context) this.f114636a.get()) != null) {
            this.f114638c.mo91641a(cursor);
        }
    }

    /* renamed from: a */
    public final C0729f<Cursor> mo2347a(int i, Bundle bundle) {
        boolean z;
        String[] strArr;
        String str;
        String str2;
        String[] a;
        Context context = (Context) this.f114636a.get();
        if (context == null) {
            return null;
        }
        Album album = (Album) bundle.getParcelable("args_album");
        if (album == null) {
            return null;
        }
        if (!album.mo91657b() || !bundle.getBoolean("args_enable_capture", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!album.mo91657b()) {
            if (C45353c.m98893a().mo91674d()) {
                str2 = "media_type=? AND  bucket_id=? AND _size>0";
                a = C45339b.m98840a(1, album.f114649b);
            } else if (C45353c.m98893a().mo91675e()) {
                str2 = "media_type=? AND  bucket_id=? AND _size>0";
                a = C45339b.m98840a(3, album.f114649b);
            } else {
                str2 = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
                strArr = new String[]{"1", "3", album.f114649b};
                str = str2;
                z = false;
            }
            strArr = a;
            str = str2;
            z = false;
        } else if (C45353c.m98893a().mo91674d()) {
            str = "media_type=? AND _size>0";
            strArr = C45339b.m98839a(1);
        } else if (C45353c.m98893a().mo91675e()) {
            str = "media_type=? AND _size>0";
            strArr = C45339b.m98839a(3);
        } else {
            str = "(media_type=? OR media_type=?) AND _size>0";
            strArr = C45339b.f114627v;
        }
        return new C45339b(context, str, strArr, z);
    }

    /* renamed from: a */
    public final void mo91639a(Album album, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", album);
        bundle.putBoolean("args_enable_capture", z);
        this.f114637b.mo2081a(2, bundle, this);
    }
}
