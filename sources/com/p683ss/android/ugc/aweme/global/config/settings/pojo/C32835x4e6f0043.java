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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_RelationFetchFrequencyConfig */
public final class C32835x4e6f0043 extends Message<C32835x4e6f0043, Builder> {
    public static final DefaultValueProtoAdapter<C32835x4e6f0043> ADAPTER = new C32836x7ae5b46b();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 85484688)
    public final Long coldup_update;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 98009792)
    public final Long font_update;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 171220677)
    public final Long frontier_update;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 33539898)
    public final Long update;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_RelationFetchFrequencyConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32835x4e6f0043, Builder> {
        public Long coldup_update;
        public Long font_update;
        public Long frontier_update;
        public Long update;

        public final C32835x4e6f0043 build() {
            C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig = new C32835x4e6f0043(this.update, this.coldup_update, this.frontier_update, this.font_update, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig;
        }

        public final Builder coldup_update(Long l) {
            this.coldup_update = l;
            return this;
        }

        public final Builder font_update(Long l) {
            this.font_update = l;
            return this;
        }

        public final Builder frontier_update(Long l) {
            this.frontier_update = l;
            return this;
        }

        public final Builder update(Long l) {
            this.update = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_RelationFetchFrequencyConfig$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_abtest_RelationFetchFrequencyConfig */
    static final class C32836x7ae5b46b extends DefaultValueProtoAdapter<C32835x4e6f0043> {
        public final C32835x4e6f0043 redact(C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig;
        }

        public C32836x7ae5b46b() {
            super(FieldEncoding.LENGTH_DELIMITED, C32835x4e6f0043.class);
        }

        public final C32835x4e6f0043 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32835x4e6f0043) null);
        }

        public final int encodedSize(C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig) {
            return ProtoAdapter.INT64.encodedSizeWithTag(33539898, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.update) + ProtoAdapter.INT64.encodedSizeWithTag(85484688, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.coldup_update) + ProtoAdapter.INT64.encodedSizeWithTag(171220677, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.frontier_update) + ProtoAdapter.INT64.encodedSizeWithTag(98009792, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.font_update) + com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 33539898, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.update);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 85484688, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.coldup_update);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 171220677, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.frontier_update);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 98009792, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.font_update);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.unknownFields());
        }

        public final C32835x4e6f0043 decode(ProtoReader protoReader, C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig) throws IOException {
            Builder builder;
            C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig2 = (C32835x4e6f0043) C10617a.m21405a().mo18840a(C32835x4e6f0043.class, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig);
            if (com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 33539898) {
                    builder.update((Long) ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 85484688) {
                    builder.coldup_update((Long) ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 98009792) {
                    builder.font_update((Long) ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 171220677) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.frontier_update((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }
    }

    public final Long getColdupUpdate() throws C10174a {
        if (this.coldup_update != null) {
            return this.coldup_update;
        }
        throw new C10174a();
    }

    public final Long getFontUpdate() throws C10174a {
        if (this.font_update != null) {
            return this.font_update;
        }
        throw new C10174a();
    }

    public final Long getFrontierUpdate() throws C10174a {
        if (this.frontier_update != null) {
            return this.frontier_update;
        }
        throw new C10174a();
    }

    public final Long getUpdate() throws C10174a {
        if (this.update != null) {
            return this.update;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.update = this.update;
        builder.coldup_update = this.coldup_update;
        builder.frontier_update = this.frontier_update;
        builder.font_update = this.font_update;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.update != null) {
            i = this.update.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.coldup_update != null) {
            i2 = this.coldup_update.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.frontier_update != null) {
            i3 = this.frontier_update.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.font_update != null) {
            i5 = this.font_update.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.update != null) {
            sb.append(", update=");
            sb.append(this.update);
        }
        if (this.coldup_update != null) {
            sb.append(", coldup_update=");
            sb.append(this.coldup_update);
        }
        if (this.frontier_update != null) {
            sb.append(", frontier_update=");
            sb.append(this.frontier_update);
        }
        if (this.font_update != null) {
            sb.append(", font_update=");
            sb.append(this.font_update);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_abtest_RelationFetchFrequencyConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32835x4e6f0043)) {
            return false;
        }
        C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig = (C32835x4e6f0043) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.unknownFields()) || !Internal.equals(this.update, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.update) || !Internal.equals(this.coldup_update, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.coldup_update) || !Internal.equals(this.frontier_update, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.frontier_update) || !Internal.equals(this.font_update, com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig.font_update)) {
            return false;
        }
        return true;
    }

    public C32835x4e6f0043(Long l, Long l2, Long l3, Long l4) {
        this(l, l2, l3, l4, ByteString.EMPTY);
    }

    public C32835x4e6f0043(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.update = l;
        this.coldup_update = l2;
        this.frontier_update = l3;
        this.font_update = l4;
    }
}
