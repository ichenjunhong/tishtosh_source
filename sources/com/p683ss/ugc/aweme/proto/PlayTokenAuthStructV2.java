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

/* renamed from: com.ss.ugc.aweme.proto.PlayTokenAuthStructV2 */
public final class PlayTokenAuthStructV2 extends Message<PlayTokenAuthStructV2, Builder> {
    public static final ProtoAdapter<PlayTokenAuthStructV2> ADAPTER = new ProtoAdapter_PlayTokenAuthStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String auth;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 5)
    public List<String> hosts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String tv_token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String vid;

    /* renamed from: com.ss.ugc.aweme.proto.PlayTokenAuthStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PlayTokenAuthStructV2, Builder> {
        public String auth;
        public List<String> hosts = Internal.newMutableList();
        public String token;
        public String tv_token;
        public String vid;

        public final PlayTokenAuthStructV2 build() {
            PlayTokenAuthStructV2 playTokenAuthStructV2 = new PlayTokenAuthStructV2(this.vid, this.token, this.auth, this.tv_token, this.hosts, super.buildUnknownFields());
            return playTokenAuthStructV2;
        }

        public final Builder auth(String str) {
            this.auth = str;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }

        public final Builder tv_token(String str) {
            this.tv_token = str;
            return this;
        }

        public final Builder vid(String str) {
            this.vid = str;
            return this;
        }

        public final Builder hosts(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.hosts = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PlayTokenAuthStructV2$ProtoAdapter_PlayTokenAuthStructV2 */
    static final class ProtoAdapter_PlayTokenAuthStructV2 extends ProtoAdapter<PlayTokenAuthStructV2> {
        public ProtoAdapter_PlayTokenAuthStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PlayTokenAuthStructV2.class);
        }

        public final int encodedSize(PlayTokenAuthStructV2 playTokenAuthStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, playTokenAuthStructV2.vid) + ProtoAdapter.STRING.encodedSizeWithTag(2, playTokenAuthStructV2.token) + ProtoAdapter.STRING.encodedSizeWithTag(3, playTokenAuthStructV2.auth) + ProtoAdapter.STRING.encodedSizeWithTag(4, playTokenAuthStructV2.tv_token) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, playTokenAuthStructV2.hosts) + playTokenAuthStructV2.unknownFields().size();
        }

        public final PlayTokenAuthStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.vid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.token((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.auth((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.tv_token((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.hosts.add(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PlayTokenAuthStructV2 playTokenAuthStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, playTokenAuthStructV2.vid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, playTokenAuthStructV2.token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, playTokenAuthStructV2.auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, playTokenAuthStructV2.tv_token);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, playTokenAuthStructV2.hosts);
            protoWriter.writeBytes(playTokenAuthStructV2.unknownFields());
        }
    }

    public PlayTokenAuthStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.vid = this.vid;
        builder.token = this.token;
        builder.auth = this.auth;
        builder.tv_token = this.tv_token;
        builder.hosts = Internal.copyOf("hosts", this.hosts);
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
        if (this.vid != null) {
            i = this.vid.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.token != null) {
            i2 = this.token.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.auth != null) {
            i3 = this.auth.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.tv_token != null) {
            i5 = this.tv_token.hashCode();
        }
        int hashCode2 = ((i8 + i5) * 37) + this.hosts.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.auth != null) {
            sb.append(", auth=");
            sb.append(this.auth);
        }
        if (this.tv_token != null) {
            sb.append(", tv_token=");
            sb.append(this.tv_token);
        }
        if (!this.hosts.isEmpty()) {
            sb.append(", hosts=");
            sb.append(this.hosts);
        }
        StringBuilder replace = sb.replace(0, 2, "PlayTokenAuthStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayTokenAuthStructV2)) {
            return false;
        }
        PlayTokenAuthStructV2 playTokenAuthStructV2 = (PlayTokenAuthStructV2) obj;
        if (!unknownFields().equals(playTokenAuthStructV2.unknownFields()) || !Internal.equals(this.vid, playTokenAuthStructV2.vid) || !Internal.equals(this.token, playTokenAuthStructV2.token) || !Internal.equals(this.auth, playTokenAuthStructV2.auth) || !Internal.equals(this.tv_token, playTokenAuthStructV2.tv_token) || !this.hosts.equals(playTokenAuthStructV2.hosts)) {
            return false;
        }
        return true;
    }

    public PlayTokenAuthStructV2(String str, String str2, String str3, String str4, List<String> list) {
        this(str, str2, str3, str4, list, ByteString.EMPTY);
    }

    public PlayTokenAuthStructV2(String str, String str2, String str3, String str4, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.vid = str;
        this.token = str2;
        this.auth = str3;
        this.tv_token = str4;
        this.hosts = Internal.immutableCopyOf("hosts", list);
    }
}
