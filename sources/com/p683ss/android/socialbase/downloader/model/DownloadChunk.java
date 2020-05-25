package com.p683ss.android.socialbase.downloader.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.socialbase.downloader.downloader.C19889e;
import com.p683ss.android.socialbase.downloader.p1220i.C19940b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk */
public class DownloadChunk implements Parcelable {
    public static final Creator<DownloadChunk> CREATOR = new Creator<DownloadChunk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DownloadChunk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DownloadChunk(parcel);
        }
    };

    /* renamed from: l */
    private static final String f55023l = "DownloadChunk";

    /* renamed from: a */
    public int f55024a;

    /* renamed from: b */
    public long f55025b;

    /* renamed from: c */
    public long f55026c;

    /* renamed from: d */
    public long f55027d;

    /* renamed from: e */
    public int f55028e;

    /* renamed from: f */
    public long f55029f;

    /* renamed from: g */
    public List<DownloadChunk> f55030g;

    /* renamed from: h */
    public DownloadChunk f55031h;

    /* renamed from: i */
    public int f55032i;

    /* renamed from: j */
    public boolean f55033j;

    /* renamed from: k */
    public AtomicBoolean f55034k;

    /* renamed from: m */
    private AtomicLong f55035m;

    /* renamed from: n */
    private AtomicInteger f55036n;

    /* renamed from: o */
    private C19940b f55037o;

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk$a */
    public static class C20041a {

        /* renamed from: a */
        public int f55038a;

        /* renamed from: b */
        public long f55039b;

        /* renamed from: c */
        public long f55040c;

        /* renamed from: d */
        public long f55041d;

        /* renamed from: e */
        public long f55042e;

        /* renamed from: f */
        public int f55043f;

        /* renamed from: g */
        public long f55044g;

        /* renamed from: h */
        public DownloadChunk f55045h;

        /* renamed from: a */
        public final DownloadChunk mo41807a() {
            return new DownloadChunk(this);
        }

        /* renamed from: a */
        public final C20041a mo41805a(int i) {
            this.f55043f = i;
            return this;
        }

        /* renamed from: b */
        public final C20041a mo41808b(long j) {
            this.f55040c = j;
            return this;
        }

        /* renamed from: c */
        public final C20041a mo41809c(long j) {
            this.f55041d = j;
            return this;
        }

        /* renamed from: d */
        public final C20041a mo41810d(long j) {
            this.f55042e = j;
            return this;
        }

        /* renamed from: e */
        public final C20041a mo41811e(long j) {
            this.f55044g = j;
            return this;
        }

        public C20041a(int i) {
            this.f55038a = i;
        }

        /* renamed from: a */
        public final C20041a mo41806a(long j) {
            this.f55039b = j;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final int mo41785a() {
        if (this.f55036n == null) {
            return -1;
        }
        return this.f55036n.get();
    }

    /* renamed from: b */
    public final boolean mo41792b() {
        if (mo41785a() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo41794d() {
        if (this.f55030g == null || this.f55030g.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final long mo41799h() {
        if (this.f55035m != null) {
            return this.f55035m.get();
        }
        return 0;
    }

    /* renamed from: c */
    public final DownloadChunk mo41793c() {
        DownloadChunk downloadChunk;
        if (!mo41792b()) {
            downloadChunk = this.f55031h;
        } else {
            downloadChunk = this;
        }
        if (downloadChunk == null || !downloadChunk.mo41794d()) {
            return null;
        }
        return (DownloadChunk) downloadChunk.f55030g.get(0);
    }

    /* renamed from: e */
    public final boolean mo41796e() {
        if (this.f55031h == null) {
            return true;
        }
        if (!this.f55031h.mo41794d()) {
            return false;
        }
        for (int i = 0; i < this.f55031h.f55030g.size(); i++) {
            DownloadChunk downloadChunk = (DownloadChunk) this.f55031h.f55030g.get(i);
            if (downloadChunk != null) {
                int indexOf = this.f55031h.f55030g.indexOf(this);
                if (indexOf > i && !downloadChunk.mo41797f()) {
                    return false;
                }
                if (indexOf == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo41797f() {
        long j = this.f55025b;
        if (mo41792b() && this.f55029f > this.f55025b) {
            j = this.f55029f;
        }
        if (mo41800i() - j >= this.f55027d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final long mo41798g() {
        if (this.f55031h == null || this.f55031h.f55030g == null) {
            return -1;
        }
        int indexOf = this.f55031h.f55030g.indexOf(this);
        boolean z = false;
        for (int i = 0; i < this.f55031h.f55030g.size(); i++) {
            DownloadChunk downloadChunk = (DownloadChunk) this.f55031h.f55030g.get(i);
            if (downloadChunk != null) {
                if (z) {
                    return downloadChunk.mo41800i();
                }
                if (indexOf == i) {
                    z = true;
                }
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final long mo41801j() {
        long i = mo41800i() - this.f55025b;
        if (mo41794d()) {
            i = 0;
            for (int i2 = 0; i2 < this.f55030g.size(); i2++) {
                DownloadChunk downloadChunk = (DownloadChunk) this.f55030g.get(i2);
                if (downloadChunk != null) {
                    i += downloadChunk.mo41800i() - downloadChunk.f55025b;
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final long mo41800i() {
        if (!mo41792b() || !mo41794d()) {
            return mo41799h();
        }
        long j = 0;
        for (int i = 0; i < this.f55030g.size(); i++) {
            DownloadChunk downloadChunk = (DownloadChunk) this.f55030g.get(i);
            if (downloadChunk != null) {
                if (!downloadChunk.mo41797f()) {
                    return downloadChunk.mo41799h();
                }
                if (j < downloadChunk.mo41799h()) {
                    j = downloadChunk.mo41799h();
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    private void m49470a(int i) {
        if (this.f55036n == null) {
            this.f55036n = new AtomicInteger(i);
        } else {
            this.f55036n.set(i);
        }
    }

    protected DownloadChunk(Parcel parcel) {
        this.f55024a = parcel.readInt();
        this.f55025b = parcel.readLong();
        this.f55035m = new AtomicLong(parcel.readLong());
        this.f55026c = parcel.readLong();
        this.f55027d = parcel.readLong();
        this.f55028e = parcel.readInt();
        this.f55036n = new AtomicInteger(parcel.readInt());
    }

    /* renamed from: a */
    public final void mo41787a(long j) {
        if (this.f55035m != null) {
            this.f55035m.set(j);
        } else {
            this.f55035m = new AtomicLong(j);
        }
    }

    private DownloadChunk(C20041a aVar) {
        if (aVar != null) {
            this.f55024a = aVar.f55038a;
            this.f55025b = aVar.f55039b;
            this.f55035m = new AtomicLong(aVar.f55040c);
            this.f55026c = aVar.f55041d;
            this.f55027d = aVar.f55042e;
            this.f55028e = aVar.f55043f;
            this.f55029f = aVar.f55044g;
            this.f55036n = new AtomicInteger(-1);
            mo41789a(aVar.f55045h);
            this.f55034k = new AtomicBoolean(false);
        }
    }

    /* renamed from: a */
    public final void mo41788a(C19940b bVar) {
        this.f55037o = bVar;
        this.f55029f = mo41800i();
    }

    /* renamed from: b */
    public final long mo41791b(boolean z) {
        long i = mo41800i();
        long j = this.f55027d - (i - this.f55029f);
        if (!z && i == this.f55029f) {
            j = this.f55027d - (i - this.f55025b);
        }
        StringBuilder sb = new StringBuilder("contentLength:");
        sb.append(this.f55027d);
        sb.append(" curOffset:");
        sb.append(mo41800i());
        sb.append(" oldOffset:");
        sb.append(this.f55029f);
        sb.append(" retainLen:");
        sb.append(j);
        if (j < 0) {
            return 0;
        }
        return j;
    }

    public DownloadChunk(Cursor cursor) {
        if (cursor != null) {
            this.f55024a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f55028e = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
            this.f55025b = cursor.getLong(cursor.getColumnIndex("startOffset"));
            int columnIndex = cursor.getColumnIndex("curOffset");
            if (columnIndex != -1) {
                this.f55035m = new AtomicLong(cursor.getLong(columnIndex));
            } else {
                this.f55035m = new AtomicLong(0);
            }
            this.f55026c = cursor.getLong(cursor.getColumnIndex("endOffset"));
            int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
            if (columnIndex2 != -1) {
                this.f55036n = new AtomicInteger(cursor.getInt(columnIndex2));
            } else {
                this.f55036n = new AtomicInteger(-1);
            }
            int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
            if (columnIndex3 != -1) {
                this.f55027d = cursor.getLong(columnIndex3);
            }
            this.f55034k = new AtomicBoolean(false);
        }
    }

    /* renamed from: a */
    public final void mo41789a(DownloadChunk downloadChunk) {
        this.f55031h = downloadChunk;
        if (this.f55031h != null) {
            m49470a(this.f55031h.f55028e);
        }
    }

    /* renamed from: a */
    public final void mo41790a(boolean z) {
        if (this.f55034k == null) {
            this.f55034k = new AtomicBoolean(z);
        } else {
            this.f55034k.set(z);
        }
        this.f55037o = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        long j;
        parcel.writeInt(this.f55024a);
        parcel.writeLong(this.f55025b);
        if (this.f55035m != null) {
            j = this.f55035m.get();
        } else {
            j = 0;
        }
        parcel.writeLong(j);
        parcel.writeLong(this.f55026c);
        parcel.writeLong(this.f55027d);
        parcel.writeInt(this.f55028e);
        int i2 = -1;
        if (this.f55036n != null) {
            i2 = this.f55036n.get();
        }
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public final List<DownloadChunk> mo41786a(int i, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2 = i;
        if (!mo41792b() || mo41794d()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long h = mo41799h();
        long b = mo41791b(true);
        long j8 = b / ((long) i2);
        StringBuilder sb = new StringBuilder("retainLen:");
        sb.append(b);
        sb.append(" divideChunkForReuse chunkSize:");
        sb.append(j8);
        sb.append(" current host downloadChunk index:");
        sb.append(this.f55028e);
        long j9 = h;
        int i3 = 0;
        while (i3 < i2) {
            if (i3 == 0) {
                j4 = b;
                j6 = this.f55025b;
            } else {
                j4 = b;
                int i4 = i2 - 1;
                if (i3 == i4) {
                    long j10 = this.f55026c;
                    if (j10 > j9) {
                        j7 = (j10 - j9) + 1;
                    } else {
                        j7 = j4 - (((long) i4) * j8);
                    }
                    j3 = j7;
                    j5 = j10;
                    j6 = j9;
                    long j11 = j9;
                    long j12 = j3;
                    C20041a d = new C20041a(this.f55024a).mo41805a((-i3) - 1).mo41806a(j6).mo41808b(j9).mo41811e(j9).mo41809c(j5).mo41810d(j12);
                    d.f55045h = this;
                    DownloadChunk a = d.mo41807a();
                    StringBuilder sb2 = new StringBuilder("divide sub chunk : ");
                    sb2.append(i3);
                    sb2.append(" startOffset:");
                    sb2.append(j6);
                    sb2.append(" curOffset:");
                    long j13 = j11;
                    sb2.append(j13);
                    sb2.append(" endOffset:");
                    sb2.append(j5);
                    sb2.append(" contentLen:");
                    sb2.append(j12);
                    arrayList.add(a);
                    j9 = j13 + j8;
                    i3++;
                    b = j4;
                } else {
                    j6 = j9;
                }
            }
            j5 = (j9 + j8) - 1;
            j3 = j8;
            long j112 = j9;
            long j122 = j3;
            C20041a d2 = new C20041a(this.f55024a).mo41805a((-i3) - 1).mo41806a(j6).mo41808b(j9).mo41811e(j9).mo41809c(j5).mo41810d(j122);
            d2.f55045h = this;
            DownloadChunk a2 = d2.mo41807a();
            StringBuilder sb22 = new StringBuilder("divide sub chunk : ");
            sb22.append(i3);
            sb22.append(" startOffset:");
            sb22.append(j6);
            sb22.append(" curOffset:");
            long j132 = j112;
            sb22.append(j132);
            sb22.append(" endOffset:");
            sb22.append(j5);
            sb22.append(" contentLen:");
            sb22.append(j122);
            arrayList.add(a2);
            j9 = j132 + j8;
            i3++;
            b = j4;
        }
        long j14 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            DownloadChunk downloadChunk = (DownloadChunk) arrayList.get(size);
            if (downloadChunk != null) {
                j14 += downloadChunk.f55027d;
            }
        }
        new StringBuilder("reuseChunkContentLen:").append(j14);
        DownloadChunk downloadChunk2 = (DownloadChunk) arrayList.get(0);
        if (downloadChunk2 != null) {
            if (this.f55026c == 0) {
                j2 = j - this.f55025b;
            } else {
                j2 = (this.f55026c - this.f55025b) + 1;
            }
            downloadChunk2.f55027d = j2 - j14;
            downloadChunk2.f55028e = this.f55028e;
            if (this.f55037o != null) {
                C19940b bVar = this.f55037o;
                long j15 = downloadChunk2.f55026c;
                long j16 = this.f55027d - j14;
                if (bVar.f54800a != null) {
                    C19889e eVar = bVar.f54800a;
                    eVar.f54647d = j15;
                    eVar.f54648e = j16;
                }
            }
        }
        this.f55030g = arrayList;
        return arrayList;
    }
}
