package com.mail.fa.dto;

import com.mail.fa.constant.OtpContext;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class OtpVerificationRequestDto {

    private final String emailId;
    private final Integer oneTimePassword;
    private final OtpContext context;

}
