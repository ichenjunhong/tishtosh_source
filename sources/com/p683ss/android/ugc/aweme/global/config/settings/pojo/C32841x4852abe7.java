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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_relations_model_RelationTypeParameters */
public final class C32841x4852abe7 extends Message<C32841x4852abe7, Builder> {
    public static final DefaultValueProtoAdapter<C32841x4852abe7> ADAPTER = new C32842x9201a6bf();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 96891546)
    public final String event;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3575610)
    public final Integer type;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_relations_model_RelationTypeParameters$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32841x4852abe7, Builder> {
        public String event;
        public Integer type;

        public final C32841x4852abe7 build() {
            return new C32841x4852abe7(this.type, this.event, super.buildUnknownFields());
        }

        public final Builder event(String str) {
            this.event = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_relations_model_RelationTypeParameters$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_relations_model_RelationTypeParameters */
    static final class C32842x9201a6bf extends DefaultValueProtoAdapter<C32841x4852abe7> {
        public final C32841x4852abe7 redact(C32841x4852abe7 com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters) {
            return com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters;
        }

        public C32842x9201a6bf() {
            super(FieldEncoding.LENGTH_DELIMITED, C32841x4852abe7.class);
        }

        public final C32841x4852abe7 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32841x4852abe7) null);
        }

        public final int encodedSize(C32841x4852abe7 com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters) {
            return ProtoAdapter.INT32.encodedSizeWithTag(3575610, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.type) + ProtoAdapter.STRING.encodedSizeWithTag(96891546, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.event) + com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32841x4852abe7 com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3575610, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 96891546, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.event);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.unknownFields());
        }

        public final C32841x4852abe7 decode(ProtoReader protoReader, C32841x4852abe7 com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters) throws IOException {
            Builder builder;
            C32841x4852abe7 com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters2 = (C32841x4852abe7) C10617a.m21405a().mo18840a(C32841x4852abe7.class, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters);
            if (com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 3575610) {
                    builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 96891546) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.event((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getEvent() throws C10174a {
        if (this.event != null) {
            return this.event;
        }
        throw new C10174a();
    }

    public final Integer getType() throws C10174a {
        if (this.type != null) {
            return this.type;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.event = this.event;
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
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.event != null) {
            i3 = this.event.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_relations_model_RelationTypeParameters{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32841x4852abe7)) {
            return false;
        }
        C32841x4852abe7 com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters = (C32841x4852abe7) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.unknownFields()) || !Internal.equals(this.type, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.type) || !Internal.equals(this.event, com_ss_android_ugc_aweme_im_sdk_relations_model_relationtypeparameters.event)) {
            return false;
        }
        return true;
    }

    public C32841x4852abe7(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public C32841x4852abe7(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.event = str;
    }
}
