package com.p683ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.CaptionInfoStructV2 */
public final class CaptionInfoStructV2 extends Message<CaptionInfoStructV2, Builder> {
    public static final ProtoAdapter<CaptionInfoStructV2> ADAPTER = new ProtoAdapter_CaptionInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String link;

    /* renamed from: com.ss.ugc.aweme.proto.CaptionInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CaptionInfoStructV2, Builder> {
        public String keyword;
        public String link;

        public final CaptionInfoStructV2 build() {
            return new CaptionInfoStructV2(this.keyword, this.link, super.buildUnknownFields());
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CaptionInfoStructV2$ProtoAdapter_CaptionInfoStructV2 */
    static final class ProtoAdapter_CaptionInfoStructV2 extends ProtoAdapter<CaptionInfoStructV2> {
        public ProtoAdapter_CaptionInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CaptionInfoStructV2.class);
        }

        public final int encodedSize(CaptionInfoStructV2 captionInfoStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, captionInfoStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, captionInfoStructV2.link) + captionInfoStructV2.unknownFields().size();
        }

        public final CaptionInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.keyword((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CaptionInfoStructV2 captionInfoStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, captionInfoStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, captionInfoStructV2.link);
            protoWriter.writeBytes(captionInfoStructV2.unknownFields());
        }
    }

    public CaptionInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.link = this.link;
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
        if (this.keyword != null) {
            i = this.keyword.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.link != null) {
            i3 = this.link.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "CaptionInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptionInfoStructV2)) {
            return false;
        }
        CaptionInfoStructV2 captionInfoStructV2 = (CaptionInfoStructV2) obj;
        if (!unknownFields().equals(captionInfoStructV2.unknownFields()) || !Internal.equals(this.keyword, captionInfoStructV2.keyword) || !Internal.equals(this.link, captionInfoStructV2.link)) {
            return false;
        }
        return true;
    }

    public CaptionInfoStructV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CaptionInfoStructV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.link = str2;
    }
}
