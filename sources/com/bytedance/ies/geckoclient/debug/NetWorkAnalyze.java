package com.bytedance.ies.geckoclient.debug;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.LinkedList;
import java.util.List;

public final class NetWorkAnalyze {

    /* renamed from: a */
    private static NetWorkAnalyze f29330a = new NetWorkAnalyze();

    /* renamed from: b */
    private final List<Session> f29331b = new LinkedList();

    /* renamed from: c */
    private Session f29332c = new Session() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Session mo19712a(long j) {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Session mo19713a(C10930a aVar) {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Session mo19714a(String str) {
            return this;
        }

        /* renamed from: a */
        public final Session mo19715a(Throwable th) {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Session mo19716b(String str) {
            return this;
        }

        /* renamed from: c */
        public final Session mo19717c(String str) {
            return this;
        }
    };

    public static class Session implements Parcelable {
        public static final Creator<Session> CREATOR = new Creator<Session>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Session[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Session(parcel);
            }
        };

        /* renamed from: b */
        public long f29334b;

        /* renamed from: c */
        long f29335c;

        /* renamed from: d */
        public C10930a f29336d;

        /* renamed from: e */
        public String f29337e;

        /* renamed from: f */
        public String f29338f;

        /* renamed from: g */
        public String f29339g;

        /* renamed from: h */
        public Throwable f29340h;

        public Session() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Session mo19712a(long j) {
            this.f29334b = j;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Session mo19716b(String str) {
            this.f29338f = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Session mo19713a(C10930a aVar) {
            this.f29336d = aVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Session mo19714a(String str) {
            this.f29337e = str;
            return this;
        }

        /* renamed from: c */
        public Session mo19717c(String str) {
            this.f29339g = str;
            this.f29335c = System.currentTimeMillis();
            return this;
        }

        /* renamed from: a */
        public Session mo19715a(Throwable th) {
            this.f29340h = th;
            this.f29335c = System.currentTimeMillis();
            return this;
        }

        protected Session(Parcel parcel) {
            C10930a aVar;
            this.f29334b = parcel.readLong();
            this.f29335c = parcel.readLong();
            int readInt = parcel.readInt();
            if (readInt == -1) {
                aVar = null;
            } else {
                aVar = C10930a.values()[readInt];
            }
            this.f29336d = aVar;
            this.f29337e = parcel.readString();
            this.f29338f = parcel.readString();
            this.f29339g = parcel.readString();
            this.f29340h = (Throwable) parcel.readSerializable();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeLong(this.f29334b);
            parcel.writeLong(this.f29335c);
            if (this.f29336d == null) {
                i2 = -1;
            } else {
                i2 = this.f29336d.ordinal();
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f29337e);
            parcel.writeString(this.f29338f);
            parcel.writeString(this.f29339g);
            parcel.writeSerializable(this.f29340h);
        }
    }

    /* renamed from: com.bytedance.ies.geckoclient.debug.NetWorkAnalyze$a */
    public enum C10930a {
        POST,
        GET
    }

    /* renamed from: a */
    public static NetWorkAnalyze m22173a() {
        return f29330a;
    }

    /* renamed from: a */
    private void m22174a(Session session) {
        synchronized (this.f29331b) {
            this.f29331b.add(session);
        }
    }

    /* renamed from: a */
    public final Session mo19710a(String str) {
        if (!C10931a.m22189a()) {
            return this.f29332c;
        }
        Session session = new Session();
        m22174a(session);
        session.mo19712a(System.currentTimeMillis()).mo19713a(C10930a.GET).mo19714a(str);
        return session;
    }

    /* renamed from: a */
    public final Session mo19711a(String str, String str2) {
        if (!C10931a.m22189a()) {
            return this.f29332c;
        }
        Session session = new Session();
        m22174a(session);
        session.mo19712a(System.currentTimeMillis()).mo19713a(C10930a.POST).mo19714a(str).mo19716b(str2);
        return session;
    }
}
