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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Option */
public final class com_ss_android_ugc_aweme_feed_helper_Option extends Message<com_ss_android_ugc_aweme_feed_helper_Option, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_Option> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Option();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3355)

    /* renamed from: id */
    public final Integer f85456id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3373707)
    public final String name;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Option$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_feed_helper_Option, Builder> {

        /* renamed from: id */
        public Integer f85457id;
        public String name;

        public final com_ss_android_ugc_aweme_feed_helper_Option build() {
            return new com_ss_android_ugc_aweme_feed_helper_Option(this.f85457id, this.name, super.buildUnknownFields());
        }

        /* renamed from: id */
        public final Builder mo69430id(Integer num) {
            this.f85457id = num;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Option$ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Option */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Option extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_Option> {
        public final com_ss_android_ugc_aweme_feed_helper_Option redact(com_ss_android_ugc_aweme_feed_helper_Option com_ss_android_ugc_aweme_feed_helper_option) {
            return com_ss_android_ugc_aweme_feed_helper_option;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Option() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_feed_helper_Option.class);
        }

        public final com_ss_android_ugc_aweme_feed_helper_Option decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_feed_helper_Option) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_feed_helper_Option com_ss_android_ugc_aweme_feed_helper_option) {
            return ProtoAdapter.INT32.encodedSizeWithTag(3355, com_ss_android_ugc_aweme_feed_helper_option.f85456id) + ProtoAdapter.STRING.encodedSizeWithTag(3373707, com_ss_android_ugc_aweme_feed_helper_option.name) + com_ss_android_ugc_aweme_feed_helper_option.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_feed_helper_Option com_ss_android_ugc_aweme_feed_helper_option) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3355, com_ss_android_ugc_aweme_feed_helper_option.f85456id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3373707, com_ss_android_ugc_aweme_feed_helper_option.name);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_feed_helper_option.unknownFields());
        }

        public final com_ss_android_ugc_aweme_feed_helper_Option decode(ProtoReader protoReader, com_ss_android_ugc_aweme_feed_helper_Option com_ss_android_ugc_aweme_feed_helper_option) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_feed_helper_Option com_ss_android_ugc_aweme_feed_helper_option2 = (com_ss_android_ugc_aweme_feed_helper_Option) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_feed_helper_Option.class, com_ss_android_ugc_aweme_feed_helper_option);
            if (com_ss_android_ugc_aweme_feed_helper_option2 != null) {
                builder = com_ss_android_ugc_aweme_feed_helper_option2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 3355) {
                    builder.mo69430id((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3373707) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_feed_helper_option2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final Integer getId() throws C10174a {
        if (this.f85456id != null) {
            return this.f85456id;
        }
        throw new C10174a();
    }

    public final String getName() throws C10174a {
        if (this.name != null) {
            return this.name;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f85457id = this.f85456id;
        builder.name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.f85456id != null) {
            i = this.f85456id.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.name != null) {
            i3 = this.name.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f85456id != null) {
            sb.append(", id=");
            sb.append(this.f85456id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_feed_helper_Option{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_feed_helper_Option)) {
            return false;
        }
        com_ss_android_ugc_aweme_feed_helper_Option com_ss_android_ugc_aweme_feed_helper_option = (com_ss_android_ugc_aweme_feed_helper_Option) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_feed_helper_option.unknownFields()) || !Internal.equals(this.f85456id, com_ss_android_ugc_aweme_feed_helper_option.f85456id) || !Internal.equals(this.name, com_ss_android_ugc_aweme_feed_helper_option.name)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_feed_helper_Option(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_feed_helper_Option(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f85456id = num;
        this.name = str;
    }
}
