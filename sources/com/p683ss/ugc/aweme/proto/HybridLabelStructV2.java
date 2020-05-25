package com.p683ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.HybridLabelStructV2 */
public final class HybridLabelStructV2 extends Message<HybridLabelStructV2, Builder> {
    public static final ProtoAdapter<HybridLabelStructV2> ADAPTER = new ProtoAdapter_HybridLabelStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 1)
    public String background_color;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 image;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String ref_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 2)
    public String text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 3)
    public String text_color;

    /* renamed from: com.ss.ugc.aweme.proto.HybridLabelStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HybridLabelStructV2, Builder> {
        public String background_color;
        public UrlStructV2 image;
        public String ref_url;
        public String text;
        public String text_color;

        public final HybridLabelStructV2 build() {
            if (this.background_color == null || this.text == null || this.text_color == null) {
                throw Internal.missingRequiredFields(this.background_color, "background_color", this.text, "text", this.text_color, "text_color");
            }
            HybridLabelStructV2 hybridLabelStructV2 = new HybridLabelStructV2(this.background_color, this.text, this.text_color, this.image, this.ref_url, super.buildUnknownFields());
            return hybridLabelStructV2;
        }

        public final Builder background_color(String str) {
            this.background_color = str;
            return this;
        }

        public final Builder image(UrlStructV2 urlStructV2) {
            this.image = urlStructV2;
            return this;
        }

        public final Builder ref_url(String str) {
            this.ref_url = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder text_color(String str) {
            this.text_color = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.HybridLabelStructV2$ProtoAdapter_HybridLabelStructV2 */
    static final class ProtoAdapter_HybridLabelStructV2 extends ProtoAdapter<HybridLabelStructV2> {
        public ProtoAdapter_HybridLabelStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HybridLabelStructV2.class);
        }

        public final int encodedSize(HybridLabelStructV2 hybridLabelStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hybridLabelStructV2.background_color) + ProtoAdapter.STRING.encodedSizeWithTag(2, hybridLabelStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(3, hybridLabelStructV2.text_color) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, hybridLabelStructV2.image) + ProtoAdapter.STRING.encodedSizeWithTag(5, hybridLabelStructV2.ref_url) + hybridLabelStructV2.unknownFields().size();
        }

        public final HybridLabelStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.background_color((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.text_color((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.image((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.ref_url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, HybridLabelStructV2 hybridLabelStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hybridLabelStructV2.background_color);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hybridLabelStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, hybridLabelStructV2.text_color);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, hybridLabelStructV2.image);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, hybridLabelStructV2.ref_url);
            protoWriter.writeBytes(hybridLabelStructV2.unknownFields());
        }
    }

    public HybridLabelStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.background_color = this.background_color;
        builder.text = this.text;
        builder.text_color = this.text_color;
        builder.image = this.image;
        builder.ref_url = this.ref_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((unknownFields().hashCode() * 37) + this.background_color.hashCode()) * 37) + this.text.hashCode()) * 37) + this.text_color.hashCode()) * 37;
        int i3 = 0;
        if (this.image != null) {
            i = this.image.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.ref_url != null) {
            i3 = this.ref_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", background_color=");
        sb.append(this.background_color);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", text_color=");
        sb.append(this.text_color);
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.ref_url != null) {
            sb.append(", ref_url=");
            sb.append(this.ref_url);
        }
        StringBuilder replace = sb.replace(0, 2, "HybridLabelStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HybridLabelStructV2)) {
            return false;
        }
        HybridLabelStructV2 hybridLabelStructV2 = (HybridLabelStructV2) obj;
        if (!unknownFields().equals(hybridLabelStructV2.unknownFields()) || !this.background_color.equals(hybridLabelStructV2.background_color) || !this.text.equals(hybridLabelStructV2.text) || !this.text_color.equals(hybridLabelStructV2.text_color) || !Internal.equals(this.image, hybridLabelStructV2.image) || !Internal.equals(this.ref_url, hybridLabelStructV2.ref_url)) {
            return false;
        }
        return true;
    }

    public HybridLabelStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, String str4) {
        this(str, str2, str3, urlStructV2, str4, ByteString.EMPTY);
    }

    public HybridLabelStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.background_color = str;
        this.text = str2;
        this.text_color = str3;
        this.image = urlStructV2;
        this.ref_url = str4;
    }
}
