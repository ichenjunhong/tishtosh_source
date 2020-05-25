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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Sp */
public final class C32822Sp extends Message<C32822Sp, Builder> {
    public static final DefaultValueProtoAdapter<C32822Sp> ADAPTER = new ProtoAdapter_Sp();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String estr;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Sp$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32822Sp, Builder> {
        public String estr;

        public final C32822Sp build() {
            return new C32822Sp(this.estr, super.buildUnknownFields());
        }

        public final Builder estr(String str) {
            this.estr = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Sp$ProtoAdapter_Sp */
    static final class ProtoAdapter_Sp extends DefaultValueProtoAdapter<C32822Sp> {
        public final C32822Sp redact(C32822Sp sp) {
            return sp;
        }

        public ProtoAdapter_Sp() {
            super(FieldEncoding.LENGTH_DELIMITED, C32822Sp.class);
        }

        public final C32822Sp decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32822Sp) null);
        }

        public final int encodedSize(C32822Sp sp) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sp.estr) + sp.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32822Sp sp) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sp.estr);
            protoWriter.writeBytes(sp.unknownFields());
        }

        public final C32822Sp decode(ProtoReader protoReader, C32822Sp sp) throws IOException {
            Builder builder;
            C32822Sp sp2 = (C32822Sp) C10617a.m21405a().mo18840a(C32822Sp.class, sp);
            if (sp2 != null) {
                builder = sp2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (sp2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.estr((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getEstr() throws C10174a {
        if (this.estr != null) {
            return this.estr;
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
        if (this.estr != null) {
            i = this.estr.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.estr = this.estr;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.estr != null) {
            sb.append(", estr=");
            sb.append(this.estr);
        }
        StringBuilder replace = sb.replace(0, 2, "Sp{");
        replace.append('}');
        return replace.toString();
    }

    public C32822Sp(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32822Sp)) {
            return false;
        }
        C32822Sp sp = (C32822Sp) obj;
        if (!unknownFields().equals(sp.unknownFields()) || !Internal.equals(this.estr, sp.estr)) {
            return false;
        }
        return true;
    }

    public C32822Sp(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.estr = str;
    }
}
