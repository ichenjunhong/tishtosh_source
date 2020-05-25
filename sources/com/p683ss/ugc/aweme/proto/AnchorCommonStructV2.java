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

/* renamed from: com.ss.ugc.aweme.proto.AnchorCommonStructV2 */
public final class AnchorCommonStructV2 extends Message<AnchorCommonStructV2, Builder> {
    public static final ProtoAdapter<AnchorCommonStructV2> ADAPTER = new ProtoAdapter_AnchorCommonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String deep_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public Integer general_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 7)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)

    /* renamed from: id */
    public String f128786id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String log_extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String universal_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String url;

    /* renamed from: com.ss.ugc.aweme.proto.AnchorCommonStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AnchorCommonStructV2, Builder> {
        public String deep_link;
        public String extra;
        public Integer general_type;
        public UrlStructV2 icon;

        /* renamed from: id */
        public String f128787id;
        public String keyword;
        public String language;
        public String log_extra;
        public String schema;
        public Integer type;
        public String universal_link;
        public String url;

        public final AnchorCommonStructV2 build() {
            AnchorCommonStructV2 anchorCommonStructV2 = new AnchorCommonStructV2(this.keyword, this.url, this.language, this.schema, this.f128787id, this.type, this.icon, this.extra, this.deep_link, this.universal_link, this.general_type, this.log_extra, super.buildUnknownFields());
            return anchorCommonStructV2;
        }

        public final Builder deep_link(String str) {
            this.deep_link = str;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder general_type(Integer num) {
            this.general_type = num;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        /* renamed from: id */
        public final Builder mo103786id(String str) {
            this.f128787id = str;
            return this;
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder log_extra(String str) {
            this.log_extra = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder universal_link(String str) {
            this.universal_link = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorCommonStructV2$ProtoAdapter_AnchorCommonStructV2 */
    static final class ProtoAdapter_AnchorCommonStructV2 extends ProtoAdapter<AnchorCommonStructV2> {
        public ProtoAdapter_AnchorCommonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorCommonStructV2.class);
        }

        public final AnchorCommonStructV2 decode(ProtoReader protoReader) throws IOException {
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
                            builder.url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.language((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.mo103786id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.deep_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.universal_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.general_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.log_extra((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final int encodedSize(AnchorCommonStructV2 anchorCommonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorCommonStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorCommonStructV2.url) + ProtoAdapter.STRING.encodedSizeWithTag(3, anchorCommonStructV2.language) + ProtoAdapter.STRING.encodedSizeWithTag(4, anchorCommonStructV2.schema) + ProtoAdapter.STRING.encodedSizeWithTag(5, anchorCommonStructV2.f128786id) + ProtoAdapter.INT32.encodedSizeWithTag(6, anchorCommonStructV2.type) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, anchorCommonStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(8, anchorCommonStructV2.extra) + ProtoAdapter.STRING.encodedSizeWithTag(9, anchorCommonStructV2.deep_link) + ProtoAdapter.STRING.encodedSizeWithTag(10, anchorCommonStructV2.universal_link) + ProtoAdapter.INT32.encodedSizeWithTag(11, anchorCommonStructV2.general_type) + ProtoAdapter.STRING.encodedSizeWithTag(12, anchorCommonStructV2.log_extra) + anchorCommonStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AnchorCommonStructV2 anchorCommonStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorCommonStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorCommonStructV2.url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, anchorCommonStructV2.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, anchorCommonStructV2.schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, anchorCommonStructV2.f128786id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, anchorCommonStructV2.type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, anchorCommonStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, anchorCommonStructV2.extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, anchorCommonStructV2.deep_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, anchorCommonStructV2.universal_link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, anchorCommonStructV2.general_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, anchorCommonStructV2.log_extra);
            protoWriter.writeBytes(anchorCommonStructV2.unknownFields());
        }
    }

    public AnchorCommonStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.url = this.url;
        builder.language = this.language;
        builder.schema = this.schema;
        builder.f128787id = this.f128786id;
        builder.type = this.type;
        builder.icon = this.icon;
        builder.extra = this.extra;
        builder.deep_link = this.deep_link;
        builder.universal_link = this.universal_link;
        builder.general_type = this.general_type;
        builder.log_extra = this.log_extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i13 = 0;
        if (this.keyword != null) {
            i = this.keyword.hashCode();
        } else {
            i = 0;
        }
        int i14 = (hashCode + i) * 37;
        if (this.url != null) {
            i2 = this.url.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 37;
        if (this.language != null) {
            i3 = this.language.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 37;
        if (this.schema != null) {
            i4 = this.schema.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 37;
        if (this.f128786id != null) {
            i5 = this.f128786id.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 37;
        if (this.type != null) {
            i6 = this.type.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 37;
        if (this.icon != null) {
            i7 = this.icon.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 37;
        if (this.extra != null) {
            i8 = this.extra.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 37;
        if (this.deep_link != null) {
            i9 = this.deep_link.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 37;
        if (this.universal_link != null) {
            i10 = this.universal_link.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 37;
        if (this.general_type != null) {
            i11 = this.general_type.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 37;
        if (this.log_extra != null) {
            i13 = this.log_extra.hashCode();
        }
        int i25 = i24 + i13;
        this.hashCode = i25;
        return i25;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.f128786id != null) {
            sb.append(", id=");
            sb.append(this.f128786id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.deep_link != null) {
            sb.append(", deep_link=");
            sb.append(this.deep_link);
        }
        if (this.universal_link != null) {
            sb.append(", universal_link=");
            sb.append(this.universal_link);
        }
        if (this.general_type != null) {
            sb.append(", general_type=");
            sb.append(this.general_type);
        }
        if (this.log_extra != null) {
            sb.append(", log_extra=");
            sb.append(this.log_extra);
        }
        StringBuilder replace = sb.replace(0, 2, "AnchorCommonStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorCommonStructV2)) {
            return false;
        }
        AnchorCommonStructV2 anchorCommonStructV2 = (AnchorCommonStructV2) obj;
        if (!unknownFields().equals(anchorCommonStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorCommonStructV2.keyword) || !Internal.equals(this.url, anchorCommonStructV2.url) || !Internal.equals(this.language, anchorCommonStructV2.language) || !Internal.equals(this.schema, anchorCommonStructV2.schema) || !Internal.equals(this.f128786id, anchorCommonStructV2.f128786id) || !Internal.equals(this.type, anchorCommonStructV2.type) || !Internal.equals(this.icon, anchorCommonStructV2.icon) || !Internal.equals(this.extra, anchorCommonStructV2.extra) || !Internal.equals(this.deep_link, anchorCommonStructV2.deep_link) || !Internal.equals(this.universal_link, anchorCommonStructV2.universal_link) || !Internal.equals(this.general_type, anchorCommonStructV2.general_type) || !Internal.equals(this.log_extra, anchorCommonStructV2.log_extra)) {
            return false;
        }
        return true;
    }

    public AnchorCommonStructV2(String str, String str2, String str3, String str4, String str5, Integer num, UrlStructV2 urlStructV2, String str6, String str7, String str8, Integer num2, String str9) {
        this(str, str2, str3, str4, str5, num, urlStructV2, str6, str7, str8, num2, str9, ByteString.EMPTY);
    }

    public AnchorCommonStructV2(String str, String str2, String str3, String str4, String str5, Integer num, UrlStructV2 urlStructV2, String str6, String str7, String str8, Integer num2, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.url = str2;
        this.language = str3;
        this.schema = str4;
        this.f128786id = str5;
        this.type = num;
        this.icon = urlStructV2;
        this.extra = str6;
        this.deep_link = str7;
        this.universal_link = str8;
        this.general_type = num2;
        this.log_extra = str9;
    }
}
