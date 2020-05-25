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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_group_model_FamiliarGroupEnhanceConfig */
public final class C32839x1b64b235 extends Message<C32839x1b64b235, Builder> {
    public static final DefaultValueProtoAdapter<C32839x1b64b235> ADAPTER = new C32840x6513ad0d();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 89134860)
    public final Integer cell_click_disappear_threshold;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 197473107)
    public final Integer cell_float_days_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 28806286)
    public final Integer cell_float_max_count;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13683726)
    public final Integer cell_float_user_threshold;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 113329483)
    public final Integer cell_friend_threshold;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_group_model_FamiliarGroupEnhanceConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32839x1b64b235, Builder> {
        public Integer cell_click_disappear_threshold;
        public Integer cell_float_days_interval;
        public Integer cell_float_max_count;
        public Integer cell_float_user_threshold;
        public Integer cell_friend_threshold;

        public final C32839x1b64b235 build() {
            C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig = new C32839x1b64b235(this.cell_friend_threshold, this.cell_click_disappear_threshold, this.cell_float_user_threshold, this.cell_float_days_interval, this.cell_float_max_count, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig;
        }

        public final Builder cell_click_disappear_threshold(Integer num) {
            this.cell_click_disappear_threshold = num;
            return this;
        }

        public final Builder cell_float_days_interval(Integer num) {
            this.cell_float_days_interval = num;
            return this;
        }

        public final Builder cell_float_max_count(Integer num) {
            this.cell_float_max_count = num;
            return this;
        }

        public final Builder cell_float_user_threshold(Integer num) {
            this.cell_float_user_threshold = num;
            return this;
        }

        public final Builder cell_friend_threshold(Integer num) {
            this.cell_friend_threshold = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_group_model_FamiliarGroupEnhanceConfig$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_group_model_FamiliarGroupEnhanceConfig */
    static final class C32840x6513ad0d extends DefaultValueProtoAdapter<C32839x1b64b235> {
        public final C32839x1b64b235 redact(C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig) {
            return com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig;
        }

        public C32840x6513ad0d() {
            super(FieldEncoding.LENGTH_DELIMITED, C32839x1b64b235.class);
        }

        public final C32839x1b64b235 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32839x1b64b235) null);
        }

        public final int encodedSize(C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(113329483, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_friend_threshold) + ProtoAdapter.INT32.encodedSizeWithTag(89134860, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_click_disappear_threshold) + ProtoAdapter.INT32.encodedSizeWithTag(13683726, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_user_threshold) + ProtoAdapter.INT32.encodedSizeWithTag(197473107, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_days_interval) + ProtoAdapter.INT32.encodedSizeWithTag(28806286, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_max_count) + com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 113329483, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_friend_threshold);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 89134860, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_click_disappear_threshold);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13683726, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_user_threshold);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 197473107, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_days_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 28806286, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_max_count);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.unknownFields());
        }

        public final C32839x1b64b235 decode(ProtoReader protoReader, C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig) throws IOException {
            Builder builder;
            C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig2 = (C32839x1b64b235) C10617a.m21405a().mo18840a(C32839x1b64b235.class, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig);
            if (com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 13683726:
                            builder.cell_float_user_threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 28806286:
                            builder.cell_float_max_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 89134860:
                            builder.cell_click_disappear_threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 113329483:
                            builder.cell_friend_threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 197473107:
                            builder.cell_float_days_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig2 != null) {
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

    public final Integer getCellClickDisappearThreshold() throws C10174a {
        if (this.cell_click_disappear_threshold != null) {
            return this.cell_click_disappear_threshold;
        }
        throw new C10174a();
    }

    public final Integer getCellFloatDaysInterval() throws C10174a {
        if (this.cell_float_days_interval != null) {
            return this.cell_float_days_interval;
        }
        throw new C10174a();
    }

    public final Integer getCellFloatMaxCount() throws C10174a {
        if (this.cell_float_max_count != null) {
            return this.cell_float_max_count;
        }
        throw new C10174a();
    }

    public final Integer getCellFloatUserThreshold() throws C10174a {
        if (this.cell_float_user_threshold != null) {
            return this.cell_float_user_threshold;
        }
        throw new C10174a();
    }

    public final Integer getCellFriendThreshold() throws C10174a {
        if (this.cell_friend_threshold != null) {
            return this.cell_friend_threshold;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cell_friend_threshold = this.cell_friend_threshold;
        builder.cell_click_disappear_threshold = this.cell_click_disappear_threshold;
        builder.cell_float_user_threshold = this.cell_float_user_threshold;
        builder.cell_float_days_interval = this.cell_float_days_interval;
        builder.cell_float_max_count = this.cell_float_max_count;
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
        if (this.cell_friend_threshold != null) {
            i = this.cell_friend_threshold.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.cell_click_disappear_threshold != null) {
            i2 = this.cell_click_disappear_threshold.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.cell_float_user_threshold != null) {
            i3 = this.cell_float_user_threshold.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.cell_float_days_interval != null) {
            i4 = this.cell_float_days_interval.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.cell_float_max_count != null) {
            i6 = this.cell_float_max_count.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cell_friend_threshold != null) {
            sb.append(", cell_friend_threshold=");
            sb.append(this.cell_friend_threshold);
        }
        if (this.cell_click_disappear_threshold != null) {
            sb.append(", cell_click_disappear_threshold=");
            sb.append(this.cell_click_disappear_threshold);
        }
        if (this.cell_float_user_threshold != null) {
            sb.append(", cell_float_user_threshold=");
            sb.append(this.cell_float_user_threshold);
        }
        if (this.cell_float_days_interval != null) {
            sb.append(", cell_float_days_interval=");
            sb.append(this.cell_float_days_interval);
        }
        if (this.cell_float_max_count != null) {
            sb.append(", cell_float_max_count=");
            sb.append(this.cell_float_max_count);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_group_model_FamiliarGroupEnhanceConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32839x1b64b235)) {
            return false;
        }
        C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig = (C32839x1b64b235) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.unknownFields()) || !Internal.equals(this.cell_friend_threshold, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_friend_threshold) || !Internal.equals(this.cell_click_disappear_threshold, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_click_disappear_threshold) || !Internal.equals(this.cell_float_user_threshold, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_user_threshold) || !Internal.equals(this.cell_float_days_interval, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_days_interval) || !Internal.equals(this.cell_float_max_count, com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig.cell_float_max_count)) {
            return false;
        }
        return true;
    }

    public C32839x1b64b235(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this(num, num2, num3, num4, num5, ByteString.EMPTY);
    }

    public C32839x1b64b235(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cell_friend_threshold = num;
        this.cell_click_disappear_threshold = num2;
        this.cell_float_user_threshold = num3;
        this.cell_float_days_interval = num4;
        this.cell_float_max_count = num5;
    }
}
