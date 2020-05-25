package android.support.p030v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.p030v4.content.C0729f.C0730a;
import android.support.p030v4.p040os.C0958a;
import android.support.p030v4.p040os.C0964d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: android.support.v4.content.d */
public class C0727d extends C0708a<Cursor> {

    /* renamed from: f */
    final C0730a f2522f = new C0730a<>();

    /* renamed from: g */
    public Uri f2523g;

    /* renamed from: h */
    public String[] f2524h;

    /* renamed from: i */
    public String f2525i;

    /* renamed from: j */
    public String[] f2526j;

    /* renamed from: k */
    public String f2527k;

    /* renamed from: l */
    Cursor f2528l;

    /* renamed from: m */
    C0958a f2529m;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo2389h() {
        mo2393k();
    }

    /* renamed from: e */
    public final void mo2372e() {
        super.mo2372e();
        synchronized (this) {
            if (this.f2529m != null) {
                this.f2529m.mo2941b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo2388g() {
        if (this.f2528l != null) {
            mo2386b(this.f2528l);
        }
        boolean z = this.f2536t;
        this.f2536t = false;
        this.f2537u |= z;
        if (z || this.f2528l == null) {
            mo2394l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo2390i() {
        super.mo2390i();
        mo2389h();
        if (this.f2528l != null && !this.f2528l.isClosed()) {
            this.f2528l.close();
        }
        this.f2528l = null;
    }

    /* renamed from: f */
    public Cursor mo2371d() {
        boolean z;
        Cursor a;
        synchronized (this) {
            if (this.f2492b != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f2529m = new C0958a();
            } else {
                throw new C0964d();
            }
        }
        try {
            a = C0725b.m2089a(this.f2532p.getContentResolver(), this.f2523g, this.f2524h, this.f2525i, this.f2526j, this.f2527k, this.f2529m);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f2522f);
            }
            synchronized (this) {
                this.f2529m = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f2529m = null;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2367a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo2386b(Cursor cursor) {
        if (this.f2535s) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f2528l;
        this.f2528l = cursor;
        if (this.f2533q) {
            super.mo2386b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    /* renamed from: a */
    public final void mo2368a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo2368a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f2523g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f2524h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f2525i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f2526j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f2527k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f2528l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f2536t);
    }

    public C0727d(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f2523g = uri;
        this.f2524h = strArr;
        this.f2525i = str;
        this.f2526j = strArr2;
        this.f2527k = str2;
    }
}
