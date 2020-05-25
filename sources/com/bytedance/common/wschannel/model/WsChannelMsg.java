package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WsChannelMsg implements Parcelable {
    public static final Creator<WsChannelMsg> CREATOR = new Creator<WsChannelMsg>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WsChannelMsg[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WsChannelMsg(parcel);
        }
    };

    /* renamed from: a */
    public static WsChannelMsg f25948a = new WsChannelMsg();

    /* renamed from: b */
    public long f25949b;

    /* renamed from: c */
    public long f25950c;

    /* renamed from: d */
    public int f25951d;

    /* renamed from: e */
    public int f25952e;

    /* renamed from: f */
    public List<MsgHeader> f25953f;

    /* renamed from: g */
    public String f25954g;

    /* renamed from: h */
    public String f25955h;

    /* renamed from: i */
    public byte[] f25956i;

    /* renamed from: j */
    public ComponentName f25957j;

    /* renamed from: k */
    public int f25958k;

    public static class MsgHeader implements Parcelable {
        public static final Creator<MsgHeader> CREATOR = new Creator<MsgHeader>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MsgHeader[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.f25959a = parcel.readString();
                msgHeader.f25960b = parcel.readString();
                return msgHeader;
            }
        };

        /* renamed from: a */
        public String f25959a;

        /* renamed from: b */
        public String f25960b;

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MsgHeader{key='");
            sb.append(this.f25959a);
            sb.append('\'');
            sb.append(", value='");
            sb.append(this.f25960b);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f25959a);
            parcel.writeString(this.f25960b);
        }
    }

    /* renamed from: com.bytedance.common.wschannel.model.WsChannelMsg$a */
    public static final class C9528a {

        /* renamed from: a */
        private final int f25961a;

        /* renamed from: b */
        private Map<String, String> f25962b = new HashMap();

        /* renamed from: c */
        private long f25963c;

        /* renamed from: d */
        private int f25964d;

        /* renamed from: e */
        private int f25965e;

        /* renamed from: f */
        private byte[] f25966f;

        /* renamed from: g */
        private String f25967g = "";

        /* renamed from: h */
        private String f25968h = "";

        /* renamed from: i */
        private long f25969i;

        /* renamed from: j */
        private ComponentName f25970j;

        /* renamed from: a */
        public final WsChannelMsg mo17304a() {
            if (this.f25961a <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.f25964d <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.f25965e <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.f25966f != null) {
                ArrayList arrayList = new ArrayList();
                for (Entry entry : this.f25962b.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.f25959a = (String) entry.getKey();
                    msgHeader.f25960b = (String) entry.getValue();
                    arrayList.add(msgHeader);
                }
                WsChannelMsg wsChannelMsg = new WsChannelMsg(this.f25961a, this.f25969i, this.f25963c, this.f25964d, this.f25965e, arrayList, this.f25968h, this.f25967g, this.f25966f, this.f25970j);
                return wsChannelMsg;
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        /* renamed from: a */
        public final C9528a mo17300a(long j) {
            this.f25963c = j;
            return this;
        }

        /* renamed from: b */
        public final C9528a mo17305b(int i) {
            this.f25964d = i;
            return this;
        }

        /* renamed from: c */
        public final C9528a mo17308c(int i) {
            this.f25965e = i;
            return this;
        }

        /* renamed from: a */
        public static C9528a m18907a(int i) {
            return new C9528a(i);
        }

        /* renamed from: b */
        public final C9528a mo17306b(long j) {
            this.f25969i = j;
            return this;
        }

        /* renamed from: a */
        public final C9528a mo17301a(String str) {
            this.f25967g = str;
            return this;
        }

        /* renamed from: b */
        public final C9528a mo17307b(String str) {
            this.f25968h = str;
            return this;
        }

        private C9528a(int i) {
            this.f25961a = i;
        }

        /* renamed from: a */
        public final C9528a mo17303a(byte[] bArr) {
            this.f25966f = bArr;
            return this;
        }

        /* renamed from: a */
        public final C9528a mo17302a(String str, String str2) {
            this.f25962b.put(str, str2);
            return this;
        }
    }

    public WsChannelMsg() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final byte[] mo17289a() {
        if (this.f25956i == null) {
            this.f25956i = new byte[1];
        }
        return this.f25956i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WsChannelMsg{, channelId = ");
        sb.append(this.f25958k);
        sb.append(", logId=");
        sb.append(this.f25950c);
        sb.append(", service=");
        sb.append(this.f25951d);
        sb.append(", method=");
        sb.append(this.f25952e);
        sb.append(", msgHeaders=");
        sb.append(this.f25953f);
        sb.append(", payloadEncoding='");
        sb.append(this.f25954g);
        sb.append('\'');
        sb.append(", payloadType='");
        sb.append(this.f25955h);
        sb.append('\'');
        sb.append(", payload=");
        sb.append(Arrays.toString(this.f25956i));
        sb.append(", replayToComponentName=");
        sb.append(this.f25957j);
        sb.append('}');
        return sb.toString();
    }

    protected WsChannelMsg(Parcel parcel) {
        this.f25949b = parcel.readLong();
        this.f25950c = parcel.readLong();
        this.f25951d = parcel.readInt();
        this.f25952e = parcel.readInt();
        this.f25953f = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f25954g = parcel.readString();
        this.f25955h = parcel.readString();
        this.f25956i = parcel.createByteArray();
        this.f25957j = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f25958k = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f25949b);
        parcel.writeLong(this.f25950c);
        parcel.writeInt(this.f25951d);
        parcel.writeInt(this.f25952e);
        parcel.writeTypedList(this.f25953f);
        parcel.writeString(this.f25954g);
        parcel.writeString(this.f25955h);
        parcel.writeByteArray(this.f25956i);
        parcel.writeParcelable(this.f25957j, i);
        parcel.writeInt(this.f25958k);
    }

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.f25958k = i;
        this.f25949b = j;
        this.f25950c = j2;
        this.f25951d = i2;
        this.f25952e = i3;
        this.f25953f = list;
        this.f25954g = str;
        this.f25955h = str2;
        this.f25956i = bArr;
        this.f25957j = componentName;
    }
}
