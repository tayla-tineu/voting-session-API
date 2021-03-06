package com.votingsessionAPI.votingsession.domain.dto;

import com.votingsessionAPI.votingsession.domain.enums.Vote;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssociateDTO {

    @Id
    private Long id;

    @NonNull
    private Vote vote;

    @NonNull
    private Long voteSessionId;

}
