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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_experiment_RegexpString */
public final class com_ss_android_ugc_aweme_experiment_RegexpString extends Message<com_ss_android_ugc_aweme_experiment_RegexpString, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_experiment_RegexpString> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_experiment_RegexpString();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 38872375)
    public final String normative_handle_regexp;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_experiment_RegexpString$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_experiment_RegexpString, Builder> {
        public String normative_handle_regexp;

        public final com_ss_android_ugc_aweme_experiment_RegexpString build() {
            return new com_ss_android_ugc_aweme_experiment_RegexpString(this.normative_handle_regexp, super.buildUnknownFields());
        }

        public final Builder normative_handle_regexp(String str) {
            this.normative_handle_regexp = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_experiment_RegexpString$ProtoAdapter_com_ss_android_ugc_aweme_experiment_RegexpString */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_experiment_RegexpString extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_experiment_RegexpString> {
        public final com_ss_android_ugc_aweme_experiment_RegexpString redact(com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring) {
            return com_ss_android_ugc_aweme_experiment_regexpstring;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_experiment_RegexpString() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_experiment_RegexpString.class);
        }

        public final com_ss_android_ugc_aweme_experiment_RegexpString decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_experiment_RegexpString) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring) {
            return ProtoAdapter.STRING.encodedSizeWithTag(38872375, com_ss_android_ugc_aweme_experiment_regexpstring.normative_handle_regexp) + com_ss_android_ugc_aweme_experiment_regexpstring.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 38872375, com_ss_android_ugc_aweme_experiment_regexpstring.normative_handle_regexp);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_experiment_regexpstring.unknownFields());
        }

        public final com_ss_android_ugc_aweme_experiment_RegexpString decode(ProtoReader protoReader, com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring2 = (com_ss_android_ugc_aweme_experiment_RegexpString) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_experiment_RegexpString.class, com_ss_android_ugc_aweme_experiment_regexpstring);
            if (com_ss_android_ugc_aweme_experiment_regexpstring2 != null) {
                builder = com_ss_android_ugc_aweme_experiment_regexpstring2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 38872375) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_experiment_regexpstring2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.normative_handle_regexp((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getNormativeHandleRegexp() throws C10174a {
        if (this.normative_handle_regexp != null) {
            return this.normative_handle_regexp;
        }
        throw new C10174a();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.normative_handle_regexp != null) {
            i = this.normative_handle_regexp.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.normative_handle_regexp = this.normative_handle_regexp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.normative_handle_regexp != null) {
            sb.append(", normative_handle_regexp=");
            sb.append(this.normative_handle_regexp);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_experiment_RegexpString{");
        replace.append('}');
        return replace.toString();
    }

    public com_ss_android_ugc_aweme_experiment_RegexpString(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_experiment_RegexpString)) {
            return false;
        }
        com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring = (com_ss_android_ugc_aweme_experiment_RegexpString) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_experiment_regexpstring.unknownFields()) || !Internal.equals(this.normative_handle_regexp, com_ss_android_ugc_aweme_experiment_regexpstring.normative_handle_regexp)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_experiment_RegexpString(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.normative_handle_regexp = str;
    }
}
