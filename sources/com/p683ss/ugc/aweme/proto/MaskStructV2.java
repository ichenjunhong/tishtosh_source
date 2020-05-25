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

/* renamed from: com.ss.ugc.aweme.proto.MaskStructV2 */
public final class MaskStructV2 extends Message<MaskStructV2, Builder> {
    public static final ProtoAdapter<MaskStructV2> ADAPTER = new ProtoAdapter_MaskStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String cancel_mask_label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = Label.REQUIRED, tag = 2)
    public Integer mask_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = Label.REQUIRED, tag = 1)
    public Boolean show_mask;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;

    /* renamed from: com.ss.ugc.aweme.proto.MaskStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MaskStructV2, Builder> {
        public String cancel_mask_label;
        public String content;
        public Integer mask_type;
        public Boolean show_mask;
        public Integer status;
        public String title;

        public final MaskStructV2 build() {
            if (this.show_mask == null || this.mask_type == null) {
                throw Internal.missingRequiredFields(this.show_mask, "show_mask", this.mask_type, "mask_type");
            }
            MaskStructV2 maskStructV2 = new MaskStructV2(this.show_mask, this.mask_type, this.status, this.title, this.content, this.cancel_mask_label, super.buildUnknownFields());
            return maskStructV2;
        }

        public final Builder cancel_mask_label(String str) {
            this.cancel_mask_label = str;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder mask_type(Integer num) {
            this.mask_type = num;
            return this;
        }

        public final Builder show_mask(Boolean bool) {
            this.show_mask = bool;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MaskStructV2$ProtoAdapter_MaskStructV2 */
    static final class ProtoAdapter_MaskStructV2 extends ProtoAdapter<MaskStructV2> {
        public ProtoAdapter_MaskStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MaskStructV2.class);
        }

        public final int encodedSize(MaskStructV2 maskStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, maskStructV2.show_mask) + ProtoAdapter.INT32.encodedSizeWithTag(2, maskStructV2.mask_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, maskStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, maskStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, maskStructV2.content) + ProtoAdapter.STRING.encodedSizeWithTag(6, maskStructV2.cancel_mask_label) + maskStructV2.unknownFields().size();
        }

        public final MaskStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_mask((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.mask_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.cancel_mask_label((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MaskStructV2 maskStructV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, maskStructV2.show_mask);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, maskStructV2.mask_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, maskStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, maskStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, maskStructV2.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, maskStructV2.cancel_mask_label);
            protoWriter.writeBytes(maskStructV2.unknownFields());
        }
    }

    public MaskStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_mask = this.show_mask;
        builder.mask_type = this.mask_type;
        builder.status = this.status;
        builder.title = this.title;
        builder.content = this.content;
        builder.cancel_mask_label = this.cancel_mask_label;
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
        int hashCode = ((((unknownFields().hashCode() * 37) + this.show_mask.hashCode()) * 37) + this.mask_type.hashCode()) * 37;
        int i5 = 0;
        if (this.status != null) {
            i = this.status.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.title != null) {
            i2 = this.title.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.content != null) {
            i3 = this.content.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.cancel_mask_label != null) {
            i5 = this.cancel_mask_label.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", show_mask=");
        sb.append(this.show_mask);
        sb.append(", mask_type=");
        sb.append(this.mask_type);
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.cancel_mask_label != null) {
            sb.append(", cancel_mask_label=");
            sb.append(this.cancel_mask_label);
        }
        StringBuilder replace = sb.replace(0, 2, "MaskStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaskStructV2)) {
            return false;
        }
        MaskStructV2 maskStructV2 = (MaskStructV2) obj;
        if (!unknownFields().equals(maskStructV2.unknownFields()) || !this.show_mask.equals(maskStructV2.show_mask) || !this.mask_type.equals(maskStructV2.mask_type) || !Internal.equals(this.status, maskStructV2.status) || !Internal.equals(this.title, maskStructV2.title) || !Internal.equals(this.content, maskStructV2.content) || !Internal.equals(this.cancel_mask_label, maskStructV2.cancel_mask_label)) {
            return false;
        }
        return true;
    }

    public MaskStructV2(Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this(bool, num, num2, str, str2, str3, ByteString.EMPTY);
    }

    public MaskStructV2(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_mask = bool;
        this.mask_type = num;
        this.status = num2;
        this.title = str;
        this.content = str2;
        this.cancel_mask_label = str3;
    }
}
