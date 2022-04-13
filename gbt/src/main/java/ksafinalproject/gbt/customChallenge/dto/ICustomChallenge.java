package ksafinalproject.gbt.customChallenge.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class ICustomChallenge {

    private Long id;
    private Long creatorId;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String method;
    private Long frequency;
    private String description;
    private String summary;
    private Long max;
}
