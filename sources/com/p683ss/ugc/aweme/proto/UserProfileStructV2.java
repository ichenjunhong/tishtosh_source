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

/* renamed from: com.ss.ugc.aweme.proto.UserProfileStructV2 */
public final class UserProfileStructV2 extends Message<UserProfileStructV2, Builder> {
    public static final ProtoAdapter<UserProfileStructV2> ADAPTER = new ProtoAdapter_UserProfileStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public Double head_model_score;

    /* renamed from: com.ss.ugc.aweme.proto.UserProfileStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UserProfileStructV2, Builder> {
        public Double head_model_score;

        public final UserProfileStructV2 build() {
            return new UserProfileStructV2(this.head_model_score, super.buildUnknownFields());
        }

        public final Builder head_model_score(Double d) {
            this.head_model_score = d;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.UserProfileStructV2$ProtoAdapter_UserProfileStructV2 */
    static final class ProtoAdapter_UserProfileStructV2 extends ProtoAdapter<UserProfileStructV2> {
        public ProtoAdapter_UserProfileStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UserProfileStructV2.class);
        }

        public final int encodedSize(UserProfileStructV2 userProfileStructV2) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, userProfileStructV2.head_model_score) + userProfileStructV2.unknownFields().size();
        }

        public final UserProfileStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.head_model_score((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UserProfileStructV2 userProfileStructV2) throws IOException {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, userProfileStructV2.head_model_score);
            protoWriter.writeBytes(userProfileStructV2.unknownFields());
        }
    }

    public UserProfileStructV2() {
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.head_model_score != null) {
            i = this.head_model_score.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.head_model_score = this.head_model_score;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_model_score != null) {
            sb.append(", head_model_score=");
            sb.append(this.head_model_score);
        }
        StringBuilder replace = sb.replace(0, 2, "UserProfileStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public UserProfileStructV2(Double d) {
        this(d, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserProfileStructV2)) {
            return false;
        }
        UserProfileStructV2 userProfileStructV2 = (UserProfileStructV2) obj;
        if (!unknownFields().equals(userProfileStructV2.unknownFields()) || !Internal.equals(this.head_model_score, userProfileStructV2.head_model_score)) {
            return false;
        }
        return true;
    }

    public UserProfileStructV2(Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        this.head_model_score = d;
    }
}
