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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig */
public final class com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig extends Message<com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig> ADAPTER = new C32829x1e1b22c9();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 25965065)
    public final Long bi_cancel_interval_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 249802179)
    public final Integer feed_trigger_threshold;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurvey#ADAPTER", tag = 72036999)
    public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey fixed_survey;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurvey#ADAPTER", tag = 115885651)
    public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey flexible_survey;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 50366535)
    public final Long show_interval_time;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig, Builder> {
        public Long bi_cancel_interval_time;
        public Integer feed_trigger_threshold;
        public com_ss_android_ugc_aweme_feed_helper_FeedSurvey fixed_survey;
        public com_ss_android_ugc_aweme_feed_helper_FeedSurvey flexible_survey;
        public Long show_interval_time;

        public final com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig build() {
            com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig = new com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig(this.show_interval_time, this.bi_cancel_interval_time, this.fixed_survey, this.flexible_survey, this.feed_trigger_threshold, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig;
        }

        public final Builder bi_cancel_interval_time(Long l) {
            this.bi_cancel_interval_time = l;
            return this;
        }

        public final Builder feed_trigger_threshold(Integer num) {
            this.feed_trigger_threshold = num;
            return this;
        }

        public final Builder fixed_survey(com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey) {
            this.fixed_survey = com_ss_android_ugc_aweme_feed_helper_feedsurvey;
            return this;
        }

        public final Builder flexible_survey(com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey) {
            this.flexible_survey = com_ss_android_ugc_aweme_feed_helper_feedsurvey;
            return this;
        }

        public final Builder show_interval_time(Long l) {
            this.show_interval_time = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig$ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig */
    static final class C32829x1e1b22c9 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig> {
        public final com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig redact(com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig) {
            return com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig;
        }

        public C32829x1e1b22c9() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig.class);
        }

        public final com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig) {
            return ProtoAdapter.INT64.encodedSizeWithTag(50366535, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.show_interval_time) + ProtoAdapter.INT64.encodedSizeWithTag(25965065, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.bi_cancel_interval_time) + com_ss_android_ugc_aweme_feed_helper_FeedSurvey.ADAPTER.encodedSizeWithTag(72036999, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.fixed_survey) + com_ss_android_ugc_aweme_feed_helper_FeedSurvey.ADAPTER.encodedSizeWithTag(115885651, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.flexible_survey) + ProtoAdapter.INT32.encodedSizeWithTag(249802179, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.feed_trigger_threshold) + com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 50366535, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.show_interval_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 25965065, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.bi_cancel_interval_time);
            com_ss_android_ugc_aweme_feed_helper_FeedSurvey.ADAPTER.encodeWithTag(protoWriter, 72036999, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.fixed_survey);
            com_ss_android_ugc_aweme_feed_helper_FeedSurvey.ADAPTER.encodeWithTag(protoWriter, 115885651, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.flexible_survey);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 249802179, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.feed_trigger_threshold);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.unknownFields());
        }

        public final com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig decode(ProtoReader protoReader, com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig2 = (com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig.class, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig);
            if (com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig2 != null) {
                builder = com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 25965065:
                            builder.bi_cancel_interval_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 50366535:
                            builder.show_interval_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 72036999:
                            builder.fixed_survey((com_ss_android_ugc_aweme_feed_helper_FeedSurvey) com_ss_android_ugc_aweme_feed_helper_FeedSurvey.ADAPTER.decode(protoReader, builder.fixed_survey));
                            break;
                        case 115885651:
                            builder.flexible_survey((com_ss_android_ugc_aweme_feed_helper_FeedSurvey) com_ss_android_ugc_aweme_feed_helper_FeedSurvey.ADAPTER.decode(protoReader, builder.flexible_survey));
                            break;
                        case 249802179:
                            builder.feed_trigger_threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig2 != null) {
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

    public final Long getBiCancelIntervalTime() throws C10174a {
        if (this.bi_cancel_interval_time != null) {
            return this.bi_cancel_interval_time;
        }
        throw new C10174a();
    }

    public final Integer getFeedTriggerThreshold() throws C10174a {
        if (this.feed_trigger_threshold != null) {
            return this.feed_trigger_threshold;
        }
        throw new C10174a();
    }

    public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey getFixedSurvey() throws C10174a {
        if (this.fixed_survey != null) {
            return this.fixed_survey;
        }
        throw new C10174a();
    }

    public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey getFlexibleSurvey() throws C10174a {
        if (this.flexible_survey != null) {
            return this.flexible_survey;
        }
        throw new C10174a();
    }

    public final Long getShowIntervalTime() throws C10174a {
        if (this.show_interval_time != null) {
            return this.show_interval_time;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_interval_time = this.show_interval_time;
        builder.bi_cancel_interval_time = this.bi_cancel_interval_time;
        builder.fixed_survey = this.fixed_survey;
        builder.flexible_survey = this.flexible_survey;
        builder.feed_trigger_threshold = this.feed_trigger_threshold;
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
        if (this.show_interval_time != null) {
            i = this.show_interval_time.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.bi_cancel_interval_time != null) {
            i2 = this.bi_cancel_interval_time.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.fixed_survey != null) {
            i3 = this.fixed_survey.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.flexible_survey != null) {
            i4 = this.flexible_survey.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.feed_trigger_threshold != null) {
            i6 = this.feed_trigger_threshold.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_interval_time != null) {
            sb.append(", show_interval_time=");
            sb.append(this.show_interval_time);
        }
        if (this.bi_cancel_interval_time != null) {
            sb.append(", bi_cancel_interval_time=");
            sb.append(this.bi_cancel_interval_time);
        }
        if (this.fixed_survey != null) {
            sb.append(", fixed_survey=");
            sb.append(this.fixed_survey);
        }
        if (this.flexible_survey != null) {
            sb.append(", flexible_survey=");
            sb.append(this.flexible_survey);
        }
        if (this.feed_trigger_threshold != null) {
            sb.append(", feed_trigger_threshold=");
            sb.append(this.feed_trigger_threshold);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig)) {
            return false;
        }
        com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig = (com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.unknownFields()) || !Internal.equals(this.show_interval_time, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.show_interval_time) || !Internal.equals(this.bi_cancel_interval_time, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.bi_cancel_interval_time) || !Internal.equals(this.fixed_survey, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.fixed_survey) || !Internal.equals(this.flexible_survey, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.flexible_survey) || !Internal.equals(this.feed_trigger_threshold, com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig.feed_trigger_threshold)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig(Long l, Long l2, com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey, com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey2, Integer num) {
        this(l, l2, com_ss_android_ugc_aweme_feed_helper_feedsurvey, com_ss_android_ugc_aweme_feed_helper_feedsurvey2, num, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig(Long l, Long l2, com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey, com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_interval_time = l;
        this.bi_cancel_interval_time = l2;
        this.fixed_survey = com_ss_android_ugc_aweme_feed_helper_feedsurvey;
        this.flexible_survey = com_ss_android_ugc_aweme_feed_helper_feedsurvey2;
        this.feed_trigger_threshold = num;
    }
}
