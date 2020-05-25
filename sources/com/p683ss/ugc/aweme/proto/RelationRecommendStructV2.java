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

/* renamed from: com.ss.ugc.aweme.proto.RelationRecommendStructV2 */
public final class RelationRecommendStructV2 extends Message<RelationRecommendStructV2, Builder> {
    public static final ProtoAdapter<RelationRecommendStructV2> ADAPTER = new ProtoAdapter_RelationRecommendStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long recommend_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String relation_text_key;

    /* renamed from: com.ss.ugc.aweme.proto.RelationRecommendStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RelationRecommendStructV2, Builder> {
        public Long recommend_type;
        public String relation_text_key;

        public final RelationRecommendStructV2 build() {
            return new RelationRecommendStructV2(this.recommend_type, this.relation_text_key, super.buildUnknownFields());
        }

        public final Builder recommend_type(Long l) {
            this.recommend_type = l;
            return this;
        }

        public final Builder relation_text_key(String str) {
            this.relation_text_key = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RelationRecommendStructV2$ProtoAdapter_RelationRecommendStructV2 */
    static final class ProtoAdapter_RelationRecommendStructV2 extends ProtoAdapter<RelationRecommendStructV2> {
        public ProtoAdapter_RelationRecommendStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelationRecommendStructV2.class);
        }

        public final int encodedSize(RelationRecommendStructV2 relationRecommendStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, relationRecommendStructV2.recommend_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, relationRecommendStructV2.relation_text_key) + relationRecommendStructV2.unknownFields().size();
        }

        public final RelationRecommendStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.recommend_type((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.relation_text_key((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RelationRecommendStructV2 relationRecommendStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, relationRecommendStructV2.recommend_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, relationRecommendStructV2.relation_text_key);
            protoWriter.writeBytes(relationRecommendStructV2.unknownFields());
        }
    }

    public RelationRecommendStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.recommend_type = this.recommend_type;
        builder.relation_text_key = this.relation_text_key;
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
        if (this.recommend_type != null) {
            i = this.recommend_type.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.relation_text_key != null) {
            i3 = this.relation_text_key.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.recommend_type != null) {
            sb.append(", recommend_type=");
            sb.append(this.recommend_type);
        }
        if (this.relation_text_key != null) {
            sb.append(", relation_text_key=");
            sb.append(this.relation_text_key);
        }
        StringBuilder replace = sb.replace(0, 2, "RelationRecommendStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationRecommendStructV2)) {
            return false;
        }
        RelationRecommendStructV2 relationRecommendStructV2 = (RelationRecommendStructV2) obj;
        if (!unknownFields().equals(relationRecommendStructV2.unknownFields()) || !Internal.equals(this.recommend_type, relationRecommendStructV2.recommend_type) || !Internal.equals(this.relation_text_key, relationRecommendStructV2.relation_text_key)) {
            return false;
        }
        return true;
    }

    public RelationRecommendStructV2(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public RelationRecommendStructV2(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recommend_type = l;
        this.relation_text_key = str;
    }
}
