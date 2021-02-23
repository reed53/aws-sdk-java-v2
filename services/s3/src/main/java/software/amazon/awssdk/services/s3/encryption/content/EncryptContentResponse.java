package software.amazon.awssdk.services.s3.encryption.content;

public interface EncryptContentResponse {
    Content ciphertext();

    static Builder builder() {
        return null;
    }

    interface Builder {
        Builder ciphertext(Content content);
        EncryptContentResponse build();
    }
}
