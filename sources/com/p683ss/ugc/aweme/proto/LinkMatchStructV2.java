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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.LinkMatchStructV2 */
public final class LinkMatchStructV2 extends Message<LinkMatchStructV2, Builder> {
    public static final ProtoAdapter<LinkMatchStructV2> ADAPTER = new ProtoAdapter_LinkMatchStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.CaptionInfoStructV2#ADAPTER", tag = 4)
    public CaptionInfoStructV2 caption_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MatchInfoStructV2#ADAPTER", label = Label.REPEATED, tag = 3)
    public List<MatchInfoStructV2> match_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer query_limit;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer total_limit;

    /* renamed from: com.ss.ugc.aweme.proto.LinkMatchStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LinkMatchStructV2, Builder> {
        public CaptionInfoStructV2 caption_info;
        public List<MatchInfoStructV2> match_info = Internal.newMutableList();
        public Integer query_limit;
        public Integer total_limit;

        public final LinkMatchStructV2 build() {
            LinkMatchStructV2 linkMatchStructV2 = new LinkMatchStructV2(this.total_limit, this.query_limit, this.match_info, this.caption_info, super.buildUnknownFields());
            return linkMatchStructV2;
        }

        public final Builder caption_info(CaptionInfoStructV2 captionInfoStructV2) {
            this.caption_info = captionInfoStructV2;
            return this;
        }

        public final Builder query_limit(Integer num) {
            this.query_limit = num;
            return this;
        }

        public final Builder total_limit(Integer num) {
            this.total_limit = num;
            return this;
        }

        public final Builder match_info(List<MatchInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.match_info = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LinkMatchStructV2$ProtoAdapter_LinkMatchStructV2 */
    static final class ProtoAdapter_LinkMatchStructV2 extends ProtoAdapter<LinkMatchStructV2> {
        public ProtoAdapter_LinkMatchStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMatchStructV2.class);
        }

        public final int encodedSize(LinkMatchStructV2 linkMatchStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, linkMatchStructV2.total_limit) + ProtoAdapter.INT32.encodedSizeWithTag(2, linkMatchStructV2.query_limit) + MatchInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(3, linkMatchStructV2.match_info) + CaptionInfoStructV2.ADAPTER.encodedSizeWithTag(4, linkMatchStructV2.caption_info) + linkMatchStructV2.unknownFields().size();
        }

        public final LinkMatchStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.total_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.query_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.match_info.add(MatchInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.caption_info((CaptionInfoStructV2) CaptionInfoStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, LinkMatchStructV2 linkMatchStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, linkMatchStructV2.total_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, linkMatchStructV2.query_limit);
            MatchInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, linkMatchStructV2.match_info);
            CaptionInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 4, linkMatchStructV2.caption_info);
            protoWriter.writeBytes(linkMatchStructV2.unknownFields());
        }
    }

    public LinkMatchStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.total_limit = this.total_limit;
        builder.query_limit = this.query_limit;
        builder.match_info = Internal.copyOf("match_info", this.match_info);
        builder.caption_info = this.caption_info;
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
        if (this.total_limit != null) {
            i = this.total_limit.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.query_limit != null) {
            i2 = this.query_limit.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i5 + i2) * 37) + this.match_info.hashCode()) * 37;
        if (this.caption_info != null) {
            i4 = this.caption_info.hashCode();
        }
        int i6 = hashCode2 + i4;
        this.hashCode = i6;
        return i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total_limit != null) {
            sb.append(", total_limit=");
            sb.append(this.total_limit);
        }
        if (this.query_limit != null) {
            sb.append(", query_limit=");
            sb.append(this.query_limit);
        }
        if (!this.match_info.isEmpty()) {
            sb.append(", match_info=");
            sb.append(this.match_info);
        }
        if (this.caption_info != null) {
            sb.append(", caption_info=");
            sb.append(this.caption_info);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkMatchStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkMatchStructV2)) {
            return false;
        }
        LinkMatchStructV2 linkMatchStructV2 = (LinkMatchStructV2) obj;
        if (!unknownFields().equals(linkMatchStructV2.unknownFields()) || !Internal.equals(this.total_limit, linkMatchStructV2.total_limit) || !Internal.equals(this.query_limit, linkMatchStructV2.query_limit) || !this.match_info.equals(linkMatchStructV2.match_info) || !Internal.equals(this.caption_info, linkMatchStructV2.caption_info)) {
            return false;
        }
        return true;
    }

    public LinkMatchStructV2(Integer num, Integer num2, List<MatchInfoStructV2> list, CaptionInfoStructV2 captionInfoStructV2) {
        this(num, num2, list, captionInfoStructV2, ByteString.EMPTY);
    }

    public LinkMatchStructV2(Integer num, Integer num2, List<MatchInfoStructV2> list, CaptionInfoStructV2 captionInfoStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_limit = num;
        this.query_limit = num2;
        this.match_info = Internal.immutableCopyOf("match_info", list);
        this.caption_info = captionInfoStructV2;
    }
}
