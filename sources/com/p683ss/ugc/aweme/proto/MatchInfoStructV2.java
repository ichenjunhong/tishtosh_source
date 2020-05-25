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

/* renamed from: com.ss.ugc.aweme.proto.MatchInfoStructV2 */
public final class MatchInfoStructV2 extends Message<MatchInfoStructV2, Builder> {
    public static final ProtoAdapter<MatchInfoStructV2> ADAPTER = new ProtoAdapter_MatchInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer begin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String query;

    /* renamed from: com.ss.ugc.aweme.proto.MatchInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MatchInfoStructV2, Builder> {
        public Integer begin;
        public Integer end;
        public String link;
        public String query;

        public final MatchInfoStructV2 build() {
            MatchInfoStructV2 matchInfoStructV2 = new MatchInfoStructV2(this.query, this.link, this.begin, this.end, super.buildUnknownFields());
            return matchInfoStructV2;
        }

        public final Builder begin(Integer num) {
            this.begin = num;
            return this;
        }

        public final Builder end(Integer num) {
            this.end = num;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder query(String str) {
            this.query = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MatchInfoStructV2$ProtoAdapter_MatchInfoStructV2 */
    static final class ProtoAdapter_MatchInfoStructV2 extends ProtoAdapter<MatchInfoStructV2> {
        public ProtoAdapter_MatchInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MatchInfoStructV2.class);
        }

        public final int encodedSize(MatchInfoStructV2 matchInfoStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, matchInfoStructV2.query) + ProtoAdapter.STRING.encodedSizeWithTag(2, matchInfoStructV2.link) + ProtoAdapter.INT32.encodedSizeWithTag(3, matchInfoStructV2.begin) + ProtoAdapter.INT32.encodedSizeWithTag(4, matchInfoStructV2.end) + matchInfoStructV2.unknownFields().size();
        }

        public final MatchInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.query((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.begin((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.end((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MatchInfoStructV2 matchInfoStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, matchInfoStructV2.query);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, matchInfoStructV2.link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, matchInfoStructV2.begin);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, matchInfoStructV2.end);
            protoWriter.writeBytes(matchInfoStructV2.unknownFields());
        }
    }

    public MatchInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.query = this.query;
        builder.link = this.link;
        builder.begin = this.begin;
        builder.end = this.end;
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
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.query != null) {
            i = this.query.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.link != null) {
            i2 = this.link.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.begin != null) {
            i3 = this.begin.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.end != null) {
            i5 = this.end.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        StringBuilder replace = sb.replace(0, 2, "MatchInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchInfoStructV2)) {
            return false;
        }
        MatchInfoStructV2 matchInfoStructV2 = (MatchInfoStructV2) obj;
        if (!unknownFields().equals(matchInfoStructV2.unknownFields()) || !Internal.equals(this.query, matchInfoStructV2.query) || !Internal.equals(this.link, matchInfoStructV2.link) || !Internal.equals(this.begin, matchInfoStructV2.begin) || !Internal.equals(this.end, matchInfoStructV2.end)) {
            return false;
        }
        return true;
    }

    public MatchInfoStructV2(String str, String str2, Integer num, Integer num2) {
        this(str, str2, num, num2, ByteString.EMPTY);
    }

    public MatchInfoStructV2(String str, String str2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.link = str2;
        this.begin = num;
        this.end = num2;
    }
}
