package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_legoImp_task_DvmLinearAllocOptTask__StackLeakCheckerParams */
public final class C32843x61052464 extends Message<C32843x61052464, Builder> {
    public static final DefaultValueProtoAdapter<C32843x61052464> ADAPTER = new C32844xec1e888c();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 74808797)
    public final Boolean all_proc_opt_suspend;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 96872842)
    public final Boolean auto_fix;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 243233963)
    public final Integer check_interval_mins;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 109877002)
    public final Boolean enable_checker;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 37569317)
    public final Integer report_threshold;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_legoImp_task_DvmLinearAllocOptTask__StackLeakCheckerParams$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32843x61052464, Builder> {
        public Boolean all_proc_opt_suspend;
        public Boolean auto_fix;
        public Integer check_interval_mins;
        public Boolean enable_checker;
        public Integer report_threshold;

        public final C32843x61052464 build() {
            C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams = new C32843x61052464(this.auto_fix, this.enable_checker, this.all_proc_opt_suspend, this.report_threshold, this.check_interval_mins, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams;
        }

        public final Builder all_proc_opt_suspend(Boolean bool) {
            this.all_proc_opt_suspend = bool;
            return this;
        }

        public final Builder auto_fix(Boolean bool) {
            this.auto_fix = bool;
            return this;
        }

        public final Builder check_interval_mins(Integer num) {
            this.check_interval_mins = num;
            return this;
        }

        public final Builder enable_checker(Boolean bool) {
            this.enable_checker = bool;
            return this;
        }

        public final Builder report_threshold(Integer num) {
            this.report_threshold = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_legoImp_task_DvmLinearAllocOptTask__StackLeakCheckerParams$ProtoAdapter_com_ss_android_ugc_aweme_legoImp_task_DvmLinearAllocOptTask__StackLeakCheckerParams */
    static final class C32844xec1e888c extends DefaultValueProtoAdapter<C32843x61052464> {
        public final C32843x61052464 redact(C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams) {
            return com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams;
        }

        public C32844xec1e888c() {
            super(FieldEncoding.LENGTH_DELIMITED, C32843x61052464.class);
        }

        public final C32843x61052464 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32843x61052464) null);
        }

        public final int encodedSize(C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(96872842, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.auto_fix) + ProtoAdapter.BOOL.encodedSizeWithTag(109877002, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.enable_checker) + ProtoAdapter.BOOL.encodedSizeWithTag(74808797, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.all_proc_opt_suspend) + ProtoAdapter.INT32.encodedSizeWithTag(37569317, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.report_threshold) + ProtoAdapter.INT32.encodedSizeWithTag(243233963, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.check_interval_mins) + com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 96872842, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.auto_fix);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 109877002, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.enable_checker);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 74808797, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.all_proc_opt_suspend);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 37569317, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.report_threshold);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 243233963, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.check_interval_mins);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.unknownFields());
        }

        public final C32843x61052464 decode(ProtoReader protoReader, C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams) throws IOException {
            Builder builder;
            C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams2 = (C32843x61052464) C10617a.m21405a().mo18840a(C32843x61052464.class, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams);
            if (com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams2 != null) {
                builder = com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 37569317:
                            builder.report_threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 74808797:
                            builder.all_proc_opt_suspend((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 96872842:
                            builder.auto_fix((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 109877002:
                            builder.enable_checker((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 243233963:
                            builder.check_interval_mins((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Boolean getAllProcOptSuspend() throws C10174a {
        if (this.all_proc_opt_suspend != null) {
            return this.all_proc_opt_suspend;
        }
        throw new C10174a();
    }

    public final Boolean getAutoFix() throws C10174a {
        if (this.auto_fix != null) {
            return this.auto_fix;
        }
        throw new C10174a();
    }

    public final Integer getCheckIntervalMins() throws C10174a {
        if (this.check_interval_mins != null) {
            return this.check_interval_mins;
        }
        throw new C10174a();
    }

    public final Boolean getEnableChecker() throws C10174a {
        if (this.enable_checker != null) {
            return this.enable_checker;
        }
        throw new C10174a();
    }

    public final Integer getReportThreshold() throws C10174a {
        if (this.report_threshold != null) {
            return this.report_threshold;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.auto_fix = this.auto_fix;
        builder.enable_checker = this.enable_checker;
        builder.all_proc_opt_suspend = this.all_proc_opt_suspend;
        builder.report_threshold = this.report_threshold;
        builder.check_interval_mins = this.check_interval_mins;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.auto_fix != null) {
            i = this.auto_fix.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.enable_checker != null) {
            i2 = this.enable_checker.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.all_proc_opt_suspend != null) {
            i3 = this.all_proc_opt_suspend.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.report_threshold != null) {
            i4 = this.report_threshold.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.check_interval_mins != null) {
            i6 = this.check_interval_mins.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.auto_fix != null) {
            sb.append(", auto_fix=");
            sb.append(this.auto_fix);
        }
        if (this.enable_checker != null) {
            sb.append(", enable_checker=");
            sb.append(this.enable_checker);
        }
        if (this.all_proc_opt_suspend != null) {
            sb.append(", all_proc_opt_suspend=");
            sb.append(this.all_proc_opt_suspend);
        }
        if (this.report_threshold != null) {
            sb.append(", report_threshold=");
            sb.append(this.report_threshold);
        }
        if (this.check_interval_mins != null) {
            sb.append(", check_interval_mins=");
            sb.append(this.check_interval_mins);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_legoImp_task_DvmLinearAllocOptTask__StackLeakCheckerParams{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32843x61052464)) {
            return false;
        }
        C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams = (C32843x61052464) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.unknownFields()) || !Internal.equals(this.auto_fix, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.auto_fix) || !Internal.equals(this.enable_checker, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.enable_checker) || !Internal.equals(this.all_proc_opt_suspend, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.all_proc_opt_suspend) || !Internal.equals(this.report_threshold, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.report_threshold) || !Internal.equals(this.check_interval_mins, com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams.check_interval_mins)) {
            return false;
        }
        return true;
    }

    public C32843x61052464(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        this(bool, bool2, bool3, num, num2, ByteString.EMPTY);
    }

    public C32843x61052464(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.auto_fix = bool;
        this.enable_checker = bool2;
        this.all_proc_opt_suspend = bool3;
        this.report_threshold = num;
        this.check_interval_mins = num2;
    }
}
