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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig */
public final class com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig extends Message<com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig> ADAPTER = new C32837xbca3ba10();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 95467907)
    public final Integer delay;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 200896764)
    public final Integer heartbeat;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7822245)
    public final Integer im_heartbeat;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig, Builder> {
        public Integer delay;
        public Integer heartbeat;
        public Integer im_heartbeat;

        public final com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig build() {
            return new com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig(this.delay, this.heartbeat, this.im_heartbeat, super.buildUnknownFields());
        }

        public final Builder delay(Integer num) {
            this.delay = num;
            return this;
        }

        public final Builder heartbeat(Integer num) {
            this.heartbeat = num;
            return this;
        }

        public final Builder im_heartbeat(Integer num) {
            this.im_heartbeat = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig */
    static final class C32837xbca3ba10 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig> {
        public final com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig redact(com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig;
        }

        public C32837xbca3ba10() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig.class);
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(95467907, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.delay) + ProtoAdapter.INT32.encodedSizeWithTag(200896764, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.heartbeat) + ProtoAdapter.INT32.encodedSizeWithTag(7822245, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.im_heartbeat) + com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 95467907, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.delay);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 200896764, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.heartbeat);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7822245, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.im_heartbeat);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.unknownFields());
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig decode(ProtoReader protoReader, com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig2 = (com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig.class, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig);
            if (com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 7822245) {
                    builder.im_heartbeat((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 95467907) {
                    builder.delay((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 200896764) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.heartbeat((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getDelay() throws C10174a {
        if (this.delay != null) {
            return this.delay;
        }
        throw new C10174a();
    }

    public final Integer getHeartbeat() throws C10174a {
        if (this.heartbeat != null) {
            return this.heartbeat;
        }
        throw new C10174a();
    }

    public final Integer getImHeartbeat() throws C10174a {
        if (this.im_heartbeat != null) {
            return this.im_heartbeat;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.delay = this.delay;
        builder.heartbeat = this.heartbeat;
        builder.im_heartbeat = this.im_heartbeat;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.delay != null) {
            i = this.delay.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.heartbeat != null) {
            i2 = this.heartbeat.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.im_heartbeat != null) {
            i4 = this.im_heartbeat.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.delay != null) {
            sb.append(", delay=");
            sb.append(this.delay);
        }
        if (this.heartbeat != null) {
            sb.append(", heartbeat=");
            sb.append(this.heartbeat);
        }
        if (this.im_heartbeat != null) {
            sb.append(", im_heartbeat=");
            sb.append(this.im_heartbeat);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig)) {
            return false;
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig = (com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.unknownFields()) || !Internal.equals(this.delay, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.delay) || !Internal.equals(this.heartbeat, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.heartbeat) || !Internal.equals(this.im_heartbeat, com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig.im_heartbeat)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.delay = num;
        this.heartbeat = num2;
        this.im_heartbeat = num3;
    }
}
