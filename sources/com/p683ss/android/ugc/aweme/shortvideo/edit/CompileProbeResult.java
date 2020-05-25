package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult */
public final class CompileProbeResult implements Parcelable, Serializable {
    public static final Creator CREATOR = new C43314a();

    /* renamed from: a */
    private final ResultStatus f109511a;

    /* renamed from: b */
    private final ResultData f109512b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData */
    public static final class ResultData implements Parcelable, Serializable {
        public static final Creator CREATOR = new C43311a();

        /* renamed from: a */
        private final int f109513a;

        /* renamed from: b */
        private final float f109514b;

        /* renamed from: c */
        private final int f109515c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData$a */
        public static class C43311a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C52711k.m112240b(parcel, "in");
                return new ResultData(parcel.readInt(), parcel.readFloat(), parcel.readInt());
            }

            public final Object[] newArray(int i) {
                return new ResultData[i];
            }
        }

        public static /* synthetic */ ResultData copy$default(ResultData resultData, int i, float f, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = resultData.f109513a;
            }
            if ((i3 & 2) != 0) {
                f = resultData.f109514b;
            }
            if ((i3 & 4) != 0) {
                i2 = resultData.f109515c;
            }
            return resultData.copy(i, f, i2);
        }

        public final int component1() {
            return this.f109513a;
        }

        public final float component2() {
            return this.f109514b;
        }

        public final int component3() {
            return this.f109515c;
        }

        public final ResultData copy(int i, float f, int i2) {
            return new ResultData(i, f, i2);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ResultData) {
                    ResultData resultData = (ResultData) obj;
                    if ((this.f109513a == resultData.f109513a) && Float.compare(this.f109514b, resultData.f109514b) == 0) {
                        if (this.f109515c == resultData.f109515c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int getCrf() {
            return this.f109513a;
        }

        public final int getDurationMs() {
            return this.f109515c;
        }

        public final float getVideoBitrate() {
            return this.f109514b;
        }

        public final int hashCode() {
            return (((this.f109513a * 31) + Float.floatToIntBits(this.f109514b)) * 31) + this.f109515c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultData(crf=");
            sb.append(this.f109513a);
            sb.append(", videoBitrate=");
            sb.append(this.f109514b);
            sb.append(", durationMs=");
            sb.append(this.f109515c);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C52711k.m112240b(parcel, "parcel");
            parcel.writeInt(this.f109513a);
            parcel.writeFloat(this.f109514b);
            parcel.writeInt(this.f109515c);
        }

        public ResultData(int i, float f, int i2) {
            this.f109513a = i;
            this.f109514b = f;
            this.f109515c = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus */
    public static final class ResultStatus implements Parcelable, Serializable {
        public static final Creator CREATOR = new C43312a();

        /* renamed from: a */
        private final State f109516a;

        /* renamed from: b */
        private final int f109517b;

        /* renamed from: c */
        private final int f109518c;

        /* renamed from: d */
        private final String f109519d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus$a */
        public static class C43312a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C52711k.m112240b(parcel, "in");
                return new ResultStatus((State) Enum.valueOf(State.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new ResultStatus[i];
            }
        }

        public static /* synthetic */ ResultStatus copy$default(ResultStatus resultStatus, State state, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                state = resultStatus.f109516a;
            }
            if ((i3 & 2) != 0) {
                i = resultStatus.f109517b;
            }
            if ((i3 & 4) != 0) {
                i2 = resultStatus.f109518c;
            }
            if ((i3 & 8) != 0) {
                str = resultStatus.f109519d;
            }
            return resultStatus.copy(state, i, i2, str);
        }

        public final State component1() {
            return this.f109516a;
        }

        public final int component2() {
            return this.f109517b;
        }

        public final int component3() {
            return this.f109518c;
        }

        public final String component4() {
            return this.f109519d;
        }

        public final ResultStatus copy(State state, int i, int i2, String str) {
            C52711k.m112240b(state, "state");
            C52711k.m112240b(str, "msg");
            return new ResultStatus(state, i, i2, str);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ResultStatus) {
                    ResultStatus resultStatus = (ResultStatus) obj;
                    if (C52711k.m112239a((Object) this.f109516a, (Object) resultStatus.f109516a)) {
                        if (this.f109517b == resultStatus.f109517b) {
                            if (!(this.f109518c == resultStatus.f109518c) || !C52711k.m112239a((Object) this.f109519d, (Object) resultStatus.f109519d)) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String getMsg() {
            return this.f109519d;
        }

        public final State getState() {
            return this.f109516a;
        }

        public final int getToolsCode() {
            return this.f109518c;
        }

        public final int getVeCode() {
            return this.f109517b;
        }

        public final int hashCode() {
            State state = this.f109516a;
            int i = 0;
            int hashCode = (((((state != null ? state.hashCode() : 0) * 31) + this.f109517b) * 31) + this.f109518c) * 31;
            String str = this.f109519d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultStatus(state=");
            sb.append(this.f109516a);
            sb.append(", veCode=");
            sb.append(this.f109517b);
            sb.append(", toolsCode=");
            sb.append(this.f109518c);
            sb.append(", msg=");
            sb.append(this.f109519d);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C52711k.m112240b(parcel, "parcel");
            parcel.writeString(this.f109516a.name());
            parcel.writeInt(this.f109517b);
            parcel.writeInt(this.f109518c);
            parcel.writeString(this.f109519d);
        }

        public ResultStatus(State state, int i, int i2, String str) {
            C52711k.m112240b(state, "state");
            C52711k.m112240b(str, "msg");
            this.f109516a = state;
            this.f109517b = i;
            this.f109518c = i2;
            this.f109519d = str;
        }

        public /* synthetic */ ResultStatus(State state, int i, int i2, String str, int i3, C52707g gVar) {
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            if ((i3 & 8) != 0) {
                str = "";
            }
            this(state, i, i2, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State */
    public enum State implements Parcelable, Serializable {
        SUCCESS,
        ERROR,
        CANCEL;
        
        public static final Creator CREATOR = null;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State$a */
        public static class C43313a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C52711k.m112240b(parcel, "in");
                return (State) Enum.valueOf(State.class, parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new State[i];
            }
        }

        static {
            CREATOR = new C43313a();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C52711k.m112240b(parcel, "parcel");
            parcel.writeString(name());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$a */
    public static class C43314a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new CompileProbeResult((ResultStatus) ResultStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? (ResultData) ResultData.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new CompileProbeResult[i];
        }
    }

    public static /* synthetic */ CompileProbeResult copy$default(CompileProbeResult compileProbeResult, ResultStatus resultStatus, ResultData resultData, int i, Object obj) {
        if ((i & 1) != 0) {
            resultStatus = compileProbeResult.f109511a;
        }
        if ((i & 2) != 0) {
            resultData = compileProbeResult.f109512b;
        }
        return compileProbeResult.copy(resultStatus, resultData);
    }

    public final ResultStatus component1() {
        return this.f109511a;
    }

    public final ResultData component2() {
        return this.f109512b;
    }

    public final CompileProbeResult copy(ResultStatus resultStatus, ResultData resultData) {
        C52711k.m112240b(resultStatus, "status");
        return new CompileProbeResult(resultStatus, resultData);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f109512b, (java.lang.Object) r3.f109512b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r3 = (com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult) r3
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r0 = r2.f109511a
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r1 = r3.f109511a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r0 = r2.f109512b
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r3 = r3.f109512b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.equals(java.lang.Object):boolean");
    }

    public final ResultData getData() {
        return this.f109512b;
    }

    public final ResultStatus getStatus() {
        return this.f109511a;
    }

    public final int hashCode() {
        ResultStatus resultStatus = this.f109511a;
        int i = 0;
        int hashCode = (resultStatus != null ? resultStatus.hashCode() : 0) * 31;
        ResultData resultData = this.f109512b;
        if (resultData != null) {
            i = resultData.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompileProbeResult(status=");
        sb.append(this.f109511a);
        sb.append(", data=");
        sb.append(this.f109512b);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        this.f109511a.writeToParcel(parcel, 0);
        ResultData resultData = this.f109512b;
        if (resultData != null) {
            parcel.writeInt(1);
            resultData.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public CompileProbeResult(ResultStatus resultStatus, ResultData resultData) {
        C52711k.m112240b(resultStatus, "status");
        this.f109511a = resultStatus;
        this.f109512b = resultData;
    }

    public /* synthetic */ CompileProbeResult(ResultStatus resultStatus, ResultData resultData, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            resultData = null;
        }
        this(resultStatus, resultData);
    }
}
